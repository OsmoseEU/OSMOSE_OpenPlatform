/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl#getVeParticipations <em>Ve Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmEnterpriseImpl extends BsmOrganizationImpl implements BsmEnterprise {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmEnterpriseImpl() {
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
		return BsmPackage.Literals.BSM_ENTERPRISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(BsmPackage.BSM_ENTERPRISE__TYPE, BsmPackage.Literals.BSM_ENTERPRISE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(BsmPackage.BSM_ENTERPRISE__TYPE, BsmPackage.Literals.BSM_ENTERPRISE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmResource> getResources() {
		return (EList<BsmResource>)eDynamicGet(BsmPackage.BSM_ENTERPRISE__RESOURCES, BsmPackage.Literals.BSM_ENTERPRISE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmVEParticipation> getVeParticipations() {
		return (EList<BsmVEParticipation>)eDynamicGet(BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS, BsmPackage.Literals.BSM_ENTERPRISE__VE_PARTICIPATIONS, true, true);
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
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVeParticipations()).basicAdd(otherEnd, msgs);
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
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				return ((InternalEList<?>)getVeParticipations()).basicRemove(otherEnd, msgs);
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
			case BsmPackage.BSM_ENTERPRISE__TYPE:
				return getType();
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				return getResources();
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				return getVeParticipations();
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
			case BsmPackage.BSM_ENTERPRISE__TYPE:
				setType((String)newValue);
				return;
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends BsmResource>)newValue);
				return;
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				getVeParticipations().clear();
				getVeParticipations().addAll((Collection<? extends BsmVEParticipation>)newValue);
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
			case BsmPackage.BSM_ENTERPRISE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				getResources().clear();
				return;
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				getVeParticipations().clear();
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
			case BsmPackage.BSM_ENTERPRISE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BsmPackage.BSM_ENTERPRISE__RESOURCES:
				return !getResources().isEmpty();
			case BsmPackage.BSM_ENTERPRISE__VE_PARTICIPATIONS:
				return !getVeParticipations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmEnterpriseImpl
