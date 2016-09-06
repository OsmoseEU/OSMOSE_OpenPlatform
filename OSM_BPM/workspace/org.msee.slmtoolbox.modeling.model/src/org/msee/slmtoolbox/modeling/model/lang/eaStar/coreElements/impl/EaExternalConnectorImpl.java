/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea External Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EaExternalConnectorImpl extends EaConnectorImpl implements EaExternalConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaExternalConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_EXTERNAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("External Connector ");
		result.append(this.getName());
		return result.toString();
	}

} //EaExternalConnectorImpl
