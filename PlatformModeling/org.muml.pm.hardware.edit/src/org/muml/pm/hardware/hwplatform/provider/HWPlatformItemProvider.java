/**
 */
package org.muml.pm.hardware.hwplatform.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.provider.NamedElementItemProvider;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HwplatformFactory;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.provider.HardwareEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.pm.hardware.hwplatform.HWPlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWPlatformItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformItemProvider(AdapterFactory adapterFactory) {
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

			addEmbeddedPlatformPartsPropertyDescriptor(object);
			addNetworkingHardwarePropertyDescriptor(object);
			addDelegationPortsPropertyDescriptor(object);
			addNetworkConnectorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedded Platform Parts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedPlatformPartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatform_embeddedPlatformParts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatform_embeddedPlatformParts_feature", "_UI_HWPlatform_type"),
				 HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Networking Hardware feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkingHardwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatform_networkingHardware_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatform_networkingHardware_feature", "_UI_HWPlatform_type"),
				 HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE,
				 true,
				 false,
				 false,
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
				 getString("_UI_HWPlatform_delegationPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatform_delegationPorts_feature", "_UI_HWPlatform_type"),
				 HwplatformPackage.Literals.HW_PLATFORM__DELEGATION_PORTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HWPlatform_networkConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HWPlatform_networkConnectors_feature", "_UI_HWPlatform_type"),
				 HwplatformPackage.Literals.HW_PLATFORM__NETWORK_CONNECTORS,
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
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS);
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE);
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__DELEGATION_PORTS);
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__NETWORK_CONNECTORS);
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
	 * This returns HWPlatform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWPlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HWPlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HWPlatform_type") :
			getString("_UI_HWPlatform_type") + " " + label;
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

		switch (notification.getFeatureID(HWPlatform.class)) {
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
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
				(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS,
				 HwplatformFactory.eINSTANCE.createHWPlatformPart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS,
				 HwplatformFactory.eINSTANCE.createResourcePart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE,
				 HwplatformFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE,
				 HwplatformFactory.eINSTANCE.createNetworkBridge()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__DELEGATION_PORTS,
				 HwplatformFactory.eINSTANCE.createDelegationHWPort()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORK_CONNECTORS,
				 HwplatformFactory.eINSTANCE.createNetworkConnector()));
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
