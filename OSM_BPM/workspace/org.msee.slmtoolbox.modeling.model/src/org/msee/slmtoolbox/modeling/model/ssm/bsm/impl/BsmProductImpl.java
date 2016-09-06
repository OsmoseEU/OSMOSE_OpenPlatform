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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getTechCharacteristics <em>Tech Characteristics</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmProductImpl extends EObjectImpl implements BsmProduct {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTechCharacteristics() <em>Tech Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String TECH_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmProductImpl() {
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
		return BsmPackage.Literals.BSM_PRODUCT;
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
		return (String)eDynamicGet(BsmPackage.BSM_PRODUCT__ID, BsmPackage.Literals.BSM_PRODUCT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__ID, BsmPackage.Literals.BSM_PRODUCT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_PRODUCT__NAME, BsmPackage.Literals.BSM_PRODUCT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__NAME, BsmPackage.Literals.BSM_PRODUCT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(BsmPackage.BSM_PRODUCT__TYPE, BsmPackage.Literals.BSM_PRODUCT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__TYPE, BsmPackage.Literals.BSM_PRODUCT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return (String)eDynamicGet(BsmPackage.BSM_PRODUCT__FUNCTION, BsmPackage.Literals.BSM_PRODUCT__FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__FUNCTION, BsmPackage.Literals.BSM_PRODUCT__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechCharacteristics() {
		return (String)eDynamicGet(BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS, BsmPackage.Literals.BSM_PRODUCT__TECH_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechCharacteristics(String newTechCharacteristics) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS, BsmPackage.Literals.BSM_PRODUCT__TECH_CHARACTERISTICS, newTechCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PRODUCT__SERVICE, BsmPackage.Literals.BSM_PRODUCT__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PRODUCT__SERVICE, BsmPackage.Literals.BSM_PRODUCT__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_PRODUCT__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__SERVICE, BsmPackage.Literals.BSM_PRODUCT__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmFunctionality> getFunctionalities() {
		return (EList<BsmFunctionality>)eDynamicGet(BsmPackage.BSM_PRODUCT__FUNCTIONALITIES, BsmPackage.Literals.BSM_PRODUCT__FUNCTIONALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmComponent> getComponents() {
		return (EList<BsmComponent>)eDynamicGet(BsmPackage.BSM_PRODUCT__COMPONENTS, BsmPackage.Literals.BSM_PRODUCT__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_PRODUCT__BSM_MODEL, BsmPackage.Literals.BSM_PRODUCT__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_PRODUCT__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__PRODUCTS, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_PRODUCT__BSM_MODEL, BsmPackage.Literals.BSM_PRODUCT__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Product";
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
			case BsmPackage.BSM_PRODUCT__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__PRODUCTS, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalities()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
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
			case BsmPackage.BSM_PRODUCT__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				return ((InternalEList<?>)getFunctionalities()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
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
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__PRODUCTS, BsmModel.class, msgs);
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
			case BsmPackage.BSM_PRODUCT__ID:
				return getId();
			case BsmPackage.BSM_PRODUCT__NAME:
				return getName();
			case BsmPackage.BSM_PRODUCT__TYPE:
				return getType();
			case BsmPackage.BSM_PRODUCT__FUNCTION:
				return getFunction();
			case BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS:
				return getTechCharacteristics();
			case BsmPackage.BSM_PRODUCT__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				return getFunctionalities();
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				return getComponents();
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
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
			case BsmPackage.BSM_PRODUCT__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__TYPE:
				setType((String)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__FUNCTION:
				setFunction((String)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS:
				setTechCharacteristics((String)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				getFunctionalities().clear();
				getFunctionalities().addAll((Collection<? extends BsmFunctionality>)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends BsmComponent>)newValue);
				return;
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
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
			case BsmPackage.BSM_PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_PRODUCT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_PRODUCT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS:
				setTechCharacteristics(TECH_CHARACTERISTICS_EDEFAULT);
				return;
			case BsmPackage.BSM_PRODUCT__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				getFunctionalities().clear();
				return;
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				getComponents().clear();
				return;
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
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
			case BsmPackage.BSM_PRODUCT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_PRODUCT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_PRODUCT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BsmPackage.BSM_PRODUCT__FUNCTION:
				return FUNCTION_EDEFAULT == null ? getFunction() != null : !FUNCTION_EDEFAULT.equals(getFunction());
			case BsmPackage.BSM_PRODUCT__TECH_CHARACTERISTICS:
				return TECH_CHARACTERISTICS_EDEFAULT == null ? getTechCharacteristics() != null : !TECH_CHARACTERISTICS_EDEFAULT.equals(getTechCharacteristics());
			case BsmPackage.BSM_PRODUCT__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_PRODUCT__FUNCTIONALITIES:
				return !getFunctionalities().isEmpty();
			case BsmPackage.BSM_PRODUCT__COMPONENTS:
				return !getComponents().isEmpty();
			case BsmPackage.BSM_PRODUCT__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmProductImpl
