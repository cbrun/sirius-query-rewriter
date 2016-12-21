/**
 */
package org.eclipse.sirius.queryrewriter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.queryrewriter.QueryrewriterFactory
 * @model kind="package"
 * @generated
 */
public interface QueryrewriterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "queryrewriter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/queryrewriter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "queryrewriter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryrewriterPackage eINSTANCE = org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl
	 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PATHS = 0;

	/**
	 * The feature id for the '<em><b>Accessible Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ACCESSIBLE_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__REWRITES = 2;

	/**
	 * The feature id for the '<em><b>Languages To Rewrite</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LANGUAGES_TO_REWRITE = 3;

	/**
	 * The feature id for the '<em><b>Auto Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__AUTO_FILL = 4;

	/**
	 * The feature id for the '<em><b>Included Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INCLUDED_CONFIGURATIONS = 5;

	/**
	 * The feature id for the '<em><b>Name Rewrites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME_REWRITES = 6;

	/**
	 * The feature id for the '<em><b>Manual Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MANUAL_GROUPS = 7;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl <em>Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.queryrewriter.impl.RewriteImpl
	 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getRewrite()
	 * @generated
	 */
	int REWRITE = 1;

	/**
	 * The feature id for the '<em><b>Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__OLD = 0;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__NEW = 1;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__OCCURRENCES = 2;

	/**
	 * The feature id for the '<em><b>Under Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__UNDER_INSPECTION = 3;

	/**
	 * The feature id for the '<em><b>Tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__TESTED = 4;

	/**
	 * The number of structural features of the '<em>Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl <em>Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl
	 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getOccurrence()
	 * @generated
	 */
	int OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Eattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Vsm Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__VSM_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.queryrewriter.impl.NameRewriteImpl <em>Name Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.queryrewriter.impl.NameRewriteImpl
	 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getNameRewrite()
	 * @generated
	 */
	int NAME_REWRITE = 3;

	/**
	 * The feature id for the '<em><b>Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REWRITE__OLD = 0;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REWRITE__NEW = 1;

	/**
	 * The number of structural features of the '<em>Name Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REWRITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REWRITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.queryrewriter.QueryLanguage <em>Query Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.queryrewriter.QueryLanguage
	 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getQueryLanguage()
	 * @generated
	 */
	int QUERY_LANGUAGE = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.queryrewriter.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sirius.queryrewriter.Configuration#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getPaths()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Paths();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.queryrewriter.Configuration#getAccessibleGroups <em>Accessible Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Groups</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getAccessibleGroups()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_AccessibleGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.queryrewriter.Configuration#getRewrites <em>Rewrites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewrites</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getRewrites()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Rewrites();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sirius.queryrewriter.Configuration#getLanguagesToRewrite <em>Languages To Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages To Rewrite</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getLanguagesToRewrite()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LanguagesToRewrite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.Configuration#getAutoFill <em>Auto Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Fill</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getAutoFill()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_AutoFill();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.queryrewriter.Configuration#getIncludedConfigurations <em>Included Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Configurations</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getIncludedConfigurations()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_IncludedConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.queryrewriter.Configuration#getNameRewrites <em>Name Rewrites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Rewrites</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getNameRewrites()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_NameRewrites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.queryrewriter.Configuration#getManualGroups <em>Manual Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manual Groups</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Configuration#getManualGroups()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ManualGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.queryrewriter.Rewrite <em>Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite
	 * @generated
	 */
	EClass getRewrite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.Rewrite#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite#getOld()
	 * @see #getRewrite()
	 * @generated
	 */
	EAttribute getRewrite_Old();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.Rewrite#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite#getNew()
	 * @see #getRewrite()
	 * @generated
	 */
	EAttribute getRewrite_New();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.queryrewriter.Rewrite#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrences</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite#getOccurrences()
	 * @see #getRewrite()
	 * @generated
	 */
	EReference getRewrite_Occurrences();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.Rewrite#isUnderInspection <em>Under Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under Inspection</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite#isUnderInspection()
	 * @see #getRewrite()
	 * @generated
	 */
	EAttribute getRewrite_UnderInspection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.Rewrite#isTested <em>Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tested</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Rewrite#isTested()
	 * @see #getRewrite()
	 * @generated
	 */
	EAttribute getRewrite_Tested();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.queryrewriter.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Occurrence
	 * @generated
	 */
	EClass getOccurrence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.queryrewriter.Occurrence#getEattribute <em>Eattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eattribute</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Occurrence#getEattribute()
	 * @see #getOccurrence()
	 * @generated
	 */
	EReference getOccurrence_Eattribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.queryrewriter.Occurrence#getVsmElement <em>Vsm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vsm Element</em>'.
	 * @see org.eclipse.sirius.queryrewriter.Occurrence#getVsmElement()
	 * @see #getOccurrence()
	 * @generated
	 */
	EReference getOccurrence_VsmElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.queryrewriter.NameRewrite <em>Name Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Rewrite</em>'.
	 * @see org.eclipse.sirius.queryrewriter.NameRewrite
	 * @generated
	 */
	EClass getNameRewrite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.NameRewrite#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old</em>'.
	 * @see org.eclipse.sirius.queryrewriter.NameRewrite#getOld()
	 * @see #getNameRewrite()
	 * @generated
	 */
	EAttribute getNameRewrite_Old();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.queryrewriter.NameRewrite#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see org.eclipse.sirius.queryrewriter.NameRewrite#getNew()
	 * @see #getNameRewrite()
	 * @generated
	 */
	EAttribute getNameRewrite_New();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.queryrewriter.QueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Language</em>'.
	 * @see org.eclipse.sirius.queryrewriter.QueryLanguage
	 * @generated
	 */
	EEnum getQueryLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryrewriterFactory getQueryrewriterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.queryrewriter.impl.ConfigurationImpl
		 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__PATHS = eINSTANCE.getConfiguration_Paths();

		/**
		 * The meta object literal for the '<em><b>Accessible Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ACCESSIBLE_GROUPS = eINSTANCE.getConfiguration_AccessibleGroups();

		/**
		 * The meta object literal for the '<em><b>Rewrites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__REWRITES = eINSTANCE.getConfiguration_Rewrites();

		/**
		 * The meta object literal for the '<em><b>Languages To Rewrite</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LANGUAGES_TO_REWRITE = eINSTANCE.getConfiguration_LanguagesToRewrite();

		/**
		 * The meta object literal for the '<em><b>Auto Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__AUTO_FILL = eINSTANCE.getConfiguration_AutoFill();

		/**
		 * The meta object literal for the '<em><b>Included Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INCLUDED_CONFIGURATIONS = eINSTANCE.getConfiguration_IncludedConfigurations();

		/**
		 * The meta object literal for the '<em><b>Name Rewrites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__NAME_REWRITES = eINSTANCE.getConfiguration_NameRewrites();

		/**
		 * The meta object literal for the '<em><b>Manual Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MANUAL_GROUPS = eINSTANCE.getConfiguration_ManualGroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.queryrewriter.impl.RewriteImpl <em>Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.queryrewriter.impl.RewriteImpl
		 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getRewrite()
		 * @generated
		 */
		EClass REWRITE = eINSTANCE.getRewrite();

		/**
		 * The meta object literal for the '<em><b>Old</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE__OLD = eINSTANCE.getRewrite_Old();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE__NEW = eINSTANCE.getRewrite_New();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITE__OCCURRENCES = eINSTANCE.getRewrite_Occurrences();

		/**
		 * The meta object literal for the '<em><b>Under Inspection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE__UNDER_INSPECTION = eINSTANCE.getRewrite_UnderInspection();

		/**
		 * The meta object literal for the '<em><b>Tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REWRITE__TESTED = eINSTANCE.getRewrite_Tested();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl <em>Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.queryrewriter.impl.OccurrenceImpl
		 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getOccurrence()
		 * @generated
		 */
		EClass OCCURRENCE = eINSTANCE.getOccurrence();

		/**
		 * The meta object literal for the '<em><b>Eattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE__EATTRIBUTE = eINSTANCE.getOccurrence_Eattribute();

		/**
		 * The meta object literal for the '<em><b>Vsm Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE__VSM_ELEMENT = eINSTANCE.getOccurrence_VsmElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.queryrewriter.impl.NameRewriteImpl <em>Name Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.queryrewriter.impl.NameRewriteImpl
		 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getNameRewrite()
		 * @generated
		 */
		EClass NAME_REWRITE = eINSTANCE.getNameRewrite();

		/**
		 * The meta object literal for the '<em><b>Old</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_REWRITE__OLD = eINSTANCE.getNameRewrite_Old();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_REWRITE__NEW = eINSTANCE.getNameRewrite_New();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.queryrewriter.QueryLanguage <em>Query Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.queryrewriter.QueryLanguage
		 * @see org.eclipse.sirius.queryrewriter.impl.QueryrewriterPackageImpl#getQueryLanguage()
		 * @generated
		 */
		EEnum QUERY_LANGUAGE = eINSTANCE.getQueryLanguage();

	}

} //QueryrewriterPackage
