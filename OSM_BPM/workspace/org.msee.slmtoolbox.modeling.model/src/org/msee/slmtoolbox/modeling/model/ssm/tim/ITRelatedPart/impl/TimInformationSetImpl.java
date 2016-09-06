/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Information Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getEntrepriseApplications <em>Entreprise Applications</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationSetImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimInformationSetImpl extends EObjectImpl implements TimInformationSet {
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
	protected TimInformationSetImpl() {
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
		return ITRelatedPartPackage.Literals.TIM_INFORMATION_SET;
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
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_SET__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_SET__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimEnterpriseApplicationResource> getEntrepriseApplications() {
		return (EList<TimEnterpriseApplicationResource>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel getModel() {
		return (TimModel)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TimModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(TimModel newModel) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationEntity> getEntities() {
		return (EList<TimInformationEntity>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationRelationship> getRelationships() {
		return (EList<TimInformationRelationship>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS, ITRelatedPartPackage.Literals.TIM_INFORMATION_SET__RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Information";
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntrepriseApplications()).basicAdd(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((TimModel)otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationships()).basicAdd(otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				return ((InternalEList<?>)getEntrepriseApplications()).basicRemove(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				return basicSetModel(null, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				return eInternalContainer().eInverseRemove(this, TimPackage.TIM_MODEL__INFORMATIONS, TimModel.class, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ID:
				return getId();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__NAME:
				return getName();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				return getEntrepriseApplications();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				return getModel();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				return getEntities();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				return getRelationships();
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ID:
				setId((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__NAME:
				setName((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				getEntrepriseApplications().clear();
				getEntrepriseApplications().addAll((Collection<? extends TimEnterpriseApplicationResource>)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				setModel((TimModel)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends TimInformationEntity>)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends TimInformationRelationship>)newValue);
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ID:
				setId(ID_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				getEntrepriseApplications().clear();
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				setModel((TimModel)null);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				getEntities().clear();
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				getRelationships().clear();
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
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ITRelatedPartPackage.TIM_INFORMATION_SET__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTREPRISE_APPLICATIONS:
				return !getEntrepriseApplications().isEmpty();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__MODEL:
				return getModel() != null;
			case ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES:
				return !getEntities().isEmpty();
			case ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS:
				return !getRelationships().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimInformationSetImpl
