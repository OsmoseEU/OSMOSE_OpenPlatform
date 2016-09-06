/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCategory <em>Category</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCompetence <em>Competence</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConcern <em>Concern</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getBsmModel <em>Bsm Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner()
 * @model
 * @generated
 */
public interface BsmPartner extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Competence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Competence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competence</em>' attribute.
	 * @see #setCompetence(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Competence()
	 * @model
	 * @generated
	 */
	String getCompetence();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCompetence <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competence</em>' attribute.
	 * @see #getCompetence()
	 * @generated
	 */
	void setCompetence(String value);

	/**
	 * Returns the value of the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' attribute.
	 * @see #setConcern(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Concern()
	 * @model
	 * @generated
	 */
	String getConcern();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConcern <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' attribute.
	 * @see #getConcern()
	 * @generated
	 */
	void setConcern(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution</em>' attribute.
	 * @see #setContribution(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Contribution()
	 * @model
	 * @generated
	 */
	String getContribution();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getContribution <em>Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contribution</em>' attribute.
	 * @see #getContribution()
	 * @generated
	 */
	void setContribution(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(BsmService)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_Service()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getPartners
	 * @model opposite="partners" required="true"
	 * @generated
	 */
	BsmService getService();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(BsmService value);

	/**
	 * Returns the value of the '<em><b>Bsm Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsm Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsm Model</em>' container reference.
	 * @see #setBsmModel(BsmModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPartner_BsmModel()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getPartners
	 * @model opposite="partners" required="true" transient="false"
	 * @generated
	 */
	BsmModel getBsmModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getBsmModel <em>Bsm Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsm Model</em>' container reference.
	 * @see #getBsmModel()
	 * @generated
	 */
	void setBsmModel(BsmModel value);

} // BsmPartner
