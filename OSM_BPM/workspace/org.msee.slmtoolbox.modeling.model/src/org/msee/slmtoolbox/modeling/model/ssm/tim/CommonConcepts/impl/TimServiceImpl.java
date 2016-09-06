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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tim Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getAutomationLevel <em>Automation Level</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getSubServices <em>Sub Services</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getMainService <em>Main Service</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.TimServiceImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimServiceImpl extends EObjectImpl implements TimService {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutomationLevel() <em>Automation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOMATION_LEVEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TimServiceImpl() {
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
		return CommonConceptsPackage.Literals.TIM_SERVICE;
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
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__ID, CommonConceptsPackage.Literals.TIM_SERVICE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__ID, CommonConceptsPackage.Literals.TIM_SERVICE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__NAME, CommonConceptsPackage.Literals.TIM_SERVICE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__NAME, CommonConceptsPackage.Literals.TIM_SERVICE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__DOMAIN, CommonConceptsPackage.Literals.TIM_SERVICE__DOMAIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__DOMAIN, CommonConceptsPackage.Literals.TIM_SERVICE__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__DESCRIPTION, CommonConceptsPackage.Literals.TIM_SERVICE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__DESCRIPTION, CommonConceptsPackage.Literals.TIM_SERVICE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__CONSTRAINT, CommonConceptsPackage.Literals.TIM_SERVICE__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__CONSTRAINT, CommonConceptsPackage.Literals.TIM_SERVICE__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNature() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__NATURE, CommonConceptsPackage.Literals.TIM_SERVICE__NATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(String newNature) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__NATURE, CommonConceptsPackage.Literals.TIM_SERVICE__NATURE, newNature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimService> getSubServices() {
		return (EList<TimService>)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES, CommonConceptsPackage.Literals.TIM_SERVICE__SUB_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimService getMainService() {
		return (TimService)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE, CommonConceptsPackage.Literals.TIM_SERVICE__MAIN_SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimService basicGetMainService() {
		return (TimService)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE, CommonConceptsPackage.Literals.TIM_SERVICE__MAIN_SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainService(TimService newMainService, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMainService, CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainService(TimService newMainService) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE, CommonConceptsPackage.Literals.TIM_SERVICE__MAIN_SERVICE, newMainService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimProcess> getProcesses() {
		return (EList<TimProcess>)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__PROCESSES, CommonConceptsPackage.Literals.TIM_SERVICE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimResource> getResources() {
		return (EList<TimResource>)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__RESOURCES, CommonConceptsPackage.Literals.TIM_SERVICE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimModel getModel() {
		return (TimModel)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__MODEL, CommonConceptsPackage.Literals.TIM_SERVICE__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(TimModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, CommonConceptsPackage.TIM_SERVICE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(TimModel newModel) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__MODEL, CommonConceptsPackage.Literals.TIM_SERVICE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutomationLevel() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL, CommonConceptsPackage.Literals.TIM_SERVICE__AUTOMATION_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomationLevel(String newAutomationLevel) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL, CommonConceptsPackage.Literals.TIM_SERVICE__AUTOMATION_LEVEL, newAutomationLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__ACCESS, CommonConceptsPackage.Literals.TIM_SERVICE__ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__ACCESS, CommonConceptsPackage.Literals.TIM_SERVICE__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumption() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__CONSUMPTION, CommonConceptsPackage.Literals.TIM_SERVICE__CONSUMPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumption(String newConsumption) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__CONSUMPTION, CommonConceptsPackage.Literals.TIM_SERVICE__CONSUMPTION, newConsumption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return (String)eDynamicGet(CommonConceptsPackage.TIM_SERVICE__OBJECTIVE, CommonConceptsPackage.Literals.TIM_SERVICE__OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		eDynamicSet(CommonConceptsPackage.TIM_SERVICE__OBJECTIVE, CommonConceptsPackage.Literals.TIM_SERVICE__OBJECTIVE, newObjective);
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
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubServices()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				TimService mainService = basicGetMainService();
				if (mainService != null)
					msgs = ((InternalEObject)mainService).eInverseRemove(this, CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES, TimService.class, msgs);
				return basicSetMainService((TimService)otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((TimModel)otherEnd, msgs);
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
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				return ((InternalEList<?>)getSubServices()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				return basicSetMainService(null, msgs);
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
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
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				return eInternalContainer().eInverseRemove(this, TimPackage.TIM_MODEL__SERVICES, TimModel.class, msgs);
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
			case CommonConceptsPackage.TIM_SERVICE__ID:
				return getId();
			case CommonConceptsPackage.TIM_SERVICE__NAME:
				return getName();
			case CommonConceptsPackage.TIM_SERVICE__DESCRIPTION:
				return getDescription();
			case CommonConceptsPackage.TIM_SERVICE__OBJECTIVE:
				return getObjective();
			case CommonConceptsPackage.TIM_SERVICE__CONSTRAINT:
				return getConstraint();
			case CommonConceptsPackage.TIM_SERVICE__ACCESS:
				return getAccess();
			case CommonConceptsPackage.TIM_SERVICE__CONSUMPTION:
				return getConsumption();
			case CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL:
				return getAutomationLevel();
			case CommonConceptsPackage.TIM_SERVICE__DOMAIN:
				return getDomain();
			case CommonConceptsPackage.TIM_SERVICE__NATURE:
				return getNature();
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				return getSubServices();
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				if (resolve) return getMainService();
				return basicGetMainService();
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				return getProcesses();
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				return getResources();
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				return getModel();
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
			case CommonConceptsPackage.TIM_SERVICE__ID:
				setId((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__NAME:
				setName((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__ACCESS:
				setAccess((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__CONSUMPTION:
				setConsumption((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL:
				setAutomationLevel((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__DOMAIN:
				setDomain((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__NATURE:
				setNature((String)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				getSubServices().clear();
				getSubServices().addAll((Collection<? extends TimService>)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				setMainService((TimService)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends TimProcess>)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends TimResource>)newValue);
				return;
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				setModel((TimModel)newValue);
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
			case CommonConceptsPackage.TIM_SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__CONSUMPTION:
				setConsumption(CONSUMPTION_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL:
				setAutomationLevel(AUTOMATION_LEVEL_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				getSubServices().clear();
				return;
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				setMainService((TimService)null);
				return;
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				getProcesses().clear();
				return;
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				getResources().clear();
				return;
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				setModel((TimModel)null);
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
			case CommonConceptsPackage.TIM_SERVICE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CommonConceptsPackage.TIM_SERVICE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CommonConceptsPackage.TIM_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CommonConceptsPackage.TIM_SERVICE__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? getObjective() != null : !OBJECTIVE_EDEFAULT.equals(getObjective());
			case CommonConceptsPackage.TIM_SERVICE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? getConstraint() != null : !CONSTRAINT_EDEFAULT.equals(getConstraint());
			case CommonConceptsPackage.TIM_SERVICE__ACCESS:
				return ACCESS_EDEFAULT == null ? getAccess() != null : !ACCESS_EDEFAULT.equals(getAccess());
			case CommonConceptsPackage.TIM_SERVICE__CONSUMPTION:
				return CONSUMPTION_EDEFAULT == null ? getConsumption() != null : !CONSUMPTION_EDEFAULT.equals(getConsumption());
			case CommonConceptsPackage.TIM_SERVICE__AUTOMATION_LEVEL:
				return AUTOMATION_LEVEL_EDEFAULT == null ? getAutomationLevel() != null : !AUTOMATION_LEVEL_EDEFAULT.equals(getAutomationLevel());
			case CommonConceptsPackage.TIM_SERVICE__DOMAIN:
				return DOMAIN_EDEFAULT == null ? getDomain() != null : !DOMAIN_EDEFAULT.equals(getDomain());
			case CommonConceptsPackage.TIM_SERVICE__NATURE:
				return NATURE_EDEFAULT == null ? getNature() != null : !NATURE_EDEFAULT.equals(getNature());
			case CommonConceptsPackage.TIM_SERVICE__SUB_SERVICES:
				return !getSubServices().isEmpty();
			case CommonConceptsPackage.TIM_SERVICE__MAIN_SERVICE:
				return basicGetMainService() != null;
			case CommonConceptsPackage.TIM_SERVICE__PROCESSES:
				return !getProcesses().isEmpty();
			case CommonConceptsPackage.TIM_SERVICE__RESOURCES:
				return !getResources().isEmpty();
			case CommonConceptsPackage.TIM_SERVICE__MODEL:
				return getModel() != null;
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
		result.append("Service ");
		result.append(this.getName());
		return result.toString();
	}

} //TimServiceImpl
