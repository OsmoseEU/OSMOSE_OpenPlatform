/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.GeneralElementsPackageImpl;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootPackageImpl extends EPackageImpl implements RootPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaModelEClass = null;

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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RootPackageImpl() {
		super(eNS_URI, RootFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RootPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RootPackage init() {
		if (isInited) return (RootPackage)EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);

		// Obtain or create and register package
		RootPackageImpl theRootPackage = (RootPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RootPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RootPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BsmPackageImpl theBsmPackage = (BsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) instanceof BsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BsmPackage.eNS_URI) : BsmPackage.eINSTANCE);
		GeneralElementsPackageImpl theGeneralElementsPackage = (GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) instanceof GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneralElementsPackage.eNS_URI) : GeneralElementsPackage.eINSTANCE);
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl theRootPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.impl.RootPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl theGeneralElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl theCoreElementsPackage_1 = (org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) instanceof org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eNS_URI) : org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRootPackage.createPackageContents();
		theBsmPackage.createPackageContents();
		theGeneralElementsPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theRootPackage_1.createPackageContents();
		theGeneralElementsPackage_1.createPackageContents();
		theCoreElementsPackage_1.createPackageContents();

		// Initialize created meta-data
		theRootPackage.initializePackageContents();
		theBsmPackage.initializePackageContents();
		theGeneralElementsPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theRootPackage_1.initializePackageContents();
		theGeneralElementsPackage_1.initializePackageContents();
		theCoreElementsPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRootPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RootPackage.eNS_URI, theRootPackage);
		return theRootPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEaModel() {
		return eaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaModel_Process() {
		return (EReference)eaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEaModel_Organizations() {
		return (EReference)eaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootFactory getRootFactory() {
		return (RootFactory)getEFactoryInstance();
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
		eaModelEClass = createEClass(EA_MODEL);
		createEReference(eaModelEClass, EA_MODEL__PROCESS);
		createEReference(eaModelEClass, EA_MODEL__ORGANIZATIONS);
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
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaModelEClass.getESuperTypes().add(theGeneralElementsPackage.getEaBaseElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eaModelEClass, EaModel.class, "EaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEaModel_Process(), theGeneralElementsPackage.getEaProcess(), theGeneralElementsPackage.getEaProcess_Model(), "process", null, 1, 1, EaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEaModel_Organizations(), theCoreElementsPackage.getEaOrganization(), theCoreElementsPackage.getEaOrganization_Model(), "organizations", null, 0, -1, EaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RootPackageImpl
