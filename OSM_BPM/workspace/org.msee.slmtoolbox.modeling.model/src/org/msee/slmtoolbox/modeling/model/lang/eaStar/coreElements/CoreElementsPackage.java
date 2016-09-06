/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory
 * @model kind="package"
 * @generated
 */
public interface CoreElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coreElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/eaStar.ecore/coreElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.eaStar.root.coreElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreElementsPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl <em>Ea Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaFlow()
	 * @generated
	 */
	int EA_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__ID = GeneralElementsPackage.EA_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__NAME = GeneralElementsPackage.EA_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__CODE = GeneralElementsPackage.EA_FLOW_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__DESCRIPTION = GeneralElementsPackage.EA_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__PROCESS = GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS;

	/**
	 * The feature id for the '<em><b>Is Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__IS_TRIGGER = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__TRIGGER_INFO = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__SOURCE = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW__TARGET = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ea Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_FEATURE_COUNT = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl <em>Ea Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaFlowNode()
	 * @generated
	 */
	int EA_FLOW_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__ID = GeneralElementsPackage.EA_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__NAME = GeneralElementsPackage.EA_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__CODE = GeneralElementsPackage.EA_FLOW_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__DESCRIPTION = GeneralElementsPackage.EA_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__PROCESS = GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__ORGANIZATION = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__IN_FLOWS = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE__OUT_FLOWS = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ea Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_NODE_FEATURE_COUNT = GeneralElementsPackage.EA_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaLogicalOperatorImpl <em>Ea Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaLogicalOperatorImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaLogicalOperator()
	 * @generated
	 */
	int EA_LOGICAL_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__ID = EA_FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__NAME = EA_FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__CODE = EA_FLOW_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__DESCRIPTION = EA_FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__PROCESS = EA_FLOW_NODE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__ORGANIZATION = EA_FLOW_NODE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__IN_FLOWS = EA_FLOW_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR__OUT_FLOWS = EA_FLOW_NODE__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_LOGICAL_OPERATOR_FEATURE_COUNT = EA_FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConnectorImpl <em>Ea Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConnectorImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConnector()
	 * @generated
	 */
	int EA_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__ID = EA_FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__NAME = EA_FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CODE = EA_FLOW_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__DESCRIPTION = EA_FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__PROCESS = EA_FLOW_NODE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__ORGANIZATION = EA_FLOW_NODE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__IN_FLOWS = EA_FLOW_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__OUT_FLOWS = EA_FLOW_NODE__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_FEATURE_COUNT = EA_FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl <em>Ea Extended Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaExtendedActivity()
	 * @generated
	 */
	int EA_EXTENDED_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__ID = EA_FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__NAME = EA_FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__CODE = EA_FLOW_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__DESCRIPTION = EA_FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__PROCESS = EA_FLOW_NODE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__ORGANIZATION = EA_FLOW_NODE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__IN_FLOWS = EA_FLOW_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__OUT_FLOWS = EA_FLOW_NODE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__MISSION = EA_FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES = EA_FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__MIN_COST = EA_FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__MAX_COST = EA_FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__AVERAGE_COST = EA_FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY = EA_FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY = EA_FLOW_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Average Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY = EA_FLOW_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Starting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__IS_STARTING = EA_FLOW_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Ending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__IS_ENDING = EA_FLOW_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE = EA_FLOW_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Osmose World</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY__OSMOSE_WORLD = EA_FLOW_NODE_FEATURE_COUNT + 11;
	
	/**
	 * The number of structural features of the '<em>Ea Extended Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTENDED_ACTIVITY_FEATURE_COUNT = EA_FLOW_NODE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl <em>Ea Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaResource()
	 * @generated
	 */
	int EA_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__ID = EA_FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__NAME = EA_FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__CODE = EA_FLOW_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__DESCRIPTION = EA_FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__PROCESS = EA_FLOW_NODE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__ORGANIZATION = EA_FLOW_NODE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__IN_FLOWS = EA_FLOW_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__OUT_FLOWS = EA_FLOW_NODE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Unitary Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__UNITARY_COST = EA_FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__LOCATION = EA_FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE__CAPABILITIES = EA_FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ea Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_RESOURCE_FEATURE_COUNT = EA_FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaITResourceImpl <em>Ea IT Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaITResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaITResource()
	 * @generated
	 */
	int EA_IT_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__ID = EA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__NAME = EA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__CODE = EA_RESOURCE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__DESCRIPTION = EA_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__PROCESS = EA_RESOURCE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__ORGANIZATION = EA_RESOURCE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__IN_FLOWS = EA_RESOURCE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__OUT_FLOWS = EA_RESOURCE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Unitary Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__UNITARY_COST = EA_RESOURCE__UNITARY_COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__LOCATION = EA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE__CAPABILITIES = EA_RESOURCE__CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Ea IT Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_IT_RESOURCE_FEATURE_COUNT = EA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaHumanResourceImpl <em>Ea Human Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaHumanResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaHumanResource()
	 * @generated
	 */
	int EA_HUMAN_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__ID = EA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__NAME = EA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__CODE = EA_RESOURCE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__DESCRIPTION = EA_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__PROCESS = EA_RESOURCE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__ORGANIZATION = EA_RESOURCE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__IN_FLOWS = EA_RESOURCE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__OUT_FLOWS = EA_RESOURCE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Unitary Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__UNITARY_COST = EA_RESOURCE__UNITARY_COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__LOCATION = EA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE__CAPABILITIES = EA_RESOURCE__CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Ea Human Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_HUMAN_RESOURCE_FEATURE_COUNT = EA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaMaterialResourceImpl <em>Ea Material Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaMaterialResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaMaterialResource()
	 * @generated
	 */
	int EA_MATERIAL_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__ID = EA_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__NAME = EA_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__CODE = EA_RESOURCE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__DESCRIPTION = EA_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__PROCESS = EA_RESOURCE__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__ORGANIZATION = EA_RESOURCE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__IN_FLOWS = EA_RESOURCE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__OUT_FLOWS = EA_RESOURCE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Unitary Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__UNITARY_COST = EA_RESOURCE__UNITARY_COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__LOCATION = EA_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE__CAPABILITIES = EA_RESOURCE__CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Ea Material Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MATERIAL_RESOURCE_FEATURE_COUNT = EA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrImpl <em>Ea Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOr()
	 * @generated
	 */
	int EA_OR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__ID = EA_LOGICAL_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__NAME = EA_LOGICAL_OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__CODE = EA_LOGICAL_OPERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__DESCRIPTION = EA_LOGICAL_OPERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__PROCESS = EA_LOGICAL_OPERATOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__ORGANIZATION = EA_LOGICAL_OPERATOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__IN_FLOWS = EA_LOGICAL_OPERATOR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR__OUT_FLOWS = EA_LOGICAL_OPERATOR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OR_FEATURE_COUNT = EA_LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAndImpl <em>Ea And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAndImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaAnd()
	 * @generated
	 */
	int EA_AND = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__ID = EA_LOGICAL_OPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__NAME = EA_LOGICAL_OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__CODE = EA_LOGICAL_OPERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__DESCRIPTION = EA_LOGICAL_OPERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__PROCESS = EA_LOGICAL_OPERATOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__ORGANIZATION = EA_LOGICAL_OPERATOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__IN_FLOWS = EA_LOGICAL_OPERATOR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND__OUT_FLOWS = EA_LOGICAL_OPERATOR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_AND_FEATURE_COUNT = EA_LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingAndImpl <em>Ea Diverging And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingAndImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaDivergingAnd()
	 * @generated
	 */
	int EA_DIVERGING_AND = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__ID = EA_AND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__NAME = EA_AND__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__CODE = EA_AND__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__DESCRIPTION = EA_AND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__PROCESS = EA_AND__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__ORGANIZATION = EA_AND__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__IN_FLOWS = EA_AND__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND__OUT_FLOWS = EA_AND__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Diverging And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_AND_FEATURE_COUNT = EA_AND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingOrImpl <em>Ea Diverging Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingOrImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaDivergingOr()
	 * @generated
	 */
	int EA_DIVERGING_OR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__ID = EA_OR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__NAME = EA_OR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__CODE = EA_OR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__DESCRIPTION = EA_OR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__PROCESS = EA_OR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__ORGANIZATION = EA_OR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__IN_FLOWS = EA_OR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR__OUT_FLOWS = EA_OR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Diverging Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIVERGING_OR_FEATURE_COUNT = EA_OR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingAndImpl <em>Ea Converging And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingAndImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConvergingAnd()
	 * @generated
	 */
	int EA_CONVERGING_AND = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__ID = EA_AND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__NAME = EA_AND__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__CODE = EA_AND__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__DESCRIPTION = EA_AND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__PROCESS = EA_AND__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__ORGANIZATION = EA_AND__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__IN_FLOWS = EA_AND__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND__OUT_FLOWS = EA_AND__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Converging And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_AND_FEATURE_COUNT = EA_AND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingOrImpl <em>Ea Converging Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingOrImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConvergingOr()
	 * @generated
	 */
	int EA_CONVERGING_OR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__ID = EA_OR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__NAME = EA_OR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__CODE = EA_OR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__DESCRIPTION = EA_OR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__PROCESS = EA_OR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__ORGANIZATION = EA_OR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__IN_FLOWS = EA_OR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR__OUT_FLOWS = EA_OR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Converging Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONVERGING_OR_FEATURE_COUNT = EA_OR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaInternalConnectorImpl <em>Ea Internal Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaInternalConnectorImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaInternalConnector()
	 * @generated
	 */
	int EA_INTERNAL_CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__ID = EA_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__NAME = EA_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__CODE = EA_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__DESCRIPTION = EA_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__PROCESS = EA_CONNECTOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__ORGANIZATION = EA_CONNECTOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__IN_FLOWS = EA_CONNECTOR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR__OUT_FLOWS = EA_CONNECTOR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea Internal Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTERNAL_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExternalConnectorImpl <em>Ea External Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExternalConnectorImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaExternalConnector()
	 * @generated
	 */
	int EA_EXTERNAL_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__ID = EA_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__NAME = EA_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__CODE = EA_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__DESCRIPTION = EA_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__PROCESS = EA_CONNECTOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__ORGANIZATION = EA_CONNECTOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__IN_FLOWS = EA_CONNECTOR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR__OUT_FLOWS = EA_CONNECTOR__OUT_FLOWS;

	/**
	 * The number of structural features of the '<em>Ea External Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXTERNAL_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaProcessConnectorImpl <em>Ea Process Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaProcessConnectorImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaProcessConnector()
	 * @generated
	 */
	int EA_PROCESS_CONNECTOR = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__ID = EA_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__NAME = EA_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__CODE = EA_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__DESCRIPTION = EA_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__PROCESS = EA_CONNECTOR__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__ORGANIZATION = EA_CONNECTOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__IN_FLOWS = EA_CONNECTOR__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__OUT_FLOWS = EA_CONNECTOR__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR__PROCESS_REF = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ea Process Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOutputInputFlowImpl <em>Ea Output Input Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOutputInputFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOutputInputFlow()
	 * @generated
	 */
	int EA_OUTPUT_INPUT_FLOW = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__ID = EA_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__NAME = EA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__CODE = EA_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__DESCRIPTION = EA_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__PROCESS = EA_FLOW__PROCESS;

	/**
	 * The feature id for the '<em><b>Is Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__IS_TRIGGER = EA_FLOW__IS_TRIGGER;

	/**
	 * The feature id for the '<em><b>Trigger Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__TRIGGER_INFO = EA_FLOW__TRIGGER_INFO;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__SOURCE = EA_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW__TARGET = EA_FLOW__TARGET;

	/**
	 * The number of structural features of the '<em>Ea Output Input Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OUTPUT_INPUT_FLOW_FEATURE_COUNT = EA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl <em>Ea Support Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaSupportFlow()
	 * @generated
	 */
	int EA_SUPPORT_FLOW = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__ID = EA_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__NAME = EA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__CODE = EA_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__DESCRIPTION = EA_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__PROCESS = EA_FLOW__PROCESS;

	/**
	 * The feature id for the '<em><b>Is Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__IS_TRIGGER = EA_FLOW__IS_TRIGGER;

	/**
	 * The feature id for the '<em><b>Trigger Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__TRIGGER_INFO = EA_FLOW__TRIGGER_INFO;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__SOURCE = EA_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__TARGET = EA_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__RESOURCE_ROLE = EA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW__RESPONSIBILITY = EA_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ea Support Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_SUPPORT_FLOW_FEATURE_COUNT = EA_FLOW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaControlFlowImpl <em>Ea Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaControlFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaControlFlow()
	 * @generated
	 */
	int EA_CONTROL_FLOW = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__ID = EA_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__NAME = EA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__CODE = EA_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__DESCRIPTION = EA_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__PROCESS = EA_FLOW__PROCESS;

	/**
	 * The feature id for the '<em><b>Is Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__IS_TRIGGER = EA_FLOW__IS_TRIGGER;

	/**
	 * The feature id for the '<em><b>Trigger Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__TRIGGER_INFO = EA_FLOW__TRIGGER_INFO;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__SOURCE = EA_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW__TARGET = EA_FLOW__TARGET;

	/**
	 * The number of structural features of the '<em>Ea Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONTROL_FLOW_FEATURE_COUNT = EA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl <em>Ea Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOrganization()
	 * @generated
	 */
	int EA_ORGANIZATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__ID = GeneralElementsPackage.EA_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__NAME = GeneralElementsPackage.EA_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__CODE = GeneralElementsPackage.EA_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__DESCRIPTION = GeneralElementsPackage.EA_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Flow Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__FLOW_NODE = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION__MODEL = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ea Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ORGANIZATION_FEATURE_COUNT = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAtomicExtendedActivityImpl <em>Ea Atomic Extended Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAtomicExtendedActivityImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaAtomicExtendedActivity()
	 * @generated
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__ID = EA_EXTENDED_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__NAME = EA_EXTENDED_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__CODE = EA_EXTENDED_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__DESCRIPTION = EA_EXTENDED_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__PROCESS = EA_EXTENDED_ACTIVITY__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__ORGANIZATION = EA_EXTENDED_ACTIVITY__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__IN_FLOWS = EA_EXTENDED_ACTIVITY__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__OUT_FLOWS = EA_EXTENDED_ACTIVITY__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__MISSION = EA_EXTENDED_ACTIVITY__MISSION;

	/**
	 * The feature id for the '<em><b>Functional Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__FUNCTIONAL_RULES = EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__MIN_COST = EA_EXTENDED_ACTIVITY__MIN_COST;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__MAX_COST = EA_EXTENDED_ACTIVITY__MAX_COST;

	/**
	 * The feature id for the '<em><b>Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__AVERAGE_COST = EA_EXTENDED_ACTIVITY__AVERAGE_COST;

	/**
	 * The feature id for the '<em><b>Min Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__MIN_TIME_DELAY = EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Max Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__MAX_TIME_DELAY = EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Average Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY = EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Is Starting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__IS_STARTING = EA_EXTENDED_ACTIVITY__IS_STARTING;

	/**
	 * The feature id for the '<em><b>Is Ending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__IS_ENDING = EA_EXTENDED_ACTIVITY__IS_ENDING;

	/**
	 * The feature id for the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__DECOMPOSITION_CODE = EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE;

	/**
	 * The feature id for the '<em><b>Osmose World</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY__OSMOSE_WORLD = EA_EXTENDED_ACTIVITY__OSMOSE_WORLD;
	
	/**
	 * The number of structural features of the '<em>Ea Atomic Extended Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATOMIC_EXTENDED_ACTIVITY_FEATURE_COUNT = EA_EXTENDED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaStructuralExtendedActivityImpl <em>Ea Structural Extended Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaStructuralExtendedActivityImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaStructuralExtendedActivity()
	 * @generated
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__ID = EA_EXTENDED_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__NAME = EA_EXTENDED_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__CODE = EA_EXTENDED_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__DESCRIPTION = EA_EXTENDED_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__PROCESS = EA_EXTENDED_ACTIVITY__PROCESS;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__ORGANIZATION = EA_EXTENDED_ACTIVITY__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__IN_FLOWS = EA_EXTENDED_ACTIVITY__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__OUT_FLOWS = EA_EXTENDED_ACTIVITY__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__MISSION = EA_EXTENDED_ACTIVITY__MISSION;

	/**
	 * The feature id for the '<em><b>Functional Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__FUNCTIONAL_RULES = EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__MIN_COST = EA_EXTENDED_ACTIVITY__MIN_COST;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__MAX_COST = EA_EXTENDED_ACTIVITY__MAX_COST;

	/**
	 * The feature id for the '<em><b>Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__AVERAGE_COST = EA_EXTENDED_ACTIVITY__AVERAGE_COST;

	/**
	 * The feature id for the '<em><b>Min Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__MIN_TIME_DELAY = EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Max Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__MAX_TIME_DELAY = EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Average Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY = EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY;

	/**
	 * The feature id for the '<em><b>Is Starting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_STARTING = EA_EXTENDED_ACTIVITY__IS_STARTING;

	/**
	 * The feature id for the '<em><b>Is Ending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_ENDING = EA_EXTENDED_ACTIVITY__IS_ENDING;

	/**
	 * The feature id for the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__DECOMPOSITION_CODE = EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE;
	
	/**
	 * The feature id for the '<em><b>Osmose World</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__OSMOSE_WORLD = EA_EXTENDED_ACTIVITY__OSMOSE_WORLD;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A = EA_EXTENDED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ea Structural Extended Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRUCTURAL_EXTENDED_ACTIVITY_FEATURE_COUNT = EA_EXTENDED_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole <em>Ea Resource Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaResourceRole()
	 * @generated
	 */
	int EA_RESOURCE_ROLE = 24;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow <em>Ea Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow
	 * @generated
	 */
	EClass getEaFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#isIsTrigger <em>Is Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Trigger</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#isIsTrigger()
	 * @see #getEaFlow()
	 * @generated
	 */
	EAttribute getEaFlow_IsTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTriggerInfo <em>Trigger Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Info</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTriggerInfo()
	 * @see #getEaFlow()
	 * @generated
	 */
	EAttribute getEaFlow_TriggerInfo();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource()
	 * @see #getEaFlow()
	 * @generated
	 */
	EReference getEaFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget()
	 * @see #getEaFlow()
	 * @generated
	 */
	EReference getEaFlow_Target();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode <em>Ea Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Flow Node</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode
	 * @generated
	 */
	EClass getEaFlowNode();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization()
	 * @see #getEaFlowNode()
	 * @generated
	 */
	EReference getEaFlowNode_Organization();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getInFlows <em>In Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Flows</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getInFlows()
	 * @see #getEaFlowNode()
	 * @generated
	 */
	EReference getEaFlowNode_InFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOutFlows <em>Out Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Flows</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOutFlows()
	 * @see #getEaFlowNode()
	 * @generated
	 */
	EReference getEaFlowNode_OutFlows();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator <em>Ea Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Logical Operator</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator
	 * @generated
	 */
	EClass getEaLogicalOperator();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector <em>Ea Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Connector</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector
	 * @generated
	 */
	EClass getEaConnector();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity <em>Ea Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Extended Activity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity
	 * @generated
	 */
	EClass getEaExtendedActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mission</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMission()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_Mission();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getFunctionalRules <em>Functional Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Rules</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getFunctionalRules()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_FunctionalRules();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinCost <em>Min Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cost</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinCost()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_MinCost();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxCost <em>Max Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cost</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxCost()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_MaxCost();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageCost <em>Average Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cost</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageCost()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_AverageCost();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinTimeDelay <em>Min Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time Delay</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinTimeDelay()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_MinTimeDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxTimeDelay <em>Max Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time Delay</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxTimeDelay()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_MaxTimeDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageTimeDelay <em>Average Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Time Delay</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageTimeDelay()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_AverageTimeDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsStarting <em>Is Starting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Starting</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsStarting()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_IsStarting();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsEnding <em>Is Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ending</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsEnding()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_IsEnding();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getDecompositionCode <em>Decomposition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition Code</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getDecompositionCode()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_DecompositionCode();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.coreElements.EaExtendedActivity#getOsmoseWorld <em>Osmose World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osmose World</em>'.
	 * @see eaStar.coreElements.EaExtendedActivity#getOsmoseWorld()
	 * @see #getEaExtendedActivity()
	 * @generated
	 */
	EAttribute getEaExtendedActivity_OsmoseWorld();
	
	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource <em>Ea Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource
	 * @generated
	 */
	EClass getEaResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getUnitaryCost <em>Unitary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unitary Cost</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getUnitaryCost()
	 * @see #getEaResource()
	 * @generated
	 */
	EAttribute getEaResource_UnitaryCost();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getLocation()
	 * @see #getEaResource()
	 * @generated
	 */
	EAttribute getEaResource_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabilities</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getCapabilities()
	 * @see #getEaResource()
	 * @generated
	 */
	EAttribute getEaResource_Capabilities();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource <em>Ea IT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea IT Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource
	 * @generated
	 */
	EClass getEaITResource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource <em>Ea Human Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Human Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource
	 * @generated
	 */
	EClass getEaHumanResource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource <em>Ea Material Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Material Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource
	 * @generated
	 */
	EClass getEaMaterialResource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr <em>Ea Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Or</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr
	 * @generated
	 */
	EClass getEaOr();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd <em>Ea And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea And</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd
	 * @generated
	 */
	EClass getEaAnd();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd <em>Ea Diverging And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Diverging And</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd
	 * @generated
	 */
	EClass getEaDivergingAnd();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr <em>Ea Diverging Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Diverging Or</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr
	 * @generated
	 */
	EClass getEaDivergingOr();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd <em>Ea Converging And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Converging And</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd
	 * @generated
	 */
	EClass getEaConvergingAnd();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr <em>Ea Converging Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Converging Or</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr
	 * @generated
	 */
	EClass getEaConvergingOr();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector <em>Ea Internal Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Internal Connector</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector
	 * @generated
	 */
	EClass getEaInternalConnector();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector <em>Ea External Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea External Connector</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector
	 * @generated
	 */
	EClass getEaExternalConnector();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector <em>Ea Process Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Process Connector</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector
	 * @generated
	 */
	EClass getEaProcessConnector();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Ref</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector#getProcessRef()
	 * @see #getEaProcessConnector()
	 * @generated
	 */
	EReference getEaProcessConnector_ProcessRef();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow <em>Ea Output Input Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Output Input Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow
	 * @generated
	 */
	EClass getEaOutputInputFlow();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow <em>Ea Support Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Support Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow
	 * @generated
	 */
	EClass getEaSupportFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Role</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResourceRole()
	 * @see #getEaSupportFlow()
	 * @generated
	 */
	EAttribute getEaSupportFlow_ResourceRole();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResponsibility()
	 * @see #getEaSupportFlow()
	 * @generated
	 */
	EAttribute getEaSupportFlow_Responsibility();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow <em>Ea Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Control Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow
	 * @generated
	 */
	EClass getEaControlFlow();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization <em>Ea Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization
	 * @generated
	 */
	EClass getEaOrganization();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getFlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow Node</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getFlowNode()
	 * @see #getEaOrganization()
	 * @generated
	 */
	EReference getEaOrganization_FlowNode();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel()
	 * @see #getEaOrganization()
	 * @generated
	 */
	EReference getEaOrganization_Model();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity <em>Ea Atomic Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Atomic Extended Activity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity
	 * @generated
	 */
	EClass getEaAtomicExtendedActivity();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity <em>Ea Structural Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Structural Extended Activity</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity
	 * @generated
	 */
	EClass getEaStructuralExtendedActivity();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is A</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity#getIsA()
	 * @see #getEaStructuralExtendedActivity()
	 * @generated
	 */
	EReference getEaStructuralExtendedActivity_IsA();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole <em>Ea Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ea Resource Role</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole
	 * @generated
	 */
	EEnum getEaResourceRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreElementsFactory getCoreElementsFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl <em>Ea Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaFlow()
		 * @generated
		 */
		EClass EA_FLOW = eINSTANCE.getEaFlow();

		/**
		 * The meta object literal for the '<em><b>Is Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_FLOW__IS_TRIGGER = eINSTANCE.getEaFlow_IsTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_FLOW__TRIGGER_INFO = eINSTANCE.getEaFlow_TriggerInfo();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW__SOURCE = eINSTANCE.getEaFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW__TARGET = eINSTANCE.getEaFlow_Target();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl <em>Ea Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaFlowNode()
		 * @generated
		 */
		EClass EA_FLOW_NODE = eINSTANCE.getEaFlowNode();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW_NODE__ORGANIZATION = eINSTANCE.getEaFlowNode_Organization();

		/**
		 * The meta object literal for the '<em><b>In Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW_NODE__IN_FLOWS = eINSTANCE.getEaFlowNode_InFlows();

		/**
		 * The meta object literal for the '<em><b>Out Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW_NODE__OUT_FLOWS = eINSTANCE.getEaFlowNode_OutFlows();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaLogicalOperatorImpl <em>Ea Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaLogicalOperatorImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaLogicalOperator()
		 * @generated
		 */
		EClass EA_LOGICAL_OPERATOR = eINSTANCE.getEaLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConnectorImpl <em>Ea Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConnectorImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConnector()
		 * @generated
		 */
		EClass EA_CONNECTOR = eINSTANCE.getEaConnector();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl <em>Ea Extended Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaExtendedActivity()
		 * @generated
		 */
		EClass EA_EXTENDED_ACTIVITY = eINSTANCE.getEaExtendedActivity();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__MISSION = eINSTANCE.getEaExtendedActivity_Mission();

		/**
		 * The meta object literal for the '<em><b>Functional Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES = eINSTANCE.getEaExtendedActivity_FunctionalRules();

		/**
		 * The meta object literal for the '<em><b>Min Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__MIN_COST = eINSTANCE.getEaExtendedActivity_MinCost();

		/**
		 * The meta object literal for the '<em><b>Max Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__MAX_COST = eINSTANCE.getEaExtendedActivity_MaxCost();

		/**
		 * The meta object literal for the '<em><b>Average Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__AVERAGE_COST = eINSTANCE.getEaExtendedActivity_AverageCost();

		/**
		 * The meta object literal for the '<em><b>Min Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY = eINSTANCE.getEaExtendedActivity_MinTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Max Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY = eINSTANCE.getEaExtendedActivity_MaxTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Average Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY = eINSTANCE.getEaExtendedActivity_AverageTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Is Starting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__IS_STARTING = eINSTANCE.getEaExtendedActivity_IsStarting();

		/**
		 * The meta object literal for the '<em><b>Is Ending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__IS_ENDING = eINSTANCE.getEaExtendedActivity_IsEnding();

		/**
		 * The meta object literal for the '<em><b>Decomposition Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE = eINSTANCE.getEaExtendedActivity_DecompositionCode();

		/**
		 * The meta object literal for the '<em><b>Osmose World</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_EXTENDED_ACTIVITY__OSMOSE_WORLD = eINSTANCE.getEaExtendedActivity_OsmoseWorld();
		
		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl <em>Ea Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaResource()
		 * @generated
		 */
		EClass EA_RESOURCE = eINSTANCE.getEaResource();

		/**
		 * The meta object literal for the '<em><b>Unitary Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_RESOURCE__UNITARY_COST = eINSTANCE.getEaResource_UnitaryCost();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_RESOURCE__LOCATION = eINSTANCE.getEaResource_Location();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_RESOURCE__CAPABILITIES = eINSTANCE.getEaResource_Capabilities();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaITResourceImpl <em>Ea IT Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaITResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaITResource()
		 * @generated
		 */
		EClass EA_IT_RESOURCE = eINSTANCE.getEaITResource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaHumanResourceImpl <em>Ea Human Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaHumanResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaHumanResource()
		 * @generated
		 */
		EClass EA_HUMAN_RESOURCE = eINSTANCE.getEaHumanResource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaMaterialResourceImpl <em>Ea Material Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaMaterialResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaMaterialResource()
		 * @generated
		 */
		EClass EA_MATERIAL_RESOURCE = eINSTANCE.getEaMaterialResource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrImpl <em>Ea Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOr()
		 * @generated
		 */
		EClass EA_OR = eINSTANCE.getEaOr();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAndImpl <em>Ea And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAndImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaAnd()
		 * @generated
		 */
		EClass EA_AND = eINSTANCE.getEaAnd();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingAndImpl <em>Ea Diverging And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingAndImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaDivergingAnd()
		 * @generated
		 */
		EClass EA_DIVERGING_AND = eINSTANCE.getEaDivergingAnd();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingOrImpl <em>Ea Diverging Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaDivergingOrImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaDivergingOr()
		 * @generated
		 */
		EClass EA_DIVERGING_OR = eINSTANCE.getEaDivergingOr();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingAndImpl <em>Ea Converging And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingAndImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConvergingAnd()
		 * @generated
		 */
		EClass EA_CONVERGING_AND = eINSTANCE.getEaConvergingAnd();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingOrImpl <em>Ea Converging Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaConvergingOrImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaConvergingOr()
		 * @generated
		 */
		EClass EA_CONVERGING_OR = eINSTANCE.getEaConvergingOr();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaInternalConnectorImpl <em>Ea Internal Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaInternalConnectorImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaInternalConnector()
		 * @generated
		 */
		EClass EA_INTERNAL_CONNECTOR = eINSTANCE.getEaInternalConnector();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExternalConnectorImpl <em>Ea External Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExternalConnectorImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaExternalConnector()
		 * @generated
		 */
		EClass EA_EXTERNAL_CONNECTOR = eINSTANCE.getEaExternalConnector();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaProcessConnectorImpl <em>Ea Process Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaProcessConnectorImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaProcessConnector()
		 * @generated
		 */
		EClass EA_PROCESS_CONNECTOR = eINSTANCE.getEaProcessConnector();

		/**
		 * The meta object literal for the '<em><b>Process Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PROCESS_CONNECTOR__PROCESS_REF = eINSTANCE.getEaProcessConnector_ProcessRef();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOutputInputFlowImpl <em>Ea Output Input Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOutputInputFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOutputInputFlow()
		 * @generated
		 */
		EClass EA_OUTPUT_INPUT_FLOW = eINSTANCE.getEaOutputInputFlow();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl <em>Ea Support Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaSupportFlow()
		 * @generated
		 */
		EClass EA_SUPPORT_FLOW = eINSTANCE.getEaSupportFlow();

		/**
		 * The meta object literal for the '<em><b>Resource Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_SUPPORT_FLOW__RESOURCE_ROLE = eINSTANCE.getEaSupportFlow_ResourceRole();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_SUPPORT_FLOW__RESPONSIBILITY = eINSTANCE.getEaSupportFlow_Responsibility();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaControlFlowImpl <em>Ea Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaControlFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaControlFlow()
		 * @generated
		 */
		EClass EA_CONTROL_FLOW = eINSTANCE.getEaControlFlow();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl <em>Ea Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaOrganization()
		 * @generated
		 */
		EClass EA_ORGANIZATION = eINSTANCE.getEaOrganization();

		/**
		 * The meta object literal for the '<em><b>Flow Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ORGANIZATION__FLOW_NODE = eINSTANCE.getEaOrganization_FlowNode();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ORGANIZATION__MODEL = eINSTANCE.getEaOrganization_Model();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAtomicExtendedActivityImpl <em>Ea Atomic Extended Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaAtomicExtendedActivityImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaAtomicExtendedActivity()
		 * @generated
		 */
		EClass EA_ATOMIC_EXTENDED_ACTIVITY = eINSTANCE.getEaAtomicExtendedActivity();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaStructuralExtendedActivityImpl <em>Ea Structural Extended Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaStructuralExtendedActivityImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaStructuralExtendedActivity()
		 * @generated
		 */
		EClass EA_STRUCTURAL_EXTENDED_ACTIVITY = eINSTANCE.getEaStructuralExtendedActivity();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A = eINSTANCE.getEaStructuralExtendedActivity_IsA();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole <em>Ea Resource Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl#getEaResourceRole()
		 * @generated
		 */
		EEnum EA_RESOURCE_ROLE = eINSTANCE.getEaResourceRole();

	}

} //CoreElementsPackage
