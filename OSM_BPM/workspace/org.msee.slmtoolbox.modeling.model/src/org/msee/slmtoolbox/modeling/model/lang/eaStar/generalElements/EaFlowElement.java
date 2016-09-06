/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface EaFlowElement extends EaBaseElement {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(EaProcess)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage#getEaFlowElement_Process()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getFlowElements
	 * @model opposite="flowElements" required="true" transient="false"
	 * @generated
	 */
	EaProcess getProcess();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(EaProcess value);

} // EaFlowElement
