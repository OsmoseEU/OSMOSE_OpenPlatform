/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonConceptsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CommonConcepts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/CommonConcepts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonConceptsPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl <em>Tim Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimService()
	 * @generated
	 */
	int TIM_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__DESCRIPTION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__OBJECTIVE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__CONSTRAINT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__ACCESS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__CONSUMPTION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Automation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__AUTOMATION_LEVEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__DOMAIN = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__NATURE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sub Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__SUB_SERVICES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Main Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__MAIN_SERVICE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__PROCESSES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__RESOURCES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE__MODEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Tim Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_SERVICE_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl <em>Tim Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimProcess()
	 * @generated
	 */
	int TIM_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__OBJECTIVE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__TRIGGER = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__RESULT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__CONSTRAINT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__WORK_FLOW = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subprocesses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__SUBPROCESSES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Main Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__MAIN_PROCESS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__SERVICES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__RESOURCES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Responsible Organization Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__MODEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS__ORGANIZATIONS = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Tim Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PROCESS_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl <em>Tim Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimResource()
	 * @generated
	 */
	int TIM_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__ID = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__NAME = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__FUNCTION = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__TYPE = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__PROCESSES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__MODEL = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__ORGANIZATION_UNIT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE__SERVICES = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tim Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_RESOURCE_FEATURE_COUNT = TimPackage.ITIM_NAMED_ELEMENT_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService <em>Tim Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService
	 * @generated
	 */
	EClass getTimService();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getId()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getName()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDomain()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDescription()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConstraint()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getNature()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Nature();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getSubServices <em>Sub Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Services</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getSubServices()
	 * @see #getTimService()
	 * @generated
	 */
	EReference getTimService_SubServices();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService <em>Main Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService()
	 * @see #getTimService()
	 * @generated
	 */
	EReference getTimService_MainService();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getProcesses()
	 * @see #getTimService()
	 * @generated
	 */
	EReference getTimService_Processes();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getResources()
	 * @see #getTimService()
	 * @generated
	 */
	EReference getTimService_Resources();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel()
	 * @see #getTimService()
	 * @generated
	 */
	EReference getTimService_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAutomationLevel <em>Automation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automation Level</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAutomationLevel()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_AutomationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAccess()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConsumption <em>Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConsumption()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Consumption();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getObjective()
	 * @see #getTimService()
	 * @generated
	 */
	EAttribute getTimService_Objective();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess <em>Tim Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess
	 * @generated
	 */
	EClass getTimProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getId()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getName()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getObjective()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getTrigger()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResult()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getConstraint()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getWorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getWorkFlow()
	 * @see #getTimProcess()
	 * @generated
	 */
	EAttribute getTimProcess_WorkFlow();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getSubprocesses <em>Subprocesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subprocesses</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getSubprocesses()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_Subprocesses();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess <em>Main Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_MainProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getServices()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_Services();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResources()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_Resources();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit <em>Responsible Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Organization Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_ResponsibleOrganizationUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getOrganizations()
	 * @see #getTimProcess()
	 * @generated
	 */
	EReference getTimProcess_Organizations();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource <em>Tim Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource
	 * @generated
	 */
	EClass getTimResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getId()
	 * @see #getTimResource()
	 * @generated
	 */
	EAttribute getTimResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getName()
	 * @see #getTimResource()
	 * @generated
	 */
	EAttribute getTimResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getFunction()
	 * @see #getTimResource()
	 * @generated
	 */
	EAttribute getTimResource_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getType()
	 * @see #getTimResource()
	 * @generated
	 */
	EAttribute getTimResource_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getProcesses()
	 * @see #getTimResource()
	 * @generated
	 */
	EReference getTimResource_Processes();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getModel()
	 * @see #getTimResource()
	 * @generated
	 */
	EReference getTimResource_Model();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getOrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getOrganizationUnit()
	 * @see #getTimResource()
	 * @generated
	 */
	EReference getTimResource_OrganizationUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getServices()
	 * @see #getTimResource()
	 * @generated
	 */
	EReference getTimResource_Services();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonConceptsFactory getCommonConceptsFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl <em>Tim Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimService()
		 * @generated
		 */
		EClass TIM_SERVICE = eINSTANCE.getTimService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__ID = eINSTANCE.getTimService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__NAME = eINSTANCE.getTimService_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__DOMAIN = eINSTANCE.getTimService_Domain();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__DESCRIPTION = eINSTANCE.getTimService_Description();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__CONSTRAINT = eINSTANCE.getTimService_Constraint();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__NATURE = eINSTANCE.getTimService_Nature();

		/**
		 * The meta object literal for the '<em><b>Sub Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_SERVICE__SUB_SERVICES = eINSTANCE.getTimService_SubServices();

		/**
		 * The meta object literal for the '<em><b>Main Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_SERVICE__MAIN_SERVICE = eINSTANCE.getTimService_MainService();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_SERVICE__PROCESSES = eINSTANCE.getTimService_Processes();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_SERVICE__RESOURCES = eINSTANCE.getTimService_Resources();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_SERVICE__MODEL = eINSTANCE.getTimService_Model();

		/**
		 * The meta object literal for the '<em><b>Automation Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__AUTOMATION_LEVEL = eINSTANCE.getTimService_AutomationLevel();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__ACCESS = eINSTANCE.getTimService_Access();

		/**
		 * The meta object literal for the '<em><b>Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__CONSUMPTION = eINSTANCE.getTimService_Consumption();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_SERVICE__OBJECTIVE = eINSTANCE.getTimService_Objective();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl <em>Tim Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimProcess()
		 * @generated
		 */
		EClass TIM_PROCESS = eINSTANCE.getTimProcess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__ID = eINSTANCE.getTimProcess_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__NAME = eINSTANCE.getTimProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__OBJECTIVE = eINSTANCE.getTimProcess_Objective();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__TRIGGER = eINSTANCE.getTimProcess_Trigger();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__RESULT = eINSTANCE.getTimProcess_Result();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__CONSTRAINT = eINSTANCE.getTimProcess_Constraint();

		/**
		 * The meta object literal for the '<em><b>Work Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PROCESS__WORK_FLOW = eINSTANCE.getTimProcess_WorkFlow();

		/**
		 * The meta object literal for the '<em><b>Subprocesses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__SUBPROCESSES = eINSTANCE.getTimProcess_Subprocesses();

		/**
		 * The meta object literal for the '<em><b>Main Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__MAIN_PROCESS = eINSTANCE.getTimProcess_MainProcess();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__SERVICES = eINSTANCE.getTimProcess_Services();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__RESOURCES = eINSTANCE.getTimProcess_Resources();

		/**
		 * The meta object literal for the '<em><b>Responsible Organization Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT = eINSTANCE.getTimProcess_ResponsibleOrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__MODEL = eINSTANCE.getTimProcess_Model();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_PROCESS__ORGANIZATIONS = eINSTANCE.getTimProcess_Organizations();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl <em>Tim Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsPackageImpl#getTimResource()
		 * @generated
		 */
		EClass TIM_RESOURCE = eINSTANCE.getTimResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_RESOURCE__ID = eINSTANCE.getTimResource_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_RESOURCE__NAME = eINSTANCE.getTimResource_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_RESOURCE__FUNCTION = eINSTANCE.getTimResource_Function();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_RESOURCE__TYPE = eINSTANCE.getTimResource_Type();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_RESOURCE__PROCESSES = eINSTANCE.getTimResource_Processes();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_RESOURCE__MODEL = eINSTANCE.getTimResource_Model();

		/**
		 * The meta object literal for the '<em><b>Organization Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_RESOURCE__ORGANIZATION_UNIT = eINSTANCE.getTimResource_OrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_RESOURCE__SERVICES = eINSTANCE.getTimResource_Services();

	}

} //CommonConceptsPackage
