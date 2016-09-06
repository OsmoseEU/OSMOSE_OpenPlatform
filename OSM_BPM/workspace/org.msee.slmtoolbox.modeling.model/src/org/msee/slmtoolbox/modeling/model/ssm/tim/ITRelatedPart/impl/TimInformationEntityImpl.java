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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Information Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getOutRelations <em>Out Relations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getInRelations <em>In Relations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationEntityImpl#getInformation <em>Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimInformationEntityImpl extends EObjectImpl implements TimInformationEntity {
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
	protected TimInformationEntityImpl() {
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
		return ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY;
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
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationRelationship> getOutRelations() {
		return (EList<TimInformationRelationship>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__OUT_RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationRelationship> getInRelations() {
		return (EList<TimInformationRelationship>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__IN_RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationAttribute> getAttributes() {
		return (EList<TimInformationAttribute>)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationSet getInformation() {
		return (TimInformationSet)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__INFORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformation(TimInformationSet newInformation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInformation, ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(TimInformationSet newInformation) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION, ITRelatedPartPackage.Literals.TIM_INFORMATION_ENTITY__INFORMATION, newInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Entity";
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutRelations()).basicAdd(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInRelations()).basicAdd(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInformation((TimInformationSet)otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				return ((InternalEList<?>)getOutRelations()).basicRemove(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				return ((InternalEList<?>)getInRelations()).basicRemove(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				return basicSetInformation(null, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				return eInternalContainer().eInverseRemove(this, ITRelatedPartPackage.TIM_INFORMATION_SET__ENTITIES, TimInformationSet.class, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID:
				return getId();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME:
				return getName();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				return getOutRelations();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				return getInRelations();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				return getAttributes();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				return getInformation();
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID:
				setId((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME:
				setName((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				getOutRelations().clear();
				getOutRelations().addAll((Collection<? extends TimInformationRelationship>)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				getInRelations().clear();
				getInRelations().addAll((Collection<? extends TimInformationRelationship>)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends TimInformationAttribute>)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				setInformation((TimInformationSet)newValue);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				getOutRelations().clear();
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				getInRelations().clear();
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				setInformation((TimInformationSet)null);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS:
				return !getOutRelations().isEmpty();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS:
				return !getInRelations().isEmpty();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY__INFORMATION:
				return getInformation() != null;
		}
		return super.eIsSet(featureID);
	}

} //TimInformationEntityImpl
