package org.eclipse.sirius.queryrewriter;

public class QueryLanguageUtil {

	public static QueryLanguage getType(String expression) {
		if (expression != null) {
			if (expression.startsWith("aql:")) {
				return QueryLanguage.AQL;
			}
			if (expression.startsWith("[")) {
				return QueryLanguage.MTL;
			}
			if (expression.startsWith("ocl:")) {
				return QueryLanguage.OCL;
			}
			if (expression.startsWith("feature:")) {
				return QueryLanguage.FEATURE;
			}
			if (expression.startsWith("service:")) {
				return QueryLanguage.SERVICE;
			}
			if (expression.startsWith("var:")) {
				return QueryLanguage.VAR;
			}
			if (expression.contains("<%")) {
				return QueryLanguage.LEGACY;
			}
		}
		return QueryLanguage.UNKNOWN;
	}

}
