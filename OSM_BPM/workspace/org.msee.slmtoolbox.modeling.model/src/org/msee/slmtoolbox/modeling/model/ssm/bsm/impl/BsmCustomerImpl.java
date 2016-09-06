/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getLevelOfEducation <em>Level Of Education</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getAnnualRevenueRange <em>Annual Revenue Range</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getTargetedUsageFreq <em>Targeted Usage Freq</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmCustomerImpl extends EObjectImpl implements BsmCustomer {
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
	 * The default value of the '{@link #getCategories() <em>Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLevelOfEducation() <em>Level Of Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfEducation()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_OF_EDUCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final BsmGender GENDER_EDEFAULT = BsmGender.FEMALE;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAnnualRevenueRange() <em>Annual Revenue Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnualRevenueRange()
	 * @generated
	 * @ordered
	 */
	protected static final int ANNUAL_REVENUE_RANGE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRequirement() <em>Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getTargetedUsageFreq() <em>Targeted Usage Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedUsageFreq()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGETED_USAGE_FREQ_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmCustomerImpl() {
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
		return BsmPackage.Literals.BSM_CUSTOMER;
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
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__ID, BsmPackage.Literals.BSM_CUSTOMER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__ID, BsmPackage.Literals.BSM_CUSTOMER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__NAME, BsmPackage.Literals.BSM_CUSTOMER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__NAME, BsmPackage.Literals.BSM_CUSTOMER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategories() {
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__CATEGORIES, BsmPackage.Literals.BSM_CUSTOMER__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(String newCategories) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__CATEGORIES, BsmPackage.Literals.BSM_CUSTOMER__CATEGORIES, newCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelOfEducation() {
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION, BsmPackage.Literals.BSM_CUSTOMER__LEVEL_OF_EDUCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfEducation(String newLevelOfEducation) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION, BsmPackage.Literals.BSM_CUSTOMER__LEVEL_OF_EDUCATION, newLevelOfEducation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmGender getGender() {
		return (BsmGender)eDynamicGet(BsmPackage.BSM_CUSTOMER__GENDER, BsmPackage.Literals.BSM_CUSTOMER__GENDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(BsmGender newGender) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__GENDER, BsmPackage.Literals.BSM_CUSTOMER__GENDER, newGender);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return (Integer)eDynamicGet(BsmPackage.BSM_CUSTOMER__AGE, BsmPackage.Literals.BSM_CUSTOMER__AGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__AGE, BsmPackage.Literals.BSM_CUSTOMER__AGE, newAge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnnualRevenueRange() {
		return (Integer)eDynamicGet(BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE, BsmPackage.Literals.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnualRevenueRange(int newAnnualRevenueRange) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE, BsmPackage.Literals.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE, newAnnualRevenueRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequirement() {
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__REQUIREMENT, BsmPackage.Literals.BSM_CUSTOMER__REQUIREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(String newRequirement) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__REQUIREMENT, BsmPackage.Literals.BSM_CUSTOMER__REQUIREMENT, newRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_CUSTOMER__CONSTRAINT, BsmPackage.Literals.BSM_CUSTOMER__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__CONSTRAINT, BsmPackage.Literals.BSM_CUSTOMER__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetedUsageFreq() {
		return (Integer)eDynamicGet(BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ, BsmPackage.Literals.BSM_CUSTOMER__TARGETED_USAGE_FREQ, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetedUsageFreq(int newTargetedUsageFreq) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ, BsmPackage.Literals.BSM_CUSTOMER__TARGETED_USAGE_FREQ, newTargetedUsageFreq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_CUSTOMER__SERVICE, BsmPackage.Literals.BSM_CUSTOMER__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_CUSTOMER__SERVICE, BsmPackage.Literals.BSM_CUSTOMER__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_CUSTOMER__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__SERVICE, BsmPackage.Literals.BSM_CUSTOMER__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_CUSTOMER__BSM_MODEL, BsmPackage.Literals.BSM_CUSTOMER__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_CUSTOMER__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__CUSTOMERS, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_CUSTOMER__BSM_MODEL, BsmPackage.Literals.BSM_CUSTOMER__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Customer";
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
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__CUSTOMERS, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
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
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
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
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__CUSTOMERS, BsmModel.class, msgs);
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
			case BsmPackage.BSM_CUSTOMER__ID:
				return getId();
			case BsmPackage.BSM_CUSTOMER__NAME:
				return getName();
			case BsmPackage.BSM_CUSTOMER__CATEGORIES:
				return getCategories();
			case BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION:
				return getLevelOfEducation();
			case BsmPackage.BSM_CUSTOMER__GENDER:
				return getGender();
			case BsmPackage.BSM_CUSTOMER__AGE:
				return getAge();
			case BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE:
				return getAnnualRevenueRange();
			case BsmPackage.BSM_CUSTOMER__REQUIREMENT:
				return getRequirement();
			case BsmPackage.BSM_CUSTOMER__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ:
				return getTargetedUsageFreq();
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
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
			case BsmPackage.BSM_CUSTOMER__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__CATEGORIES:
				setCategories((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION:
				setLevelOfEducation((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__GENDER:
				setGender((BsmGender)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__AGE:
				setAge((Integer)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE:
				setAnnualRevenueRange((Integer)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__REQUIREMENT:
				setRequirement((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ:
				setTargetedUsageFreq((Integer)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
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
			case BsmPackage.BSM_CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__CATEGORIES:
				setCategories(CATEGORIES_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION:
				setLevelOfEducation(LEVEL_OF_EDUCATION_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE:
				setAnnualRevenueRange(ANNUAL_REVENUE_RANGE_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__REQUIREMENT:
				setRequirement(REQUIREMENT_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ:
				setTargetedUsageFreq(TARGETED_USAGE_FREQ_EDEFAULT);
				return;
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
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
			case BsmPackage.BSM_CUSTOMER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_CUSTOMER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_CUSTOMER__CATEGORIES:
				return CATEGORIES_EDEFAULT == null ? getCategories() != null : !CATEGORIES_EDEFAULT.equals(getCategories());
			case BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION:
				return LEVEL_OF_EDUCATION_EDEFAULT == null ? getLevelOfEducation() != null : !LEVEL_OF_EDUCATION_EDEFAULT.equals(getLevelOfEducation());
			case BsmPackage.BSM_CUSTOMER__GENDER:
				return getGender() != GENDER_EDEFAULT;
			case BsmPackage.BSM_CUSTOMER__AGE:
				return getAge() != AGE_EDEFAULT;
			case BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE:
				return getAnnualRevenueRange() != ANNUAL_REVENUE_RANGE_EDEFAULT;
			case BsmPackage.BSM_CUSTOMER__REQUIREMENT:
				return REQUIREMENT_EDEFAULT == null ? getRequirement() != null : !REQUIREMENT_EDEFAULT.equals(getRequirement());
			case BsmPackage.BSM_CUSTOMER__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ:
				return getTargetedUsageFreq() != TARGETED_USAGE_FREQ_EDEFAULT;
			case BsmPackage.BSM_CUSTOMER__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_CUSTOMER__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmCustomerImpl
