/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaControlFlow()
 * @model
 * @generated
 */
public interface EaControlFlow extends EaFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Control Flow \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // EaControlFlow
