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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl#getOutFlows <em>Out Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl#getInFlows <em>In Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgNodeImpl#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GgNodeImpl extends GgBaseElementImpl implements GgNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgLevel getLevel() {
		return (GgLevel)eDynamicGet(CoreElementsPackage.GG_NODE__LEVEL, CoreElementsPackage.Literals.GG_NODE__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgLevel basicGetLevel() {
		return (GgLevel)eDynamicGet(CoreElementsPackage.GG_NODE__LEVEL, CoreElementsPackage.Literals.GG_NODE__LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(GgLevel newLevel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLevel, CoreElementsPackage.GG_NODE__LEVEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(GgLevel newLevel) {
		eDynamicSet(CoreElementsPackage.GG_NODE__LEVEL, CoreElementsPackage.Literals.GG_NODE__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgFlow> getOutFlows() {
		return (EList<GgFlow>)eDynamicGet(CoreElementsPackage.GG_NODE__OUT_FLOWS, CoreElementsPackage.Literals.GG_NODE__OUT_FLOWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgFlow> getInFlows() {
		return (EList<GgFlow>)eDynamicGet(CoreElementsPackage.GG_NODE__IN_FLOWS, CoreElementsPackage.Literals.GG_NODE__IN_FLOWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_NODE__GRAI_GRID, CoreElementsPackage.Literals.GG_NODE__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraiGrid, CoreElementsPackage.GG_NODE__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(CoreElementsPackage.GG_NODE__GRAI_GRID, CoreElementsPackage.Literals.GG_NODE__GRAI_GRID, newGraiGrid);
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				GgLevel level = basicGetLevel();
				if (level != null)
					msgs = ((InternalEObject)level).eInverseRemove(this, CoreElementsPackage.GG_LEVEL__NODES, GgLevel.class, msgs);
				return basicSetLevel((GgLevel)otherEnd, msgs);
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutFlows()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInFlows()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				return basicSetLevel(null, msgs);
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				return ((InternalEList<?>)getOutFlows()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				return ((InternalEList<?>)getInFlows()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
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
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__NODES, GgGraiGrid.class, msgs);
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				return getOutFlows();
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				return getInFlows();
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				setLevel((GgLevel)newValue);
				return;
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				getOutFlows().clear();
				getOutFlows().addAll((Collection<? extends GgFlow>)newValue);
				return;
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				getInFlows().clear();
				getInFlows().addAll((Collection<? extends GgFlow>)newValue);
				return;
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				setLevel((GgLevel)null);
				return;
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				getOutFlows().clear();
				return;
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				getInFlows().clear();
				return;
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
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
			case CoreElementsPackage.GG_NODE__LEVEL:
				return basicGetLevel() != null;
			case CoreElementsPackage.GG_NODE__OUT_FLOWS:
				return !getOutFlows().isEmpty();
			case CoreElementsPackage.GG_NODE__IN_FLOWS:
				return !getInFlows().isEmpty();
			case CoreElementsPackage.GG_NODE__GRAI_GRID:
				return getGraiGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgNodeImpl
