/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.provider;


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

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EaExtendedActivityItemProvider
	extends EaFlowNodeItemProvider
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
	public EaExtendedActivityItemProvider(AdapterFactory adapterFactory) {
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

			addMissionPropertyDescriptor(object);
			addFunctionalRulesPropertyDescriptor(object);
			addMinCostPropertyDescriptor(object);
			addMaxCostPropertyDescriptor(object);
			addAverageCostPropertyDescriptor(object);
			addMinTimeDelayPropertyDescriptor(object);
			addMaxTimeDelayPropertyDescriptor(object);
			addAverageTimeDelayPropertyDescriptor(object);
			addIsStartingPropertyDescriptor(object);
			addIsEndingPropertyDescriptor(object);
			addOsmoseWorldPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mission feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_mission_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_mission_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MISSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functional Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_functionalRules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_functionalRules_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_minCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_minCost_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_maxCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_maxCost_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Osmose World feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsmoseWorldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_osmoseWorld_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_osmoseWorld_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Average Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_averageCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_averageCost_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Time Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTimeDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_minTimeDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_minTimeDelay_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Time Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTimeDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_maxTimeDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_maxTimeDelay_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Average Time Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAverageTimeDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_averageTimeDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_averageTimeDelay_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Starting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStartingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_isStarting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_isStarting_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_STARTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ending feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEndingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaExtendedActivity_isEnding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaExtendedActivity_isEnding_feature", "_UI_EaExtendedActivity_type"),
				 CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_ENDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EaExtendedActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EaExtendedActivity_type") :
			getString("_UI_EaExtendedActivity_type") + " " + label;
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

		switch (notification.getFeatureID(EaExtendedActivity.class)) {
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING:
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD:
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
