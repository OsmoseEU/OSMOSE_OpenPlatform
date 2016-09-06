/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl;
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
	private EClass eaBaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaFlowElementEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#eNS_URI
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
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneralElementsPackage.createPackageContents();
		theBsmPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theRootPackage_1.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theGeneralElementsPackage.initializePackageContents();
		theBsmPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();
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
	public EClass getEaBaseElement() {
		return eaBaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaBaseElement_Id() {
		return (EAttribute)eaBaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaBaseElement_Name() {
		return (EAttribute)eaBaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaBaseElement_Code() {
		return (EAttribute)eaBaseElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaBaseElement_Description() {
		return (EAttribute)eaBaseElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaProcess() {
		return eaProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaProcess_FlowElements() {
		return (EReference)eaProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaProcess_CanBe() {
		return (EReference)eaProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaProcess_Model() {
		return (EReference)eaProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaProcess_DecompositionCode() {
		return (EAttribute)eaProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaProcess_OsmioticProcess() {
		return (EAttribute)eaProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaFlowElement() {
		return eaFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlowElement_Process() {
		return (EReference)eaFlowElementEClass.getEStructuralFeatures().get(0);
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
		eaBaseElementEClass = createEClass(EA_BASE_ELEMENT);
		createEAttribute(eaBaseElementEClass, EA_BASE_ELEMENT__ID);
		createEAttribute(eaBaseElementEClass, EA_BASE_ELEMENT__NAME);
		createEAttribute(eaBaseElementEClass, EA_BASE_ELEMENT__CODE);
		createEAttribute(eaBaseElementEClass, EA_BASE_ELEMENT__DESCRIPTION);

		eaProcessEClass = createEClass(EA_PROCESS);
		createEReference(eaProcessEClass, EA_PROCESS__FLOW_ELEMENTS);
		createEReference(eaProcessEClass, EA_PROCESS__CAN_BE);
		createEReference(eaProcessEClass, EA_PROCESS__MODEL);
		createEAttribute(eaProcessEClass, EA_PROCESS__DECOMPOSITION_CODE);
		createEAttribute(eaProcessEClass, EA_PROCESS__OSMIOTIC_PROCESS);

		eaFlowElementEClass = createEClass(EA_FLOW_ELEMENT);
		createEReference(eaFlowElementEClass, EA_FLOW_ELEMENT__PROCESS);
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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		RootPackage theRootPackage = (RootPackage)EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaProcessEClass.getESuperTypes().add(this.getEaBaseElement());
		eaFlowElementEClass.getESuperTypes().add(this.getEaBaseElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eaBaseElementEClass, EaBaseElement.class, "EaBaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEaBaseElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, EaBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaBaseElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, EaBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaBaseElement_Code(), ecorePackage.getEString(), "code", null, 0, 1, EaBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaBaseElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, EaBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaProcessEClass, EaProcess.class, "EaProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaProcess_FlowElements(), this.getEaFlowElement(), this.getEaFlowElement_Process(), "flowElements", null, 0, -1, EaProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaProcess_CanBe(), theCoreElementsPackage.getEaStructuralExtendedActivity(), theCoreElementsPackage.getEaStructuralExtendedActivity_IsA(), "canBe", null, 0, 1, EaProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaProcess_Model(), theRootPackage.getEaModel(), theRootPackage.getEaModel_Process(), "model", null, 1, 1, EaProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaProcess_DecompositionCode(), ecorePackage.getEString(), "decompositionCode", null, 0, 1, EaProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaProcess_OsmioticProcess(), ecorePackage.getEString(), "osmioticProcess", "UNDEFINED", 0, 1, EaProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaFlowElementEClass, EaFlowElement.class, "EaFlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaFlowElement_Process(), this.getEaProcess(), this.getEaProcess_FlowElements(), "process", null, 1, 1, EaFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneralElementsPackageImpl
