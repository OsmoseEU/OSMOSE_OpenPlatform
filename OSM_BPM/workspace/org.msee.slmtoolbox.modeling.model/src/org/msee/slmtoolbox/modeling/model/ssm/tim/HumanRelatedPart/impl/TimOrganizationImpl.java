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
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getOrganizationUnits <em>Organization Units</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.TimOrganizationImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimOrganizationImpl extends EObjectImpl implements TimOrganization {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	protected TimOrganizationImpl() {
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
		return HumanRelatedPartPackage.Literals.TIM_ORGANIZATION;
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
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__ID, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__ID, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__NAME, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__NAME, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibility() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__RESPONSIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(String newResponsibility) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__RESPONSIBILITY, newResponsibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorization() {
		return (String)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__AUTHORIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(String newAuthorization) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__AUTHORIZATION, newAuthorization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimOrganizationUnit> getOrganizationUnits() {
		return (EList<TimOrganizationUnit>)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel getModel() {
		return (TimModel)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TimModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(TimModel newModel) {
		eDynamicSet(HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getProcesses() {
		return (EList<TimProcess>)eDynamicGet(HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES, HumanRelatedPartPackage.Literals.TIM_ORGANIZATION__PROCESSES, true, true);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizationUnits()).basicAdd(otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((TimModel)otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				return ((InternalEList<?>)getOrganizationUnits()).basicRemove(otherEnd, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				return basicSetModel(null, msgs);
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				return eInternalContainer().eInverseRemove(this, TimPackage.TIM_MODEL__ORGANIZATIONS, TimModel.class, msgs);
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ID:
				return getId();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__NAME:
				return getName();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE:
				return getType();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION:
				return getDescription();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY:
				return getResponsibility();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION:
				return getAuthorization();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				return getOrganizationUnits();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				return getModel();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ID:
				setId((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE:
				setType((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY:
				setResponsibility((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION:
				setAuthorization((String)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				getOrganizationUnits().clear();
				getOrganizationUnits().addAll((Collection<? extends TimOrganizationUnit>)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				setModel((TimModel)newValue);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ID:
				setId(ID_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY:
				setResponsibility(RESPONSIBILITY_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION:
				setAuthorization(AUTHORIZATION_EDEFAULT);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				getOrganizationUnits().clear();
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				setModel((TimModel)null);
				return;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__RESPONSIBILITY:
				return RESPONSIBILITY_EDEFAULT == null ? getResponsibility() != null : !RESPONSIBILITY_EDEFAULT.equals(getResponsibility());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__AUTHORIZATION:
				return AUTHORIZATION_EDEFAULT == null ? getAuthorization() != null : !AUTHORIZATION_EDEFAULT.equals(getAuthorization());
			case HumanRelatedPartPackage.TIM_ORGANIZATION__ORGANIZATION_UNITS:
				return !getOrganizationUnits().isEmpty();
			case HumanRelatedPartPackage.TIM_ORGANIZATION__MODEL:
				return getModel() != null;
			case HumanRelatedPartPackage.TIM_ORGANIZATION__PROCESSES:
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
		result.append("Organization ");
		result.append(this.getName());
		return result.toString();
	}

} //TimOrganizationImpl
