/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.*;
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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseAssetClass;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmFactoryImpl extends EFactoryImpl implements BsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmFactory init() {
		try {
			BsmFactory theBsmFactory = (BsmFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/ssm/bsm.ecore"); 
			if (theBsmFactory != null) {
				return theBsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmFactoryImpl() {
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
			case BsmPackage.BSM_MODEL: return createBsmModel();
			case BsmPackage.BSM_SERVICE: return createBsmService();
			case BsmPackage.BSM_CUSTOMER: return createBsmCustomer();
			case BsmPackage.BSM_STAKEHOLDER: return createBsmStakeholder();
			case BsmPackage.BSM_PARTNER: return createBsmPartner();
			case BsmPackage.BSM_PRODUCT: return createBsmProduct();
			case BsmPackage.BSM_COMPONENT: return createBsmComponent();
			case BsmPackage.BSM_FUNCTIONALITY: return createBsmFunctionality();
			case BsmPackage.BSM_RESOURCE: return createBsmResource();
			case BsmPackage.BSM_PROCESS: return createBsmProcess();
			case BsmPackage.BSM_DECISION: return createBsmDecision();
			case BsmPackage.BSM_DECISION_STRUCTURE: return createBsmDecisionStructure();
			case BsmPackage.BSM_ENTERPRISE: return createBsmEnterprise();
			case BsmPackage.BSM_VIRTUAL_ENTERPRISE: return createBsmVirtualEnterprise();
			case BsmPackage.BSM_VE_PARTICIPATION: return createBsmVEParticipation();
			case BsmPackage.BSM_VALUE: return createBsmValue();
			case BsmPackage.BSM_PERFORMANCE_INDICATOR: return createBsmPerformanceIndicator();
			case BsmPackage.BSM_PI_FIELD: return createBsmPiField();
			case BsmPackage.BSM_DECISION_VARIABLE: return createBsmDecisionVariable();
			case BsmPackage.BSM_DECISION_OBJECTIVE: return createBsmDecisionObjective();
			case BsmPackage.BSM_MSE_SERVICE: return createBsmMseService();
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
			case BsmPackage.BSM_GENDER:
				return createBsmGenderFromString(eDataType, initialValue);
			case BsmPackage.BSM_RESOURCE_TYPE:
				return createBsmResourceTypeFromString(eDataType, initialValue);
			case BsmPackage.BSM_PI_TYPE:
				return createBsmPITypeFromString(eDataType, initialValue);
			case BsmPackage.BSM_DECISION_TYPE:
				return createBsmDecisionTypeFromString(eDataType, initialValue);
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
			case BsmPackage.BSM_GENDER:
				return convertBsmGenderToString(eDataType, instanceValue);
			case BsmPackage.BSM_RESOURCE_TYPE:
				return convertBsmResourceTypeToString(eDataType, instanceValue);
			case BsmPackage.BSM_PI_TYPE:
				return convertBsmPITypeToString(eDataType, instanceValue);
			case BsmPackage.BSM_DECISION_TYPE:
				return convertBsmDecisionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel createBsmModel() {
		BsmModelImpl bsmModel = new BsmModelImpl();
		return bsmModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService createBsmService() {
		BsmServiceImpl bsmService = new BsmServiceImpl();
		return bsmService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmCustomer createBsmCustomer() {
		BsmCustomerImpl bsmCustomer = new BsmCustomerImpl();
		return bsmCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmStakeholder createBsmStakeholder() {
		BsmStakeholderImpl bsmStakeholder = new BsmStakeholderImpl();
		return bsmStakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPartner createBsmPartner() {
		BsmPartnerImpl bsmPartner = new BsmPartnerImpl();
		return bsmPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProduct createBsmProduct() {
		BsmProductImpl bsmProduct = new BsmProductImpl();
		return bsmProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmComponent createBsmComponent() {
		BsmComponentImpl bsmComponent = new BsmComponentImpl();
		return bsmComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmFunctionality createBsmFunctionality() {
		BsmFunctionalityImpl bsmFunctionality = new BsmFunctionalityImpl();
		return bsmFunctionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmResource createBsmResource() {
		BsmResourceImpl bsmResource = new BsmResourceImpl();
		return bsmResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProcess createBsmProcess() {
		BsmProcessImpl bsmProcess = new BsmProcessImpl();
		return bsmProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecision createBsmDecision() {
		BsmDecisionImpl bsmDecision = new BsmDecisionImpl();
		return bsmDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionStructure createBsmDecisionStructure() {
		BsmDecisionStructureImpl bsmDecisionStructure = new BsmDecisionStructureImpl();
		return bsmDecisionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmEnterprise createBsmEnterprise() {
		BsmEnterpriseImpl bsmEnterprise = new BsmEnterpriseImpl();
		return bsmEnterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmVirtualEnterprise createBsmVirtualEnterprise() {
		BsmVirtualEnterpriseImpl bsmVirtualEnterprise = new BsmVirtualEnterpriseImpl();
		return bsmVirtualEnterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmVEParticipation createBsmVEParticipation() {
		BsmVEParticipationImpl bsmVEParticipation = new BsmVEParticipationImpl();
		return bsmVEParticipation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmValue createBsmValue() {
		BsmValueImpl bsmValue = new BsmValueImpl();
		return bsmValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPerformanceIndicator createBsmPerformanceIndicator() {
		BsmPerformanceIndicatorImpl bsmPerformanceIndicator = new BsmPerformanceIndicatorImpl();
		return bsmPerformanceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPiField createBsmPiField() {
		BsmPiFieldImpl bsmPiField = new BsmPiFieldImpl();
		return bsmPiField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionVariable createBsmDecisionVariable() {
		BsmDecisionVariableImpl bsmDecisionVariable = new BsmDecisionVariableImpl();
		return bsmDecisionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionObjective createBsmDecisionObjective() {
		BsmDecisionObjectiveImpl bsmDecisionObjective = new BsmDecisionObjectiveImpl();
		return bsmDecisionObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmMseService createBsmMseService() {
		BsmMseServiceImpl bsmMseService = new BsmMseServiceImpl();
		return bsmMseService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmGender createBsmGenderFromString(EDataType eDataType, String initialValue) {
		BsmGender result = BsmGender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBsmGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmResourceType createBsmResourceTypeFromString(EDataType eDataType, String initialValue) {
		BsmResourceType result = BsmResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBsmResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPIType createBsmPITypeFromString(EDataType eDataType, String initialValue) {
		BsmPIType result = BsmPIType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBsmPITypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmDecisionType createBsmDecisionTypeFromString(EDataType eDataType, String initialValue) {
		BsmDecisionType result = BsmDecisionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBsmDecisionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmPackage getBsmPackage() {
		return (BsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BsmPackage getPackage() {
		return BsmPackage.eINSTANCE;
	}

} //BsmFactoryImpl
