package org.eclipse.sirius.queryrewriter;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;

import com.google.common.collect.Sets;

public class QueryRewriterResourceImpl extends XMIResourceImpl implements Resource {

	public QueryRewriterResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

		super.doLoad(inputStream, options);
		/*
		 * Digging through the models looking for occurrences and updating the
		 * rewrite table.
		 */

		if (getContents().size() > 0 && getContents().iterator().next() instanceof Configuration) {
			Configuration root = (Configuration) getContents().iterator().next();
			Collection<URI> urisToLoad = Sets.newLinkedHashSet();
			for (String path : root.getPaths()) {
				File rootFile = new File(path);
				if (rootFile.isDirectory()) {
					collectURIsInSubDirs(rootFile, urisToLoad);
				} else if (rootFile.isFile()) {
					urisToLoad.add(createURIToRootElement(path));
				}
			}

			for (URI uri : urisToLoad) {
				Group proxy = DescriptionFactory.eINSTANCE.createGroup();
				((InternalEObject) proxy).eSetProxyURI(uri);
				((BasicEList) root.getAccessibleGroups()).addUnique(proxy);
			}


		}

	}

	

	private URI createURIToRootElement(String path) {
		return URI.createFileURI(path).appendFragment("/");
	}

	private void collectURIsInSubDirs(File rootFile, Collection<URI> urisToLoad) {
		if (rootFile.isDirectory()) {
			for (File child : rootFile.listFiles()) {
				if (child.isDirectory()) {
					collectURIsInSubDirs(child, urisToLoad);
				} else if (child.isFile()) {
					if (child.getName() != null && child.getName().endsWith(".odesign")) {
						urisToLoad.add(createURIToRootElement(child.getAbsolutePath()));
					}
				}
			}
		}

	}

}
