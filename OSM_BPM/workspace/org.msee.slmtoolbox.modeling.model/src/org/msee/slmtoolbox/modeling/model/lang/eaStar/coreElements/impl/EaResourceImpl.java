/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl#getUnitaryCost <em>Unitary Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaResourceImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EaResourceImpl extends EaFlowNodeImpl implements EaResource {
	/**
	 * The default value of the '{@link #getUnitaryCost() <em>Unitary Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitaryCost()
	 * @generated
	 * @ordered
	 */
	protected static final double UNITARY_COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITIES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnitaryCost() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_RESOURCE__UNITARY_COST, CoreElementsPackage.Literals.EA_RESOURCE__UNITARY_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitaryCost(double newUnitaryCost) {
		eDynamicSet(CoreElementsPackage.EA_RESOURCE__UNITARY_COST, CoreElementsPackage.Literals.EA_RESOURCE__UNITARY_COST, newUnitaryCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eDynamicGet(CoreElementsPackage.EA_RESOURCE__LOCATION, CoreElementsPackage.Literals.EA_RESOURCE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eDynamicSet(CoreElementsPackage.EA_RESOURCE__LOCATION, CoreElementsPackage.Literals.EA_RESOURCE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapabilities() {
		return (String)eDynamicGet(CoreElementsPackage.EA_RESOURCE__CAPABILITIES, CoreElementsPackage.Literals.EA_RESOURCE__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(String newCapabilities) {
		eDynamicSet(CoreElementsPackage.EA_RESOURCE__CAPABILITIES, CoreElementsPackage.Literals.EA_RESOURCE__CAPABILITIES, newCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.EA_RESOURCE__UNITARY_COST:
				return getUnitaryCost();
			case CoreElementsPackage.EA_RESOURCE__LOCATION:
				return getLocation();
			case CoreElementsPackage.EA_RESOURCE__CAPABILITIES:
				return getCapabilities();
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
			case CoreElementsPackage.EA_RESOURCE__UNITARY_COST:
				setUnitaryCost((Double)newValue);
				return;
			case CoreElementsPackage.EA_RESOURCE__LOCATION:
				setLocation((String)newValue);
				return;
			case CoreElementsPackage.EA_RESOURCE__CAPABILITIES:
				setCapabilities((String)newValue);
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
			case CoreElementsPackage.EA_RESOURCE__UNITARY_COST:
				setUnitaryCost(UNITARY_COST_EDEFAULT);
				return;
			case CoreElementsPackage.EA_RESOURCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CoreElementsPackage.EA_RESOURCE__CAPABILITIES:
				setCapabilities(CAPABILITIES_EDEFAULT);
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
			case CoreElementsPackage.EA_RESOURCE__UNITARY_COST:
				return getUnitaryCost() != UNITARY_COST_EDEFAULT;
			case CoreElementsPackage.EA_RESOURCE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case CoreElementsPackage.EA_RESOURCE__CAPABILITIES:
				return CAPABILITIES_EDEFAULT == null ? getCapabilities() != null : !CAPABILITIES_EDEFAULT.equals(getCapabilities());
		}
		return super.eIsSet(featureID);
	}

} //EaResourceImpl
