/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#isIsTrigger <em>Is Trigger</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTriggerInfo <em>Trigger Info</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource <em>Source</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlow()
 * @model abstract="true"
 * @generated
 */
public interface EaFlow extends EaFlowElement {
	/**
	 * Returns the value of the '<em><b>Is Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Trigger</em>' attribute.
	 * @see #setIsTrigger(boolean)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlow_IsTrigger()
	 * @model
	 * @generated
	 */
	boolean isIsTrigger();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#isIsTrigger <em>Is Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Trigger</em>' attribute.
	 * @see #isIsTrigger()
	 * @generated
	 */
	void setIsTrigger(boolean value);

	/**
	 * Returns the value of the '<em><b>Trigger Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Info</em>' attribute.
	 * @see #setTriggerInfo(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlow_TriggerInfo()
	 * @model
	 * @generated
	 */
	String getTriggerInfo();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTriggerInfo <em>Trigger Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Info</em>' attribute.
	 * @see #getTriggerInfo()
	 * @generated
	 */
	void setTriggerInfo(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOutFlows <em>Out Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EaFlowNode)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlow_Source()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOutFlows
	 * @model opposite="outFlows" required="true"
	 * @generated
	 */
	EaFlowNode getSource();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EaFlowNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getInFlows <em>In Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EaFlowNode)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlow_Target()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getInFlows
	 * @model opposite="inFlows" required="true"
	 * @generated
	 */
	EaFlowNode getTarget();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EaFlowNode value);

} // EaFlow
