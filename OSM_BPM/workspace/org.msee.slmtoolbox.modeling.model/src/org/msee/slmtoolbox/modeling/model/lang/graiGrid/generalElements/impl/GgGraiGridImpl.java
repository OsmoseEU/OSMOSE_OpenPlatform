/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gg Grai Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getInformationSources <em>Information Sources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GgGraiGridImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GgGraiGridImpl extends GgBaseElementImpl implements GgGraiGrid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GgGraiGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralElementsPackage.Literals.GG_GRAI_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgLevel> getLevels() {
		return (EList<GgLevel>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__LEVELS, GeneralElementsPackage.Literals.GG_GRAI_GRID__LEVELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgFlow> getFlows() {
		return (EList<GgFlow>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__FLOWS, GeneralElementsPackage.Literals.GG_GRAI_GRID__FLOWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgNode> getNodes() {
		return (EList<GgNode>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__NODES, GeneralElementsPackage.Literals.GG_GRAI_GRID__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgFunction> getFunctions() {
		return (EList<GgFunction>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS, GeneralElementsPackage.Literals.GG_GRAI_GRID__FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgInformationSource> getInformationSources() {
		return (EList<GgInformationSource>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES, GeneralElementsPackage.Literals.GG_GRAI_GRID__INFORMATION_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GgOrganization> getOrganizations() {
		return (EList<GgOrganization>)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS, GeneralElementsPackage.Literals.GG_GRAI_GRID__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgModel getModel() {
		return (GgModel)eDynamicGet(GeneralElementsPackage.GG_GRAI_GRID__MODEL, GeneralElementsPackage.Literals.GG_GRAI_GRID__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(GgModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, GeneralElementsPackage.GG_GRAI_GRID__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(GgModel newModel) {
		eDynamicSet(GeneralElementsPackage.GG_GRAI_GRID__MODEL, GeneralElementsPackage.Literals.GG_GRAI_GRID__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Grai Grid ");
		result.append(this.getName());
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLevels()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlows()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformationSources()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((GgModel)otherEnd, msgs);
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				return ((InternalEList<?>)getLevels()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				return ((InternalEList<?>)getInformationSources()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
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
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
				return eInternalContainer().eInverseRemove(this, RootPackage.GG_MODEL__GRAI_GRIDS, GgModel.class, msgs);
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				return getLevels();
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				return getFlows();
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				return getNodes();
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				return getFunctions();
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				return getInformationSources();
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				return getOrganizations();
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				getLevels().clear();
				getLevels().addAll((Collection<? extends GgLevel>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection<? extends GgFlow>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GgNode>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends GgFunction>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				getInformationSources().clear();
				getInformationSources().addAll((Collection<? extends GgInformationSource>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends GgOrganization>)newValue);
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
				setModel((GgModel)newValue);
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				getLevels().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				getFlows().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				getNodes().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				getFunctions().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				getInformationSources().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
				setModel((GgModel)null);
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
			case GeneralElementsPackage.GG_GRAI_GRID__LEVELS:
				return !getLevels().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__FLOWS:
				return !getFlows().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__NODES:
				return !getNodes().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__FUNCTIONS:
				return !getFunctions().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__INFORMATION_SOURCES:
				return !getInformationSources().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case GeneralElementsPackage.GG_GRAI_GRID__MODEL:
				return getModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //GgGraiGridImpl
