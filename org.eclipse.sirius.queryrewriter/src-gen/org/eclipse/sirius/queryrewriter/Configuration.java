/**
 */
package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.viewpoint.description.Group;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getAccessibleGroups <em>Accessible Groups</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getRewrites <em>Rewrites</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getLanguagesToRewrite <em>Languages To Rewrite</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getAutoFill <em>Auto Fill</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getIncludedConfigurations <em>Included Configurations</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getNameRewrites <em>Name Rewrites</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Configuration#getManualGroups <em>Manual Groups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_Paths()
	 * @model
	 * @generated
	 */
	EList<String> getPaths();

	/**
	 * Returns the value of the '<em><b>Accessible Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Groups</em>' reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_AccessibleGroups()
	 * @model transient="true"
	 * @generated
	 */
	EList<Group> getAccessibleGroups();

	/**
	 * Returns the value of the '<em><b>Rewrites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.queryrewriter.Rewrite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrites</em>' containment reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_Rewrites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rewrite> getRewrites();

	/**
	 * Returns the value of the '<em><b>Languages To Rewrite</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.sirius.queryrewriter.QueryLanguage}.
	 * The literals are from the enumeration {@link org.eclipse.sirius.queryrewriter.QueryLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages To Rewrite</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages To Rewrite</em>' attribute list.
	 * @see org.eclipse.sirius.queryrewriter.QueryLanguage
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_LanguagesToRewrite()
	 * @model
	 * @generated
	 */
	EList<QueryLanguage> getLanguagesToRewrite();

	/**
	 * Returns the value of the '<em><b>Auto Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Fill</em>' attribute.
	 * @see #setAutoFill(String)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_AutoFill()
	 * @model
	 * @generated
	 */
	String getAutoFill();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Configuration#getAutoFill <em>Auto Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Fill</em>' attribute.
	 * @see #getAutoFill()
	 * @generated
	 */
	void setAutoFill(String value);

	/**
	 * Returns the value of the '<em><b>Included Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.queryrewriter.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Configurations</em>' reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_IncludedConfigurations()
	 * @model
	 * @generated
	 */
	EList<Configuration> getIncludedConfigurations();

	/**
	 * Returns the value of the '<em><b>Name Rewrites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.queryrewriter.NameRewrite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Rewrites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Rewrites</em>' containment reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_NameRewrites()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameRewrite> getNameRewrites();

	/**
	 * Returns the value of the '<em><b>Manual Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Groups</em>' reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getConfiguration_ManualGroups()
	 * @model
	 * @generated
	 */
	EList<Group> getManualGroups();

} // Configuration
