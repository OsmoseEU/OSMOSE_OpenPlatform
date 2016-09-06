/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;

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
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicalMeanRelatedPartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PhysicalMeanRelatedPart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/PhysicalMeanRelatedPart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalMeanRelatedPartPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl <em>Tim Physical Mean Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl#getTimPhysicalMeanResource()
	 * @generated
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__ID = CommonConceptsPackage.TIM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__NAME = CommonConceptsPackage.TIM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__FUNCTION = CommonConceptsPackage.TIM_RESOURCE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__TYPE = CommonConceptsPackage.TIM_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__PROCESSES = CommonConceptsPackage.TIM_RESOURCE__PROCESSES;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__MODEL = CommonConceptsPackage.TIM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__ORGANIZATION_UNIT = CommonConceptsPackage.TIM_RESOURCE__ORGANIZATION_UNIT;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__SERVICES = CommonConceptsPackage.TIM_RESOURCE__SERVICES;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technical Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expected Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tim Physical Mean Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_PHYSICAL_MEAN_RESOURCE_FEATURE_COUNT = CommonConceptsPackage.TIM_RESOURCE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource <em>Tim Physical Mean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tim Physical Mean Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource
	 * @generated
	 */
	EClass getTimPhysicalMeanResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getCapability()
	 * @see #getTimPhysicalMeanResource()
	 * @generated
	 */
	EAttribute getTimPhysicalMeanResource_Capability();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getConstraint()
	 * @see #getTimPhysicalMeanResource()
	 * @generated
	 */
	EAttribute getTimPhysicalMeanResource_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getOperationMode <em>Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Mode</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getOperationMode()
	 * @see #getTimPhysicalMeanResource()
	 * @generated
	 */
	EAttribute getTimPhysicalMeanResource_OperationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getTechnicalCharacteristics <em>Technical Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Characteristics</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getTechnicalCharacteristics()
	 * @see #getTimPhysicalMeanResource()
	 * @generated
	 */
	EAttribute getTimPhysicalMeanResource_TechnicalCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getExpectedPerformance <em>Expected Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Performance</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource#getExpectedPerformance()
	 * @see #getTimPhysicalMeanResource()
	 * @generated
	 */
	EAttribute getTimPhysicalMeanResource_ExpectedPerformance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicalMeanRelatedPartFactory getPhysicalMeanRelatedPartFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl <em>Tim Physical Mean Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.TimPhysicalMeanResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl.PhysicalMeanRelatedPartPackageImpl#getTimPhysicalMeanResource()
		 * @generated
		 */
		EClass TIM_PHYSICAL_MEAN_RESOURCE = eINSTANCE.getTimPhysicalMeanResource();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY = eINSTANCE.getTimPhysicalMeanResource_Capability();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT = eINSTANCE.getTimPhysicalMeanResource_Constraint();

		/**
		 * The meta object literal for the '<em><b>Operation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE = eINSTANCE.getTimPhysicalMeanResource_OperationMode();

		/**
		 * The meta object literal for the '<em><b>Technical Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS = eINSTANCE.getTimPhysicalMeanResource_TechnicalCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Expected Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE = eINSTANCE.getTimPhysicalMeanResource_ExpectedPerformance();

	}

} //PhysicalMeanRelatedPartPackage
