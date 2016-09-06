/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Material Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EaMaterialResourceImpl extends EaResourceImpl implements EaMaterialResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaMaterialResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_MATERIAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Material Resource ");
		result.append(this.getName());
		return result.toString();
	}

} //EaMaterialResourceImpl
