/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HumanRelatedPartFactoryImpl extends EFactoryImpl implements HumanRelatedPartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HumanRelatedPartFactory init() {
		try {
			HumanRelatedPartFactory theHumanRelatedPartFactory = (HumanRelatedPartFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/HumanRelatedPart"); 
			if (theHumanRelatedPartFactory != null) {
				return theHumanRelatedPartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HumanRelatedPartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanRelatedPartFactoryImpl() {
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
			case HumanRelatedPartPackage.TIM_HUMAN_RESOURCE: return createTimHumanResource();
			case HumanRelatedPartPackage.TIM_ORGANIZATION: return createTimOrganization();
			case HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT: return createTimOrganizationUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimHumanResource createTimHumanResource() {
		TimHumanResourceImpl timHumanResource = new TimHumanResourceImpl();
		return timHumanResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganization createTimOrganization() {
		TimOrganizationImpl timOrganization = new TimOrganizationImpl();
		return timOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganizationUnit createTimOrganizationUnit() {
		TimOrganizationUnitImpl timOrganizationUnit = new TimOrganizationUnitImpl();
		return timOrganizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanRelatedPartPackage getHumanRelatedPartPackage() {
		return (HumanRelatedPartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HumanRelatedPartPackage getPackage() {
		return HumanRelatedPartPackage.eINSTANCE;
	}

} //HumanRelatedPartFactoryImpl
