/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.*;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreElementsFactoryImpl extends EFactoryImpl implements CoreElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreElementsFactory init() {
		try {
			CoreElementsFactory theCoreElementsFactory = (CoreElementsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/lang/eaStar.ecore/coreElements"); 
			if (theCoreElementsFactory != null) {
				return theCoreElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoreElementsPackage.EA_IT_RESOURCE: return createEaITResource();
			case CoreElementsPackage.EA_HUMAN_RESOURCE: return createEaHumanResource();
			case CoreElementsPackage.EA_MATERIAL_RESOURCE: return createEaMaterialResource();
			case CoreElementsPackage.EA_OR: return createEaOr();
			case CoreElementsPackage.EA_AND: return createEaAnd();
			case CoreElementsPackage.EA_DIVERGING_AND: return createEaDivergingAnd();
			case CoreElementsPackage.EA_DIVERGING_OR: return createEaDivergingOr();
			case CoreElementsPackage.EA_CONVERGING_AND: return createEaConvergingAnd();
			case CoreElementsPackage.EA_CONVERGING_OR: return createEaConvergingOr();
			case CoreElementsPackage.EA_INTERNAL_CONNECTOR: return createEaInternalConnector();
			case CoreElementsPackage.EA_EXTERNAL_CONNECTOR: return createEaExternalConnector();
			case CoreElementsPackage.EA_PROCESS_CONNECTOR: return createEaProcessConnector();
			case CoreElementsPackage.EA_OUTPUT_INPUT_FLOW: return createEaOutputInputFlow();
			case CoreElementsPackage.EA_SUPPORT_FLOW: return createEaSupportFlow();
			case CoreElementsPackage.EA_CONTROL_FLOW: return createEaControlFlow();
			case CoreElementsPackage.EA_ORGANIZATION: return createEaOrganization();
			case CoreElementsPackage.EA_ATOMIC_EXTENDED_ACTIVITY: return createEaAtomicExtendedActivity();
			case CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY: return createEaStructuralExtendedActivity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoreElementsPackage.EA_RESOURCE_ROLE:
				return createEaResourceRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoreElementsPackage.EA_RESOURCE_ROLE:
				return convertEaResourceRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaITResource createEaITResource() {
		EaITResourceImpl eaITResource = new EaITResourceImpl();
		return eaITResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaHumanResource createEaHumanResource() {
		EaHumanResourceImpl eaHumanResource = new EaHumanResourceImpl();
		return eaHumanResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaMaterialResource createEaMaterialResource() {
		EaMaterialResourceImpl eaMaterialResource = new EaMaterialResourceImpl();
		return eaMaterialResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaOr createEaOr() {
		EaOrImpl eaOr = new EaOrImpl();
		return eaOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaAnd createEaAnd() {
		EaAndImpl eaAnd = new EaAndImpl();
		return eaAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaDivergingAnd createEaDivergingAnd() {
		EaDivergingAndImpl eaDivergingAnd = new EaDivergingAndImpl();
		return eaDivergingAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaDivergingOr createEaDivergingOr() {
		EaDivergingOrImpl eaDivergingOr = new EaDivergingOrImpl();
		return eaDivergingOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaConvergingAnd createEaConvergingAnd() {
		EaConvergingAndImpl eaConvergingAnd = new EaConvergingAndImpl();
		return eaConvergingAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaConvergingOr createEaConvergingOr() {
		EaConvergingOrImpl eaConvergingOr = new EaConvergingOrImpl();
		return eaConvergingOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaInternalConnector createEaInternalConnector() {
		EaInternalConnectorImpl eaInternalConnector = new EaInternalConnectorImpl();
		return eaInternalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaExternalConnector createEaExternalConnector() {
		EaExternalConnectorImpl eaExternalConnector = new EaExternalConnectorImpl();
		return eaExternalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcessConnector createEaProcessConnector() {
		EaProcessConnectorImpl eaProcessConnector = new EaProcessConnectorImpl();
		return eaProcessConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaOutputInputFlow createEaOutputInputFlow() {
		EaOutputInputFlowImpl eaOutputInputFlow = new EaOutputInputFlowImpl();
		return eaOutputInputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaSupportFlow createEaSupportFlow() {
		EaSupportFlowImpl eaSupportFlow = new EaSupportFlowImpl();
		return eaSupportFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaControlFlow createEaControlFlow() {
		EaControlFlowImpl eaControlFlow = new EaControlFlowImpl();
		return eaControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaOrganization createEaOrganization() {
		EaOrganizationImpl eaOrganization = new EaOrganizationImpl();
		return eaOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaAtomicExtendedActivity createEaAtomicExtendedActivity() {
		EaAtomicExtendedActivityImpl eaAtomicExtendedActivity = new EaAtomicExtendedActivityImpl();
		return eaAtomicExtendedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaStructuralExtendedActivity createEaStructuralExtendedActivity() {
		EaStructuralExtendedActivityImpl eaStructuralExtendedActivity = new EaStructuralExtendedActivityImpl();
		return eaStructuralExtendedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaResourceRole createEaResourceRoleFromString(EDataType eDataType, String initialValue) {
		EaResourceRole result = EaResourceRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEaResourceRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsPackage getCoreElementsPackage() {
		return (CoreElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoreElementsPackage getPackage() {
		return CoreElementsPackage.eINSTANCE;
	}

} //CoreElementsFactoryImpl
