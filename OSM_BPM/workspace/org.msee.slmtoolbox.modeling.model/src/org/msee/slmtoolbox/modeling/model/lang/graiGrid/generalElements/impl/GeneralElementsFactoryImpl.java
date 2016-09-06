/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.*;

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
			GeneralElementsFactory theGeneralElementsFactory = (GeneralElementsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/lang/graiGrid.ecore/2.0/generalElements"); 
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
			case GeneralElementsPackage.GG_GRAI_GRID: return createGgGraiGrid();
			case GeneralElementsPackage.GG_ORGANIZATION: return createGgOrganization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgGraiGrid createGgGraiGrid() {
		GgGraiGridImpl ggGraiGrid = new GgGraiGridImpl();
		return ggGraiGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgOrganization createGgOrganization() {
		GgOrganizationImpl ggOrganization = new GgOrganizationImpl();
		return ggOrganization;
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
