/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmComponentImpl extends EObjectImpl implements BsmComponent {
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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmComponentImpl() {
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
		return BsmPackage.Literals.BSM_COMPONENT;
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
		return (String)eDynamicGet(BsmPackage.BSM_COMPONENT__ID, BsmPackage.Literals.BSM_COMPONENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_COMPONENT__ID, BsmPackage.Literals.BSM_COMPONENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_COMPONENT__NAME, BsmPackage.Literals.BSM_COMPONENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_COMPONENT__NAME, BsmPackage.Literals.BSM_COMPONENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCost() {
		return (String)eDynamicGet(BsmPackage.BSM_COMPONENT__COST, BsmPackage.Literals.BSM_COMPONENT__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(String newCost) {
		eDynamicSet(BsmPackage.BSM_COMPONENT__COST, BsmPackage.Literals.BSM_COMPONENT__COST, newCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProduct getProduct() {
		return (BsmProduct)eDynamicGet(BsmPackage.BSM_COMPONENT__PRODUCT, BsmPackage.Literals.BSM_COMPONENT__PRODUCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(BsmProduct newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProduct, BsmPackage.BSM_COMPONENT__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(BsmProduct newProduct) {
		eDynamicSet(BsmPackage.BSM_COMPONENT__PRODUCT, BsmPackage.Literals.BSM_COMPONENT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Compoment";
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
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProduct((BsmProduct)otherEnd, msgs);
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
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				return basicSetProduct(null, msgs);
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
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_PRODUCT__COMPONENTS, BsmProduct.class, msgs);
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
			case BsmPackage.BSM_COMPONENT__ID:
				return getId();
			case BsmPackage.BSM_COMPONENT__NAME:
				return getName();
			case BsmPackage.BSM_COMPONENT__COST:
				return getCost();
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				return getProduct();
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
			case BsmPackage.BSM_COMPONENT__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_COMPONENT__COST:
				setCost((String)newValue);
				return;
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				setProduct((BsmProduct)newValue);
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
			case BsmPackage.BSM_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_COMPONENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				setProduct((BsmProduct)null);
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
			case BsmPackage.BSM_COMPONENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_COMPONENT__COST:
				return COST_EDEFAULT == null ? getCost() != null : !COST_EDEFAULT.equals(getCost());
			case BsmPackage.BSM_COMPONENT__PRODUCT:
				return getProduct() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmComponentImpl
