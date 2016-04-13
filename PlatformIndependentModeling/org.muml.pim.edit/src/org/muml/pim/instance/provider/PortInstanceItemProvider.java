/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pim.component.Component;
import org.muml.pim.component.Port;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.provider.ConnectorEndpointInstanceItemProvider;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.provider.MumlEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.muml.pim.instance.PortInstance} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PortInstanceItemProvider extends
		ConnectorEndpointInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addComponentInstancePropertyDescriptor(object);
			addPortConnectorInstancesPropertyDescriptor(object);
			addPortPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected boolean isValidType(ConnectorEndpointInstance instance,
			Object type) {
		if (!super.isValidType(instance, type)) {
			return false;
		}
		if (!(instance instanceof PortInstance)) {
			return false;
		}
		if (!(type instanceof Port)) {
			return false;
		}
		Port port = (Port) type;
		PortInstance portInstance = (PortInstance) instance;
		if (portInstance.getComponentInstance() != null) {
			Component component = portInstance.getComponentInstance()
					.getComponentType();
			if (component != null) {
				if (port != null && port.getComponent() != component) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * This adds a property descriptor for the Component Instance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addComponentInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_componentInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_componentInstance_feature", "_UI_PortInstance_type"),
				 InstancePackage.Literals.PORT_INSTANCE__COMPONENT_INSTANCE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Connector Instances feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortConnectorInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_portConnectorInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_portConnectorInstances_feature", "_UI_PortInstance_type"),
				 InstancePackage.Literals.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_portPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_portPart_feature", "_UI_PortInstance_type"),
				 InstancePackage.Literals.PORT_INSTANCE__PORT_PART,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PortInstance.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PortInstance_type") :
			getString("_UI_PortInstance_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PortInstance.class)) {
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
			case InstancePackage.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES:
			case InstancePackage.PORT_INSTANCE__PORT_PART:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MumlEditPlugin.INSTANCE;
	}

}
