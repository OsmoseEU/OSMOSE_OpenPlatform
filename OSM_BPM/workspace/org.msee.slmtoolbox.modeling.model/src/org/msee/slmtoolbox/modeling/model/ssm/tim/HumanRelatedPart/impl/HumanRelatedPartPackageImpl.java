/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HumanRelatedPartPackageImpl extends EPackageImpl implements HumanRelatedPartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timHumanResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timOrganizationUnitEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HumanRelatedPartPackageImpl() {
		super(eNS_URI, HumanRelatedPartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HumanRelatedPartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HumanRelatedPartPackage init() {
		if (isInited) return (HumanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI);

		// Obtain or create and register package
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HumanRelatedPartPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TimPackageImpl theTimPackage = (TimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) instanceof TimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) : TimPackage.eINSTANCE);
		CommonConceptsPackageImpl theCommonConceptsPackage = (CommonConceptsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) instanceof CommonConceptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) : CommonConceptsPackage.eINSTANCE);
		PhysicalMeanRelatedPartPackageImpl thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) instanceof PhysicalMeanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) : PhysicalMeanRelatedPartPackage.eINSTANCE);
		ITRelatedPartPackageImpl theITRelatedPartPackage = (ITRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) instanceof ITRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) : ITRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage_1 = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);

		// Create package meta-data objects
		theHumanRelatedPartPackage.createPackageContents();
		theTimPackage.createPackageContents();
		theCommonConceptsPackage.createPackageContents();
		thePhysicalMeanRelatedPartPackage.createPackageContents();
		theITRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage_1.createPackageContents();

		// Initialize created meta-data
		theHumanRelatedPartPackage.initializePackageContents();
		theTimPackage.initializePackageContents();
		theCommonConceptsPackage.initializePackageContents();
		thePhysicalMeanRelatedPartPackage.initializePackageContents();
		theITRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHumanRelatedPartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HumanRelatedPartPackage.eNS_URI, theHumanRelatedPartPackage);
		return theHumanRelatedPartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimHumanResource() {
		return timHumanResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_Capability() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_Constraint() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_Skills() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_EducationLevel() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_Quantity() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimHumanResource_ExpectedPerformance() {
		return (EAttribute)timHumanResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimOrganization() {
		return timOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Id() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Name() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Type() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Description() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Responsibility() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganization_Authorization() {
		return (EAttribute)timOrganizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganization_OrganizationUnits() {
		return (EReference)timOrganizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganization_Model() {
		return (EReference)timOrganizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganization_Processes() {
		return (EReference)timOrganizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimOrganizationUnit() {
		return timOrganizationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganizationUnit_Id() {
		return (EAttribute)timOrganizationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganizationUnit_Name() {
		return (EAttribute)timOrganizationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganizationUnit_Function() {
		return (EAttribute)timOrganizationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganizationUnit_Organization() {
		return (EReference)timOrganizationUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganizationUnit_Resources() {
		return (EReference)timOrganizationUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimOrganizationUnit_Processes() {
		return (EReference)timOrganizationUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganizationUnit_Responsibility() {
		return (EAttribute)timOrganizationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimOrganizationUnit_Authorization() {
		return (EAttribute)timOrganizationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanRelatedPartFactory getHumanRelatedPartFactory() {
		return (HumanRelatedPartFactory)getEFactoryInstance();
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
		timHumanResourceEClass = createEClass(TIM_HUMAN_RESOURCE);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__CAPABILITY);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__CONSTRAINT);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__SKILLS);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__EDUCATION_LEVEL);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__QUANTITY);
		createEAttribute(timHumanResourceEClass, TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE);

		timOrganizationEClass = createEClass(TIM_ORGANIZATION);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__ID);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__NAME);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__TYPE);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__DESCRIPTION);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__RESPONSIBILITY);
		createEAttribute(timOrganizationEClass, TIM_ORGANIZATION__AUTHORIZATION);
		createEReference(timOrganizationEClass, TIM_ORGANIZATION__ORGANIZATION_UNITS);
		createEReference(timOrganizationEClass, TIM_ORGANIZATION__MODEL);
		createEReference(timOrganizationEClass, TIM_ORGANIZATION__PROCESSES);

		timOrganizationUnitEClass = createEClass(TIM_ORGANIZATION_UNIT);
		createEAttribute(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__ID);
		createEAttribute(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__NAME);
		createEAttribute(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__FUNCTION);
		createEAttribute(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__RESPONSIBILITY);
		createEAttribute(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__AUTHORIZATION);
		createEReference(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__ORGANIZATION);
		createEReference(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__RESOURCES);
		createEReference(timOrganizationUnitEClass, TIM_ORGANIZATION_UNIT__PROCESSES);
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
		CommonConceptsPackage theCommonConceptsPackage = (CommonConceptsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI);
		TimPackage theTimPackage = (TimPackage)EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI);
		HumanRelatedPartPackage theHumanRelatedPartPackage_1 = (HumanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timHumanResourceEClass.getESuperTypes().add(theCommonConceptsPackage.getTimResource());
		timOrganizationEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timOrganizationUnitEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(timHumanResourceEClass, TimHumanResource.class, "TimHumanResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimHumanResource_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimHumanResource_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimHumanResource_Skills(), ecorePackage.getEString(), "skills", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimHumanResource_EducationLevel(), ecorePackage.getEString(), "educationLevel", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimHumanResource_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimHumanResource_ExpectedPerformance(), ecorePackage.getEString(), "expectedPerformance", null, 0, 1, TimHumanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timOrganizationEClass, TimOrganization.class, "TimOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimOrganization_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganization_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganization_Type(), ecorePackage.getEString(), "type", null, 0, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganization_Description(), ecorePackage.getEString(), "description", null, 0, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganization_Responsibility(), ecorePackage.getEString(), "responsibility", null, 0, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganization_Authorization(), ecorePackage.getEString(), "authorization", null, 0, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganization_OrganizationUnits(), theHumanRelatedPartPackage_1.getTimOrganizationUnit(), theHumanRelatedPartPackage_1.getTimOrganizationUnit_Organization(), "organizationUnits", null, 0, -1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganization_Model(), theTimPackage.getTimModel(), theTimPackage.getTimModel_Organizations(), "model", null, 1, 1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganization_Processes(), theCommonConceptsPackage.getTimProcess(), theCommonConceptsPackage.getTimProcess_Organizations(), "processes", null, 0, -1, TimOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timOrganizationUnitEClass, TimOrganizationUnit.class, "TimOrganizationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimOrganizationUnit_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganizationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganizationUnit_Function(), ecorePackage.getEString(), "function", null, 0, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganizationUnit_Responsibility(), ecorePackage.getEString(), "responsibility", null, 0, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimOrganizationUnit_Authorization(), ecorePackage.getEString(), "authorization", null, 0, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganizationUnit_Organization(), theHumanRelatedPartPackage_1.getTimOrganization(), theHumanRelatedPartPackage_1.getTimOrganization_OrganizationUnits(), "organization", null, 1, 1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganizationUnit_Resources(), theCommonConceptsPackage.getTimResource(), theCommonConceptsPackage.getTimResource_OrganizationUnit(), "resources", null, 0, -1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimOrganizationUnit_Processes(), theCommonConceptsPackage.getTimProcess(), theCommonConceptsPackage.getTimProcess_ResponsibleOrganizationUnit(), "processes", null, 0, -1, TimOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //HumanRelatedPartPackageImpl
