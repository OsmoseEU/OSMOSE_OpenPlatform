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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getDecisionStructures <em>Decision Structures</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getGgOrganizations <em>Gg Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getEaOrganizations <em>Ea Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl#getMseService <em>Mse Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BsmOrganizationImpl extends EObjectImpl implements BsmOrganization {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmOrganizationImpl() {
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
		return BsmPackage.Literals.BSM_ORGANIZATION;
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
		return (String)eDynamicGet(BsmPackage.BSM_ORGANIZATION__ID, BsmPackage.Literals.BSM_ORGANIZATION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_ORGANIZATION__ID, BsmPackage.Literals.BSM_ORGANIZATION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_ORGANIZATION__NAME, BsmPackage.Literals.BSM_ORGANIZATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_ORGANIZATION__NAME, BsmPackage.Literals.BSM_ORGANIZATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_ORGANIZATION__DESCRIPTION, BsmPackage.Literals.BSM_ORGANIZATION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_ORGANIZATION__DESCRIPTION, BsmPackage.Literals.BSM_ORGANIZATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProcess> getProcesses() {
		return (EList<BsmProcess>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__PROCESSES, BsmPackage.Literals.BSM_ORGANIZATION__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecision> getDecisions() {
		return (EList<BsmDecision>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__DECISIONS, BsmPackage.Literals.BSM_ORGANIZATION__DECISIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_ORGANIZATION__BSM_MODEL, BsmPackage.Literals.BSM_ORGANIZATION__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_ORGANIZATION__BSM_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_ORGANIZATION__BSM_MODEL, BsmPackage.Literals.BSM_ORGANIZATION__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionStructure> getDecisionStructures() {
		return (EList<BsmDecisionStructure>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES, BsmPackage.Literals.BSM_ORGANIZATION__DECISION_STRUCTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgOrganization> getGgOrganizations() {
		return (EList<GgOrganization>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__GG_ORGANIZATIONS, BsmPackage.Literals.BSM_ORGANIZATION__GG_ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EaOrganization> getEaOrganizations() {
		return (EList<EaOrganization>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__EA_ORGANIZATIONS, BsmPackage.Literals.BSM_ORGANIZATION__EA_ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmMseService> getMseService() {
		return (EList<BsmMseService>)eDynamicGet(BsmPackage.BSM_ORGANIZATION__MSE_SERVICE, BsmPackage.Literals.BSM_ORGANIZATION__MSE_SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Organization";
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
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisions()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisionStructures()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMseService()).basicAdd(otherEnd, msgs);
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
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				return ((InternalEList<?>)getDecisionStructures()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
				return ((InternalEList<?>)getMseService()).basicRemove(otherEnd, msgs);
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
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__ORGANIZATIONS, BsmModel.class, msgs);
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
			case BsmPackage.BSM_ORGANIZATION__ID:
				return getId();
			case BsmPackage.BSM_ORGANIZATION__NAME:
				return getName();
			case BsmPackage.BSM_ORGANIZATION__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				return getProcesses();
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				return getDecisions();
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				return getBsmModel();
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				return getDecisionStructures();
			case BsmPackage.BSM_ORGANIZATION__GG_ORGANIZATIONS:
				return getGgOrganizations();
			case BsmPackage.BSM_ORGANIZATION__EA_ORGANIZATIONS:
				return getEaOrganizations();
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
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
			case BsmPackage.BSM_ORGANIZATION__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends BsmProcess>)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends BsmDecision>)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				getDecisionStructures().clear();
				getDecisionStructures().addAll((Collection<? extends BsmDecisionStructure>)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__GG_ORGANIZATIONS:
				getGgOrganizations().clear();
				getGgOrganizations().addAll((Collection<? extends GgOrganization>)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__EA_ORGANIZATIONS:
				getEaOrganizations().clear();
				getEaOrganizations().addAll((Collection<? extends EaOrganization>)newValue);
				return;
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
				getMseService().clear();
				getMseService().addAll((Collection<? extends BsmMseService>)newValue);
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
			case BsmPackage.BSM_ORGANIZATION__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_ORGANIZATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				getProcesses().clear();
				return;
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				getDecisions().clear();
				return;
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				setBsmModel((BsmModel)null);
				return;
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				getDecisionStructures().clear();
				return;
			case BsmPackage.BSM_ORGANIZATION__GG_ORGANIZATIONS:
				getGgOrganizations().clear();
				return;
			case BsmPackage.BSM_ORGANIZATION__EA_ORGANIZATIONS:
				getEaOrganizations().clear();
				return;
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
				getMseService().clear();
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
			case BsmPackage.BSM_ORGANIZATION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_ORGANIZATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_ORGANIZATION__PROCESSES:
				return !getProcesses().isEmpty();
			case BsmPackage.BSM_ORGANIZATION__DECISIONS:
				return !getDecisions().isEmpty();
			case BsmPackage.BSM_ORGANIZATION__BSM_MODEL:
				return getBsmModel() != null;
			case BsmPackage.BSM_ORGANIZATION__DECISION_STRUCTURES:
				return !getDecisionStructures().isEmpty();
			case BsmPackage.BSM_ORGANIZATION__GG_ORGANIZATIONS:
				return !getGgOrganizations().isEmpty();
			case BsmPackage.BSM_ORGANIZATION__EA_ORGANIZATIONS:
				return !getEaOrganizations().isEmpty();
			case BsmPackage.BSM_ORGANIZATION__MSE_SERVICE:
				return !getMseService().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmOrganizationImpl
