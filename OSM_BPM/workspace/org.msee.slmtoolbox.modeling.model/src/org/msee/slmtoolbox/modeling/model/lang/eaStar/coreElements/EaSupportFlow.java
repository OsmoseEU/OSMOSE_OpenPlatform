/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Support Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaSupportFlow()
 * @model
 * @generated
 */
public interface EaSupportFlow extends EaFlow {
	/**
	 * Returns the value of the '<em><b>Resource Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Role</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole
	 * @see #setResourceRole(EaResourceRole)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaSupportFlow_ResourceRole()
	 * @model
	 * @generated
	 */
	EaResourceRole getResourceRole();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResourceRole <em>Resource Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Role</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole
	 * @see #getResourceRole()
	 * @generated
	 */
	void setResourceRole(EaResourceRole value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' attribute.
	 * @see #setResponsibility(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaSupportFlow_Responsibility()
	 * @model
	 * @generated
	 */
	String getResponsibility();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow#getResponsibility <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' attribute.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Support Flow\");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // EaSupportFlow
