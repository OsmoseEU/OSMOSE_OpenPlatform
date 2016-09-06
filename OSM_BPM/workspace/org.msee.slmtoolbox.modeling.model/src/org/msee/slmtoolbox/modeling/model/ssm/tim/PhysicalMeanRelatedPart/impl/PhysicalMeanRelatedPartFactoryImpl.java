/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalMeanRelatedPartFactoryImpl extends EFactoryImpl implements PhysicalMeanRelatedPartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhysicalMeanRelatedPartFactory init() {
		try {
			PhysicalMeanRelatedPartFactory thePhysicalMeanRelatedPartFactory = (PhysicalMeanRelatedPartFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/msee/slmtoolbox/modeling/model/ssm/tim.ecore/PhysicalMeanRelatedPart"); 
			if (thePhysicalMeanRelatedPartFactory != null) {
				return thePhysicalMeanRelatedPartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhysicalMeanRelatedPartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalMeanRelatedPartFactoryImpl() {
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
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE: return createTimPhysicalMeanResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimPhysicalMeanResource createTimPhysicalMeanResource() {
		TimPhysicalMeanResourceImpl timPhysicalMeanResource = new TimPhysicalMeanResourceImpl();
		return timPhysicalMeanResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalMeanRelatedPartPackage getPhysicalMeanRelatedPartPackage() {
		return (PhysicalMeanRelatedPartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhysicalMeanRelatedPartPackage getPackage() {
		return PhysicalMeanRelatedPartPackage.eINSTANCE;
	}

} //PhysicalMeanRelatedPartFactoryImpl
