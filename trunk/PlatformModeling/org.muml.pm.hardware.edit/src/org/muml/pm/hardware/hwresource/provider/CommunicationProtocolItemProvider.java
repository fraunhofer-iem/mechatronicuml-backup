/**
 */
package org.muml.pm.hardware.hwresource.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.provider.NamedElementItemProvider;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory;

/**
 * This is the item provider adapter for a {@link org.muml.pm.hardware.hwresource.CommunicationProtocol} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationProtocolItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocolItemProvider(AdapterFactory adapterFactory) {
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

			addIsTimeTriggeredPropertyDescriptor(object);
			addIsEventTriggeredPropertyDescriptor(object);
			addFurtherInformationPropertyDescriptor(object);
			addIsNetworkingProtocolPropertyDescriptor(object);
			addDataFrameSizePropertyDescriptor(object);
			addBandwidthPropertyDescriptor(object);
			addIsSerialPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Time Triggered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTimeTriggeredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_isTimeTriggered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_isTimeTriggered_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Event Triggered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEventTriggeredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_isEventTriggered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_isEventTriggered_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Further Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFurtherInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_furtherInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_furtherInformation_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Networking Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsNetworkingProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_isNetworkingProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_isNetworkingProtocol_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Frame Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFrameSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_dataFrameSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_dataFrameSize_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_bandwidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_bandwidth_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__BANDWIDTH,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Serial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSerialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationProtocol_isSerial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationProtocol_isSerial_feature", "_UI_CommunicationProtocol_type"),
				 HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__IS_SERIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE);
			childrenFeatures.add(HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__BANDWIDTH);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CommunicationProtocol)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CommunicationProtocol_type") :
			getString("_UI_CommunicationProtocol_type") + " " + label;
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

		switch (notification.getFeatureID(CommunicationProtocol.class)) {
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
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
				(HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE,
				 HwvaluetypeFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.COMMUNICATION_PROTOCOL__BANDWIDTH,
				 HwvaluetypeFactory.eINSTANCE.createDataRate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return org.muml.pm.hardware.provider.HardwareEditPlugin.INSTANCE;
	}

}
