/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TimResourceImpl extends EObjectImpl implements TimResource {
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
	protected TimResourceImpl() {
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
		return CommonConceptsPackage.Literals.TIM_RESOURCE;
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
		return (String)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__ID, CommonConceptsPackage.Literals.TIM_RESOURCE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__ID, CommonConceptsPackage.Literals.TIM_RESOURCE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__NAME, CommonConceptsPackage.Literals.TIM_RESOURCE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__NAME, CommonConceptsPackage.Literals.TIM_RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__FUNCTION, CommonConceptsPackage.Literals.TIM_RESOURCE__FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__FUNCTION, CommonConceptsPackage.Literals.TIM_RESOURCE__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__TYPE, CommonConceptsPackage.Literals.TIM_RESOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__TYPE, CommonConceptsPackage.Literals.TIM_RESOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getProcesses() {
		return (EList<TimProcess>)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__PROCESSES, CommonConceptsPackage.Literals.TIM_RESOURCE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel getModel() {
		return (TimModel)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__MODEL, CommonConceptsPackage.Literals.TIM_RESOURCE__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel basicGetModel() {
		return (TimModel)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__MODEL, CommonConceptsPackage.Literals.TIM_RESOURCE__MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TimModel newModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newModel, CommonConceptsPackage.TIM_RESOURCE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(TimModel newModel) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__MODEL, CommonConceptsPackage.Literals.TIM_RESOURCE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganizationUnit getOrganizationUnit() {
		return (TimOrganizationUnit)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT, CommonConceptsPackage.Literals.TIM_RESOURCE__ORGANIZATION_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOrganizationUnit(TimOrganizationUnit newOrganizationUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganizationUnit, CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT, msgs);
		if (null!= newOrganizationUnit && null != newOrganizationUnit.getOrganization()) {
			TimModel model = newOrganizationUnit.getOrganization().getModel();
			basicSetModel(model, null);
			((TimModelImpl)model).eInverseAdd(this, TimPackage.TIM_MODEL__RESOURCES, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationUnit(TimOrganizationUnit newOrganizationUnit) {
		eDynamicSet(CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT, CommonConceptsPackage.Literals.TIM_RESOURCE__ORGANIZATION_UNIT, newOrganizationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimService> getServices() {
		return (EList<TimService>)eDynamicGet(CommonConceptsPackage.TIM_RESOURCE__SERVICES, CommonConceptsPackage.Literals.TIM_RESOURCE__SERVICES, true, true);
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
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				TimModel model = basicGetModel();
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, TimPackage.TIM_MODEL__RESOURCES, TimModel.class, msgs);
				return basicSetModel((TimModel)otherEnd, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganizationUnit((TimOrganizationUnit)otherEnd, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
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
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				return basicSetModel(null, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				return basicSetOrganizationUnit(null, msgs);
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				return eInternalContainer().eInverseRemove(this, HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__RESOURCES, TimOrganizationUnit.class, msgs);
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
			case CommonConceptsPackage.TIM_RESOURCE__ID:
				return getId();
			case CommonConceptsPackage.TIM_RESOURCE__NAME:
				return getName();
			case CommonConceptsPackage.TIM_RESOURCE__FUNCTION:
				return getFunction();
			case CommonConceptsPackage.TIM_RESOURCE__TYPE:
				return getType();
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				return getProcesses();
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				return getOrganizationUnit();
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				return getServices();
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
			case CommonConceptsPackage.TIM_RESOURCE__ID:
				setId((String)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__FUNCTION:
				setFunction((String)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__TYPE:
				setType((String)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends TimProcess>)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				setModel((TimModel)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				setOrganizationUnit((TimOrganizationUnit)newValue);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends TimService>)newValue);
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
			case CommonConceptsPackage.TIM_RESOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				getProcesses().clear();
				return;
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				setModel((TimModel)null);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				setOrganizationUnit((TimOrganizationUnit)null);
				return;
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				getServices().clear();
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
			case CommonConceptsPackage.TIM_RESOURCE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CommonConceptsPackage.TIM_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CommonConceptsPackage.TIM_RESOURCE__FUNCTION:
				return FUNCTION_EDEFAULT == null ? getFunction() != null : !FUNCTION_EDEFAULT.equals(getFunction());
			case CommonConceptsPackage.TIM_RESOURCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case CommonConceptsPackage.TIM_RESOURCE__PROCESSES:
				return !getProcesses().isEmpty();
			case CommonConceptsPackage.TIM_RESOURCE__MODEL:
				return basicGetModel() != null;
			case CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT:
				return getOrganizationUnit() != null;
			case CommonConceptsPackage.TIM_RESOURCE__SERVICES:
				return !getServices().isEmpty();
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
		result.append("Resource ");
		result.append(this.getName());
		return result.toString();
	}

} //TimResourceImpl
