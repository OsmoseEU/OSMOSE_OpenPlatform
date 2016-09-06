/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Information Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity <em>Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationAttribute()
 * @model
 * @generated
 */
public interface TimInformationAttribute extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationAttribute_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationAttribute_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Information Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Entity</em>' container reference.
	 * @see #setInformationEntity(TimInformationEntity)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationAttribute_InformationEntity()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	TimInformationEntity getInformationEntity();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity <em>Information Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Entity</em>' container reference.
	 * @see #getInformationEntity()
	 * @generated
	 */
	void setInformationEntity(TimInformationEntity value);

} // TimInformationAttribute
