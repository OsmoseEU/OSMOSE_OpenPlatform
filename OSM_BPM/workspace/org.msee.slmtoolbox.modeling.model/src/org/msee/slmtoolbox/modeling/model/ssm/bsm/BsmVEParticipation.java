/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VE Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getVirtualEnterprise <em>Virtual Enterprise</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmVEParticipation()
 * @model
 * @generated
 */
public interface BsmVEParticipation extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmVEParticipation_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmVEParticipation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enterprise</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getVeParticipations <em>Ve Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise</em>' reference.
	 * @see #setEnterprise(BsmEnterprise)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmVEParticipation_Enterprise()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getVeParticipations
	 * @model opposite="veParticipations" required="true"
	 * @generated
	 */
	BsmEnterprise getEnterprise();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise <em>Enterprise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise</em>' reference.
	 * @see #getEnterprise()
	 * @generated
	 */
	void setEnterprise(BsmEnterprise value);

	/**
	 * Returns the value of the '<em><b>Virtual Enterprise</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getVeParticipations <em>Ve Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Enterprise</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Enterprise</em>' container reference.
	 * @see #setVirtualEnterprise(BsmVirtualEnterprise)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmVEParticipation_VirtualEnterprise()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getVeParticipations
	 * @model opposite="veParticipations" required="true" transient="false"
	 * @generated
	 */
	BsmVirtualEnterprise getVirtualEnterprise();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getVirtualEnterprise <em>Virtual Enterprise</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Enterprise</em>' container reference.
	 * @see #getVirtualEnterprise()
	 * @generated
	 */
	void setVirtualEnterprise(BsmVirtualEnterprise value);

} // BsmVEParticipation
