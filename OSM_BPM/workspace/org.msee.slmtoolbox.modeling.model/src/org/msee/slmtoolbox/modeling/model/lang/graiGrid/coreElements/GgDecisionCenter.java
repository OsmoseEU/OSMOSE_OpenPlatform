/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Decision Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionCenter()
 * @model
 * @generated
 */
public interface GgDecisionCenter extends GgNode {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getDecisionCenters <em>Decision Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(GgFunction)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionCenter_Function()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getDecisionCenters
	 * @model opposite="decisionCenters" required="true"
	 * @generated
	 */
	GgFunction getFunction();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(GgFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Decision Center \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgDecisionCenter
