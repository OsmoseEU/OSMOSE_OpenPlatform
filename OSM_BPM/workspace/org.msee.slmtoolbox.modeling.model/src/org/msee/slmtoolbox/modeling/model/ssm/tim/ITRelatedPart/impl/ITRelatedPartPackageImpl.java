/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ITRelatedPartPackageImpl extends EPackageImpl implements ITRelatedPartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timEnterpriseApplicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timInformationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timInformationEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timInformationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timInformationAttributeEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ITRelatedPartPackageImpl() {
		super(eNS_URI, ITRelatedPartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ITRelatedPartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ITRelatedPartPackage init() {
		if (isInited) return (ITRelatedPartPackage)EPackage.Registry.INSTANCE.getEPackage(ITRelatedPartPackage.eNS_URI);

		// Obtain or create and register package
		ITRelatedPartPackageImpl theITRelatedPartPackage = (ITRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ITRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ITRelatedPartPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TimPackageImpl theTimPackage = (TimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) instanceof TimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI) : TimPackage.eINSTANCE);
		CommonConceptsPackageImpl theCommonConceptsPackage = (CommonConceptsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) instanceof CommonConceptsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonConceptsPackage.eNS_URI) : CommonConceptsPackage.eINSTANCE);
		PhysicalMeanRelatedPartPackageImpl thePhysicalMeanRelatedPartPackage = (PhysicalMeanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) instanceof PhysicalMeanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalMeanRelatedPartPackage.eNS_URI) : PhysicalMeanRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);
		HumanRelatedPartPackageImpl theHumanRelatedPartPackage_1 = (HumanRelatedPartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) instanceof HumanRelatedPartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HumanRelatedPartPackage.eNS_URI) : HumanRelatedPartPackage.eINSTANCE);

		// Create package meta-data objects
		theITRelatedPartPackage.createPackageContents();
		theTimPackage.createPackageContents();
		theCommonConceptsPackage.createPackageContents();
		thePhysicalMeanRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage.createPackageContents();
		theHumanRelatedPartPackage_1.createPackageContents();

		// Initialize created meta-data
		theITRelatedPartPackage.initializePackageContents();
		theTimPackage.initializePackageContents();
		theCommonConceptsPackage.initializePackageContents();
		thePhysicalMeanRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage.initializePackageContents();
		theHumanRelatedPartPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theITRelatedPartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ITRelatedPartPackage.eNS_URI, theITRelatedPartPackage);
		return theITRelatedPartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimEnterpriseApplicationResource() {
		return timEnterpriseApplicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimEnterpriseApplicationResource_Description() {
		return (EAttribute)timEnterpriseApplicationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimEnterpriseApplicationResource_Functionality() {
		return (EAttribute)timEnterpriseApplicationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimEnterpriseApplicationResource_Characteristics() {
		return (EAttribute)timEnterpriseApplicationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimEnterpriseApplicationResource_Informations() {
		return (EReference)timEnterpriseApplicationResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimInformationSet() {
		return timInformationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationSet_Id() {
		return (EAttribute)timInformationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationSet_Name() {
		return (EAttribute)timInformationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationSet_EntrepriseApplications() {
		return (EReference)timInformationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationSet_Model() {
		return (EReference)timInformationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationSet_Entities() {
		return (EReference)timInformationSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationSet_Relationships() {
		return (EReference)timInformationSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimInformationEntity() {
		return timInformationEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationEntity_Id() {
		return (EAttribute)timInformationEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationEntity_Name() {
		return (EAttribute)timInformationEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationEntity_OutRelations() {
		return (EReference)timInformationEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationEntity_InRelations() {
		return (EReference)timInformationEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationEntity_Attributes() {
		return (EReference)timInformationEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationEntity_Information() {
		return (EReference)timInformationEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimInformationRelationship() {
		return timInformationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationRelationship_Id() {
		return (EAttribute)timInformationRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationRelationship_Name() {
		return (EAttribute)timInformationRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationRelationship_Type() {
		return (EAttribute)timInformationRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationRelationship_SourceEntity() {
		return (EReference)timInformationRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationRelationship_TargetEntity() {
		return (EReference)timInformationRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationRelationship_Information() {
		return (EReference)timInformationRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimInformationAttribute() {
		return timInformationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationAttribute_Id() {
		return (EAttribute)timInformationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationAttribute_Name() {
		return (EAttribute)timInformationAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimInformationAttribute_Type() {
		return (EAttribute)timInformationAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimInformationAttribute_InformationEntity() {
		return (EReference)timInformationAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITRelatedPartFactory getITRelatedPartFactory() {
		return (ITRelatedPartFactory)getEFactoryInstance();
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
		timEnterpriseApplicationResourceEClass = createEClass(TIM_ENTERPRISE_APPLICATION_RESOURCE);
		createEAttribute(timEnterpriseApplicationResourceEClass, TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION);
		createEAttribute(timEnterpriseApplicationResourceEClass, TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY);
		createEAttribute(timEnterpriseApplicationResourceEClass, TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS);
		createEReference(timEnterpriseApplicationResourceEClass, TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS);

		timInformationSetEClass = createEClass(TIM_INFORMATION_SET);
		createEAttribute(timInformationSetEClass, TIM_INFORMATION_SET__ID);
		createEAttribute(timInformationSetEClass, TIM_INFORMATION_SET__NAME);
		createEReference(timInformationSetEClass, TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS);
		createEReference(timInformationSetEClass, TIM_INFORMATION_SET__MODEL);
		createEReference(timInformationSetEClass, TIM_INFORMATION_SET__ENTITIES);
		createEReference(timInformationSetEClass, TIM_INFORMATION_SET__RELATIONSHIPS);

		timInformationEntityEClass = createEClass(TIM_INFORMATION_ENTITY);
		createEAttribute(timInformationEntityEClass, TIM_INFORMATION_ENTITY__ID);
		createEAttribute(timInformationEntityEClass, TIM_INFORMATION_ENTITY__NAME);
		createEReference(timInformationEntityEClass, TIM_INFORMATION_ENTITY__OUT_RELATIONS);
		createEReference(timInformationEntityEClass, TIM_INFORMATION_ENTITY__IN_RELATIONS);
		createEReference(timInformationEntityEClass, TIM_INFORMATION_ENTITY__ATTRIBUTES);
		createEReference(timInformationEntityEClass, TIM_INFORMATION_ENTITY__INFORMATION);

		timInformationRelationshipEClass = createEClass(TIM_INFORMATION_RELATIONSHIP);
		createEAttribute(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__ID);
		createEAttribute(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__NAME);
		createEAttribute(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__TYPE);
		createEReference(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY);
		createEReference(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY);
		createEReference(timInformationRelationshipEClass, TIM_INFORMATION_RELATIONSHIP__INFORMATION);

		timInformationAttributeEClass = createEClass(TIM_INFORMATION_ATTRIBUTE);
		createEAttribute(timInformationAttributeEClass, TIM_INFORMATION_ATTRIBUTE__ID);
		createEAttribute(timInformationAttributeEClass, TIM_INFORMATION_ATTRIBUTE__NAME);
		createEAttribute(timInformationAttributeEClass, TIM_INFORMATION_ATTRIBUTE__TYPE);
		createEReference(timInformationAttributeEClass, TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timEnterpriseApplicationResourceEClass.getESuperTypes().add(theCommonConceptsPackage.getTimResource());
		timInformationSetEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timInformationEntityEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timInformationRelationshipEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());
		timInformationAttributeEClass.getESuperTypes().add(theTimPackage.getiTimNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(timEnterpriseApplicationResourceEClass, TimEnterpriseApplicationResource.class, "TimEnterpriseApplicationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimEnterpriseApplicationResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, TimEnterpriseApplicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimEnterpriseApplicationResource_Functionality(), ecorePackage.getEString(), "functionality", null, 0, 1, TimEnterpriseApplicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimEnterpriseApplicationResource_Characteristics(), ecorePackage.getEString(), "characteristics", null, 0, 1, TimEnterpriseApplicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimEnterpriseApplicationResource_Informations(), this.getTimInformationSet(), this.getTimInformationSet_EntrepriseApplications(), "informations", null, 0, -1, TimEnterpriseApplicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timInformationSetEClass, TimInformationSet.class, "TimInformationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimInformationSet_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationSet_EntrepriseApplications(), this.getTimEnterpriseApplicationResource(), this.getTimEnterpriseApplicationResource_Informations(), "entrepriseApplications", null, 0, -1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationSet_Model(), theTimPackage.getTimModel(), theTimPackage.getTimModel_Informations(), "model", null, 1, 1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationSet_Entities(), this.getTimInformationEntity(), this.getTimInformationEntity_Information(), "entities", null, 0, -1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationSet_Relationships(), this.getTimInformationRelationship(), this.getTimInformationRelationship_Information(), "relationships", null, 0, -1, TimInformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timInformationEntityEClass, TimInformationEntity.class, "TimInformationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimInformationEntity_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationEntity_OutRelations(), this.getTimInformationRelationship(), this.getTimInformationRelationship_SourceEntity(), "outRelations", null, 0, -1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationEntity_InRelations(), this.getTimInformationRelationship(), this.getTimInformationRelationship_TargetEntity(), "inRelations", null, 0, -1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationEntity_Attributes(), this.getTimInformationAttribute(), this.getTimInformationAttribute_InformationEntity(), "attributes", null, 0, -1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationEntity_Information(), this.getTimInformationSet(), this.getTimInformationSet_Entities(), "information", null, 1, 1, TimInformationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timInformationRelationshipEClass, TimInformationRelationship.class, "TimInformationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimInformationRelationship_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationRelationship_Type(), ecorePackage.getEString(), "type", null, 0, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationRelationship_SourceEntity(), this.getTimInformationEntity(), this.getTimInformationEntity_OutRelations(), "sourceEntity", null, 1, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationRelationship_TargetEntity(), this.getTimInformationEntity(), this.getTimInformationEntity_InRelations(), "targetEntity", null, 1, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationRelationship_Information(), this.getTimInformationSet(), this.getTimInformationSet_Relationships(), "information", null, 1, 1, TimInformationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timInformationAttributeEClass, TimInformationAttribute.class, "TimInformationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimInformationAttribute_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimInformationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimInformationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimInformationAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, TimInformationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimInformationAttribute_InformationEntity(), this.getTimInformationEntity(), this.getTimInformationEntity_Attributes(), "informationEntity", null, 1, 1, TimInformationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ITRelatedPartPackageImpl
