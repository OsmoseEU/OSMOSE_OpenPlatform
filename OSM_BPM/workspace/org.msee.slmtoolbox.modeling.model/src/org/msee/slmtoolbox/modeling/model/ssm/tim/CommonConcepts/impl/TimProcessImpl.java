/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getWorkFlow <em>Work Flow</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getSubprocesses <em>Subprocesses</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getMainProcess <em>Main Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getResponsibleOrganizationUnit <em>Responsible Organization Unit</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimProcessImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimProcessImpl extends EObjectImpl implements TimProcess {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWorkFlow() <em>Work Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_FLOW_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimProcessImpl() {
		super();
		this.setId(this.getClass().getSimpleName() + "_" + UUID.randomUUID().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonConceptsPackage.Literals.TIM_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__ID, CommonConceptsPackage.Literals.TIM_PROCESS__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__ID, CommonConceptsPackage.Literals.TIM_PROCESS__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__NAME, CommonConceptsPackage.Literals.TIM_PROCESS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__NAME, CommonConceptsPackage.Literals.TIM_PROCESS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__OBJECTIVE, CommonConceptsPackage.Literals.TIM_PROCESS__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__OBJECTIVE, CommonConceptsPackage.Literals.TIM_PROCESS__OBJECTIVE, newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__TRIGGER, CommonConceptsPackage.Literals.TIM_PROCESS__TRIGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__TRIGGER, CommonConceptsPackage.Literals.TIM_PROCESS__TRIGGER, newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__RESULT, CommonConceptsPackage.Literals.TIM_PROCESS__RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__RESULT, CommonConceptsPackage.Literals.TIM_PROCESS__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__CONSTRAINT, CommonConceptsPackage.Literals.TIM_PROCESS__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__CONSTRAINT, CommonConceptsPackage.Literals.TIM_PROCESS__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkFlow() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__WORK_FLOW, CommonConceptsPackage.Literals.TIM_PROCESS__WORK_FLOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkFlow(String newWorkFlow) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__WORK_FLOW, CommonConceptsPackage.Literals.TIM_PROCESS__WORK_FLOW, newWorkFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getSubprocesses() {
		return (EList<TimProcess>)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES, CommonConceptsPackage.Literals.TIM_PROCESS__SUBPROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimProcess getMainProcess() {
		return (TimProcess)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS, CommonConceptsPackage.Literals.TIM_PROCESS__MAIN_PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimProcess basicGetMainProcess() {
		return (TimProcess)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS, CommonConceptsPackage.Literals.TIM_PROCESS__MAIN_PROCESS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainProcess(TimProcess newMainProcess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMainProcess, CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainProcess(TimProcess newMainProcess) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS, CommonConceptsPackage.Literals.TIM_PROCESS__MAIN_PROCESS, newMainProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimService> getServices() {
		return (EList<TimService>)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__SERVICES, CommonConceptsPackage.Literals.TIM_PROCESS__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimResource> getResources() {
		return (EList<TimResource>)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__RESOURCES, CommonConceptsPackage.Literals.TIM_PROCESS__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganizationUnit getResponsibleOrganizationUnit() {
		return (TimOrganizationUnit)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, CommonConceptsPackage.Literals.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimOrganizationUnit basicGetResponsibleOrganizationUnit() {
		return (TimOrganizationUnit)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, CommonConceptsPackage.Literals.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleOrganizationUnit(TimOrganizationUnit newResponsibleOrganizationUnit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResponsibleOrganizationUnit, CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleOrganizationUnit(TimOrganizationUnit newResponsibleOrganizationUnit) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, CommonConceptsPackage.Literals.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT, newResponsibleOrganizationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel getModel() {
		return (TimModel)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__MODEL, CommonConceptsPackage.Literals.TIM_PROCESS__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TimModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, CommonConceptsPackage.TIM_PROCESS__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(TimModel newModel) {
		eDynamicSet(CommonConceptsPackage.TIM_PROCESS__MODEL, CommonConceptsPackage.Literals.TIM_PROCESS__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimOrganization> getOrganizations() {
		return (EList<TimOrganization>)eDynamicGet(CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS, CommonConceptsPackage.Literals.TIM_PROCESS__ORGANIZATIONS, true, true);
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
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubprocesses()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				TimProcess mainProcess = basicGetMainProcess();
				if (mainProcess != null)
					msgs = ((InternalEObject)mainProcess).eInverseRemove(this, CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES, TimProcess.class, msgs);
				return basicSetMainProcess((TimProcess)otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				TimOrganizationUnit responsibleOrganizationUnit = basicGetResponsibleOrganizationUnit();
				if (responsibleOrganizationUnit != null)
					msgs = ((InternalEObject)responsibleOrganizationUnit).eInverseRemove(this, HumanRelatedPartPackage.TIM_ORGANIZATION_UNIT__PROCESSES, TimOrganizationUnit.class, msgs);
				return basicSetResponsibleOrganizationUnit((TimOrganizationUnit)otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((TimModel)otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
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
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				return ((InternalEList<?>)getSubprocesses()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				return basicSetMainProcess(null, msgs);
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				return basicSetResponsibleOrganizationUnit(null, msgs);
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				return basicSetModel(null, msgs);
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
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
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				return eInternalContainer().eInverseRemove(this, TimPackage.TIM_MODEL__PROCESSES, TimModel.class, msgs);
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
			case CommonConceptsPackage.TIM_PROCESS__ID:
				return getId();
			case CommonConceptsPackage.TIM_PROCESS__NAME:
				return getName();
			case CommonConceptsPackage.TIM_PROCESS__OBJECTIVE:
				return getObjective();
			case CommonConceptsPackage.TIM_PROCESS__TRIGGER:
				return getTrigger();
			case CommonConceptsPackage.TIM_PROCESS__RESULT:
				return getResult();
			case CommonConceptsPackage.TIM_PROCESS__CONSTRAINT:
				return getConstraint();
			case CommonConceptsPackage.TIM_PROCESS__WORK_FLOW:
				return getWorkFlow();
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				return getSubprocesses();
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				if (resolve) return getMainProcess();
				return basicGetMainProcess();
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				return getServices();
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				return getResources();
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				if (resolve) return getResponsibleOrganizationUnit();
				return basicGetResponsibleOrganizationUnit();
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				return getModel();
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				return getOrganizations();
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
			case CommonConceptsPackage.TIM_PROCESS__ID:
				setId((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__NAME:
				setName((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__TRIGGER:
				setTrigger((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESULT:
				setResult((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__WORK_FLOW:
				setWorkFlow((String)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				getSubprocesses().clear();
				getSubprocesses().addAll((Collection<? extends TimProcess>)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				setMainProcess((TimProcess)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends TimService>)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends TimResource>)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				setResponsibleOrganizationUnit((TimOrganizationUnit)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				setModel((TimModel)newValue);
				return;
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends TimOrganization>)newValue);
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
			case CommonConceptsPackage.TIM_PROCESS__ID:
				setId(ID_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__WORK_FLOW:
				setWorkFlow(WORK_FLOW_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				getSubprocesses().clear();
				return;
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				setMainProcess((TimProcess)null);
				return;
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				getServices().clear();
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				getResources().clear();
				return;
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				setResponsibleOrganizationUnit((TimOrganizationUnit)null);
				return;
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				setModel((TimModel)null);
				return;
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				getOrganizations().clear();
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
			case CommonConceptsPackage.TIM_PROCESS__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CommonConceptsPackage.TIM_PROCESS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CommonConceptsPackage.TIM_PROCESS__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case CommonConceptsPackage.TIM_PROCESS__TRIGGER:
				return TRIGGER_EDEFAULT == null ? getTrigger() != null : !TRIGGER_EDEFAULT.equals(getTrigger());
			case CommonConceptsPackage.TIM_PROCESS__RESULT:
				return RESULT_EDEFAULT == null ? getResult() != null : !RESULT_EDEFAULT.equals(getResult());
			case CommonConceptsPackage.TIM_PROCESS__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case CommonConceptsPackage.TIM_PROCESS__WORK_FLOW:
				return WORK_FLOW_EDEFAULT == null ? getWorkFlow() != null : !WORK_FLOW_EDEFAULT.equals(getWorkFlow());
			case CommonConceptsPackage.TIM_PROCESS__SUBPROCESSES:
				return !getSubprocesses().isEmpty();
			case CommonConceptsPackage.TIM_PROCESS__MAIN_PROCESS:
				return basicGetMainProcess() != null;
			case CommonConceptsPackage.TIM_PROCESS__SERVICES:
				return !getServices().isEmpty();
			case CommonConceptsPackage.TIM_PROCESS__RESOURCES:
				return !getResources().isEmpty();
			case CommonConceptsPackage.TIM_PROCESS__RESPONSIBLE_ORGANIZATION_UNIT:
				return basicGetResponsibleOrganizationUnit() != null;
			case CommonConceptsPackage.TIM_PROCESS__MODEL:
				return getModel() != null;
			case CommonConceptsPackage.TIM_PROCESS__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Process ");
		result.append(this.getName());
		return result.toString();
	}

} //TimProcessImpl
