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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getMainFunction <em>Main Function</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmFunctionalityImpl extends EObjectImpl implements BsmFunctionality {
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
	protected BsmFunctionalityImpl() {
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
		return BsmPackage.Literals.BSM_FUNCTIONALITY;
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
		return (String)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__ID, BsmPackage.Literals.BSM_FUNCTIONALITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__ID, BsmPackage.Literals.BSM_FUNCTIONALITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__NAME, BsmPackage.Literals.BSM_FUNCTIONALITY__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__NAME, BsmPackage.Literals.BSM_FUNCTIONALITY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__TYPE, BsmPackage.Literals.BSM_FUNCTIONALITY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__TYPE, BsmPackage.Literals.BSM_FUNCTIONALITY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION, BsmPackage.Literals.BSM_FUNCTIONALITY__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION, BsmPackage.Literals.BSM_FUNCTIONALITY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__SERVICE, BsmPackage.Literals.BSM_FUNCTIONALITY__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__SERVICE, BsmPackage.Literals.BSM_FUNCTIONALITY__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_FUNCTIONALITY__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__SERVICE, BsmPackage.Literals.BSM_FUNCTIONALITY__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProduct getProduct() {
		return (BsmProduct)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__PRODUCT, BsmPackage.Literals.BSM_FUNCTIONALITY__PRODUCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProduct basicGetProduct() {
		return (BsmProduct)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__PRODUCT, BsmPackage.Literals.BSM_FUNCTIONALITY__PRODUCT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(BsmProduct newProduct, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProduct, BsmPackage.BSM_FUNCTIONALITY__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(BsmProduct newProduct) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__PRODUCT, BsmPackage.Literals.BSM_FUNCTIONALITY__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmFunctionality> getSubFunctions() {
		return (EList<BsmFunctionality>)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS, BsmPackage.Literals.BSM_FUNCTIONALITY__SUB_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmFunctionality getMainFunction() {
		return (BsmFunctionality)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION, BsmPackage.Literals.BSM_FUNCTIONALITY__MAIN_FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmFunctionality basicGetMainFunction() {
		return (BsmFunctionality)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION, BsmPackage.Literals.BSM_FUNCTIONALITY__MAIN_FUNCTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFunction(BsmFunctionality newMainFunction, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMainFunction, BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainFunction(BsmFunctionality newMainFunction) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION, BsmPackage.Literals.BSM_FUNCTIONALITY__MAIN_FUNCTION, newMainFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL, BsmPackage.Literals.BSM_FUNCTIONALITY__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBsmModel, BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__FUNCTIONALITIES, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL, BsmPackage.Literals.BSM_FUNCTIONALITY__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Functionality";
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
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__FUNCTIONALITIES, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				BsmProduct product = basicGetProduct();
				if (product != null)
					msgs = ((InternalEObject)product).eInverseRemove(this, BsmPackage.BSM_PRODUCT__FUNCTIONALITIES, BsmProduct.class, msgs);
				return basicSetProduct((BsmProduct)otherEnd, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFunctions()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				BsmFunctionality mainFunction = basicGetMainFunction();
				if (mainFunction != null)
					msgs = ((InternalEObject)mainFunction).eInverseRemove(this, BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS, BsmFunctionality.class, msgs);
				return basicSetMainFunction((BsmFunctionality)otherEnd, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
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
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				return basicSetProduct(null, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				return ((InternalEList<?>)getSubFunctions()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				return basicSetMainFunction(null, msgs);
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
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
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__FUNCTIONALITIES, BsmModel.class, msgs);
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
			case BsmPackage.BSM_FUNCTIONALITY__ID:
				return getId();
			case BsmPackage.BSM_FUNCTIONALITY__NAME:
				return getName();
			case BsmPackage.BSM_FUNCTIONALITY__TYPE:
				return getType();
			case BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION:
				return getDescription();
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				return getSubFunctions();
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				if (resolve) return getMainFunction();
				return basicGetMainFunction();
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
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
			case BsmPackage.BSM_FUNCTIONALITY__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__TYPE:
				setType((String)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				setProduct((BsmProduct)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				getSubFunctions().clear();
				getSubFunctions().addAll((Collection<? extends BsmFunctionality>)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				setMainFunction((BsmFunctionality)newValue);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
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
			case BsmPackage.BSM_FUNCTIONALITY__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				setProduct((BsmProduct)null);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				getSubFunctions().clear();
				return;
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				setMainFunction((BsmFunctionality)null);
				return;
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
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
			case BsmPackage.BSM_FUNCTIONALITY__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_FUNCTIONALITY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_FUNCTIONALITY__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BsmPackage.BSM_FUNCTIONALITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BsmPackage.BSM_FUNCTIONALITY__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_FUNCTIONALITY__PRODUCT:
				return basicGetProduct() != null;
			case BsmPackage.BSM_FUNCTIONALITY__SUB_FUNCTIONS:
				return !getSubFunctions().isEmpty();
			case BsmPackage.BSM_FUNCTIONALITY__MAIN_FUNCTION:
				return basicGetMainFunction() != null;
			case BsmPackage.BSM_FUNCTIONALITY__BSM_MODEL:
				return getBsmModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmFunctionalityImpl
