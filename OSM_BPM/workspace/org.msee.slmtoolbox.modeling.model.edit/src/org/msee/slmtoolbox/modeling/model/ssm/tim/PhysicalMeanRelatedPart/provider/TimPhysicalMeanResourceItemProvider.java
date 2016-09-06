/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.provider.TimResourceItemProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;

import org.msee.slmtoolbox.modeling.model.ssm.tim.provider.TimEditPlugin;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimPhysicalMeanResourceItemProvider
	extends TimResourceItemProvider
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
	public TimPhysicalMeanResourceItemProvider(AdapterFactory adapterFactory) {
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

			addCapabilityPropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addOperationModePropertyDescriptor(object);
			addTechnicalCharacteristicsPropertyDescriptor(object);
			addExpectedPerformancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimPhysicalMeanResource_capability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimPhysicalMeanResource_capability_feature", "_UI_TimPhysicalMeanResource_type"),
				 PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY,
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
				 getString("_UI_TimPhysicalMeanResource_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimPhysicalMeanResource_constraint_feature", "_UI_TimPhysicalMeanResource_type"),
				 PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimPhysicalMeanResource_operationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimPhysicalMeanResource_operationMode_feature", "_UI_TimPhysicalMeanResource_type"),
				 PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technical Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnicalCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimPhysicalMeanResource_technicalCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimPhysicalMeanResource_technicalCharacteristics_feature", "_UI_TimPhysicalMeanResource_type"),
				 PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expected Performance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectedPerformancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimPhysicalMeanResource_expectedPerformance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimPhysicalMeanResource_expectedPerformance_feature", "_UI_TimPhysicalMeanResource_type"),
				 PhysicalMeanRelatedPartPackage.Literals.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TimPhysicalMeanResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimPhysicalMeanResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimPhysicalMeanResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimPhysicalMeanResource_type") :
			getString("_UI_TimPhysicalMeanResource_type") + " " + label;
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

		switch (notification.getFeatureID(TimPhysicalMeanResource.class)) {
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CAPABILITY:
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__CONSTRAINT:
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__OPERATION_MODE:
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__TECHNICAL_CHARACTERISTICS:
			case PhysicalMeanRelatedPartPackage.TIM_PHYSICAL_MEAN_RESOURCE__EXPECTED_PERFORMANCE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimEditPlugin.INSTANCE;
	}

}
