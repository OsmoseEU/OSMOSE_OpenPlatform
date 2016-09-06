/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.*;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage
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
			case CoreElementsPackage.GG_FUNCTION: {
				GgFunction ggFunction = (GgFunction)theEObject;
				T result = caseGgFunction(ggFunction);
				if (result == null) result = caseGgBaseElement(ggFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_LEVEL: {
				GgLevel ggLevel = (GgLevel)theEObject;
				T result = caseGgLevel(ggLevel);
				if (result == null) result = caseGgBaseElement(ggLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_FLOW: {
				GgFlow ggFlow = (GgFlow)theEObject;
				T result = caseGgFlow(ggFlow);
				if (result == null) result = caseGgBaseElement(ggFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_NODE: {
				GgNode ggNode = (GgNode)theEObject;
				T result = caseGgNode(ggNode);
				if (result == null) result = caseGgBaseElement(ggNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_DECISION_FRAME: {
				GgDecisionFrame ggDecisionFrame = (GgDecisionFrame)theEObject;
				T result = caseGgDecisionFrame(ggDecisionFrame);
				if (result == null) result = caseGgFlow(ggDecisionFrame);
				if (result == null) result = caseGgBaseElement(ggDecisionFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_INFORMATION_FLOW: {
				GgInformationFlow ggInformationFlow = (GgInformationFlow)theEObject;
				T result = caseGgInformationFlow(ggInformationFlow);
				if (result == null) result = caseGgFlow(ggInformationFlow);
				if (result == null) result = caseGgBaseElement(ggInformationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_COLLABORATIVE_DECISION: {
				GgCollaborativeDecision ggCollaborativeDecision = (GgCollaborativeDecision)theEObject;
				T result = caseGgCollaborativeDecision(ggCollaborativeDecision);
				if (result == null) result = caseGgFlow(ggCollaborativeDecision);
				if (result == null) result = caseGgBaseElement(ggCollaborativeDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_DECISION_CENTER: {
				GgDecisionCenter ggDecisionCenter = (GgDecisionCenter)theEObject;
				T result = caseGgDecisionCenter(ggDecisionCenter);
				if (result == null) result = caseGgNode(ggDecisionCenter);
				if (result == null) result = caseGgBaseElement(ggDecisionCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_TIME_VALUE: {
				GgTimeValue ggTimeValue = (GgTimeValue)theEObject;
				T result = caseGgTimeValue(ggTimeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_INFORMATION_SOURCE: {
				GgInformationSource ggInformationSource = (GgInformationSource)theEObject;
				T result = caseGgInformationSource(ggInformationSource);
				if (result == null) result = caseGgBaseElement(ggInformationSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_EXTERNAL_INFORMATION_SOURCE: {
				GgExternalInformationSource ggExternalInformationSource = (GgExternalInformationSource)theEObject;
				T result = caseGgExternalInformationSource(ggExternalInformationSource);
				if (result == null) result = caseGgInformationSource(ggExternalInformationSource);
				if (result == null) result = caseGgBaseElement(ggExternalInformationSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_INTERNAL_INFORMATION_SOURCE: {
				GgInternalInformationSource ggInternalInformationSource = (GgInternalInformationSource)theEObject;
				T result = caseGgInternalInformationSource(ggInternalInformationSource);
				if (result == null) result = caseGgInformationSource(ggInternalInformationSource);
				if (result == null) result = caseGgBaseElement(ggInternalInformationSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreElementsPackage.GG_INFORMATION_CENTER: {
				GgInformationCenter ggInformationCenter = (GgInformationCenter)theEObject;
				T result = caseGgInformationCenter(ggInformationCenter);
				if (result == null) result = caseGgNode(ggInformationCenter);
				if (result == null) result = caseGgBaseElement(ggInformationCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgFunction(GgFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgLevel(GgLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgFlow(GgFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgNode(GgNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Decision Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Decision Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgDecisionFrame(GgDecisionFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgInformationFlow(GgInformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Decision Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Decision Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgDecisionCenter(GgDecisionCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgTimeValue(GgTimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Information Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Information Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgInformationSource(GgInformationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg External Information Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg External Information Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgExternalInformationSource(GgExternalInformationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Internal Information Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Internal Information Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgInternalInformationSource(GgInternalInformationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Information Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Information Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgInformationCenter(GgInformationCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Collaborative Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Collaborative Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgCollaborativeDecision(GgCollaborativeDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gg Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gg Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGgBaseElement(GgBaseElement object) {
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
