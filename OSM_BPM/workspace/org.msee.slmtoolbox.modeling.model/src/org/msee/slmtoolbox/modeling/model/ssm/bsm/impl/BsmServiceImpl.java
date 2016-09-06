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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
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
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getPartners <em>Partners</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmServiceImpl extends EObjectImpl implements BsmService {
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
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmServiceImpl() {
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
		return BsmPackage.Literals.BSM_SERVICE;
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
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__ID, BsmPackage.Literals.BSM_SERVICE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_SERVICE__ID, BsmPackage.Literals.BSM_SERVICE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__NAME, BsmPackage.Literals.BSM_SERVICE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_SERVICE__NAME, BsmPackage.Literals.BSM_SERVICE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__DESCRIPTION, BsmPackage.Literals.BSM_SERVICE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_SERVICE__DESCRIPTION, BsmPackage.Literals.BSM_SERVICE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__CONSTRAINT, BsmPackage.Literals.BSM_SERVICE__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_SERVICE__CONSTRAINT, BsmPackage.Literals.BSM_SERVICE__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__OBJECTIVE, BsmPackage.Literals.BSM_SERVICE__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(BsmPackage.BSM_SERVICE__OBJECTIVE, BsmPackage.Literals.BSM_SERVICE__OBJECTIVE, newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__DOMAIN, BsmPackage.Literals.BSM_SERVICE__DOMAIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		eDynamicSet(BsmPackage.BSM_SERVICE__DOMAIN, BsmPackage.Literals.BSM_SERVICE__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNature() {
		return (String)eDynamicGet(BsmPackage.BSM_SERVICE__NATURE, BsmPackage.Literals.BSM_SERVICE__NATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(String newNature) {
		eDynamicSet(BsmPackage.BSM_SERVICE__NATURE, BsmPackage.Literals.BSM_SERVICE__NATURE, newNature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProduct> getProducts() {
		return (EList<BsmProduct>)eDynamicGet(BsmPackage.BSM_SERVICE__PRODUCTS, BsmPackage.Literals.BSM_SERVICE__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmFunctionality> getFunctionalities() {
		return (EList<BsmFunctionality>)eDynamicGet(BsmPackage.BSM_SERVICE__FUNCTIONALITIES, BsmPackage.Literals.BSM_SERVICE__FUNCTIONALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmResource> getResources() {
		return (EList<BsmResource>)eDynamicGet(BsmPackage.BSM_SERVICE__RESOURCES, BsmPackage.Literals.BSM_SERVICE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProcess> getProcesses() {
		return (EList<BsmProcess>)eDynamicGet(BsmPackage.BSM_SERVICE__PROCESSES, BsmPackage.Literals.BSM_SERVICE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmCustomer> getCustomers() {
		return (EList<BsmCustomer>)eDynamicGet(BsmPackage.BSM_SERVICE__CUSTOMERS, BsmPackage.Literals.BSM_SERVICE__CUSTOMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmValue> getValues() {
		return (EList<BsmValue>)eDynamicGet(BsmPackage.BSM_SERVICE__VALUES, BsmPackage.Literals.BSM_SERVICE__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmStakeholder> getStakeholders() {
		return (EList<BsmStakeholder>)eDynamicGet(BsmPackage.BSM_SERVICE__STAKEHOLDERS, BsmPackage.Literals.BSM_SERVICE__STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmPartner> getPartners() {
		return (EList<BsmPartner>)eDynamicGet(BsmPackage.BSM_SERVICE__PARTNERS, BsmPackage.Literals.BSM_SERVICE__PARTNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_SERVICE__BSM_MODEL, BsmPackage.Literals.BSM_SERVICE__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_SERVICE__BSM_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_SERVICE__BSM_MODEL, BsmPackage.Literals.BSM_SERVICE__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Service";
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
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalities()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomers()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholders()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__PARTNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartners()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
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
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				return ((InternalEList<?>)getFunctionalities()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__PARTNERS:
				return ((InternalEList<?>)getPartners()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
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
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__SERVICE, BsmModel.class, msgs);
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
			case BsmPackage.BSM_SERVICE__ID:
				return getId();
			case BsmPackage.BSM_SERVICE__NAME:
				return getName();
			case BsmPackage.BSM_SERVICE__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_SERVICE__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_SERVICE__OBJECTIVE:
				return getObjective();
			case BsmPackage.BSM_SERVICE__DOMAIN:
				return getDomain();
			case BsmPackage.BSM_SERVICE__NATURE:
				return getNature();
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				return getProducts();
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				return getFunctionalities();
			case BsmPackage.BSM_SERVICE__RESOURCES:
				return getResources();
			case BsmPackage.BSM_SERVICE__PROCESSES:
				return getProcesses();
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				return getCustomers();
			case BsmPackage.BSM_SERVICE__VALUES:
				return getValues();
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				return getStakeholders();
			case BsmPackage.BSM_SERVICE__PARTNERS:
				return getPartners();
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
				return getBsmModel();
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
			case BsmPackage.BSM_SERVICE__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__DOMAIN:
				setDomain((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__NATURE:
				setNature((String)newValue);
				return;
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends BsmProduct>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				getFunctionalities().clear();
				getFunctionalities().addAll((Collection<? extends BsmFunctionality>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends BsmResource>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends BsmProcess>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends BsmCustomer>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends BsmValue>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends BsmStakeholder>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends BsmPartner>)newValue);
				return;
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
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
			case BsmPackage.BSM_SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				getProducts().clear();
				return;
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				getFunctionalities().clear();
				return;
			case BsmPackage.BSM_SERVICE__RESOURCES:
				getResources().clear();
				return;
			case BsmPackage.BSM_SERVICE__PROCESSES:
				getProcesses().clear();
				return;
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				getCustomers().clear();
				return;
			case BsmPackage.BSM_SERVICE__VALUES:
				getValues().clear();
				return;
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case BsmPackage.BSM_SERVICE__PARTNERS:
				getPartners().clear();
				return;
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
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
			case BsmPackage.BSM_SERVICE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_SERVICE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_SERVICE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_SERVICE__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case BsmPackage.BSM_SERVICE__DOMAIN:
				return DOMAIN_EDEFAULT == null ? getDomain() != null : !DOMAIN_EDEFAULT.equals(getDomain());
			case BsmPackage.BSM_SERVICE__NATURE:
				return NATURE_EDEFAULT == null ? getNature() != null : !NATURE_EDEFAULT.equals(getNature());
			case BsmPackage.BSM_SERVICE__PRODUCTS:
				return !getProducts().isEmpty();
			case BsmPackage.BSM_SERVICE__FUNCTIONALITIES:
				return !getFunctionalities().isEmpty();
			case BsmPackage.BSM_SERVICE__RESOURCES:
				return !getResources().isEmpty();
			case BsmPackage.BSM_SERVICE__PROCESSES:
				return !getProcesses().isEmpty();
			case BsmPackage.BSM_SERVICE__CUSTOMERS:
				return !getCustomers().isEmpty();
			case BsmPackage.BSM_SERVICE__VALUES:
				return !getValues().isEmpty();
			case BsmPackage.BSM_SERVICE__STAKEHOLDERS:
				return !getStakeholders().isEmpty();
			case BsmPackage.BSM_SERVICE__PARTNERS:
				return !getPartners().isEmpty();
			case BsmPackage.BSM_SERVICE__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmServiceImpl
