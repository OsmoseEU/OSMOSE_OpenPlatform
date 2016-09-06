/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaBaseElementImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaModelImpl extends EaBaseElementImpl implements EaModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootPackage.Literals.EA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess getProcess() {
		return (EaProcess)eDynamicGet(RootPackage.EA_MODEL__PROCESS, RootPackage.Literals.EA_MODEL__PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(EaProcess newProcess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProcess, RootPackage.EA_MODEL__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(EaProcess newProcess) {
		eDynamicSet(RootPackage.EA_MODEL__PROCESS, RootPackage.Literals.EA_MODEL__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaOrganization> getOrganizations() {
		return (EList<EaOrganization>)eDynamicGet(RootPackage.EA_MODEL__ORGANIZATIONS, RootPackage.Literals.EA_MODEL__ORGANIZATIONS, true, true);
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
			case RootPackage.EA_MODEL__PROCESS:
				EaProcess process = getProcess();
				if (process != null)
					msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RootPackage.EA_MODEL__PROCESS, null, msgs);
				return basicSetProcess((EaProcess)otherEnd, msgs);
			case RootPackage.EA_MODEL__ORGANIZATIONS:
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
			case RootPackage.EA_MODEL__PROCESS:
				return basicSetProcess(null, msgs);
			case RootPackage.EA_MODEL__ORGANIZATIONS:
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
			case RootPackage.EA_MODEL__PROCESS:
				return getProcess();
			case RootPackage.EA_MODEL__ORGANIZATIONS:
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
			case RootPackage.EA_MODEL__PROCESS:
				setProcess((EaProcess)newValue);
				return;
			case RootPackage.EA_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends EaOrganization>)newValue);
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
			case RootPackage.EA_MODEL__PROCESS:
				setProcess((EaProcess)null);
				return;
			case RootPackage.EA_MODEL__ORGANIZATIONS:
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
			case RootPackage.EA_MODEL__PROCESS:
				return getProcess() != null;
			case RootPackage.EA_MODEL__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EaModelImpl
