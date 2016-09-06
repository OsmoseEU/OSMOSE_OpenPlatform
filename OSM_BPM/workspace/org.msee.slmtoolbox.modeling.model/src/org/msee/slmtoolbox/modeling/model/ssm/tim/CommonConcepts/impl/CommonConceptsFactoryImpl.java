/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonConceptsFactoryImpl extends EFactoryImpl implements CommonConceptsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonConceptsFactory init() {
		try {
			CommonConceptsFactory theCommonConceptsFactory = (CommonConceptsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/CommonConcepts"); 
			if (theCommonConceptsFactory != null) {
				return theCommonConceptsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonConceptsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonConceptsFactoryImpl() {
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
			case CommonConceptsPackage.TIM_SERVICE: return createTimService();
			case CommonConceptsPackage.TIM_PROCESS: return createTimProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimService createTimService() {
		TimServiceImpl timService = new TimServiceImpl();
		return timService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimProcess createTimProcess() {
		TimProcessImpl timProcess = new TimProcessImpl();
		return timProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonConceptsPackage getCommonConceptsPackage() {
		return (CommonConceptsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonConceptsPackage getPackage() {
		return CommonConceptsPackage.eINSTANCE;
	}

} //CommonConceptsFactoryImpl
