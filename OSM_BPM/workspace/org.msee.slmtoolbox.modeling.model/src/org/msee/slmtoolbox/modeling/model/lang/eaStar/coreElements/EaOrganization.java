/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaOrganization()
 * @model
 * @generated
 */
public interface EaOrganization extends EaBaseElement {
	/**
	 * Returns the value of the '<em><b>Flow Node</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Node</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaOrganization_FlowNode()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode#getOrganization
	 * @model opposite="organization"
	 * @generated
	 */
	EList<EaFlowNode> getFlowNode();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(EaModel)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaOrganization_Model()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getOrganizations
	 * @model opposite="organizations" required="true" transient="false"
	 * @generated
	 */
	EaModel getModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EaModel value);

} // EaOrganization
