/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Information Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getInformationCenters <em>Information Centers</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgInformationSource()
 * @model abstract="true"
 * @generated
 */
public interface GgInformationSource extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Information Centers</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource <em>Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Centers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Centers</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgInformationSource_InformationCenters()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter#getInformationSource
	 * @model opposite="informationSource"
	 * @generated
	 */
	EList<GgInformationCenter> getInformationCenters();

	/**
	 * Returns the value of the '<em><b>Grai Grid</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getInformationSources <em>Information Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grid</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grid</em>' container reference.
	 * @see #setGraiGrid(GgGraiGrid)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgInformationSource_GraiGrid()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getInformationSources
	 * @model opposite="informationSources" required="true" transient="false"
	 * @generated
	 */
	GgGraiGrid getGraiGrid();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid <em>Grai Grid</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grai Grid</em>' container reference.
	 * @see #getGraiGrid()
	 * @generated
	 */
	void setGraiGrid(GgGraiGrid value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Information Source \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgInformationSource
