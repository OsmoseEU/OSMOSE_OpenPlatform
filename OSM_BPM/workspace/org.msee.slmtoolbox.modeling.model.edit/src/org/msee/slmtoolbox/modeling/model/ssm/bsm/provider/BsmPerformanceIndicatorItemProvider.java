/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmPerformanceIndicatorItemProvider
	extends ItemProviderAdapter
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
	public BsmPerformanceIndicatorItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addFormulaPropertyDescriptor(object);
			addRequiredInfoPropertyDescriptor(object);
			addRequiredProcessingPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
			addObjectivesPropertyDescriptor(object);
			addCategory1PropertyDescriptor(object);
			addCategory2PropertyDescriptor(object);
			addCategory3PropertyDescriptor(object);
			addDimensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_id_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_name_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_description_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_unit_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formula feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormulaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_formula_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_formula_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FORMULA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_requiredInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_requiredInfo_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Processing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredProcessingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_requiredProcessing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_requiredProcessing_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_variables_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__VARIABLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objectives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_objectives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_objectives_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__OBJECTIVES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategory1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_category1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_category1_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategory2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_category2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_category2_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategory3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_category3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_category3_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__CATEGORY3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmPerformanceIndicator_dimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmPerformanceIndicator_dimension_feature", "_UI_BsmPerformanceIndicator_type"),
				 BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__DIMENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FIELDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BsmPerformanceIndicator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BsmPerformanceIndicator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BsmPerformanceIndicator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BsmPerformanceIndicator_type") :
			getString("_UI_BsmPerformanceIndicator_type") + " " + label;
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

		switch (notification.getFeatureID(BsmPerformanceIndicator.class)) {
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__ID:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__NAME:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DESCRIPTION:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__UNIT:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FORMULA:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_INFO:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__REQUIRED_PROCESSING:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY1:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY2:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__CATEGORY3:
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__DIMENSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BsmPackage.BSM_PERFORMANCE_INDICATOR__FIELDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR__FIELDS,
				 BsmFactory.eINSTANCE.createBsmPiField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BsmEditPlugin.INSTANCE;
	}

}
