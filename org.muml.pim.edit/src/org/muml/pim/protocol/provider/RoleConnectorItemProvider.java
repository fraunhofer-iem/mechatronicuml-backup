/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.provider;


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
import org.muml.core.common.descriptor.DefaultChainedPropertyDescriptor;
import org.muml.core.common.descriptor.IChainedPropertyDescriptor;
import org.muml.pim.connector.provider.ConnectorItemProvider;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.provider.MumlEditPlugin;
import org.muml.pim.realtimestatechart.descriptor.EnumerationPropertyDescriptor;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * This is the item provider adapter for a {@link org.muml.pim.protocol.RoleConnector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleConnectorItemProvider
	extends ConnectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnectorItemProvider(AdapterFactory adapterFactory) {
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

			addCoordinationProtocolPropertyDescriptor(object);
			addConnectorQualityOfServiceAssumptionsPropertyDescriptor(object);
			addRolesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Coordination Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinationProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleConnector_coordinationProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleConnector_coordinationProtocol_feature", "_UI_RoleConnector_type"),
				 ProtocolPackage.Literals.ROLE_CONNECTOR__COORDINATION_PROTOCOL,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connector Quality Of Service Assumptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addConnectorQualityOfServiceAssumptionsPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootDescriptor = new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleConnector_connectorQualityOfServiceAssumptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleConnector_connectorQualityOfServiceAssumptions_feature", "_UI_RoleConnector_type"),
				 ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null);

		IChainedPropertyDescriptor maxMessageDelay =
		new DefaultChainedPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ConnectorQualityOfServiceAssumptions_maxMessageDelay_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorQualityOfServiceAssumptions_maxMessageDelay_feature", "_UI_ConnectorQualityOfServiceAssumptions_type"),
			 ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY,
			 false,
			 false,
			 false,
			 null,
			 "QoS Assumptions - Maximum Message Delay",
			 null,
			 rootDescriptor);
		
		itemPropertyDescriptors.add
		(new DefaultChainedPropertyDescriptor
		(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		 getResourceLocator(),
		 getString("_UI_TimeValue_value_feature"),
		 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
		 ValuetypePackage.Literals.TIME_VALUE__VALUE,
		 false,
		 false,
		 false,
		 null,
		 "QoS Assumptions - Maximum Message Delay",
		 null,
		 maxMessageDelay));

	itemPropertyDescriptors.add
	(new EnumerationPropertyDescriptor
		(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		 getResourceLocator(),
		 getString("_UI_TimeValue_unit_feature"),
		 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
		 ValuetypePackage.Literals.TIME_VALUE__UNIT,
		 true,
		 false,
		 false,
		 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
		 "QoS Assumptions - Maximum Message Delay",
		 null,
		 maxMessageDelay));

		itemPropertyDescriptors.add
		(new DefaultChainedPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ConnectorQualityOfServiceAssumptions_messageLossPossible_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorQualityOfServiceAssumptions_messageLossPossible_feature", "_UI_ConnectorQualityOfServiceAssumptions_type"),
			 ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
			 "QoS Assumptions",
			 null,
			 rootDescriptor));
		
		
		
	}

	/**
	 * This adds a property descriptor for the Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleConnector_roles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleConnector_roles_feature", "_UI_RoleConnector_type"),
				 ProtocolPackage.Literals.ROLE_CONNECTOR__ROLES,
				 false,
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
			childrenFeatures.add(ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
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
	 * This returns RoleConnector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleConnector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RoleConnector)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_RoleConnector_type") :
			getString("_UI_RoleConnector_type") + " " + label;
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

		switch (notification.getFeatureID(RoleConnector.class)) {
			case ProtocolPackage.ROLE_CONNECTOR__ROLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
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
				(ProtocolPackage.Literals.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));
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
