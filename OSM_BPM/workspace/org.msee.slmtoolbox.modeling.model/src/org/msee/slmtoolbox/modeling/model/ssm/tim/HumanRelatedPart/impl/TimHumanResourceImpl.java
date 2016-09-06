/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Human Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimHumanResourceImpl#getExpectedPerformance <em>Expected Performance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimHumanResourceImpl extends TimResourceImpl implements TimHumanResource {
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
	 * The default value of the '{@link #getSkills() <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILLS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EDUCATION_LEVEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

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
	protected TimHumanResourceImpl() {
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
		return HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapability() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(String newCapability) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkills() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkills(String newSkills) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__SKILLS, newSkills);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEducationLevel() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEducationLevel(String newEducationLevel) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL, newEducationLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return (Integer)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__QUANTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectedPerformance() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedPerformance(String newExpectedPerformance) {
		eDynamicSet(HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE, HumanRelatedPartPackage.Literals.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE, newExpectedPerformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY:
				return getCapability();
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT:
				return getConstraint();
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS:
				return getSkills();
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL:
				return getEducationLevel();
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY:
				return getQuantity();
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE:
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
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY:
				setCapability((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS:
				setSkills((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL:
				setEducationLevel((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE:
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
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS:
				setSkills(SKILLS_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL:
				setEducationLevel(EDUCATION_LEVEL_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE:
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
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? getCapability() != null : !CAPABILITY_EDEFAULT.equals(getCapability());
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__SKILLS:
				return SKILLS_EDEFAULT == null ? getSkills() != null : !SKILLS_EDEFAULT.equals(getSkills());
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EDUCATION_LEVEL:
				return EDUCATION_LEVEL_EDEFAULT == null ? getEducationLevel() != null : !EDUCATION_LEVEL_EDEFAULT.equals(getEducationLevel());
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__QUANTITY:
				return getQuantity() != QUANTITY_EDEFAULT;
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE__EXPECTED_PERFORMANCE:
				return EXPECTED_PERFORMANCE_EDEFAULT == null ? getExpectedPerformance() != null : !EXPECTED_PERFORMANCE_EDEFAULT.equals(getExpectedPerformance());
		}
		return super.eIsSet(featureID);
	}

} //TimHumanResourceImpl
