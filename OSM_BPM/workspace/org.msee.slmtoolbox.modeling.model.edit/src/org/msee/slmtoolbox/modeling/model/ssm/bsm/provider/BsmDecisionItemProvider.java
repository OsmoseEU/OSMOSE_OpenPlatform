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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BsmDecisionItemProvider
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
	public BsmDecisionItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addHorizonPropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addObjectivePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addEventPropertyDescriptor(object);
			addDecisionStructurePropertyDescriptor(object);
			addOrganizationPropertyDescriptor(object);
			addBsmModelPropertyDescriptor(object);
			addGgDecisionCentersPropertyDescriptor(object);
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
				 getString("_UI_BsmDecision_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_id_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__ID,
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
				 getString("_UI_BsmDecision_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_name_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_type_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_horizon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_horizon_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__HORIZON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_period_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_period_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__PERIOD,
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
				 getString("_UI_BsmDecision_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_constraint_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__CONSTRAINT,
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
				 getString("_UI_BsmDecision_objective_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_objective_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__OBJECTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_variable_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__VARIABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_event_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_event_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__EVENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decision Structure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionStructurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_decisionStructure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_decisionStructure_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__DECISION_STRUCTURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_organization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_organization_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__ORGANIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bsm Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBsmModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_bsmModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_bsmModel_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__BSM_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gg Decision Centers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGgDecisionCentersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BsmDecision_ggDecisionCenters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BsmDecision_ggDecisionCenters_feature", "_UI_BsmDecision_type"),
				 BsmPackage.Literals.BSM_DECISION__GG_DECISION_CENTERS,
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
			childrenFeatures.add(BsmPackage.Literals.BSM_DECISION__VARIABLES);
			childrenFeatures.add(BsmPackage.Literals.BSM_DECISION__PERFORMANCE_INDICATORS);
			childrenFeatures.add(BsmPackage.Literals.BSM_DECISION__OBJECTIVES);
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
	 * This returns BsmDecision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BsmDecision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BsmDecision)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BsmDecision_type") :
			getString("_UI_BsmDecision_type") + " " + label;
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

		switch (notification.getFeatureID(BsmDecision.class)) {
			case BsmPackage.BSM_DECISION__ID:
			case BsmPackage.BSM_DECISION__NAME:
			case BsmPackage.BSM_DECISION__TYPE:
			case BsmPackage.BSM_DECISION__HORIZON:
			case BsmPackage.BSM_DECISION__PERIOD:
			case BsmPackage.BSM_DECISION__CONSTRAINT:
			case BsmPackage.BSM_DECISION__OBJECTIVE:
			case BsmPackage.BSM_DECISION__VARIABLE:
			case BsmPackage.BSM_DECISION__EVENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BsmPackage.BSM_DECISION__VARIABLES:
			case BsmPackage.BSM_DECISION__PERFORMANCE_INDICATORS:
			case BsmPackage.BSM_DECISION__OBJECTIVES:
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
				(BsmPackage.Literals.BSM_DECISION__VARIABLES,
				 BsmFactory.eINSTANCE.createBsmDecisionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_DECISION__PERFORMANCE_INDICATORS,
				 BsmFactory.eINSTANCE.createBsmPerformanceIndicator()));

		newChildDescriptors.add
			(createChildParameter
				(BsmPackage.Literals.BSM_DECISION__OBJECTIVES,
				 BsmFactory.eINSTANCE.createBsmDecisionObjective()));
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
