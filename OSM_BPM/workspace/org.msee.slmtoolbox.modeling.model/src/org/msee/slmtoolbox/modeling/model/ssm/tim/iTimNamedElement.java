/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>iTim Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getiTimNamedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface iTimNamedElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setId(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // iTimNamedElement
