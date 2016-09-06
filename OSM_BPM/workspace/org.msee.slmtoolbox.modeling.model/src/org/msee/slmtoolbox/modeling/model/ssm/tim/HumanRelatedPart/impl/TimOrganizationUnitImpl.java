/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationUnitImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimOrganizationUnitImpl extends EObjectImpl implements TimOrganizationUnit {
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
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

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
	 * The default value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimOrganizationUnitImpl() {
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
		return HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT;
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
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganization getOrganization() {
		return (TimOrganization)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(TimOrganization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(TimOrganization newOrganization) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimResource> getResources() {
		return (EList<TimResource>)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getProcesses() {
		return (EList<TimProcess>)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibility() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__RESPONSIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(String newResponsibility) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__RESPONSIBILITY, newResponsibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorization() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__AUTHORIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(String newAuthorization) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION_UNIT__AUTHORIZATION, newAuthorization);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((TimOrganization)otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS, TimOrganization.class, msgs);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID:
				return getId();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME:
				return getName();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION:
				return getFunction();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY:
				return getResponsibility();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION:
				return getAuthorization();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				return getOrganization();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				return getResources();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				return getProcesses();
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID:
				setId((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME:
				setName((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION:
				setFunction((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY:
				setResponsibility((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION:
				setAuthorization((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				setOrganization((TimOrganization)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends TimResource>)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends TimProcess>)newValue);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID:
				setId(ID_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY:
				setResponsibility(RESPONSIBILITY_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION:
				setAuthorization(AUTHORIZATION_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				setOrganization((TimOrganization)null);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				getResources().clear();
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				getProcesses().clear();
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__FUNCTION:
				return FUNCTION_EDEFAULT == null ? getFunction() != null : !FUNCTION_EDEFAULT.equals(getFunction());
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESPONSIBILITY:
				return RESPONSIBILITY_EDEFAULT == null ? getResponsibility() != null : !RESPONSIBILITY_EDEFAULT.equals(getResponsibility());
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__AUTHORIZATION:
				return AUTHORIZATION_EDEFAULT == null ? getAuthorization() != null : !AUTHORIZATION_EDEFAULT.equals(getAuthorization());
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__ORGANIZATION:
				return getOrganization() != null;
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES:
				return !getResources().isEmpty();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES:
				return !getProcesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("OU ");
		result.append(this.getName());
		return result.toString();
	}

} //TimOrganizationUnitImpl
