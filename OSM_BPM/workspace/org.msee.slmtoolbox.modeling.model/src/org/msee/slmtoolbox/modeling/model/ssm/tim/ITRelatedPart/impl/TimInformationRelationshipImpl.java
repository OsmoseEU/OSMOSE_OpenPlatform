/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimInformationRelationshipImpl#getInformation <em>Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimInformationRelationshipImpl extends EObjectImpl implements TimInformationRelationship {
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
	protected TimInformationRelationshipImpl() {
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
		return ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP;
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
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity getSourceEntity() {
		return (TimInformationEntity)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity basicGetSourceEntity() {
		return (TimInformationEntity)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceEntity(TimInformationEntity newSourceEntity, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceEntity, ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEntity(TimInformationEntity newSourceEntity) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY, newSourceEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity getTargetEntity() {
		return (TimInformationEntity)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity basicGetTargetEntity() {
		return (TimInformationEntity)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEntity(TimInformationEntity newTargetEntity, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTargetEntity, ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEntity(TimInformationEntity newTargetEntity) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY, newTargetEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationSet getInformation() {
		return (TimInformationSet)eDynamicGet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__INFORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformation(TimInformationSet newInformation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInformation, ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(TimInformationSet newInformation) {
		eDynamicSet(ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION, ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP__INFORMATION, newInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				TimInformationEntity sourceEntity = basicGetSourceEntity();
				if (sourceEntity != null)
					msgs = ((InternalEObject)sourceEntity).eInverseRemove(this, ITRelatedPartPackage.TIM_INFORMATION_ENTITY__OUT_RELATIONS, TimInformationEntity.class, msgs);
				return basicSetSourceEntity((TimInformationEntity)otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				TimInformationEntity targetEntity = basicGetTargetEntity();
				if (targetEntity != null)
					msgs = ((InternalEObject)targetEntity).eInverseRemove(this, ITRelatedPartPackage.TIM_INFORMATION_ENTITY__IN_RELATIONS, TimInformationEntity.class, msgs);
				return basicSetTargetEntity((TimInformationEntity)otherEnd, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				return basicSetSourceEntity(null, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				return basicSetTargetEntity(null, msgs);
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
				return eInternalContainer().eInverseRemove(this, ITRelatedPartPackage.TIM_INFORMATION_SET__RELATIONSHIPS, TimInformationSet.class, msgs);
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID:
				return getId();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME:
				return getName();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE:
				return getType();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
				return getInformation();
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID:
				setId((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE:
				setType((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				setSourceEntity((TimInformationEntity)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				setTargetEntity((TimInformationEntity)newValue);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID:
				setId(ID_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				setSourceEntity((TimInformationEntity)null);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				setTargetEntity((TimInformationEntity)null);
				return;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
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
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__SOURCE_ENTITY:
				return basicGetSourceEntity() != null;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__TARGET_ENTITY:
				return basicGetTargetEntity() != null;
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP__INFORMATION:
				return getInformation() != null;
		}
		return super.eIsSet(featureID);
	}

} //TimInformationRelationshipImpl
