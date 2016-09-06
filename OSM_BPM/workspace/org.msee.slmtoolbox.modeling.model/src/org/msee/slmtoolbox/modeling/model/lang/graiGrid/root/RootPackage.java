/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootFactory
 * @model kind="package"
 * @generated
 */
public interface RootPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "root";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/graiGrid.ecore/2.0/root";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.graiGrid.root";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl <em>Gg Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl#getGgModel()
	 * @generated
	 */
	int GG_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__ID = GeneralElementsPackage.GG_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__NAME = GeneralElementsPackage.GG_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__CODE = GeneralElementsPackage.GG_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__DESCRIPTION = GeneralElementsPackage.GG_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Grai Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__GRAI_GRIDS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL__ORGANIZATIONS = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gg Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GG_MODEL_FEATURE_COUNT = GeneralElementsPackage.GG_BASE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel <em>Gg Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gg Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel
	 * @generated
	 */
	EClass getGgModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getGraiGrids <em>Grai Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grai Grids</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getGraiGrids()
	 * @see #getGgModel()
	 * @generated
	 */
	EReference getGgModel_GraiGrids();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel#getOrganizations()
	 * @see #getGgModel()
	 * @generated
	 */
	EReference getGgModel_Organizations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootFactory getRootFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl <em>Gg Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.GgModelImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl#getGgModel()
		 * @generated
		 */
		EClass GG_MODEL = eINSTANCE.getGgModel();

		/**
		 * The meta object literal for the '<em><b>Grai Grids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_MODEL__GRAI_GRIDS = eINSTANCE.getGgModel_GraiGrids();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GG_MODEL__ORGANIZATIONS = eINSTANCE.getGgModel_Organizations();

	}

} //RootPackage
