/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;

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
	private EClass ggFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggDecisionFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggInformationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggDecisionCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggTimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggInformationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggExternalInformationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggInternalInformationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggInformationCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggCollaborativeDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ggTimeUnitsEEnum = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#eNS_URI
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
		org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theCoreElementsPackage.createPackageContents();
		theBsmPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theGeneralElementsPackage.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();
		theRootPackage_1.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theCoreElementsPackage.initializePackageContents();
		theBsmPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theGeneralElementsPackage.initializePackageContents();
		theCoreElementsPackage_1.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();

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
	public EClass getGgFunction() {
		return ggFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFunction_GraiGrid() {
		return (EReference)ggFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFunction_DecisionCenters() {
		return (EReference)ggFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFunction_Organization() {
		return (EReference)ggFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgLevel() {
		return ggLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgLevel_Nodes() {
		return (EReference)ggLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgLevel_Horizon() {
		return (EReference)ggLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgLevel_Period() {
		return (EReference)ggLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgLevel_ProcessingUnit() {
		return (EReference)ggLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgLevel_GraiGrid() {
		return (EReference)ggLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgFlow() {
		return ggFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFlow_Source() {
		return (EReference)ggFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFlow_Target() {
		return (EReference)ggFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgFlow_GraiGrid() {
		return (EReference)ggFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgNode() {
		return ggNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgNode_Level() {
		return (EReference)ggNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgNode_OutFlows() {
		return (EReference)ggNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgNode_InFlows() {
		return (EReference)ggNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgNode_GraiGrid() {
		return (EReference)ggNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgDecisionFrame() {
		return ggDecisionFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgDecisionFrame_DecisionVariable() {
		return (EAttribute)ggDecisionFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgDecisionFrame_Objective() {
		return (EAttribute)ggDecisionFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgDecisionFrame_Constraint() {
		return (EAttribute)ggDecisionFrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgDecisionFrame_Criteria() {
		return (EAttribute)ggDecisionFrameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgInformationFlow() {
		return ggInformationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgDecisionCenter() {
		return ggDecisionCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgDecisionCenter_Function() {
		return (EReference)ggDecisionCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgTimeValue() {
		return ggTimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgTimeValue_Unit() {
		return (EAttribute)ggTimeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGgTimeValue_Value() {
		return (EAttribute)ggTimeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgInformationSource() {
		return ggInformationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgInformationSource_InformationCenters() {
		return (EReference)ggInformationSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgInformationSource_GraiGrid() {
		return (EReference)ggInformationSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgExternalInformationSource() {
		return ggExternalInformationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgInternalInformationSource() {
		return ggInternalInformationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgInformationCenter() {
		return ggInformationCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGgInformationCenter_InformationSource() {
		return (EReference)ggInformationCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGgCollaborativeDecision() {
		return ggCollaborativeDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGgTimeUnits() {
		return ggTimeUnitsEEnum;
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
		ggFunctionEClass = createEClass(GG_FUNCTION);
		createEReference(ggFunctionEClass, GG_FUNCTION__GRAI_GRID);
		createEReference(ggFunctionEClass, GG_FUNCTION__DECISION_CENTERS);
		createEReference(ggFunctionEClass, GG_FUNCTION__ORGANIZATION);

		ggLevelEClass = createEClass(GG_LEVEL);
		createEReference(ggLevelEClass, GG_LEVEL__NODES);
		createEReference(ggLevelEClass, GG_LEVEL__HORIZON);
		createEReference(ggLevelEClass, GG_LEVEL__PERIOD);
		createEReference(ggLevelEClass, GG_LEVEL__PROCESSING_UNIT);
		createEReference(ggLevelEClass, GG_LEVEL__GRAI_GRID);

		ggFlowEClass = createEClass(GG_FLOW);
		createEReference(ggFlowEClass, GG_FLOW__SOURCE);
		createEReference(ggFlowEClass, GG_FLOW__TARGET);
		createEReference(ggFlowEClass, GG_FLOW__GRAI_GRID);

		ggNodeEClass = createEClass(GG_NODE);
		createEReference(ggNodeEClass, GG_NODE__LEVEL);
		createEReference(ggNodeEClass, GG_NODE__OUT_FLOWS);
		createEReference(ggNodeEClass, GG_NODE__IN_FLOWS);
		createEReference(ggNodeEClass, GG_NODE__GRAI_GRID);

		ggDecisionFrameEClass = createEClass(GG_DECISION_FRAME);
		createEAttribute(ggDecisionFrameEClass, GG_DECISION_FRAME__DECISION_VARIABLE);
		createEAttribute(ggDecisionFrameEClass, GG_DECISION_FRAME__OBJECTIVE);
		createEAttribute(ggDecisionFrameEClass, GG_DECISION_FRAME__CONSTRAINT);
		createEAttribute(ggDecisionFrameEClass, GG_DECISION_FRAME__CRITERIA);

		ggInformationFlowEClass = createEClass(GG_INFORMATION_FLOW);

		ggCollaborativeDecisionEClass = createEClass(GG_COLLABORATIVE_DECISION);

		ggDecisionCenterEClass = createEClass(GG_DECISION_CENTER);
		createEReference(ggDecisionCenterEClass, GG_DECISION_CENTER__FUNCTION);

		ggTimeValueEClass = createEClass(GG_TIME_VALUE);
		createEAttribute(ggTimeValueEClass, GG_TIME_VALUE__UNIT);
		createEAttribute(ggTimeValueEClass, GG_TIME_VALUE__VALUE);

		ggInformationSourceEClass = createEClass(GG_INFORMATION_SOURCE);
		createEReference(ggInformationSourceEClass, GG_INFORMATION_SOURCE__INFORMATION_CENTERS);
		createEReference(ggInformationSourceEClass, GG_INFORMATION_SOURCE__GRAI_GRID);

		ggExternalInformationSourceEClass = createEClass(GG_EXTERNAL_INFORMATION_SOURCE);

		ggInternalInformationSourceEClass = createEClass(GG_INTERNAL_INFORMATION_SOURCE);

		ggInformationCenterEClass = createEClass(GG_INFORMATION_CENTER);
		createEReference(ggInformationCenterEClass, GG_INFORMATION_CENTER__INFORMATION_SOURCE);

		// Create enums
		ggTimeUnitsEEnum = createEEnum(GG_TIME_UNITS);
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
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage)EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ggFunctionEClass.getESuperTypes().add(theGeneralElementsPackage_1.getGgBaseElement());
		ggLevelEClass.getESuperTypes().add(theGeneralElementsPackage_1.getGgBaseElement());
		ggFlowEClass.getESuperTypes().add(theGeneralElementsPackage_1.getGgBaseElement());
		ggNodeEClass.getESuperTypes().add(theGeneralElementsPackage_1.getGgBaseElement());
		ggDecisionFrameEClass.getESuperTypes().add(this.getGgFlow());
		ggInformationFlowEClass.getESuperTypes().add(this.getGgFlow());
		ggCollaborativeDecisionEClass.getESuperTypes().add(this.getGgFlow());
		ggDecisionCenterEClass.getESuperTypes().add(this.getGgNode());
		ggInformationSourceEClass.getESuperTypes().add(theGeneralElementsPackage_1.getGgBaseElement());
		ggExternalInformationSourceEClass.getESuperTypes().add(this.getGgInformationSource());
		ggInternalInformationSourceEClass.getESuperTypes().add(this.getGgInformationSource());
		ggInformationCenterEClass.getESuperTypes().add(this.getGgNode());

		// Initialize classes and features; add operations and parameters
		initEClass(ggFunctionEClass, GgFunction.class, "GgFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgFunction_GraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid_Functions(), "graiGrid", null, 0, 1, GgFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgFunction_DecisionCenters(), this.getGgDecisionCenter(), this.getGgDecisionCenter_Function(), "decisionCenters", null, 0, -1, GgFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgFunction_Organization(), theGeneralElementsPackage_1.getGgOrganization(), theGeneralElementsPackage_1.getGgOrganization_Functions(), "organization", null, 0, 1, GgFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggFunctionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggLevelEClass, GgLevel.class, "GgLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgLevel_Nodes(), this.getGgNode(), this.getGgNode_Level(), "nodes", null, 0, -1, GgLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgLevel_Horizon(), this.getGgTimeValue(), null, "horizon", null, 1, 1, GgLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgLevel_Period(), this.getGgTimeValue(), null, "period", null, 1, 1, GgLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgLevel_ProcessingUnit(), this.getGgTimeValue(), null, "processingUnit", null, 1, 1, GgLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgLevel_GraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid_Levels(), "graiGrid", null, 0, 1, GgLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggLevelEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggFlowEClass, GgFlow.class, "GgFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgFlow_Source(), this.getGgNode(), this.getGgNode_InFlows(), "source", null, 1, 1, GgFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgFlow_Target(), this.getGgNode(), this.getGgNode_OutFlows(), "target", null, 1, 1, GgFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgFlow_GraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid_Flows(), "graiGrid", null, 0, 1, GgFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ggNodeEClass, GgNode.class, "GgNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgNode_Level(), this.getGgLevel(), this.getGgLevel_Nodes(), "level", null, 1, 1, GgNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgNode_OutFlows(), this.getGgFlow(), this.getGgFlow_Target(), "outFlows", null, 0, -1, GgNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgNode_InFlows(), this.getGgFlow(), this.getGgFlow_Source(), "inFlows", null, 0, -1, GgNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgNode_GraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid_Nodes(), "graiGrid", null, 0, 1, GgNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ggDecisionFrameEClass, GgDecisionFrame.class, "GgDecisionFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGgDecisionFrame_DecisionVariable(), ecorePackage.getEString(), "decisionVariable", null, 0, 1, GgDecisionFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgDecisionFrame_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, GgDecisionFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgDecisionFrame_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, GgDecisionFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgDecisionFrame_Criteria(), ecorePackage.getEString(), "criteria", null, 0, 1, GgDecisionFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggDecisionFrameEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggInformationFlowEClass, GgInformationFlow.class, "GgInformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ggInformationFlowEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggCollaborativeDecisionEClass, GgCollaborativeDecision.class, "GgCollaborativeDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ggCollaborativeDecisionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggDecisionCenterEClass, GgDecisionCenter.class, "GgDecisionCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgDecisionCenter_Function(), this.getGgFunction(), this.getGgFunction_DecisionCenters(), "function", null, 1, 1, GgDecisionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggDecisionCenterEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggTimeValueEClass, GgTimeValue.class, "GgTimeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGgTimeValue_Unit(), this.getGgTimeUnits(), "unit", null, 0, 1, GgTimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGgTimeValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, GgTimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggTimeValueEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggInformationSourceEClass, GgInformationSource.class, "GgInformationSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgInformationSource_InformationCenters(), this.getGgInformationCenter(), this.getGgInformationCenter_InformationSource(), "informationCenters", null, 0, -1, GgInformationSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGgInformationSource_GraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid(), theGeneralElementsPackage_1.getGgGraiGrid_InformationSources(), "graiGrid", null, 1, 1, GgInformationSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggInformationSourceEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ggExternalInformationSourceEClass, GgExternalInformationSource.class, "GgExternalInformationSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ggInternalInformationSourceEClass, GgInternalInformationSource.class, "GgInternalInformationSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ggInformationCenterEClass, GgInformationCenter.class, "GgInformationCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGgInformationCenter_InformationSource(), this.getGgInformationSource(), this.getGgInformationSource_InformationCenters(), "informationSource", null, 1, 1, GgInformationCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ggInformationCenterEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ggTimeUnitsEEnum, GgTimeUnits.class, "GgTimeUnits");
		addEEnumLiteral(ggTimeUnitsEEnum, GgTimeUnits.YEAR);
		addEEnumLiteral(ggTimeUnitsEEnum, GgTimeUnits.MONTH);
		addEEnumLiteral(ggTimeUnitsEEnum, GgTimeUnits.WEEK);
		addEEnumLiteral(ggTimeUnitsEEnum, GgTimeUnits.DAY);

		// Create resource
		createResource(eNS_URI);
	}

} //CoreElementsPackageImpl
