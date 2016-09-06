/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaBaseElement()
 * @model abstract="true"
 * @generated
 */
public interface EaBaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaBaseElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaBaseElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaBaseElement_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaBaseElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // EaBaseElement
