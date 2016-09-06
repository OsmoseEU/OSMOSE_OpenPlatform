/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Physical Mean Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl#getOperationMode <em>Operation Mode</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl#getTechnicalCharacteristics <em>Technical Characteristics</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl#getExpectedPerformance <em>Expected Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimPhysicalMeanResourceImpl extends TimResourceImpl implements TimPhysicalMeanResource {
	/**
	 * The default value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOperationMode() <em>Operation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_MODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTechnicalCharacteristics() <em>Technical Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpectedPerformance() <em>Expected Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_PERFORMANCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimPhysicalMeanResourceImpl() {
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
		return PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapability() {
		return (String)eDynamicGet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(String newCapability) {
		eDynamicSet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationMode() {
		return (String)eDynamicGet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationMode(String newOperationMode) {
		eDynamicSet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE, newOperationMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalCharacteristics() {
		return (String)eDynamicGet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalCharacteristics(String newTechnicalCharacteristics) {
		eDynamicSet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS, newTechnicalCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectedPerformance() {
		return (String)eDynamicGet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedPerformance(String newExpectedPerformance) {
		eDynamicSet(PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE, PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE, newExpectedPerformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY:
				return getCapability();
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT:
				return getConstraint();
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE:
				return getOperationMode();
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS:
				return getTechnicalCharacteristics();
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE:
				return getExpectedPerformance();
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
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY:
				setCapability((String)newValue);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE:
				setOperationMode((String)newValue);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS:
				setTechnicalCharacteristics((String)newValue);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE:
				setExpectedPerformance((String)newValue);
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
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE:
				setOperationMode(OPERATION_MODE_EDEFAULT);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS:
				setTechnicalCharacteristics(TECHNICAL_CHARACTERISTICS_EDEFAULT);
				return;
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE:
				setExpectedPerformance(EXPECTED_PERFORMANCE_EDEFAULT);
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
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? getCapability() != null : !CAPABILITY_EDEFAULT.equals(getCapability());
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE:
				return OPERATION_MODE_EDEFAULT == null ? getOperationMode() != null : !OPERATION_MODE_EDEFAULT.equals(getOperationMode());
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS:
				return TECHNICAL_CHARACTERISTICS_EDEFAULT == null ? getTechnicalCharacteristics() != null : !TECHNICAL_CHARACTERISTICS_EDEFAULT.equals(getTechnicalCharacteristics());
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE:
				return EXPECTED_PERFORMANCE_EDEFAULT == null ? getExpectedPerformance() != null : !EXPECTED_PERFORMANCE_EDEFAULT.equals(getExpectedPerformance());
		}
		return super.eIsSet(featureID);
	}

} //TimPhysicalMeanResourceImpl
