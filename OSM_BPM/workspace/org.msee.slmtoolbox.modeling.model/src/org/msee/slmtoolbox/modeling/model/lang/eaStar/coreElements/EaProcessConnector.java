/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Process Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaProcessConnector()
 * @model
 * @generated
 */
public interface EaProcessConnector extends EaConnector {
	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(EaProcess)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaProcessConnector_ProcessRef()
	 * @model required="true"
	 * @generated
	 */
	EaProcess getProcessRef();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(EaProcess value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Process Connector \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // EaProcessConnector
