package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class QueryRewriterResourceFactory extends XMIResourceFactoryImpl {

	public QueryRewriterResourceFactory() {
	}

	
	@Override
	public Resource createResource(URI uri) {
		return new QueryRewriterResourceImpl(uri);
	}
}
