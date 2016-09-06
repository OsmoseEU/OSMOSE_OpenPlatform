/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPIType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmPackageImpl extends EPackageImpl implements BsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBsmNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmCustomerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmStakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmPartnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmFunctionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmDecisionStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmEnterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmVirtualEnterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmVEParticipationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmPerformanceIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmPiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmDecisionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmDecisionObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsmMseServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bsmGenderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bsmResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bsmPITypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bsmDecisionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BsmPackageImpl() {
		super(eNS_URI, BsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BsmPackage init() {
		if (isInited) return (BsmPackage)EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI);

		// Obtain or create and register package
		BsmPackageImpl theBsmPackage = (BsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BsmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RootPackageImpl theRootPackage = (RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) instanceof RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) : RootPackage.eINSTANCE);
		GeneralElementsPackageImpl theGeneralElementsPackage = (GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) instanceof GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) : GeneralElementsPackage.eINSTANCE);
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theBsmPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theGeneralElementsPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theRootPackage_1.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theBsmPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theGeneralElementsPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();
		theCoreElementsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BsmPackage.eNS_URI, theBsmPackage);
		return theBsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBsmNamedElement() {
		return iBsmNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmModel() {
		return bsmModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmModel_Id() {
		return (EAttribute)bsmModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmModel_Name() {
		return (EAttribute)bsmModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Service() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Organizations() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Partners() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Stakeholders() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Values() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Products() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Functionalities() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Customers() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Processes() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Decisions() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_DecisionStructures() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmModel_Resources() {
		return (EReference)bsmModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmService() {
		return bsmServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Id() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Name() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Description() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Constraint() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Objective() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Domain() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmService_Nature() {
		return (EAttribute)bsmServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Products() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Functionalities() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Resources() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Processes() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Customers() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Values() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Stakeholders() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_Partners() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmService_BsmModel() {
		return (EReference)bsmServiceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmCustomer() {
		return bsmCustomerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Id() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Name() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Categories() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_LevelOfEducation() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Gender() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Age() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_AnnualRevenueRange() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Requirement() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_Constraint() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmCustomer_TargetedUsageFreq() {
		return (EAttribute)bsmCustomerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmCustomer_Service() {
		return (EReference)bsmCustomerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmCustomer_BsmModel() {
		return (EReference)bsmCustomerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmStakeholder() {
		return bsmStakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Id() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Name() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Type() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Concern() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Constraint() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmStakeholder_Role() {
		return (EAttribute)bsmStakeholderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmStakeholder_Service() {
		return (EReference)bsmStakeholderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmStakeholder_BsmModel() {
		return (EReference)bsmStakeholderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmPartner() {
		return bsmPartnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Id() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Name() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Category() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Competence() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Concern() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Constraint() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPartner_Contribution() {
		return (EAttribute)bsmPartnerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPartner_Service() {
		return (EReference)bsmPartnerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPartner_BsmModel() {
		return (EReference)bsmPartnerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmProduct() {
		return bsmProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProduct_Id() {
		return (EAttribute)bsmProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProduct_Name() {
		return (EAttribute)bsmProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProduct_Type() {
		return (EAttribute)bsmProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProduct_Function() {
		return (EAttribute)bsmProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProduct_TechCharacteristics() {
		return (EAttribute)bsmProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProduct_Service() {
		return (EReference)bsmProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProduct_Functionalities() {
		return (EReference)bsmProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProduct_Components() {
		return (EReference)bsmProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProduct_BsmModel() {
		return (EReference)bsmProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmComponent() {
		return bsmComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmComponent_Id() {
		return (EAttribute)bsmComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmComponent_Name() {
		return (EAttribute)bsmComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmComponent_Cost() {
		return (EAttribute)bsmComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmComponent_Product() {
		return (EReference)bsmComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmFunctionality() {
		return bsmFunctionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmFunctionality_Id() {
		return (EAttribute)bsmFunctionalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmFunctionality_Name() {
		return (EAttribute)bsmFunctionalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmFunctionality_Type() {
		return (EAttribute)bsmFunctionalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmFunctionality_Description() {
		return (EAttribute)bsmFunctionalityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmFunctionality_Service() {
		return (EReference)bsmFunctionalityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmFunctionality_Product() {
		return (EReference)bsmFunctionalityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmFunctionality_SubFunctions() {
		return (EReference)bsmFunctionalityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmFunctionality_MainFunction() {
		return (EReference)bsmFunctionalityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmFunctionality_BsmModel() {
		return (EReference)bsmFunctionalityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmResource() {
		return bsmResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Id() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Name() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Type() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Role() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Capability() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmResource_Constraint() {
		return (EAttribute)bsmResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_Service() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_Processes() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_Organization() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_BsmModel() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_EaResources() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmResource_MseService() {
		return (EReference)bsmResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmProcess() {
		return bsmProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Id() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Name() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Objective() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Trigger() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Result() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmProcess_Constraint() {
		return (EAttribute)bsmProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_SubProcess() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_MainProcess() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_Service() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_Resources() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_Organizations() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_BsmModel() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_EaProcess() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmProcess_MseService() {
		return (EReference)bsmProcessEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmDecision() {
		return bsmDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Id() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Name() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Type() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Horizon() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Period() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Constraint() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Objective() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Variable() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecision_Event() {
		return (EAttribute)bsmDecisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_DecisionStructure() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_Organization() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_BsmModel() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_GgDecisionCenters() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_Variables() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_PerformanceIndicators() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecision_Objectives() {
		return (EReference)bsmDecisionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmDecisionStructure() {
		return bsmDecisionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionStructure_Id() {
		return (EAttribute)bsmDecisionStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionStructure_Name() {
		return (EAttribute)bsmDecisionStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionStructure_Decisions() {
		return (EReference)bsmDecisionStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionStructure_Organizations() {
		return (EReference)bsmDecisionStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionStructure_BsmModel() {
		return (EReference)bsmDecisionStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionStructure_GgGraiGrids() {
		return (EReference)bsmDecisionStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmOrganization() {
		return bsmOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmOrganization_Id() {
		return (EAttribute)bsmOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmOrganization_Name() {
		return (EAttribute)bsmOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmOrganization_Description() {
		return (EAttribute)bsmOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_Processes() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_Decisions() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_BsmModel() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_DecisionStructures() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_GgOrganizations() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_EaOrganizations() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmOrganization_MseService() {
		return (EReference)bsmOrganizationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmEnterprise() {
		return bsmEnterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmEnterprise_Type() {
		return (EAttribute)bsmEnterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmEnterprise_Resources() {
		return (EReference)bsmEnterpriseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmEnterprise_VeParticipations() {
		return (EReference)bsmEnterpriseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmVirtualEnterprise() {
		return bsmVirtualEnterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmVirtualEnterprise_Type() {
		return (EAttribute)bsmVirtualEnterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmVirtualEnterprise_VeParticipations() {
		return (EReference)bsmVirtualEnterpriseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmVEParticipation() {
		return bsmVEParticipationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmVEParticipation_Id() {
		return (EAttribute)bsmVEParticipationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmVEParticipation_Name() {
		return (EAttribute)bsmVEParticipationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmVEParticipation_Enterprise() {
		return (EReference)bsmVEParticipationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmVEParticipation_VirtualEnterprise() {
		return (EReference)bsmVEParticipationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmValue() {
		return bsmValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmValue_Id() {
		return (EAttribute)bsmValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmValue_Name() {
		return (EAttribute)bsmValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmValue_Service() {
		return (EReference)bsmValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmValue_Description() {
		return (EAttribute)bsmValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmValue_BsmModel() {
		return (EReference)bsmValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmPerformanceIndicator() {
		return bsmPerformanceIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Id() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Name() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Description() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Unit() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Formula() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_RequiredInfo() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_RequiredProcessing() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPerformanceIndicator_Decision() {
		return (EReference)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPerformanceIndicator_Variables() {
		return (EReference)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPerformanceIndicator_Objectives() {
		return (EReference)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Category1() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Category2() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Category3() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPerformanceIndicator_Dimension() {
		return (EAttribute)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPerformanceIndicator_Fields() {
		return (EReference)bsmPerformanceIndicatorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmPiField() {
		return bsmPiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPiField_Id() {
		return (EAttribute)bsmPiFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmPiField_Name() {
		return (EAttribute)bsmPiFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmPiField_PerformanceIndicators() {
		return (EReference)bsmPiFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmDecisionVariable() {
		return bsmDecisionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionVariable_Id() {
		return (EAttribute)bsmDecisionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionVariable_Name() {
		return (EAttribute)bsmDecisionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionVariable_Description() {
		return (EAttribute)bsmDecisionVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionVariable_Decision() {
		return (EReference)bsmDecisionVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionVariable_PerformanceIndicators() {
		return (EReference)bsmDecisionVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmDecisionObjective() {
		return bsmDecisionObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionObjective_Id() {
		return (EAttribute)bsmDecisionObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionObjective_Name() {
		return (EAttribute)bsmDecisionObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmDecisionObjective_Description() {
		return (EAttribute)bsmDecisionObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionObjective_Decision() {
		return (EReference)bsmDecisionObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmDecisionObjective_PerformanceIndicators() {
		return (EReference)bsmDecisionObjectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBsmMseService() {
		return bsmMseServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_Id() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_Name() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_Description() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_Owner() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_CreateDate() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_PublishedDate() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_Published() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBsmMseService_UserId() {
		return (EAttribute)bsmMseServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmMseService_Process() {
		return (EReference)bsmMseServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmMseService_Organization() {
		return (EReference)bsmMseServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBsmMseService_Resource() {
		return (EReference)bsmMseServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBsmGender() {
		return bsmGenderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBsmResourceType() {
		return bsmResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBsmPIType() {
		return bsmPITypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBsmDecisionType() {
		return bsmDecisionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmFactory getBsmFactory() {
		return (BsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iBsmNamedElementEClass = createEClass(IBSM_NAMED_ELEMENT);

		bsmModelEClass = createEClass(BSM_MODEL);
		createEAttribute(bsmModelEClass, BSM_MODEL__ID);
		createEAttribute(bsmModelEClass, BSM_MODEL__NAME);
		createEReference(bsmModelEClass, BSM_MODEL__SERVICE);
		createEReference(bsmModelEClass, BSM_MODEL__ORGANIZATIONS);
		createEReference(bsmModelEClass, BSM_MODEL__PARTNERS);
		createEReference(bsmModelEClass, BSM_MODEL__STAKEHOLDERS);
		createEReference(bsmModelEClass, BSM_MODEL__VALUES);
		createEReference(bsmModelEClass, BSM_MODEL__PRODUCTS);
		createEReference(bsmModelEClass, BSM_MODEL__FUNCTIONALITIES);
		createEReference(bsmModelEClass, BSM_MODEL__CUSTOMERS);
		createEReference(bsmModelEClass, BSM_MODEL__PROCESSES);
		createEReference(bsmModelEClass, BSM_MODEL__DECISIONS);
		createEReference(bsmModelEClass, BSM_MODEL__DECISION_STRUCTURES);
		createEReference(bsmModelEClass, BSM_MODEL__RESOURCES);

		bsmServiceEClass = createEClass(BSM_SERVICE);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__ID);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__NAME);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__DESCRIPTION);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__CONSTRAINT);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__OBJECTIVE);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__DOMAIN);
		createEAttribute(bsmServiceEClass, BSM_SERVICE__NATURE);
		createEReference(bsmServiceEClass, BSM_SERVICE__PRODUCTS);
		createEReference(bsmServiceEClass, BSM_SERVICE__FUNCTIONALITIES);
		createEReference(bsmServiceEClass, BSM_SERVICE__RESOURCES);
		createEReference(bsmServiceEClass, BSM_SERVICE__PROCESSES);
		createEReference(bsmServiceEClass, BSM_SERVICE__CUSTOMERS);
		createEReference(bsmServiceEClass, BSM_SERVICE__VALUES);
		createEReference(bsmServiceEClass, BSM_SERVICE__STAKEHOLDERS);
		createEReference(bsmServiceEClass, BSM_SERVICE__PARTNERS);
		createEReference(bsmServiceEClass, BSM_SERVICE__BSM_MODEL);

		bsmCustomerEClass = createEClass(BSM_CUSTOMER);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__ID);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__NAME);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__CATEGORIES);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__LEVEL_OF_EDUCATION);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__GENDER);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__AGE);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__ANNUAL_REVENUE_RANGE);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__REQUIREMENT);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__CONSTRAINT);
		createEAttribute(bsmCustomerEClass, BSM_CUSTOMER__TARGETED_USAGE_FREQ);
		createEReference(bsmCustomerEClass, BSM_CUSTOMER__SERVICE);
		createEReference(bsmCustomerEClass, BSM_CUSTOMER__BSM_MODEL);

		bsmStakeholderEClass = createEClass(BSM_STAKEHOLDER);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__ID);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__NAME);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__TYPE);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__CONCERN);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__CONSTRAINT);
		createEAttribute(bsmStakeholderEClass, BSM_STAKEHOLDER__ROLE);
		createEReference(bsmStakeholderEClass, BSM_STAKEHOLDER__SERVICE);
		createEReference(bsmStakeholderEClass, BSM_STAKEHOLDER__BSM_MODEL);

		bsmPartnerEClass = createEClass(BSM_PARTNER);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__ID);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__NAME);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__CATEGORY);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__COMPETENCE);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__CONCERN);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__CONSTRAINT);
		createEAttribute(bsmPartnerEClass, BSM_PARTNER__CONTRIBUTION);
		createEReference(bsmPartnerEClass, BSM_PARTNER__SERVICE);
		createEReference(bsmPartnerEClass, BSM_PARTNER__BSM_MODEL);

		bsmProductEClass = createEClass(BSM_PRODUCT);
		createEAttribute(bsmProductEClass, BSM_PRODUCT__ID);
		createEAttribute(bsmProductEClass, BSM_PRODUCT__NAME);
		createEAttribute(bsmProductEClass, BSM_PRODUCT__TYPE);
		createEAttribute(bsmProductEClass, BSM_PRODUCT__FUNCTION);
		createEAttribute(bsmProductEClass, BSM_PRODUCT__TECH_CHARACTERISTICS);
		createEReference(bsmProductEClass, BSM_PRODUCT__SERVICE);
		createEReference(bsmProductEClass, BSM_PRODUCT__FUNCTIONALITIES);
		createEReference(bsmProductEClass, BSM_PRODUCT__COMPONENTS);
		createEReference(bsmProductEClass, BSM_PRODUCT__BSM_MODEL);

		bsmComponentEClass = createEClass(BSM_COMPONENT);
		createEAttribute(bsmComponentEClass, BSM_COMPONENT__ID);
		createEAttribute(bsmComponentEClass, BSM_COMPONENT__NAME);
		createEAttribute(bsmComponentEClass, BSM_COMPONENT__COST);
		createEReference(bsmComponentEClass, BSM_COMPONENT__PRODUCT);

		bsmFunctionalityEClass = createEClass(BSM_FUNCTIONALITY);
		createEAttribute(bsmFunctionalityEClass, BSM_FUNCTIONALITY__ID);
		createEAttribute(bsmFunctionalityEClass, BSM_FUNCTIONALITY__NAME);
		createEAttribute(bsmFunctionalityEClass, BSM_FUNCTIONALITY__TYPE);
		createEAttribute(bsmFunctionalityEClass, BSM_FUNCTIONALITY__DESCRIPTION);
		createEReference(bsmFunctionalityEClass, BSM_FUNCTIONALITY__SERVICE);
		createEReference(bsmFunctionalityEClass, BSM_FUNCTIONALITY__PRODUCT);
		createEReference(bsmFunctionalityEClass, BSM_FUNCTIONALITY__SUB_FUNCTIONS);
		createEReference(bsmFunctionalityEClass, BSM_FUNCTIONALITY__MAIN_FUNCTION);
		createEReference(bsmFunctionalityEClass, BSM_FUNCTIONALITY__BSM_MODEL);

		bsmResourceEClass = createEClass(BSM_RESOURCE);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__ID);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__NAME);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__TYPE);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__ROLE);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__CAPABILITY);
		createEAttribute(bsmResourceEClass, BSM_RESOURCE__CONSTRAINT);
		createEReference(bsmResourceEClass, BSM_RESOURCE__SERVICE);
		createEReference(bsmResourceEClass, BSM_RESOURCE__PROCESSES);
		createEReference(bsmResourceEClass, BSM_RESOURCE__ORGANIZATION);
		createEReference(bsmResourceEClass, BSM_RESOURCE__BSM_MODEL);
		createEReference(bsmResourceEClass, BSM_RESOURCE__EA_RESOURCES);
		createEReference(bsmResourceEClass, BSM_RESOURCE__MSE_SERVICE);

		bsmProcessEClass = createEClass(BSM_PROCESS);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__ID);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__NAME);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__OBJECTIVE);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__TRIGGER);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__RESULT);
		createEAttribute(bsmProcessEClass, BSM_PROCESS__CONSTRAINT);
		createEReference(bsmProcessEClass, BSM_PROCESS__SUB_PROCESS);
		createEReference(bsmProcessEClass, BSM_PROCESS__MAIN_PROCESS);
		createEReference(bsmProcessEClass, BSM_PROCESS__SERVICE);
		createEReference(bsmProcessEClass, BSM_PROCESS__RESOURCES);
		createEReference(bsmProcessEClass, BSM_PROCESS__ORGANIZATIONS);
		createEReference(bsmProcessEClass, BSM_PROCESS__BSM_MODEL);
		createEReference(bsmProcessEClass, BSM_PROCESS__EA_PROCESS);
		createEReference(bsmProcessEClass, BSM_PROCESS__MSE_SERVICE);

		bsmDecisionEClass = createEClass(BSM_DECISION);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__ID);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__NAME);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__TYPE);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__HORIZON);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__PERIOD);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__CONSTRAINT);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__OBJECTIVE);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__VARIABLE);
		createEAttribute(bsmDecisionEClass, BSM_DECISION__EVENT);
		createEReference(bsmDecisionEClass, BSM_DECISION__DECISION_STRUCTURE);
		createEReference(bsmDecisionEClass, BSM_DECISION__ORGANIZATION);
		createEReference(bsmDecisionEClass, BSM_DECISION__BSM_MODEL);
		createEReference(bsmDecisionEClass, BSM_DECISION__GG_DECISION_CENTERS);
		createEReference(bsmDecisionEClass, BSM_DECISION__VARIABLES);
		createEReference(bsmDecisionEClass, BSM_DECISION__PERFORMANCE_INDICATORS);
		createEReference(bsmDecisionEClass, BSM_DECISION__OBJECTIVES);

		bsmDecisionStructureEClass = createEClass(BSM_DECISION_STRUCTURE);
		createEAttribute(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__ID);
		createEAttribute(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__NAME);
		createEReference(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__DECISIONS);
		createEReference(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__ORGANIZATIONS);
		createEReference(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__BSM_MODEL);
		createEReference(bsmDecisionStructureEClass, BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS);

		bsmOrganizationEClass = createEClass(BSM_ORGANIZATION);
		createEAttribute(bsmOrganizationEClass, BSM_ORGANIZATION__ID);
		createEAttribute(bsmOrganizationEClass, BSM_ORGANIZATION__NAME);
		createEAttribute(bsmOrganizationEClass, BSM_ORGANIZATION__DESCRIPTION);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__PROCESSES);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__DECISIONS);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__BSM_MODEL);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__DECISION_STRUCTURES);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__GG_ORGANIZATIONS);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__EA_ORGANIZATIONS);
		createEReference(bsmOrganizationEClass, BSM_ORGANIZATION__MSE_SERVICE);

		bsmEnterpriseEClass = createEClass(BSM_ENTERPRISE);
		createEAttribute(bsmEnterpriseEClass, BSM_ENTERPRISE__TYPE);
		createEReference(bsmEnterpriseEClass, BSM_ENTERPRISE__RESOURCES);
		createEReference(bsmEnterpriseEClass, BSM_ENTERPRISE__VE_PARTICIPATIONS);

		bsmVirtualEnterpriseEClass = createEClass(BSM_VIRTUAL_ENTERPRISE);
		createEAttribute(bsmVirtualEnterpriseEClass, BSM_VIRTUAL_ENTERPRISE__TYPE);
		createEReference(bsmVirtualEnterpriseEClass, BSM_VIRTUAL_ENTERPRISE__VE_PARTICIPATIONS);

		bsmVEParticipationEClass = createEClass(BSM_VE_PARTICIPATION);
		createEAttribute(bsmVEParticipationEClass, BSM_VE_PARTICIPATION__ID);
		createEAttribute(bsmVEParticipationEClass, BSM_VE_PARTICIPATION__NAME);
		createEReference(bsmVEParticipationEClass, BSM_VE_PARTICIPATION__ENTERPRISE);
		createEReference(bsmVEParticipationEClass, BSM_VE_PARTICIPATION__VIRTUAL_ENTERPRISE);

		bsmValueEClass = createEClass(BSM_VALUE);
		createEAttribute(bsmValueEClass, BSM_VALUE__ID);
		createEAttribute(bsmValueEClass, BSM_VALUE__NAME);
		createEReference(bsmValueEClass, BSM_VALUE__SERVICE);
		createEAttribute(bsmValueEClass, BSM_VALUE__DESCRIPTION);
		createEReference(bsmValueEClass, BSM_VALUE__BSM_MODEL);

		bsmPerformanceIndicatorEClass = createEClass(BSM_PERFORMANCE_INDICATOR);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__ID);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__NAME);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__DESCRIPTION);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__UNIT);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__FORMULA);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING);
		createEReference(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__DECISION);
		createEReference(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__VARIABLES);
		createEReference(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__OBJECTIVES);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__CATEGORY1);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__CATEGORY2);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__CATEGORY3);
		createEAttribute(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__DIMENSION);
		createEReference(bsmPerformanceIndicatorEClass, BSM_PERFORMANCE_INDICATOR__FIELDS);

		bsmPiFieldEClass = createEClass(BSM_PI_FIELD);
		createEAttribute(bsmPiFieldEClass, BSM_PI_FIELD__ID);
		createEAttribute(bsmPiFieldEClass, BSM_PI_FIELD__NAME);
		createEReference(bsmPiFieldEClass, BSM_PI_FIELD__PERFORMANCE_INDICATORS);

		bsmDecisionVariableEClass = createEClass(BSM_DECISION_VARIABLE);
		createEAttribute(bsmDecisionVariableEClass, BSM_DECISION_VARIABLE__ID);
		createEAttribute(bsmDecisionVariableEClass, BSM_DECISION_VARIABLE__NAME);
		createEAttribute(bsmDecisionVariableEClass, BSM_DECISION_VARIABLE__DESCRIPTION);
		createEReference(bsmDecisionVariableEClass, BSM_DECISION_VARIABLE__DECISION);
		createEReference(bsmDecisionVariableEClass, BSM_DECISION_VARIABLE__PERFORMANCE_INDICATORS);

		bsmDecisionObjectiveEClass = createEClass(BSM_DECISION_OBJECTIVE);
		createEAttribute(bsmDecisionObjectiveEClass, BSM_DECISION_OBJECTIVE__ID);
		createEAttribute(bsmDecisionObjectiveEClass, BSM_DECISION_OBJECTIVE__NAME);
		createEAttribute(bsmDecisionObjectiveEClass, BSM_DECISION_OBJECTIVE__DESCRIPTION);
		createEReference(bsmDecisionObjectiveEClass, BSM_DECISION_OBJECTIVE__DECISION);
		createEReference(bsmDecisionObjectiveEClass, BSM_DECISION_OBJECTIVE__PERFORMANCE_INDICATORS);

		bsmMseServiceEClass = createEClass(BSM_MSE_SERVICE);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__ID);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__NAME);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__DESCRIPTION);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__OWNER);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__CREATE_DATE);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__PUBLISHED_DATE);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__PUBLISHED);
		createEAttribute(bsmMseServiceEClass, BSM_MSE_SERVICE__USER_ID);
		createEReference(bsmMseServiceEClass, BSM_MSE_SERVICE__PROCESS);
		createEReference(bsmMseServiceEClass, BSM_MSE_SERVICE__ORGANIZATION);
		createEReference(bsmMseServiceEClass, BSM_MSE_SERVICE__RESOURCE);

		// Create enums
		bsmGenderEEnum = createEEnum(BSM_GENDER);
		bsmResourceTypeEEnum = createEEnum(BSM_RESOURCE_TYPE);
		bsmPITypeEEnum = createEEnum(BSM_PI_TYPE);
		bsmDecisionTypeEEnum = createEEnum(BSM_DECISION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		GeneralElementsPackage theGeneralElementsPackage = (GeneralElementsPackage)EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bsmModelEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmServiceEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmCustomerEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmStakeholderEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmPartnerEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmProductEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmComponentEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmFunctionalityEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmResourceEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmProcessEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmDecisionEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmDecisionStructureEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmOrganizationEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmEnterpriseEClass.getESuperTypes().add(this.getBsmOrganization());
		bsmVirtualEnterpriseEClass.getESuperTypes().add(this.getBsmOrganization());
		bsmVEParticipationEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmValueEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmPerformanceIndicatorEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmPiFieldEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmDecisionVariableEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmDecisionObjectiveEClass.getESuperTypes().add(this.getIBsmNamedElement());
		bsmMseServiceEClass.getESuperTypes().add(this.getIBsmNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(iBsmNamedElementEClass, IBsmNamedElement.class, "IBsmNamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iBsmNamedElementEClass, ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iBsmNamedElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(iBsmNamedElementEClass, null, "setId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iBsmNamedElementEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iBsmNamedElementEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bsmModelEClass, BsmModel.class, "BsmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmModel_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Service(), this.getBsmService(), this.getBsmService_BsmModel(), "service", null, 1, 1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Organizations(), this.getBsmOrganization(), this.getBsmOrganization_BsmModel(), "organizations", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Partners(), this.getBsmPartner(), this.getBsmPartner_BsmModel(), "partners", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Stakeholders(), this.getBsmStakeholder(), this.getBsmStakeholder_BsmModel(), "stakeholders", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Values(), this.getBsmValue(), this.getBsmValue_BsmModel(), "values", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Products(), this.getBsmProduct(), this.getBsmProduct_BsmModel(), "products", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Functionalities(), this.getBsmFunctionality(), this.getBsmFunctionality_BsmModel(), "functionalities", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Customers(), this.getBsmCustomer(), this.getBsmCustomer_BsmModel(), "customers", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Processes(), this.getBsmProcess(), this.getBsmProcess_BsmModel(), "processes", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Decisions(), this.getBsmDecision(), this.getBsmDecision_BsmModel(), "decisions", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_DecisionStructures(), this.getBsmDecisionStructure(), this.getBsmDecisionStructure_BsmModel(), "decisionStructures", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmModel_Resources(), this.getBsmResource(), this.getBsmResource_BsmModel(), "resources", null, 0, -1, BsmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmServiceEClass, BsmService.class, "BsmService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmService_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmService_Nature(), ecorePackage.getEString(), "nature", null, 0, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Products(), this.getBsmProduct(), this.getBsmProduct_Service(), "products", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Functionalities(), this.getBsmFunctionality(), this.getBsmFunctionality_Service(), "functionalities", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Resources(), this.getBsmResource(), this.getBsmResource_Service(), "resources", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Processes(), this.getBsmProcess(), this.getBsmProcess_Service(), "processes", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Customers(), this.getBsmCustomer(), this.getBsmCustomer_Service(), "customers", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Values(), this.getBsmValue(), this.getBsmValue_Service(), "values", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Stakeholders(), this.getBsmStakeholder(), this.getBsmStakeholder_Service(), "stakeholders", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_Partners(), this.getBsmPartner(), this.getBsmPartner_Service(), "partners", null, 0, -1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmService_BsmModel(), this.getBsmModel(), this.getBsmModel_Service(), "bsmModel", null, 1, 1, BsmService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmCustomerEClass, BsmCustomer.class, "BsmCustomer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmCustomer_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Categories(), ecorePackage.getEString(), "categories", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_LevelOfEducation(), ecorePackage.getEString(), "levelOfEducation", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Gender(), this.getBsmGender(), "gender", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Age(), ecorePackage.getEInt(), "age", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_AnnualRevenueRange(), ecorePackage.getEInt(), "annualRevenueRange", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Requirement(), ecorePackage.getEString(), "requirement", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmCustomer_TargetedUsageFreq(), ecorePackage.getEInt(), "targetedUsageFreq", null, 0, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmCustomer_Service(), this.getBsmService(), this.getBsmService_Customers(), "service", null, 1, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmCustomer_BsmModel(), this.getBsmModel(), this.getBsmModel_Customers(), "bsmModel", null, 1, 1, BsmCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmStakeholderEClass, BsmStakeholder.class, "BsmStakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmStakeholder_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmStakeholder_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmStakeholder_Type(), ecorePackage.getEString(), "type", null, 0, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmStakeholder_Concern(), ecorePackage.getEString(), "concern", null, 0, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmStakeholder_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmStakeholder_Role(), ecorePackage.getEString(), "role", null, 0, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmStakeholder_Service(), this.getBsmService(), this.getBsmService_Stakeholders(), "service", null, 1, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmStakeholder_BsmModel(), this.getBsmModel(), this.getBsmModel_Stakeholders(), "bsmModel", null, 1, 1, BsmStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmPartnerEClass, BsmPartner.class, "BsmPartner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmPartner_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Category(), ecorePackage.getEString(), "category", null, 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Competence(), ecorePackage.getEString(), "competence", null, 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Concern(), ecorePackage.getEString(), "concern", null, 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPartner_Contribution(), ecorePackage.getEString(), "contribution", null, 0, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPartner_Service(), this.getBsmService(), this.getBsmService_Partners(), "service", null, 1, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPartner_BsmModel(), this.getBsmModel(), this.getBsmModel_Partners(), "bsmModel", null, 1, 1, BsmPartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmProductEClass, BsmProduct.class, "BsmProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmProduct_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProduct_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProduct_Type(), ecorePackage.getEString(), "type", null, 0, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProduct_Function(), ecorePackage.getEString(), "function", null, 0, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProduct_TechCharacteristics(), ecorePackage.getEString(), "techCharacteristics", null, 0, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProduct_Service(), this.getBsmService(), this.getBsmService_Products(), "service", null, 1, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProduct_Functionalities(), this.getBsmFunctionality(), this.getBsmFunctionality_Product(), "functionalities", null, 0, -1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProduct_Components(), this.getBsmComponent(), this.getBsmComponent_Product(), "components", null, 0, -1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProduct_BsmModel(), this.getBsmModel(), this.getBsmModel_Products(), "bsmModel", null, 1, 1, BsmProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmComponentEClass, BsmComponent.class, "BsmComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmComponent_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmComponent_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmComponent_Cost(), ecorePackage.getEString(), "cost", null, 0, 1, BsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmComponent_Product(), this.getBsmProduct(), this.getBsmProduct_Components(), "product", null, 1, 1, BsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmFunctionalityEClass, BsmFunctionality.class, "BsmFunctionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmFunctionality_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmFunctionality_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmFunctionality_Type(), ecorePackage.getEString(), "type", null, 0, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmFunctionality_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmFunctionality_Service(), this.getBsmService(), this.getBsmService_Functionalities(), "service", null, 1, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmFunctionality_Product(), this.getBsmProduct(), this.getBsmProduct_Functionalities(), "product", null, 0, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmFunctionality_SubFunctions(), this.getBsmFunctionality(), this.getBsmFunctionality_MainFunction(), "subFunctions", null, 0, -1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmFunctionality_MainFunction(), this.getBsmFunctionality(), this.getBsmFunctionality_SubFunctions(), "mainFunction", null, 0, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmFunctionality_BsmModel(), this.getBsmModel(), this.getBsmModel_Functionalities(), "bsmModel", null, 1, 1, BsmFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmResourceEClass, BsmResource.class, "BsmResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmResource_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmResource_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmResource_Type(), this.getBsmResourceType(), "type", null, 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmResource_Role(), ecorePackage.getEString(), "role", null, 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmResource_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmResource_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_Service(), this.getBsmService(), this.getBsmService_Resources(), "service", null, 1, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_Processes(), this.getBsmProcess(), this.getBsmProcess_Resources(), "processes", null, 0, -1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_Organization(), this.getBsmEnterprise(), this.getBsmEnterprise_Resources(), "organization", null, 1, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_BsmModel(), this.getBsmModel(), this.getBsmModel_Resources(), "bsmModel", null, 1, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_EaResources(), theCoreElementsPackage.getEaResource(), null, "eaResources", null, 0, -1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmResource_MseService(), this.getBsmMseService(), this.getBsmMseService_Resource(), "mseService", null, 0, 1, BsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmProcessEClass, BsmProcess.class, "BsmProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmProcess_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProcess_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProcess_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProcess_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProcess_Result(), ecorePackage.getEString(), "result", "", 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmProcess_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_SubProcess(), this.getBsmProcess(), this.getBsmProcess_MainProcess(), "subProcess", null, 0, -1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_MainProcess(), this.getBsmProcess(), this.getBsmProcess_SubProcess(), "mainProcess", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_Service(), this.getBsmService(), this.getBsmService_Processes(), "service", null, 1, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_Resources(), this.getBsmResource(), this.getBsmResource_Processes(), "resources", null, 0, -1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_Organizations(), this.getBsmOrganization(), this.getBsmOrganization_Processes(), "organizations", null, 1, -1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_BsmModel(), this.getBsmModel(), this.getBsmModel_Processes(), "bsmModel", null, 1, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_EaProcess(), theGeneralElementsPackage.getEaProcess(), null, "eaProcess", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmProcess_MseService(), this.getBsmMseService(), this.getBsmMseService_Process(), "mseService", null, 0, 1, BsmProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmDecisionEClass, BsmDecision.class, "BsmDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmDecision_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Type(), this.getBsmDecisionType(), "type", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Horizon(), ecorePackage.getEString(), "horizon", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Period(), ecorePackage.getEString(), "period", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecision_Event(), ecorePackage.getEString(), "event", null, 0, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_DecisionStructure(), this.getBsmDecisionStructure(), this.getBsmDecisionStructure_Decisions(), "decisionStructure", null, 1, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_Organization(), this.getBsmOrganization(), this.getBsmOrganization_Decisions(), "organization", null, 1, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_BsmModel(), this.getBsmModel(), this.getBsmModel_Decisions(), "bsmModel", null, 1, 1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_GgDecisionCenters(), theCoreElementsPackage_1.getGgDecisionCenter(), null, "ggDecisionCenters", null, 0, -1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_Variables(), this.getBsmDecisionVariable(), this.getBsmDecisionVariable_Decision(), "variables", null, 0, -1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_PerformanceIndicators(), this.getBsmPerformanceIndicator(), this.getBsmPerformanceIndicator_Decision(), "performanceIndicators", null, 0, -1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecision_Objectives(), this.getBsmDecisionObjective(), this.getBsmDecisionObjective_Decision(), "objectives", null, 0, -1, BsmDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmDecisionStructureEClass, BsmDecisionStructure.class, "BsmDecisionStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmDecisionStructure_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecisionStructure_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionStructure_Decisions(), this.getBsmDecision(), this.getBsmDecision_DecisionStructure(), "decisions", null, 0, -1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionStructure_Organizations(), this.getBsmOrganization(), this.getBsmOrganization_DecisionStructures(), "organizations", null, 1, -1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionStructure_BsmModel(), this.getBsmModel(), this.getBsmModel_DecisionStructures(), "bsmModel", null, 1, 1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionStructure_GgGraiGrids(), theGeneralElementsPackage_1.getGgGraiGrid(), null, "ggGraiGrids", null, 0, -1, BsmDecisionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmOrganizationEClass, BsmOrganization.class, "BsmOrganization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmOrganization_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmOrganization_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmOrganization_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_Processes(), this.getBsmProcess(), this.getBsmProcess_Organizations(), "processes", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_Decisions(), this.getBsmDecision(), this.getBsmDecision_Organization(), "decisions", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_BsmModel(), this.getBsmModel(), this.getBsmModel_Organizations(), "bsmModel", null, 1, 1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_DecisionStructures(), this.getBsmDecisionStructure(), this.getBsmDecisionStructure_Organizations(), "decisionStructures", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_GgOrganizations(), theGeneralElementsPackage_1.getGgOrganization(), null, "ggOrganizations", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_EaOrganizations(), theCoreElementsPackage.getEaOrganization(), null, "eaOrganizations", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmOrganization_MseService(), this.getBsmMseService(), this.getBsmMseService_Organization(), "mseService", null, 0, -1, BsmOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmEnterpriseEClass, BsmEnterprise.class, "BsmEnterprise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmEnterprise_Type(), ecorePackage.getEString(), "type", null, 0, 1, BsmEnterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmEnterprise_Resources(), this.getBsmResource(), this.getBsmResource_Organization(), "resources", null, 0, -1, BsmEnterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmEnterprise_VeParticipations(), this.getBsmVEParticipation(), this.getBsmVEParticipation_Enterprise(), "veParticipations", null, 0, -1, BsmEnterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmVirtualEnterpriseEClass, BsmVirtualEnterprise.class, "BsmVirtualEnterprise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmVirtualEnterprise_Type(), ecorePackage.getEString(), "type", null, 0, 1, BsmVirtualEnterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmVirtualEnterprise_VeParticipations(), this.getBsmVEParticipation(), this.getBsmVEParticipation_VirtualEnterprise(), "veParticipations", null, 0, -1, BsmVirtualEnterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmVEParticipationEClass, BsmVEParticipation.class, "BsmVEParticipation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmVEParticipation_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmVEParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmVEParticipation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BsmVEParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmVEParticipation_Enterprise(), this.getBsmEnterprise(), this.getBsmEnterprise_VeParticipations(), "enterprise", null, 1, 1, BsmVEParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmVEParticipation_VirtualEnterprise(), this.getBsmVirtualEnterprise(), this.getBsmVirtualEnterprise_VeParticipations(), "virtualEnterprise", null, 1, 1, BsmVEParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmValueEClass, BsmValue.class, "BsmValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmValue_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmValue_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmValue_Service(), this.getBsmService(), this.getBsmService_Values(), "service", null, 1, 1, BsmValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmValue_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmValue_BsmModel(), this.getBsmModel(), this.getBsmModel_Values(), "bsmModel", null, 1, 1, BsmValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmPerformanceIndicatorEClass, BsmPerformanceIndicator.class, "BsmPerformanceIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmPerformanceIndicator_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_RequiredInfo(), ecorePackage.getEString(), "requiredInfo", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_RequiredProcessing(), ecorePackage.getEString(), "requiredProcessing", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPerformanceIndicator_Decision(), this.getBsmDecision(), this.getBsmDecision_PerformanceIndicators(), "decision", null, 1, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPerformanceIndicator_Variables(), this.getBsmDecisionVariable(), this.getBsmDecisionVariable_PerformanceIndicators(), "variables", null, 0, -1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPerformanceIndicator_Objectives(), this.getBsmDecisionObjective(), this.getBsmDecisionObjective_PerformanceIndicators(), "objectives", null, 0, -1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Category1(), ecorePackage.getEString(), "category1", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Category2(), ecorePackage.getEString(), "category2", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Category3(), ecorePackage.getEString(), "category3", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPerformanceIndicator_Dimension(), ecorePackage.getEString(), "dimension", null, 0, 1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPerformanceIndicator_Fields(), this.getBsmPiField(), this.getBsmPiField_PerformanceIndicators(), "fields", null, 0, -1, BsmPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmPiFieldEClass, BsmPiField.class, "BsmPiField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmPiField_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmPiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmPiField_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmPiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmPiField_PerformanceIndicators(), this.getBsmPerformanceIndicator(), this.getBsmPerformanceIndicator_Fields(), "performanceIndicators", null, 1, 1, BsmPiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmDecisionVariableEClass, BsmDecisionVariable.class, "BsmDecisionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmDecisionVariable_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmDecisionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecisionVariable_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmDecisionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecisionVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmDecisionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionVariable_Decision(), this.getBsmDecision(), this.getBsmDecision_Variables(), "decision", null, 1, 1, BsmDecisionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionVariable_PerformanceIndicators(), this.getBsmPerformanceIndicator(), this.getBsmPerformanceIndicator_Variables(), "performanceIndicators", null, 0, -1, BsmDecisionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmDecisionObjectiveEClass, BsmDecisionObjective.class, "BsmDecisionObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmDecisionObjective_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmDecisionObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecisionObjective_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmDecisionObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmDecisionObjective_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmDecisionObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionObjective_Decision(), this.getBsmDecision(), this.getBsmDecision_Objectives(), "decision", null, 1, 1, BsmDecisionObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmDecisionObjective_PerformanceIndicators(), this.getBsmPerformanceIndicator(), this.getBsmPerformanceIndicator_Objectives(), "performanceIndicators", null, 0, -1, BsmDecisionObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsmMseServiceEClass, BsmMseService.class, "BsmMseService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBsmMseService_Id(), ecorePackage.getEString(), "id", null, 1, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_Name(), ecorePackage.getEString(), "name", "", 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_Description(), ecorePackage.getEString(), "description", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_CreateDate(), ecorePackage.getEString(), "createDate", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_PublishedDate(), ecorePackage.getEString(), "publishedDate", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_Published(), ecorePackage.getEIntegerObject(), "published", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBsmMseService_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmMseService_Process(), this.getBsmProcess(), this.getBsmProcess_MseService(), "process", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmMseService_Organization(), this.getBsmOrganization(), this.getBsmOrganization_MseService(), "organization", null, 1, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBsmMseService_Resource(), this.getBsmResource(), this.getBsmResource_MseService(), "resource", null, 0, 1, BsmMseService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bsmGenderEEnum, BsmGender.class, "BsmGender");
		addEEnumLiteral(bsmGenderEEnum, BsmGender.FEMALE);
		addEEnumLiteral(bsmGenderEEnum, BsmGender.MALE);

		initEEnum(bsmResourceTypeEEnum, BsmResourceType.class, "BsmResourceType");
		addEEnumLiteral(bsmResourceTypeEEnum, BsmResourceType.PHYSICAL_MEAN);
		addEEnumLiteral(bsmResourceTypeEEnum, BsmResourceType.IT);
		addEEnumLiteral(bsmResourceTypeEEnum, BsmResourceType.HUMAN);
		addEEnumLiteral(bsmResourceTypeEEnum, BsmResourceType.UNDEFINED);

		initEEnum(bsmPITypeEEnum, BsmPIType.class, "BsmPIType");
		addEEnumLiteral(bsmPITypeEEnum, BsmPIType.CUSTOMER_ORIENTED);
		addEEnumLiteral(bsmPITypeEEnum, BsmPIType.PROVIDER_ORIENTED);

		initEEnum(bsmDecisionTypeEEnum, BsmDecisionType.class, "BsmDecisionType");
		addEEnumLiteral(bsmDecisionTypeEEnum, BsmDecisionType.PERIODIC);
		addEEnumLiteral(bsmDecisionTypeEEnum, BsmDecisionType.EVENT_BASED);

		// Create resource
		createResource(eNS_URI);
	}

} //BsmPackageImpl
