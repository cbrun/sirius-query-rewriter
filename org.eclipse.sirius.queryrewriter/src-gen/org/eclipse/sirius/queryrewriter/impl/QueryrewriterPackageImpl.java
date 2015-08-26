/**
 */
package org.eclipse.sirius.queryrewriter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.queryrewriter.Configuration;
import org.eclipse.sirius.queryrewriter.Occurrence;
import org.eclipse.sirius.queryrewriter.QueryLanguage;
import org.eclipse.sirius.queryrewriter.QueryrewriterFactory;
import org.eclipse.sirius.queryrewriter.QueryrewriterPackage;
import org.eclipse.sirius.queryrewriter.Rewrite;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryrewriterPackageImpl extends EPackageImpl implements QueryrewriterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rewriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryLanguageEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.queryrewriter.QueryrewriterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryrewriterPackageImpl() {
		super(eNS_URI, QueryrewriterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QueryrewriterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryrewriterPackage init() {
		if (isInited) return (QueryrewriterPackage)EPackage.Registry.INSTANCE.getEPackage(QueryrewriterPackage.eNS_URI);

		// Obtain or create and register package
		QueryrewriterPackageImpl theQueryrewriterPackage = (QueryrewriterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryrewriterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryrewriterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQueryrewriterPackage.createPackageContents();

		// Initialize created meta-data
		theQueryrewriterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryrewriterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryrewriterPackage.eNS_URI, theQueryrewriterPackage);
		return theQueryrewriterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Paths() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_AccessibleGroups() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Rewrites() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_LanguagesToRewrite() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_AutoFill() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRewrite() {
		return rewriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewrite_Old() {
		return (EAttribute)rewriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewrite_New() {
		return (EAttribute)rewriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRewrite_Occurrences() {
		return (EReference)rewriteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewrite_UnderInspection() {
		return (EAttribute)rewriteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewrite_Tested() {
		return (EAttribute)rewriteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrence() {
		return occurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrence_Eattribute() {
		return (EReference)occurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrence_VsmElement() {
		return (EReference)occurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryLanguage() {
		return queryLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryrewriterFactory getQueryrewriterFactory() {
		return (QueryrewriterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__PATHS);
		createEReference(configurationEClass, CONFIGURATION__ACCESSIBLE_GROUPS);
		createEReference(configurationEClass, CONFIGURATION__REWRITES);
		createEAttribute(configurationEClass, CONFIGURATION__LANGUAGES_TO_REWRITE);
		createEAttribute(configurationEClass, CONFIGURATION__AUTO_FILL);

		rewriteEClass = createEClass(REWRITE);
		createEAttribute(rewriteEClass, REWRITE__OLD);
		createEAttribute(rewriteEClass, REWRITE__NEW);
		createEReference(rewriteEClass, REWRITE__OCCURRENCES);
		createEAttribute(rewriteEClass, REWRITE__UNDER_INSPECTION);
		createEAttribute(rewriteEClass, REWRITE__TESTED);

		occurrenceEClass = createEClass(OCCURRENCE);
		createEReference(occurrenceEClass, OCCURRENCE__EATTRIBUTE);
		createEReference(occurrenceEClass, OCCURRENCE__VSM_ELEMENT);

		// Create enums
		queryLanguageEEnum = createEEnum(QUERY_LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Paths(), ecorePackage.getEString(), "paths", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_AccessibleGroups(), theDescriptionPackage.getGroup(), null, "accessibleGroups", null, 0, -1, Configuration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Rewrites(), this.getRewrite(), null, "rewrites", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_LanguagesToRewrite(), this.getQueryLanguage(), "languagesToRewrite", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_AutoFill(), theEcorePackage.getEString(), "autoFill", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewriteEClass, Rewrite.class, "Rewrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRewrite_Old(), theDescriptionPackage.getInterpretedExpression(), "old", null, 0, 1, Rewrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewrite_New(), theDescriptionPackage.getInterpretedExpression(), "new", null, 0, 1, Rewrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewrite_Occurrences(), this.getOccurrence(), null, "occurrences", null, 0, -1, Rewrite.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewrite_UnderInspection(), theEcorePackage.getEBoolean(), "underInspection", "true", 0, 1, Rewrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewrite_Tested(), theEcorePackage.getEBoolean(), "tested", null, 0, 1, Rewrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occurrenceEClass, Occurrence.class, "Occurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrence_Eattribute(), theEcorePackage.getEAttribute(), null, "eattribute", null, 0, 1, Occurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOccurrence_VsmElement(), theEcorePackage.getEObject(), null, "vsmElement", null, 0, 1, Occurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queryLanguageEEnum, QueryLanguage.class, "QueryLanguage");
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.UNKNOWN);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.LEGACY);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.MTL);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.OCL);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.AQL);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.FEATURE);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.VAR);
		addEEnumLiteral(queryLanguageEEnum, QueryLanguage.SERVICE);

		// Create resource
		createResource(eNS_URI);
	}

} //QueryrewriterPackageImpl
