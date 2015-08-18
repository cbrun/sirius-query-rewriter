/**
 */
package org.eclipse.sirius.queryrewriter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getQueryLanguage()
 * @model
 * @generated
 */
public enum QueryLanguage implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>LEGACY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGACY_VALUE
	 * @generated
	 * @ordered
	 */
	LEGACY(1, "LEGACY", "LEGACY"),

	/**
	 * The '<em><b>MTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTL_VALUE
	 * @generated
	 * @ordered
	 */
	MTL(2, "MTL", "MTL"),

	/**
	 * The '<em><b>OCL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCL_VALUE
	 * @generated
	 * @ordered
	 */
	OCL(3, "OCL", "OCL"),

	/**
	 * The '<em><b>AQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AQL_VALUE
	 * @generated
	 * @ordered
	 */
	AQL(4, "AQL", "AQL"), /**
	 * The '<em><b>FEATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE(5, "FEATURE", "FEATURE"), /**
	 * The '<em><b>VAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_VALUE
	 * @generated
	 * @ordered
	 */
	VAR(6, "VAR", "VAR"), /**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(7, "SERVICE", "SERVICE");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>LEGACY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGACY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGACY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEGACY_VALUE = 1;

	/**
	 * The '<em><b>MTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MTL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTL_VALUE = 2;

	/**
	 * The '<em><b>OCL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCL_VALUE = 3;

	/**
	 * The '<em><b>AQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AQL_VALUE = 4;

	/**
	 * The '<em><b>FEATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_VALUE = 5;

	/**
	 * The '<em><b>VAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_VALUE = 6;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Query Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueryLanguage[] VALUES_ARRAY =
		new QueryLanguage[] {
			UNKNOWN,
			LEGACY,
			MTL,
			OCL,
			AQL,
			FEATURE,
			VAR,
			SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Query Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueryLanguage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Query Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryLanguage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryLanguage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryLanguage get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case LEGACY_VALUE: return LEGACY;
			case MTL_VALUE: return MTL;
			case OCL_VALUE: return OCL;
			case AQL_VALUE: return AQL;
			case FEATURE_VALUE: return FEATURE;
			case VAR_VALUE: return VAR;
			case SERVICE_VALUE: return SERVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QueryLanguage(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QueryLanguage
