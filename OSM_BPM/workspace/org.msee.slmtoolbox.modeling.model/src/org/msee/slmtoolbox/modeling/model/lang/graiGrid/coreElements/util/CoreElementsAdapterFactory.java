/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.*;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage
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
			public Adapter caseGgFunction(GgFunction object) {
				return createGgFunctionAdapter();
			}
			@Override
			public Adapter caseGgLevel(GgLevel object) {
				return createGgLevelAdapter();
			}
			@Override
			public Adapter caseGgFlow(GgFlow object) {
				return createGgFlowAdapter();
			}
			@Override
			public Adapter caseGgNode(GgNode object) {
				return createGgNodeAdapter();
			}
			@Override
			public Adapter caseGgDecisionFrame(GgDecisionFrame object) {
				return createGgDecisionFrameAdapter();
			}
			@Override
			public Adapter caseGgInformationFlow(GgInformationFlow object) {
				return createGgInformationFlowAdapter();
			}
			@Override
			public Adapter caseGgCollaborativeDecision(GgCollaborativeDecision object) {
				return createGgCollaborativeDecisionAdapter();
			}
			@Override
			public Adapter caseGgDecisionCenter(GgDecisionCenter object) {
				return createGgDecisionCenterAdapter();
			}
			@Override
			public Adapter caseGgTimeValue(GgTimeValue object) {
				return createGgTimeValueAdapter();
			}
			@Override
			public Adapter caseGgInformationSource(GgInformationSource object) {
				return createGgInformationSourceAdapter();
			}
			@Override
			public Adapter caseGgExternalInformationSource(GgExternalInformationSource object) {
				return createGgExternalInformationSourceAdapter();
			}
			@Override
			public Adapter caseGgInternalInformationSource(GgInternalInformationSource object) {
				return createGgInternalInformationSourceAdapter();
			}
			@Override
			public Adapter caseGgInformationCenter(GgInformationCenter object) {
				return createGgInformationCenterAdapter();
			}
			@Override
			public Adapter caseGgBaseElement(GgBaseElement object) {
				return createGgBaseElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction <em>Gg Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction
	 * @generated
	 */
	public Adapter createGgFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel <em>Gg Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel
	 * @generated
	 */
	public Adapter createGgLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow <em>Gg Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow
	 * @generated
	 */
	public Adapter createGgFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode <em>Gg Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode
	 * @generated
	 */
	public Adapter createGgNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame <em>Gg Decision Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame
	 * @generated
	 */
	public Adapter createGgDecisionFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow <em>Gg Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow
	 * @generated
	 */
	public Adapter createGgInformationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter <em>Gg Decision Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter
	 * @generated
	 */
	public Adapter createGgDecisionCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue <em>Gg Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue
	 * @generated
	 */
	public Adapter createGgTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource <em>Gg Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource
	 * @generated
	 */
	public Adapter createGgInformationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource <em>Gg External Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource
	 * @generated
	 */
	public Adapter createGgExternalInformationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource <em>Gg Internal Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource
	 * @generated
	 */
	public Adapter createGgInternalInformationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter <em>Gg Information Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter
	 * @generated
	 */
	public Adapter createGgInformationCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision <em>Gg Collaborative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision
	 * @generated
	 */
	public Adapter createGgCollaborativeDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement <em>Gg Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement
	 * @generated
	 */
	public Adapter createGgBaseElementAdapter() {
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
