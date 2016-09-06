/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Support Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaSupportFlowImpl#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaSupportFlowImpl extends EaFlowImpl implements EaSupportFlow {
	/**
	 * The default value of the '{@link #getResourceRole() <em>Resource Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final EaResourceRole RESOURCE_ROLE_EDEFAULT = EaResourceRole.RESPONSIBLE_FOR;

	/**
	 * The default value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBILITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaSupportFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_SUPPORT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaResourceRole getResourceRole() {
		return (EaResourceRole)eDynamicGet(CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE, CoreElementsPackage.Literals.EA_SUPPORT_FLOW__RESOURCE_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRole(EaResourceRole newResourceRole) {
		EList<EaFlow> inFlows = null;
		if(newResourceRole.equals(EaResourceRole.RESPONSIBLE_FOR)){
			inFlows  = this.getTarget().getInFlows();
			for (EaFlow eaFlow: inFlows){
				if (eaFlow instanceof EaSupportFlow){
					((EaSupportFlow) eaFlow).setResourceRole(EaResourceRole.PARTICIPATES_IN);
				}
			}
		}
		eDynamicSet(CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE, CoreElementsPackage.Literals.EA_SUPPORT_FLOW__RESOURCE_ROLE, newResourceRole);
		
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibility() {
		return (String)eDynamicGet(CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY, CoreElementsPackage.Literals.EA_SUPPORT_FLOW__RESPONSIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(String newResponsibility) {
		eDynamicSet(CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY, CoreElementsPackage.Literals.EA_SUPPORT_FLOW__RESPONSIBILITY, newResponsibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Support Flow");
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
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE:
				return getResourceRole();
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY:
				return getResponsibility();
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
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE:
				setResourceRole((EaResourceRole)newValue);
				return;
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY:
				setResponsibility((String)newValue);
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
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE:
				setResourceRole(RESOURCE_ROLE_EDEFAULT);
				return;
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY:
				setResponsibility(RESPONSIBILITY_EDEFAULT);
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
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESOURCE_ROLE:
				return getResourceRole() != RESOURCE_ROLE_EDEFAULT;
			case CoreElementsPackage.EA_SUPPORT_FLOW__RESPONSIBILITY:
				return RESPONSIBILITY_EDEFAULT == null ? getResponsibility() != null : !RESPONSIBILITY_EDEFAULT.equals(getResponsibility());
		}
		return super.eIsSet(featureID);
	}

} //EaSupportFlowImpl
