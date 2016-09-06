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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getPartners <em>Partners</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getDecisionStructures <em>Decision Structures</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmModelImpl extends EObjectImpl implements BsmModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmModelImpl() {
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
		return BsmPackage.Literals.BSM_MODEL;
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
		return (String)eDynamicGet(BsmPackage.BSM_MODEL__ID, BsmPackage.Literals.BSM_MODEL__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_MODEL__ID, BsmPackage.Literals.BSM_MODEL__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_MODEL__NAME, BsmPackage.Literals.BSM_MODEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_MODEL__NAME, BsmPackage.Literals.BSM_MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_MODEL__SERVICE, BsmPackage.Literals.BSM_MODEL__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_MODEL__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_MODEL__SERVICE, BsmPackage.Literals.BSM_MODEL__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmOrganization> getOrganizations() {
		return (EList<BsmOrganization>)eDynamicGet(BsmPackage.BSM_MODEL__ORGANIZATIONS, BsmPackage.Literals.BSM_MODEL__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmPartner> getPartners() {
		return (EList<BsmPartner>)eDynamicGet(BsmPackage.BSM_MODEL__PARTNERS, BsmPackage.Literals.BSM_MODEL__PARTNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmStakeholder> getStakeholders() {
		return (EList<BsmStakeholder>)eDynamicGet(BsmPackage.BSM_MODEL__STAKEHOLDERS, BsmPackage.Literals.BSM_MODEL__STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmValue> getValues() {
		return (EList<BsmValue>)eDynamicGet(BsmPackage.BSM_MODEL__VALUES, BsmPackage.Literals.BSM_MODEL__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProduct> getProducts() {
		return (EList<BsmProduct>)eDynamicGet(BsmPackage.BSM_MODEL__PRODUCTS, BsmPackage.Literals.BSM_MODEL__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmFunctionality> getFunctionalities() {
		return (EList<BsmFunctionality>)eDynamicGet(BsmPackage.BSM_MODEL__FUNCTIONALITIES, BsmPackage.Literals.BSM_MODEL__FUNCTIONALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmCustomer> getCustomers() {
		return (EList<BsmCustomer>)eDynamicGet(BsmPackage.BSM_MODEL__CUSTOMERS, BsmPackage.Literals.BSM_MODEL__CUSTOMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProcess> getProcesses() {
		return (EList<BsmProcess>)eDynamicGet(BsmPackage.BSM_MODEL__PROCESSES, BsmPackage.Literals.BSM_MODEL__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecision> getDecisions() {
		return (EList<BsmDecision>)eDynamicGet(BsmPackage.BSM_MODEL__DECISIONS, BsmPackage.Literals.BSM_MODEL__DECISIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecisionStructure> getDecisionStructures() {
		return (EList<BsmDecisionStructure>)eDynamicGet(BsmPackage.BSM_MODEL__DECISION_STRUCTURES, BsmPackage.Literals.BSM_MODEL__DECISION_STRUCTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmResource> getResources() {
		return (EList<BsmResource>)eDynamicGet(BsmPackage.BSM_MODEL__RESOURCES, BsmPackage.Literals.BSM_MODEL__RESOURCES, true, true);
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
			case BsmPackage.BSM_MODEL__SERVICE:
				BsmService service = getService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BsmPackage.BSM_MODEL__SERVICE, null, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PARTNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartners()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholders()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalities()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomers()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__DECISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisions()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisionStructures()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__RESOURCES:
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
			case BsmPackage.BSM_MODEL__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PARTNERS:
				return ((InternalEList<?>)getPartners()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				return ((InternalEList<?>)getFunctionalities()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__DECISIONS:
				return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				return ((InternalEList<?>)getDecisionStructures()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_MODEL__RESOURCES:
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
			case BsmPackage.BSM_MODEL__ID:
				return getId();
			case BsmPackage.BSM_MODEL__NAME:
				return getName();
			case BsmPackage.BSM_MODEL__SERVICE:
				return getService();
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				return getOrganizations();
			case BsmPackage.BSM_MODEL__PARTNERS:
				return getPartners();
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				return getStakeholders();
			case BsmPackage.BSM_MODEL__VALUES:
				return getValues();
			case BsmPackage.BSM_MODEL__PRODUCTS:
				return getProducts();
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				return getFunctionalities();
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				return getCustomers();
			case BsmPackage.BSM_MODEL__PROCESSES:
				return getProcesses();
			case BsmPackage.BSM_MODEL__DECISIONS:
				return getDecisions();
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				return getDecisionStructures();
			case BsmPackage.BSM_MODEL__RESOURCES:
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
			case BsmPackage.BSM_MODEL__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_MODEL__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_MODEL__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends BsmOrganization>)newValue);
				return;
			case BsmPackage.BSM_MODEL__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends BsmPartner>)newValue);
				return;
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends BsmStakeholder>)newValue);
				return;
			case BsmPackage.BSM_MODEL__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends BsmValue>)newValue);
				return;
			case BsmPackage.BSM_MODEL__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends BsmProduct>)newValue);
				return;
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				getFunctionalities().clear();
				getFunctionalities().addAll((Collection<? extends BsmFunctionality>)newValue);
				return;
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends BsmCustomer>)newValue);
				return;
			case BsmPackage.BSM_MODEL__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends BsmProcess>)newValue);
				return;
			case BsmPackage.BSM_MODEL__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends BsmDecision>)newValue);
				return;
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				getDecisionStructures().clear();
				getDecisionStructures().addAll((Collection<? extends BsmDecisionStructure>)newValue);
				return;
			case BsmPackage.BSM_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends BsmResource>)newValue);
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
			case BsmPackage.BSM_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_MODEL__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case BsmPackage.BSM_MODEL__PARTNERS:
				getPartners().clear();
				return;
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case BsmPackage.BSM_MODEL__VALUES:
				getValues().clear();
				return;
			case BsmPackage.BSM_MODEL__PRODUCTS:
				getProducts().clear();
				return;
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				getFunctionalities().clear();
				return;
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				getCustomers().clear();
				return;
			case BsmPackage.BSM_MODEL__PROCESSES:
				getProcesses().clear();
				return;
			case BsmPackage.BSM_MODEL__DECISIONS:
				getDecisions().clear();
				return;
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				getDecisionStructures().clear();
				return;
			case BsmPackage.BSM_MODEL__RESOURCES:
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
			case BsmPackage.BSM_MODEL__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_MODEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_MODEL__SERVICE:
				return getService() != null;
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case BsmPackage.BSM_MODEL__PARTNERS:
				return !getPartners().isEmpty();
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
				return !getStakeholders().isEmpty();
			case BsmPackage.BSM_MODEL__VALUES:
				return !getValues().isEmpty();
			case BsmPackage.BSM_MODEL__PRODUCTS:
				return !getProducts().isEmpty();
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
				return !getFunctionalities().isEmpty();
			case BsmPackage.BSM_MODEL__CUSTOMERS:
				return !getCustomers().isEmpty();
			case BsmPackage.BSM_MODEL__PROCESSES:
				return !getProcesses().isEmpty();
			case BsmPackage.BSM_MODEL__DECISIONS:
				return !getDecisions().isEmpty();
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
				return !getDecisionStructures().isEmpty();
			case BsmPackage.BSM_MODEL__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmModelImpl
