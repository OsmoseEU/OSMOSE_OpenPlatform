/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimFactory
 * @model kind="package"
 * @generated
 */
public interface TimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.tim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement <em>iTim Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl#getiTimNamedElement()
	 * @generated
	 */
	int ITIM_NAMED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>iTim Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITIM_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl#getTimModel()
	 * @generated
	 */
	int TIM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__ID = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__NAME = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__SERVICES = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__PROCESSES = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__INFORMATIONS = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__ORGANIZATIONS = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL__RESOURCES = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_MODEL_FEATURE_COUNT = ITIM_NAMED_ELEMENT_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement <em>iTim Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>iTim Named Element</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement
	 * @generated
	 */
	EClass getiTimNamedElement();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel
	 * @generated
	 */
	EClass getTimModel();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getId()
	 * @see #getTimModel()
	 * @generated
	 */
	EAttribute getTimModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getName()
	 * @see #getTimModel()
	 * @generated
	 */
	EAttribute getTimModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getServices()
	 * @see #getTimModel()
	 * @generated
	 */
	EReference getTimModel_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getProcesses()
	 * @see #getTimModel()
	 * @generated
	 */
	EReference getTimModel_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getInformations <em>Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getInformations()
	 * @see #getTimModel()
	 * @generated
	 */
	EReference getTimModel_Informations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getOrganizations()
	 * @see #getTimModel()
	 * @generated
	 */
	EReference getTimModel_Organizations();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel#getResources()
	 * @see #getTimModel()
	 * @generated
	 */
	EReference getTimModel_Resources();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimFactory getTimFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement <em>iTim Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl#getiTimNamedElement()
		 * @generated
		 */
		EClass ITIM_NAMED_ELEMENT = eINSTANCE.getiTimNamedElement();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimModelImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.impl.TimPackageImpl#getTimModel()
		 * @generated
		 */
		EClass TIM_MODEL = eINSTANCE.getTimModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_MODEL__ID = eINSTANCE.getTimModel_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_MODEL__NAME = eINSTANCE.getTimModel_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_MODEL__SERVICES = eINSTANCE.getTimModel_Services();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_MODEL__PROCESSES = eINSTANCE.getTimModel_Processes();

		/**
		 * The meta object literal for the '<em><b>Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_MODEL__INFORMATIONS = eINSTANCE.getTimModel_Informations();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_MODEL__ORGANIZATIONS = eINSTANCE.getTimModel_Organizations();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIM_MODEL__RESOURCES = eINSTANCE.getTimModel_Resources();

	}

} //TimPackage
