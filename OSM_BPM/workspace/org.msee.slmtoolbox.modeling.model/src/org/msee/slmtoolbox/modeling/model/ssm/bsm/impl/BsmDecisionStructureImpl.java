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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getBsmModel <em>Bsm Model</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.impl.BsmDecisionStructureImpl#getGgGraiGrids <em>Gg Grai Grids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BsmDecisionStructureImpl extends EObjectImpl implements BsmDecisionStructure {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BsmDecisionStructureImpl() {
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
		return BsmPackage.Literals.BSM_DECISION_STRUCTURE;
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
		return (String)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__ID, BsmPackage.Literals.BSM_DECISION_STRUCTURE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(BsmPackage.BSM_DECISION_STRUCTURE__ID, BsmPackage.Literals.BSM_DECISION_STRUCTURE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__NAME, BsmPackage.Literals.BSM_DECISION_STRUCTURE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(BsmPackage.BSM_DECISION_STRUCTURE__NAME, BsmPackage.Literals.BSM_DECISION_STRUCTURE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmDecision> getDecisions() {
		return (EList<BsmDecision>)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS, BsmPackage.Literals.BSM_DECISION_STRUCTURE__DECISIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BsmOrganization> getOrganizations() {
		return (EList<BsmOrganization>)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS, BsmPackage.Literals.BSM_DECISION_STRUCTURE__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BsmModel getBsmModel() {
		return (BsmModel)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL, BsmPackage.Literals.BSM_DECISION_STRUCTURE__BSM_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBsmModel(BsmModel newBsmModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBsmModel, BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsmModel(BsmModel newBsmModel) {
		eDynamicSet(BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL, BsmPackage.Literals.BSM_DECISION_STRUCTURE__BSM_MODEL, newBsmModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgGraiGrid> getGgGraiGrids() {
		return (EList<GgGraiGrid>)eDynamicGet(BsmPackage.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS, BsmPackage.Literals.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		String nameElement = "DecisionStructure";
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
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisions()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBsmModel((BsmModel)otherEnd, msgs);
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
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				return basicSetBsmModel(null, msgs);
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
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				return eInternalContainer().eInverseRemove(this, BsmPackage.BSM_MODEL__DECISION_STRUCTURES, BsmModel.class, msgs);
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
			case BsmPackage.BSM_DECISION_STRUCTURE__ID:
				return getId();
			case BsmPackage.BSM_DECISION_STRUCTURE__NAME:
				return getName();
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				return getDecisions();
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				return getOrganizations();
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				return getBsmModel();
			case BsmPackage.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS:
				return getGgGraiGrids();
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
			case BsmPackage.BSM_DECISION_STRUCTURE__ID:
				setId((String)newValue);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__NAME:
				setName((String)newValue);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends BsmDecision>)newValue);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends BsmOrganization>)newValue);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				setBsmModel((BsmModel)newValue);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS:
				getGgGraiGrids().clear();
				getGgGraiGrids().addAll((Collection<? extends GgGraiGrid>)newValue);
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
			case BsmPackage.BSM_DECISION_STRUCTURE__ID:
				setId(ID_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				getDecisions().clear();
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				setBsmModel((BsmModel)null);
				return;
			case BsmPackage.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS:
				getGgGraiGrids().clear();
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
			case BsmPackage.BSM_DECISION_STRUCTURE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BsmPackage.BSM_DECISION_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BsmPackage.BSM_DECISION_STRUCTURE__DECISIONS:
				return !getDecisions().isEmpty();
			case BsmPackage.BSM_DECISION_STRUCTURE__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case BsmPackage.BSM_DECISION_STRUCTURE__BSM_MODEL:
				return getBsmModel() != null;
			case BsmPackage.BSM_DECISION_STRUCTURE__GG_GRAI_GRIDS:
				return !getGgGraiGrids().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BsmDecisionStructureImpl
