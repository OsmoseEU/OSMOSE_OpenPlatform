/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResult <em>Result</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getWorkFlow <em>Work Flow</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getSubprocesses <em>Subprocesses</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess <em>Main Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getServices <em>Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit <em>Responsible Organization Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess()
 * @model
 * @generated
 */
public interface TimProcess extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see #setObjective(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Work Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Flow</em>' attribute.
	 * @see #setWorkFlow(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_WorkFlow()
	 * @model
	 * @generated
	 */
	String getWorkFlow();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getWorkFlow <em>Work Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Flow</em>' attribute.
	 * @see #getWorkFlow()
	 * @generated
	 */
	void setWorkFlow(String value);

	/**
	 * Returns the value of the '<em><b>Subprocesses</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess <em>Main Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocesses</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Subprocesses()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess
	 * @model opposite="mainProcess"
	 * @generated
	 */
	EList<TimProcess> getSubprocesses();

	/**
	 * Returns the value of the '<em><b>Main Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getSubprocesses <em>Subprocesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Process</em>' reference.
	 * @see #setMainProcess(TimProcess)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_MainProcess()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getSubprocesses
	 * @model opposite="subprocesses"
	 * @generated
	 */
	TimProcess getMainProcess();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getMainProcess <em>Main Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Process</em>' reference.
	 * @see #getMainProcess()
	 * @generated
	 */
	void setMainProcess(TimProcess value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Services()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getProcesses
	 * @model opposite="processes"
	 * @generated
	 */
	EList<TimService> getServices();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Resources()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getProcesses
	 * @model opposite="processes"
	 * @generated
	 */
	EList<TimResource> getResources();

	/**
	 * Returns the value of the '<em><b>Responsible Organization Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Organization Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Organization Unit</em>' reference.
	 * @see #setResponsibleOrganizationUnit(TimOrganizationUnit)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_ResponsibleOrganizationUnit()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit#getProcesses
	 * @model opposite="processes"
	 * @generated
	 */
	TimOrganizationUnit getResponsibleOrganizationUnit();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getResponsibleOrganizationUnit <em>Responsible Organization Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Organization Unit</em>' reference.
	 * @see #getResponsibleOrganizationUnit()
	 * @generated
	 */
	void setResponsibleOrganizationUnit(TimOrganizationUnit value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(TimModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Model()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getProcesses
	 * @model opposite="processes" required="true" transient="false"
	 * @generated
	 */
	TimModel getModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TimModel value);

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimProcess_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization#getProcesses
	 * @model opposite="processes"
	 * @generated
	 */
	EList<TimOrganization> getOrganizations();

} // TimProcess
