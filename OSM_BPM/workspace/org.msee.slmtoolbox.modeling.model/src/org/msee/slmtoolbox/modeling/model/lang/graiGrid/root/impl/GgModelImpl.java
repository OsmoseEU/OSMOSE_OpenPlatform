/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl#getGraiGrids <em>Grai Grids</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgModelImpl extends GgBaseElementImpl implements GgModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootPackage.Literals.GG_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgGraiGrid> getGraiGrids() {
		return (EList<GgGraiGrid>)eDynamicGet(RootPackage.GG_MODEL__GRAI_GRIDS, RootPackage.Literals.GG_MODEL__GRAI_GRIDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgOrganization> getOrganizations() {
		return (EList<GgOrganization>)eDynamicGet(RootPackage.GG_MODEL__ORGANIZATIONS, RootPackage.Literals.GG_MODEL__ORGANIZATIONS, true, true);
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
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGraiGrids()).basicAdd(otherEnd, msgs);
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
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
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				return ((InternalEList<?>)getGraiGrids()).basicRemove(otherEnd, msgs);
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				return getGraiGrids();
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				return getOrganizations();
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
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				getGraiGrids().clear();
				getGraiGrids().addAll((Collection<? extends GgGraiGrid>)newValue);
				return;
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends GgOrganization>)newValue);
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
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				getGraiGrids().clear();
				return;
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
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
			case RootPackage.GG_MODEL__GRAI_GRIDS:
				return !getGraiGrids().isEmpty();
			case RootPackage.GG_MODEL__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GgModelImpl
