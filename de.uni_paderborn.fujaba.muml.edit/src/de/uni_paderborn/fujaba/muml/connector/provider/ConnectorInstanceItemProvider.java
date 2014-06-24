/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.core.provider.CommentableElementItemProvider;

import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorInstanceItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addConnectorEndpointInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorInstance_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorInstance_type_feature", "_UI_ConnectorInstance_type"),
				 ConnectorPackage.Literals.CONNECTOR_INSTANCE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				ConnectorInstance instance = (ConnectorInstance) object;
				List<Connector> connectors = new ArrayList<Connector>();
				for (Object value : super.getChoiceOfValues(object)) {
					if (value instanceof Connector && isValidConnectorType((Connector) value, instance)) {
						connectors.add((Connector) value);
					}
				}
				return connectors;
			}
		});
	}
	
	protected boolean isValidConnectorType(Connector value,
			ConnectorInstance instance) {
		return false;
	}

	/**
	 * This adds a property descriptor for the Connector Endpoint Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorEndpointInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorInstance_connectorEndpointInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorInstance_connectorEndpointInstances_feature", "_UI_ConnectorInstance_type"),
				 ConnectorPackage.Literals.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES,
				 true,
				 false,
				 true,
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
		String label = ((ConnectorInstance)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectorInstance_type") :
			getString("_UI_ConnectorInstance_type") + " " + label;
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

}
