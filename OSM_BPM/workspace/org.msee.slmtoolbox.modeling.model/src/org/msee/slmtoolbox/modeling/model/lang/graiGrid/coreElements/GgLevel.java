/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getProcessingUnit <em>Processing Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel()
 * @model
 * @generated
 */
public interface GgLevel extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel_Nodes()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode#getLevel
	 * @model opposite="level"
	 * @generated
	 */
	EList<GgNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Horizon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon</em>' containment reference.
	 * @see #setHorizon(GgTimeValue)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel_Horizon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GgTimeValue getHorizon();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getHorizon <em>Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon</em>' containment reference.
	 * @see #getHorizon()
	 * @generated
	 */
	void setHorizon(GgTimeValue value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(GgTimeValue)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GgTimeValue getPeriod();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(GgTimeValue value);

	/**
	 * Returns the value of the '<em><b>Processing Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit</em>' containment reference.
	 * @see #setProcessingUnit(GgTimeValue)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel_ProcessingUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GgTimeValue getProcessingUnit();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getProcessingUnit <em>Processing Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Unit</em>' containment reference.
	 * @see #getProcessingUnit()
	 * @generated
	 */
	void setProcessingUnit(GgTimeValue value);

	/**
	 * Returns the value of the '<em><b>Grai Grid</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grid</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grid</em>' container reference.
	 * @see #setGraiGrid(GgGraiGrid)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgLevel_GraiGrid()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getLevels
	 * @model opposite="levels" transient="false"
	 * @generated
	 */
	GgGraiGrid getGraiGrid();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel#getGraiGrid <em>Grai Grid</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Level \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgLevel
