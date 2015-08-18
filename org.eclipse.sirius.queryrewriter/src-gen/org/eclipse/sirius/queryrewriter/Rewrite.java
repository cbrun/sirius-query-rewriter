/**
 */
package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewrite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Rewrite#getOld <em>Old</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Rewrite#getNew <em>New</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Rewrite#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Rewrite#isUnderInspection <em>Under Inspection</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getRewrite()
 * @model
 * @generated
 */
public interface Rewrite extends EObject {
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
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getRewrite_Old()
	 * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
	 * @generated
	 */
	String getOld();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Rewrite#getOld <em>Old</em>}' attribute.
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
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getRewrite_New()
	 * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
	 * @generated
	 */
	String getNew();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Rewrite#getNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' attribute.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(String value);

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.queryrewriter.Occurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference list.
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getRewrite_Occurrences()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Occurrence> getOccurrences();

	/**
	 * Returns the value of the '<em><b>Under Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Inspection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Inspection</em>' attribute.
	 * @see #setUnderInspection(boolean)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getRewrite_UnderInspection()
	 * @model
	 * @generated
	 */
	boolean isUnderInspection();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Rewrite#isUnderInspection <em>Under Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under Inspection</em>' attribute.
	 * @see #isUnderInspection()
	 * @generated
	 */
	void setUnderInspection(boolean value);

} // Rewrite
