/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.provider;


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

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationMediaItemProvider
	extends CommunicationResourceItemProvider
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
	public CommunicationMediaItemProvider(AdapterFactory adapterFactory) {
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

			addIsSerialPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addConnectedHWPortPartsPropertyDescriptor(object);
			addConnectedBridgesPropertyDescriptor(object);
			addConnectedHWPortInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CommunicationMedia_isSerial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMedia_isSerial_feature", "_UI_CommunicationMedia_type"),
				 PlatformPackage.Literals.COMMUNICATION_MEDIA__IS_SERIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMedia_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMedia_protocol_feature", "_UI_CommunicationMedia_type"),
				 PlatformPackage.Literals.COMMUNICATION_MEDIA__PROTOCOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected HW Port Parts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedHWPortPartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMedia_connectedHWPortParts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMedia_connectedHWPortParts_feature", "_UI_CommunicationMedia_type"),
				 PlatformPackage.Literals.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected Bridges feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedBridgesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMedia_connectedBridges_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMedia_connectedBridges_feature", "_UI_CommunicationMedia_type"),
				 PlatformPackage.Literals.COMMUNICATION_MEDIA__CONNECTED_BRIDGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected HW Port Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedHWPortInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMedia_connectedHWPortInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMedia_connectedHWPortInstances_feature", "_UI_CommunicationMedia_type"),
				 PlatformPackage.Literals.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES,
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
			childrenFeatures.add(PlatformPackage.Literals.COMMUNICATION_MEDIA__DATA_FRAME_SIZE);
			childrenFeatures.add(PlatformPackage.Literals.COMMUNICATION_MEDIA__BANDWIDTH);
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
		String label = ((CommunicationMedia)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_CommunicationMedia_type") :
			getString("_UI_CommunicationMedia_type") + " " + label;
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

		switch (notification.getFeatureID(CommunicationMedia.class)) {
			case PlatformPackage.COMMUNICATION_MEDIA__IS_SERIAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PlatformPackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
			case PlatformPackage.COMMUNICATION_MEDIA__BANDWIDTH:
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
				(PlatformPackage.Literals.COMMUNICATION_MEDIA__DATA_FRAME_SIZE,
				 HwvaluetypeFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(PlatformPackage.Literals.COMMUNICATION_MEDIA__BANDWIDTH,
				 HwvaluetypeFactory.eINSTANCE.createDataRate()));
	}

}
