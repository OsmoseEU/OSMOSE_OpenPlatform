/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmCustomerItemProvider
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
	public BsmCustomerItemProvider(AdapterFactory adapterFactory) {
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
			addCategoriesPropertyDescriptor(object);
			addLevelOfEducationPropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addAgePropertyDescriptor(object);
			addAnnualRevenueRangePropertyDescriptor(object);
			addRequirementPropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addTargetedUsageFreqPropertyDescriptor(object);
			addServicePropertyDescriptor(object);
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
				 getString("_UI_BsmCustomer_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_id_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__ID,
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
				 getString("_UI_BsmCustomer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_name_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level Of Education feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelOfEducationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_levelOfEducation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_levelOfEducation_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__LEVEL_OF_EDUCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_categories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_categories_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__CATEGORIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_gender_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_gender_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__GENDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_age_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_age_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__AGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annual Revenue Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnualRevenueRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_annualRevenueRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_annualRevenueRange_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Targeted Usage Freq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetedUsageFreqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_targetedUsageFreq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_targetedUsageFreq_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__TARGETED_USAGE_FREQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requirement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_requirement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_requirement_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__REQUIREMENT,
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
				 getString("_UI_BsmCustomer_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_constraint_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__CONSTRAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmCustomer_service_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmCustomer_service_feature", "_UI_BsmCustomer_type"),
				 BsmPackage.Literals.BSM_CUSTOMER__SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns BsmCustomer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BsmCustomer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BsmCustomer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BsmCustomer_type") :
			getString("_UI_BsmCustomer_type") + " " + label;
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

		switch (notification.getFeatureID(BsmCustomer.class)) {
			case BsmPackage.BSM_CUSTOMER__ID:
			case BsmPackage.BSM_CUSTOMER__NAME:
			case BsmPackage.BSM_CUSTOMER__CATEGORIES:
			case BsmPackage.BSM_CUSTOMER__LEVEL_OF_EDUCATION:
			case BsmPackage.BSM_CUSTOMER__GENDER:
			case BsmPackage.BSM_CUSTOMER__AGE:
			case BsmPackage.BSM_CUSTOMER__ANNUAL_REVENUE_RANGE:
			case BsmPackage.BSM_CUSTOMER__REQUIREMENT:
			case BsmPackage.BSM_CUSTOMER__CONSTRAINT:
			case BsmPackage.BSM_CUSTOMER__TARGETED_USAGE_FREQ:
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
		return BsmEditPlugin.INSTANCE;
	}

}
