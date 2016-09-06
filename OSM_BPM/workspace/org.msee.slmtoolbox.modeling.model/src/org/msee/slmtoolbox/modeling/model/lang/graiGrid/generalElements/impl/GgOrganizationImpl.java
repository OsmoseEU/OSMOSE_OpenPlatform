/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgOrganizationImpl extends GgBaseElementImpl implements GgOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralElementsPackage.Literals.GG_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgFunction> getFunctions() {
		return (EList<GgFunction>)eDynamicGet(GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS, GeneralElementsPackage.Literals.GG_ORGANIZATION__FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgModel getModel() {
		return (GgModel)eDynamicGet(GeneralElementsPackage.GG_ORGANIZATION__MODEL, GeneralElementsPackage.Literals.GG_ORGANIZATION__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(GgModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, GeneralElementsPackage.GG_ORGANIZATION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(GgModel newModel) {
		eDynamicSet(GeneralElementsPackage.GG_ORGANIZATION__MODEL, GeneralElementsPackage.Literals.GG_ORGANIZATION__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid getGraiGrid() {
		return (GgGraiGrid)eDynamicGet(GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID, GeneralElementsPackage.Literals.GG_ORGANIZATION__GRAI_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid basicGetGraiGrid() {
		return (GgGraiGrid)eDynamicGet(GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID, GeneralElementsPackage.Literals.GG_ORGANIZATION__GRAI_GRID, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraiGrid(GgGraiGrid newGraiGrid, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGraiGrid, GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraiGrid(GgGraiGrid newGraiGrid) {
		eDynamicSet(GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID, GeneralElementsPackage.Literals.GG_ORGANIZATION__GRAI_GRID, newGraiGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Enterprise ");
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((GgModel)otherEnd, msgs);
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
				GgGraiGrid graiGrid = basicGetGraiGrid();
				if (graiGrid != null)
					msgs = ((InternalEObject)graiGrid).eInverseRemove(this, GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS, GgGraiGrid.class, msgs);
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				return basicSetModel(null, msgs);
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
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
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				return eInternalContainer().eInverseRemove(this, RootPackage.GG_MODEL__ORGANIZATIONS, GgModel.class, msgs);
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				return getFunctions();
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				return getModel();
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
				if (resolve) return getGraiGrid();
				return basicGetGraiGrid();
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends GgFunction>)newValue);
				return;
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				setModel((GgModel)newValue);
				return;
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				getFunctions().clear();
				return;
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				setModel((GgModel)null);
				return;
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
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
			case GeneralElementsPackage.GG_ORGANIZATION__FUNCTIONS:
				return !getFunctions().isEmpty();
			case GeneralElementsPackage.GG_ORGANIZATION__MODEL:
				return getModel() != null;
			case GeneralElementsPackage.GG_ORGANIZATION__GRAI_GRID:
				return basicGetGraiGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgOrganizationImpl
