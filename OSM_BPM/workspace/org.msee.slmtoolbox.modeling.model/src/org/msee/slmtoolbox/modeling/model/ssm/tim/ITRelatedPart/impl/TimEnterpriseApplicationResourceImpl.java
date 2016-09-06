/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimResourceImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Enterprise Application Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.TimEnterpriseApplicationResourceImpl#getInformations <em>Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimEnterpriseApplicationResourceImpl extends TimResourceImpl implements TimEnterpriseApplicationResource {
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
	 * The default value of the '{@link #getFunctionality() <em>Functionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionality()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONALITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCharacteristics() <em>Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERISTICS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimEnterpriseApplicationResourceImpl() {
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
		return ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionality() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionality(String newFunctionality) {
		eDynamicSet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY, newFunctionality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteristics() {
		return (String)eDynamicGet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristics(String newCharacteristics) {
		eDynamicSet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS, newCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimInformationSet> getInformations() {
		return (EList<TimInformationSet>)eDynamicGet(ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS, ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS, true, true);
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformations()).basicAdd(otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				return ((InternalEList<?>)getInformations()).basicRemove(otherEnd, msgs);
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION:
				return getDescription();
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY:
				return getFunctionality();
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS:
				return getCharacteristics();
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				return getInformations();
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY:
				setFunctionality((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS:
				setCharacteristics((String)newValue);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				getInformations().clear();
				getInformations().addAll((Collection<? extends TimInformationSet>)newValue);
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY:
				setFunctionality(FUNCTIONALITY_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS:
				setCharacteristics(CHARACTERISTICS_EDEFAULT);
				return;
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				getInformations().clear();
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__FUNCTIONALITY:
				return FUNCTIONALITY_EDEFAULT == null ? getFunctionality() != null : !FUNCTIONALITY_EDEFAULT.equals(getFunctionality());
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__CHARACTERISTICS:
				return CHARACTERISTICS_EDEFAULT == null ? getCharacteristics() != null : !CHARACTERISTICS_EDEFAULT.equals(getCharacteristics());
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE__INFORMATIONS:
				return !getInformations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimEnterpriseApplicationResourceImpl
