/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getInformation <em>Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship()
 * @model
 * @generated
 */
public interface TimInformationRelationship extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getName <em>Name</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getOutRelations <em>Out Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see #setSourceEntity(TimInformationEntity)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_SourceEntity()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getOutRelations
	 * @model opposite="outRelations" required="true"
	 * @generated
	 */
	TimInformationEntity getSourceEntity();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity</em>' reference.
	 * @see #getSourceEntity()
	 * @generated
	 */
	void setSourceEntity(TimInformationEntity value);

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInRelations <em>In Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(TimInformationEntity)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_TargetEntity()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInRelations
	 * @model opposite="inRelations" required="true"
	 * @generated
	 */
	TimInformationEntity getTargetEntity();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(TimInformationEntity value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' container reference.
	 * @see #setInformation(TimInformationSet)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationRelationship_Information()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getRelationships
	 * @model opposite="relationships" required="true" transient="false"
	 * @generated
	 */
	TimInformationSet getInformation();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getInformation <em>Information</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' container reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(TimInformationSet value);

} // TimInformationRelationship
