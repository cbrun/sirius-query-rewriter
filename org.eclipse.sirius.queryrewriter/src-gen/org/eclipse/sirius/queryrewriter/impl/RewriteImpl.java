/**
 */
package org.eclipse.sirius.queryrewriter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.queryrewriter.Occurrence;
import org.eclipse.sirius.queryrewriter.QueryrewriterPackage;
import org.eclipse.sirius.queryrewriter.Rewrite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewrite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl#getOld <em>Old</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl#getNew <em>New</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl#isUnderInspection <em>Under Inspection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RewriteImpl extends MinimalEObjectImpl.Container implements Rewrite {
	/**
	 * The default value of the '{@link #getOld() <em>Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOld() <em>Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOld()
	 * @generated
	 * @ordered
	 */
	protected String old = OLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew()
	 * @generated
	 * @ordered
	 */
	protected String new_ = NEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected EList<Occurrence> occurrences;

	/**
	 * The default value of the '{@link #isUnderInspection() <em>Under Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderInspection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_INSPECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderInspection() <em>Under Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderInspection()
	 * @generated
	 * @ordered
	 */
	protected boolean underInspection = UNDER_INSPECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RewriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryrewriterPackage.Literals.REWRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOld() {
		return old;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOld(String newOld) {
		String oldOld = old;
		old = newOld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.REWRITE__OLD, oldOld, old));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew() {
		return new_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew(String newNew) {
		String oldNew = new_;
		new_ = newNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.REWRITE__NEW, oldNew, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Occurrence> getOccurrences() {
		if (occurrences == null) {
			occurrences = new EObjectContainmentEList<Occurrence>(Occurrence.class, this, QueryrewriterPackage.REWRITE__OCCURRENCES);
		}
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderInspection() {
		return underInspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderInspection(boolean newUnderInspection) {
		boolean oldUnderInspection = underInspection;
		underInspection = newUnderInspection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.REWRITE__UNDER_INSPECTION, oldUnderInspection, underInspection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryrewriterPackage.REWRITE__OCCURRENCES:
				return ((InternalEList<?>)getOccurrences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryrewriterPackage.REWRITE__OLD:
				return getOld();
			case QueryrewriterPackage.REWRITE__NEW:
				return getNew();
			case QueryrewriterPackage.REWRITE__OCCURRENCES:
				return getOccurrences();
			case QueryrewriterPackage.REWRITE__UNDER_INSPECTION:
				return isUnderInspection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryrewriterPackage.REWRITE__OLD:
				setOld((String)newValue);
				return;
			case QueryrewriterPackage.REWRITE__NEW:
				setNew((String)newValue);
				return;
			case QueryrewriterPackage.REWRITE__OCCURRENCES:
				getOccurrences().clear();
				getOccurrences().addAll((Collection<? extends Occurrence>)newValue);
				return;
			case QueryrewriterPackage.REWRITE__UNDER_INSPECTION:
				setUnderInspection((Boolean)newValue);
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
			case QueryrewriterPackage.REWRITE__OLD:
				setOld(OLD_EDEFAULT);
				return;
			case QueryrewriterPackage.REWRITE__NEW:
				setNew(NEW_EDEFAULT);
				return;
			case QueryrewriterPackage.REWRITE__OCCURRENCES:
				getOccurrences().clear();
				return;
			case QueryrewriterPackage.REWRITE__UNDER_INSPECTION:
				setUnderInspection(UNDER_INSPECTION_EDEFAULT);
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
			case QueryrewriterPackage.REWRITE__OLD:
				return OLD_EDEFAULT == null ? old != null : !OLD_EDEFAULT.equals(old);
			case QueryrewriterPackage.REWRITE__NEW:
				return NEW_EDEFAULT == null ? new_ != null : !NEW_EDEFAULT.equals(new_);
			case QueryrewriterPackage.REWRITE__OCCURRENCES:
				return occurrences != null && !occurrences.isEmpty();
			case QueryrewriterPackage.REWRITE__UNDER_INSPECTION:
				return underInspection != UNDER_INSPECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (old: ");
		result.append(old);
		result.append(", new: ");
		result.append(new_);
		result.append(", underInspection: ");
		result.append(underInspection);
		result.append(')');
		return result.toString();
	}

} //RewriteImpl
