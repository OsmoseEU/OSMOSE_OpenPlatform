/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Base Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GgBaseElementImpl extends EObjectImpl implements GgBaseElement {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

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
	protected GgBaseElementImpl() {
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
		return GeneralElementsPackage.Literals.GG_BASE_ELEMENT;
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
		return (String)eDynamicGet(GeneralElementsPackage.GG_BASE_ELEMENT__ID, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(GeneralElementsPackage.GG_BASE_ELEMENT__ID, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(GeneralElementsPackage.GG_BASE_ELEMENT__NAME, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(GeneralElementsPackage.GG_BASE_ELEMENT__NAME, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eDynamicGet(GeneralElementsPackage.GG_BASE_ELEMENT__CODE, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eDynamicSet(GeneralElementsPackage.GG_BASE_ELEMENT__CODE, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION, GeneralElementsPackage.Literals.GG_BASE_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralElementsPackage.GG_BASE_ELEMENT__ID:
				return getId();
			case GeneralElementsPackage.GG_BASE_ELEMENT__NAME:
				return getName();
			case GeneralElementsPackage.GG_BASE_ELEMENT__CODE:
				return getCode();
			case GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION:
				return getDescription();
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
			case GeneralElementsPackage.GG_BASE_ELEMENT__ID:
				setId((String)newValue);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__CODE:
				setCode((String)newValue);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case GeneralElementsPackage.GG_BASE_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case GeneralElementsPackage.GG_BASE_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GeneralElementsPackage.GG_BASE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GeneralElementsPackage.GG_BASE_ELEMENT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //GgBaseElementImpl
