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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmModelItemProvider
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
	public BsmModelItemProvider(AdapterFactory adapterFactory) {
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
			addFunctionalitiesPropertyDescriptor(object);
			addDecisionsPropertyDescriptor(object);
			addResourcesPropertyDescriptor(object);
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
				 getString("_UI_BsmModel_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmModel_id_feature", "_UI_BsmModel_type"),
				 BsmPackage.Literals.BSM_MODEL__ID,
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
				 getString("_UI_BsmModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmModel_name_feature", "_UI_BsmModel_type"),
				 BsmPackage.Literals.BSM_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functionalities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmModel_functionalities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmModel_functionalities_feature", "_UI_BsmModel_type"),
				 BsmPackage.Literals.BSM_MODEL__FUNCTIONALITIES,
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
				 getString("_UI_BsmModel_decisions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmModel_decisions_feature", "_UI_BsmModel_type"),
				 BsmPackage.Literals.BSM_MODEL__DECISIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmModel_resources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmModel_resources_feature", "_UI_BsmModel_type"),
				 BsmPackage.Literals.BSM_MODEL__RESOURCES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__SERVICE);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__ORGANIZATIONS);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__PARTNERS);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__STAKEHOLDERS);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__VALUES);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__PRODUCTS);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__FUNCTIONALITIES);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__CUSTOMERS);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__PROCESSES);
			childrenFeatures.add(BsmPackage.Literals.BSM_MODEL__DECISION_STRUCTURES);
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
	 * This returns BsmModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BsmModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BsmModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BsmModel_type") :
			getString("_UI_BsmModel_type") + " " + label;
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

		switch (notification.getFeatureID(BsmModel.class)) {
			case BsmPackage.BSM_MODEL__ID:
			case BsmPackage.BSM_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BsmPackage.BSM_MODEL__SERVICE:
			case BsmPackage.BSM_MODEL__ORGANIZATIONS:
			case BsmPackage.BSM_MODEL__PARTNERS:
			case BsmPackage.BSM_MODEL__STAKEHOLDERS:
			case BsmPackage.BSM_MODEL__VALUES:
			case BsmPackage.BSM_MODEL__PRODUCTS:
			case BsmPackage.BSM_MODEL__FUNCTIONALITIES:
			case BsmPackage.BSM_MODEL__CUSTOMERS:
			case BsmPackage.BSM_MODEL__PROCESSES:
			case BsmPackage.BSM_MODEL__DECISION_STRUCTURES:
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
				(BsmPackage.Literals.BSM_MODEL__SERVICE,
				 BsmFactory.eINSTANCE.createBsmService()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__ORGANIZATIONS,
				 BsmFactory.eINSTANCE.createBsmEnterprise()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__ORGANIZATIONS,
				 BsmFactory.eINSTANCE.createBsmVirtualEnterprise()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__PARTNERS,
				 BsmFactory.eINSTANCE.createBsmPartner()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__STAKEHOLDERS,
				 BsmFactory.eINSTANCE.createBsmStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__VALUES,
				 BsmFactory.eINSTANCE.createBsmValue()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__PRODUCTS,
				 BsmFactory.eINSTANCE.createBsmProduct()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__FUNCTIONALITIES,
				 BsmFactory.eINSTANCE.createBsmFunctionality()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__CUSTOMERS,
				 BsmFactory.eINSTANCE.createBsmCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__PROCESSES,
				 BsmFactory.eINSTANCE.createBsmProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_MODEL__DECISION_STRUCTURES,
				 BsmFactory.eINSTANCE.createBsmDecisionStructure()));
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
