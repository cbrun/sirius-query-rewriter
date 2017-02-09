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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.queryrewriter.Configuration;
import org.eclipse.sirius.queryrewriter.NameRewrite;
import org.eclipse.sirius.queryrewriter.QueryLanguage;
import org.eclipse.sirius.queryrewriter.QueryrewriterPackage;
import org.eclipse.sirius.queryrewriter.Rewrite;

import org.eclipse.sirius.queryrewriter.Tag;
import org.eclipse.sirius.viewpoint.description.Group;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getAccessibleGroups <em>Accessible Groups</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getRewrites <em>Rewrites</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getLanguagesToRewrite <em>Languages To Rewrite</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getAutoFill <em>Auto Fill</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getIncludedConfigurations <em>Included Configurations</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getNameRewrites <em>Name Rewrites</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getManualGroups <em>Manual Groups</em>}</li>
 *   <li>{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paths;

	/**
	 * The cached value of the '{@link #getAccessibleGroups() <em>Accessible Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> accessibleGroups;

	/**
	 * The cached value of the '{@link #getRewrites() <em>Rewrites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewrites()
	 * @generated
	 * @ordered
	 */
	protected EList<Rewrite> rewrites;

	/**
	 * The cached value of the '{@link #getLanguagesToRewrite() <em>Languages To Rewrite</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguagesToRewrite()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryLanguage> languagesToRewrite;

	/**
	 * The default value of the '{@link #getAutoFill() <em>Auto Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFill()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_FILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoFill() <em>Auto Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFill()
	 * @generated
	 * @ordered
	 */
	protected String autoFill = AUTO_FILL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedConfigurations() <em>Included Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> includedConfigurations;

	/**
	 * The cached value of the '{@link #getNameRewrites() <em>Name Rewrites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRewrites()
	 * @generated
	 * @ordered
	 */
	protected EList<NameRewrite> nameRewrites;

	/**
	 * The cached value of the '{@link #getManualGroups() <em>Manual Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> manualGroups;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryrewriterPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, QueryrewriterPackage.CONFIGURATION__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getAccessibleGroups() {
		if (accessibleGroups == null) {
			accessibleGroups = new EObjectResolvingEList<Group>(Group.class, this, QueryrewriterPackage.CONFIGURATION__ACCESSIBLE_GROUPS);
		}
		return accessibleGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rewrite> getRewrites() {
		if (rewrites == null) {
			rewrites = new EObjectContainmentEList<Rewrite>(Rewrite.class, this, QueryrewriterPackage.CONFIGURATION__REWRITES);
		}
		return rewrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryLanguage> getLanguagesToRewrite() {
		if (languagesToRewrite == null) {
			languagesToRewrite = new EDataTypeUniqueEList<QueryLanguage>(QueryLanguage.class, this, QueryrewriterPackage.CONFIGURATION__LANGUAGES_TO_REWRITE);
		}
		return languagesToRewrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoFill() {
		return autoFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoFill(String newAutoFill) {
		String oldAutoFill = autoFill;
		autoFill = newAutoFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryrewriterPackage.CONFIGURATION__AUTO_FILL, oldAutoFill, autoFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getIncludedConfigurations() {
		if (includedConfigurations == null) {
			includedConfigurations = new EObjectResolvingEList<Configuration>(Configuration.class, this, QueryrewriterPackage.CONFIGURATION__INCLUDED_CONFIGURATIONS);
		}
		return includedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameRewrite> getNameRewrites() {
		if (nameRewrites == null) {
			nameRewrites = new EObjectContainmentEList<NameRewrite>(NameRewrite.class, this, QueryrewriterPackage.CONFIGURATION__NAME_REWRITES);
		}
		return nameRewrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getManualGroups() {
		if (manualGroups == null) {
			manualGroups = new EObjectResolvingEList<Group>(Group.class, this, QueryrewriterPackage.CONFIGURATION__MANUAL_GROUPS);
		}
		return manualGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, QueryrewriterPackage.CONFIGURATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryrewriterPackage.CONFIGURATION__REWRITES:
				return ((InternalEList<?>)getRewrites()).basicRemove(otherEnd, msgs);
			case QueryrewriterPackage.CONFIGURATION__NAME_REWRITES:
				return ((InternalEList<?>)getNameRewrites()).basicRemove(otherEnd, msgs);
			case QueryrewriterPackage.CONFIGURATION__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case QueryrewriterPackage.CONFIGURATION__PATHS:
				return getPaths();
			case QueryrewriterPackage.CONFIGURATION__ACCESSIBLE_GROUPS:
				return getAccessibleGroups();
			case QueryrewriterPackage.CONFIGURATION__REWRITES:
				return getRewrites();
			case QueryrewriterPackage.CONFIGURATION__LANGUAGES_TO_REWRITE:
				return getLanguagesToRewrite();
			case QueryrewriterPackage.CONFIGURATION__AUTO_FILL:
				return getAutoFill();
			case QueryrewriterPackage.CONFIGURATION__INCLUDED_CONFIGURATIONS:
				return getIncludedConfigurations();
			case QueryrewriterPackage.CONFIGURATION__NAME_REWRITES:
				return getNameRewrites();
			case QueryrewriterPackage.CONFIGURATION__MANUAL_GROUPS:
				return getManualGroups();
			case QueryrewriterPackage.CONFIGURATION__TAGS:
				return getTags();
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
			case QueryrewriterPackage.CONFIGURATION__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends String>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__ACCESSIBLE_GROUPS:
				getAccessibleGroups().clear();
				getAccessibleGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__REWRITES:
				getRewrites().clear();
				getRewrites().addAll((Collection<? extends Rewrite>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__LANGUAGES_TO_REWRITE:
				getLanguagesToRewrite().clear();
				getLanguagesToRewrite().addAll((Collection<? extends QueryLanguage>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__AUTO_FILL:
				setAutoFill((String)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__INCLUDED_CONFIGURATIONS:
				getIncludedConfigurations().clear();
				getIncludedConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__NAME_REWRITES:
				getNameRewrites().clear();
				getNameRewrites().addAll((Collection<? extends NameRewrite>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__MANUAL_GROUPS:
				getManualGroups().clear();
				getManualGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case QueryrewriterPackage.CONFIGURATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case QueryrewriterPackage.CONFIGURATION__PATHS:
				getPaths().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__ACCESSIBLE_GROUPS:
				getAccessibleGroups().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__REWRITES:
				getRewrites().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__LANGUAGES_TO_REWRITE:
				getLanguagesToRewrite().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__AUTO_FILL:
				setAutoFill(AUTO_FILL_EDEFAULT);
				return;
			case QueryrewriterPackage.CONFIGURATION__INCLUDED_CONFIGURATIONS:
				getIncludedConfigurations().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__NAME_REWRITES:
				getNameRewrites().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__MANUAL_GROUPS:
				getManualGroups().clear();
				return;
			case QueryrewriterPackage.CONFIGURATION__TAGS:
				getTags().clear();
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
			case QueryrewriterPackage.CONFIGURATION__PATHS:
				return paths != null && !paths.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__ACCESSIBLE_GROUPS:
				return accessibleGroups != null && !accessibleGroups.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__REWRITES:
				return rewrites != null && !rewrites.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__LANGUAGES_TO_REWRITE:
				return languagesToRewrite != null && !languagesToRewrite.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__AUTO_FILL:
				return AUTO_FILL_EDEFAULT == null ? autoFill != null : !AUTO_FILL_EDEFAULT.equals(autoFill);
			case QueryrewriterPackage.CONFIGURATION__INCLUDED_CONFIGURATIONS:
				return includedConfigurations != null && !includedConfigurations.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__NAME_REWRITES:
				return nameRewrites != null && !nameRewrites.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__MANUAL_GROUPS:
				return manualGroups != null && !manualGroups.isEmpty();
			case QueryrewriterPackage.CONFIGURATION__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (paths: ");
		result.append(paths);
		result.append(", languagesToRewrite: ");
		result.append(languagesToRewrite);
		result.append(", autoFill: ");
		result.append(autoFill);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
