/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ITRelatedPartFactoryImpl extends EFactoryImpl implements ITRelatedPartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ITRelatedPartFactory init() {
		try {
			ITRelatedPartFactory theITRelatedPartFactory = (ITRelatedPartFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/ITRelatedPart"); 
			if (theITRelatedPartFactory != null) {
				return theITRelatedPartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ITRelatedPartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITRelatedPartFactoryImpl() {
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
			case ITRelatedPartPackage.TIM_ENTERPRISE_APPLICATION_RESOURCE: return createTimEnterpriseApplicationResource();
			case ITRelatedPartPackage.TIM_INFORMATION_SET: return createTimInformationSet();
			case ITRelatedPartPackage.TIM_INFORMATION_ENTITY: return createTimInformationEntity();
			case ITRelatedPartPackage.TIM_INFORMATION_RELATIONSHIP: return createTimInformationRelationship();
			case ITRelatedPartPackage.TIM_INFORMATION_ATTRIBUTE: return createTimInformationAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimEnterpriseApplicationResource createTimEnterpriseApplicationResource() {
		TimEnterpriseApplicationResourceImpl timEnterpriseApplicationResource = new TimEnterpriseApplicationResourceImpl();
		return timEnterpriseApplicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationSet createTimInformationSet() {
		TimInformationSetImpl timInformationSet = new TimInformationSetImpl();
		return timInformationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationEntity createTimInformationEntity() {
		TimInformationEntityImpl timInformationEntity = new TimInformationEntityImpl();
		return timInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationRelationship createTimInformationRelationship() {
		TimInformationRelationshipImpl timInformationRelationship = new TimInformationRelationshipImpl();
		return timInformationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimInformationAttribute createTimInformationAttribute() {
		TimInformationAttributeImpl timInformationAttribute = new TimInformationAttributeImpl();
		return timInformationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITRelatedPartPackage getITRelatedPartPackage() {
		return (ITRelatedPartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ITRelatedPartPackage getPackage() {
		return ITRelatedPartPackage.eINSTANCE;
	}

} //ITRelatedPartFactoryImpl
