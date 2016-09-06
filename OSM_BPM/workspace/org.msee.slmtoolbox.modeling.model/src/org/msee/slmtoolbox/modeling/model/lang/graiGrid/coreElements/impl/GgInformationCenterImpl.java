/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Information Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.GgInformationCenterImpl#getInformationSource <em>Information Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgInformationCenterImpl extends GgNodeImpl implements GgInformationCenter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgInformationCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.GG_INFORMATION_CENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgInformationSource getInformationSource() {
		return (GgInformationSource)eDynamicGet(CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE, CoreElementsPackage.Literals.GG_INFORMATION_CENTER__INFORMATION_SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgInformationSource basicGetInformationSource() {
		return (GgInformationSource)eDynamicGet(CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE, CoreElementsPackage.Literals.GG_INFORMATION_CENTER__INFORMATION_SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(GgInformationSource newInformationSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInformationSource, CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(GgInformationSource newInformationSource) {
		eDynamicSet(CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE, CoreElementsPackage.Literals.GG_INFORMATION_CENTER__INFORMATION_SOURCE, newInformationSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Information Center ");
		result.append(this.getName());
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				GgInformationSource informationSource = basicGetInformationSource();
				if (informationSource != null)
					msgs = ((InternalEObject)informationSource).eInverseRemove(this, CoreElementsPackage.GG_INFORMATION_SOURCE__INFORMATION_CENTERS, GgInformationSource.class, msgs);
				return basicSetInformationSource((GgInformationSource)otherEnd, msgs);
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				if (resolve) return getInformationSource();
				return basicGetInformationSource();
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				setInformationSource((GgInformationSource)newValue);
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				setInformationSource((GgInformationSource)null);
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
			case CoreElementsPackage.GG_INFORMATION_CENTER__INFORMATION_SOURCE:
				return basicGetInformationSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgInformationCenterImpl
