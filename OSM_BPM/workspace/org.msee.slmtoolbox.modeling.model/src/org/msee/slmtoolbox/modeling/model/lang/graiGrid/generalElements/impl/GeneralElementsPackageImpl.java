/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralElementsPackageImpl extends EPackageImpl implements GeneralElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggBaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggGraiGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggOrganizationEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneralElementsPackageImpl() {
		super(eNS_URI, GeneralElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneralElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneralElementsPackage init() {
		if (isInited) return (GeneralElementsPackage)EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI);

		// Obtain or create and register package
		GeneralElementsPackageImpl theGeneralElementsPackage = (GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneralElementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BsmPackageImpl theBsmPackage = (BsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) instanceof BsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) : BsmPackage.eINSTANCE);
		RootPackageImpl theRootPackage = (RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) instanceof RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) : RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage.eINSTANCE);
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneralElementsPackage.createPackageContents();
		theBsmPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theRootPackage_1.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theGeneralElementsPackage.initializePackageContents();
		theBsmPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theCoreElementsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneralElementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneralElementsPackage.eNS_URI, theGeneralElementsPackage);
		return theGeneralElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgBaseElement() {
		return ggBaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgBaseElement_Id() {
		return (EAttribute)ggBaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgBaseElement_Name() {
		return (EAttribute)ggBaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgBaseElement_Code() {
		return (EAttribute)ggBaseElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgBaseElement_Description() {
		return (EAttribute)ggBaseElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgGraiGrid() {
		return ggGraiGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Levels() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Flows() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Nodes() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Functions() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_InformationSources() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Organizations() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgGraiGrid_Model() {
		return (EReference)ggGraiGridEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgOrganization() {
		return ggOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgOrganization_Functions() {
		return (EReference)ggOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgOrganization_Model() {
		return (EReference)ggOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgOrganization_GraiGrid() {
		return (EReference)ggOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralElementsFactory getGeneralElementsFactory() {
		return (GeneralElementsFactory)getEFactoryInstance();
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
		ggBaseElementEClass = createEClass(GG_BASE_ELEMENT);
		createEAttribute(ggBaseElementEClass, GG_BASE_ELEMENT__ID);
		createEAttribute(ggBaseElementEClass, GG_BASE_ELEMENT__NAME);
		createEAttribute(ggBaseElementEClass, GG_BASE_ELEMENT__CODE);
		createEAttribute(ggBaseElementEClass, GG_BASE_ELEMENT__DESCRIPTION);

		ggGraiGridEClass = createEClass(GG_GRAI_GRID);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__LEVELS);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__FLOWS);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__NODES);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__FUNCTIONS);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__INFORMATION_SOURCES);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__ORGANIZATIONS);
		createEReference(ggGraiGridEClass, GG_GRAI_GRID__MODEL);

		ggOrganizationEClass = createEClass(GG_ORGANIZATION);
		createEReference(ggOrganizationEClass, GG_ORGANIZATION__FUNCTIONS);
		createEReference(ggOrganizationEClass, GG_ORGANIZATION__MODEL);
		createEReference(ggOrganizationEClass, GG_ORGANIZATION__GRAI_GRID);
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
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage)EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ggGraiGridEClass.getESuperTypes().add(this.getGgBaseElement());
		ggOrganizationEClass.getESuperTypes().add(this.getGgBaseElement());

		// Initialize classes and features; add operations and parameters
		initEClass(ggBaseElementEClass, GgBaseElement.class, "GgBaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGgBaseElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, GgBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgBaseElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GgBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgBaseElement_Code(), ecorePackage.getEString(), "code", null, 0, 1, GgBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgBaseElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, GgBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ggGraiGridEClass, GgGraiGrid.class, "GgGraiGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgGraiGrid_Levels(), theCoreElementsPackage_1.getGgLevel(), theCoreElementsPackage_1.getGgLevel_GraiGrid(), "levels", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_Flows(), theCoreElementsPackage_1.getGgFlow(), theCoreElementsPackage_1.getGgFlow_GraiGrid(), "flows", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_Nodes(), theCoreElementsPackage_1.getGgNode(), theCoreElementsPackage_1.getGgNode_GraiGrid(), "nodes", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_Functions(), theCoreElementsPackage_1.getGgFunction(), theCoreElementsPackage_1.getGgFunction_GraiGrid(), "functions", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_InformationSources(), theCoreElementsPackage_1.getGgInformationSource(), theCoreElementsPackage_1.getGgInformationSource_GraiGrid(), "informationSources", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_Organizations(), this.getGgOrganization(), this.getGgOrganization_GraiGrid(), "organizations", null, 0, -1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgGraiGrid_Model(), theRootPackage_1.getGgModel(), theRootPackage_1.getGgModel_GraiGrids(), "model", null, 1, 1, GgGraiGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggGraiGridEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggOrganizationEClass, GgOrganization.class, "GgOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgOrganization_Functions(), theCoreElementsPackage_1.getGgFunction(), theCoreElementsPackage_1.getGgFunction_Organization(), "functions", null, 0, -1, GgOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgOrganization_Model(), theRootPackage_1.getGgModel(), theRootPackage_1.getGgModel_Organizations(), "model", null, 1, 1, GgOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgOrganization_GraiGrid(), this.getGgGraiGrid(), this.getGgGraiGrid_Organizations(), "graiGrid", null, 1, 1, GgOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggOrganizationEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneralElementsPackageImpl
