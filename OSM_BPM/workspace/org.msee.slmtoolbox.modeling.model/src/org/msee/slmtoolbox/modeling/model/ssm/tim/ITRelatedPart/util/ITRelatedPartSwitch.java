/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage
 * @generated
 */
public class ITRelatedPartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ITRelatedPartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITRelatedPartSwitch() {
		if (modelPackage == null) {
			modelPackage = ITRelatedPartPackage.eINSTANCE;
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE: {
				TimEnterpriseApplicationResource timEnterpriseApplicationResource = (TimEnterpriseApplicationResource)theEObject;
				T result = caseTimEnterpriseApplicationResource(timEnterpriseApplicationResource);
				if (result == null) result = caseTimResource(timEnterpriseApplicationResource);
				if (result == null) result = caseiTimNamedElement(timEnterpriseApplicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ITRelatedPartPackage.TIM_INFORMATION_SET: {
				TimInformationSet timInformationSet = (TimInformationSet)theEObject;
				T result = caseTimInformationSet(timInformationSet);
				if (result == null) result = caseiTimNamedElement(timInformationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY: {
				TimInformationEntity timInformationEntity = (TimInformationEntity)theEObject;
				T result = caseTimInformationEntity(timInformationEntity);
				if (result == null) result = caseiTimNamedElement(timInformationEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP: {
				TimInformationRelationship timInformationRelationship = (TimInformationRelationship)theEObject;
				T result = caseTimInformationRelationship(timInformationRelationship);
				if (result == null) result = caseiTimNamedElement(timInformationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE: {
				TimInformationAttribute timInformationAttribute = (TimInformationAttribute)theEObject;
				T result = caseTimInformationAttribute(timInformationAttribute);
				if (result == null) result = caseiTimNamedElement(timInformationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Enterprise Application Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Enterprise Application Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimEnterpriseApplicationResource(TimEnterpriseApplicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Information Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Information Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimInformationSet(TimInformationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Information Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimInformationEntity(TimInformationEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Information Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Information Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimInformationRelationship(TimInformationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Information Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Information Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimInformationAttribute(TimInformationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>iTim Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>iTim Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseiTimNamedElement(iTimNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tim Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tim Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimResource(TimResource object) {
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

} //ITRelatedPartSwitch
