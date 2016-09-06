/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VE Participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl#getVirtualEnterprise <em>Virtual Enterprise</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmVEParticipationImpl extends EObjectImpl implements BsmVEParticipation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmVEParticipationImpl() {
		super();
		this.setId(this.getClass().getSimpleName() + "_" + UUID.randomUUID().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BsmPackage.Literals.BSM_VE_PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(BsmPackage.BSM_VE_PARTICIPATION__ID, BsmPackage.Literals.BSM_VE_PARTICIPATION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_VE_PARTICIPATION__ID, BsmPackage.Literals.BSM_VE_PARTICIPATION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_VE_PARTICIPATION__NAME, BsmPackage.Literals.BSM_VE_PARTICIPATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_VE_PARTICIPATION__NAME, BsmPackage.Literals.BSM_VE_PARTICIPATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmEnterprise getEnterprise() {
		return (BsmEnterprise)eDynamicGet(BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE, BsmPackage.Literals.BSM_VE_PARTICIPATION__ENTERPRISE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmEnterprise basicGetEnterprise() {
		return (BsmEnterprise)eDynamicGet(BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE, BsmPackage.Literals.BSM_VE_PARTICIPATION__ENTERPRISE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterprise(BsmEnterprise newEnterprise, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnterprise, BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterprise(BsmEnterprise newEnterprise) {
		eDynamicSet(BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE, BsmPackage.Literals.BSM_VE_PARTICIPATION__ENTERPRISE, newEnterprise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmVirtualEnterprise getVirtualEnterprise() {
		return (BsmVirtualEnterprise)eDynamicGet(BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE, BsmPackage.Literals.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualEnterprise(BsmVirtualEnterprise newVirtualEnterprise, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVirtualEnterprise, BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualEnterprise(BsmVirtualEnterprise newVirtualEnterprise) {
		eDynamicSet(BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE, BsmPackage.Literals.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE, newVirtualEnterprise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Ve Participation";
		StringBuffer result = new StringBuffer();
		if (null == this.getName()) {
		result.append("<");
		result.append(nameElement);
		result.append(">");
		} else {
		result.append(nameElement);
		result.append(" ");
		result.append(this.getName());
		}
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				BsmEnterprise enterprise = basicGetEnterprise();
				if (enterprise != null)
					msgs = ((InternalEObject)enterprise).eInverseRemove(this, BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS, BsmEnterprise.class, msgs);
				return basicSetEnterprise((BsmEnterprise)otherEnd, msgs);
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVirtualEnterprise((BsmVirtualEnterprise)otherEnd, msgs);
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
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				return basicSetEnterprise(null, msgs);
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				return basicSetVirtualEnterprise(null, msgs);
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
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_VIRTUAL_ENTERPRISE__VE_PARTICIPATIONS, BsmVirtualEnterprise.class, msgs);
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
			case BsmPackage.BSM_VE_PARTICIPATION__ID:
				return getId();
			case BsmPackage.BSM_VE_PARTICIPATION__NAME:
				return getName();
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				if (resolve) return getEnterprise();
				return basicGetEnterprise();
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				return getVirtualEnterprise();
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
			case BsmPackage.BSM_VE_PARTICIPATION__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				setEnterprise((BsmEnterprise)newValue);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				setVirtualEnterprise((BsmVirtualEnterprise)newValue);
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
			case BsmPackage.BSM_VE_PARTICIPATION__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				setEnterprise((BsmEnterprise)null);
				return;
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				setVirtualEnterprise((BsmVirtualEnterprise)null);
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
			case BsmPackage.BSM_VE_PARTICIPATION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_VE_PARTICIPATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_VE_PARTICIPATION__ENTERPRISE:
				return basicGetEnterprise() != null;
			case BsmPackage.BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE:
				return getVirtualEnterprise() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmVEParticipationImpl
