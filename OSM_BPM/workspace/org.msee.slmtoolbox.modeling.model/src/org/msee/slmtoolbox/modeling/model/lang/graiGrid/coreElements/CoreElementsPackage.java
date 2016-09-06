/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsFactory
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
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/graiGrid.ecore/2.0/coreElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreElementsPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl <em>Gg Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgFunction()
	 * @generated
	 */
	int GG_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__GRAI_GRID = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Centers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__DECISION_CENTERS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION__ORGANIZATION = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gg Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FUNCTION_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl <em>Gg Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgLevel()
	 * @generated
	 */
	int GG_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__NODES = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__HORIZON = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__PERIOD = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__PROCESSING_UNIT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL__GRAI_GRID = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gg Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_LEVEL_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl <em>Gg Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgFlow()
	 * @generated
	 */
	int GG_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__SOURCE = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__TARGET = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW__GRAI_GRID = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gg Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_FLOW_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl <em>Gg Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgNode()
	 * @generated
	 */
	int GG_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__LEVEL = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__OUT_FLOWS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__IN_FLOWS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE__GRAI_GRID = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gg Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_NODE_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl <em>Gg Decision Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgDecisionFrame()
	 * @generated
	 */
	int GG_DECISION_FRAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__ID = GG_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__NAME = GG_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__CODE = GG_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__DESCRIPTION = GG_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__SOURCE = GG_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__TARGET = GG_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__GRAI_GRID = GG_FLOW__GRAI_GRID;

	/**
	 * The feature id for the '<em><b>Decision Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__DECISION_VARIABLE = GG_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__OBJECTIVE = GG_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__CONSTRAINT = GG_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME__CRITERIA = GG_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gg Decision Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_FRAME_FEATURE_COUNT = GG_FLOW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationFlowImpl <em>Gg Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationFlowImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationFlow()
	 * @generated
	 */
	int GG_INFORMATION_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__ID = GG_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__NAME = GG_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__CODE = GG_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__DESCRIPTION = GG_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__SOURCE = GG_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__TARGET = GG_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW__GRAI_GRID = GG_FLOW__GRAI_GRID;

	/**
	 * The number of structural features of the '<em>Gg Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_FLOW_FEATURE_COUNT = GG_FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionCenterImpl <em>Gg Decision Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionCenterImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgDecisionCenter()
	 * @generated
	 */
	int GG_DECISION_CENTER = 7;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl <em>Gg Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgTimeValue()
	 * @generated
	 */
	int GG_TIME_VALUE = 8;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl <em>Gg Information Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationSource()
	 * @generated
	 */
	int GG_INFORMATION_SOURCE = 9;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgExternalInformationSourceImpl <em>Gg External Information Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgExternalInformationSourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgExternalInformationSource()
	 * @generated
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE = 10;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInternalInformationSourceImpl <em>Gg Internal Information Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInternalInformationSourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInternalInformationSource()
	 * @generated
	 */
	int GG_INTERNAL_INFORMATION_SOURCE = 11;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationCenterImpl <em>Gg Information Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationCenterImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationCenter()
	 * @generated
	 */
	int GG_INFORMATION_CENTER = 12;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgCollaborativeDecisionImpl <em>Gg Collaborative Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgCollaborativeDecisionImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgCollaborativeDecision()
	 * @generated
	 */
	int GG_COLLABORATIVE_DECISION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__ID = GG_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__NAME = GG_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__CODE = GG_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__DESCRIPTION = GG_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__SOURCE = GG_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__TARGET = GG_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION__GRAI_GRID = GG_FLOW__GRAI_GRID;

	/**
	 * The number of structural features of the '<em>Gg Collaborative Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_COLLABORATIVE_DECISION_FEATURE_COUNT = GG_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__ID = GG_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__NAME = GG_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__CODE = GG_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__DESCRIPTION = GG_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__LEVEL = GG_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__OUT_FLOWS = GG_NODE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__IN_FLOWS = GG_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__GRAI_GRID = GG_NODE__GRAI_GRID;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER__FUNCTION = GG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gg Decision Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_DECISION_CENTER_FEATURE_COUNT = GG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_TIME_VALUE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_TIME_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Gg Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_TIME_VALUE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Information Centers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__INFORMATION_CENTERS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE__GRAI_GRID = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gg Information Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_SOURCE_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__ID = GG_INFORMATION_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__NAME = GG_INFORMATION_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__CODE = GG_INFORMATION_SOURCE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__DESCRIPTION = GG_INFORMATION_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Information Centers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__INFORMATION_CENTERS = GG_INFORMATION_SOURCE__INFORMATION_CENTERS;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE__GRAI_GRID = GG_INFORMATION_SOURCE__GRAI_GRID;

	/**
	 * The number of structural features of the '<em>Gg External Information Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_EXTERNAL_INFORMATION_SOURCE_FEATURE_COUNT = GG_INFORMATION_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__ID = GG_INFORMATION_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__NAME = GG_INFORMATION_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__CODE = GG_INFORMATION_SOURCE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__DESCRIPTION = GG_INFORMATION_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Information Centers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__INFORMATION_CENTERS = GG_INFORMATION_SOURCE__INFORMATION_CENTERS;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE__GRAI_GRID = GG_INFORMATION_SOURCE__GRAI_GRID;

	/**
	 * The number of structural features of the '<em>Gg Internal Information Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INTERNAL_INFORMATION_SOURCE_FEATURE_COUNT = GG_INFORMATION_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__ID = GG_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__NAME = GG_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__CODE = GG_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__DESCRIPTION = GG_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__LEVEL = GG_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Out Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__OUT_FLOWS = GG_NODE__OUT_FLOWS;

	/**
	 * The feature id for the '<em><b>In Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__IN_FLOWS = GG_NODE__IN_FLOWS;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__GRAI_GRID = GG_NODE__GRAI_GRID;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER__INFORMATION_SOURCE = GG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gg Information Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_INFORMATION_CENTER_FEATURE_COUNT = GG_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits <em>Gg Time Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgTimeUnits()
	 * @generated
	 */
	int GG_TIME_UNITS = 13;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction <em>Gg Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction
	 * @generated
	 */
	EClass getGgFunction();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid()
	 * @see #getGgFunction()
	 * @generated
	 */
	EReference getGgFunction_GraiGrid();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getDecisionCenters <em>Decision Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decision Centers</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getDecisionCenters()
	 * @see #getGgFunction()
	 * @generated
	 */
	EReference getGgFunction_DecisionCenters();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization()
	 * @see #getGgFunction()
	 * @generated
	 */
	EReference getGgFunction_Organization();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel <em>Gg Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Level</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel
	 * @generated
	 */
	EClass getGgLevel();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getNodes()
	 * @see #getGgLevel()
	 * @generated
	 */
	EReference getGgLevel_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getHorizon <em>Horizon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Horizon</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getHorizon()
	 * @see #getGgLevel()
	 * @generated
	 */
	EReference getGgLevel_Horizon();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getPeriod()
	 * @see #getGgLevel()
	 * @generated
	 */
	EReference getGgLevel_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getProcessingUnit <em>Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getProcessingUnit()
	 * @see #getGgLevel()
	 * @generated
	 */
	EReference getGgLevel_ProcessingUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid()
	 * @see #getGgLevel()
	 * @generated
	 */
	EReference getGgLevel_GraiGrid();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow <em>Gg Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow
	 * @generated
	 */
	EClass getGgFlow();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getSource()
	 * @see #getGgFlow()
	 * @generated
	 */
	EReference getGgFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getTarget()
	 * @see #getGgFlow()
	 * @generated
	 */
	EReference getGgFlow_Target();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getGraiGrid()
	 * @see #getGgFlow()
	 * @generated
	 */
	EReference getGgFlow_GraiGrid();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode <em>Gg Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Node</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode
	 * @generated
	 */
	EClass getGgNode();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel()
	 * @see #getGgNode()
	 * @generated
	 */
	EReference getGgNode_Level();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getOutFlows <em>Out Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Flows</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getOutFlows()
	 * @see #getGgNode()
	 * @generated
	 */
	EReference getGgNode_OutFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getInFlows <em>In Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Flows</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getInFlows()
	 * @see #getGgNode()
	 * @generated
	 */
	EReference getGgNode_InFlows();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid()
	 * @see #getGgNode()
	 * @generated
	 */
	EReference getGgNode_GraiGrid();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame <em>Gg Decision Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Decision Frame</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame
	 * @generated
	 */
	EClass getGgDecisionFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getDecisionVariable <em>Decision Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Variable</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getDecisionVariable()
	 * @see #getGgDecisionFrame()
	 * @generated
	 */
	EAttribute getGgDecisionFrame_DecisionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getObjective()
	 * @see #getGgDecisionFrame()
	 * @generated
	 */
	EAttribute getGgDecisionFrame_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getConstraint()
	 * @see #getGgDecisionFrame()
	 * @generated
	 */
	EAttribute getGgDecisionFrame_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getCriteria()
	 * @see #getGgDecisionFrame()
	 * @generated
	 */
	EAttribute getGgDecisionFrame_Criteria();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow <em>Gg Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Information Flow</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow
	 * @generated
	 */
	EClass getGgInformationFlow();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter <em>Gg Decision Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Decision Center</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter
	 * @generated
	 */
	EClass getGgDecisionCenter();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction()
	 * @see #getGgDecisionCenter()
	 * @generated
	 */
	EReference getGgDecisionCenter_Function();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue <em>Gg Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Time Value</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue
	 * @generated
	 */
	EClass getGgTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getUnit()
	 * @see #getGgTimeValue()
	 * @generated
	 */
	EAttribute getGgTimeValue_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getValue()
	 * @see #getGgTimeValue()
	 * @generated
	 */
	EAttribute getGgTimeValue_Value();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource <em>Gg Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Information Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource
	 * @generated
	 */
	EClass getGgInformationSource();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getInformationCenters <em>Information Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information Centers</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getInformationCenters()
	 * @see #getGgInformationSource()
	 * @generated
	 */
	EReference getGgInformationSource_InformationCenters();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid()
	 * @see #getGgInformationSource()
	 * @generated
	 */
	EReference getGgInformationSource_GraiGrid();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource <em>Gg External Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg External Information Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource
	 * @generated
	 */
	EClass getGgExternalInformationSource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource <em>Gg Internal Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Internal Information Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource
	 * @generated
	 */
	EClass getGgInternalInformationSource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter <em>Gg Information Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Information Center</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter
	 * @generated
	 */
	EClass getGgInformationCenter();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource <em>Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Source</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource()
	 * @see #getGgInformationCenter()
	 * @generated
	 */
	EReference getGgInformationCenter_InformationSource();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision <em>Gg Collaborative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Collaborative Decision</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision
	 * @generated
	 */
	EClass getGgCollaborativeDecision();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits <em>Gg Time Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gg Time Units</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits
	 * @generated
	 */
	EEnum getGgTimeUnits();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl <em>Gg Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgFunction()
		 * @generated
		 */
		EClass GG_FUNCTION = eINSTANCE.getGgFunction();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FUNCTION__GRAI_GRID = eINSTANCE.getGgFunction_GraiGrid();

		/**
		 * The meta object literal for the '<em><b>Decision Centers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FUNCTION__DECISION_CENTERS = eINSTANCE.getGgFunction_DecisionCenters();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FUNCTION__ORGANIZATION = eINSTANCE.getGgFunction_Organization();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl <em>Gg Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgLevel()
		 * @generated
		 */
		EClass GG_LEVEL = eINSTANCE.getGgLevel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_LEVEL__NODES = eINSTANCE.getGgLevel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Horizon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_LEVEL__HORIZON = eINSTANCE.getGgLevel_Horizon();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_LEVEL__PERIOD = eINSTANCE.getGgLevel_Period();

		/**
		 * The meta object literal for the '<em><b>Processing Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_LEVEL__PROCESSING_UNIT = eINSTANCE.getGgLevel_ProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_LEVEL__GRAI_GRID = eINSTANCE.getGgLevel_GraiGrid();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl <em>Gg Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgFlow()
		 * @generated
		 */
		EClass GG_FLOW = eINSTANCE.getGgFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FLOW__SOURCE = eINSTANCE.getGgFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FLOW__TARGET = eINSTANCE.getGgFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_FLOW__GRAI_GRID = eINSTANCE.getGgFlow_GraiGrid();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl <em>Gg Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgNode()
		 * @generated
		 */
		EClass GG_NODE = eINSTANCE.getGgNode();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_NODE__LEVEL = eINSTANCE.getGgNode_Level();

		/**
		 * The meta object literal for the '<em><b>Out Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_NODE__OUT_FLOWS = eINSTANCE.getGgNode_OutFlows();

		/**
		 * The meta object literal for the '<em><b>In Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_NODE__IN_FLOWS = eINSTANCE.getGgNode_InFlows();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_NODE__GRAI_GRID = eINSTANCE.getGgNode_GraiGrid();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl <em>Gg Decision Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgDecisionFrame()
		 * @generated
		 */
		EClass GG_DECISION_FRAME = eINSTANCE.getGgDecisionFrame();

		/**
		 * The meta object literal for the '<em><b>Decision Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_DECISION_FRAME__DECISION_VARIABLE = eINSTANCE.getGgDecisionFrame_DecisionVariable();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_DECISION_FRAME__OBJECTIVE = eINSTANCE.getGgDecisionFrame_Objective();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_DECISION_FRAME__CONSTRAINT = eINSTANCE.getGgDecisionFrame_Constraint();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_DECISION_FRAME__CRITERIA = eINSTANCE.getGgDecisionFrame_Criteria();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationFlowImpl <em>Gg Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationFlowImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationFlow()
		 * @generated
		 */
		EClass GG_INFORMATION_FLOW = eINSTANCE.getGgInformationFlow();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionCenterImpl <em>Gg Decision Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionCenterImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgDecisionCenter()
		 * @generated
		 */
		EClass GG_DECISION_CENTER = eINSTANCE.getGgDecisionCenter();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_DECISION_CENTER__FUNCTION = eINSTANCE.getGgDecisionCenter_Function();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl <em>Gg Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgTimeValue()
		 * @generated
		 */
		EClass GG_TIME_VALUE = eINSTANCE.getGgTimeValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_TIME_VALUE__UNIT = eINSTANCE.getGgTimeValue_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_TIME_VALUE__VALUE = eINSTANCE.getGgTimeValue_Value();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl <em>Gg Information Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationSource()
		 * @generated
		 */
		EClass GG_INFORMATION_SOURCE = eINSTANCE.getGgInformationSource();

		/**
		 * The meta object literal for the '<em><b>Information Centers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_INFORMATION_SOURCE__INFORMATION_CENTERS = eINSTANCE.getGgInformationSource_InformationCenters();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_INFORMATION_SOURCE__GRAI_GRID = eINSTANCE.getGgInformationSource_GraiGrid();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgExternalInformationSourceImpl <em>Gg External Information Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgExternalInformationSourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgExternalInformationSource()
		 * @generated
		 */
		EClass GG_EXTERNAL_INFORMATION_SOURCE = eINSTANCE.getGgExternalInformationSource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInternalInformationSourceImpl <em>Gg Internal Information Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInternalInformationSourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInternalInformationSource()
		 * @generated
		 */
		EClass GG_INTERNAL_INFORMATION_SOURCE = eINSTANCE.getGgInternalInformationSource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationCenterImpl <em>Gg Information Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationCenterImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgInformationCenter()
		 * @generated
		 */
		EClass GG_INFORMATION_CENTER = eINSTANCE.getGgInformationCenter();

		/**
		 * The meta object literal for the '<em><b>Information Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_INFORMATION_CENTER__INFORMATION_SOURCE = eINSTANCE.getGgInformationCenter_InformationSource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgCollaborativeDecisionImpl <em>Gg Collaborative Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgCollaborativeDecisionImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgCollaborativeDecision()
		 * @generated
		 */
		EClass GG_COLLABORATIVE_DECISION = eINSTANCE.getGgCollaborativeDecision();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits <em>Gg Time Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl#getGgTimeUnits()
		 * @generated
		 */
		EEnum GG_TIME_UNITS = eINSTANCE.getGgTimeUnits();

	}

} //CoreElementsPackage
