/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.impl;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getInformations <em>Informations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimModelImpl extends EObjectImpl implements TimModel {
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
	protected TimModelImpl() {
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
		return TimPackage.Literals.TIM_MODEL;
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
		return (String)eDynamicGet(TimPackage.TIM_MODEL__ID, TimPackage.Literals.TIM_MODEL__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(TimPackage.TIM_MODEL__ID, TimPackage.Literals.TIM_MODEL__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TimPackage.TIM_MODEL__NAME, TimPackage.Literals.TIM_MODEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TimPackage.TIM_MODEL__NAME, TimPackage.Literals.TIM_MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimService> getServices() {
		return (EList<TimService>)eDynamicGet(TimPackage.TIM_MODEL__SERVICES, TimPackage.Literals.TIM_MODEL__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getProcesses() {
		return (EList<TimProcess>)eDynamicGet(TimPackage.TIM_MODEL__PROCESSES, TimPackage.Literals.TIM_MODEL__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationSet> getInformations() {
		return (EList<TimInformationSet>)eDynamicGet(TimPackage.TIM_MODEL__INFORMATIONS, TimPackage.Literals.TIM_MODEL__INFORMATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimOrganization> getOrganizations() {
		return (EList<TimOrganization>)eDynamicGet(TimPackage.TIM_MODEL__ORGANIZATIONS, TimPackage.Literals.TIM_MODEL__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimResource> getResources() {
		return (EList<TimResource>)eDynamicGet(TimPackage.TIM_MODEL__RESOURCES, TimPackage.Literals.TIM_MODEL__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Model";
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimPackage.TIM_MODEL__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case TimPackage.TIM_MODEL__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case TimPackage.TIM_MODEL__INFORMATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformations()).basicAdd(otherEnd, msgs);
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case TimPackage.TIM_MODEL__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case TimPackage.TIM_MODEL__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case TimPackage.TIM_MODEL__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case TimPackage.TIM_MODEL__INFORMATIONS:
				return ((InternalEList<?>)getInformations()).basicRemove(otherEnd, msgs);
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case TimPackage.TIM_MODEL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case TimPackage.TIM_MODEL__ID:
				return getId();
			case TimPackage.TIM_MODEL__NAME:
				return getName();
			case TimPackage.TIM_MODEL__SERVICES:
				return getServices();
			case TimPackage.TIM_MODEL__PROCESSES:
				return getProcesses();
			case TimPackage.TIM_MODEL__INFORMATIONS:
				return getInformations();
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				return getOrganizations();
			case TimPackage.TIM_MODEL__RESOURCES:
				return getResources();
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
			case TimPackage.TIM_MODEL__ID:
				setId((String)newValue);
				return;
			case TimPackage.TIM_MODEL__NAME:
				setName((String)newValue);
				return;
			case TimPackage.TIM_MODEL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends TimService>)newValue);
				return;
			case TimPackage.TIM_MODEL__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends TimProcess>)newValue);
				return;
			case TimPackage.TIM_MODEL__INFORMATIONS:
				getInformations().clear();
				getInformations().addAll((Collection<? extends TimInformationSet>)newValue);
				return;
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends TimOrganization>)newValue);
				return;
			case TimPackage.TIM_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends TimResource>)newValue);
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
			case TimPackage.TIM_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case TimPackage.TIM_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TimPackage.TIM_MODEL__SERVICES:
				getServices().clear();
				return;
			case TimPackage.TIM_MODEL__PROCESSES:
				getProcesses().clear();
				return;
			case TimPackage.TIM_MODEL__INFORMATIONS:
				getInformations().clear();
				return;
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case TimPackage.TIM_MODEL__RESOURCES:
				getResources().clear();
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
			case TimPackage.TIM_MODEL__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case TimPackage.TIM_MODEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TimPackage.TIM_MODEL__SERVICES:
				return !getServices().isEmpty();
			case TimPackage.TIM_MODEL__PROCESSES:
				return !getProcesses().isEmpty();
			case TimPackage.TIM_MODEL__INFORMATIONS:
				return !getInformations().isEmpty();
			case TimPackage.TIM_MODEL__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case TimPackage.TIM_MODEL__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimModelImpl
