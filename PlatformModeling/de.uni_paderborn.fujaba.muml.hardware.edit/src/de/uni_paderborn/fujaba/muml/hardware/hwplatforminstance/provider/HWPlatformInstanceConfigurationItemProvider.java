/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider.HardwareEditPlugin;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.provider.CommentableElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration} object.
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

			addParentHWPlatformInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 HwplatforminstanceFactory.eINSTANCE.createDelegationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createBusConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createBusInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createLinkInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES,
				 HwplatforminstanceFactory.eINSTANCE.createBridgeInstance()));

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
