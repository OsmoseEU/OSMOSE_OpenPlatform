/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.*;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage
 * @generated
 */
public class CoreElementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreElementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsSwitch() {
		if (modelPackage == null) {
			modelPackage = CoreElementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CoreElementsPackage.EA_FLOW: {
				EaFlow eaFlow = (EaFlow)theEObject;
				T result = caseEaFlow(eaFlow);
				if (result == null) result = caseEaFlowElement(eaFlow);
				if (result == null) result = caseEaBaseElement(eaFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_FLOW_NODE: {
				EaFlowNode eaFlowNode = (EaFlowNode)theEObject;
				T result = caseEaFlowNode(eaFlowNode);
				if (result == null) result = caseEaFlowElement(eaFlowNode);
				if (result == null) result = caseEaBaseElement(eaFlowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_LOGICAL_OPERATOR: {
				EaLogicalOperator eaLogicalOperator = (EaLogicalOperator)theEObject;
				T result = caseEaLogicalOperator(eaLogicalOperator);
				if (result == null) result = caseEaFlowNode(eaLogicalOperator);
				if (result == null) result = caseEaFlowElement(eaLogicalOperator);
				if (result == null) result = caseEaBaseElement(eaLogicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_CONNECTOR: {
				EaConnector eaConnector = (EaConnector)theEObject;
				T result = caseEaConnector(eaConnector);
				if (result == null) result = caseEaFlowNode(eaConnector);
				if (result == null) result = caseEaFlowElement(eaConnector);
				if (result == null) result = caseEaBaseElement(eaConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY: {
				EaExtendedActivity eaExtendedActivity = (EaExtendedActivity)theEObject;
				T result = caseEaExtendedActivity(eaExtendedActivity);
				if (result == null) result = caseEaFlowNode(eaExtendedActivity);
				if (result == null) result = caseEaFlowElement(eaExtendedActivity);
				if (result == null) result = caseEaBaseElement(eaExtendedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_RESOURCE: {
				EaResource eaResource = (EaResource)theEObject;
				T result = caseEaResource(eaResource);
				if (result == null) result = caseEaFlowNode(eaResource);
				if (result == null) result = caseEaFlowElement(eaResource);
				if (result == null) result = caseEaBaseElement(eaResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_IT_RESOURCE: {
				EaITResource eaITResource = (EaITResource)theEObject;
				T result = caseEaITResource(eaITResource);
				if (result == null) result = caseEaResource(eaITResource);
				if (result == null) result = caseEaFlowNode(eaITResource);
				if (result == null) result = caseEaFlowElement(eaITResource);
				if (result == null) result = caseEaBaseElement(eaITResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_HUMAN_RESOURCE: {
				EaHumanResource eaHumanResource = (EaHumanResource)theEObject;
				T result = caseEaHumanResource(eaHumanResource);
				if (result == null) result = caseEaResource(eaHumanResource);
				if (result == null) result = caseEaFlowNode(eaHumanResource);
				if (result == null) result = caseEaFlowElement(eaHumanResource);
				if (result == null) result = caseEaBaseElement(eaHumanResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_MATERIAL_RESOURCE: {
				EaMaterialResource eaMaterialResource = (EaMaterialResource)theEObject;
				T result = caseEaMaterialResource(eaMaterialResource);
				if (result == null) result = caseEaResource(eaMaterialResource);
				if (result == null) result = caseEaFlowNode(eaMaterialResource);
				if (result == null) result = caseEaFlowElement(eaMaterialResource);
				if (result == null) result = caseEaBaseElement(eaMaterialResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_OR: {
				EaOr eaOr = (EaOr)theEObject;
				T result = caseEaOr(eaOr);
				if (result == null) result = caseEaLogicalOperator(eaOr);
				if (result == null) result = caseEaFlowNode(eaOr);
				if (result == null) result = caseEaFlowElement(eaOr);
				if (result == null) result = caseEaBaseElement(eaOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_AND: {
				EaAnd eaAnd = (EaAnd)theEObject;
				T result = caseEaAnd(eaAnd);
				if (result == null) result = caseEaLogicalOperator(eaAnd);
				if (result == null) result = caseEaFlowNode(eaAnd);
				if (result == null) result = caseEaFlowElement(eaAnd);
				if (result == null) result = caseEaBaseElement(eaAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_DIVERGING_AND: {
				EaDivergingAnd eaDivergingAnd = (EaDivergingAnd)theEObject;
				T result = caseEaDivergingAnd(eaDivergingAnd);
				if (result == null) result = caseEaAnd(eaDivergingAnd);
				if (result == null) result = caseEaLogicalOperator(eaDivergingAnd);
				if (result == null) result = caseEaFlowNode(eaDivergingAnd);
				if (result == null) result = caseEaFlowElement(eaDivergingAnd);
				if (result == null) result = caseEaBaseElement(eaDivergingAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_DIVERGING_OR: {
				EaDivergingOr eaDivergingOr = (EaDivergingOr)theEObject;
				T result = caseEaDivergingOr(eaDivergingOr);
				if (result == null) result = caseEaOr(eaDivergingOr);
				if (result == null) result = caseEaLogicalOperator(eaDivergingOr);
				if (result == null) result = caseEaFlowNode(eaDivergingOr);
				if (result == null) result = caseEaFlowElement(eaDivergingOr);
				if (result == null) result = caseEaBaseElement(eaDivergingOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_CONVERGING_AND: {
				EaConvergingAnd eaConvergingAnd = (EaConvergingAnd)theEObject;
				T result = caseEaConvergingAnd(eaConvergingAnd);
				if (result == null) result = caseEaAnd(eaConvergingAnd);
				if (result == null) result = caseEaLogicalOperator(eaConvergingAnd);
				if (result == null) result = caseEaFlowNode(eaConvergingAnd);
				if (result == null) result = caseEaFlowElement(eaConvergingAnd);
				if (result == null) result = caseEaBaseElement(eaConvergingAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_CONVERGING_OR: {
				EaConvergingOr eaConvergingOr = (EaConvergingOr)theEObject;
				T result = caseEaConvergingOr(eaConvergingOr);
				if (result == null) result = caseEaOr(eaConvergingOr);
				if (result == null) result = caseEaLogicalOperator(eaConvergingOr);
				if (result == null) result = caseEaFlowNode(eaConvergingOr);
				if (result == null) result = caseEaFlowElement(eaConvergingOr);
				if (result == null) result = caseEaBaseElement(eaConvergingOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_INTERNAL_CONNECTOR: {
				EaInternalConnector eaInternalConnector = (EaInternalConnector)theEObject;
				T result = caseEaInternalConnector(eaInternalConnector);
				if (result == null) result = caseEaConnector(eaInternalConnector);
				if (result == null) result = caseEaFlowNode(eaInternalConnector);
				if (result == null) result = caseEaFlowElement(eaInternalConnector);
				if (result == null) result = caseEaBaseElement(eaInternalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_EXTERNAL_CONNECTOR: {
				EaExternalConnector eaExternalConnector = (EaExternalConnector)theEObject;
				T result = caseEaExternalConnector(eaExternalConnector);
				if (result == null) result = caseEaConnector(eaExternalConnector);
				if (result == null) result = caseEaFlowNode(eaExternalConnector);
				if (result == null) result = caseEaFlowElement(eaExternalConnector);
				if (result == null) result = caseEaBaseElement(eaExternalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_PROCESS_CONNECTOR: {
				EaProcessConnector eaProcessConnector = (EaProcessConnector)theEObject;
				T result = caseEaProcessConnector(eaProcessConnector);
				if (result == null) result = caseEaConnector(eaProcessConnector);
				if (result == null) result = caseEaFlowNode(eaProcessConnector);
				if (result == null) result = caseEaFlowElement(eaProcessConnector);
				if (result == null) result = caseEaBaseElement(eaProcessConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_OUTPUT_INPUT_FLOW: {
				EaOutputInputFlow eaOutputInputFlow = (EaOutputInputFlow)theEObject;
				T result = caseEaOutputInputFlow(eaOutputInputFlow);
				if (result == null) result = caseEaFlow(eaOutputInputFlow);
				if (result == null) result = caseEaFlowElement(eaOutputInputFlow);
				if (result == null) result = caseEaBaseElement(eaOutputInputFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_SUPPORT_FLOW: {
				EaSupportFlow eaSupportFlow = (EaSupportFlow)theEObject;
				T result = caseEaSupportFlow(eaSupportFlow);
				if (result == null) result = caseEaFlow(eaSupportFlow);
				if (result == null) result = caseEaFlowElement(eaSupportFlow);
				if (result == null) result = caseEaBaseElement(eaSupportFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_CONTROL_FLOW: {
				EaControlFlow eaControlFlow = (EaControlFlow)theEObject;
				T result = caseEaControlFlow(eaControlFlow);
				if (result == null) result = caseEaFlow(eaControlFlow);
				if (result == null) result = caseEaFlowElement(eaControlFlow);
				if (result == null) result = caseEaBaseElement(eaControlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_ORGANIZATION: {
				EaOrganization eaOrganization = (EaOrganization)theEObject;
				T result = caseEaOrganization(eaOrganization);
				if (result == null) result = caseEaBaseElement(eaOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_ATOMIC_EXTENDED_ACTIVITY: {
				EaAtomicExtendedActivity eaAtomicExtendedActivity = (EaAtomicExtendedActivity)theEObject;
				T result = caseEaAtomicExtendedActivity(eaAtomicExtendedActivity);
				if (result == null) result = caseEaExtendedActivity(eaAtomicExtendedActivity);
				if (result == null) result = caseEaFlowNode(eaAtomicExtendedActivity);
				if (result == null) result = caseEaFlowElement(eaAtomicExtendedActivity);
				if (result == null) result = caseEaBaseElement(eaAtomicExtendedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY: {
				EaStructuralExtendedActivity eaStructuralExtendedActivity = (EaStructuralExtendedActivity)theEObject;
				T result = caseEaStructuralExtendedActivity(eaStructuralExtendedActivity);
				if (result == null) result = caseEaExtendedActivity(eaStructuralExtendedActivity);
				if (result == null) result = caseEaFlowNode(eaStructuralExtendedActivity);
				if (result == null) result = caseEaFlowElement(eaStructuralExtendedActivity);
				if (result == null) result = caseEaBaseElement(eaStructuralExtendedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaFlow(EaFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaFlowNode(EaFlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaLogicalOperator(EaLogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaConnector(EaConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Extended Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Extended Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaExtendedActivity(EaExtendedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaResource(EaResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea IT Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea IT Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaITResource(EaITResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Human Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Human Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaHumanResource(EaHumanResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Material Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Material Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaMaterialResource(EaMaterialResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaOr(EaOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaAnd(EaAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Diverging And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Diverging And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaDivergingAnd(EaDivergingAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Diverging Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Diverging Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaDivergingOr(EaDivergingOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Converging And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Converging And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaConvergingAnd(EaConvergingAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Converging Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Converging Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaConvergingOr(EaConvergingOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Internal Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Internal Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaInternalConnector(EaInternalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea External Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea External Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaExternalConnector(EaExternalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Process Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Process Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaProcessConnector(EaProcessConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Output Input Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Output Input Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaOutputInputFlow(EaOutputInputFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Support Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Support Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaSupportFlow(EaSupportFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaControlFlow(EaControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaOrganization(EaOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Atomic Extended Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Atomic Extended Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaAtomicExtendedActivity(EaAtomicExtendedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Structural Extended Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Structural Extended Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaStructuralExtendedActivity(EaStructuralExtendedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaBaseElement(EaBaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ea Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ea Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEaFlowElement(EaFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreElementsSwitch
