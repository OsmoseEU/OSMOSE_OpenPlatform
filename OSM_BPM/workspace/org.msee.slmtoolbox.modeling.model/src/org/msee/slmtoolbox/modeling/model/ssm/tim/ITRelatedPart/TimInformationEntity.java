/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Information Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getOutRelations <em>Out Relations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInRelations <em>In Relations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInformation <em>Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity()
 * @model
 * @generated
 */
public interface TimInformationEntity extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Relations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Relations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_OutRelations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getSourceEntity
	 * @model opposite="sourceEntity"
	 * @generated
	 */
	EList<TimInformationRelationship> getOutRelations();

	/**
	 * Returns the value of the '<em><b>In Relations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_InRelations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship#getTargetEntity
	 * @model opposite="targetEntity"
	 * @generated
	 */
	EList<TimInformationRelationship> getInRelations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity <em>Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_Attributes()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute#getInformationEntity
	 * @model opposite="informationEntity" containment="true"
	 * @generated
	 */
	EList<TimInformationAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Information</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' container reference.
	 * @see #setInformation(TimInformationSet)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage#getTimInformationEntity_Information()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getEntities
	 * @model opposite="entities" required="true" transient="false"
	 * @generated
	 */
	TimInformationSet getInformation();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity#getInformation <em>Information</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' container reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(TimInformationSet value);

} // TimInformationEntity
