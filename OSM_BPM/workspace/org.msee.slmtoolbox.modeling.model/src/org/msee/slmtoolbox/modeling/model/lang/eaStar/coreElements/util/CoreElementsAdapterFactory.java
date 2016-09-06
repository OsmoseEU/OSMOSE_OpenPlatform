/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.*;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage
 * @generated
 */
public class CoreElementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreElementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CoreElementsPackage.eINSTANCE;
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
	protected CoreElementsSwitch<Adapter> modelSwitch =
		new CoreElementsSwitch<Adapter>() {
			@Override
			public Adapter caseEaFlow(EaFlow object) {
				return createEaFlowAdapter();
			}
			@Override
			public Adapter caseEaFlowNode(EaFlowNode object) {
				return createEaFlowNodeAdapter();
			}
			@Override
			public Adapter caseEaLogicalOperator(EaLogicalOperator object) {
				return createEaLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseEaConnector(EaConnector object) {
				return createEaConnectorAdapter();
			}
			@Override
			public Adapter caseEaExtendedActivity(EaExtendedActivity object) {
				return createEaExtendedActivityAdapter();
			}
			@Override
			public Adapter caseEaResource(EaResource object) {
				return createEaResourceAdapter();
			}
			@Override
			public Adapter caseEaITResource(EaITResource object) {
				return createEaITResourceAdapter();
			}
			@Override
			public Adapter caseEaHumanResource(EaHumanResource object) {
				return createEaHumanResourceAdapter();
			}
			@Override
			public Adapter caseEaMaterialResource(EaMaterialResource object) {
				return createEaMaterialResourceAdapter();
			}
			@Override
			public Adapter caseEaOr(EaOr object) {
				return createEaOrAdapter();
			}
			@Override
			public Adapter caseEaAnd(EaAnd object) {
				return createEaAndAdapter();
			}
			@Override
			public Adapter caseEaDivergingAnd(EaDivergingAnd object) {
				return createEaDivergingAndAdapter();
			}
			@Override
			public Adapter caseEaDivergingOr(EaDivergingOr object) {
				return createEaDivergingOrAdapter();
			}
			@Override
			public Adapter caseEaConvergingAnd(EaConvergingAnd object) {
				return createEaConvergingAndAdapter();
			}
			@Override
			public Adapter caseEaConvergingOr(EaConvergingOr object) {
				return createEaConvergingOrAdapter();
			}
			@Override
			public Adapter caseEaInternalConnector(EaInternalConnector object) {
				return createEaInternalConnectorAdapter();
			}
			@Override
			public Adapter caseEaExternalConnector(EaExternalConnector object) {
				return createEaExternalConnectorAdapter();
			}
			@Override
			public Adapter caseEaProcessConnector(EaProcessConnector object) {
				return createEaProcessConnectorAdapter();
			}
			@Override
			public Adapter caseEaOutputInputFlow(EaOutputInputFlow object) {
				return createEaOutputInputFlowAdapter();
			}
			@Override
			public Adapter caseEaSupportFlow(EaSupportFlow object) {
				return createEaSupportFlowAdapter();
			}
			@Override
			public Adapter caseEaControlFlow(EaControlFlow object) {
				return createEaControlFlowAdapter();
			}
			@Override
			public Adapter caseEaOrganization(EaOrganization object) {
				return createEaOrganizationAdapter();
			}
			@Override
			public Adapter caseEaAtomicExtendedActivity(EaAtomicExtendedActivity object) {
				return createEaAtomicExtendedActivityAdapter();
			}
			@Override
			public Adapter caseEaStructuralExtendedActivity(EaStructuralExtendedActivity object) {
				return createEaStructuralExtendedActivityAdapter();
			}
			@Override
			public Adapter caseEaBaseElement(EaBaseElement object) {
				return createEaBaseElementAdapter();
			}
			@Override
			public Adapter caseEaFlowElement(EaFlowElement object) {
				return createEaFlowElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow <em>Ea Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow
	 * @generated
	 */
	public Adapter createEaFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode <em>Ea Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode
	 * @generated
	 */
	public Adapter createEaFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator <em>Ea Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator
	 * @generated
	 */
	public Adapter createEaLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector <em>Ea Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector
	 * @generated
	 */
	public Adapter createEaConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity <em>Ea Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity
	 * @generated
	 */
	public Adapter createEaExtendedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource <em>Ea Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource
	 * @generated
	 */
	public Adapter createEaResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource <em>Ea IT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource
	 * @generated
	 */
	public Adapter createEaITResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource <em>Ea Human Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource
	 * @generated
	 */
	public Adapter createEaHumanResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource <em>Ea Material Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource
	 * @generated
	 */
	public Adapter createEaMaterialResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr <em>Ea Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr
	 * @generated
	 */
	public Adapter createEaOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd <em>Ea And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd
	 * @generated
	 */
	public Adapter createEaAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd <em>Ea Diverging And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd
	 * @generated
	 */
	public Adapter createEaDivergingAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr <em>Ea Diverging Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingOr
	 * @generated
	 */
	public Adapter createEaDivergingOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd <em>Ea Converging And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingAnd
	 * @generated
	 */
	public Adapter createEaConvergingAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr <em>Ea Converging Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConvergingOr
	 * @generated
	 */
	public Adapter createEaConvergingOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector <em>Ea Internal Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector
	 * @generated
	 */
	public Adapter createEaInternalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector <em>Ea External Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector
	 * @generated
	 */
	public Adapter createEaExternalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector <em>Ea Process Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector
	 * @generated
	 */
	public Adapter createEaProcessConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow <em>Ea Output Input Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow
	 * @generated
	 */
	public Adapter createEaOutputInputFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow <em>Ea Support Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow
	 * @generated
	 */
	public Adapter createEaSupportFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow <em>Ea Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow
	 * @generated
	 */
	public Adapter createEaControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization <em>Ea Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization
	 * @generated
	 */
	public Adapter createEaOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity <em>Ea Atomic Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity
	 * @generated
	 */
	public Adapter createEaAtomicExtendedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity <em>Ea Structural Extended Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity
	 * @generated
	 */
	public Adapter createEaStructuralExtendedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement <em>Ea Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement
	 * @generated
	 */
	public Adapter createEaBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement <em>Ea Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement
	 * @generated
	 */
	public Adapter createEaFlowElementAdapter() {
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

} //CoreElementsAdapterFactory
