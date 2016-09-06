/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Decision Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionCenterImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgDecisionCenterImpl extends GgNodeImpl implements GgDecisionCenter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgDecisionCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_DECISION_CENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgFunction getFunction() {
		return (GgFunction)eDynamicGet(CoreElementsPackage.GG_DECISION_CENTER__FUNCTION, CoreElementsPackage.Literals.GG_DECISION_CENTER__FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgFunction basicGetFunction() {
		return (GgFunction)eDynamicGet(CoreElementsPackage.GG_DECISION_CENTER__FUNCTION, CoreElementsPackage.Literals.GG_DECISION_CENTER__FUNCTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(GgFunction newFunction, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFunction, CoreElementsPackage.GG_DECISION_CENTER__FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(GgFunction newFunction) {
		eDynamicSet(CoreElementsPackage.GG_DECISION_CENTER__FUNCTION, CoreElementsPackage.Literals.GG_DECISION_CENTER__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Decision Center ");
		result.append(this.getName());
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				GgFunction function = basicGetFunction();
				if (function != null)
					msgs = ((InternalEObject)function).eInverseRemove(this, CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS, GgFunction.class, msgs);
				return basicSetFunction((GgFunction)otherEnd, msgs);
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
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				setFunction((GgFunction)newValue);
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
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				setFunction((GgFunction)null);
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
			case CoreElementsPackage.GG_DECISION_CENTER__FUNCTION:
				return basicGetFunction() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgDecisionCenterImpl
