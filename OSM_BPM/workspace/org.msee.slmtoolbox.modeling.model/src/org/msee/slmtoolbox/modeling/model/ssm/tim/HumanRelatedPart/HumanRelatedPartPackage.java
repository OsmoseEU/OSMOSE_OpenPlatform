/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory
 * @model kind="package"
 * @generated
 */
public interface HumanRelatedPartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HumanRelatedPart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/HumanRelatedPart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HumanRelatedPartPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl <em>Tim Human Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimHumanResource()
	 * @generated
	 */
	int TIM_HUMAN_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__ID = CommonConceptsPackage.TIM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__NAME = CommonConceptsPackage.TIM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__FUNCTION = CommonConceptsPackage.TIM_RESOURCE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__TYPE = CommonConceptsPackage.TIM_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__PROCESSES = CommonConceptsPackage.TIM_RESOURCE__PROCESSES;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__MODEL = CommonConceptsPackage.TIM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__ORGANIZATION_UNIT = CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__SERVICES = CommonConceptsPackage.TIM_RESOURCE__SERVICES;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__CAPABILITY = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__CONSTRAINT = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__SKILLS = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__EDUCATION_LEVEL = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__QUANTITY = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Expected Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tim Human Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_HUMAN_RESOURCE_FEATURE_COUNT = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl <em>Tim Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimOrganization()
	 * @generated
	 */
	int TIM_ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__TYPE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__DESCRIPTION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__RESPONSIBILITY = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__AUTHORIZATION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organization Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__ORGANIZATION_UNITS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__MODEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION__PROCESSES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tim Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl <em>Tim Organization Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimOrganizationUnit()
	 * @generated
	 */
	int TIM_ORGANIZATION_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__FUNCTION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__RESPONSIBILITY = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__AUTHORIZATION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__ORGANIZATION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__RESOURCES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT__PROCESSES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tim Organization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_ORGANIZATION_UNIT_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource <em>Tim Human Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Human Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource
	 * @generated
	 */
	EClass getTimHumanResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getCapability()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_Capability();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getConstraint()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skills</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getSkills()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getEducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getEducationLevel()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_EducationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getQuantity()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getExpectedPerformance <em>Expected Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Performance</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource#getExpectedPerformance()
	 * @see #getTimHumanResource()
	 * @generated
	 */
	EAttribute getTimHumanResource_ExpectedPerformance();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization <em>Tim Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization
	 * @generated
	 */
	EClass getTimOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getId()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getName()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getType()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getDescription()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getResponsibility()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Responsibility();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getAuthorization()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EAttribute getTimOrganization_Authorization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getOrganizationUnits <em>Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization Units</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getOrganizationUnits()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EReference getTimOrganization_OrganizationUnits();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getModel()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EReference getTimOrganization_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getProcesses()
	 * @see #getTimOrganization()
	 * @generated
	 */
	EReference getTimOrganization_Processes();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit <em>Tim Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Organization Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit
	 * @generated
	 */
	EClass getTimOrganizationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getId()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EAttribute getTimOrganizationUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getName()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EAttribute getTimOrganizationUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getFunction()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EAttribute getTimOrganizationUnit_Function();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getOrganization()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EReference getTimOrganizationUnit_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResources()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EReference getTimOrganizationUnit_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getProcesses()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EReference getTimOrganizationUnit_Processes();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResponsibility()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EAttribute getTimOrganizationUnit_Responsibility();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getAuthorization()
	 * @see #getTimOrganizationUnit()
	 * @generated
	 */
	EAttribute getTimOrganizationUnit_Authorization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HumanRelatedPartFactory getHumanRelatedPartFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl <em>Tim Human Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimHumanResource()
		 * @generated
		 */
		EClass TIM_HUMAN_RESOURCE = eINSTANCE.getTimHumanResource();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__CAPABILITY = eINSTANCE.getTimHumanResource_Capability();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__CONSTRAINT = eINSTANCE.getTimHumanResource_Constraint();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__SKILLS = eINSTANCE.getTimHumanResource_Skills();

		/**
		 * The meta object literal for the '<em><b>Education Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__EDUCATION_LEVEL = eINSTANCE.getTimHumanResource_EducationLevel();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__QUANTITY = eINSTANCE.getTimHumanResource_Quantity();

		/**
		 * The meta object literal for the '<em><b>Expected Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE = eINSTANCE.getTimHumanResource_ExpectedPerformance();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl <em>Tim Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimOrganization()
		 * @generated
		 */
		EClass TIM_ORGANIZATION = eINSTANCE.getTimOrganization();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__ID = eINSTANCE.getTimOrganization_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__NAME = eINSTANCE.getTimOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__TYPE = eINSTANCE.getTimOrganization_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__DESCRIPTION = eINSTANCE.getTimOrganization_Description();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__RESPONSIBILITY = eINSTANCE.getTimOrganization_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION__AUTHORIZATION = eINSTANCE.getTimOrganization_Authorization();

		/**
		 * The meta object literal for the '<em><b>Organization Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION__ORGANIZATION_UNITS = eINSTANCE.getTimOrganization_OrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION__MODEL = eINSTANCE.getTimOrganization_Model();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION__PROCESSES = eINSTANCE.getTimOrganization_Processes();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl <em>Tim Organization Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartPackageImpl#getTimOrganizationUnit()
		 * @generated
		 */
		EClass TIM_ORGANIZATION_UNIT = eINSTANCE.getTimOrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION_UNIT__ID = eINSTANCE.getTimOrganizationUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION_UNIT__NAME = eINSTANCE.getTimOrganizationUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION_UNIT__FUNCTION = eINSTANCE.getTimOrganizationUnit_Function();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION_UNIT__ORGANIZATION = eINSTANCE.getTimOrganizationUnit_Organization();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION_UNIT__RESOURCES = eINSTANCE.getTimOrganizationUnit_Resources();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_ORGANIZATION_UNIT__PROCESSES = eINSTANCE.getTimOrganizationUnit_Processes();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION_UNIT__RESPONSIBILITY = eINSTANCE.getTimOrganizationUnit_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_ORGANIZATION_UNIT__AUTHORIZATION = eINSTANCE.getTimOrganizationUnit_Authorization();

	}

} //HumanRelatedPartPackage
