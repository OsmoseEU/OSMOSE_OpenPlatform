/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Information Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource <em>Information Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgInformationCenter()
 * @model
 * @generated
 */
public interface GgInformationCenter extends GgNode {
	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getInformationCenters <em>Information Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Source</em>' reference.
	 * @see #setInformationSource(GgInformationSource)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgInformationCenter_InformationSource()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getInformationCenters
	 * @model opposite="informationCenters" required="true"
	 * @generated
	 */
	GgInformationSource getInformationSource();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource <em>Information Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(GgInformationSource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Information Center \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgInformationCenter
