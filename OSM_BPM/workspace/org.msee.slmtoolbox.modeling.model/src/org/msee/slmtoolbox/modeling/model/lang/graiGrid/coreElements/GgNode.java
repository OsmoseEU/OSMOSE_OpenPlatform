/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel <em>Level</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getOutFlows <em>Out Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getInFlows <em>In Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgNode()
 * @model abstract="true"
 * @generated
 */
public interface GgNode extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(GgLevel)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgNode_Level()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	GgLevel getLevel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(GgLevel value);

	/**
	 * Returns the value of the '<em><b>Out Flows</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Flows</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgNode_OutFlows()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<GgFlow> getOutFlows();

	/**
	 * Returns the value of the '<em><b>In Flows</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Flows</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgNode_InFlows()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<GgFlow> getInFlows();

	/**
	 * Returns the value of the '<em><b>Grai Grid</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grid</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grid</em>' container reference.
	 * @see #setGraiGrid(GgGraiGrid)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgNode_GraiGrid()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	GgGraiGrid getGraiGrid();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getGraiGrid <em>Grai Grid</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grai Grid</em>' container reference.
	 * @see #getGraiGrid()
	 * @generated
	 */
	void setGraiGrid(GgGraiGrid value);

} // GgNode
