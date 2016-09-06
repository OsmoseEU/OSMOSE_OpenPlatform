/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getRole <em>Role</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getEaResources <em>Ea Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getMseService <em>Mse Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource()
 * @model
 * @generated
 */
public interface BsmResource extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType
	 * @see #setType(BsmResourceType)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Type()
	 * @model
	 * @generated
	 */
	BsmResourceType getType();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType
	 * @see #getType()
	 * @generated
	 */
	void setType(BsmResourceType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' attribute.
	 * @see #setCapability(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Capability()
	 * @model
	 * @generated
	 */
	String getCapability();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getCapability <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' attribute.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(BsmService)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Service()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getResources
	 * @model opposite="resources" required="true"
	 * @generated
	 */
	BsmService getService();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(BsmService value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Processes()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<BsmProcess> getProcesses();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(BsmEnterprise)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_Organization()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	BsmEnterprise getOrganization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(BsmEnterprise value);

	/**
	 * Returns the value of the '<em><b>Bsm Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsm Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsm Model</em>' reference.
	 * @see #setBsmModel(BsmModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_BsmModel()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getResources
	 * @model opposite="resources" required="true"
	 * @generated
	 */
	BsmModel getBsmModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getBsmModel <em>Bsm Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsm Model</em>' reference.
	 * @see #getBsmModel()
	 * @generated
	 */
	void setBsmModel(BsmModel value);

	/**
	 * Returns the value of the '<em><b>Ea Resources</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Resources</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_EaResources()
	 * @model
	 * @generated
	 */
	EList<EaResource> getEaResources();

	/**
	 * Returns the value of the '<em><b>Mse Service</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mse Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mse Service</em>' containment reference.
	 * @see #setMseService(BsmMseService)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResource_MseService()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getResource
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	BsmMseService getMseService();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getMseService <em>Mse Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mse Service</em>' containment reference.
	 * @see #getMseService()
	 * @generated
	 */
	void setMseService(BsmMseService value);

} // BsmResource
