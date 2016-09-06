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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmOrganizationItemProvider
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
	public BsmOrganizationItemProvider(AdapterFactory adapterFactory) {
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
			addProcessesPropertyDescriptor(object);
			addDecisionsPropertyDescriptor(object);
			addDecisionStructuresPropertyDescriptor(object);
			addGgOrganizationsPropertyDescriptor(object);
			addEaOrganizationsPropertyDescriptor(object);
			addMseServicePropertyDescriptor(object);
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
				 getString("_UI_BsmOrganization_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_id_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__ID,
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
				 getString("_UI_BsmOrganization_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_name_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__NAME,
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
				 getString("_UI_BsmOrganization_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_description_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_processes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_processes_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__PROCESSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decisions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_decisions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_decisions_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__DECISIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decision Structures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionStructuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_decisionStructures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_decisionStructures_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__DECISION_STRUCTURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gg Organizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGgOrganizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_ggOrganizations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_ggOrganizations_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__GG_ORGANIZATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ea Organizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEaOrganizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_eaOrganizations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_eaOrganizations_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__EA_ORGANIZATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mse Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMseServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmOrganization_mseService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmOrganization_mseService_feature", "_UI_BsmOrganization_type"),
				 BsmPackage.Literals.BSM_ORGANIZATION__MSE_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns BsmOrganization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BsmOrganization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BsmOrganization)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BsmOrganization_type") :
			getString("_UI_BsmOrganization_type") + " " + label;
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

		switch (notification.getFeatureID(BsmOrganization.class)) {
			case BsmPackage.BSM_ORGANIZATION__ID:
			case BsmPackage.BSM_ORGANIZATION__NAME:
			case BsmPackage.BSM_ORGANIZATION__DESCRIPTION:
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
