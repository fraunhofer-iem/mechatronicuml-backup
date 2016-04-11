/**
 */
package org.muml.psm.muml_container.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_DDS;

/**
 * This is the item provider adapter for a {@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortInstanceConfiguration_DDSItemProvider extends PortInstanceConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceConfiguration_DDSItemProvider(AdapterFactory adapterFactory) {
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

			addDomainIDPropertyDescriptor(object);
			addPartitionIDPropertyDescriptor(object);
			addPublisherPropertyDescriptor(object);
			addSubscriberPropertyDescriptor(object);
			addDomainParticipantPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_DDS_domainID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_DDS_domainID_feature", "_UI_PortInstanceConfiguration_DDS_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partition ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_DDS_partitionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_DDS_partitionID_feature", "_UI_PortInstanceConfiguration_DDS_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publisher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublisherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_DDS_publisher_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_DDS_publisher_feature", "_UI_PortInstanceConfiguration_DDS_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscriber feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_DDS_subscriber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_DDS_subscriber_feature", "_UI_PortInstanceConfiguration_DDS_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Participant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainParticipantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstanceConfiguration_DDS_domainParticipant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstanceConfiguration_DDS_domainParticipant_feature", "_UI_PortInstanceConfiguration_DDS_type"),
				 Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PortInstanceConfiguration_DDS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortInstanceConfiguration_DDS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PortInstanceConfiguration_DDS portInstanceConfiguration_DDS = (PortInstanceConfiguration_DDS)object;
		return getString("_UI_PortInstanceConfiguration_DDS_type") + " " + portInstanceConfiguration_DDS.getDomainID();
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

		switch (notification.getFeatureID(PortInstanceConfiguration_DDS.class)) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID:
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID:
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

}
