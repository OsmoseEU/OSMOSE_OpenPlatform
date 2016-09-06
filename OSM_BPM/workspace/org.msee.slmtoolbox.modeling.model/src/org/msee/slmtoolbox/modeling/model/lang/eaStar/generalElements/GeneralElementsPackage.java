/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory
 * @model kind="package"
 * @generated
 */
public interface GeneralElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generalElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/eaStar.ecore/generalElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.eaStar.root.generalElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralElementsPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link eaStar.generalElements.impl.EaBaseElementImpl <em>Ea Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaStar.generalElements.impl.EaBaseElementImpl
	 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaBaseElement()
	 * @generated
	 */
	int EA_BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_ELEMENT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_ELEMENT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Ea Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eaStar.generalElements.impl.EaProcessImpl <em>Ea Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaStar.generalElements.impl.EaProcessImpl
	 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaProcess()
	 * @generated
	 */
	int EA_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__ID = EA_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__NAME = EA_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__CODE = EA_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__DESCRIPTION = EA_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__FLOW_ELEMENTS = EA_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Be</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__CAN_BE = EA_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__MODEL = EA_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__DECOMPOSITION_CODE = EA_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Osmiotic Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS__OSMIOTIC_PROCESS = EA_BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ea Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROCESS_FEATURE_COUNT = EA_BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eaStar.generalElements.impl.EaFlowElementImpl <em>Ea Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaStar.generalElements.impl.EaFlowElementImpl
	 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaFlowElement()
	 * @generated
	 */
	int EA_FLOW_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT__ID = EA_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT__NAME = EA_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT__CODE = EA_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT__DESCRIPTION = EA_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT__PROCESS = EA_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ea Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOW_ELEMENT_FEATURE_COUNT = EA_BASE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eaStar.generalElements.EaBaseElement <em>Ea Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Base Element</em>'.
	 * @see eaStar.generalElements.EaBaseElement
	 * @generated
	 */
	EClass getEaBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaBaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eaStar.generalElements.EaBaseElement#getId()
	 * @see #getEaBaseElement()
	 * @generated
	 */
	EAttribute getEaBaseElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaBaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaStar.generalElements.EaBaseElement#getName()
	 * @see #getEaBaseElement()
	 * @generated
	 */
	EAttribute getEaBaseElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaBaseElement#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see eaStar.generalElements.EaBaseElement#getCode()
	 * @see #getEaBaseElement()
	 * @generated
	 */
	EAttribute getEaBaseElement_Code();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaBaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eaStar.generalElements.EaBaseElement#getDescription()
	 * @see #getEaBaseElement()
	 * @generated
	 */
	EAttribute getEaBaseElement_Description();

	/**
	 * Returns the meta object for class '{@link eaStar.generalElements.EaProcess <em>Ea Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Process</em>'.
	 * @see eaStar.generalElements.EaProcess
	 * @generated
	 */
	EClass getEaProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link eaStar.generalElements.EaProcess#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see eaStar.generalElements.EaProcess#getFlowElements()
	 * @see #getEaProcess()
	 * @generated
	 */
	EReference getEaProcess_FlowElements();

	/**
	 * Returns the meta object for the reference '{@link eaStar.generalElements.EaProcess#getCanBe <em>Can Be</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Can Be</em>'.
	 * @see eaStar.generalElements.EaProcess#getCanBe()
	 * @see #getEaProcess()
	 * @generated
	 */
	EReference getEaProcess_CanBe();

	/**
	 * Returns the meta object for the container reference '{@link eaStar.generalElements.EaProcess#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see eaStar.generalElements.EaProcess#getModel()
	 * @see #getEaProcess()
	 * @generated
	 */
	EReference getEaProcess_Model();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaProcess#getDecompositionCode <em>Decomposition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition Code</em>'.
	 * @see eaStar.generalElements.EaProcess#getDecompositionCode()
	 * @see #getEaProcess()
	 * @generated
	 */
	EAttribute getEaProcess_DecompositionCode();

	/**
	 * Returns the meta object for the attribute '{@link eaStar.generalElements.EaProcess#getOsmioticProcess <em>Osmiotic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osmiotic Process</em>'.
	 * @see eaStar.generalElements.EaProcess#getOsmioticProcess()
	 * @see #getEaProcess()
	 * @generated
	 */
	EAttribute getEaProcess_OsmioticProcess();

	/**
	 * Returns the meta object for class '{@link eaStar.generalElements.EaFlowElement <em>Ea Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Flow Element</em>'.
	 * @see eaStar.generalElements.EaFlowElement
	 * @generated
	 */
	EClass getEaFlowElement();

	/**
	 * Returns the meta object for the container reference '{@link eaStar.generalElements.EaFlowElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see eaStar.generalElements.EaFlowElement#getProcess()
	 * @see #getEaFlowElement()
	 * @generated
	 */
	EReference getEaFlowElement_Process();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneralElementsFactory getGeneralElementsFactory();

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
		 * The meta object literal for the '{@link eaStar.generalElements.impl.EaBaseElementImpl <em>Ea Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaStar.generalElements.impl.EaBaseElementImpl
		 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaBaseElement()
		 * @generated
		 */
		EClass EA_BASE_ELEMENT = eINSTANCE.getEaBaseElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_ELEMENT__ID = eINSTANCE.getEaBaseElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_ELEMENT__NAME = eINSTANCE.getEaBaseElement_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_ELEMENT__CODE = eINSTANCE.getEaBaseElement_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_ELEMENT__DESCRIPTION = eINSTANCE.getEaBaseElement_Description();

		/**
		 * The meta object literal for the '{@link eaStar.generalElements.impl.EaProcessImpl <em>Ea Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaStar.generalElements.impl.EaProcessImpl
		 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaProcess()
		 * @generated
		 */
		EClass EA_PROCESS = eINSTANCE.getEaProcess();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PROCESS__FLOW_ELEMENTS = eINSTANCE.getEaProcess_FlowElements();

		/**
		 * The meta object literal for the '<em><b>Can Be</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PROCESS__CAN_BE = eINSTANCE.getEaProcess_CanBe();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PROCESS__MODEL = eINSTANCE.getEaProcess_Model();

		/**
		 * The meta object literal for the '<em><b>Decomposition Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PROCESS__DECOMPOSITION_CODE = eINSTANCE.getEaProcess_DecompositionCode();

		/**
		 * The meta object literal for the '<em><b>Osmiotic Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PROCESS__OSMIOTIC_PROCESS = eINSTANCE.getEaProcess_OsmioticProcess();

		/**
		 * The meta object literal for the '{@link eaStar.generalElements.impl.EaFlowElementImpl <em>Ea Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaStar.generalElements.impl.EaFlowElementImpl
		 * @see eaStar.generalElements.impl.GeneralElementsPackageImpl#getEaFlowElement()
		 * @generated
		 */
		EClass EA_FLOW_ELEMENT = eINSTANCE.getEaFlowElement();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_FLOW_ELEMENT__PROCESS = eINSTANCE.getEaFlowElement_Process();

	}

} //GeneralElementsPackage