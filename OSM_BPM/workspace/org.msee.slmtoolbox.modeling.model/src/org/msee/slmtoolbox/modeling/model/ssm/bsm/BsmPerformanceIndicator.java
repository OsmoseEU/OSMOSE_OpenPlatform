/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredInfo <em>Required Info</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredProcessing <em>Required Processing</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory1 <em>Category1</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory2 <em>Category2</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory3 <em>Category3</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator()
 * @model
 * @generated
 */
public interface BsmPerformanceIndicator extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Formula()
	 * @model
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Required Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Info</em>' attribute.
	 * @see #setRequiredInfo(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_RequiredInfo()
	 * @model
	 * @generated
	 */
	String getRequiredInfo();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredInfo <em>Required Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Info</em>' attribute.
	 * @see #getRequiredInfo()
	 * @generated
	 */
	void setRequiredInfo(String value);

	/**
	 * Returns the value of the '<em><b>Required Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Processing</em>' attribute.
	 * @see #setRequiredProcessing(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_RequiredProcessing()
	 * @model
	 * @generated
	 */
	String getRequiredProcessing();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredProcessing <em>Required Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Processing</em>' attribute.
	 * @see #getRequiredProcessing()
	 * @generated
	 */
	void setRequiredProcessing(String value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' container reference.
	 * @see #setDecision(BsmDecision)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Decision()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPerformanceIndicators
	 * @model opposite="performanceIndicators" required="true" transient="false"
	 * @generated
	 */
	BsmDecision getDecision();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision <em>Decision</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' container reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(BsmDecision value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Variables()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getPerformanceIndicators
	 * @model opposite="performanceIndicators"
	 * @generated
	 */
	EList<BsmDecisionVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Objectives()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getPerformanceIndicators
	 * @model opposite="performanceIndicators"
	 * @generated
	 */
	EList<BsmDecisionObjective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Category1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category1</em>' attribute.
	 * @see #setCategory1(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Category1()
	 * @model
	 * @generated
	 */
	String getCategory1();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory1 <em>Category1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category1</em>' attribute.
	 * @see #getCategory1()
	 * @generated
	 */
	void setCategory1(String value);

	/**
	 * Returns the value of the '<em><b>Category2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category2</em>' attribute.
	 * @see #setCategory2(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Category2()
	 * @model
	 * @generated
	 */
	String getCategory2();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory2 <em>Category2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category2</em>' attribute.
	 * @see #getCategory2()
	 * @generated
	 */
	void setCategory2(String value);

	/**
	 * Returns the value of the '<em><b>Category3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category3</em>' attribute.
	 * @see #setCategory3(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Category3()
	 * @model
	 * @generated
	 */
	String getCategory3();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory3 <em>Category3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category3</em>' attribute.
	 * @see #getCategory3()
	 * @generated
	 */
	void setCategory3(String value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Dimension()
	 * @model
	 * @generated
	 */
	String getDimension();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmPerformanceIndicator_Fields()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators
	 * @model opposite="performanceIndicators" containment="true"
	 * @generated
	 */
	EList<BsmPiField> getFields();

} // BsmPerformanceIndicator
