/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl#getPerformanceIndicators <em>Performance Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmDecisionObjectiveImpl extends EObjectImpl implements BsmDecisionObjective {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmDecisionObjectiveImpl() {
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
		return BsmPackage.Literals.BSM_DECISION_OBJECTIVE;
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
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecision getDecision() {
		return (BsmDecision)eDynamicGet(BsmPackage.BSM_DECISION_OBJECTIVE__DECISION, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__DECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(BsmDecision newDecision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDecision, BsmPackage.BSM_DECISION_OBJECTIVE__DECISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(BsmDecision newDecision) {
		eDynamicSet(BsmPackage.BSM_DECISION_OBJECTIVE__DECISION, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__DECISION, newDecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmPerformanceIndicator> getPerformanceIndicators() {
		return (EList<BsmPerformanceIndicator>)eDynamicGet(BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION_OBJECTIVE__ID, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION_OBJECTIVE__NAME, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_DECISION_OBJECTIVE__ID, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_DECISION_OBJECTIVE__NAME, BsmPackage.Literals.BSM_DECISION_OBJECTIVE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Objective";
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDecision((BsmDecision)otherEnd, msgs);
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformanceIndicators()).basicAdd(otherEnd, msgs);
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
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				return basicSetDecision(null, msgs);
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				return ((InternalEList<?>)getPerformanceIndicators()).basicRemove(otherEnd, msgs);
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
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_DECISION__OBJECTIVES, BsmDecision.class, msgs);
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
			case BsmPackage.BSM_DECISION_OBJECTIVE__ID:
				return getId();
			case BsmPackage.BSM_DECISION_OBJECTIVE__NAME:
				return getName();
			case BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				return getDecision();
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				return getPerformanceIndicators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BsmPackage.BSM_DECISION_OBJECTIVE__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				setDecision((BsmDecision)newValue);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				getPerformanceIndicators().clear();
				getPerformanceIndicators().addAll((Collection<? extends BsmPerformanceIndicator>)newValue);
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
			case BsmPackage.BSM_DECISION_OBJECTIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				setDecision((BsmDecision)null);
				return;
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				getPerformanceIndicators().clear();
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
			case BsmPackage.BSM_DECISION_OBJECTIVE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_DECISION_OBJECTIVE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_DECISION_OBJECTIVE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_DECISION_OBJECTIVE__DECISION:
				return getDecision() != null;
			case BsmPackage.BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS:
				return !getPerformanceIndicators().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmDecisionObjectiveImpl
