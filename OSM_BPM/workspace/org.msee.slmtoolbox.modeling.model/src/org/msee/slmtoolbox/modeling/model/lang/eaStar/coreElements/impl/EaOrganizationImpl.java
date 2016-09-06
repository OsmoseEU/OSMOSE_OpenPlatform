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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaBaseElementImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaOrganizationImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaOrganizationImpl extends EaBaseElementImpl implements EaOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaFlowNode> getFlowNode() {
		return (EList<EaFlowNode>)eDynamicGet(CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE, CoreElementsPackage.Literals.EA_ORGANIZATION__FLOW_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaModel getModel() {
		return (EaModel)eDynamicGet(CoreElementsPackage.EA_ORGANIZATION__MODEL, CoreElementsPackage.Literals.EA_ORGANIZATION__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(EaModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, CoreElementsPackage.EA_ORGANIZATION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(EaModel newModel) {
		eDynamicSet(CoreElementsPackage.EA_ORGANIZATION__MODEL, CoreElementsPackage.Literals.EA_ORGANIZATION__MODEL, newModel);
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowNode()).basicAdd(otherEnd, msgs);
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((EaModel)otherEnd, msgs);
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				return ((InternalEList<?>)getFlowNode()).basicRemove(otherEnd, msgs);
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				return basicSetModel(null, msgs);
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
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				return eInternalContainer().eInverseRemove(this, RootPackage.EA_MODEL__ORGANIZATIONS, EaModel.class, msgs);
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				return getFlowNode();
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				return getModel();
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				getFlowNode().clear();
				getFlowNode().addAll((Collection<? extends EaFlowNode>)newValue);
				return;
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				setModel((EaModel)newValue);
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				getFlowNode().clear();
				return;
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				setModel((EaModel)null);
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
			case CoreElementsPackage.EA_ORGANIZATION__FLOW_NODE:
				return !getFlowNode().isEmpty();
			case CoreElementsPackage.EA_ORGANIZATION__MODEL:
				return getModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //EaOrganizationImpl
