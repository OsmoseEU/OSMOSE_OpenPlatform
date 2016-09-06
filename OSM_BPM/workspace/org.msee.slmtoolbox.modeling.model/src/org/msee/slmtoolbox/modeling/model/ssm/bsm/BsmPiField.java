/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pi Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators <em>Performance Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPiField()
 * @model
 * @generated
 */
public interface BsmPiField extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPiField_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPiField_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Performance Indicators</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Indicators</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Indicators</em>' container reference.
	 * @see #setPerformanceIndicators(BsmPerformanceIndicator)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPiField_PerformanceIndicators()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	BsmPerformanceIndicator getPerformanceIndicators();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators <em>Performance Indicators</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Indicators</em>' container reference.
	 * @see #getPerformanceIndicators()
	 * @generated
	 */
	void setPerformanceIndicators(BsmPerformanceIndicator value);

} // BsmPiField
