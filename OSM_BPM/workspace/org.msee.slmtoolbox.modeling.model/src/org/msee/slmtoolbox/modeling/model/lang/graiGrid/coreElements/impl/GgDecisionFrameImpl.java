/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.ecore.EClass;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Decision Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl#getDecisionVariable <em>Decision Variable</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgDecisionFrameImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgDecisionFrameImpl extends GgFlowImpl implements GgDecisionFrame {
	/**
	 * The default value of the '{@link #getDecisionVariable() <em>Decision Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String DECISION_VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

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
	 * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgDecisionFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_DECISION_FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecisionVariable() {
		return (String)eDynamicGet(CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE, CoreElementsPackage.Literals.GG_DECISION_FRAME__DECISION_VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionVariable(String newDecisionVariable) {
		eDynamicSet(CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE, CoreElementsPackage.Literals.GG_DECISION_FRAME__DECISION_VARIABLE, newDecisionVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE, CoreElementsPackage.Literals.GG_DECISION_FRAME__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE, CoreElementsPackage.Literals.GG_DECISION_FRAME__OBJECTIVE, newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT, CoreElementsPackage.Literals.GG_DECISION_FRAME__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT, CoreElementsPackage.Literals.GG_DECISION_FRAME__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteria() {
		return (String)eDynamicGet(CoreElementsPackage.GG_DECISION_FRAME__CRITERIA, CoreElementsPackage.Literals.GG_DECISION_FRAME__CRITERIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(String newCriteria) {
		eDynamicSet(CoreElementsPackage.GG_DECISION_FRAME__CRITERIA, CoreElementsPackage.Literals.GG_DECISION_FRAME__CRITERIA, newCriteria);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Decision Frame ");
		result.append(this.getName());
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
			case CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE:
				return getDecisionVariable();
			case CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE:
				return getObjective();
			case CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT:
				return getConstraint();
			case CoreElementsPackage.GG_DECISION_FRAME__CRITERIA:
				return getCriteria();
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
			case CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE:
				setDecisionVariable((String)newValue);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__CRITERIA:
				setCriteria((String)newValue);
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
			case CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE:
				setDecisionVariable(DECISION_VARIABLE_EDEFAULT);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case CoreElementsPackage.GG_DECISION_FRAME__CRITERIA:
				setCriteria(CRITERIA_EDEFAULT);
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
			case CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE:
				return DECISION_VARIABLE_EDEFAULT == null ? getDecisionVariable() != null : !DECISION_VARIABLE_EDEFAULT.equals(getDecisionVariable());
			case CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case CoreElementsPackage.GG_DECISION_FRAME__CRITERIA:
				return CRITERIA_EDEFAULT == null ? getCriteria() != null : !CRITERIA_EDEFAULT.equals(getCriteria());
		}
		return super.eIsSet(featureID);
	}

} //GgDecisionFrameImpl
