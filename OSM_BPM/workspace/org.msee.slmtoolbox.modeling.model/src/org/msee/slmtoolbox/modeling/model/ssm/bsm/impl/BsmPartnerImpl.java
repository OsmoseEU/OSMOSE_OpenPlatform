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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getCompetence <em>Competence</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmPartnerImpl extends EObjectImpl implements BsmPartner {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCompetence() <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetence()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPETENCE_EDEFAULT = null;

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
	 * The default value of the '{@link #getContribution() <em>Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribution()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmPartnerImpl() {
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
		return BsmPackage.Literals.BSM_PARTNER;
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
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__ID, BsmPackage.Literals.BSM_PARTNER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_PARTNER__ID, BsmPackage.Literals.BSM_PARTNER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__NAME, BsmPackage.Literals.BSM_PARTNER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_PARTNER__NAME, BsmPackage.Literals.BSM_PARTNER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__CATEGORY, BsmPackage.Literals.BSM_PARTNER__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eDynamicSet(BsmPackage.BSM_PARTNER__CATEGORY, BsmPackage.Literals.BSM_PARTNER__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompetence() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__COMPETENCE, BsmPackage.Literals.BSM_PARTNER__COMPETENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompetence(String newCompetence) {
		eDynamicSet(BsmPackage.BSM_PARTNER__COMPETENCE, BsmPackage.Literals.BSM_PARTNER__COMPETENCE, newCompetence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcern() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__CONCERN, BsmPackage.Literals.BSM_PARTNER__CONCERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(String newConcern) {
		eDynamicSet(BsmPackage.BSM_PARTNER__CONCERN, BsmPackage.Literals.BSM_PARTNER__CONCERN, newConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__CONSTRAINT, BsmPackage.Literals.BSM_PARTNER__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_PARTNER__CONSTRAINT, BsmPackage.Literals.BSM_PARTNER__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContribution() {
		return (String)eDynamicGet(BsmPackage.BSM_PARTNER__CONTRIBUTION, BsmPackage.Literals.BSM_PARTNER__CONTRIBUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContribution(String newContribution) {
		eDynamicSet(BsmPackage.BSM_PARTNER__CONTRIBUTION, BsmPackage.Literals.BSM_PARTNER__CONTRIBUTION, newContribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PARTNER__SERVICE, BsmPackage.Literals.BSM_PARTNER__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PARTNER__SERVICE, BsmPackage.Literals.BSM_PARTNER__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_PARTNER__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_PARTNER__SERVICE, BsmPackage.Literals.BSM_PARTNER__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_PARTNER__BSM_MODEL, BsmPackage.Literals.BSM_PARTNER__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_PARTNER__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__PARTNERS, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_PARTNER__BSM_MODEL, BsmPackage.Literals.BSM_PARTNER__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Partener";
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
			case BsmPackage.BSM_PARTNER__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__PARTNERS, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
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
			case BsmPackage.BSM_PARTNER__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
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
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__PARTNERS, BsmModel.class, msgs);
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
			case BsmPackage.BSM_PARTNER__ID:
				return getId();
			case BsmPackage.BSM_PARTNER__NAME:
				return getName();
			case BsmPackage.BSM_PARTNER__CATEGORY:
				return getCategory();
			case BsmPackage.BSM_PARTNER__COMPETENCE:
				return getCompetence();
			case BsmPackage.BSM_PARTNER__CONCERN:
				return getConcern();
			case BsmPackage.BSM_PARTNER__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_PARTNER__CONTRIBUTION:
				return getContribution();
			case BsmPackage.BSM_PARTNER__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
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
			case BsmPackage.BSM_PARTNER__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__CATEGORY:
				setCategory((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__COMPETENCE:
				setCompetence((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__CONCERN:
				setConcern((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__CONTRIBUTION:
				setContribution((String)newValue);
				return;
			case BsmPackage.BSM_PARTNER__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
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
			case BsmPackage.BSM_PARTNER__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__COMPETENCE:
				setCompetence(COMPETENCE_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__CONCERN:
				setConcern(CONCERN_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__CONTRIBUTION:
				setContribution(CONTRIBUTION_EDEFAULT);
				return;
			case BsmPackage.BSM_PARTNER__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
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
			case BsmPackage.BSM_PARTNER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_PARTNER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_PARTNER__CATEGORY:
				return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
			case BsmPackage.BSM_PARTNER__COMPETENCE:
				return COMPETENCE_EDEFAULT == null ? getCompetence() != null : !COMPETENCE_EDEFAULT.equals(getCompetence());
			case BsmPackage.BSM_PARTNER__CONCERN:
				return CONCERN_EDEFAULT == null ? getConcern() != null : !CONCERN_EDEFAULT.equals(getConcern());
			case BsmPackage.BSM_PARTNER__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_PARTNER__CONTRIBUTION:
				return CONTRIBUTION_EDEFAULT == null ? getContribution() != null : !CONTRIBUTION_EDEFAULT.equals(getContribution());
			case BsmPackage.BSM_PARTNER__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_PARTNER__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmPartnerImpl
