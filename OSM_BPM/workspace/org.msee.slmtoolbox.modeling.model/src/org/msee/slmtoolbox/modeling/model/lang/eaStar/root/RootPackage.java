/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootFactory
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
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/lang/eaStar.ecore/root";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.lang.eaStar.root";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl <em>Ea Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl#getEaModel()
	 * @generated
	 */
	int EA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__ID = GeneralElementsPackage.EA_BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__NAME = GeneralElementsPackage.EA_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__CODE = GeneralElementsPackage.EA_BASE_ELEMENT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__DESCRIPTION = GeneralElementsPackage.EA_BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__PROCESS = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL__ORGANIZATIONS = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ea Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODEL_FEATURE_COUNT = GeneralElementsPackage.EA_BASE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel <em>Ea Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ea Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel
	 * @generated
	 */
	EClass getEaModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getProcess()
	 * @see #getEaModel()
	 * @generated
	 */
	EReference getEaModel_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel#getOrganizations()
	 * @see #getEaModel()
	 * @generated
	 */
	EReference getEaModel_Organizations();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl <em>Ea Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.EaModelImpl
		 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl#getEaModel()
		 * @generated
		 */
		EClass EA_MODEL = eINSTANCE.getEaModel();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_MODEL__PROCESS = eINSTANCE.getEaModel_Process();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_MODEL__ORGANIZATIONS = eINSTANCE.getEaModel_Organizations();

	}

} //RootPackage
