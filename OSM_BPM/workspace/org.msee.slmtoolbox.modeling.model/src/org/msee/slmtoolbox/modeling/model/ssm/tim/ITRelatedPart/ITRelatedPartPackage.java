/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartFactory
 * @model kind="package"
 * @generated
 */
public interface ITRelatedPartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ITRelatedPart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/ITRelatedPart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ITRelatedPartPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl <em>Tim Enterprise Application Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimEnterpriseApplicationResource()
	 * @generated
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__ID = CommonConceptsPackage.TIM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__NAME = CommonConceptsPackage.TIM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTION = CommonConceptsPackage.TIM_RESOURCE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__TYPE = CommonConceptsPackage.TIM_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__PROCESSES = CommonConceptsPackage.TIM_RESOURCE__PROCESSES;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__MODEL = CommonConceptsPackage.TIM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__ORGANIZATION_UNIT = CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__SERVICES = CommonConceptsPackage.TIM_RESOURCE__SERVICES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tim Enterprise Application Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ENTERPRISE_APPLICATION_RESOURCE_FEATURE_COUNT = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl <em>Tim Information Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationSet()
	 * @generated
	 */
	int TIM_INFORMATION_SET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entreprise Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__MODEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__ENTITIES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET__RELATIONSHIPS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tim Information Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_SET_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl <em>Tim Information Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationEntity()
	 * @generated
	 */
	int TIM_INFORMATION_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__OUT_RELATIONS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__IN_RELATIONS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__ATTRIBUTES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY__INFORMATION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tim Information Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ENTITY_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl <em>Tim Information Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationRelationship()
	 * @generated
	 */
	int TIM_INFORMATION_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__TYPE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP__INFORMATION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tim Information Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_RELATIONSHIP_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl <em>Tim Information Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationAttribute()
	 * @generated
	 */
	int TIM_INFORMATION_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ATTRIBUTE__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ATTRIBUTE__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ATTRIBUTE__TYPE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tim Information Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_INFORMATION_ATTRIBUTE_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource <em>Tim Enterprise Application Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Enterprise Application Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource
	 * @generated
	 */
	EClass getTimEnterpriseApplicationResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getDescription()
	 * @see #getTimEnterpriseApplicationResource()
	 * @generated
	 */
	EAttribute getTimEnterpriseApplicationResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functionality</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getFunctionality()
	 * @see #getTimEnterpriseApplicationResource()
	 * @generated
	 */
	EAttribute getTimEnterpriseApplicationResource_Functionality();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristics</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getCharacteristics()
	 * @see #getTimEnterpriseApplicationResource()
	 * @generated
	 */
	EAttribute getTimEnterpriseApplicationResource_Characteristics();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getInformations <em>Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource#getInformations()
	 * @see #getTimEnterpriseApplicationResource()
	 * @generated
	 */
	EReference getTimEnterpriseApplicationResource_Informations();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet <em>Tim Information Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Information Set</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet
	 * @generated
	 */
	EClass getTimInformationSet();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getId()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EAttribute getTimInformationSet_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getName()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EAttribute getTimInformationSet_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntrepriseApplications <em>Entreprise Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entreprise Applications</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntrepriseApplications()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EReference getTimInformationSet_EntrepriseApplications();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getModel()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EReference getTimInformationSet_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntities()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EReference getTimInformationSet_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getRelationships()
	 * @see #getTimInformationSet()
	 * @generated
	 */
	EReference getTimInformationSet_Relationships();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity <em>Tim Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Information Entity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity
	 * @generated
	 */
	EClass getTimInformationEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getId()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EAttribute getTimInformationEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getName()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EAttribute getTimInformationEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getOutRelations <em>Out Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Relations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getOutRelations()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EReference getTimInformationEntity_OutRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInRelations <em>In Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Relations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInRelations()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EReference getTimInformationEntity_InRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getAttributes()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EReference getTimInformationEntity_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Information</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInformation()
	 * @see #getTimInformationEntity()
	 * @generated
	 */
	EReference getTimInformationEntity_Information();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship <em>Tim Information Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Information Relationship</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship
	 * @generated
	 */
	EClass getTimInformationRelationship();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getId()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EAttribute getTimInformationRelationship_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getName()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EAttribute getTimInformationRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getType()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EAttribute getTimInformationRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EReference getTimInformationRelationship_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EReference getTimInformationRelationship_TargetEntity();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Information</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getInformation()
	 * @see #getTimInformationRelationship()
	 * @generated
	 */
	EReference getTimInformationRelationship_Information();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute <em>Tim Information Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Information Attribute</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute
	 * @generated
	 */
	EClass getTimInformationAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getId()
	 * @see #getTimInformationAttribute()
	 * @generated
	 */
	EAttribute getTimInformationAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getName()
	 * @see #getTimInformationAttribute()
	 * @generated
	 */
	EAttribute getTimInformationAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getType()
	 * @see #getTimInformationAttribute()
	 * @generated
	 */
	EAttribute getTimInformationAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity <em>Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Information Entity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity()
	 * @see #getTimInformationAttribute()
	 * @generated
	 */
	EReference getTimInformationAttribute_InformationEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ITRelatedPartFactory getITRelatedPartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl <em>Tim Enterprise Application Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimEnterpriseApplicationResource()
		 * @generated
		 */
		EClass TIM_ENTERPRISE_APPLICATION_RESOURCE = eINSTANCE.getTimEnterpriseApplicationResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION = eINSTANCE.getTimEnterpriseApplicationResource_Description();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY = eINSTANCE.getTimEnterpriseApplicationResource_Functionality();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS = eINSTANCE.getTimEnterpriseApplicationResource_Characteristics();

		/**
		 * The meta object literal for the '<em><b>Informations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS = eINSTANCE.getTimEnterpriseApplicationResource_Informations();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl <em>Tim Information Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationSet()
		 * @generated
		 */
		EClass TIM_INFORMATION_SET = eINSTANCE.getTimInformationSet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_SET__ID = eINSTANCE.getTimInformationSet_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_SET__NAME = eINSTANCE.getTimInformationSet_Name();

		/**
		 * The meta object literal for the '<em><b>Entreprise Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS = eINSTANCE.getTimInformationSet_EntrepriseApplications();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_SET__MODEL = eINSTANCE.getTimInformationSet_Model();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_SET__ENTITIES = eINSTANCE.getTimInformationSet_Entities();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_SET__RELATIONSHIPS = eINSTANCE.getTimInformationSet_Relationships();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl <em>Tim Information Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationEntity()
		 * @generated
		 */
		EClass TIM_INFORMATION_ENTITY = eINSTANCE.getTimInformationEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_ENTITY__ID = eINSTANCE.getTimInformationEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_ENTITY__NAME = eINSTANCE.getTimInformationEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Out Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_ENTITY__OUT_RELATIONS = eINSTANCE.getTimInformationEntity_OutRelations();

		/**
		 * The meta object literal for the '<em><b>In Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_ENTITY__IN_RELATIONS = eINSTANCE.getTimInformationEntity_InRelations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_ENTITY__ATTRIBUTES = eINSTANCE.getTimInformationEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_ENTITY__INFORMATION = eINSTANCE.getTimInformationEntity_Information();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl <em>Tim Information Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationRelationship()
		 * @generated
		 */
		EClass TIM_INFORMATION_RELATIONSHIP = eINSTANCE.getTimInformationRelationship();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_RELATIONSHIP__ID = eINSTANCE.getTimInformationRelationship_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_RELATIONSHIP__NAME = eINSTANCE.getTimInformationRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_RELATIONSHIP__TYPE = eINSTANCE.getTimInformationRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY = eINSTANCE.getTimInformationRelationship_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY = eINSTANCE.getTimInformationRelationship_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_RELATIONSHIP__INFORMATION = eINSTANCE.getTimInformationRelationship_Information();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl <em>Tim Information Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartPackageImpl#getTimInformationAttribute()
		 * @generated
		 */
		EClass TIM_INFORMATION_ATTRIBUTE = eINSTANCE.getTimInformationAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_ATTRIBUTE__ID = eINSTANCE.getTimInformationAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_ATTRIBUTE__NAME = eINSTANCE.getTimInformationAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_INFORMATION_ATTRIBUTE__TYPE = eINSTANCE.getTimInformationAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Information Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY = eINSTANCE.getTimInformationAttribute_InformationEntity();

	}

} //ITRelatedPartPackage
