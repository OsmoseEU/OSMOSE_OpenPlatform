/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getInFlows <em>In Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOutFlows <em>Out Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface EaFlowNode extends EaFlowElement {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getFlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(EaOrganization)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlowNode_Organization()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getFlowNode
	 * @model opposite="flowNode"
	 * @generated
	 */
	EaOrganization getOrganization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(EaOrganization value);

	/**
	 * Returns the value of the '<em><b>In Flows</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Flows</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlowNode_InFlows()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<EaFlow> getInFlows();

	/**
	 * Returns the value of the '<em><b>Out Flows</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Flows</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaFlowNode_OutFlows()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<EaFlow> getOutFlows();

} // EaFlowNode
