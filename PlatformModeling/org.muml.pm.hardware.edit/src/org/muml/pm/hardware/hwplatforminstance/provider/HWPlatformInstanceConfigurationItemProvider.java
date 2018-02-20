/**
 */
package org.muml.pm.hardware.hwplatforminstance.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstanceFactory;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstanceFactory;
import org.muml.pm.hardware.provider.HardwareEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWPlatformInstanceConfigurationItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addHwplatformInstancesPropertyDescriptor(object);
			addNetworkingHardwareInstancesPropertyDescriptor(object);
			addResourcesPropertyDescriptor(object);
			addParentHWPlatformInstancePropertyDescriptor(object);
			addNetworkConnectorInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hwplatform Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHwplatformInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstanceConfiguration_hwplatformInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstanceConfiguration_hwplatformInstances_feature", "_UI_HWPlatformInstanceConfiguration_type"),
				 HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Networking Hardware Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkingHardwareInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstanceConfiguration_networkingHardwareInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstanceConfiguration_networkingHardwareInstances_feature", "_UI_HWPlatformInstanceConfiguration_type"),
				 HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 true,
				 false,
				 false,
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
				 getString("_UI_HWPlatformInstanceConfiguration_resources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstanceConfiguration_resources_feature", "_UI_HWPlatformInstanceConfiguration_type"),
				 HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent HW Platform Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentHWPlatformInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstanceConfiguration_parentHWPlatformInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstanceConfiguration_parentHWPlatformInstance_feature", "_UI_HWPlatformInstanceConfiguration_type"),
				 HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Connector Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkConnectorInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatformInstanceConfiguration_networkConnectorInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatformInstanceConfiguration_networkConnectorInstances_feature", "_UI_HWPlatformInstanceConfiguration_type"),
				 HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES);
			childrenFeatures.add(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES);
			childrenFeatures.add(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES);
			childrenFeatures.add(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES);
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
	 * This returns HWPlatformInstanceConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWPlatformInstanceConfiguration"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HWPlatformInstanceConfiguration)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_HWPlatformInstanceConfiguration_type") :
			getString("_UI_HWPlatformInstanceConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(HWPlatformInstanceConfiguration.class)) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
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
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createHWPlatformInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createBusInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createNetworkBridgeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createStorageMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProcessingMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createCacheInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProgrammableLogicDeviceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProcessorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createStructuredResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createSensorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createActuatorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createNetworkConnectorInstance()));
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
