/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Time Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgTimeValue()
 * @model
 * @generated
 */
public interface GgTimeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits
	 * @see #setUnit(GgTimeUnits)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgTimeValue_Unit()
	 * @model
	 * @generated
	 */
	GgTimeUnits getUnit();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GgTimeUnits value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgTimeValue_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(this.getValue());\r\nresult.append(\" \");\r\nresult.append(this.getUnit());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgTimeValue
