/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaFlowElementImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EaFlowElementImpl extends EaBaseElementImpl implements EaFlowElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralElementsPackage.Literals.EA_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess getProcess() {
		return (EaProcess)eDynamicGet(GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS, GeneralElementsPackage.Literals.EA_FLOW_ELEMENT__PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(EaProcess newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(EaProcess newProcess) {
		eDynamicSet(GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS, GeneralElementsPackage.Literals.EA_FLOW_ELEMENT__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((EaProcess)otherEnd, msgs);
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				return basicSetProcess(null, msgs);
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				return eInternalContainer().eInverseRemove(this, GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS, EaProcess.class, msgs);
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				return getProcess();
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				setProcess((EaProcess)newValue);
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				setProcess((EaProcess)null);
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
			case GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS:
				return getProcess() != null;
		}
		return super.eIsSet(featureID);
	}

} //EaFlowElementImpl
