/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralElementsFactoryImpl extends EFactoryImpl implements GeneralElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneralElementsFactory init() {
		try {
			GeneralElementsFactory theGeneralElementsFactory = (GeneralElementsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/lang/eaStar.ecore/generalElements"); 
			if (theGeneralElementsFactory != null) {
				return theGeneralElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneralElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralElementsFactoryImpl() {
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
			case GeneralElementsPackage.EA_PROCESS: return createEaProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess createEaProcess() {
		EaProcessImpl eaProcess = new EaProcessImpl();
		return eaProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralElementsPackage getGeneralElementsPackage() {
		return (GeneralElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneralElementsPackage getPackage() {
		return GeneralElementsPackage.eINSTANCE;
	}

} //GeneralElementsFactoryImpl
