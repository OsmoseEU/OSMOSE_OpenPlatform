/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsFactory
 * @model kind="package"
 * @generated
 */
public interface GeneralElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generalElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/graiGrid.ecore/2.0/generalElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralElementsPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl <em>Gg Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgBaseElement()
	 * @generated
	 */
	int GG_BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_BASE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_BASE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_BASE_ELEMENT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_BASE_ELEMENT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Gg Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_BASE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl <em>Gg Grai Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgGraiGrid()
	 * @generated
	 */
	int GG_GRAI_GRID = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__ID = GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__NAME = GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__CODE = GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__DESCRIPTION = GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__LEVELS = GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__FLOWS = GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__NODES = GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__FUNCTIONS = GG_BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Information Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__INFORMATION_SOURCES = GG_BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__ORGANIZATIONS = GG_BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID__MODEL = GG_BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gg Grai Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_GRAI_GRID_FEATURE_COUNT = GG_BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl <em>Gg Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgOrganization()
	 * @generated
	 */
	int GG_ORGANIZATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__ID = GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__NAME = GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__CODE = GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__DESCRIPTION = GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__FUNCTIONS = GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__MODEL = GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grai Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION__GRAI_GRID = GG_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gg Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_ORGANIZATION_FEATURE_COUNT = GG_BASE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement <em>Gg Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Base Element</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement
	 * @generated
	 */
	EClass getGgBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getId()
	 * @see #getGgBaseElement()
	 * @generated
	 */
	EAttribute getGgBaseElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getName()
	 * @see #getGgBaseElement()
	 * @generated
	 */
	EAttribute getGgBaseElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getCode()
	 * @see #getGgBaseElement()
	 * @generated
	 */
	EAttribute getGgBaseElement_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement#getDescription()
	 * @see #getGgBaseElement()
	 * @generated
	 */
	EAttribute getGgBaseElement_Description();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid <em>Gg Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid
	 * @generated
	 */
	EClass getGgGraiGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getLevels()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFlows()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getNodes()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getFunctions()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getInformationSources <em>Information Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Sources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getInformationSources()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_InformationSources();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getOrganizations()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Organizations();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid#getModel()
	 * @see #getGgGraiGrid()
	 * @generated
	 */
	EReference getGgGraiGrid_Model();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization <em>Gg Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization
	 * @generated
	 */
	EClass getGgOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getFunctions()
	 * @see #getGgOrganization()
	 * @generated
	 */
	EReference getGgOrganization_Functions();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getModel()
	 * @see #getGgOrganization()
	 * @generated
	 */
	EReference getGgOrganization_Model();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid <em>Grai Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grai Grid</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization#getGraiGrid()
	 * @see #getGgOrganization()
	 * @generated
	 */
	EReference getGgOrganization_GraiGrid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneralElementsFactory getGeneralElementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl <em>Gg Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgBaseElementImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgBaseElement()
		 * @generated
		 */
		EClass GG_BASE_ELEMENT = eINSTANCE.getGgBaseElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_BASE_ELEMENT__ID = eINSTANCE.getGgBaseElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_BASE_ELEMENT__NAME = eINSTANCE.getGgBaseElement_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_BASE_ELEMENT__CODE = eINSTANCE.getGgBaseElement_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GG_BASE_ELEMENT__DESCRIPTION = eINSTANCE.getGgBaseElement_Description();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl <em>Gg Grai Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgGraiGrid()
		 * @generated
		 */
		EClass GG_GRAI_GRID = eINSTANCE.getGgGraiGrid();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__LEVELS = eINSTANCE.getGgGraiGrid_Levels();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__FLOWS = eINSTANCE.getGgGraiGrid_Flows();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__NODES = eINSTANCE.getGgGraiGrid_Nodes();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__FUNCTIONS = eINSTANCE.getGgGraiGrid_Functions();

		/**
		 * The meta object literal for the '<em><b>Information Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__INFORMATION_SOURCES = eINSTANCE.getGgGraiGrid_InformationSources();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__ORGANIZATIONS = eINSTANCE.getGgGraiGrid_Organizations();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_GRAI_GRID__MODEL = eINSTANCE.getGgGraiGrid_Model();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl <em>Gg Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgOrganizationImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl#getGgOrganization()
		 * @generated
		 */
		EClass GG_ORGANIZATION = eINSTANCE.getGgOrganization();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_ORGANIZATION__FUNCTIONS = eINSTANCE.getGgOrganization_Functions();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_ORGANIZATION__MODEL = eINSTANCE.getGgOrganization_Model();

		/**
		 * The meta object literal for the '<em><b>Grai Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_ORGANIZATION__GRAI_GRID = eINSTANCE.getGgOrganization_GraiGrid();

	}

} //GeneralElementsPackage
