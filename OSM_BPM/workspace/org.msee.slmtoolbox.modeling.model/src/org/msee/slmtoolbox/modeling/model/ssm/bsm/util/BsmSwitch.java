/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.*;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage
 * @generated
 */
public class BsmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmSwitch() {
		if (modelPackage == null) {
			modelPackage = BsmPackage.eINSTANCE;
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
			case BsmPackage.IBSM_NAMED_ELEMENT: {
				IBsmNamedElement iBsmNamedElement = (IBsmNamedElement)theEObject;
				T result = caseIBsmNamedElement(iBsmNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_MODEL: {
				BsmModel bsmModel = (BsmModel)theEObject;
				T result = caseBsmModel(bsmModel);
				if (result == null) result = caseIBsmNamedElement(bsmModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_SERVICE: {
				BsmService bsmService = (BsmService)theEObject;
				T result = caseBsmService(bsmService);
				if (result == null) result = caseIBsmNamedElement(bsmService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_CUSTOMER: {
				BsmCustomer bsmCustomer = (BsmCustomer)theEObject;
				T result = caseBsmCustomer(bsmCustomer);
				if (result == null) result = caseIBsmNamedElement(bsmCustomer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_STAKEHOLDER: {
				BsmStakeholder bsmStakeholder = (BsmStakeholder)theEObject;
				T result = caseBsmStakeholder(bsmStakeholder);
				if (result == null) result = caseIBsmNamedElement(bsmStakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_PARTNER: {
				BsmPartner bsmPartner = (BsmPartner)theEObject;
				T result = caseBsmPartner(bsmPartner);
				if (result == null) result = caseIBsmNamedElement(bsmPartner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_PRODUCT: {
				BsmProduct bsmProduct = (BsmProduct)theEObject;
				T result = caseBsmProduct(bsmProduct);
				if (result == null) result = caseIBsmNamedElement(bsmProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_COMPONENT: {
				BsmComponent bsmComponent = (BsmComponent)theEObject;
				T result = caseBsmComponent(bsmComponent);
				if (result == null) result = caseIBsmNamedElement(bsmComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_FUNCTIONALITY: {
				BsmFunctionality bsmFunctionality = (BsmFunctionality)theEObject;
				T result = caseBsmFunctionality(bsmFunctionality);
				if (result == null) result = caseIBsmNamedElement(bsmFunctionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_RESOURCE: {
				BsmResource bsmResource = (BsmResource)theEObject;
				T result = caseBsmResource(bsmResource);
				if (result == null) result = caseIBsmNamedElement(bsmResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_PROCESS: {
				BsmProcess bsmProcess = (BsmProcess)theEObject;
				T result = caseBsmProcess(bsmProcess);
				if (result == null) result = caseIBsmNamedElement(bsmProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_DECISION: {
				BsmDecision bsmDecision = (BsmDecision)theEObject;
				T result = caseBsmDecision(bsmDecision);
				if (result == null) result = caseIBsmNamedElement(bsmDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_DECISION_STRUCTURE: {
				BsmDecisionStructure bsmDecisionStructure = (BsmDecisionStructure)theEObject;
				T result = caseBsmDecisionStructure(bsmDecisionStructure);
				if (result == null) result = caseIBsmNamedElement(bsmDecisionStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_ORGANIZATION: {
				BsmOrganization bsmOrganization = (BsmOrganization)theEObject;
				T result = caseBsmOrganization(bsmOrganization);
				if (result == null) result = caseIBsmNamedElement(bsmOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_ENTERPRISE: {
				BsmEnterprise bsmEnterprise = (BsmEnterprise)theEObject;
				T result = caseBsmEnterprise(bsmEnterprise);
				if (result == null) result = caseBsmOrganization(bsmEnterprise);
				if (result == null) result = caseIBsmNamedElement(bsmEnterprise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_VIRTUAL_ENTERPRISE: {
				BsmVirtualEnterprise bsmVirtualEnterprise = (BsmVirtualEnterprise)theEObject;
				T result = caseBsmVirtualEnterprise(bsmVirtualEnterprise);
				if (result == null) result = caseBsmOrganization(bsmVirtualEnterprise);
				if (result == null) result = caseIBsmNamedElement(bsmVirtualEnterprise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_VE_PARTICIPATION: {
				BsmVEParticipation bsmVEParticipation = (BsmVEParticipation)theEObject;
				T result = caseBsmVEParticipation(bsmVEParticipation);
				if (result == null) result = caseIBsmNamedElement(bsmVEParticipation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_VALUE: {
				BsmValue bsmValue = (BsmValue)theEObject;
				T result = caseBsmValue(bsmValue);
				if (result == null) result = caseIBsmNamedElement(bsmValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_PERFORMANCE_INDICATOR: {
				BsmPerformanceIndicator bsmPerformanceIndicator = (BsmPerformanceIndicator)theEObject;
				T result = caseBsmPerformanceIndicator(bsmPerformanceIndicator);
				if (result == null) result = caseIBsmNamedElement(bsmPerformanceIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_PI_FIELD: {
				BsmPiField bsmPiField = (BsmPiField)theEObject;
				T result = caseBsmPiField(bsmPiField);
				if (result == null) result = caseIBsmNamedElement(bsmPiField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_DECISION_VARIABLE: {
				BsmDecisionVariable bsmDecisionVariable = (BsmDecisionVariable)theEObject;
				T result = caseBsmDecisionVariable(bsmDecisionVariable);
				if (result == null) result = caseIBsmNamedElement(bsmDecisionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_DECISION_OBJECTIVE: {
				BsmDecisionObjective bsmDecisionObjective = (BsmDecisionObjective)theEObject;
				T result = caseBsmDecisionObjective(bsmDecisionObjective);
				if (result == null) result = caseIBsmNamedElement(bsmDecisionObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BsmPackage.BSM_MSE_SERVICE: {
				BsmMseService bsmMseService = (BsmMseService)theEObject;
				T result = caseBsmMseService(bsmMseService);
				if (result == null) result = caseIBsmNamedElement(bsmMseService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBsm Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBsm Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBsmNamedElement(IBsmNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmModel(BsmModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmService(BsmService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmCustomer(BsmCustomer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmStakeholder(BsmStakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmPartner(BsmPartner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmProduct(BsmProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmComponent(BsmComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmFunctionality(BsmFunctionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmResource(BsmResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmProcess(BsmProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmDecision(BsmDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmDecisionStructure(BsmDecisionStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmOrganization(BsmOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enterprise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmEnterprise(BsmEnterprise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Enterprise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmVirtualEnterprise(BsmVirtualEnterprise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VE Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VE Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmVEParticipation(BsmVEParticipation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmValue(BsmValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmPerformanceIndicator(BsmPerformanceIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pi Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pi Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmPiField(BsmPiField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmDecisionVariable(BsmDecisionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmDecisionObjective(BsmDecisionObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mse Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mse Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBsmMseService(BsmMseService object) {
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

} //BsmSwitch
