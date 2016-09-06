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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getDecisionStructure <em>Decision Structure</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getGgDecisionCenters <em>Gg Decision Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getPerformanceIndicators <em>Performance Indicators</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl#getObjectives <em>Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmDecisionImpl extends EObjectImpl implements BsmDecision {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BsmDecisionType TYPE_EDEFAULT = BsmDecisionType.PERIODIC;

	/**
	 * The default value of the '{@link #getHorizon() <em>Horizon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizon()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

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
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmDecisionImpl() {
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
		return BsmPackage.Literals.BSM_DECISION;
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
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__ID, BsmPackage.Literals.BSM_DECISION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_DECISION__ID, BsmPackage.Literals.BSM_DECISION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__NAME, BsmPackage.Literals.BSM_DECISION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_DECISION__NAME, BsmPackage.Literals.BSM_DECISION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionType getType() {
		return (BsmDecisionType)eDynamicGet(BsmPackage.BSM_DECISION__TYPE, BsmPackage.Literals.BSM_DECISION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BsmDecisionType newType) {
		eDynamicSet(BsmPackage.BSM_DECISION__TYPE, BsmPackage.Literals.BSM_DECISION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizon() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__HORIZON, BsmPackage.Literals.BSM_DECISION__HORIZON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizon(String newHorizon) {
		eDynamicSet(BsmPackage.BSM_DECISION__HORIZON, BsmPackage.Literals.BSM_DECISION__HORIZON, newHorizon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__PERIOD, BsmPackage.Literals.BSM_DECISION__PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		eDynamicSet(BsmPackage.BSM_DECISION__PERIOD, BsmPackage.Literals.BSM_DECISION__PERIOD, newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__CONSTRAINT, BsmPackage.Literals.BSM_DECISION__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_DECISION__CONSTRAINT, BsmPackage.Literals.BSM_DECISION__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__OBJECTIVE, BsmPackage.Literals.BSM_DECISION__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(BsmPackage.BSM_DECISION__OBJECTIVE, BsmPackage.Literals.BSM_DECISION__OBJECTIVE, newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__VARIABLE, BsmPackage.Literals.BSM_DECISION__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(BsmPackage.BSM_DECISION__VARIABLE, BsmPackage.Literals.BSM_DECISION__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION__EVENT, BsmPackage.Literals.BSM_DECISION__EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		eDynamicSet(BsmPackage.BSM_DECISION__EVENT, BsmPackage.Literals.BSM_DECISION__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionStructure getDecisionStructure() {
		return (BsmDecisionStructure)eDynamicGet(BsmPackage.BSM_DECISION__DECISION_STRUCTURE, BsmPackage.Literals.BSM_DECISION__DECISION_STRUCTURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetDecisionStructure(BsmDecisionStructure newDecisionStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDecisionStructure, BsmPackage.BSM_DECISION__DECISION_STRUCTURE, msgs);
		if (null!= newDecisionStructure && null != newDecisionStructure.getBsmModel()) {
			basicSetBsmModel(newDecisionStructure.getBsmModel(), null);
			((BsmModelImpl)newDecisionStructure.getBsmModel()).eInverseAdd(this, BsmPackage.BSM_MODEL__DECISIONS, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionStructure(BsmDecisionStructure newDecisionStructure) {
		eDynamicSet(BsmPackage.BSM_DECISION__DECISION_STRUCTURE, BsmPackage.Literals.BSM_DECISION__DECISION_STRUCTURE, newDecisionStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmOrganization getOrganization() {
		return (BsmOrganization)eDynamicGet(BsmPackage.BSM_DECISION__ORGANIZATION, BsmPackage.Literals.BSM_DECISION__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmOrganization basicGetOrganization() {
		return (BsmOrganization)eDynamicGet(BsmPackage.BSM_DECISION__ORGANIZATION, BsmPackage.Literals.BSM_DECISION__ORGANIZATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(BsmOrganization newOrganization, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganization, BsmPackage.BSM_DECISION__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(BsmOrganization newOrganization) {
		eDynamicSet(BsmPackage.BSM_DECISION__ORGANIZATION, BsmPackage.Literals.BSM_DECISION__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_DECISION__BSM_MODEL, BsmPackage.Literals.BSM_DECISION__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel basicGetBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_DECISION__BSM_MODEL, BsmPackage.Literals.BSM_DECISION__BSM_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBsmModel, BsmPackage.BSM_DECISION__BSM_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_DECISION__BSM_MODEL, BsmPackage.Literals.BSM_DECISION__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgDecisionCenter> getGgDecisionCenters() {
		return (EList<GgDecisionCenter>)eDynamicGet(BsmPackage.BSM_DECISION__GG_DECISION_CENTERS, BsmPackage.Literals.BSM_DECISION__GG_DECISION_CENTERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionVariable> getVariables() {
		return (EList<BsmDecisionVariable>)eDynamicGet(BsmPackage.BSM_DECISION__VARIABLES, BsmPackage.Literals.BSM_DECISION__VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmPerformanceIndicator> getPerformanceIndicators() {
		return (EList<BsmPerformanceIndicator>)eDynamicGet(BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS, BsmPackage.Literals.BSM_DECISION__PERFORMANCE_INDICATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionObjective> getObjectives() {
		return (EList<BsmDecisionObjective>)eDynamicGet(BsmPackage.BSM_DECISION__OBJECTIVES, BsmPackage.Literals.BSM_DECISION__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Decision";
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
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDecisionStructure((BsmDecisionStructure)otherEnd, msgs);
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				BsmOrganization organization = basicGetOrganization();
				if (organization != null)
					msgs = ((InternalEObject)organization).eInverseRemove(this, BsmPackage.BSM_ORGANIZATION__DECISIONS, BsmOrganization.class, msgs);
				return basicSetOrganization((BsmOrganization)otherEnd, msgs);
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				BsmModel bsmModel = basicGetBsmModel();
				if (bsmModel != null)
					msgs = ((InternalEObject)bsmModel).eInverseRemove(this, BsmPackage.BSM_MODEL__DECISIONS, BsmModel.class, msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
			case BsmPackage.BSM_DECISION__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformanceIndicators()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectives()).basicAdd(otherEnd, msgs);
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
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				return basicSetDecisionStructure(null, msgs);
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
			case BsmPackage.BSM_DECISION__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				return ((InternalEList<?>)getPerformanceIndicators()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
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
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS, BsmDecisionStructure.class, msgs);
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
			case BsmPackage.BSM_DECISION__ID:
				return getId();
			case BsmPackage.BSM_DECISION__NAME:
				return getName();
			case BsmPackage.BSM_DECISION__TYPE:
				return getType();
			case BsmPackage.BSM_DECISION__HORIZON:
				return getHorizon();
			case BsmPackage.BSM_DECISION__PERIOD:
				return getPeriod();
			case BsmPackage.BSM_DECISION__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_DECISION__OBJECTIVE:
				return getObjective();
			case BsmPackage.BSM_DECISION__VARIABLE:
				return getVariable();
			case BsmPackage.BSM_DECISION__EVENT:
				return getEvent();
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				return getDecisionStructure();
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				if (resolve) return getBsmModel();
				return basicGetBsmModel();
			case BsmPackage.BSM_DECISION__GG_DECISION_CENTERS:
				return getGgDecisionCenters();
			case BsmPackage.BSM_DECISION__VARIABLES:
				return getVariables();
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				return getPerformanceIndicators();
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				return getObjectives();
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
			case BsmPackage.BSM_DECISION__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__TYPE:
				setType((BsmDecisionType)newValue);
				return;
			case BsmPackage.BSM_DECISION__HORIZON:
				setHorizon((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__PERIOD:
				setPeriod((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__VARIABLE:
				setVariable((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__EVENT:
				setEvent((String)newValue);
				return;
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				setDecisionStructure((BsmDecisionStructure)newValue);
				return;
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				setOrganization((BsmOrganization)newValue);
				return;
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
				return;
			case BsmPackage.BSM_DECISION__GG_DECISION_CENTERS:
				getGgDecisionCenters().clear();
				getGgDecisionCenters().addAll((Collection<? extends GgDecisionCenter>)newValue);
				return;
			case BsmPackage.BSM_DECISION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends BsmDecisionVariable>)newValue);
				return;
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				getPerformanceIndicators().clear();
				getPerformanceIndicators().addAll((Collection<? extends BsmPerformanceIndicator>)newValue);
				return;
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends BsmDecisionObjective>)newValue);
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
			case BsmPackage.BSM_DECISION__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__HORIZON:
				setHorizon(HORIZON_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				setDecisionStructure((BsmDecisionStructure)null);
				return;
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				setOrganization((BsmOrganization)null);
				return;
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				setBsmModel((BsmModel)null);
				return;
			case BsmPackage.BSM_DECISION__GG_DECISION_CENTERS:
				getGgDecisionCenters().clear();
				return;
			case BsmPackage.BSM_DECISION__VARIABLES:
				getVariables().clear();
				return;
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				getPerformanceIndicators().clear();
				return;
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				getObjectives().clear();
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
			case BsmPackage.BSM_DECISION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_DECISION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_DECISION__TYPE:
				return getType() != TYPE_EDEFAULT;
			case BsmPackage.BSM_DECISION__HORIZON:
				return HORIZON_EDEFAULT == null ? getHorizon() != null : !HORIZON_EDEFAULT.equals(getHorizon());
			case BsmPackage.BSM_DECISION__PERIOD:
				return PERIOD_EDEFAULT == null ? getPeriod() != null : !PERIOD_EDEFAULT.equals(getPeriod());
			case BsmPackage.BSM_DECISION__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_DECISION__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case BsmPackage.BSM_DECISION__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case BsmPackage.BSM_DECISION__EVENT:
				return EVENT_EDEFAULT == null ? getEvent() != null : !EVENT_EDEFAULT.equals(getEvent());
			case BsmPackage.BSM_DECISION__DECISION_STRUCTURE:
				return getDecisionStructure() != null;
			case BsmPackage.BSM_DECISION__ORGANIZATION:
				return basicGetOrganization() != null;
			case BsmPackage.BSM_DECISION__BSM_MODEL:
				return basicGetBsmModel() != null;
			case BsmPackage.BSM_DECISION__GG_DECISION_CENTERS:
				return !getGgDecisionCenters().isEmpty();
			case BsmPackage.BSM_DECISION__VARIABLES:
				return !getVariables().isEmpty();
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
				return !getPerformanceIndicators().isEmpty();
			case BsmPackage.BSM_DECISION__OBJECTIVES:
				return !getObjectives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmDecisionImpl
