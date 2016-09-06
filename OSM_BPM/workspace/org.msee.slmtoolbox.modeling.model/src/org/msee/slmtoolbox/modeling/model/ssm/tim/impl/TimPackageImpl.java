/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimPackageImpl extends EPackageImpl implements TimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTimNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timModelEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimPackageImpl() {
		super(eNS_URI, TimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimPackage init() {
		if (isInited) return (TimPackage)EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI);

		// Obtain or create and register package
		TimPackageImpl theTimPackage = (TimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonConceptsPackageImpl theCommonConceptsPackage = (CommonConceptsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) instanceof CommonConceptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) : CommonConceptsPackage.eINSTANCE);
		PhysicalMeanRelatedPartPackageImpl thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) instanceof PhysicalMeanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) : PhysicalMeanRelatedPartPackage.eINSTANCE);
		ITRelatedPartPackageImpl theITRelatedPartPackage = (ITRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) instanceof ITRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI) : ITRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage_1 = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);

		// Create package meta-data objects
		theTimPackage.createPackageContents();
		theCommonConceptsPackage.createPackageContents();
		thePhysicalMeanRelatedPartPackage.createPackageContents();
		theITRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage_1.createPackageContents();

		// Initialize created meta-data
		theTimPackage.initializePackageContents();
		theCommonConceptsPackage.initializePackageContents();
		thePhysicalMeanRelatedPartPackage.initializePackageContents();
		theITRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimPackage.eNS_URI, theTimPackage);
		return theTimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getiTimNamedElement() {
		return iTimNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimModel() {
		return timModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimModel_Id() {
		return (EAttribute)timModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimModel_Name() {
		return (EAttribute)timModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimModel_Services() {
		return (EReference)timModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimModel_Processes() {
		return (EReference)timModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimModel_Informations() {
		return (EReference)timModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimModel_Organizations() {
		return (EReference)timModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimModel_Resources() {
		return (EReference)timModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimFactory getTimFactory() {
		return (TimFactory)getEFactoryInstance();
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
		iTimNamedElementEClass = createEClass(ITIM_NAMED_ELEMENT);

		timModelEClass = createEClass(TIM_MODEL);
		createEAttribute(timModelEClass, TIM_MODEL__ID);
		createEAttribute(timModelEClass, TIM_MODEL__NAME);
		createEReference(timModelEClass, TIM_MODEL__SERVICES);
		createEReference(timModelEClass, TIM_MODEL__PROCESSES);
		createEReference(timModelEClass, TIM_MODEL__INFORMATIONS);
		createEReference(timModelEClass, TIM_MODEL__ORGANIZATIONS);
		createEReference(timModelEClass, TIM_MODEL__RESOURCES);
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
		PhysicalMeanRelatedPartPackage thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI);
		ITRelatedPartPackage theITRelatedPartPackage = (ITRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI);
		HumanRelatedPartPackage theHumanRelatedPartPackage = (HumanRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommonConceptsPackage);
		getESubpackages().add(thePhysicalMeanRelatedPartPackage);
		getESubpackages().add(theITRelatedPartPackage);
		getESubpackages().add(theHumanRelatedPartPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timModelEClass.getESuperTypes().add(this.getiTimNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(iTimNamedElementEClass, iTimNamedElement.class, "iTimNamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iTimNamedElementEClass, ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iTimNamedElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(iTimNamedElementEClass, null, "setId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iTimNamedElementEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iTimNamedElementEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timModelEClass, TimModel.class, "TimModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimModel_Services(), theCommonConceptsPackage.getTimService(), theCommonConceptsPackage.getTimService_Model(), "services", null, 0, -1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimModel_Processes(), theCommonConceptsPackage.getTimProcess(), theCommonConceptsPackage.getTimProcess_Model(), "processes", null, 0, -1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimModel_Informations(), theITRelatedPartPackage.getTimInformationSet(), theITRelatedPartPackage.getTimInformationSet_Model(), "informations", null, 0, -1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimModel_Organizations(), theHumanRelatedPartPackage.getTimOrganization(), theHumanRelatedPartPackage.getTimOrganization_Model(), "organizations", null, 0, -1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimModel_Resources(), theCommonConceptsPackage.getTimResource(), theCommonConceptsPackage.getTimResource_Model(), "resources", null, 0, -1, TimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimPackageImpl
