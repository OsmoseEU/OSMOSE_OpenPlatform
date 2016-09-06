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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getRequiredInfo <em>Required Info</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getRequiredProcessing <em>Required Processing</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getCategory1 <em>Category1</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getCategory2 <em>Category2</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getCategory3 <em>Category3</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmPerformanceIndicatorImpl extends EObjectImpl implements BsmPerformanceIndicator {
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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRequiredInfo() <em>Required Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_INFO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRequiredProcessing() <em>Required Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_PROCESSING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategory1() <em>Category1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory1()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategory2() <em>Category2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory2()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY2_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategory3() <em>Category3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory3()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY3_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BsmPerformanceIndicatorImpl() {
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
		return BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR;
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
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__ID, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__ID, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FORMULA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FORMULA, newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredInfo() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredInfo(String newRequiredInfo) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO, newRequiredInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredProcessing() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredProcessing(String newRequiredProcessing) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING, newRequiredProcessing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecision getDecision() {
		return (BsmDecision)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(BsmDecision newDecision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDecision, BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(BsmDecision newDecision) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DECISION, newDecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionVariable> getVariables() {
		return (EList<BsmDecisionVariable>)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionObjective> getObjectives() {
		return (EList<BsmDecisionObjective>)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory1() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory1(String newCategory1) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY1, newCategory1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory2() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory2(String newCategory2) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY2, newCategory2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory3() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY3, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory3(String newCategory3) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY3, newCategory3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimension() {
		return (String)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DIMENSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(String newDimension) {
		eDynamicSet(BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DIMENSION, newDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmPiField> getFields() {
		return (EList<BsmPiField>)eDynamicGet(BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS, BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "PerformanceIndicator";
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDecision((BsmDecision)otherEnd, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectives()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				return basicSetDecision(null, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS, BsmDecision.class, msgs);
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__ID:
				return getId();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME:
				return getName();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT:
				return getUnit();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA:
				return getFormula();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO:
				return getRequiredInfo();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING:
				return getRequiredProcessing();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				return getDecision();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				return getVariables();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				return getObjectives();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1:
				return getCategory1();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2:
				return getCategory2();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3:
				return getCategory3();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION:
				return getDimension();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				return getFields();
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT:
				setUnit((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA:
				setFormula((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO:
				setRequiredInfo((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING:
				setRequiredProcessing((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				setDecision((BsmDecision)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends BsmDecisionVariable>)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends BsmDecisionObjective>)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1:
				setCategory1((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2:
				setCategory2((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3:
				setCategory3((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION:
				setDimension((String)newValue);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends BsmPiField>)newValue);
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO:
				setRequiredInfo(REQUIRED_INFO_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING:
				setRequiredProcessing(REQUIRED_PROCESSING_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				setDecision((BsmDecision)null);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				getVariables().clear();
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				getObjectives().clear();
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1:
				setCategory1(CATEGORY1_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2:
				setCategory2(CATEGORY2_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3:
				setCategory3(CATEGORY3_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				getFields().clear();
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
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT:
				return UNIT_EDEFAULT == null ? getUnit() != null : !UNIT_EDEFAULT.equals(getUnit());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA:
				return FORMULA_EDEFAULT == null ? getFormula() != null : !FORMULA_EDEFAULT.equals(getFormula());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO:
				return REQUIRED_INFO_EDEFAULT == null ? getRequiredInfo() != null : !REQUIRED_INFO_EDEFAULT.equals(getRequiredInfo());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING:
				return REQUIRED_PROCESSING_EDEFAULT == null ? getRequiredProcessing() != null : !REQUIRED_PROCESSING_EDEFAULT.equals(getRequiredProcessing());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DECISION:
				return getDecision() != null;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__VARIABLES:
				return !getVariables().isEmpty();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__OBJECTIVES:
				return !getObjectives().isEmpty();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1:
				return CATEGORY1_EDEFAULT == null ? getCategory1() != null : !CATEGORY1_EDEFAULT.equals(getCategory1());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2:
				return CATEGORY2_EDEFAULT == null ? getCategory2() != null : !CATEGORY2_EDEFAULT.equals(getCategory2());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3:
				return CATEGORY3_EDEFAULT == null ? getCategory3() != null : !CATEGORY3_EDEFAULT.equals(getCategory3());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION:
				return DIMENSION_EDEFAULT == null ? getDimension() != null : !DIMENSION_EDEFAULT.equals(getDimension());
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				return !getFields().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmPerformanceIndicatorImpl
