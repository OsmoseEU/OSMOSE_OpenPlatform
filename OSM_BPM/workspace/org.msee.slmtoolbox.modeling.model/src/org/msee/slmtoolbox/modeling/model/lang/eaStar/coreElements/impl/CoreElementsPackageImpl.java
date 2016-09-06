/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreElementsPackageImpl extends EPackageImpl implements CoreElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaFlowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaLogicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaExtendedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaITResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaHumanResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaMaterialResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDivergingAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDivergingOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConvergingAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConvergingOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaInternalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaExternalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaProcessConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaOutputInputFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaSupportFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaControlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaAtomicExtendedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaStructuralExtendedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eaResourceRoleEEnum = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoreElementsPackageImpl() {
		super(eNS_URI, CoreElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoreElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoreElementsPackage init() {
		if (isInited) return (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);

		// Obtain or create and register package
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoreElementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BsmPackageImpl theBsmPackage = (BsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) instanceof BsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) : BsmPackage.eINSTANCE);
		RootPackageImpl theRootPackage = (RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) instanceof RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI) : RootPackage.eINSTANCE);
		GeneralElementsPackageImpl theGeneralElementsPackage = (GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) instanceof GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) : GeneralElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theCoreElementsPackage.createPackageContents();
		theBsmPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theGeneralElementsPackage.createPackageContents();
		theRootPackage_1.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theCoreElementsPackage.initializePackageContents();
		theBsmPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theGeneralElementsPackage.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();
		theCoreElementsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoreElementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoreElementsPackage.eNS_URI, theCoreElementsPackage);
		return theCoreElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaFlow() {
		return eaFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaFlow_IsTrigger() {
		return (EAttribute)eaFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaFlow_TriggerInfo() {
		return (EAttribute)eaFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlow_Source() {
		return (EReference)eaFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlow_Target() {
		return (EReference)eaFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaFlowNode() {
		return eaFlowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlowNode_Organization() {
		return (EReference)eaFlowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlowNode_InFlows() {
		return (EReference)eaFlowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaFlowNode_OutFlows() {
		return (EReference)eaFlowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaLogicalOperator() {
		return eaLogicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaConnector() {
		return eaConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaExtendedActivity() {
		return eaExtendedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_Mission() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_FunctionalRules() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_MinCost() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_MaxCost() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_AverageCost() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_MinTimeDelay() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_MaxTimeDelay() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_AverageTimeDelay() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_IsStarting() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_IsEnding() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_DecompositionCode() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(10);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaExtendedActivity_OsmoseWorld() {
		return (EAttribute)eaExtendedActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaResource() {
		return eaResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaResource_UnitaryCost() {
		return (EAttribute)eaResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaResource_Location() {
		return (EAttribute)eaResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaResource_Capabilities() {
		return (EAttribute)eaResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaITResource() {
		return eaITResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaHumanResource() {
		return eaHumanResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaMaterialResource() {
		return eaMaterialResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaOr() {
		return eaOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaAnd() {
		return eaAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaDivergingAnd() {
		return eaDivergingAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaDivergingOr() {
		return eaDivergingOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaConvergingAnd() {
		return eaConvergingAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaConvergingOr() {
		return eaConvergingOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaInternalConnector() {
		return eaInternalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaExternalConnector() {
		return eaExternalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaProcessConnector() {
		return eaProcessConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaProcessConnector_ProcessRef() {
		return (EReference)eaProcessConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaOutputInputFlow() {
		return eaOutputInputFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaSupportFlow() {
		return eaSupportFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaSupportFlow_ResourceRole() {
		return (EAttribute)eaSupportFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEaSupportFlow_Responsibility() {
		return (EAttribute)eaSupportFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaControlFlow() {
		return eaControlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaOrganization() {
		return eaOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaOrganization_FlowNode() {
		return (EReference)eaOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaOrganization_Model() {
		return (EReference)eaOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaAtomicExtendedActivity() {
		return eaAtomicExtendedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaStructuralExtendedActivity() {
		return eaStructuralExtendedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaStructuralExtendedActivity_IsA() {
		return (EReference)eaStructuralExtendedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEaResourceRole() {
		return eaResourceRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsFactory getCoreElementsFactory() {
		return (CoreElementsFactory)getEFactoryInstance();
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
		eaFlowEClass = createEClass(EA_FLOW);
		createEAttribute(eaFlowEClass, EA_FLOW__IS_TRIGGER);
		createEAttribute(eaFlowEClass, EA_FLOW__TRIGGER_INFO);
		createEReference(eaFlowEClass, EA_FLOW__SOURCE);
		createEReference(eaFlowEClass, EA_FLOW__TARGET);

		eaFlowNodeEClass = createEClass(EA_FLOW_NODE);
		createEReference(eaFlowNodeEClass, EA_FLOW_NODE__ORGANIZATION);
		createEReference(eaFlowNodeEClass, EA_FLOW_NODE__IN_FLOWS);
		createEReference(eaFlowNodeEClass, EA_FLOW_NODE__OUT_FLOWS);

		eaLogicalOperatorEClass = createEClass(EA_LOGICAL_OPERATOR);

		eaConnectorEClass = createEClass(EA_CONNECTOR);

		eaExtendedActivityEClass = createEClass(EA_EXTENDED_ACTIVITY);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__MISSION);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__MIN_COST);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__MAX_COST);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__AVERAGE_COST);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__IS_STARTING);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__IS_ENDING);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE);
		createEAttribute(eaExtendedActivityEClass, EA_EXTENDED_ACTIVITY__OSMOSE_WORLD);

		eaResourceEClass = createEClass(EA_RESOURCE);
		createEAttribute(eaResourceEClass, EA_RESOURCE__UNITARY_COST);
		createEAttribute(eaResourceEClass, EA_RESOURCE__LOCATION);
		createEAttribute(eaResourceEClass, EA_RESOURCE__CAPABILITIES);

		eaITResourceEClass = createEClass(EA_IT_RESOURCE);

		eaHumanResourceEClass = createEClass(EA_HUMAN_RESOURCE);

		eaMaterialResourceEClass = createEClass(EA_MATERIAL_RESOURCE);

		eaOrEClass = createEClass(EA_OR);

		eaAndEClass = createEClass(EA_AND);

		eaDivergingAndEClass = createEClass(EA_DIVERGING_AND);

		eaDivergingOrEClass = createEClass(EA_DIVERGING_OR);

		eaConvergingAndEClass = createEClass(EA_CONVERGING_AND);

		eaConvergingOrEClass = createEClass(EA_CONVERGING_OR);

		eaInternalConnectorEClass = createEClass(EA_INTERNAL_CONNECTOR);

		eaExternalConnectorEClass = createEClass(EA_EXTERNAL_CONNECTOR);

		eaProcessConnectorEClass = createEClass(EA_PROCESS_CONNECTOR);
		createEReference(eaProcessConnectorEClass, EA_PROCESS_CONNECTOR__PROCESS_REF);

		eaOutputInputFlowEClass = createEClass(EA_OUTPUT_INPUT_FLOW);

		eaSupportFlowEClass = createEClass(EA_SUPPORT_FLOW);
		createEAttribute(eaSupportFlowEClass, EA_SUPPORT_FLOW__RESOURCE_ROLE);
		createEAttribute(eaSupportFlowEClass, EA_SUPPORT_FLOW__RESPONSIBILITY);

		eaControlFlowEClass = createEClass(EA_CONTROL_FLOW);

		eaOrganizationEClass = createEClass(EA_ORGANIZATION);
		createEReference(eaOrganizationEClass, EA_ORGANIZATION__FLOW_NODE);
		createEReference(eaOrganizationEClass, EA_ORGANIZATION__MODEL);

		eaAtomicExtendedActivityEClass = createEClass(EA_ATOMIC_EXTENDED_ACTIVITY);

		eaStructuralExtendedActivityEClass = createEClass(EA_STRUCTURAL_EXTENDED_ACTIVITY);
		createEReference(eaStructuralExtendedActivityEClass, EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A);

		// Create enums
		eaResourceRoleEEnum = createEEnum(EA_RESOURCE_ROLE);
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
		GeneralElementsPackage theGeneralElementsPackage = (GeneralElementsPackage)EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI);
		RootPackage theRootPackage = (RootPackage)EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaFlowEClass.getESuperTypes().add(theGeneralElementsPackage.getEaFlowElement());
		eaFlowNodeEClass.getESuperTypes().add(theGeneralElementsPackage.getEaFlowElement());
		eaLogicalOperatorEClass.getESuperTypes().add(this.getEaFlowNode());
		eaConnectorEClass.getESuperTypes().add(this.getEaFlowNode());
		eaExtendedActivityEClass.getESuperTypes().add(this.getEaFlowNode());
		eaResourceEClass.getESuperTypes().add(this.getEaFlowNode());
		eaITResourceEClass.getESuperTypes().add(this.getEaResource());
		eaHumanResourceEClass.getESuperTypes().add(this.getEaResource());
		eaMaterialResourceEClass.getESuperTypes().add(this.getEaResource());
		eaOrEClass.getESuperTypes().add(this.getEaLogicalOperator());
		eaAndEClass.getESuperTypes().add(this.getEaLogicalOperator());
		eaDivergingAndEClass.getESuperTypes().add(this.getEaAnd());
		eaDivergingOrEClass.getESuperTypes().add(this.getEaOr());
		eaConvergingAndEClass.getESuperTypes().add(this.getEaAnd());
		eaConvergingOrEClass.getESuperTypes().add(this.getEaOr());
		eaInternalConnectorEClass.getESuperTypes().add(this.getEaConnector());
		eaExternalConnectorEClass.getESuperTypes().add(this.getEaConnector());
		eaProcessConnectorEClass.getESuperTypes().add(this.getEaConnector());
		eaOutputInputFlowEClass.getESuperTypes().add(this.getEaFlow());
		eaSupportFlowEClass.getESuperTypes().add(this.getEaFlow());
		eaControlFlowEClass.getESuperTypes().add(this.getEaFlow());
		eaOrganizationEClass.getESuperTypes().add(theGeneralElementsPackage.getEaBaseElement());
		eaAtomicExtendedActivityEClass.getESuperTypes().add(this.getEaExtendedActivity());
		eaStructuralExtendedActivityEClass.getESuperTypes().add(this.getEaExtendedActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(eaFlowEClass, EaFlow.class, "EaFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEaFlow_IsTrigger(), ecorePackage.getEBoolean(), "isTrigger", null, 0, 1, EaFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaFlow_TriggerInfo(), ecorePackage.getEString(), "triggerInfo", null, 0, 1, EaFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaFlow_Source(), this.getEaFlowNode(), this.getEaFlowNode_OutFlows(), "source", null, 1, 1, EaFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaFlow_Target(), this.getEaFlowNode(), this.getEaFlowNode_InFlows(), "target", null, 1, 1, EaFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaFlowNodeEClass, EaFlowNode.class, "EaFlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaFlowNode_Organization(), this.getEaOrganization(), this.getEaOrganization_FlowNode(), "organization", null, 0, 1, EaFlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaFlowNode_InFlows(), this.getEaFlow(), this.getEaFlow_Target(), "inFlows", null, 0, -1, EaFlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaFlowNode_OutFlows(), this.getEaFlow(), this.getEaFlow_Source(), "outFlows", null, 0, -1, EaFlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaLogicalOperatorEClass, EaLogicalOperator.class, "EaLogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaConnectorEClass, EaConnector.class, "EaConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaExtendedActivityEClass, EaExtendedActivity.class, "EaExtendedActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEaExtendedActivity_Mission(), ecorePackage.getEString(), "mission", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_FunctionalRules(), ecorePackage.getEString(), "functionalRules", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_MinCost(), ecorePackage.getEDouble(), "minCost", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_MaxCost(), ecorePackage.getEDouble(), "maxCost", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_AverageCost(), ecorePackage.getEDouble(), "averageCost", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_MinTimeDelay(), ecorePackage.getEDouble(), "minTimeDelay", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_MaxTimeDelay(), ecorePackage.getEDouble(), "maxTimeDelay", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_AverageTimeDelay(), ecorePackage.getEDouble(), "averageTimeDelay", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_IsStarting(), ecorePackage.getEBoolean(), "isStarting", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_IsEnding(), ecorePackage.getEBoolean(), "isEnding", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_DecompositionCode(), ecorePackage.getEString(), "decompositionCode", null, 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaExtendedActivity_OsmoseWorld(), ecorePackage.getEString(), "osmoseWorld", "UNDEFINED", 0, 1, EaExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eaExtendedActivityEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaResourceEClass, EaResource.class, "EaResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEaResource_UnitaryCost(), ecorePackage.getEDouble(), "unitaryCost", null, 0, 1, EaResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaResource_Location(), ecorePackage.getEString(), "location", null, 0, 1, EaResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaResource_Capabilities(), ecorePackage.getEString(), "capabilities", null, 0, 1, EaResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaITResourceEClass, EaITResource.class, "EaITResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaITResourceEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaHumanResourceEClass, EaHumanResource.class, "EaHumanResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaHumanResourceEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaMaterialResourceEClass, EaMaterialResource.class, "EaMaterialResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaMaterialResourceEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaOrEClass, EaOr.class, "EaOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaOrEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaAndEClass, EaAnd.class, "EaAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaAndEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaDivergingAndEClass, EaDivergingAnd.class, "EaDivergingAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaDivergingOrEClass, EaDivergingOr.class, "EaDivergingOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaConvergingAndEClass, EaConvergingAnd.class, "EaConvergingAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaConvergingOrEClass, EaConvergingOr.class, "EaConvergingOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaInternalConnectorEClass, EaInternalConnector.class, "EaInternalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaInternalConnectorEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaExternalConnectorEClass, EaExternalConnector.class, "EaExternalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaExternalConnectorEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaProcessConnectorEClass, EaProcessConnector.class, "EaProcessConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaProcessConnector_ProcessRef(), theGeneralElementsPackage.getEaProcess(), null, "processRef", null, 1, 1, EaProcessConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eaProcessConnectorEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaOutputInputFlowEClass, EaOutputInputFlow.class, "EaOutputInputFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaOutputInputFlowEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaSupportFlowEClass, EaSupportFlow.class, "EaSupportFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEaSupportFlow_ResourceRole(), this.getEaResourceRole(), "resourceRole", null, 0, 1, EaSupportFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEaSupportFlow_Responsibility(), ecorePackage.getEString(), "responsibility", null, 0, 1, EaSupportFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eaSupportFlowEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaControlFlowEClass, EaControlFlow.class, "EaControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eaControlFlowEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaOrganizationEClass, EaOrganization.class, "EaOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaOrganization_FlowNode(), this.getEaFlowNode(), this.getEaFlowNode_Organization(), "flowNode", null, 0, -1, EaOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaOrganization_Model(), theRootPackage.getEaModel(), theRootPackage.getEaModel_Organizations(), "model", null, 1, 1, EaOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaAtomicExtendedActivityEClass, EaAtomicExtendedActivity.class, "EaAtomicExtendedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaStructuralExtendedActivityEClass, EaStructuralExtendedActivity.class, "EaStructuralExtendedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaStructuralExtendedActivity_IsA(), theGeneralElementsPackage.getEaProcess(), theGeneralElementsPackage.getEaProcess_CanBe(), "isA", null, 0, 1, EaStructuralExtendedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eaResourceRoleEEnum, EaResourceRole.class, "EaResourceRole");
		addEEnumLiteral(eaResourceRoleEEnum, EaResourceRole.RESPONSIBLE_FOR);
		addEEnumLiteral(eaResourceRoleEEnum, EaResourceRole.PARTICIPATES_IN);

		// Create resource
		createResource(eNS_URI);
	}

} //CoreElementsPackageImpl
