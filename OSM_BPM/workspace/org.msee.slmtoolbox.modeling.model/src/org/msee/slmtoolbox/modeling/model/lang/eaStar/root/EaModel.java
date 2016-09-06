/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getProcess <em>Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage#getEaModel()
 * @model
 * @generated
 */
public interface EaModel extends EaBaseElement {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(EaProcess)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage#getEaModel_Process()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	EaProcess getProcess();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(EaProcess value);

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage#getEaModel_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<EaOrganization> getOrganizations();

} // EaModel
