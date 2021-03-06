package org.eclipse.sirius.queryrewriter;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.Group;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

public class RewriterServices {

	private DecimalFormat df = new DecimalFormat("#.#");

	public Collection<Rewrite> getAllRewrites(Configuration conf) {
		List<Rewrite> result = Lists.newArrayList();
		result.addAll(conf.getRewrites());
		// for (Configuration ref : conf.getIncludedConfigurations()) {
		// result.addAll(getRewritesToProcess(ref));
		// }
		return result;
	}

	public Configuration applyRewrites(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			applyRewrite(r);
		}
		return conf;
	}

	public Collection<Rewrite> getRewritesToProcess(Configuration conf) {
		return getAllRewrites(conf);
	}

	public void applyRewrite(Rewrite r) {
		for (Occurrence o : r.getOccurrences()) {
			if (o.getVsmElement() != null && o.getEattribute() != null
					&& o.getVsmElement().eGet(o.getEattribute()) != null) {
				Object currentValue = o.getVsmElement()
						.eGet(o.getVsmElement().eClass().getEStructuralFeature(o.getEattribute().getName()));
				if (r.getNew() != null && r.getNew().length() > 0) {
					o.getVsmElement().eSet(
							o.getVsmElement().eClass().getEStructuralFeature(o.getEattribute().getName()), r.getNew());
					o.getVsmElement().eResource().setModified(true);
					r.setUnderInspection(true);
				}
			}

		}
	}

	public Configuration resetRewrites(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			for (Occurrence o : r.getOccurrences()) {
				if (o.getVsmElement() != null && o.getEattribute() != null
						&& o.getVsmElement().eGet(o.getEattribute()) != null) {
					o.getVsmElement().eSet(o.getEattribute(), r.getOld());
				}

			}
		}
		return conf;
	}

	public Configuration makeAllUnderInspection(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			if (!StringUtil.isEmpty(r.getNew())) {
				r.setUnderInspection(true);
				r.setTested(false);
			} else {
				r.setUnderInspection(false);
				r.setTested(false);
			}
		}
		return conf;
	}

	public Configuration makeNonTestedRewritesUnderInspection(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			if (!StringUtil.isEmpty(r.getNew()) && !r.isTested()) {
				r.setUnderInspection(true);
			}
		}
		return conf;
	}

	public Configuration confirmUnderInspection(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			if (r.isUnderInspection()) {
				r.setUnderInspection(false);
				r.setTested(true);
			}
		}
		return conf;
	}

	public Configuration fillKnownRewrites(Configuration conf) {
		for (Rewrite r : getRewritesToProcess(conf)) {
			String translation = KnownRewrites.conversion.get(r.getOld());
			if (translation != null && r.getNew() == null) {
				r.setNew(translation);
			}
		}
		return conf;
	}

	public String getLabel(Configuration conf) {
		int totalOcc = 0;
		for (Rewrite r : getRewritesToProcess(conf)) {
			totalOcc += r.getOccurrences().size();
		}
		return "total: " + Collections2.filter(getRewritesToProcess(conf), new Predicate<Rewrite>() {

			@Override
			public boolean apply(Rewrite arg0) {
				return arg0.getOccurrences().size() > 0;
			}
		}).size() + " | " + getMigratedPercent(conf) + "% of occurrences | " + getMigratedPercentExpresssions(conf)
				+ " % of expressions migrated (total occs :" + totalOcc;
	}

	private String getMigratedPercentExpresssions(Configuration conf) {
		int total = 0;
		int migOccurrences = 0;
		for (Rewrite r : getRewritesToProcess(conf)) {
			if (r.getOccurrences().size() > 0) {
				if (hasMigration(r)) {
					migOccurrences += 1;
				}
				total += 1;
			}
		}
		if (total > 0) {
			return df.format((new Double(migOccurrences * 100) / total));
		} else {
			return "Launch \"Compute Rewrites\" action to gather occurrences";
		}
	}

	public String getMigratedPercent(Configuration conf) {
		int total = 0;
		int migOccurrences = 0;
		for (Rewrite r : getRewritesToProcess(conf)) {
			if (r.getOccurrences().size() > 0) {
				if (hasMigration(r)) {
					migOccurrences += r.getOccurrences().size();
				}
				total += r.getOccurrences().size();
			}
		}
		if (total > 0) {
			return df.format(new Double(migOccurrences * 100) / total);
		} else {
			return "";
		}

	}

	private boolean hasMigration(Rewrite r) {
		return r.getNew() != null && r.getNew().length() > 0;
	}

	public Configuration computeOccurrences(Configuration conf) {
		List<Group> groups = Lists.newArrayList();
		groups.addAll(conf.getAccessibleGroups());
		groups.addAll(conf.getManualGroups());
		System.err.println(groups.size());
		int totalExpr = 0;
		int exprToMigrates = 0;
		int nonempty = 0;
		for (Group group : groups) {
			boolean shouldMigrate = true;
			if (group.eResource() != null && group.eResource().getURI() != null) {
				if (group.eResource().getURI().toString().contains("do_not_migrate")) {
					shouldMigrate = false;
				}
			}
			if (shouldMigrate) {
				Iterator<EObject> it = group.eAllContents();
				while (it.hasNext()) {
					EObject vsmElement = it.next();
					for (EAttribute attr : vsmElement.eClass().getEAllAttributes()) {

						if ("browseExpression".equals(attr.getName())) {
						}

						if ("InterpretedExpression".equals(attr.getEType().getName())) {
							Object expr = vsmElement.eGet(attr);
							totalExpr++;
							if (expr instanceof String && ((String) expr).length() > 0) {
								nonempty++;
								String expression = (String) expr;
								if (QueryLanguage.LEGACY == QueryLanguageUtil.getType(expression)) {
									exprToMigrates++;
									Rewrite rewrite = getOrCreateRewrite(conf, expression);
									String uri = EcoreUtil.getURI(vsmElement).toString();
									if (uri.contains("Logical%20Data%20Flow%20Blank")) {
										rewrite.setUnderInspection(true);
									}
									addOccurrence(rewrite, attr, vsmElement);
								}
							}

						}
					}
				}
			}

		}
		System.out.println(
				"total:" + totalExpr + " to migrate: " + exprToMigrates + " non empty expressions:" + nonempty);
		// List<Rewrite> sorted = rewritesByOccurrences(conf);
		// getRewritesToProcess(conf).clear();
		// getRewritesToProcess(conf).addAll(sorted);

		return conf;
	}

	public List<Rewrite> rewritesByOccurrences(Configuration conf) {
		Ordering<Rewrite> byOcc = Ordering.natural().onResultOf(new Function<Rewrite, Integer>() {

			@Override
			public Integer apply(Rewrite arg0) {
				return arg0.getOccurrences().size();
			}
		});
		ArrayList<Rewrite> result = Lists.newArrayList(getRewritesToProcess(conf));
		Collections.sort(result, byOcc);
		Collections.reverse(result);
		return result;

	}

	private boolean alreadyHasRewriteWithThisTarget(Configuration conf, String expression) {
		for (Rewrite r : getRewritesToProcess(conf)) {
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
		for (Rewrite r : getRewritesToProcess(conf)) {
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
				 * EObject target = occ.getVsmElement(); EStructuralFeature
				 * feature =
				 * occ.eClass().getEStructuralFeature(occ.getEattribute().
				 * getName()); Collection<IInterpreterStatus> errors = new
				 * LinkedHashSet(); if (!StringUtil.isEmpty(expression)) {
				 * IInterpreterContext context =
				 * SiriusInterpreterContextFactory.createInterpreterContext(
				 * target, feature); errors =
				 * MultiLanguagesValidator.getInstance().validateExpression(
				 * context, expression) .getStatuses(); boolean hasError =
				 * false; for (IInterpreterStatus iInterpreterStatus : errors) {
				 * if (IInterpreterStatus.ERROR.equals(iInterpreterStatus.
				 * getSeverity())) { hasError = true; } } return !hasError; }
				 */
			}

		}
		return true;
	}

	public String rewriteProposal(Rewrite r) {
		String result = r.getOld();
		String queryToTranslate = r.getOld();
		if (QueryLanguageUtil.getType(queryToTranslate) == QueryLanguage.LEGACY) {
			String prefix = queryToTranslate.substring(0, queryToTranslate.indexOf("<%"));
			String suffix = queryToTranslate.substring(queryToTranslate.indexOf("%>") + 2);
			String body = queryToTranslate
					.substring(prefix.length() + 2, queryToTranslate.length() - suffix.length() - 2).trim();
			String translatedBody = translateBody(body);
			result = "aql:";
			if (prefix.length() > 0) {
				result += "'" + prefix + "' + ";
			}
			result += translatedBody;
			if (suffix.length() > 0) {
				result += " + '" + suffix + "'";
			}
		}
		return result;
	}

	private String translateBody(String body) {
		if (body.startsWith("self") || body.startsWith("current") || body.startsWith("$") || body.startsWith("if")
				|| body.startsWith("(")) {

		} else {
			/*
			 * we need to introduce self
			 */
			body = "self." + body;
		}
		/*
		 * Capella
		 */
		body = body.replace("\"AbstractFunction\"", "fa::AbstractFunction");
		body = body.replace("\"PhysicalPort\"", "cs::PhysicalPort");
		body = body.replace("\"Scenario\"", "interaction::Scenario");
		body = body.replace("\"BlockArchitecture\"", "cs::BlockArchitecture");
		
		body = body.replace("&&", " and ");
		body = body.replace("||", " or ");
		body = body.replace("==", "=");
		body = body.replace("!=", "<>");
		body = body.replace("!", " not ");
		body = body.replace("~.", "eInverse().");

		body = appendSelfOnDirectServiceReferences(body, "eAllContents", "eContents", "eContainer", "filter", "eClass");
		body = body.replace(".filter", "->filter");
		body = body.replace("self()", "self");
		body = body.replace("current ", "self ");
		body = body.replace("current.", "self.");
		body = body.replace("eClass.", "eClass().");
		body = body.replace(".nSize(", "->size(");
		body = body.replace(".nSize", "->size()");
		body = body.replace(".precedingSibling(", ".precedingSiblings(");
		body = body.replace(".precedingSibling", ".precedingSiblings()");
		body = body.replace(".followingSibling(", ".followingSiblings(");
		body = body.replace(".followingSibling", ".followingSiblings()");
		body = body.replace(".nReverse(", "->reverse(");
		body = body.replace(".nReverse", "->reverse()");
		body = body.replace(".nSize", "->size()");
		body = body.replace(".nGet(0)", "->first()");
		body = body.replace(".nGet(1)", "->at(2)");
		body = body.replace(".nGet(2)", "->at(3)");
		body = body.replace(".nGet(3)", "->at(4)");
		body = body.replace(".nGet(4)", "->at(5)");
		body = body.replace(".nGet(5)", "->at(6)");
		body = body.replace(".nGet(6)", "->at(7)");
		body = body.replace(".nFirst(", "->first(");
		body = body.replace(".nFirst", "->first()");
		body = body.replace(".nLast(", "->last()");
		body = body.replace(".nLast", "->last()");
		body = body.replace(".toL1Case(", ".toLowerFirst(");
		body = body.replace(".toL1Case", ".toLowerFirst()");
		body = body.replace(".nContains(", "->includes(");
		body = body.replace(".nContains", "->includes()");
		body = body.replace(".nMinimize", "->asSet()");
		body = body.replace(".trim(", "->trim()");
		body = body.replace(".trim", "->trim()");
		body = body.replace(".indexOf(", ".index(");
		body = body.replace(".indexOf", ".index()");
		body = body.replace(".ancestor(", "->ancestors()");
		body = body.replace(".ancestor", "->ancestors()");
		body = body.replace("$0", "arg0");
		body = body.replace("$1", "arg1");
		body = body.replace("$2", "arg2");
		body = body.replace("$3", "arg3");
		body = body.replace("$4", "arg4");
		body = body.replace("$5", "arg5");
		body = body.replace("$", "");
		body = body.replace("parent(", "eContainer(");
		body = body.replace("split(\" \")", "tokenize()");
		body = body.replace("getRootContainer(", "eResource().getContents()->first(");
		body = body.replace("getRootContainer", "eResource().getContents()->first()");
		body = body.replace("eResourceName(", "eResource().getURI().lastSegment()");
		body = body.replaceAll("eAllContents\\(\"([a-zA-Z]+)\"\\)", "eAllContents($1)");
		body = body.replaceAll("eAllContents\\(\"([a-zA-Z]+)\\.([a-zA-Z]+)\"\\)", "eAllContents($1::$2)");
		body = body.replaceAll("eContainer\\(\"([a-zA-Z]+)\"\\)", "eContainerOrSelf($1)");
		/*
		 * filter with simple type name
		 */
		body = body.replaceAll("filter\\(\"([a-zA-Z]+)\"\\)", "filter($1)");
		body = body.replaceAll("filter\\(\"([a-zA-Z]+)\\.([a-zA-Z]+)\"\\)", "filter($1::$2)");
		body = body.replaceAll("\\[(.*)\\]", "->select( e | e.$1)");

		body = body.replace("EReference", "ecore::EReference");
		body = body.replace("EClassifier", "ecore::EClassifier");
		body = body.replace("EPackage", "ecore::EPackage");
		body = body.replace("EClass", "ecore::EClass");
		body = body.replace("EAttribute", "ecore::EAttribute");
		body = body.replace("EDataType", "ecore::EDataType");
		body = body.replace("EOperation", "ecore::EOperation");
		body = body.replace("DSemanticDecorator", "viewpoint::DSemanticDecorator");
		body = body.replace("DNode", "diagram::DNode");
		body = body.replace("DDiagram", "diagram::DDiagram");
		body = body.replace("Interaction", "interactions::Interaction");
	


		// happens often in Capella
		body = body.replace(" (", "(");

		body = body.replace('"', '\'');
		return body;
	}

	private String appendSelfOnDirectServiceReferences(String body, String... serviceNames) {
		for (String name : serviceNames) {
			body = body.replace(" " + name, " self." + name);
			body = body.replace("(" + name, "(self." + name);
			body = body.replace("[" + name, "[self." + name);
			body = body.replace(name + ".", name + "().");
		}
		return body;
	}

	public Configuration loadGroups(Configuration cur) {
		Session s = SessionManager.INSTANCE.getSession(cur);
		Collection<URI> urisToLoad = Sets.newLinkedHashSet();
		for (String path : cur.getPaths()) {
			File rootFile = new File(path);
			if (rootFile.isDirectory()) {
				collectURIsInSubDirs(rootFile, urisToLoad);
			} else if (rootFile.isFile()) {
				urisToLoad.add(createURIToRootElement(path));
			}
		}
		System.out.println("Found .odesigns : " + urisToLoad.size());
		NullProgressMonitor monitor = new NullProgressMonitor();
		for (final URI uri : urisToLoad) {
			s.addSemanticResource(uri, monitor);
			EObject root = s.getTransactionalEditingDomain().getResourceSet().getEObject(uri, false);
			if (root instanceof Group) {
				cur.getManualGroups().add((Group) root);
			}
		}
		return cur;
	}

	private void collectURIsInSubDirs(File rootFile, Collection<URI> urisToLoad) {
		if (rootFile.isDirectory()) {
			for (File child : rootFile.listFiles()) {
				if (child.isDirectory()) {
					collectURIsInSubDirs(child, urisToLoad);
				} else if (child.isFile()) {
					if (child.getName() != null && child.getName().endsWith(".odesign")) {
						System.out.println(child.getName());
						urisToLoad.add(createURIToRootElement(child.getAbsolutePath()));
					}
				}
			}
		}

	}

	private URI createURIToRootElement(String path) {
		return URI.createFileURI(path).appendFragment("/");
	}

}
