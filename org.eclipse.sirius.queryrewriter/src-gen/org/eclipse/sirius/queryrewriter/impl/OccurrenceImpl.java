/**
 */
package org.eclipse.sirius.queryrewriter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.queryrewriter.Occurrence;
import org.eclipse.sirius.queryrewriter.QueryrewriterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl#getEattribute <em>Eattribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl#getVsmElement <em>Vsm Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceImpl extends MinimalEObjectImpl.Container implements Occurrence {
	/**
	 * The cached value of the '{@link #getEattribute() <em>Eattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEattribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute eattribute;

	/**
	 * The cached value of the '{@link #getVsmElement() <em>Vsm Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsmElement()
	 * @generated
	 * @ordered
	 */
	protected EObject vsmElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryrewriterPackage.Literals.OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEattribute() {
		if (eattribute != null && eattribute.eIsProxy()) {
			InternalEObject oldEattribute = (InternalEObject)eattribute;
			eattribute = (EAttribute)eResolveProxy(oldEattribute);
			if (eattribute != oldEattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryrewriterPackage.OCCURRENCE__EATTRIBUTE, oldEattribute, eattribute));
			}
		}
		return eattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEattribute() {
		return eattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEattribute(EAttribute newEattribute) {
		EAttribute oldEattribute = eattribute;
		eattribute = newEattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.OCCURRENCE__EATTRIBUTE, oldEattribute, eattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVsmElement() {
		if (vsmElement != null && vsmElement.eIsProxy()) {
			InternalEObject oldVsmElement = (InternalEObject)vsmElement;
			vsmElement = eResolveProxy(oldVsmElement);
			if (vsmElement != oldVsmElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT, oldVsmElement, vsmElement));
			}
		}
		return vsmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVsmElement() {
		return vsmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsmElement(EObject newVsmElement) {
		EObject oldVsmElement = vsmElement;
		vsmElement = newVsmElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT, oldVsmElement, vsmElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryrewriterPackage.OCCURRENCE__EATTRIBUTE:
				if (resolve) return getEattribute();
				return basicGetEattribute();
			case QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT:
				if (resolve) return getVsmElement();
				return basicGetVsmElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryrewriterPackage.OCCURRENCE__EATTRIBUTE:
				setEattribute((EAttribute)newValue);
				return;
			case QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT:
				setVsmElement((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryrewriterPackage.OCCURRENCE__EATTRIBUTE:
				setEattribute((EAttribute)null);
				return;
			case QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT:
				setVsmElement((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryrewriterPackage.OCCURRENCE__EATTRIBUTE:
				return eattribute != null;
			case QueryrewriterPackage.OCCURRENCE__VSM_ELEMENT:
				return vsmElement != null;
		}
		return super.eIsSet(featureID);
	}

} //OccurrenceImpl
