/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.common.util.EList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getGgGraiGrids <em>Gg Grai Grids</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure()
 * @model
 * @generated
 */
public interface BsmDecisionStructure extends IBsmNamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure <em>Decision Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_Decisions()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure
	 * @model opposite="decisionStructure" containment="true"
	 * @generated
	 */
	EList<BsmDecision> getDecisions();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisionStructures <em>Decision Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_Organizations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisionStructures
	 * @model opposite="decisionStructures" required="true"
	 * @generated
	 */
	EList<BsmOrganization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Bsm Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisionStructures <em>Decision Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsm Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsm Model</em>' container reference.
	 * @see #setBsmModel(BsmModel)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_BsmModel()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisionStructures
	 * @model opposite="decisionStructures" required="true" transient="false"
	 * @generated
	 */
	BsmModel getBsmModel();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getBsmModel <em>Bsm Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsm Model</em>' container reference.
	 * @see #getBsmModel()
	 * @generated
	 */
	void setBsmModel(BsmModel value);

	/**
	 * Returns the value of the '<em><b>Gg Grai Grids</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gg Grai Grids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gg Grai Grids</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionStructure_GgGraiGrids()
	 * @model
	 * @generated
	 */
	EList<GgGraiGrid> getGgGraiGrids();

} // BsmDecisionStructure
