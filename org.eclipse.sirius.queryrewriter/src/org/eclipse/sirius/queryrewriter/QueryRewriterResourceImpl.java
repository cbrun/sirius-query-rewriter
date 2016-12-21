package org.eclipse.sirius.queryrewriter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class QueryRewriterResourceImpl extends XMIResourceImpl implements Resource {

	public QueryRewriterResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		super.doLoad(inputStream, options);
	}


	

}
