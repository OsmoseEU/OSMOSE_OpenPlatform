/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getMainProcess <em>Main Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getEaProcess <em>Ea Process</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmProcessImpl#getMseService <em>Mse Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmProcessImpl extends EObjectImpl implements BsmProcess {
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
	protected static final String NAME_EDEFAULT = "";

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
	protected static final String RESULT_EDEFAULT = "";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmProcessImpl() {
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
		return BsmPackage.Literals.BSM_PROCESS;
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
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__ID, BsmPackage.Literals.BSM_PROCESS__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_PROCESS__ID, BsmPackage.Literals.BSM_PROCESS__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__NAME, BsmPackage.Literals.BSM_PROCESS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_PROCESS__NAME, BsmPackage.Literals.BSM_PROCESS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__OBJECTIVE, BsmPackage.Literals.BSM_PROCESS__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(BsmPackage.BSM_PROCESS__OBJECTIVE, BsmPackage.Literals.BSM_PROCESS__OBJECTIVE, newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger() {
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__TRIGGER, BsmPackage.Literals.BSM_PROCESS__TRIGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		eDynamicSet(BsmPackage.BSM_PROCESS__TRIGGER, BsmPackage.Literals.BSM_PROCESS__TRIGGER, newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__RESULT, BsmPackage.Literals.BSM_PROCESS__RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		eDynamicSet(BsmPackage.BSM_PROCESS__RESULT, BsmPackage.Literals.BSM_PROCESS__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(BsmPackage.BSM_PROCESS__CONSTRAINT, BsmPackage.Literals.BSM_PROCESS__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(BsmPackage.BSM_PROCESS__CONSTRAINT, BsmPackage.Literals.BSM_PROCESS__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmProcess> getSubProcess() {
		return (EList<BsmProcess>)eDynamicGet(BsmPackage.BSM_PROCESS__SUB_PROCESS, BsmPackage.Literals.BSM_PROCESS__SUB_PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProcess getMainProcess() {
		return (BsmProcess)eDynamicGet(BsmPackage.BSM_PROCESS__MAIN_PROCESS, BsmPackage.Literals.BSM_PROCESS__MAIN_PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmProcess basicGetMainProcess() {
		return (BsmProcess)eDynamicGet(BsmPackage.BSM_PROCESS__MAIN_PROCESS, BsmPackage.Literals.BSM_PROCESS__MAIN_PROCESS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainProcess(BsmProcess newMainProcess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMainProcess, BsmPackage.BSM_PROCESS__MAIN_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainProcess(BsmProcess newMainProcess) {
		eDynamicSet(BsmPackage.BSM_PROCESS__MAIN_PROCESS, BsmPackage.Literals.BSM_PROCESS__MAIN_PROCESS, newMainProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService getService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PROCESS__SERVICE, BsmPackage.Literals.BSM_PROCESS__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmService basicGetService() {
		return (BsmService)eDynamicGet(BsmPackage.BSM_PROCESS__SERVICE, BsmPackage.Literals.BSM_PROCESS__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(BsmService newService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newService, BsmPackage.BSM_PROCESS__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(BsmService newService) {
		eDynamicSet(BsmPackage.BSM_PROCESS__SERVICE, BsmPackage.Literals.BSM_PROCESS__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmResource> getResources() {
		return (EList<BsmResource>)eDynamicGet(BsmPackage.BSM_PROCESS__RESOURCES, BsmPackage.Literals.BSM_PROCESS__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmOrganization> getOrganizations() {
		return (EList<BsmOrganization>)eDynamicGet(BsmPackage.BSM_PROCESS__ORGANIZATIONS, BsmPackage.Literals.BSM_PROCESS__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_PROCESS__BSM_MODEL, BsmPackage.Literals.BSM_PROCESS__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_PROCESS__BSM_MODEL, msgs);
		if (null!= newBsmModel) {
			basicSetService(newBsmModel.getService(), null);
			((BsmServiceImpl)newBsmModel.getService()).eInverseAdd(this, BsmPackage.BSM_SERVICE__PROCESSES, null);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_PROCESS__BSM_MODEL, BsmPackage.Literals.BSM_PROCESS__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess getEaProcess() {
		return (EaProcess)eDynamicGet(BsmPackage.BSM_PROCESS__EA_PROCESS, BsmPackage.Literals.BSM_PROCESS__EA_PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaProcess basicGetEaProcess() {
		return (EaProcess)eDynamicGet(BsmPackage.BSM_PROCESS__EA_PROCESS, BsmPackage.Literals.BSM_PROCESS__EA_PROCESS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaProcess(EaProcess newEaProcess) {
		eDynamicSet(BsmPackage.BSM_PROCESS__EA_PROCESS, BsmPackage.Literals.BSM_PROCESS__EA_PROCESS, newEaProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmMseService getMseService() {
		return (BsmMseService)eDynamicGet(BsmPackage.BSM_PROCESS__MSE_SERVICE, BsmPackage.Literals.BSM_PROCESS__MSE_SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMseService(BsmMseService newMseService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMseService, BsmPackage.BSM_PROCESS__MSE_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMseService(BsmMseService newMseService) {
		eDynamicSet(BsmPackage.BSM_PROCESS__MSE_SERVICE, BsmPackage.Literals.BSM_PROCESS__MSE_SERVICE, newMseService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "Process";
		StringBuffer result = new StringBuffer();
		if (null == this.getName()) {
		result.append("<");
		result.append(nameElement);
		result.append(">");
		} else {
		result.append(nameElement);
		result.append(" ");
		result.append(this.getName());
		}
		return result.toString();
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
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProcess()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				BsmProcess mainProcess = basicGetMainProcess();
				if (mainProcess != null)
					msgs = ((InternalEObject)mainProcess).eInverseRemove(this, BsmPackage.BSM_PROCESS__SUB_PROCESS, BsmProcess.class, msgs);
				return basicSetMainProcess((BsmProcess)otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__SERVICE:
				BsmService service = basicGetService();
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, BsmPackage.BSM_SERVICE__PROCESSES, BsmService.class, msgs);
				return basicSetService((BsmService)otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				BsmMseService mseService = getMseService();
				if (mseService != null)
					msgs = ((InternalEObject)mseService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BsmPackage.BSM_PROCESS__MSE_SERVICE, null, msgs);
				return basicSetMseService((BsmMseService)otherEnd, msgs);
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
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				return ((InternalEList<?>)getSubProcess()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				return basicSetMainProcess(null, msgs);
			case BsmPackage.BSM_PROCESS__SERVICE:
				return basicSetService(null, msgs);
			case BsmPackage.BSM_PROCESS__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				return basicSetMseService(null, msgs);
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
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__PROCESSES, BsmModel.class, msgs);
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
			case BsmPackage.BSM_PROCESS__ID:
				return getId();
			case BsmPackage.BSM_PROCESS__NAME:
				return getName();
			case BsmPackage.BSM_PROCESS__OBJECTIVE:
				return getObjective();
			case BsmPackage.BSM_PROCESS__TRIGGER:
				return getTrigger();
			case BsmPackage.BSM_PROCESS__RESULT:
				return getResult();
			case BsmPackage.BSM_PROCESS__CONSTRAINT:
				return getConstraint();
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				return getSubProcess();
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				if (resolve) return getMainProcess();
				return basicGetMainProcess();
			case BsmPackage.BSM_PROCESS__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case BsmPackage.BSM_PROCESS__RESOURCES:
				return getResources();
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				return getOrganizations();
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				return getBsmModel();
			case BsmPackage.BSM_PROCESS__EA_PROCESS:
				if (resolve) return getEaProcess();
				return basicGetEaProcess();
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				return getMseService();
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
			case BsmPackage.BSM_PROCESS__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__TRIGGER:
				setTrigger((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__RESULT:
				setResult((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				getSubProcess().clear();
				getSubProcess().addAll((Collection<? extends BsmProcess>)newValue);
				return;
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				setMainProcess((BsmProcess)newValue);
				return;
			case BsmPackage.BSM_PROCESS__SERVICE:
				setService((BsmService)newValue);
				return;
			case BsmPackage.BSM_PROCESS__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends BsmResource>)newValue);
				return;
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends BsmOrganization>)newValue);
				return;
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
				return;
			case BsmPackage.BSM_PROCESS__EA_PROCESS:
				setEaProcess((EaProcess)newValue);
				return;
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				setMseService((BsmMseService)newValue);
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
			case BsmPackage.BSM_PROCESS__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				getSubProcess().clear();
				return;
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				setMainProcess((BsmProcess)null);
				return;
			case BsmPackage.BSM_PROCESS__SERVICE:
				setService((BsmService)null);
				return;
			case BsmPackage.BSM_PROCESS__RESOURCES:
				getResources().clear();
				return;
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				setBsmModel((BsmModel)null);
				return;
			case BsmPackage.BSM_PROCESS__EA_PROCESS:
				setEaProcess((EaProcess)null);
				return;
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				setMseService((BsmMseService)null);
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
			case BsmPackage.BSM_PROCESS__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_PROCESS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_PROCESS__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case BsmPackage.BSM_PROCESS__TRIGGER:
				return TRIGGER_EDEFAULT == null ? getTrigger() != null : !TRIGGER_EDEFAULT.equals(getTrigger());
			case BsmPackage.BSM_PROCESS__RESULT:
				return RESULT_EDEFAULT == null ? getResult() != null : !RESULT_EDEFAULT.equals(getResult());
			case BsmPackage.BSM_PROCESS__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case BsmPackage.BSM_PROCESS__SUB_PROCESS:
				return !getSubProcess().isEmpty();
			case BsmPackage.BSM_PROCESS__MAIN_PROCESS:
				return basicGetMainProcess() != null;
			case BsmPackage.BSM_PROCESS__SERVICE:
				return basicGetService() != null;
			case BsmPackage.BSM_PROCESS__RESOURCES:
				return !getResources().isEmpty();
			case BsmPackage.BSM_PROCESS__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case BsmPackage.BSM_PROCESS__BSM_MODEL:
				return getBsmModel() != null;
			case BsmPackage.BSM_PROCESS__EA_PROCESS:
				return basicGetEaProcess() != null;
			case BsmPackage.BSM_PROCESS__MSE_SERVICE:
				return getMseService() != null;
		}
		return super.eIsSet(featureID);
	}

} //BsmProcessImpl
