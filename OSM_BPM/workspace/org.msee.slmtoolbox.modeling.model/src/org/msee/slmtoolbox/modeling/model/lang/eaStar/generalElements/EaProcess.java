/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements;

import org.eclipse.emf.common.util.EList;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getCanBe <em>Can Be</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getDecompositionCode <em>Decomposition Code</em>}</li>
 *   <li>{@link eaStar.generalElements.EaProcess#getOsmioticProcess <em>Osmiotic Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess()
 * @model
 * @generated
 */
public interface EaProcess extends EaBaseElement {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link eaStar.generalElements.EaFlowElement}.
	 * It is bidirectional and its opposite is '{@link eaStar.generalElements.EaFlowElement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess_FlowElements()
	 * @see eaStar.generalElements.EaFlowElement#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	EList<EaFlowElement> getFlowElements();

	/**
	 * Returns the value of the '<em><b>Can Be</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eaStar.coreElements.EaStructuralExtendedActivity#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be</em>' reference.
	 * @see #setCanBe(EaStructuralExtendedActivity)
	 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess_CanBe()
	 * @see eaStar.coreElements.EaStructuralExtendedActivity#getIsA
	 * @model opposite="isA"
	 * @generated
	 */
	EaStructuralExtendedActivity getCanBe();

	/**
	 * Sets the value of the '{@link eaStar.generalElements.EaProcess#getCanBe <em>Can Be</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be</em>' reference.
	 * @see #getCanBe()
	 * @generated
	 */
	void setCanBe(EaStructuralExtendedActivity value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eaStar.root.EaModel#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(EaModel)
	 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess_Model()
	 * @see eaStar.root.EaModel#getProcess
	 * @model opposite="process" required="true" transient="false"
	 * @generated
	 */
	EaModel getModel();

	/**
	 * Sets the value of the '{@link eaStar.generalElements.EaProcess#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EaModel value);

	/**
	 * Returns the value of the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Code</em>' attribute.
	 * @see #setDecompositionCode(String)
	 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess_DecompositionCode()
	 * @model
	 * @generated
	 */
	String getDecompositionCode();

	/**
	 * Sets the value of the '{@link eaStar.generalElements.EaProcess#getDecompositionCode <em>Decomposition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition Code</em>' attribute.
	 * @see #getDecompositionCode()
	 * @generated
	 */
	void setDecompositionCode(String value);

	/**
	 * Returns the value of the '<em><b>Osmiotic Process</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osmiotic Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osmiotic Process</em>' attribute.
	 * @see #setOsmioticProcess(String)
	 * @see eaStar.generalElements.GeneralElementsPackage#getEaProcess_OsmioticProcess()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	String getOsmioticProcess();

	/**
	 * Sets the value of the '{@link eaStar.generalElements.EaProcess#getOsmioticProcess <em>Osmiotic Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osmiotic Process</em>' attribute.
	 * @see #getOsmioticProcess()
	 * @generated
	 */
	void setOsmioticProcess(String value);

} // EaProcess
