/**
 */
package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Occurrence#getEattribute <em>Eattribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.Occurrence#getVsmElement <em>Vsm Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getOccurrence()
 * @model
 * @generated
 */
public interface Occurrence extends EObject {
	/**
	 * Returns the value of the '<em><b>Eattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eattribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eattribute</em>' reference.
	 * @see #setEattribute(EAttribute)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getOccurrence_Eattribute()
	 * @model
	 * @generated
	 */
	EAttribute getEattribute();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Occurrence#getEattribute <em>Eattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eattribute</em>' reference.
	 * @see #getEattribute()
	 * @generated
	 */
	void setEattribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Vsm Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsm Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsm Element</em>' reference.
	 * @see #setVsmElement(EObject)
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#getOccurrence_VsmElement()
	 * @model
	 * @generated
	 */
	EObject getVsmElement();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.queryrewriter.Occurrence#getVsmElement <em>Vsm Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsm Element</em>' reference.
	 * @see #getVsmElement()
	 * @generated
	 */
	void setVsmElement(EObject value);

} // Occurrence
