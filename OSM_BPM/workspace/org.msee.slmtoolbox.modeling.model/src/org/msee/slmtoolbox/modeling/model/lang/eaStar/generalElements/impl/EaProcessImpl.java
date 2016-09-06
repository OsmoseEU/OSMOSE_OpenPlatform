/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaProcessImpl#getCanBe <em>Can Be</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaProcessImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.impl.EaProcessImpl#getDecompositionCode <em>Decomposition Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaProcessImpl extends EaBaseElementImpl implements EaProcess {
	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EaFlowElement> flowElements;

	/**
	 * The cached value of the '{@link #getCanBe() <em>Can Be</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBe()
	 * @generated
	 * @ordered
	 */
	protected EaStructuralExtendedActivity canBe;

	/**
	 * The default value of the '{@link #getDecompositionCode() <em>Decomposition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DECOMPOSITION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecompositionCode() <em>Decomposition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionCode()
	 * @generated
	 * @ordered
	 */
	protected String decompositionCode = DECOMPOSITION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsmioticProcess() <em>Osmiotic Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmioticProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String OSMIOTIC_PROCESS_EDEFAULT = "UNDEFINED";

	/**
	 * The cached value of the '{@link #getOsmioticProcess() <em>Osmiotic Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmioticProcess()
	 * @generated
	 * @ordered
	 */
	protected String osmioticProcess = OSMIOTIC_PROCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralElementsPackage.Literals.EA_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EaFlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentWithInverseEList<EaFlowElement>(EaFlowElement.class, this, GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS, GeneralElementsPackage.EA_FLOW_ELEMENT__PROCESS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaStructuralExtendedActivity getCanBe() {
		if (canBe != null && canBe.eIsProxy()) {
			InternalEObject oldCanBe = (InternalEObject)canBe;
			canBe = (EaStructuralExtendedActivity)eResolveProxy(oldCanBe);
			if (canBe != oldCanBe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralElementsPackage.EA_PROCESS__CAN_BE, oldCanBe, canBe));
			}
		}
		return canBe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaStructuralExtendedActivity basicGetCanBe() {
		return canBe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanBe(EaStructuralExtendedActivity newCanBe, NotificationChain msgs) {
		EaStructuralExtendedActivity oldCanBe = canBe;
		canBe = newCanBe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneralElementsPackage.EA_PROCESS__CAN_BE, oldCanBe, newCanBe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBe(EaStructuralExtendedActivity newCanBe) {
		if (newCanBe != canBe) {
			NotificationChain msgs = null;
			if (canBe != null)
				msgs = ((InternalEObject)canBe).eInverseRemove(this, CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, EaStructuralExtendedActivity.class, msgs);
			if (newCanBe != null)
				msgs = ((InternalEObject)newCanBe).eInverseAdd(this, CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, EaStructuralExtendedActivity.class, msgs);
			msgs = basicSetCanBe(newCanBe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralElementsPackage.EA_PROCESS__CAN_BE, newCanBe, newCanBe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaModel getModel() {
		if (eContainerFeatureID() != GeneralElementsPackage.EA_PROCESS__MODEL) return null;
		return (EaModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(EaModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, GeneralElementsPackage.EA_PROCESS__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(EaModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != GeneralElementsPackage.EA_PROCESS__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, RootPackage.EA_MODEL__PROCESS, EaModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralElementsPackage.EA_PROCESS__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecompositionCode() {
		return decompositionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompositionCode(String newDecompositionCode) {
		String oldDecompositionCode = decompositionCode;
		decompositionCode = newDecompositionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralElementsPackage.EA_PROCESS__DECOMPOSITION_CODE, oldDecompositionCode, decompositionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsmioticProcess() {
		return osmioticProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsmioticProcess(String newOsmioticProcess) {
		String oldOsmioticProcess = osmioticProcess;
		osmioticProcess = newOsmioticProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS, oldOsmioticProcess, osmioticProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowElements()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				if (canBe != null)
					msgs = ((InternalEObject)canBe).eInverseRemove(this, CoreElementsPackage.EA_STRUCTURAL_EXTENDED_ACTIVITY__IS_A, EaStructuralExtendedActivity.class, msgs);
				return basicSetCanBe((EaStructuralExtendedActivity)otherEnd, msgs);
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((EaModel)otherEnd, msgs);
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
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				return basicSetCanBe(null, msgs);
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				return eInternalContainer().eInverseRemove(this, RootPackage.EA_MODEL__PROCESS, EaModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				return getFlowElements();
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				if (resolve) return getCanBe();
				return basicGetCanBe();
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				return getModel();
			case GeneralElementsPackage.EA_PROCESS__DECOMPOSITION_CODE:
				return getDecompositionCode();
			case GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS:
				return getOsmioticProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends EaFlowElement>)newValue);
				return;
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				setCanBe((EaStructuralExtendedActivity)newValue);
				return;
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				setModel((EaModel)newValue);
				return;
			case GeneralElementsPackage.EA_PROCESS__DECOMPOSITION_CODE:
				setDecompositionCode((String)newValue);
				return;
			case GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS:
				setOsmioticProcess((String)newValue);
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
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				setCanBe((EaStructuralExtendedActivity)null);
				return;
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				setModel((EaModel)null);
				return;
			case GeneralElementsPackage.EA_PROCESS__DECOMPOSITION_CODE:
				setDecompositionCode(DECOMPOSITION_CODE_EDEFAULT);
				return;
			case GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS:
				setOsmioticProcess(OSMIOTIC_PROCESS_EDEFAULT);
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
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
			case GeneralElementsPackage.EA_PROCESS__CAN_BE:
				return canBe != null;
			case GeneralElementsPackage.EA_PROCESS__MODEL:
				return getModel() != null;
			case GeneralElementsPackage.EA_PROCESS__DECOMPOSITION_CODE:
				return DECOMPOSITION_CODE_EDEFAULT == null ? decompositionCode != null : !DECOMPOSITION_CODE_EDEFAULT.equals(decompositionCode);
			case GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS:
				return OSMIOTIC_PROCESS_EDEFAULT == null ? osmioticProcess != null : !OSMIOTIC_PROCESS_EDEFAULT.equals(osmioticProcess);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (decompositionCode: ");
		result.append(decompositionCode);
		result.append(", osmioticProcess: ");
		result.append(osmioticProcess);
		result.append(')');
		return result.toString();
	}

} //EaProcessImpl
