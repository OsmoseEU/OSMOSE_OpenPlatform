/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaFlowElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl#getInFlows <em>In Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowNodeImpl#getOutFlows <em>Out Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EaFlowNodeImpl extends EaFlowElementImpl implements EaFlowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaFlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaOrganization getOrganization() {
		return (EaOrganization)eDynamicGet(CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION, CoreElementsPackage.Literals.EA_FLOW_NODE__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaOrganization basicGetOrganization() {
		return (EaOrganization)eDynamicGet(CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION, CoreElementsPackage.Literals.EA_FLOW_NODE__ORGANIZATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(EaOrganization newOrganization, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganization, CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(EaOrganization newOrganization) {
		eDynamicSet(CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION, CoreElementsPackage.Literals.EA_FLOW_NODE__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaFlow> getInFlows() {
		return (EList<EaFlow>)eDynamicGet(CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS, CoreElementsPackage.Literals.EA_FLOW_NODE__IN_FLOWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaFlow> getOutFlows() {
		return (EList<EaFlow>)eDynamicGet(CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS, CoreElementsPackage.Literals.EA_FLOW_NODE__OUT_FLOWS, true, true);
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				EaOrganization organization = basicGetOrganization();
				if (organization != null)
					msgs = ((InternalEObject)organization).eInverseRemove(this, CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE, EaOrganization.class, msgs);
				return basicSetOrganization((EaOrganization)otherEnd, msgs);
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInFlows()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutFlows()).basicAdd(otherEnd, msgs);
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				return ((InternalEList<?>)getInFlows()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				return ((InternalEList<?>)getOutFlows()).basicRemove(otherEnd, msgs);
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				return getInFlows();
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				return getOutFlows();
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				setOrganization((EaOrganization)newValue);
				return;
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				getInFlows().clear();
				getInFlows().addAll((Collection<? extends EaFlow>)newValue);
				return;
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				getOutFlows().clear();
				getOutFlows().addAll((Collection<? extends EaFlow>)newValue);
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				setOrganization((EaOrganization)null);
				return;
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				getInFlows().clear();
				return;
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				getOutFlows().clear();
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
			case CoreElementsPackage.EA_FLOW_NODE__ORGANIZATION:
				return basicGetOrganization() != null;
			case CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS:
				return !getInFlows().isEmpty();
			case CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS:
				return !getOutFlows().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EaFlowNodeImpl
