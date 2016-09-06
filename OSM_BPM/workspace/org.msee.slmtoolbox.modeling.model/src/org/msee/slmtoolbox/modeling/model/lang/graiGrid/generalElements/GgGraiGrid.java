/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Grai Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getInformationSources <em>Information Sources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid()
 * @model
 * @generated
 */
public interface GgGraiGrid extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Levels()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid
	 * @model opposite="graiGrid" containment="true"
	 * @generated
	 */
	EList<GgLevel> getLevels();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Flows()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getGraiGrid
	 * @model opposite="graiGrid" containment="true"
	 * @generated
	 */
	EList<GgFlow> getFlows();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Nodes()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid
	 * @model opposite="graiGrid" containment="true"
	 * @generated
	 */
	EList<GgNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Functions()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getGraiGrid
	 * @model opposite="graiGrid"
	 * @generated
	 */
	EList<GgFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Information Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Sources</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_InformationSources()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource#getGraiGrid
	 * @model opposite="graiGrid" containment="true"
	 * @generated
	 */
	EList<GgInformationSource> getInformationSources();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid
	 * @model opposite="graiGrid"
	 * @generated
	 */
	EList<GgOrganization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getGraiGrids <em>Grai Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(GgModel)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgGraiGrid_Model()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getGraiGrids
	 * @model opposite="graiGrids" required="true" transient="false"
	 * @generated
	 */
	GgModel getModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(GgModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Grai Grid \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgGraiGrid
