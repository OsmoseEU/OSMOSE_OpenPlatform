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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl#getGraiGrid <em>Grai Grid</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl#getDecisionCenters <em>Decision Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgFunctionImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgFunctionImpl extends GgBaseElementImpl implements GgFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_FUNCTION__GRAI_GRID, CoreElementsPackage.Literals.GG_FUNCTION__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid basicGetGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_FUNCTION__GRAI_GRID, CoreElementsPackage.Literals.GG_FUNCTION__GRAI_GRID, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGraiGrid, CoreElementsPackage.GG_FUNCTION__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(CoreElementsPackage.GG_FUNCTION__GRAI_GRID, CoreElementsPackage.Literals.GG_FUNCTION__GRAI_GRID, newGraiGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgDecisionCenter> getDecisionCenters() {
		return (EList<GgDecisionCenter>)eDynamicGet(CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS, CoreElementsPackage.Literals.GG_FUNCTION__DECISION_CENTERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgOrganization getOrganization() {
		return (GgOrganization)eDynamicGet(CoreElementsPackage.GG_FUNCTION__ORGANIZATION, CoreElementsPackage.Literals.GG_FUNCTION__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(GgOrganization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, CoreElementsPackage.GG_FUNCTION__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(GgOrganization newOrganization) {
		eDynamicSet(CoreElementsPackage.GG_FUNCTION__ORGANIZATION, CoreElementsPackage.Literals.GG_FUNCTION__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Function ");
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				GgGraiGrid graiGrid = basicGetGraiGrid();
				if (graiGrid != null)
					msgs = ((InternalEObject)graiGrid).eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS, GgGraiGrid.class, msgs);
				return basicSetGraiGrid((GgGraiGrid)otherEnd, msgs);
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisionCenters()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((GgOrganization)otherEnd, msgs);
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				return basicSetGraiGrid(null, msgs);
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				return ((InternalEList<?>)getDecisionCenters()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
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
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS, GgOrganization.class, msgs);
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				if (resolve) return getGraiGrid();
				return basicGetGraiGrid();
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				return getDecisionCenters();
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				return getOrganization();
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				setGraiGrid((GgGraiGrid)newValue);
				return;
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				getDecisionCenters().clear();
				getDecisionCenters().addAll((Collection<? extends GgDecisionCenter>)newValue);
				return;
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				setOrganization((GgOrganization)newValue);
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				setGraiGrid((GgGraiGrid)null);
				return;
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				getDecisionCenters().clear();
				return;
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				setOrganization((GgOrganization)null);
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
			case CoreElementsPackage.GG_FUNCTION__GRAI_GRID:
				return basicGetGraiGrid() != null;
			case CoreElementsPackage.GG_FUNCTION__DECISION_CENTERS:
				return !getDecisionCenters().isEmpty();
			case CoreElementsPackage.GG_FUNCTION__ORGANIZATION:
				return getOrganization() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgFunctionImpl
