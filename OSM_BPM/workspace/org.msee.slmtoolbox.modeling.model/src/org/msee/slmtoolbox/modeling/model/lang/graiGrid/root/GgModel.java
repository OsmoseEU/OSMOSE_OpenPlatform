/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gg Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getGraiGrids <em>Grai Grids</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage#getGgModel()
 * @model
 * @generated
 */
public interface GgModel extends GgBaseElement {
	/**
	 * Returns the value of the '<em><b>Grai Grids</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grai Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grai Grids</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage#getGgModel_GraiGrids()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<GgGraiGrid> getGraiGrids();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage#getGgModel_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<GgOrganization> getOrganizations();

} // GgModel
