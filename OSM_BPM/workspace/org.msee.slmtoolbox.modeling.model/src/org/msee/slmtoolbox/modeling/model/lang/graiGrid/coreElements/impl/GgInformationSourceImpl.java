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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Information Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl#getInformationCenters <em>Information Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationSourceImpl#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GgInformationSourceImpl extends GgBaseElementImpl implements GgInformationSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgInformationSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_INFORMATION_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgInformationCenter> getInformationCenters() {
		return (EList<GgInformationCenter>)eDynamicGet(CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS, CoreElementsPackage.Literals.GG_INFORMATION_SOURCE__INFORMATION_CENTERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID, CoreElementsPackage.Literals.GG_INFORMATION_SOURCE__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraiGrid, CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID, CoreElementsPackage.Literals.GG_INFORMATION_SOURCE__GRAI_GRID, newGraiGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Information Source ");
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformationCenters()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				return ((InternalEList<?>)getInformationCenters()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES, GgGraiGrid.class, msgs);
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				return getInformationCenters();
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				getInformationCenters().clear();
				getInformationCenters().addAll((Collection<? extends GgInformationCenter>)newValue);
				return;
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				getInformationCenters().clear();
				return;
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
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
			case CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS:
				return !getInformationCenters().isEmpty();
			case CoreElementsPackage.GG_INFORMATION_SOURCE__GRAI_GRID:
				return getGraiGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgInformationSourceImpl
