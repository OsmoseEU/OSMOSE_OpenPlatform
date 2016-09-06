/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage
 * @generated
 */
public class HumanRelatedPartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HumanRelatedPartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanRelatedPartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HumanRelatedPartPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanRelatedPartSwitch<Adapter> modelSwitch =
		new HumanRelatedPartSwitch<Adapter>() {
			@Override
			public Adapter caseTimHumanResource(TimHumanResource object) {
				return createTimHumanResourceAdapter();
			}
			@Override
			public Adapter caseTimOrganization(TimOrganization object) {
				return createTimOrganizationAdapter();
			}
			@Override
			public Adapter caseTimOrganizationUnit(TimOrganizationUnit object) {
				return createTimOrganizationUnitAdapter();
			}
			@Override
			public Adapter caseiTimNamedElement(iTimNamedElement object) {
				return createiTimNamedElementAdapter();
			}
			@Override
			public Adapter caseTimResource(TimResource object) {
				return createTimResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource <em>Tim Human Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource
	 * @generated
	 */
	public Adapter createTimHumanResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization <em>Tim Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization
	 * @generated
	 */
	public Adapter createTimOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit <em>Tim Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit
	 * @generated
	 */
	public Adapter createTimOrganizationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement <em>iTim Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.iTimNamedElement
	 * @generated
	 */
	public Adapter createiTimNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource <em>Tim Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource
	 * @generated
	 */
	public Adapter createTimResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HumanRelatedPartAdapterFactory
