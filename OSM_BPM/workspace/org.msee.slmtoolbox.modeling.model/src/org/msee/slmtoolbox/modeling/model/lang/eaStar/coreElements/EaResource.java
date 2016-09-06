/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getUnitaryCost <em>Unitary Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getLocation <em>Location</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaResource()
 * @model abstract="true"
 * @generated
 */
public interface EaResource extends EaFlowNode {
	/**
	 * Returns the value of the '<em><b>Unitary Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitary Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitary Cost</em>' attribute.
	 * @see #setUnitaryCost(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaResource_UnitaryCost()
	 * @model
	 * @generated
	 */
	double getUnitaryCost();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getUnitaryCost <em>Unitary Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitary Cost</em>' attribute.
	 * @see #getUnitaryCost()
	 * @generated
	 */
	void setUnitaryCost(double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaResource_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute.
	 * @see #setCapabilities(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaResource_Capabilities()
	 * @model
	 * @generated
	 */
	String getCapabilities();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource#getCapabilities <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' attribute.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(String value);

} // EaResource
