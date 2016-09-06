/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Control Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EaControlFlowImpl extends EaFlowImpl implements EaControlFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaControlFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_CONTROL_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Control Flow ");
		result.append(this.getName());
		return result.toString();
	}

} //EaControlFlowImpl
