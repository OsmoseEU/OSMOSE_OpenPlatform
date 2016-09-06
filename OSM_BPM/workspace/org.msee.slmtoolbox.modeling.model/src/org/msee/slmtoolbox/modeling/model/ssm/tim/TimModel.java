/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getServices <em>Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getInformations <em>Informations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel()
 * @model
 * @generated
 */
public interface TimModel extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Services()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<TimService> getServices();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Processes()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<TimProcess> getProcesses();

	/**
	 * Returns the value of the '<em><b>Informations</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informations</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Informations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<TimInformationSet> getInformations();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<TimOrganization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage#getTimModel_Resources()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<TimResource> getResources();

} // TimModel
