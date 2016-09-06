/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmStakeholderImpl extends EObjectImpl implements BsmStakeholder {
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
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConcern() <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCERN_EDEFAULT = null;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmStakeholderImpl() {
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
		return BsmPackage.Literals.BSM_STAKEHOLDER;
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
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__ID, BsmPackage.Literals.BSM_STAKEHOLDER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__ID, BsmPackage.Literals.BSM_STAKEHOLDER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__NAME, BsmPackage.Literals.BSM_STAKEHOLDER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__NAME, BsmPackage.Literals.BSM_STAKEHOLDER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__TYPE, BsmPackage.Literals.BSM_STAKEHOLDER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__TYPE, BsmPackage.Literals.BSM_STAKEHOLDER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcern() {
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__CONCERN, BsmPackage.Literals.BSM_STAKEHOLDER__CONCERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(String newConcern) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__CONCERN, BsmPackage.Literals.BSM_STAKEHOLDER__CONCERN, newConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__CONSTRAINT, BsmPackage.Literals.BSM_STAKEHOLDER__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__CONSTRAINT, BsmPackage.Literals.BSM_STAKEHOLDER__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return (String)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__ROLE, BsmPackage.Literals.BSM_STAKEHOLDER__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__ROLE, BsmPackage.Literals.BSM_STAKEHOLDER__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__SERVICE, BsmPackage.Literals.BSM_STAKEHOLDER__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__SERVICE, BsmPackage.Literals.BSM_STAKEHOLDER__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_STAKEHOLDER__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__SERVICE, BsmPackage.Literals.BSM_STAKEHOLDER__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_STAKEHOLDER__BSM_MODEL, BsmPackage.Literals.BSM_STAKEHOLDER__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_STAKEHOLDER__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__STAKEHOLDERS, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_STAKEHOLDER__BSM_MODEL, BsmPackage.Literals.BSM_STAKEHOLDER__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Stakeholder";
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
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__STAKEHOLDERS, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
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
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
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
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__STAKEHOLDERS, BsmModel.class, msgs);
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
			case BsmPackage.BSM_STAKEHOLDER__ID:
				return getId();
			case BsmPackage.BSM_STAKEHOLDER__NAME:
				return getName();
			case BsmPackage.BSM_STAKEHOLDER__TYPE:
				return getType();
			case BsmPackage.BSM_STAKEHOLDER__CONCERN:
				return getConcern();
			case BsmPackage.BSM_STAKEHOLDER__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_STAKEHOLDER__ROLE:
				return getRole();
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				return getBsmModel();
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
			case BsmPackage.BSM_STAKEHOLDER__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__TYPE:
				setType((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__CONCERN:
				setConcern((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__ROLE:
				setRole((String)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
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
			case BsmPackage.BSM_STAKEHOLDER__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__CONCERN:
				setConcern(CONCERN_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				setBsmModel((BsmModel)null);
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
			case BsmPackage.BSM_STAKEHOLDER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_STAKEHOLDER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_STAKEHOLDER__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BsmPackage.BSM_STAKEHOLDER__CONCERN:
				return CONCERN_EDEFAULT == null ? getConcern() != null : !CONCERN_EDEFAULT.equals(getConcern());
			case BsmPackage.BSM_STAKEHOLDER__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_STAKEHOLDER__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case BsmPackage.BSM_STAKEHOLDER__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_STAKEHOLDER__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmStakeholderImpl
