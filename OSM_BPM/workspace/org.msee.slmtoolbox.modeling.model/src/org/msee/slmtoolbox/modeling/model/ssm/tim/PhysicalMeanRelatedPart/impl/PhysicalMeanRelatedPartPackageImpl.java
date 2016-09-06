/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalMeanRelatedPartPackageImpl extends EPackageImpl implements PhysicalMeanRelatedPartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timPhysicalMeanResourceEClass = null;
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhysicalMeanRelatedPartPackageImpl() {
		super(eNS_URI, PhysicalMeanRelatedPartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PhysicalMeanRelatedPartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhysicalMeanRelatedPartPackage init() {
		if (isInited) return (PhysicalMeanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI);

		// Obtain or create and register package
		PhysicalMeanRelatedPartPackageImpl thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhysicalMeanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhysicalMeanRelatedPartPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TimPackageImpl theTimPackage = (TimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) instanceof TimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) : TimPackage.eINSTANCE);
		CommonConceptsPackageImpl theCommonConceptsPackage = (CommonConceptsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) instanceof CommonConceptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) : CommonConceptsPackage.eINSTANCE);
		ITRelatedPartPackageImpl theITRelatedPartPackage = (ITRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) instanceof ITRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) : ITRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage_1 = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);

		// Create package meta-data objects
		thePhysicalMeanRelatedPartPackage.createPackageContents();
		theTimPackage.createPackageContents();
		theCommonConceptsPackage.createPackageContents();
		theITRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage_1.createPackageContents();

		// Initialize created meta-data
		thePhysicalMeanRelatedPartPackage.initializePackageContents();
		theTimPackage.initializePackageContents();
		theCommonConceptsPackage.initializePackageContents();
		theITRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhysicalMeanRelatedPartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhysicalMeanRelatedPartPackage.eNS_URI, thePhysicalMeanRelatedPartPackage);
		return thePhysicalMeanRelatedPartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimPhysicalMeanResource() {
		return timPhysicalMeanResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimPhysicalMeanResource_Capability() {
		return (EAttribute)timPhysicalMeanResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimPhysicalMeanResource_Constraint() {
		return (EAttribute)timPhysicalMeanResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimPhysicalMeanResource_OperationMode() {
		return (EAttribute)timPhysicalMeanResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimPhysicalMeanResource_TechnicalCharacteristics() {
		return (EAttribute)timPhysicalMeanResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimPhysicalMeanResource_ExpectedPerformance() {
		return (EAttribute)timPhysicalMeanResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalMeanRelatedPartFactory getPhysicalMeanRelatedPartFactory() {
		return (PhysicalMeanRelatedPartFactory)getEFactoryInstance();
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
		timPhysicalMeanResourceEClass = createEClass(TIM_PHYSICAL_MEAN_RESOURCE);
		createEAttribute(timPhysicalMeanResourceEClass, TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY);
		createEAttribute(timPhysicalMeanResourceEClass, TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT);
		createEAttribute(timPhysicalMeanResourceEClass, TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE);
		createEAttribute(timPhysicalMeanResourceEClass, TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS);
		createEAttribute(timPhysicalMeanResourceEClass, TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timPhysicalMeanResourceEClass.getESuperTypes().add(theCommonConceptsPackage.getTimResource());

		// Initialize classes and features; add operations and parameters
		initEClass(timPhysicalMeanResourceEClass, TimPhysicalMeanResource.class, "TimPhysicalMeanResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimPhysicalMeanResource_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, TimPhysicalMeanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimPhysicalMeanResource_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, TimPhysicalMeanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimPhysicalMeanResource_OperationMode(), ecorePackage.getEString(), "operationMode", null, 0, 1, TimPhysicalMeanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimPhysicalMeanResource_TechnicalCharacteristics(), ecorePackage.getEString(), "technicalCharacteristics", null, 0, 1, TimPhysicalMeanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimPhysicalMeanResource_ExpectedPerformance(), ecorePackage.getEString(), "expectedPerformance", null, 0, 1, TimPhysicalMeanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PhysicalMeanRelatedPartPackageImpl
