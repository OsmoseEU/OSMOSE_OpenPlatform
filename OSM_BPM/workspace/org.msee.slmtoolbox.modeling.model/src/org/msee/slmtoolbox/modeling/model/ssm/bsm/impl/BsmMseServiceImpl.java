/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mse Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmMseServiceImpl extends EObjectImpl implements BsmMseService {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublishedDate() <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHED_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PUBLISHED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmMseServiceImpl() {
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
		return BsmPackage.Literals.BSM_MSE_SERVICE;
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
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__ID, BsmPackage.Literals.BSM_MSE_SERVICE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__ID, BsmPackage.Literals.BSM_MSE_SERVICE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__NAME, BsmPackage.Literals.BSM_MSE_SERVICE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__NAME, BsmPackage.Literals.BSM_MSE_SERVICE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__DESCRIPTION, BsmPackage.Literals.BSM_MSE_SERVICE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__DESCRIPTION, BsmPackage.Literals.BSM_MSE_SERVICE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__OWNER, BsmPackage.Literals.BSM_MSE_SERVICE__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__OWNER, BsmPackage.Literals.BSM_MSE_SERVICE__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateDate() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__CREATE_DATE, BsmPackage.Literals.BSM_MSE_SERVICE__CREATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateDate(String newCreateDate) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__CREATE_DATE, BsmPackage.Literals.BSM_MSE_SERVICE__CREATE_DATE, newCreateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishedDate() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE, BsmPackage.Literals.BSM_MSE_SERVICE__PUBLISHED_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDate(String newPublishedDate) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE, BsmPackage.Literals.BSM_MSE_SERVICE__PUBLISHED_DATE, newPublishedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPublished() {
		return (Integer)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__PUBLISHED, BsmPackage.Literals.BSM_MSE_SERVICE__PUBLISHED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublished(Integer newPublished) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__PUBLISHED, BsmPackage.Literals.BSM_MSE_SERVICE__PUBLISHED, newPublished);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return (String)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__USER_ID, BsmPackage.Literals.BSM_MSE_SERVICE__USER_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__USER_ID, BsmPackage.Literals.BSM_MSE_SERVICE__USER_ID, newUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProcess getProcess() {
		return (BsmProcess)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__PROCESS, BsmPackage.Literals.BSM_MSE_SERVICE__PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(BsmProcess newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, BsmPackage.BSM_MSE_SERVICE__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(BsmProcess newProcess) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__PROCESS, BsmPackage.Literals.BSM_MSE_SERVICE__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmOrganization getOrganization() {
		return (BsmOrganization)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__ORGANIZATION, BsmPackage.Literals.BSM_MSE_SERVICE__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmOrganization basicGetOrganization() {
		return (BsmOrganization)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__ORGANIZATION, BsmPackage.Literals.BSM_MSE_SERVICE__ORGANIZATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(BsmOrganization newOrganization, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganization, BsmPackage.BSM_MSE_SERVICE__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(BsmOrganization newOrganization) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__ORGANIZATION, BsmPackage.Literals.BSM_MSE_SERVICE__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmResource getResource() {
		return (BsmResource)eDynamicGet(BsmPackage.BSM_MSE_SERVICE__RESOURCE, BsmPackage.Literals.BSM_MSE_SERVICE__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(BsmResource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, BsmPackage.BSM_MSE_SERVICE__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(BsmResource newResource) {
		eDynamicSet(BsmPackage.BSM_MSE_SERVICE__RESOURCE, BsmPackage.Literals.BSM_MSE_SERVICE__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "MseService";
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
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((BsmProcess)otherEnd, msgs);
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				BsmOrganization organization = basicGetOrganization();
				if (organization != null)
					msgs = ((InternalEObject)organization).eInverseRemove(this, BsmPackage.BSM_ORGANIZATION__MSE_SERVICE, BsmOrganization.class, msgs);
				return basicSetOrganization((BsmOrganization)otherEnd, msgs);
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((BsmResource)otherEnd, msgs);
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
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				return basicSetProcess(null, msgs);
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				return basicSetResource(null, msgs);
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
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_PROCESS__MSE_SERVICE, BsmProcess.class, msgs);
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_RESOURCE__MSE_SERVICE, BsmResource.class, msgs);
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
			case BsmPackage.BSM_MSE_SERVICE__ID:
				return getId();
			case BsmPackage.BSM_MSE_SERVICE__NAME:
				return getName();
			case BsmPackage.BSM_MSE_SERVICE__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_MSE_SERVICE__OWNER:
				return getOwner();
			case BsmPackage.BSM_MSE_SERVICE__CREATE_DATE:
				return getCreateDate();
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE:
				return getPublishedDate();
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED:
				return getPublished();
			case BsmPackage.BSM_MSE_SERVICE__USER_ID:
				return getUserId();
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				return getProcess();
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				return getResource();
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
			case BsmPackage.BSM_MSE_SERVICE__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__OWNER:
				setOwner((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__CREATE_DATE:
				setCreateDate((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE:
				setPublishedDate((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED:
				setPublished((Integer)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__USER_ID:
				setUserId((String)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				setProcess((BsmProcess)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				setOrganization((BsmOrganization)newValue);
				return;
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				setResource((BsmResource)newValue);
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
			case BsmPackage.BSM_MSE_SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__CREATE_DATE:
				setCreateDate(CREATE_DATE_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE:
				setPublishedDate(PUBLISHED_DATE_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED:
				setPublished(PUBLISHED_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				setProcess((BsmProcess)null);
				return;
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				setOrganization((BsmOrganization)null);
				return;
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				setResource((BsmResource)null);
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
			case BsmPackage.BSM_MSE_SERVICE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_MSE_SERVICE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_MSE_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_MSE_SERVICE__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case BsmPackage.BSM_MSE_SERVICE__CREATE_DATE:
				return CREATE_DATE_EDEFAULT == null ? getCreateDate() != null : !CREATE_DATE_EDEFAULT.equals(getCreateDate());
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED_DATE:
				return PUBLISHED_DATE_EDEFAULT == null ? getPublishedDate() != null : !PUBLISHED_DATE_EDEFAULT.equals(getPublishedDate());
			case BsmPackage.BSM_MSE_SERVICE__PUBLISHED:
				return PUBLISHED_EDEFAULT == null ? getPublished() != null : !PUBLISHED_EDEFAULT.equals(getPublished());
			case BsmPackage.BSM_MSE_SERVICE__USER_ID:
				return USER_ID_EDEFAULT == null ? getUserId() != null : !USER_ID_EDEFAULT.equals(getUserId());
			case BsmPackage.BSM_MSE_SERVICE__PROCESS:
				return getProcess() != null;
			case BsmPackage.BSM_MSE_SERVICE__ORGANIZATION:
				return basicGetOrganization() != null;
			case BsmPackage.BSM_MSE_SERVICE__RESOURCE:
				return getResource() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmMseServiceImpl
