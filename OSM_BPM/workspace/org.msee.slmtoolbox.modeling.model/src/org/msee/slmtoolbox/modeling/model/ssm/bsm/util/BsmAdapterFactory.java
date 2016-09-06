/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage
 * @generated
 */
public class BsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BsmPackage.eINSTANCE;
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
	protected BsmSwitch<Adapter> modelSwitch =
		new BsmSwitch<Adapter>() {
			@Override
			public Adapter caseIBsmNamedElement(IBsmNamedElement object) {
				return createIBsmNamedElementAdapter();
			}
			@Override
			public Adapter caseBsmModel(BsmModel object) {
				return createBsmModelAdapter();
			}
			@Override
			public Adapter caseBsmService(BsmService object) {
				return createBsmServiceAdapter();
			}
			@Override
			public Adapter caseBsmCustomer(BsmCustomer object) {
				return createBsmCustomerAdapter();
			}
			@Override
			public Adapter caseBsmStakeholder(BsmStakeholder object) {
				return createBsmStakeholderAdapter();
			}
			@Override
			public Adapter caseBsmPartner(BsmPartner object) {
				return createBsmPartnerAdapter();
			}
			@Override
			public Adapter caseBsmProduct(BsmProduct object) {
				return createBsmProductAdapter();
			}
			@Override
			public Adapter caseBsmComponent(BsmComponent object) {
				return createBsmComponentAdapter();
			}
			@Override
			public Adapter caseBsmFunctionality(BsmFunctionality object) {
				return createBsmFunctionalityAdapter();
			}
			@Override
			public Adapter caseBsmResource(BsmResource object) {
				return createBsmResourceAdapter();
			}
			@Override
			public Adapter caseBsmProcess(BsmProcess object) {
				return createBsmProcessAdapter();
			}
			@Override
			public Adapter caseBsmDecision(BsmDecision object) {
				return createBsmDecisionAdapter();
			}
			@Override
			public Adapter caseBsmDecisionStructure(BsmDecisionStructure object) {
				return createBsmDecisionStructureAdapter();
			}
			@Override
			public Adapter caseBsmOrganization(BsmOrganization object) {
				return createBsmOrganizationAdapter();
			}
			@Override
			public Adapter caseBsmEnterprise(BsmEnterprise object) {
				return createBsmEnterpriseAdapter();
			}
			@Override
			public Adapter caseBsmVirtualEnterprise(BsmVirtualEnterprise object) {
				return createBsmVirtualEnterpriseAdapter();
			}
			@Override
			public Adapter caseBsmVEParticipation(BsmVEParticipation object) {
				return createBsmVEParticipationAdapter();
			}
			@Override
			public Adapter caseBsmValue(BsmValue object) {
				return createBsmValueAdapter();
			}
			@Override
			public Adapter caseBsmPerformanceIndicator(BsmPerformanceIndicator object) {
				return createBsmPerformanceIndicatorAdapter();
			}
			@Override
			public Adapter caseBsmPiField(BsmPiField object) {
				return createBsmPiFieldAdapter();
			}
			@Override
			public Adapter caseBsmDecisionVariable(BsmDecisionVariable object) {
				return createBsmDecisionVariableAdapter();
			}
			@Override
			public Adapter caseBsmDecisionObjective(BsmDecisionObjective object) {
				return createBsmDecisionObjectiveAdapter();
			}
			@Override
			public Adapter caseBsmMseService(BsmMseService object) {
				return createBsmMseServiceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement <em>IBsm Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.IBsmNamedElement
	 * @generated
	 */
	public Adapter createIBsmNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel
	 * @generated
	 */
	public Adapter createBsmModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService
	 * @generated
	 */
	public Adapter createBsmServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer
	 * @generated
	 */
	public Adapter createBsmCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder
	 * @generated
	 */
	public Adapter createBsmStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner
	 * @generated
	 */
	public Adapter createBsmPartnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct
	 * @generated
	 */
	public Adapter createBsmProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmComponent
	 * @generated
	 */
	public Adapter createBsmComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality
	 * @generated
	 */
	public Adapter createBsmFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource
	 * @generated
	 */
	public Adapter createBsmResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess
	 * @generated
	 */
	public Adapter createBsmProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision
	 * @generated
	 */
	public Adapter createBsmDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure <em>Decision Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure
	 * @generated
	 */
	public Adapter createBsmDecisionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization
	 * @generated
	 */
	public Adapter createBsmOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise
	 * @generated
	 */
	public Adapter createBsmEnterpriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise <em>Virtual Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise
	 * @generated
	 */
	public Adapter createBsmVirtualEnterpriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation <em>VE Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation
	 * @generated
	 */
	public Adapter createBsmVEParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue
	 * @generated
	 */
	public Adapter createBsmValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator <em>Performance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator
	 * @generated
	 */
	public Adapter createBsmPerformanceIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField <em>Pi Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField
	 * @generated
	 */
	public Adapter createBsmPiFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable <em>Decision Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable
	 * @generated
	 */
	public Adapter createBsmDecisionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective <em>Decision Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective
	 * @generated
	 */
	public Adapter createBsmDecisionObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService <em>Mse Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService
	 * @generated
	 */
	public Adapter createBsmMseServiceAdapter() {
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

} //BsmAdapterFactory
