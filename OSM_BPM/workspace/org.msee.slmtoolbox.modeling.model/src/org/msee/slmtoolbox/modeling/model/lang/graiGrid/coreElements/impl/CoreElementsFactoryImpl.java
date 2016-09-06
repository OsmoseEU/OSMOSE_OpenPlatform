/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.*;

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
			CoreElementsFactory theCoreElementsFactory = (CoreElementsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/lang/graiGrid.ecore/2.0/coreElements"); 
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
			case CoreElementsPackage.GG_FUNCTION: return createGgFunction();
			case CoreElementsPackage.GG_LEVEL: return createGgLevel();
			case CoreElementsPackage.GG_DECISION_FRAME: return createGgDecisionFrame();
			case CoreElementsPackage.GG_INFORMATION_FLOW: return createGgInformationFlow();
			case CoreElementsPackage.GG_COLLABORATIVE_DECISION: return createGgCollaborativeDecision();
			case CoreElementsPackage.GG_DECISION_CENTER: return createGgDecisionCenter();
			case CoreElementsPackage.GG_TIME_VALUE: return createGgTimeValue();
			case CoreElementsPackage.GG_EXTERNAL_INFORMATION_SOURCE: return createGgExternalInformationSource();
			case CoreElementsPackage.GG_INTERNAL_INFORMATION_SOURCE: return createGgInternalInformationSource();
			case CoreElementsPackage.GG_INFORMATION_CENTER: return createGgInformationCenter();
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
			case CoreElementsPackage.GG_TIME_UNITS:
				return createGgTimeUnitsFromString(eDataType, initialValue);
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
			case CoreElementsPackage.GG_TIME_UNITS:
				return convertGgTimeUnitsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgFunction createGgFunction() {
		GgFunctionImpl ggFunction = new GgFunctionImpl();
		return ggFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgLevel createGgLevel() {
		GgLevelImpl ggLevel = new GgLevelImpl();
		return ggLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgDecisionFrame createGgDecisionFrame() {
		GgDecisionFrameImpl ggDecisionFrame = new GgDecisionFrameImpl();
		return ggDecisionFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgInformationFlow createGgInformationFlow() {
		GgInformationFlowImpl ggInformationFlow = new GgInformationFlowImpl();
		return ggInformationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgDecisionCenter createGgDecisionCenter() {
		GgDecisionCenterImpl ggDecisionCenter = new GgDecisionCenterImpl();
		return ggDecisionCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeValue createGgTimeValue() {
		GgTimeValueImpl ggTimeValue = new GgTimeValueImpl();
		return ggTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgExternalInformationSource createGgExternalInformationSource() {
		GgExternalInformationSourceImpl ggExternalInformationSource = new GgExternalInformationSourceImpl();
		return ggExternalInformationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgInternalInformationSource createGgInternalInformationSource() {
		GgInternalInformationSourceImpl ggInternalInformationSource = new GgInternalInformationSourceImpl();
		return ggInternalInformationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgInformationCenter createGgInformationCenter() {
		GgInformationCenterImpl ggInformationCenter = new GgInformationCenterImpl();
		return ggInformationCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgCollaborativeDecision createGgCollaborativeDecision() {
		GgCollaborativeDecisionImpl ggCollaborativeDecision = new GgCollaborativeDecisionImpl();
		return ggCollaborativeDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgTimeUnits createGgTimeUnitsFromString(EDataType eDataType, String initialValue) {
		GgTimeUnits result = GgTimeUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGgTimeUnitsToString(EDataType eDataType, Object instanceValue) {
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
