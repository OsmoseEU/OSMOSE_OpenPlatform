/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid <em>Grai Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgOrganization()
 * @model
 * @generated
 */
public interface GgOrganization extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgOrganization_Functions()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<GgFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(GgModel)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgOrganization_Model()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getOrganizations
	 * @model opposite="organizations" required="true" transient="false"
	 * @generated
	 */
	GgModel getModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(GgModel value);

	/**
	 * Returns the value of the '<em><b>Grai Grid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grid</em>' reference.
	 * @see #setGraiGrid(GgGraiGrid)
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage#getGgOrganization_GraiGrid()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getOrganizations
	 * @model opposite="organizations" required="true"
	 * @generated
	 */
	GgGraiGrid getGraiGrid();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid <em>Grai Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grai Grid</em>' reference.
	 * @see #getGraiGrid()
	 * @generated
	 */
	void setGraiGrid(GgGraiGrid value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\nStringBuffer result = new StringBuffer();\r\nresult.append(\"Enterprise \");\r\nresult.append(this.getName());\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString();

} // GgOrganization
