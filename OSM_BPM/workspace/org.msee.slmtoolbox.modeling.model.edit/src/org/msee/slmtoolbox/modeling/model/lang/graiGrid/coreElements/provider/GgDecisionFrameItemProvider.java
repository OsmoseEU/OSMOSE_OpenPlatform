/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GgDecisionFrameItemProvider
	extends GgFlowItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GgDecisionFrameItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDecisionVariablePropertyDescriptor(object);
			addObjectivePropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addCriteriaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Decision Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GgDecisionFrame_decisionVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GgDecisionFrame_decisionVariable_feature", "_UI_GgDecisionFrame_type"),
				 CoreElementsPackage.Literals.GG_DECISION_FRAME__DECISION_VARIABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GgDecisionFrame_objective_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GgDecisionFrame_objective_feature", "_UI_GgDecisionFrame_type"),
				 CoreElementsPackage.Literals.GG_DECISION_FRAME__OBJECTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GgDecisionFrame_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GgDecisionFrame_constraint_feature", "_UI_GgDecisionFrame_type"),
				 CoreElementsPackage.Literals.GG_DECISION_FRAME__CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Criteria feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriteriaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GgDecisionFrame_criteria_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GgDecisionFrame_criteria_feature", "_UI_GgDecisionFrame_type"),
				 CoreElementsPackage.Literals.GG_DECISION_FRAME__CRITERIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GgDecisionFrame.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GgDecisionFrame"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GgDecisionFrame)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GgDecisionFrame_type") :
			getString("_UI_GgDecisionFrame_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GgDecisionFrame.class)) {
			case CoreElementsPackage.GG_DECISION_FRAME__DECISION_VARIABLE:
			case CoreElementsPackage.GG_DECISION_FRAME__OBJECTIVE:
			case CoreElementsPackage.GG_DECISION_FRAME__CONSTRAINT:
			case CoreElementsPackage.GG_DECISION_FRAME__CRITERIA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
