/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaFlowElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl#isIsTrigger <em>Is Trigger</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl#getTriggerInfo <em>Trigger Info</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaFlowImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EaFlowImpl extends EaFlowElementImpl implements EaFlow {
	/**
	 * The default value of the '{@link #isIsTrigger() <em>Is Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRIGGER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTriggerInfo() <em>Trigger Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_INFO_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTrigger() {
		return (Boolean)eDynamicGet(CoreElementsPackage.EA_FLOW__IS_TRIGGER, CoreElementsPackage.Literals.EA_FLOW__IS_TRIGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTrigger(boolean newIsTrigger) {
		eDynamicSet(CoreElementsPackage.EA_FLOW__IS_TRIGGER, CoreElementsPackage.Literals.EA_FLOW__IS_TRIGGER, newIsTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerInfo() {
		return (String)eDynamicGet(CoreElementsPackage.EA_FLOW__TRIGGER_INFO, CoreElementsPackage.Literals.EA_FLOW__TRIGGER_INFO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerInfo(String newTriggerInfo) {
		eDynamicSet(CoreElementsPackage.EA_FLOW__TRIGGER_INFO, CoreElementsPackage.Literals.EA_FLOW__TRIGGER_INFO, newTriggerInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaFlowNode getSource() {
		return (EaFlowNode)eDynamicGet(CoreElementsPackage.EA_FLOW__SOURCE, CoreElementsPackage.Literals.EA_FLOW__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaFlowNode basicGetSource() {
		return (EaFlowNode)eDynamicGet(CoreElementsPackage.EA_FLOW__SOURCE, CoreElementsPackage.Literals.EA_FLOW__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(EaFlowNode newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, CoreElementsPackage.EA_FLOW__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EaFlowNode newSource) {
		eDynamicSet(CoreElementsPackage.EA_FLOW__SOURCE, CoreElementsPackage.Literals.EA_FLOW__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaFlowNode getTarget() {
		return (EaFlowNode)eDynamicGet(CoreElementsPackage.EA_FLOW__TARGET, CoreElementsPackage.Literals.EA_FLOW__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaFlowNode basicGetTarget() {
		return (EaFlowNode)eDynamicGet(CoreElementsPackage.EA_FLOW__TARGET, CoreElementsPackage.Literals.EA_FLOW__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(EaFlowNode newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, CoreElementsPackage.EA_FLOW__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EaFlowNode newTarget) {
		eDynamicSet(CoreElementsPackage.EA_FLOW__TARGET, CoreElementsPackage.Literals.EA_FLOW__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__SOURCE:
				EaFlowNode source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, CoreElementsPackage.EA_FLOW_NODE__OUT_FLOWS, EaFlowNode.class, msgs);
				return basicSetSource((EaFlowNode)otherEnd, msgs);
			case CoreElementsPackage.EA_FLOW__TARGET:
				EaFlowNode target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, CoreElementsPackage.EA_FLOW_NODE__IN_FLOWS, EaFlowNode.class, msgs);
				return basicSetTarget((EaFlowNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case CoreElementsPackage.EA_FLOW__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__IS_TRIGGER:
				return isIsTrigger();
			case CoreElementsPackage.EA_FLOW__TRIGGER_INFO:
				return getTriggerInfo();
			case CoreElementsPackage.EA_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CoreElementsPackage.EA_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__IS_TRIGGER:
				setIsTrigger((Boolean)newValue);
				return;
			case CoreElementsPackage.EA_FLOW__TRIGGER_INFO:
				setTriggerInfo((String)newValue);
				return;
			case CoreElementsPackage.EA_FLOW__SOURCE:
				setSource((EaFlowNode)newValue);
				return;
			case CoreElementsPackage.EA_FLOW__TARGET:
				setTarget((EaFlowNode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__IS_TRIGGER:
				setIsTrigger(IS_TRIGGER_EDEFAULT);
				return;
			case CoreElementsPackage.EA_FLOW__TRIGGER_INFO:
				setTriggerInfo(TRIGGER_INFO_EDEFAULT);
				return;
			case CoreElementsPackage.EA_FLOW__SOURCE:
				setSource((EaFlowNode)null);
				return;
			case CoreElementsPackage.EA_FLOW__TARGET:
				setTarget((EaFlowNode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_FLOW__IS_TRIGGER:
				return isIsTrigger() != IS_TRIGGER_EDEFAULT;
			case CoreElementsPackage.EA_FLOW__TRIGGER_INFO:
				return TRIGGER_INFO_EDEFAULT == null ? getTriggerInfo() != null : !TRIGGER_INFO_EDEFAULT.equals(getTriggerInfo());
			case CoreElementsPackage.EA_FLOW__SOURCE:
				return basicGetSource() != null;
			case CoreElementsPackage.EA_FLOW__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //EaFlowImpl
