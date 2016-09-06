/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Decision Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getDecisionVariable <em>Decision Variable</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionFrame()
 * @model
 * @generated
 */
public interface GgDecisionFrame extends GgFlow {
	/**
	 * Returns the value of the '<em><b>Decision Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Variable</em>' attribute.
	 * @see #setDecisionVariable(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionFrame_DecisionVariable()
	 * @model
	 * @generated
	 */
	String getDecisionVariable();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getDecisionVariable <em>Decision Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Variable</em>' attribute.
	 * @see #getDecisionVariable()
	 * @generated
	 */
	void setDecisionVariable(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionFrame_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionFrame_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see #setCriteria(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgDecisionFrame_Criteria()
	 * @model
	 * @generated
	 */
	String getCriteria();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Decision Frame \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgDecisionFrame
