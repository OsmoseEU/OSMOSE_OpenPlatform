/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;

/**
 * This is the item provider adapter for a {@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EaProcessItemProvider
	extends EaBaseElementItemProvider
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
	public EaProcessItemProvider(AdapterFactory adapterFactory) {
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

			addCanBePropertyDescriptor(object);
			addOsmioticProcessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Can Be feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaProcess_canBe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaProcess_canBe_feature", "_UI_EaProcess_type"),
				 GeneralElementsPackage.Literals.EA_PROCESS__CAN_BE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Osmiotic Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsmioticProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EaProcess_osmioticProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EaProcess_osmioticProcess_feature", "_UI_EaProcess_type"),
				 GeneralElementsPackage.Literals.EA_PROCESS__OSMIOTIC_PROCESS,
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
			childrenFeatures.add(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS);
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
	 * This returns EaProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EaProcess"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EaProcess)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EaProcess_type") :
			getString("_UI_EaProcess_type") + " " + label;
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

		switch (notification.getFeatureID(EaProcess.class)) {
			case GeneralElementsPackage.EA_PROCESS__OSMIOTIC_PROCESS:
			case GeneralElementsPackage.EA_PROCESS__FLOW_ELEMENTS:
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
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaITResource()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaHumanResource()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaMaterialResource()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaOr()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaDivergingAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaDivergingOr()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaConvergingAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaConvergingOr()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaInternalConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaExternalConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaProcessConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaOutputInputFlow()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaSupportFlow()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaAtomicExtendedActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GeneralElementsPackage.Literals.EA_PROCESS__FLOW_ELEMENTS,
				 CoreElementsFactory.eINSTANCE.createEaStructuralExtendedActivity()));
	}

}
