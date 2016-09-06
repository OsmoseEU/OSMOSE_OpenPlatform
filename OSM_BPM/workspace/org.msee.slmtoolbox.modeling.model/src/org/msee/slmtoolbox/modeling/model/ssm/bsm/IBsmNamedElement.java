/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBsm Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getIBsmNamedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBsmNamedElement extends EObject {
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nString nameElement = TODO_NAME;\r\nStringBuffer result = new StringBuffer();\r\nif (null == this.getName()) {\r\nresult.append(\"<\");\r\nresult.append(nameElement);\r\nresult.append(\">\");\r\n} else {\r\nresult.append(nameElement);\r\nresult.append(\" \");\r\nresult.append(this.getName());\r\n}\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // IBsmNamedElement
