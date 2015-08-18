package org.eclipse.sirius.queryrewriter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.business.api.dialect.description.MultiLanguagesValidator;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterStatus;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.tools.api.interpreter.context.SiriusInterpreterContextFactory;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class RewriterServices {

	public Configuration applyRewrites(Configuration conf) {
		for (Rewrite r : conf.getRewrites()) {
			for (Occurrence o : r.getOccurrences()) {
				if (o.getVsmElement() != null && o.getEattribute() != null
						&& o.getVsmElement().eGet(o.getEattribute()) != null) {
					Object currentValue = o.getVsmElement()
							.eGet(o.getVsmElement().eClass().getEStructuralFeature(o.getEattribute().getName()));
					if (r.getOld().equals(currentValue)) {
						if (r.getNew() != null && r.getNew().length() > 0) {
							o.getVsmElement().eSet(
									o.getVsmElement().eClass().getEStructuralFeature(o.getEattribute().getName()),
									r.getNew());
						}
					}
				}

			}
		}
		return conf;
	}

	public Configuration resetRewrites(Configuration conf) {
		for (Rewrite r : conf.getRewrites()) {
			for (Occurrence o : r.getOccurrences()) {
				if (o.getVsmElement() != null && o.getEattribute() != null
						&& o.getVsmElement().eGet(o.getEattribute()) != null) {
					o.getVsmElement().eSet(o.getEattribute(), r.getOld());
				}

			}
		}
		return conf;
	}

	public Configuration fillKnownRewrites(Configuration conf) {
		for (Rewrite r : conf.getRewrites()) {
			String translation = KnownRewrites.conversion.get(r.getOld());
			if (translation != null && r.getNew() == null) {
				r.setNew(translation);
			}
		}
		return conf;
	}

	public String getLabel(Configuration conf) {
		return "total: " + conf.getRewrites().size() + " | " + getMigratedPercent(conf) + "% of occurrences | "
				+ getMigratedPercentExpresssions(conf) + " % of expressions migrated";
	}

	private double getMigratedPercentExpresssions(Configuration conf) {
		int total = 0;
		int migOccurrences = 0;
		for (Rewrite r : conf.getRewrites()) {
			if (hasMigration(r)) {
				migOccurrences += 1;
			}
			total += 1;
		}
		return new Double(migOccurrences * 100) / total;
	}

	public double getMigratedPercent(Configuration conf) {
		int total = 0;
		int migOccurrences = 0;
		for (Rewrite r : conf.getRewrites()) {
			if (hasMigration(r)) {
				migOccurrences += r.getOccurrences().size();
			}
			total += r.getOccurrences().size();
		}
		return new Double(migOccurrences * 100) / total;

	}

	private boolean hasMigration(Rewrite r) {
		return r.getNew() != null && r.getNew().length() > 0;
	}

	public Configuration computeOccurrences(Configuration conf) {
		for (Group group : conf.getAccessibleGroups()) {
			if (group.eResource() != null && group.eResource().getURI() != null) {
				if (group.eResource().getURI().toString().contains("do_not_migrate")) {
					break;
				}
			}
			Iterator<EObject> it = group.eAllContents();
			while (it.hasNext()) {
				EObject vsmElement = it.next();
				for (EAttribute attr : vsmElement.eClass().getEAllAttributes()) {
					if (attr.getEType() == DescriptionPackage.eINSTANCE.getInterpretedExpression()) {
						Object expr = vsmElement.eGet(attr);
						if (expr instanceof String && ((String) expr).length() > 0) {
							String expression = (String) expr;
							if (conf.getLanguagesToRewrite().contains(QueryLanguageUtil.getType(expression))
									|| alreadyHasRewriteWithThisTarget(conf, expression)) {
								Rewrite rewrite = getOrCreateRewrite(conf, expression);
								addOccurrence(rewrite, attr, vsmElement);
							}
						}

					}
				}
			}

		}
		List<Rewrite> sorted = rewritesByOccurrences(conf);
		conf.getRewrites().clear();
		conf.getRewrites().addAll(sorted);

		return conf;
	}

	public List<Rewrite> rewritesByOccurrences(Configuration conf) {
		Ordering<Rewrite> byOcc = Ordering.natural().onResultOf(new Function<Rewrite, Integer>() {

			@Override
			public Integer apply(Rewrite arg0) {
				return arg0.getOccurrences().size();
			}
		});
		ArrayList<Rewrite> result = Lists.newArrayList(conf.getRewrites());
		Collections.sort(result, byOcc);
		Collections.reverse(result);
		return result;

	}

	private boolean alreadyHasRewriteWithThisTarget(Configuration conf, String expression) {
		for (Rewrite r : conf.getRewrites()) {
			if (r.getNew() != null && r.getNew().equals(expression)) {
				return true;
			}
		}
		return false;
	}

	private void addOccurrence(Rewrite rewrite, EAttribute attr, EObject underTest) {
		Occurrence newOcc = QueryrewriterFactory.eINSTANCE.createOccurrence();
		newOcc.setEattribute(attr);
		newOcc.setVsmElement(underTest);
		((BasicEList) rewrite.getOccurrences()).addUnique(newOcc);
	}

	private Rewrite getOrCreateRewrite(Configuration conf, String expr) {
		for (Rewrite r : conf.getRewrites()) {
			if (r.getOld() != null && r.getOld().equals(expr)) {
				return r;
			}
			if (r.getNew() != null && r.getNew().equals(expr)) {
				return r;
			}
		}
		Rewrite newR = QueryrewriterFactory.eINSTANCE.createRewrite();
		newR.setOld(expr);
		conf.getRewrites().add(newR);
		return newR;
	}

	public boolean isValidAQL(Rewrite r) {
		if (r.getNew() != null && r.getNew().startsWith("aql:")) {
			String expression = r.getNew();
			
			for (Occurrence occ : r.getOccurrences()) {
			
				/*
				EObject target = occ.getVsmElement();
				EStructuralFeature feature = occ.eClass().getEStructuralFeature(occ.getEattribute().getName());
				Collection<IInterpreterStatus> errors = new LinkedHashSet();
				if (!StringUtil.isEmpty(expression)) {
					IInterpreterContext context = SiriusInterpreterContextFactory.createInterpreterContext(target,
							feature);
					errors = MultiLanguagesValidator.getInstance().validateExpression(context, expression)
							.getStatuses();
					boolean hasError = false;
					for (IInterpreterStatus iInterpreterStatus : errors) {
						if (IInterpreterStatus.ERROR.equals(iInterpreterStatus.getSeverity())) {
							hasError = true;
						}
					}
					return !hasError;
				}*/
			}

		}
		return true;
	}
}
