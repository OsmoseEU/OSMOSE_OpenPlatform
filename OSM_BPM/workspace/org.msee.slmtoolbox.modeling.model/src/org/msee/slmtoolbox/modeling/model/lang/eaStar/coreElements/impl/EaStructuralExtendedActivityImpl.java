/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Structural Extended Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaStructuralExtendedActivityImpl#getIsA <em>Is A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaStructuralExtendedActivityImpl extends EaExtendedActivityImpl implements EaStructuralExtendedActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaStructuralExtendedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_STRUCTURAL_EXTENDED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess getIsA() {
		return (EaProcess)eDynamicGet(CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, CoreElementsPackage.Literals.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess basicGetIsA() {
		return (EaProcess)eDynamicGet(CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, CoreElementsPackage.Literals.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsA(EaProcess newIsA, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIsA, CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsA(EaProcess newIsA) {
		eDynamicSet(CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, CoreElementsPackage.Literals.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, newIsA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				EaProcess isA = basicGetIsA();
				if (isA != null)
					msgs = ((InternalEObject)isA).eInverseRemove(this, GeneralElementsPackage.EA_PROCESS__CAN_BE, EaProcess.class, msgs);
				return basicSetIsA((EaProcess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				return basicSetIsA(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				if (resolve) return getIsA();
				return basicGetIsA();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				setIsA((EaProcess)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				setIsA((EaProcess)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A:
				return basicGetIsA() != null;
		}
		return super.eIsSet(featureID);
	}

} //EaStructuralExtendedActivityImpl
