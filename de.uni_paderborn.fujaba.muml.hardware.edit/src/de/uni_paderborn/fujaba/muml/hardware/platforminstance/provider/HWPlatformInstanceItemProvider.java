/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.provider.HardwareEditPlugin;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWPlatformInstanceItemProvider
	extends NamedElementItemProvider
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
	public HWPlatformInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addHwplatformTypePropertyDescriptor(object);
			addDelegationPortsPropertyDescriptor(object);
			addDelegationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hwplatform Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHwplatformTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstance_hwplatformType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstance_hwplatformType_feature", "_UI_HWPlatformInstance_type"),
				 PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delegation Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegationPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstance_delegationPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstance_delegationPorts_feature", "_UI_HWPlatformInstance_type"),
				 PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATION_PORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delegations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstance_delegations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstance_delegations_feature", "_UI_HWPlatformInstance_type"),
				 PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATIONS,
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
			childrenFeatures.add(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES);
			childrenFeatures.add(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES);
			childrenFeatures.add(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES);
			childrenFeatures.add(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATION_PORTS);
			childrenFeatures.add(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATIONS);
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
	 * This returns HWPlatformInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWPlatformInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HWPlatformInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HWPlatformInstance_type") :
			getString("_UI_HWPlatformInstance_type") + " " + label;
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

		switch (notification.getFeatureID(HWPlatformInstance.class)) {
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DERIVED_BRIDGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
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
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createStorageMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProcessingMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createCacheInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProgrammableLogicDeviceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProcessorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createStructuredResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createSensorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createActuatorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES,
				 PlatformFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES,
				 PlatformFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES,
				 PlatformFactory.eINSTANCE.createBridge()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES,
				 PlatforminstanceFactory.eINSTANCE.createHWPlatformInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATION_PORTS,
				 PlatformFactory.eINSTANCE.createBusPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATION_PORTS,
				 PlatformFactory.eINSTANCE.createLinkPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DELEGATIONS,
				 PlatformFactory.eINSTANCE.createDelegation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HardwareEditPlugin.INSTANCE;
	}

}
