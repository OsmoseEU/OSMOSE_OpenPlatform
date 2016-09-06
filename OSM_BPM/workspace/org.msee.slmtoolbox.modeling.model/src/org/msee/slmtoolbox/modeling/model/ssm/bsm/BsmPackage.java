/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory
 * @model kind="package"
 * @generated
 */
public interface BsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/msee/slmtoolbox/modeling/model/ssm/bsm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.msee.slmtoolbox.modeling.model.ssm.bsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BsmPackage eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement <em>IBsm Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getIBsmNamedElement()
	 * @generated
	 */
	int IBSM_NAMED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>IBsm Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBSM_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmModel()
	 * @generated
	 */
	int BSM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__ORGANIZATIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__PARTNERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__STAKEHOLDERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__VALUES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__PRODUCTS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__FUNCTIONALITIES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__CUSTOMERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__PROCESSES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__DECISIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Decision Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__DECISION_STRUCTURES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL__RESOURCES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MODEL_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmService()
	 * @generated
	 */
	int BSM_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__OBJECTIVE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__DOMAIN = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__NATURE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__PRODUCTS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__FUNCTIONALITIES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__RESOURCES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__PROCESSES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__CUSTOMERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__VALUES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__STAKEHOLDERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__PARTNERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_SERVICE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmCustomer()
	 * @generated
	 */
	int BSM_CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__CATEGORIES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level Of Education</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__LEVEL_OF_EDUCATION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__GENDER = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__AGE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annual Revenue Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__ANNUAL_REVENUE_RANGE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__REQUIREMENT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Targeted Usage Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__TARGETED_USAGE_FREQ = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_CUSTOMER_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmStakeholder()
	 * @generated
	 */
	int BSM_STAKEHOLDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__TYPE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__CONCERN = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__ROLE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_STAKEHOLDER_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl <em>Partner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPartner()
	 * @generated
	 */
	int BSM_PARTNER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__CATEGORY = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Competence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__COMPETENCE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__CONCERN = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__CONTRIBUTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PARTNER_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmProduct()
	 * @generated
	 */
	int BSM_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__TYPE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__FUNCTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tech Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__TECH_CHARACTERISTICS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__FUNCTIONALITIES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__COMPONENTS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PRODUCT_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmComponent()
	 * @generated
	 */
	int BSM_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_COMPONENT__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_COMPONENT__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_COMPONENT__COST = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_COMPONENT__PRODUCT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_COMPONENT_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmFunctionality()
	 * @generated
	 */
	int BSM_FUNCTIONALITY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__TYPE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__PRODUCT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__SUB_FUNCTIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Main Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__MAIN_FUNCTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_FUNCTIONALITY_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmResource()
	 * @generated
	 */
	int BSM_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__TYPE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__ROLE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__CAPABILITY = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__PROCESSES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__ORGANIZATION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ea Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__EA_RESOURCES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mse Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE__MSE_SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_RESOURCE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmProcess()
	 * @generated
	 */
	int BSM_PROCESS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__OBJECTIVE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__TRIGGER = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__RESULT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__SUB_PROCESS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Main Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__MAIN_PROCESS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__RESOURCES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__ORGANIZATIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ea Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__EA_PROCESS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mse Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS__MSE_SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PROCESS_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecision()
	 * @generated
	 */
	int BSM_DECISION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__TYPE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__HORIZON = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__PERIOD = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__CONSTRAINT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__OBJECTIVE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__VARIABLE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__EVENT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decision Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__DECISION_STRUCTURE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__ORGANIZATION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gg Decision Centers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__GG_DECISION_CENTERS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__VARIABLES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Performance Indicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__PERFORMANCE_INDICATORS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION__OBJECTIVES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl <em>Decision Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionStructure()
	 * @generated
	 */
	int BSM_DECISION_STRUCTURE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__DECISIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__ORGANIZATIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gg Grai Grids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Decision Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_STRUCTURE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmOrganization()
	 * @generated
	 */
	int BSM_ORGANIZATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__PROCESSES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__DECISIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Decision Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__DECISION_STRUCTURES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gg Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__GG_ORGANIZATIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ea Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__EA_ORGANIZATIONS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mse Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION__MSE_SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ORGANIZATION_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmEnterprise()
	 * @generated
	 */
	int BSM_ENTERPRISE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__ID = BSM_ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__NAME = BSM_ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__DESCRIPTION = BSM_ORGANIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__PROCESSES = BSM_ORGANIZATION__PROCESSES;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__DECISIONS = BSM_ORGANIZATION__DECISIONS;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__BSM_MODEL = BSM_ORGANIZATION__BSM_MODEL;

	/**
	 * The feature id for the '<em><b>Decision Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__DECISION_STRUCTURES = BSM_ORGANIZATION__DECISION_STRUCTURES;

	/**
	 * The feature id for the '<em><b>Gg Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__GG_ORGANIZATIONS = BSM_ORGANIZATION__GG_ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Ea Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__EA_ORGANIZATIONS = BSM_ORGANIZATION__EA_ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Mse Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__MSE_SERVICE = BSM_ORGANIZATION__MSE_SERVICE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__TYPE = BSM_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__RESOURCES = BSM_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ve Participations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE__VE_PARTICIPATIONS = BSM_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_ENTERPRISE_FEATURE_COUNT = BSM_ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVirtualEnterpriseImpl <em>Virtual Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVirtualEnterpriseImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmVirtualEnterprise()
	 * @generated
	 */
	int BSM_VIRTUAL_ENTERPRISE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__ID = BSM_ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__NAME = BSM_ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__DESCRIPTION = BSM_ORGANIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__PROCESSES = BSM_ORGANIZATION__PROCESSES;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__DECISIONS = BSM_ORGANIZATION__DECISIONS;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__BSM_MODEL = BSM_ORGANIZATION__BSM_MODEL;

	/**
	 * The feature id for the '<em><b>Decision Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__DECISION_STRUCTURES = BSM_ORGANIZATION__DECISION_STRUCTURES;

	/**
	 * The feature id for the '<em><b>Gg Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__GG_ORGANIZATIONS = BSM_ORGANIZATION__GG_ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Ea Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__EA_ORGANIZATIONS = BSM_ORGANIZATION__EA_ORGANIZATIONS;

	/**
	 * The feature id for the '<em><b>Mse Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__MSE_SERVICE = BSM_ORGANIZATION__MSE_SERVICE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__TYPE = BSM_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ve Participations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE__VE_PARTICIPATIONS = BSM_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VIRTUAL_ENTERPRISE_FEATURE_COUNT = BSM_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl <em>VE Participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmVEParticipation()
	 * @generated
	 */
	int BSM_VE_PARTICIPATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VE_PARTICIPATION__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VE_PARTICIPATION__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enterprise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VE_PARTICIPATION__ENTERPRISE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Enterprise</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VE Participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VE_PARTICIPATION_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmValueImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmValue()
	 * @generated
	 */
	int BSM_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE__SERVICE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bsm Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE__BSM_MODEL = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_VALUE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl <em>Performance Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPerformanceIndicator()
	 * @generated
	 */
	int BSM_PERFORMANCE_INDICATOR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__UNIT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__FORMULA = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__DECISION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__VARIABLES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__OBJECTIVES = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Category1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__CATEGORY1 = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Category2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__CATEGORY2 = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Category3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__CATEGORY3 = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__DIMENSION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR__FIELDS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Performance Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PERFORMANCE_INDICATOR_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl <em>Pi Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPiField()
	 * @generated
	 */
	int BSM_PI_FIELD = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PI_FIELD__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PI_FIELD__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performance Indicators</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PI_FIELD__PERFORMANCE_INDICATORS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pi Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_PI_FIELD_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionVariableImpl <em>Decision Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionVariableImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionVariable()
	 * @generated
	 */
	int BSM_DECISION_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE__DECISION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performance Indicators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE__PERFORMANCE_INDICATORS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Decision Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_VARIABLE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl <em>Decision Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionObjective()
	 * @generated
	 */
	int BSM_DECISION_OBJECTIVE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE__DECISION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performance Indicators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Decision Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_DECISION_OBJECTIVE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl <em>Mse Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmMseService()
	 * @generated
	 */
	int BSM_MSE_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__NAME = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__DESCRIPTION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__OWNER = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__CREATE_DATE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__PUBLISHED_DATE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__PUBLISHED = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__USER_ID = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__PROCESS = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__ORGANIZATION = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE__RESOURCE = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Mse Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSM_MSE_SERVICE_FEATURE_COUNT = IBSM_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmGender()
	 * @generated
	 */
	int BSM_GENDER = 23;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmResourceType()
	 * @generated
	 */
	int BSM_RESOURCE_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType <em>PI Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPIType()
	 * @generated
	 */
	int BSM_PI_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType <em>Decision Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionType()
	 * @generated
	 */
	int BSM_DECISION_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement <em>IBsm Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBsm Named Element</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement
	 * @generated
	 */
	EClass getIBsmNamedElement();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel
	 * @generated
	 */
	EClass getBsmModel();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getId()
	 * @see #getBsmModel()
	 * @generated
	 */
	EAttribute getBsmModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getName()
	 * @see #getBsmModel()
	 * @generated
	 */
	EAttribute getBsmModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getService()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getOrganizations()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Organizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partners</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getPartners()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Partners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getStakeholders()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Stakeholders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getValues()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getProducts()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalities</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getFunctionalities()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Functionalities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getCustomers()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getProcesses()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Processes();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decisions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisions()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Decisions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisionStructures <em>Decision Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Structures</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getDecisionStructures()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_DecisionStructures();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel#getResources()
	 * @see #getBsmModel()
	 * @generated
	 */
	EReference getBsmModel_Resources();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService
	 * @generated
	 */
	EClass getBsmService();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getId()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getName()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getDescription()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getConstraint()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getObjective()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getDomain()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getNature()
	 * @see #getBsmService()
	 * @generated
	 */
	EAttribute getBsmService_Nature();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getProducts()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Products();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionalities</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getFunctionalities()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Functionalities();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getResources()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getProcesses()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Processes();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getCustomers()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Customers();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getValues()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Values();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getStakeholders()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Stakeholders();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partners</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getPartners()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_Partners();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService#getBsmModel()
	 * @see #getBsmService()
	 * @generated
	 */
	EReference getBsmService_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer
	 * @generated
	 */
	EClass getBsmCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getId()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getName()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categories</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getCategories()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Categories();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getLevelOfEducation <em>Level Of Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Education</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getLevelOfEducation()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_LevelOfEducation();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getGender()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getAge()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getAnnualRevenueRange <em>Annual Revenue Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annual Revenue Range</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getAnnualRevenueRange()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_AnnualRevenueRange();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getRequirement()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getConstraint()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getTargetedUsageFreq <em>Targeted Usage Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targeted Usage Freq</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getTargetedUsageFreq()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EAttribute getBsmCustomer_TargetedUsageFreq();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getService()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EReference getBsmCustomer_Service();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer#getBsmModel()
	 * @see #getBsmCustomer()
	 * @generated
	 */
	EReference getBsmCustomer_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder
	 * @generated
	 */
	EClass getBsmStakeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getId()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getName()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getType()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getConcern()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Concern();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getConstraint()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getRole()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EAttribute getBsmStakeholder_Role();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getService()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EReference getBsmStakeholder_Service();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder#getBsmModel()
	 * @see #getBsmStakeholder()
	 * @generated
	 */
	EReference getBsmStakeholder_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner
	 * @generated
	 */
	EClass getBsmPartner();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getId()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getName()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCategory()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCompetence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competence</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getCompetence()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Competence();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConcern()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Concern();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getConstraint()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contribution</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getContribution()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EAttribute getBsmPartner_Contribution();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getService()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EReference getBsmPartner_Service();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner#getBsmModel()
	 * @see #getBsmPartner()
	 * @generated
	 */
	EReference getBsmPartner_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct
	 * @generated
	 */
	EClass getBsmProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getId()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EAttribute getBsmProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getName()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EAttribute getBsmProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getType()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EAttribute getBsmProduct_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getFunction()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EAttribute getBsmProduct_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getTechCharacteristics <em>Tech Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tech Characteristics</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getTechCharacteristics()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EAttribute getBsmProduct_TechCharacteristics();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getService()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EReference getBsmProduct_Service();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionalities</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getFunctionalities()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EReference getBsmProduct_Functionalities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getComponents()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EReference getBsmProduct_Components();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct#getBsmModel()
	 * @see #getBsmProduct()
	 * @generated
	 */
	EReference getBsmProduct_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent
	 * @generated
	 */
	EClass getBsmComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getId()
	 * @see #getBsmComponent()
	 * @generated
	 */
	EAttribute getBsmComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getName()
	 * @see #getBsmComponent()
	 * @generated
	 */
	EAttribute getBsmComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getCost()
	 * @see #getBsmComponent()
	 * @generated
	 */
	EAttribute getBsmComponent_Cost();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent#getProduct()
	 * @see #getBsmComponent()
	 * @generated
	 */
	EReference getBsmComponent_Product();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality
	 * @generated
	 */
	EClass getBsmFunctionality();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getId()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EAttribute getBsmFunctionality_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getName()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EAttribute getBsmFunctionality_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getType()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EAttribute getBsmFunctionality_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getDescription()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EAttribute getBsmFunctionality_Description();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getService()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EReference getBsmFunctionality_Service();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getProduct()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EReference getBsmFunctionality_Product();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getSubFunctions <em>Sub Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Functions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getSubFunctions()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EReference getBsmFunctionality_SubFunctions();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getMainFunction <em>Main Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Function</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getMainFunction()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EReference getBsmFunctionality_MainFunction();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality#getBsmModel()
	 * @see #getBsmFunctionality()
	 * @generated
	 */
	EReference getBsmFunctionality_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource
	 * @generated
	 */
	EClass getBsmResource();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getId()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getName()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getType()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getRole()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getCapability()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Capability();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getConstraint()
	 * @see #getBsmResource()
	 * @generated
	 */
	EAttribute getBsmResource_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getService()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_Service();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getProcesses()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_Processes();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getBsmModel()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_BsmModel();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getEaResources <em>Ea Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ea Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getEaResources()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_EaResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getMseService <em>Mse Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mse Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getMseService()
	 * @see #getBsmResource()
	 * @generated
	 */
	EReference getBsmResource_MseService();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess
	 * @generated
	 */
	EClass getBsmProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getId()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getName()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getObjective()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getTrigger()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResult()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getConstraint()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EAttribute getBsmProcess_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getSubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getSubProcess()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_SubProcess();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getMainProcess <em>Main Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getMainProcess()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_MainProcess();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getService()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_Service();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getResources()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getOrganizations()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_Organizations();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getBsmModel()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_BsmModel();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getEaProcess <em>Ea Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ea Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getEaProcess()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_EaProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getMseService <em>Mse Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mse Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess#getMseService()
	 * @see #getBsmProcess()
	 * @generated
	 */
	EReference getBsmProcess_MseService();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision
	 * @generated
	 */
	EClass getBsmDecision();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getId()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getName()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getType()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getHorizon <em>Horizon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getHorizon()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Horizon();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPeriod()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getConstraint()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjective()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Objective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariable()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getEvent()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EAttribute getBsmDecision_Event();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure <em>Decision Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decision Structure</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getDecisionStructure()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_DecisionStructure();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getOrganization()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getBsmModel()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_BsmModel();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getGgDecisionCenters <em>Gg Decision Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gg Decision Centers</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getGgDecisionCenters()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_GgDecisionCenters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getVariables()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Indicators</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getPerformanceIndicators()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_PerformanceIndicators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision#getObjectives()
	 * @see #getBsmDecision()
	 * @generated
	 */
	EReference getBsmDecision_Objectives();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure <em>Decision Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Structure</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure
	 * @generated
	 */
	EClass getBsmDecisionStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getId()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EAttribute getBsmDecisionStructure_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getName()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EAttribute getBsmDecisionStructure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getDecisions()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EReference getBsmDecisionStructure_Decisions();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getOrganizations()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EReference getBsmDecisionStructure_Organizations();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getBsmModel()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EReference getBsmDecisionStructure_BsmModel();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getGgGraiGrids <em>Gg Grai Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gg Grai Grids</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure#getGgGraiGrids()
	 * @see #getBsmDecisionStructure()
	 * @generated
	 */
	EReference getBsmDecisionStructure_GgGraiGrids();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization
	 * @generated
	 */
	EClass getBsmOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getId()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EAttribute getBsmOrganization_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getName()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EAttribute getBsmOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDescription()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EAttribute getBsmOrganization_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getProcesses()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_Processes();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decisions</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisions()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_Decisions();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getBsmModel()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_BsmModel();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisionStructures <em>Decision Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decision Structures</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getDecisionStructures()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_DecisionStructures();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getGgOrganizations <em>Gg Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gg Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getGgOrganizations()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_GgOrganizations();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getEaOrganizations <em>Ea Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ea Organizations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getEaOrganizations()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_EaOrganizations();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getMseService <em>Mse Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mse Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization#getMseService()
	 * @see #getBsmOrganization()
	 * @generated
	 */
	EReference getBsmOrganization_MseService();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise
	 * @generated
	 */
	EClass getBsmEnterprise();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getType()
	 * @see #getBsmEnterprise()
	 * @generated
	 */
	EAttribute getBsmEnterprise_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getResources()
	 * @see #getBsmEnterprise()
	 * @generated
	 */
	EReference getBsmEnterprise_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getVeParticipations <em>Ve Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ve Participations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getVeParticipations()
	 * @see #getBsmEnterprise()
	 * @generated
	 */
	EReference getBsmEnterprise_VeParticipations();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise <em>Virtual Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Enterprise</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise
	 * @generated
	 */
	EClass getBsmVirtualEnterprise();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getType()
	 * @see #getBsmVirtualEnterprise()
	 * @generated
	 */
	EAttribute getBsmVirtualEnterprise_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getVeParticipations <em>Ve Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ve Participations</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise#getVeParticipations()
	 * @see #getBsmVirtualEnterprise()
	 * @generated
	 */
	EReference getBsmVirtualEnterprise_VeParticipations();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation <em>VE Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VE Participation</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation
	 * @generated
	 */
	EClass getBsmVEParticipation();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getId()
	 * @see #getBsmVEParticipation()
	 * @generated
	 */
	EAttribute getBsmVEParticipation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getName()
	 * @see #getBsmVEParticipation()
	 * @generated
	 */
	EAttribute getBsmVEParticipation_Name();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enterprise</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise()
	 * @see #getBsmVEParticipation()
	 * @generated
	 */
	EReference getBsmVEParticipation_Enterprise();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getVirtualEnterprise <em>Virtual Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Virtual Enterprise</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getVirtualEnterprise()
	 * @see #getBsmVEParticipation()
	 * @generated
	 */
	EReference getBsmVEParticipation_VirtualEnterprise();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue
	 * @generated
	 */
	EClass getBsmValue();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getId()
	 * @see #getBsmValue()
	 * @generated
	 */
	EAttribute getBsmValue_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getName()
	 * @see #getBsmValue()
	 * @generated
	 */
	EAttribute getBsmValue_Name();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getService()
	 * @see #getBsmValue()
	 * @generated
	 */
	EReference getBsmValue_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getDescription()
	 * @see #getBsmValue()
	 * @generated
	 */
	EAttribute getBsmValue_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getBsmModel <em>Bsm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bsm Model</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue#getBsmModel()
	 * @see #getBsmValue()
	 * @generated
	 */
	EReference getBsmValue_BsmModel();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator <em>Performance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Indicator</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator
	 * @generated
	 */
	EClass getBsmPerformanceIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getId()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getName()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDescription()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getUnit()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFormula()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredInfo <em>Required Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Info</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredInfo()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_RequiredInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredProcessing <em>Required Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Processing</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getRequiredProcessing()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_RequiredProcessing();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decision</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDecision()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EReference getBsmPerformanceIndicator_Decision();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getVariables()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EReference getBsmPerformanceIndicator_Variables();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectives</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getObjectives()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EReference getBsmPerformanceIndicator_Objectives();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory1 <em>Category1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category1</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory1()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Category1();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory2 <em>Category2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category2</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory2()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Category2();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory3 <em>Category3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category3</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getCategory3()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Category3();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getDimension()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EAttribute getBsmPerformanceIndicator_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator#getFields()
	 * @see #getBsmPerformanceIndicator()
	 * @generated
	 */
	EReference getBsmPerformanceIndicator_Fields();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField <em>Pi Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pi Field</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField
	 * @generated
	 */
	EClass getBsmPiField();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getId()
	 * @see #getBsmPiField()
	 * @generated
	 */
	EAttribute getBsmPiField_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getName()
	 * @see #getBsmPiField()
	 * @generated
	 */
	EAttribute getBsmPiField_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Performance Indicators</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField#getPerformanceIndicators()
	 * @see #getBsmPiField()
	 * @generated
	 */
	EReference getBsmPiField_PerformanceIndicators();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable <em>Decision Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Variable</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable
	 * @generated
	 */
	EClass getBsmDecisionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getId()
	 * @see #getBsmDecisionVariable()
	 * @generated
	 */
	EAttribute getBsmDecisionVariable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getName()
	 * @see #getBsmDecisionVariable()
	 * @generated
	 */
	EAttribute getBsmDecisionVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDescription()
	 * @see #getBsmDecisionVariable()
	 * @generated
	 */
	EAttribute getBsmDecisionVariable_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decision</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getDecision()
	 * @see #getBsmDecisionVariable()
	 * @generated
	 */
	EReference getBsmDecisionVariable_Decision();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performance Indicators</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable#getPerformanceIndicators()
	 * @see #getBsmDecisionVariable()
	 * @generated
	 */
	EReference getBsmDecisionVariable_PerformanceIndicators();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective <em>Decision Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Objective</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective
	 * @generated
	 */
	EClass getBsmDecisionObjective();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getId()
	 * @see #getBsmDecisionObjective()
	 * @generated
	 */
	EAttribute getBsmDecisionObjective_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getName()
	 * @see #getBsmDecisionObjective()
	 * @generated
	 */
	EAttribute getBsmDecisionObjective_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDescription()
	 * @see #getBsmDecisionObjective()
	 * @generated
	 */
	EAttribute getBsmDecisionObjective_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decision</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getDecision()
	 * @see #getBsmDecisionObjective()
	 * @generated
	 */
	EReference getBsmDecisionObjective_Decision();

	/**
	 * Returns the meta object for the reference list '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getPerformanceIndicators <em>Performance Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performance Indicators</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective#getPerformanceIndicators()
	 * @see #getBsmDecisionObjective()
	 * @generated
	 */
	EReference getBsmDecisionObjective_PerformanceIndicators();

	/**
	 * Returns the meta object for class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService <em>Mse Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mse Service</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService
	 * @generated
	 */
	EClass getBsmMseService();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getId()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getName()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getDescription()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getOwner()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getCreateDate <em>Create Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Date</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getCreateDate()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_CreateDate();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getPublishedDate <em>Published Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published Date</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getPublishedDate()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_PublishedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getPublished()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_Published();

	/**
	 * Returns the meta object for the attribute '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getUserId()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EAttribute getBsmMseService_UserId();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getProcess()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EReference getBsmMseService_Process();

	/**
	 * Returns the meta object for the reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getOrganization()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EReference getBsmMseService_Organization();

	/**
	 * Returns the meta object for the container reference '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService#getResource()
	 * @see #getBsmMseService()
	 * @generated
	 */
	EReference getBsmMseService_Resource();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender
	 * @generated
	 */
	EEnum getBsmGender();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType
	 * @generated
	 */
	EEnum getBsmResourceType();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType <em>PI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PI Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType
	 * @generated
	 */
	EEnum getBsmPIType();

	/**
	 * Returns the meta object for enum '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Type</em>'.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType
	 * @generated
	 */
	EEnum getBsmDecisionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BsmFactory getBsmFactory();

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
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement <em>IBsm Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getIBsmNamedElement()
		 * @generated
		 */
		EClass IBSM_NAMED_ELEMENT = eINSTANCE.getIBsmNamedElement();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmModelImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmModel()
		 * @generated
		 */
		EClass BSM_MODEL = eINSTANCE.getBsmModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MODEL__ID = eINSTANCE.getBsmModel_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MODEL__NAME = eINSTANCE.getBsmModel_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__SERVICE = eINSTANCE.getBsmModel_Service();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__ORGANIZATIONS = eINSTANCE.getBsmModel_Organizations();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__PARTNERS = eINSTANCE.getBsmModel_Partners();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__STAKEHOLDERS = eINSTANCE.getBsmModel_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__VALUES = eINSTANCE.getBsmModel_Values();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__PRODUCTS = eINSTANCE.getBsmModel_Products();

		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__FUNCTIONALITIES = eINSTANCE.getBsmModel_Functionalities();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__CUSTOMERS = eINSTANCE.getBsmModel_Customers();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__PROCESSES = eINSTANCE.getBsmModel_Processes();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__DECISIONS = eINSTANCE.getBsmModel_Decisions();

		/**
		 * The meta object literal for the '<em><b>Decision Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__DECISION_STRUCTURES = eINSTANCE.getBsmModel_DecisionStructures();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MODEL__RESOURCES = eINSTANCE.getBsmModel_Resources();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmServiceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmService()
		 * @generated
		 */
		EClass BSM_SERVICE = eINSTANCE.getBsmService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__ID = eINSTANCE.getBsmService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__NAME = eINSTANCE.getBsmService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__DESCRIPTION = eINSTANCE.getBsmService_Description();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__CONSTRAINT = eINSTANCE.getBsmService_Constraint();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__OBJECTIVE = eINSTANCE.getBsmService_Objective();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__DOMAIN = eINSTANCE.getBsmService_Domain();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_SERVICE__NATURE = eINSTANCE.getBsmService_Nature();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__PRODUCTS = eINSTANCE.getBsmService_Products();

		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__FUNCTIONALITIES = eINSTANCE.getBsmService_Functionalities();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__RESOURCES = eINSTANCE.getBsmService_Resources();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__PROCESSES = eINSTANCE.getBsmService_Processes();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__CUSTOMERS = eINSTANCE.getBsmService_Customers();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__VALUES = eINSTANCE.getBsmService_Values();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__STAKEHOLDERS = eINSTANCE.getBsmService_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__PARTNERS = eINSTANCE.getBsmService_Partners();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_SERVICE__BSM_MODEL = eINSTANCE.getBsmService_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmCustomerImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmCustomer()
		 * @generated
		 */
		EClass BSM_CUSTOMER = eINSTANCE.getBsmCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__ID = eINSTANCE.getBsmCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__NAME = eINSTANCE.getBsmCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__CATEGORIES = eINSTANCE.getBsmCustomer_Categories();

		/**
		 * The meta object literal for the '<em><b>Level Of Education</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__LEVEL_OF_EDUCATION = eINSTANCE.getBsmCustomer_LevelOfEducation();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__GENDER = eINSTANCE.getBsmCustomer_Gender();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__AGE = eINSTANCE.getBsmCustomer_Age();

		/**
		 * The meta object literal for the '<em><b>Annual Revenue Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__ANNUAL_REVENUE_RANGE = eINSTANCE.getBsmCustomer_AnnualRevenueRange();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__REQUIREMENT = eINSTANCE.getBsmCustomer_Requirement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__CONSTRAINT = eINSTANCE.getBsmCustomer_Constraint();

		/**
		 * The meta object literal for the '<em><b>Targeted Usage Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_CUSTOMER__TARGETED_USAGE_FREQ = eINSTANCE.getBsmCustomer_TargetedUsageFreq();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_CUSTOMER__SERVICE = eINSTANCE.getBsmCustomer_Service();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_CUSTOMER__BSM_MODEL = eINSTANCE.getBsmCustomer_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmStakeholderImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmStakeholder()
		 * @generated
		 */
		EClass BSM_STAKEHOLDER = eINSTANCE.getBsmStakeholder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__ID = eINSTANCE.getBsmStakeholder_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__NAME = eINSTANCE.getBsmStakeholder_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__TYPE = eINSTANCE.getBsmStakeholder_Type();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__CONCERN = eINSTANCE.getBsmStakeholder_Concern();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__CONSTRAINT = eINSTANCE.getBsmStakeholder_Constraint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_STAKEHOLDER__ROLE = eINSTANCE.getBsmStakeholder_Role();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_STAKEHOLDER__SERVICE = eINSTANCE.getBsmStakeholder_Service();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_STAKEHOLDER__BSM_MODEL = eINSTANCE.getBsmStakeholder_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl <em>Partner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPartnerImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPartner()
		 * @generated
		 */
		EClass BSM_PARTNER = eINSTANCE.getBsmPartner();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__ID = eINSTANCE.getBsmPartner_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__NAME = eINSTANCE.getBsmPartner_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__CATEGORY = eINSTANCE.getBsmPartner_Category();

		/**
		 * The meta object literal for the '<em><b>Competence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__COMPETENCE = eINSTANCE.getBsmPartner_Competence();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__CONCERN = eINSTANCE.getBsmPartner_Concern();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__CONSTRAINT = eINSTANCE.getBsmPartner_Constraint();

		/**
		 * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PARTNER__CONTRIBUTION = eINSTANCE.getBsmPartner_Contribution();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PARTNER__SERVICE = eINSTANCE.getBsmPartner_Service();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PARTNER__BSM_MODEL = eINSTANCE.getBsmPartner_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProductImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmProduct()
		 * @generated
		 */
		EClass BSM_PRODUCT = eINSTANCE.getBsmProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PRODUCT__ID = eINSTANCE.getBsmProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PRODUCT__NAME = eINSTANCE.getBsmProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PRODUCT__TYPE = eINSTANCE.getBsmProduct_Type();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PRODUCT__FUNCTION = eINSTANCE.getBsmProduct_Function();

		/**
		 * The meta object literal for the '<em><b>Tech Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PRODUCT__TECH_CHARACTERISTICS = eINSTANCE.getBsmProduct_TechCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PRODUCT__SERVICE = eINSTANCE.getBsmProduct_Service();

		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PRODUCT__FUNCTIONALITIES = eINSTANCE.getBsmProduct_Functionalities();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PRODUCT__COMPONENTS = eINSTANCE.getBsmProduct_Components();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PRODUCT__BSM_MODEL = eINSTANCE.getBsmProduct_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmComponentImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmComponent()
		 * @generated
		 */
		EClass BSM_COMPONENT = eINSTANCE.getBsmComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_COMPONENT__ID = eINSTANCE.getBsmComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_COMPONENT__NAME = eINSTANCE.getBsmComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_COMPONENT__COST = eINSTANCE.getBsmComponent_Cost();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_COMPONENT__PRODUCT = eINSTANCE.getBsmComponent_Product();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmFunctionalityImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmFunctionality()
		 * @generated
		 */
		EClass BSM_FUNCTIONALITY = eINSTANCE.getBsmFunctionality();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_FUNCTIONALITY__ID = eINSTANCE.getBsmFunctionality_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_FUNCTIONALITY__NAME = eINSTANCE.getBsmFunctionality_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_FUNCTIONALITY__TYPE = eINSTANCE.getBsmFunctionality_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_FUNCTIONALITY__DESCRIPTION = eINSTANCE.getBsmFunctionality_Description();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_FUNCTIONALITY__SERVICE = eINSTANCE.getBsmFunctionality_Service();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_FUNCTIONALITY__PRODUCT = eINSTANCE.getBsmFunctionality_Product();

		/**
		 * The meta object literal for the '<em><b>Sub Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_FUNCTIONALITY__SUB_FUNCTIONS = eINSTANCE.getBsmFunctionality_SubFunctions();

		/**
		 * The meta object literal for the '<em><b>Main Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_FUNCTIONALITY__MAIN_FUNCTION = eINSTANCE.getBsmFunctionality_MainFunction();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_FUNCTIONALITY__BSM_MODEL = eINSTANCE.getBsmFunctionality_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmResourceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmResource()
		 * @generated
		 */
		EClass BSM_RESOURCE = eINSTANCE.getBsmResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__ID = eINSTANCE.getBsmResource_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__NAME = eINSTANCE.getBsmResource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__TYPE = eINSTANCE.getBsmResource_Type();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__ROLE = eINSTANCE.getBsmResource_Role();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__CAPABILITY = eINSTANCE.getBsmResource_Capability();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_RESOURCE__CONSTRAINT = eINSTANCE.getBsmResource_Constraint();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__SERVICE = eINSTANCE.getBsmResource_Service();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__PROCESSES = eINSTANCE.getBsmResource_Processes();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__ORGANIZATION = eINSTANCE.getBsmResource_Organization();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__BSM_MODEL = eINSTANCE.getBsmResource_BsmModel();

		/**
		 * The meta object literal for the '<em><b>Ea Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__EA_RESOURCES = eINSTANCE.getBsmResource_EaResources();

		/**
		 * The meta object literal for the '<em><b>Mse Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_RESOURCE__MSE_SERVICE = eINSTANCE.getBsmResource_MseService();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmProcess()
		 * @generated
		 */
		EClass BSM_PROCESS = eINSTANCE.getBsmProcess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__ID = eINSTANCE.getBsmProcess_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__NAME = eINSTANCE.getBsmProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__OBJECTIVE = eINSTANCE.getBsmProcess_Objective();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__TRIGGER = eINSTANCE.getBsmProcess_Trigger();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__RESULT = eINSTANCE.getBsmProcess_Result();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PROCESS__CONSTRAINT = eINSTANCE.getBsmProcess_Constraint();

		/**
		 * The meta object literal for the '<em><b>Sub Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__SUB_PROCESS = eINSTANCE.getBsmProcess_SubProcess();

		/**
		 * The meta object literal for the '<em><b>Main Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__MAIN_PROCESS = eINSTANCE.getBsmProcess_MainProcess();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__SERVICE = eINSTANCE.getBsmProcess_Service();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__RESOURCES = eINSTANCE.getBsmProcess_Resources();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__ORGANIZATIONS = eINSTANCE.getBsmProcess_Organizations();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__BSM_MODEL = eINSTANCE.getBsmProcess_BsmModel();

		/**
		 * The meta object literal for the '<em><b>Ea Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__EA_PROCESS = eINSTANCE.getBsmProcess_EaProcess();

		/**
		 * The meta object literal for the '<em><b>Mse Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PROCESS__MSE_SERVICE = eINSTANCE.getBsmProcess_MseService();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecision()
		 * @generated
		 */
		EClass BSM_DECISION = eINSTANCE.getBsmDecision();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__ID = eINSTANCE.getBsmDecision_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__NAME = eINSTANCE.getBsmDecision_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__TYPE = eINSTANCE.getBsmDecision_Type();

		/**
		 * The meta object literal for the '<em><b>Horizon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__HORIZON = eINSTANCE.getBsmDecision_Horizon();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__PERIOD = eINSTANCE.getBsmDecision_Period();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__CONSTRAINT = eINSTANCE.getBsmDecision_Constraint();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__OBJECTIVE = eINSTANCE.getBsmDecision_Objective();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__VARIABLE = eINSTANCE.getBsmDecision_Variable();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION__EVENT = eINSTANCE.getBsmDecision_Event();

		/**
		 * The meta object literal for the '<em><b>Decision Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__DECISION_STRUCTURE = eINSTANCE.getBsmDecision_DecisionStructure();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__ORGANIZATION = eINSTANCE.getBsmDecision_Organization();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__BSM_MODEL = eINSTANCE.getBsmDecision_BsmModel();

		/**
		 * The meta object literal for the '<em><b>Gg Decision Centers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__GG_DECISION_CENTERS = eINSTANCE.getBsmDecision_GgDecisionCenters();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__VARIABLES = eINSTANCE.getBsmDecision_Variables();

		/**
		 * The meta object literal for the '<em><b>Performance Indicators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__PERFORMANCE_INDICATORS = eINSTANCE.getBsmDecision_PerformanceIndicators();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION__OBJECTIVES = eINSTANCE.getBsmDecision_Objectives();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl <em>Decision Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionStructure()
		 * @generated
		 */
		EClass BSM_DECISION_STRUCTURE = eINSTANCE.getBsmDecisionStructure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_STRUCTURE__ID = eINSTANCE.getBsmDecisionStructure_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_STRUCTURE__NAME = eINSTANCE.getBsmDecisionStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_STRUCTURE__DECISIONS = eINSTANCE.getBsmDecisionStructure_Decisions();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_STRUCTURE__ORGANIZATIONS = eINSTANCE.getBsmDecisionStructure_Organizations();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_STRUCTURE__BSM_MODEL = eINSTANCE.getBsmDecisionStructure_BsmModel();

		/**
		 * The meta object literal for the '<em><b>Gg Grai Grids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS = eINSTANCE.getBsmDecisionStructure_GgGraiGrids();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmOrganizationImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmOrganization()
		 * @generated
		 */
		EClass BSM_ORGANIZATION = eINSTANCE.getBsmOrganization();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_ORGANIZATION__ID = eINSTANCE.getBsmOrganization_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_ORGANIZATION__NAME = eINSTANCE.getBsmOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_ORGANIZATION__DESCRIPTION = eINSTANCE.getBsmOrganization_Description();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__PROCESSES = eINSTANCE.getBsmOrganization_Processes();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__DECISIONS = eINSTANCE.getBsmOrganization_Decisions();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__BSM_MODEL = eINSTANCE.getBsmOrganization_BsmModel();

		/**
		 * The meta object literal for the '<em><b>Decision Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__DECISION_STRUCTURES = eINSTANCE.getBsmOrganization_DecisionStructures();

		/**
		 * The meta object literal for the '<em><b>Gg Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__GG_ORGANIZATIONS = eINSTANCE.getBsmOrganization_GgOrganizations();

		/**
		 * The meta object literal for the '<em><b>Ea Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__EA_ORGANIZATIONS = eINSTANCE.getBsmOrganization_EaOrganizations();

		/**
		 * The meta object literal for the '<em><b>Mse Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ORGANIZATION__MSE_SERVICE = eINSTANCE.getBsmOrganization_MseService();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmEnterpriseImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmEnterprise()
		 * @generated
		 */
		EClass BSM_ENTERPRISE = eINSTANCE.getBsmEnterprise();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_ENTERPRISE__TYPE = eINSTANCE.getBsmEnterprise_Type();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ENTERPRISE__RESOURCES = eINSTANCE.getBsmEnterprise_Resources();

		/**
		 * The meta object literal for the '<em><b>Ve Participations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_ENTERPRISE__VE_PARTICIPATIONS = eINSTANCE.getBsmEnterprise_VeParticipations();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVirtualEnterpriseImpl <em>Virtual Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVirtualEnterpriseImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmVirtualEnterprise()
		 * @generated
		 */
		EClass BSM_VIRTUAL_ENTERPRISE = eINSTANCE.getBsmVirtualEnterprise();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VIRTUAL_ENTERPRISE__TYPE = eINSTANCE.getBsmVirtualEnterprise_Type();

		/**
		 * The meta object literal for the '<em><b>Ve Participations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_VIRTUAL_ENTERPRISE__VE_PARTICIPATIONS = eINSTANCE.getBsmVirtualEnterprise_VeParticipations();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl <em>VE Participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmVEParticipationImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmVEParticipation()
		 * @generated
		 */
		EClass BSM_VE_PARTICIPATION = eINSTANCE.getBsmVEParticipation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VE_PARTICIPATION__ID = eINSTANCE.getBsmVEParticipation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VE_PARTICIPATION__NAME = eINSTANCE.getBsmVEParticipation_Name();

		/**
		 * The meta object literal for the '<em><b>Enterprise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_VE_PARTICIPATION__ENTERPRISE = eINSTANCE.getBsmVEParticipation_Enterprise();

		/**
		 * The meta object literal for the '<em><b>Virtual Enterprise</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE = eINSTANCE.getBsmVEParticipation_VirtualEnterprise();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmValueImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmValue()
		 * @generated
		 */
		EClass BSM_VALUE = eINSTANCE.getBsmValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VALUE__ID = eINSTANCE.getBsmValue_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VALUE__NAME = eINSTANCE.getBsmValue_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_VALUE__SERVICE = eINSTANCE.getBsmValue_Service();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_VALUE__DESCRIPTION = eINSTANCE.getBsmValue_Description();

		/**
		 * The meta object literal for the '<em><b>Bsm Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_VALUE__BSM_MODEL = eINSTANCE.getBsmValue_BsmModel();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl <em>Performance Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPerformanceIndicatorImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPerformanceIndicator()
		 * @generated
		 */
		EClass BSM_PERFORMANCE_INDICATOR = eINSTANCE.getBsmPerformanceIndicator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__ID = eINSTANCE.getBsmPerformanceIndicator_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__NAME = eINSTANCE.getBsmPerformanceIndicator_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__DESCRIPTION = eINSTANCE.getBsmPerformanceIndicator_Description();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__UNIT = eINSTANCE.getBsmPerformanceIndicator_Unit();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__FORMULA = eINSTANCE.getBsmPerformanceIndicator_Formula();

		/**
		 * The meta object literal for the '<em><b>Required Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO = eINSTANCE.getBsmPerformanceIndicator_RequiredInfo();

		/**
		 * The meta object literal for the '<em><b>Required Processing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING = eINSTANCE.getBsmPerformanceIndicator_RequiredProcessing();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PERFORMANCE_INDICATOR__DECISION = eINSTANCE.getBsmPerformanceIndicator_Decision();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PERFORMANCE_INDICATOR__VARIABLES = eINSTANCE.getBsmPerformanceIndicator_Variables();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PERFORMANCE_INDICATOR__OBJECTIVES = eINSTANCE.getBsmPerformanceIndicator_Objectives();

		/**
		 * The meta object literal for the '<em><b>Category1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__CATEGORY1 = eINSTANCE.getBsmPerformanceIndicator_Category1();

		/**
		 * The meta object literal for the '<em><b>Category2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__CATEGORY2 = eINSTANCE.getBsmPerformanceIndicator_Category2();

		/**
		 * The meta object literal for the '<em><b>Category3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__CATEGORY3 = eINSTANCE.getBsmPerformanceIndicator_Category3();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PERFORMANCE_INDICATOR__DIMENSION = eINSTANCE.getBsmPerformanceIndicator_Dimension();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PERFORMANCE_INDICATOR__FIELDS = eINSTANCE.getBsmPerformanceIndicator_Fields();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl <em>Pi Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPiFieldImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPiField()
		 * @generated
		 */
		EClass BSM_PI_FIELD = eINSTANCE.getBsmPiField();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PI_FIELD__ID = eINSTANCE.getBsmPiField_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_PI_FIELD__NAME = eINSTANCE.getBsmPiField_Name();

		/**
		 * The meta object literal for the '<em><b>Performance Indicators</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_PI_FIELD__PERFORMANCE_INDICATORS = eINSTANCE.getBsmPiField_PerformanceIndicators();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionVariableImpl <em>Decision Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionVariableImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionVariable()
		 * @generated
		 */
		EClass BSM_DECISION_VARIABLE = eINSTANCE.getBsmDecisionVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_VARIABLE__ID = eINSTANCE.getBsmDecisionVariable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_VARIABLE__NAME = eINSTANCE.getBsmDecisionVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_VARIABLE__DESCRIPTION = eINSTANCE.getBsmDecisionVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_VARIABLE__DECISION = eINSTANCE.getBsmDecisionVariable_Decision();

		/**
		 * The meta object literal for the '<em><b>Performance Indicators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_VARIABLE__PERFORMANCE_INDICATORS = eINSTANCE.getBsmDecisionVariable_PerformanceIndicators();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl <em>Decision Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionObjectiveImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionObjective()
		 * @generated
		 */
		EClass BSM_DECISION_OBJECTIVE = eINSTANCE.getBsmDecisionObjective();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_OBJECTIVE__ID = eINSTANCE.getBsmDecisionObjective_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_OBJECTIVE__NAME = eINSTANCE.getBsmDecisionObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_DECISION_OBJECTIVE__DESCRIPTION = eINSTANCE.getBsmDecisionObjective_Description();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_OBJECTIVE__DECISION = eINSTANCE.getBsmDecisionObjective_Decision();

		/**
		 * The meta object literal for the '<em><b>Performance Indicators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS = eINSTANCE.getBsmDecisionObjective_PerformanceIndicators();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl <em>Mse Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmMseServiceImpl
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmMseService()
		 * @generated
		 */
		EClass BSM_MSE_SERVICE = eINSTANCE.getBsmMseService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__ID = eINSTANCE.getBsmMseService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__NAME = eINSTANCE.getBsmMseService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__DESCRIPTION = eINSTANCE.getBsmMseService_Description();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__OWNER = eINSTANCE.getBsmMseService_Owner();

		/**
		 * The meta object literal for the '<em><b>Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__CREATE_DATE = eINSTANCE.getBsmMseService_CreateDate();

		/**
		 * The meta object literal for the '<em><b>Published Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__PUBLISHED_DATE = eINSTANCE.getBsmMseService_PublishedDate();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__PUBLISHED = eINSTANCE.getBsmMseService_Published();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSM_MSE_SERVICE__USER_ID = eINSTANCE.getBsmMseService_UserId();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MSE_SERVICE__PROCESS = eINSTANCE.getBsmMseService_Process();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MSE_SERVICE__ORGANIZATION = eINSTANCE.getBsmMseService_Organization();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSM_MSE_SERVICE__RESOURCE = eINSTANCE.getBsmMseService_Resource();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmGender()
		 * @generated
		 */
		EEnum BSM_GENDER = eINSTANCE.getBsmGender();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmResourceType()
		 * @generated
		 */
		EEnum BSM_RESOURCE_TYPE = eINSTANCE.getBsmResourceType();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType <em>PI Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmPIType()
		 * @generated
		 */
		EEnum BSM_PI_TYPE = eINSTANCE.getBsmPIType();

		/**
		 * The meta object literal for the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType <em>Decision Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType
		 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl#getBsmDecisionType()
		 * @generated
		 */
		EEnum BSM_DECISION_TYPE = eINSTANCE.getBsmDecisionType();

	}

} //BsmPackage
