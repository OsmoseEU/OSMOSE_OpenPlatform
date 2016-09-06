/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Time Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgTimeValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgTimeValueImpl extends EObjectImpl implements GgTimeValue {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GgTimeUnits UNIT_EDEFAULT = GgTimeUnits.YEAR;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgTimeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_TIME_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeUnits getUnit() {
		return (GgTimeUnits)eDynamicGet(CoreElementsPackage.GG_TIME_VALUE__UNIT, CoreElementsPackage.Literals.GG_TIME_VALUE__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GgTimeUnits newUnit) {
		eDynamicSet(CoreElementsPackage.GG_TIME_VALUE__UNIT, CoreElementsPackage.Literals.GG_TIME_VALUE__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return (Integer)eDynamicGet(CoreElementsPackage.GG_TIME_VALUE__VALUE, CoreElementsPackage.Literals.GG_TIME_VALUE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		eDynamicSet(CoreElementsPackage.GG_TIME_VALUE__VALUE, CoreElementsPackage.Literals.GG_TIME_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append(this.getValue());
		result.append(" ");
		result.append(this.getUnit());
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.GG_TIME_VALUE__UNIT:
				return getUnit();
			case CoreElementsPackage.GG_TIME_VALUE__VALUE:
				return getValue();
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
			case CoreElementsPackage.GG_TIME_VALUE__UNIT:
				setUnit((GgTimeUnits)newValue);
				return;
			case CoreElementsPackage.GG_TIME_VALUE__VALUE:
				setValue((Integer)newValue);
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
			case CoreElementsPackage.GG_TIME_VALUE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case CoreElementsPackage.GG_TIME_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case CoreElementsPackage.GG_TIME_VALUE__UNIT:
				return getUnit() != UNIT_EDEFAULT;
			case CoreElementsPackage.GG_TIME_VALUE__VALUE:
				return getValue() != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //GgTimeValueImpl
