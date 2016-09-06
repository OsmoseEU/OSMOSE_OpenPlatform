/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Process Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaProcessConnectorImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaProcessConnectorImpl extends EaConnectorImpl implements EaProcessConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaProcessConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_PROCESS_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess getProcessRef() {
		return (EaProcess)eDynamicGet(CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF, CoreElementsPackage.Literals.EA_PROCESS_CONNECTOR__PROCESS_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess basicGetProcessRef() {
		return (EaProcess)eDynamicGet(CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF, CoreElementsPackage.Literals.EA_PROCESS_CONNECTOR__PROCESS_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(EaProcess newProcessRef) {
		eDynamicSet(CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF, CoreElementsPackage.Literals.EA_PROCESS_CONNECTOR__PROCESS_REF, newProcessRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Process Connector ");
		result.append(this.getName());
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF:
				if (resolve) return getProcessRef();
				return basicGetProcessRef();
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
			case CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF:
				setProcessRef((EaProcess)newValue);
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
			case CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF:
				setProcessRef((EaProcess)null);
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
			case CoreElementsPackage.EA_PROCESS_CONNECTOR__PROCESS_REF:
				return basicGetProcessRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //EaProcessConnectorImpl
