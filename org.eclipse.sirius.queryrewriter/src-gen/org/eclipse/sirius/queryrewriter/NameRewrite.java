/**
 */
package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Rewrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.NameRewrite#getOld <em>Old</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.NameRewrite#getNew <em>New</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getNameRewrite()
 * @model
 * @generated
 */
public interface NameRewrite extends EObject {
	/**
	 * Returns the value of the '<em><b>Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old</em>' attribute.
	 * @see #setOld(String)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getNameRewrite_Old()
	 * @model
	 * @generated
	 */
	String getOld();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.NameRewrite#getOld <em>Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' attribute.
	 * @see #getOld()
	 * @generated
	 */
	void setOld(String value);

	/**
	 * Returns the value of the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' attribute.
	 * @see #setNew(String)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getNameRewrite_New()
	 * @model
	 * @generated
	 */
	String getNew();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.NameRewrite#getNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' attribute.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(String value);

} // NameRewrite
