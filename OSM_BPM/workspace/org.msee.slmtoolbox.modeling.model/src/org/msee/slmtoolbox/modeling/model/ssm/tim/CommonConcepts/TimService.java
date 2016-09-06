/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tim Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAccess <em>Access</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAutomationLevel <em>Automation Level</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getNature <em>Nature</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getSubServices <em>Sub Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService <em>Main Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService()
 * @model
 * @generated
 */
public interface TimService extends iTimNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see #setNature(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Nature()
	 * @model
	 * @generated
	 */
	String getNature();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see #getNature()
	 * @generated
	 */
	void setNature(String value);

	/**
	 * Returns the value of the '<em><b>Sub Services</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService <em>Main Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Services</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_SubServices()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService
	 * @model opposite="mainService"
	 * @generated
	 */
	EList<TimService> getSubServices();

	/**
	 * Returns the value of the '<em><b>Main Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getSubServices <em>Sub Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Service</em>' reference.
	 * @see #setMainService(TimService)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_MainService()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getSubServices
	 * @model opposite="subServices"
	 * @generated
	 */
	TimService getMainService();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getMainService <em>Main Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Service</em>' reference.
	 * @see #getMainService()
	 * @generated
	 */
	void setMainService(TimService value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Processes()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess#getServices
	 * @model opposite="services"
	 * @generated
	 */
	EList<TimProcess> getProcesses();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Resources()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource#getServices
	 * @model opposite="services"
	 * @generated
	 */
	EList<TimResource> getResources();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(TimModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Model()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	TimModel getModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TimModel value);

	/**
	 * Returns the value of the '<em><b>Automation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automation Level</em>' attribute.
	 * @see #setAutomationLevel(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_AutomationLevel()
	 * @model
	 * @generated
	 */
	String getAutomationLevel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAutomationLevel <em>Automation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automation Level</em>' attribute.
	 * @see #getAutomationLevel()
	 * @generated
	 */
	void setAutomationLevel(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Access()
	 * @model
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption</em>' attribute.
	 * @see #setConsumption(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Consumption()
	 * @model
	 * @generated
	 */
	String getConsumption();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getConsumption <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption</em>' attribute.
	 * @see #getConsumption()
	 * @generated
	 */
	void setConsumption(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage#getTimService_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

} // TimService
