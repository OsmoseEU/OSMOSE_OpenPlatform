/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl;

import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;

import org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonConceptsPackageImpl extends EPackageImpl implements CommonConceptsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timResourceEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonConceptsPackageImpl() {
		super(eNS_URI, CommonConceptsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonConceptsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonConceptsPackage init() {
		if (isInited) return (CommonConceptsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI);

		// Obtain or create and register package
		CommonConceptsPackageImpl theCommonConceptsPackage = (CommonConceptsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonConceptsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonConceptsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TimPackageImpl theTimPackage = (TimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) instanceof TimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) : TimPackage.eINSTANCE);
		PhysicalMeanRelatedPartPackageImpl thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) instanceof PhysicalMeanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) : PhysicalMeanRelatedPartPackage.eINSTANCE);
		ITRelatedPartPackageImpl theITRelatedPartPackage = (ITRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) instanceof ITRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) : ITRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage_1 = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonConceptsPackage.createPackageContents();
		theTimPackage.createPackageContents();
		thePhysicalMeanRelatedPartPackage.createPackageContents();
		theITRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage_1.createPackageContents();

		// Initialize created meta-data
		theCommonConceptsPackage.initializePackageContents();
		theTimPackage.initializePackageContents();
		thePhysicalMeanRelatedPartPackage.initializePackageContents();
		theITRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonConceptsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonConceptsPackage.eNS_URI, theCommonConceptsPackage);
		return theCommonConceptsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimService() {
		return timServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Id() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Name() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Domain() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Description() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Constraint() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Nature() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimService_SubServices() {
		return (EReference)timServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimService_MainService() {
		return (EReference)timServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimService_Processes() {
		return (EReference)timServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimService_Resources() {
		return (EReference)timServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimService_Model() {
		return (EReference)timServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_AutomationLevel() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Access() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Consumption() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimService_Objective() {
		return (EAttribute)timServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimProcess() {
		return timProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Id() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Name() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Objective() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Trigger() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Result() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_Constraint() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimProcess_WorkFlow() {
		return (EAttribute)timProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_Subprocesses() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_MainProcess() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_Services() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_Resources() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_ResponsibleOrganizationUnit() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_Model() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimProcess_Organizations() {
		return (EReference)timProcessEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimResource() {
		return timResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimResource_Id() {
		return (EAttribute)timResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimResource_Name() {
		return (EAttribute)timResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimResource_Function() {
		return (EAttribute)timResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimResource_Type() {
		return (EAttribute)timResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimResource_Processes() {
		return (EReference)timResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimResource_Model() {
		return (EReference)timResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimResource_OrganizationUnit() {
		return (EReference)timResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimResource_Services() {
		return (EReference)timResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonConceptsFactory getCommonConceptsFactory() {
		return (CommonConceptsFactory)getEFactoryInstance();
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
		timServiceEClass = createEClass(TIM_SERVICE);
		createEAttribute(timServiceEClass, TIM_SERVICE__ID);
		createEAttribute(timServiceEClass, TIM_SERVICE__NAME);
		createEAttribute(timServiceEClass, TIM_SERVICE__DESCRIPTION);
		createEAttribute(timServiceEClass, TIM_SERVICE__OBJECTIVE);
		createEAttribute(timServiceEClass, TIM_SERVICE__CONSTRAINT);
		createEAttribute(timServiceEClass, TIM_SERVICE__ACCESS);
		createEAttribute(timServiceEClass, TIM_SERVICE__CONSUMPTION);
		createEAttribute(timServiceEClass, TIM_SERVICE__AUTOMATION_LEVEL);
		createEAttribute(timServiceEClass, TIM_SERVICE__DOMAIN);
		createEAttribute(timServiceEClass, TIM_SERVICE__NATURE);
		createEReference(timServiceEClass, TIM_SERVICE__SUB_SERVICES);
		createEReference(timServiceEClass, TIM_SERVICE__MAIN_SERVICE);
		createEReference(timServiceEClass, TIM_SERVICE__PROCESSES);
		createEReference(timServiceEClass, TIM_SERVICE__RESOURCES);
		createEReference(timServiceEClass, TIM_SERVICE__MODEL);

		timProcessEClass = createEClass(TIM_PROCESS);
		createEAttribute(timProcessEClass, TIM_PROCESS__ID);
		createEAttribute(timProcessEClass, TIM_PROCESS__NAME);
		createEAttribute(timProcessEClass, TIM_PROCESS__OBJECTIVE);
		createEAttribute(timProcessEClass, TIM_PROCESS__TRIGGER);
		createEAttribute(timProcessEClass, TIM_PROCESS__RESULT);
		createEAttribute(timProcessEClass, TIM_PROCESS__CONSTRAINT);
		createEAttribute(timProcessEClass, TIM_PROCESS__WORK_FLOW);
		createEReference(timProcessEClass, TIM_PROCESS__SUBPROCESSES);
		createEReference(timProcessEClass, TIM_PROCESS__MAIN_PROCESS);
		createEReference(timProcessEClass, TIM_PROCESS__SERVICES);
		createEReference(timProcessEClass, TIM_PROCESS__RESOURCES);
		createEReference(timProcessEClass, TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT);
		createEReference(timProcessEClass, TIM_PROCESS__MODEL);
		createEReference(timProcessEClass, TIM_PROCESS__ORGANIZATIONS);

		timResourceEClass = createEClass(TIM_RESOURCE);
		createEAttribute(timResourceEClass, TIM_RESOURCE__ID);
		createEAttribute(timResourceEClass, TIM_RESOURCE__NAME);
		createEAttribute(timResourceEClass, TIM_RESOURCE__FUNCTION);
		createEAttribute(timResourceEClass, TIM_RESOURCE__TYPE);
		createEReference(timResourceEClass, TIM_RESOURCE__PROCESSES);
		createEReference(timResourceEClass, TIM_RESOURCE__MODEL);
		createEReference(timResourceEClass, TIM_RESOURCE__ORGANIZATION_UNIT);
		createEReference(timResourceEClass, TIM_RESOURCE__SERVICES);
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
		TimPackage theTimPackage = (TimPackage)EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI);
		HumanRelatedPartPackage theHumanRelatedPartPackage = (HumanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timServiceEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timProcessEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timResourceEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(timServiceEClass, TimService.class, "TimService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimService_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Description(), ecorePackage.getEString(), "description", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Access(), ecorePackage.getEString(), "access", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Consumption(), ecorePackage.getEString(), "consumption", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_AutomationLevel(), ecorePackage.getEString(), "automationLevel", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimService_Nature(), ecorePackage.getEString(), "nature", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimService_SubServices(), this.getTimService(), this.getTimService_MainService(), "subServices", null, 0, -1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimService_MainService(), this.getTimService(), this.getTimService_SubServices(), "mainService", null, 0, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimService_Processes(), this.getTimProcess(), this.getTimProcess_Services(), "processes", null, 0, -1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimService_Resources(), this.getTimResource(), this.getTimResource_Services(), "resources", null, 0, -1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimService_Model(), theTimPackage.getTimModel(), theTimPackage.getTimModel_Services(), "model", null, 1, 1, TimService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timProcessEClass, TimProcess.class, "TimProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimProcess_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_Result(), ecorePackage.getEString(), "result", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimProcess_WorkFlow(), ecorePackage.getEString(), "workFlow", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_Subprocesses(), this.getTimProcess(), this.getTimProcess_MainProcess(), "subprocesses", null, 0, -1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_MainProcess(), this.getTimProcess(), this.getTimProcess_Subprocesses(), "mainProcess", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_Services(), this.getTimService(), this.getTimService_Processes(), "services", null, 0, -1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_Resources(), this.getTimResource(), this.getTimResource_Processes(), "resources", null, 0, -1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_ResponsibleOrganizationUnit(), theHumanRelatedPartPackage.getTimOrganizationUnit(), theHumanRelatedPartPackage.getTimOrganizationUnit_Processes(), "responsibleOrganizationUnit", null, 0, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_Model(), theTimPackage.getTimModel(), theTimPackage.getTimModel_Processes(), "model", null, 1, 1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimProcess_Organizations(), theHumanRelatedPartPackage.getTimOrganization(), theHumanRelatedPartPackage.getTimOrganization_Processes(), "organizations", null, 0, -1, TimProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timResourceEClass, TimResource.class, "TimResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimResource_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimResource_Function(), ecorePackage.getEString(), "function", null, 0, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimResource_Type(), ecorePackage.getEString(), "type", null, 0, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimResource_Processes(), this.getTimProcess(), this.getTimProcess_Resources(), "processes", null, 0, -1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimResource_Model(), theTimPackage.getTimModel(), theTimPackage.getTimModel_Resources(), "model", null, 1, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimResource_OrganizationUnit(), theHumanRelatedPartPackage.getTimOrganizationUnit(), theHumanRelatedPartPackage.getTimOrganizationUnit_Resources(), "organizationUnit", null, 1, 1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimResource_Services(), this.getTimService(), this.getTimService_Resources(), "services", null, 0, -1, TimResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CommonConceptsPackageImpl
