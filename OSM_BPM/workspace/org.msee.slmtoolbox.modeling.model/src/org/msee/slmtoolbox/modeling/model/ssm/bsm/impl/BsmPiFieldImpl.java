/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pi Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl#getPerformanceIndicators <em>Performance Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmPiFieldImpl extends EObjectImpl implements BsmPiField {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BsmPiFieldImpl() {
		super();
		this.setId(this.getClass().getSimpleName() + "_" + UUID.randomUUID().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BsmPackage.Literals.BSM_PI_FIELD;
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
	public String getId() {
		return (String)eDynamicGet(BsmPackage.BSM_PI_FIELD__ID, BsmPackage.Literals.BSM_PI_FIELD__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_PI_FIELD__ID, BsmPackage.Literals.BSM_PI_FIELD__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_PI_FIELD__NAME, BsmPackage.Literals.BSM_PI_FIELD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_PI_FIELD__NAME, BsmPackage.Literals.BSM_PI_FIELD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPerformanceIndicator getPerformanceIndicators() {
		return (BsmPerformanceIndicator)eDynamicGet(BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS, BsmPackage.Literals.BSM_PI_FIELD__PERFORMANCE_INDICATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceIndicators(BsmPerformanceIndicator newPerformanceIndicators, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPerformanceIndicators, BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceIndicators(BsmPerformanceIndicator newPerformanceIndicators) {
		eDynamicSet(BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS, BsmPackage.Literals.BSM_PI_FIELD__PERFORMANCE_INDICATORS, newPerformanceIndicators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "PerformanceIndicatorField";
		StringBuffer result = new StringBuffer();
		if (null == this.getName()) {
		result.append("<");
		result.append(nameElement);
		result.append(">");
		} else {
		result.append(nameElement);
		result.append(" ");
		result.append(this.getName());
		}
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
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPerformanceIndicators((BsmPerformanceIndicator)otherEnd, msgs);
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
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				return basicSetPerformanceIndicators(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS, BsmPerformanceIndicator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BsmPackage.BSM_PI_FIELD__ID:
				return getId();
			case BsmPackage.BSM_PI_FIELD__NAME:
				return getName();
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				return getPerformanceIndicators();
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
			case BsmPackage.BSM_PI_FIELD__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_PI_FIELD__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				setPerformanceIndicators((BsmPerformanceIndicator)newValue);
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
			case BsmPackage.BSM_PI_FIELD__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_PI_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				setPerformanceIndicators((BsmPerformanceIndicator)null);
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
			case BsmPackage.BSM_PI_FIELD__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_PI_FIELD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_PI_FIELD__PERFORMANCE_INDICATORS:
				return getPerformanceIndicators() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmPiFieldImpl
