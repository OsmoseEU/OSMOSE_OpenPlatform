/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid <em>Grai Grid</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getDecisionCenters <em>Decision Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgFunction()
 * @model
 * @generated
 */
public interface GgFunction extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Grai Grid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grid</em>' reference.
	 * @see #setGraiGrid(GgGraiGrid)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgFunction_GraiGrid()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFunctions
	 * @model opposite="functions"
	 * @generated
	 */
	GgGraiGrid getGraiGrid();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid <em>Grai Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grai Grid</em>' reference.
	 * @see #getGraiGrid()
	 * @generated
	 */
	void setGraiGrid(GgGraiGrid value);

	/**
	 * Returns the value of the '<em><b>Decision Centers</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Centers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Centers</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgFunction_DecisionCenters()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter#getFunction
	 * @model opposite="function"
	 * @generated
	 */
	EList<GgDecisionCenter> getDecisionCenters();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(GgOrganization)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgFunction_Organization()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getFunctions
	 * @model opposite="functions" transient="false"
	 * @generated
	 */
	GgOrganization getOrganization();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(GgOrganization value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Function \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgFunction
