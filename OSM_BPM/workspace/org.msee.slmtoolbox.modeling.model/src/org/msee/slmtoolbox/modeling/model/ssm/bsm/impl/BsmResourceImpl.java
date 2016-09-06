/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getEaResources <em>Ea Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl#getMseService <em>Mse Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmResourceImpl extends EObjectImpl implements BsmResource {
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
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BsmResourceType TYPE_EDEFAULT = BsmResourceType.PHYSICAL_MEAN;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmResourceImpl() {
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
		return BsmPackage.Literals.BSM_RESOURCE;
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
		return (String)eDynamicGet(BsmPackage.BSM_RESOURCE__ID, BsmPackage.Literals.BSM_RESOURCE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__ID, BsmPackage.Literals.BSM_RESOURCE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_RESOURCE__NAME, BsmPackage.Literals.BSM_RESOURCE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__NAME, BsmPackage.Literals.BSM_RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmResourceType getType() {
		return (BsmResourceType)eDynamicGet(BsmPackage.BSM_RESOURCE__TYPE, BsmPackage.Literals.BSM_RESOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BsmResourceType newType) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__TYPE, BsmPackage.Literals.BSM_RESOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return (String)eDynamicGet(BsmPackage.BSM_RESOURCE__ROLE, BsmPackage.Literals.BSM_RESOURCE__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__ROLE, BsmPackage.Literals.BSM_RESOURCE__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapability() {
		return (String)eDynamicGet(BsmPackage.BSM_RESOURCE__CAPABILITY, BsmPackage.Literals.BSM_RESOURCE__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(String newCapability) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__CAPABILITY, BsmPackage.Literals.BSM_RESOURCE__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_RESOURCE__CONSTRAINT, BsmPackage.Literals.BSM_RESOURCE__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__CONSTRAINT, BsmPackage.Literals.BSM_RESOURCE__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_RESOURCE__SERVICE, BsmPackage.Literals.BSM_RESOURCE__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_RESOURCE__SERVICE, BsmPackage.Literals.BSM_RESOURCE__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_RESOURCE__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__SERVICE, BsmPackage.Literals.BSM_RESOURCE__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProcess> getProcesses() {
		return (EList<BsmProcess>)eDynamicGet(BsmPackage.BSM_RESOURCE__PROCESSES, BsmPackage.Literals.BSM_RESOURCE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmEnterprise getOrganization() {
		return (BsmEnterprise)eDynamicGet(BsmPackage.BSM_RESOURCE__ORGANIZATION, BsmPackage.Literals.BSM_RESOURCE__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOrganization(BsmEnterprise newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, BsmPackage.BSM_RESOURCE__ORGANIZATION, msgs);
		if (null!= newOrganization && null != newOrganization.getBsmModel()) {
			basicSetBsmModel(newOrganization.getBsmModel(), null);
			newOrganization.getBsmModel().getResources().add(this);
			((BsmModelImpl)newOrganization.getBsmModel()).eInverseAdd(this, BsmPackage.BSM_MODEL__RESOURCES, null);
		}
		if (null!= getBsmModel() && null != getBsmModel().getService()) {
			basicSetService(getBsmModel().getService(), null);
			getBsmModel().getService().getResources().add(this);
			((BsmServiceImpl)getBsmModel().getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__RESOURCES, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(BsmEnterprise newOrganization) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__ORGANIZATION, BsmPackage.Literals.BSM_RESOURCE__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_RESOURCE__BSM_MODEL, BsmPackage.Literals.BSM_RESOURCE__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel basicGetBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_RESOURCE__BSM_MODEL, BsmPackage.Literals.BSM_RESOURCE__BSM_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBsmModel, BsmPackage.BSM_RESOURCE__BSM_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__BSM_MODEL, BsmPackage.Literals.BSM_RESOURCE__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaResource> getEaResources() {
		return (EList<EaResource>)eDynamicGet(BsmPackage.BSM_RESOURCE__EA_RESOURCES, BsmPackage.Literals.BSM_RESOURCE__EA_RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmMseService getMseService() {
		return (BsmMseService)eDynamicGet(BsmPackage.BSM_RESOURCE__MSE_SERVICE, BsmPackage.Literals.BSM_RESOURCE__MSE_SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMseService(BsmMseService newMseService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMseService, BsmPackage.BSM_RESOURCE__MSE_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMseService(BsmMseService newMseService) {
		eDynamicSet(BsmPackage.BSM_RESOURCE__MSE_SERVICE, BsmPackage.Literals.BSM_RESOURCE__MSE_SERVICE, newMseService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Resource";
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
			case BsmPackage.BSM_RESOURCE__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__RESOURCES, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((BsmEnterprise)otherEnd, msgs);
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				BsmModel bsmModel = basicGetBsmModel();
				if (bsmModel != null)
					msgs = ((InternalEObject)bsmModel).eInverseRemove(this, BsmPackage.BSM_MODEL__RESOURCES, BsmModel.class, msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				BsmMseService mseService = getMseService();
				if (mseService != null)
					msgs = ((InternalEObject)mseService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BsmPackage.BSM_RESOURCE__MSE_SERVICE, null, msgs);
				return basicSetMseService((BsmMseService)otherEnd, msgs);
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
			case BsmPackage.BSM_RESOURCE__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				return basicSetMseService(null, msgs);
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
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_ENTERPRISE__RESOURCES, BsmEnterprise.class, msgs);
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
			case BsmPackage.BSM_RESOURCE__ID:
				return getId();
			case BsmPackage.BSM_RESOURCE__NAME:
				return getName();
			case BsmPackage.BSM_RESOURCE__TYPE:
				return getType();
			case BsmPackage.BSM_RESOURCE__ROLE:
				return getRole();
			case BsmPackage.BSM_RESOURCE__CAPABILITY:
				return getCapability();
			case BsmPackage.BSM_RESOURCE__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_RESOURCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				return getProcesses();
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				return getOrganization();
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				if (resolve) return getBsmModel();
				return basicGetBsmModel();
			case BsmPackage.BSM_RESOURCE__EA_RESOURCES:
				return getEaResources();
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				return getMseService();
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
			case BsmPackage.BSM_RESOURCE__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__TYPE:
				setType((BsmResourceType)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__ROLE:
				setRole((String)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__CAPABILITY:
				setCapability((String)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends BsmProcess>)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				setOrganization((BsmEnterprise)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__EA_RESOURCES:
				getEaResources().clear();
				getEaResources().addAll((Collection<? extends EaResource>)newValue);
				return;
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				setMseService((BsmMseService)newValue);
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
			case BsmPackage.BSM_RESOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_RESOURCE__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				getProcesses().clear();
				return;
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				setOrganization((BsmEnterprise)null);
				return;
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				setBsmModel((BsmModel)null);
				return;
			case BsmPackage.BSM_RESOURCE__EA_RESOURCES:
				getEaResources().clear();
				return;
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				setMseService((BsmMseService)null);
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
			case BsmPackage.BSM_RESOURCE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_RESOURCE__TYPE:
				return getType() != TYPE_EDEFAULT;
			case BsmPackage.BSM_RESOURCE__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case BsmPackage.BSM_RESOURCE__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? getCapability() != null : !CAPABILITY_EDEFAULT.equals(getCapability());
			case BsmPackage.BSM_RESOURCE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_RESOURCE__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_RESOURCE__PROCESSES:
				return !getProcesses().isEmpty();
			case BsmPackage.BSM_RESOURCE__ORGANIZATION:
				return getOrganization() != null;
			case BsmPackage.BSM_RESOURCE__BSM_MODEL:
				return basicGetBsmModel() != null;
			case BsmPackage.BSM_RESOURCE__EA_RESOURCES:
				return !getEaResources().isEmpty();
			case BsmPackage.BSM_RESOURCE__MSE_SERVICE:
				return getMseService() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmResourceImpl
