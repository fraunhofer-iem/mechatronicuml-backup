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
import org.muml.pim.connector.provider.ConnectorInstanceItemProvider;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.provider.MumlEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.pim.instance.PortConnectorInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortConnectorInstanceItemProvider
	extends ConnectorInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConnectorInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addPortConnectorTypePropertyDescriptor(object);
			addPortInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port Connector Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortConnectorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortConnectorInstance_portConnectorType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortConnectorInstance_portConnectorType_feature", "_UI_PortConnectorInstance_type"),
				 InstancePackage.Literals.PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortConnectorInstance_portInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortConnectorInstance_portInstances_feature", "_UI_PortConnectorInstance_type"),
				 InstancePackage.Literals.PORT_CONNECTOR_INSTANCE__PORT_INSTANCES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortConnectorInstance)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_PortConnectorInstance_type") :
			getString("_UI_PortConnectorInstance_type") + " " + label;
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

		switch (notification.getFeatureID(PortConnectorInstance.class)) {
			case InstancePackage.PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE:
			case InstancePackage.PORT_CONNECTOR_INSTANCE__PORT_INSTANCES:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MumlEditPlugin.INSTANCE;
	}

	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator,String displayName,String description,org.eclipse.emf.ecore.EStructuralFeature feature,boolean isSettable,Object staticImage,String category,String[] filterFlags) {
	    return new ocl.OCLItemPropertyDescriptor(adapterFactory,resourceLocator,displayName,description,feature,isSettable,false,false,staticImage,category,filterFlags);
	}
	
	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator, String displayName, String description, org.eclipse.emf.ecore.EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,String category, String[] filterFlags) {
		return new ocl.OCLItemPropertyDescriptor(adapterFactory, resourceLocator, displayName,description,feature,isSettable,multiLine,sortChoices, staticImage, category,filterFlags);
	}
}
