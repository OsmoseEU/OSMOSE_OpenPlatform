/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getFunction <em>Function</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit()
 * @model
 * @generated
 */
public interface TimOrganizationUnit extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getOrganizationUnits <em>Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(TimOrganization)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Organization()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getOrganizationUnits
	 * @model opposite="organizationUnits" required="true" transient="false"
	 * @generated
	 */
	TimOrganization getOrganization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(TimOrganization value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getOrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Resources()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getOrganizationUnit
	 * @model opposite="organizationUnit" containment="true"
	 * @generated
	 */
	EList<TimResource> getResources();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit <em>Responsible Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Processes()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit
	 * @model opposite="responsibleOrganizationUnit"
	 * @generated
	 */
	EList<TimProcess> getProcesses();

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Responsibility()
	 * @model
	 * @generated
	 */
	String getResponsibility();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getResponsibility <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' attribute.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(String value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage#getTimOrganizationUnit_Authorization()
	 * @model
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

} // TimOrganizationUnit
