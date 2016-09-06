/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFlowImpl#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GgFlowImpl extends GgBaseElementImpl implements GgFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgNode getSource() {
		return (GgNode)eDynamicGet(CoreElementsPackage.GG_FLOW__SOURCE, CoreElementsPackage.Literals.GG_FLOW__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgNode basicGetSource() {
		return (GgNode)eDynamicGet(CoreElementsPackage.GG_FLOW__SOURCE, CoreElementsPackage.Literals.GG_FLOW__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(GgNode newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, CoreElementsPackage.GG_FLOW__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(GgNode newSource) {
		eDynamicSet(CoreElementsPackage.GG_FLOW__SOURCE, CoreElementsPackage.Literals.GG_FLOW__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgNode getTarget() {
		return (GgNode)eDynamicGet(CoreElementsPackage.GG_FLOW__TARGET, CoreElementsPackage.Literals.GG_FLOW__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgNode basicGetTarget() {
		return (GgNode)eDynamicGet(CoreElementsPackage.GG_FLOW__TARGET, CoreElementsPackage.Literals.GG_FLOW__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(GgNode newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CoreElementsPackage.GG_FLOW__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GgNode newTarget) {
		eDynamicSet(CoreElementsPackage.GG_FLOW__TARGET, CoreElementsPackage.Literals.GG_FLOW__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_FLOW__GRAI_GRID, CoreElementsPackage.Literals.GG_FLOW__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraiGrid, CoreElementsPackage.GG_FLOW__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(CoreElementsPackage.GG_FLOW__GRAI_GRID, CoreElementsPackage.Literals.GG_FLOW__GRAI_GRID, newGraiGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.GG_FLOW__SOURCE:
				GgNode source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, CoreElementsPackage.GG_NODE__IN_FLOWS, GgNode.class, msgs);
				return basicSetSource((GgNode)otherEnd, msgs);
			case CoreElementsPackage.GG_FLOW__TARGET:
				GgNode target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, CoreElementsPackage.GG_NODE__OUT_FLOWS, GgNode.class, msgs);
				return basicSetTarget((GgNode)otherEnd, msgs);
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
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
			case CoreElementsPackage.GG_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case CoreElementsPackage.GG_FLOW__TARGET:
				return basicSetTarget(null, msgs);
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
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
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__FLOWS, GgGraiGrid.class, msgs);
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
			case CoreElementsPackage.GG_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CoreElementsPackage.GG_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
				return getGraiGrid();
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
			case CoreElementsPackage.GG_FLOW__SOURCE:
				setSource((GgNode)newValue);
				return;
			case CoreElementsPackage.GG_FLOW__TARGET:
				setTarget((GgNode)newValue);
				return;
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
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
			case CoreElementsPackage.GG_FLOW__SOURCE:
				setSource((GgNode)null);
				return;
			case CoreElementsPackage.GG_FLOW__TARGET:
				setTarget((GgNode)null);
				return;
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
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
			case CoreElementsPackage.GG_FLOW__SOURCE:
				return basicGetSource() != null;
			case CoreElementsPackage.GG_FLOW__TARGET:
				return basicGetTarget() != null;
			case CoreElementsPackage.GG_FLOW__GRAI_GRID:
				return getGraiGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgFlowImpl
