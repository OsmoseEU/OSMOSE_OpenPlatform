/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl#getProcessingUnit <em>Processing Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgLevelImpl#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgLevelImpl extends GgBaseElementImpl implements GgLevel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgNode> getNodes() {
		return (EList<GgNode>)eDynamicGet(CoreElementsPackage.GG_LEVEL__NODES, CoreElementsPackage.Literals.GG_LEVEL__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeValue getHorizon() {
		return (GgTimeValue)eDynamicGet(CoreElementsPackage.GG_LEVEL__HORIZON, CoreElementsPackage.Literals.GG_LEVEL__HORIZON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHorizon(GgTimeValue newHorizon, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHorizon, CoreElementsPackage.GG_LEVEL__HORIZON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizon(GgTimeValue newHorizon) {
		eDynamicSet(CoreElementsPackage.GG_LEVEL__HORIZON, CoreElementsPackage.Literals.GG_LEVEL__HORIZON, newHorizon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeValue getPeriod() {
		return (GgTimeValue)eDynamicGet(CoreElementsPackage.GG_LEVEL__PERIOD, CoreElementsPackage.Literals.GG_LEVEL__PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(GgTimeValue newPeriod, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPeriod, CoreElementsPackage.GG_LEVEL__PERIOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(GgTimeValue newPeriod) {
		eDynamicSet(CoreElementsPackage.GG_LEVEL__PERIOD, CoreElementsPackage.Literals.GG_LEVEL__PERIOD, newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeValue getProcessingUnit() {
		return (GgTimeValue)eDynamicGet(CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT, CoreElementsPackage.Literals.GG_LEVEL__PROCESSING_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingUnit(GgTimeValue newProcessingUnit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProcessingUnit, CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingUnit(GgTimeValue newProcessingUnit) {
		eDynamicSet(CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT, CoreElementsPackage.Literals.GG_LEVEL__PROCESSING_UNIT, newProcessingUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_LEVEL__GRAI_GRID, CoreElementsPackage.Literals.GG_LEVEL__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraiGrid, CoreElementsPackage.GG_LEVEL__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(CoreElementsPackage.GG_LEVEL__GRAI_GRID, CoreElementsPackage.Literals.GG_LEVEL__GRAI_GRID, newGraiGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Level ");
		result.append(this.getName());
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraiGrid((GgGraiGrid)otherEnd, msgs);
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.GG_LEVEL__HORIZON:
				return basicSetHorizon(null, msgs);
			case CoreElementsPackage.GG_LEVEL__PERIOD:
				return basicSetPeriod(null, msgs);
			case CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT:
				return basicSetProcessingUnit(null, msgs);
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				return basicSetGraiGrid(null, msgs);
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
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__LEVELS, GgGraiGrid.class, msgs);
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				return getNodes();
			case CoreElementsPackage.GG_LEVEL__HORIZON:
				return getHorizon();
			case CoreElementsPackage.GG_LEVEL__PERIOD:
				return getPeriod();
			case CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT:
				return getProcessingUnit();
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				return getGraiGrid();
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GgNode>)newValue);
				return;
			case CoreElementsPackage.GG_LEVEL__HORIZON:
				setHorizon((GgTimeValue)newValue);
				return;
			case CoreElementsPackage.GG_LEVEL__PERIOD:
				setPeriod((GgTimeValue)newValue);
				return;
			case CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT:
				setProcessingUnit((GgTimeValue)newValue);
				return;
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				setGraiGrid((GgGraiGrid)newValue);
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				getNodes().clear();
				return;
			case CoreElementsPackage.GG_LEVEL__HORIZON:
				setHorizon((GgTimeValue)null);
				return;
			case CoreElementsPackage.GG_LEVEL__PERIOD:
				setPeriod((GgTimeValue)null);
				return;
			case CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT:
				setProcessingUnit((GgTimeValue)null);
				return;
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				setGraiGrid((GgGraiGrid)null);
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
			case CoreElementsPackage.GG_LEVEL__NODES:
				return !getNodes().isEmpty();
			case CoreElementsPackage.GG_LEVEL__HORIZON:
				return getHorizon() != null;
			case CoreElementsPackage.GG_LEVEL__PERIOD:
				return getPeriod() != null;
			case CoreElementsPackage.GG_LEVEL__PROCESSING_UNIT:
				return getProcessingUnit() != null;
			case CoreElementsPackage.GG_LEVEL__GRAI_GRID:
				return getGraiGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgLevelImpl
