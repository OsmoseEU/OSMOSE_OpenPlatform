/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getEvent <em>Event</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure <em>Decision Structure</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getGgDecisionCenters <em>Gg Decision Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPerformanceIndicators <em>Performance Indicators</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjectives <em>Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision()
 * @model
 * @generated
 */
public interface BsmDecision extends IBsmNamedElement {
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getId <em>Id</em>}' attribute.
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType
	 * @see #setType(BsmDecisionType)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Type()
	 * @model
	 * @generated
	 */
	BsmDecisionType getType();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType
	 * @see #getType()
	 * @generated
	 */
	void setType(BsmDecisionType value);

	/**
	 * Returns the value of the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon</em>' attribute.
	 * @see #setHorizon(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Horizon()
	 * @model
	 * @generated
	 */
	String getHorizon();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getHorizon <em>Horizon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon</em>' attribute.
	 * @see #getHorizon()
	 * @generated
	 */
	void setHorizon(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Period()
	 * @model
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Decision Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Structure</em>' container reference.
	 * @see #setDecisionStructure(BsmDecisionStructure)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_DecisionStructure()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getDecisions
	 * @model opposite="decisions" required="true" transient="false"
	 * @generated
	 */
	BsmDecisionStructure getDecisionStructure();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure <em>Decision Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Structure</em>' container reference.
	 * @see #getDecisionStructure()
	 * @generated
	 */
	void setDecisionStructure(BsmDecisionStructure value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(BsmOrganization)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Organization()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisions
	 * @model opposite="decisions" required="true"
	 * @generated
	 */
	BsmOrganization getOrganization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(BsmOrganization value);

	/**
	 * Returns the value of the '<em><b>Bsm Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsm Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsm Model</em>' reference.
	 * @see #setBsmModel(BsmModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_BsmModel()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisions
	 * @model opposite="decisions" required="true"
	 * @generated
	 */
	BsmModel getBsmModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getBsmModel <em>Bsm Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsm Model</em>' reference.
	 * @see #getBsmModel()
	 * @generated
	 */
	void setBsmModel(BsmModel value);

	/**
	 * Returns the value of the '<em><b>Gg Decision Centers</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gg Decision Centers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gg Decision Centers</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_GgDecisionCenters()
	 * @model
	 * @generated
	 */
	EList<GgDecisionCenter> getGgDecisionCenters();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Variables()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDecision
	 * @model opposite="decision" containment="true"
	 * @generated
	 */
	EList<BsmDecisionVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Performance Indicators</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Indicators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Indicators</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_PerformanceIndicators()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision
	 * @model opposite="decision" containment="true"
	 * @generated
	 */
	EList<BsmPerformanceIndicator> getPerformanceIndicators();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecision_Objectives()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDecision
	 * @model opposite="decision" containment="true"
	 * @generated
	 */
	EList<BsmDecisionObjective> getObjectives();

} // BsmDecision
