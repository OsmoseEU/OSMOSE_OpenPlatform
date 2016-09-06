/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Information Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationAttributeImpl#getInformationEntity <em>Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimInformationAttributeImpl extends EObjectImpl implements TimInformationAttribute {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimInformationAttributeImpl() {
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
		return ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE;
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
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity getInformationEntity() {
		return (TimInformationEntity)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationEntity(TimInformationEntity newInformationEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInformationEntity, ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationEntity(TimInformationEntity newInformationEntity) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY, newInformationEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Information attribut";
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInformationEntity((TimInformationEntity)otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				return basicSetInformationEntity(null, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				return eInternalContainer().eInverseRemove(this, ITRelatedPartPackage.TIM_INFORMATION_ENTITY__ATTRIBUTES, TimInformationEntity.class, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID:
				return getId();
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME:
				return getName();
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE:
				return getType();
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				return getInformationEntity();
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID:
				setId((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				setInformationEntity((TimInformationEntity)newValue);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID:
				setId(ID_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				setInformationEntity((TimInformationEntity)null);
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
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE__INFORMATION_ENTITY:
				return getInformationEntity() != null;
		}
		return super.eIsSet(featureID);
	}

} //TimInformationAttributeImpl
