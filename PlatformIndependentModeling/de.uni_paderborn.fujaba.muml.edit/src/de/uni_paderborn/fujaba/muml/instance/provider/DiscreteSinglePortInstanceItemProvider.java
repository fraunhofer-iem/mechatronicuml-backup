/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteSinglePortInstanceItemProvider
	extends DiscretePortInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSinglePortInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addMultiInteractionEndpointInstancePropertyDescriptor(object);
			addNextPropertyDescriptor(object);
			addPreviousPropertyDescriptor(object);
			addFirstPropertyDescriptor(object);
			addLastPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Multi Interaction Endpoint Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiInteractionEndpointInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteSingleInteractionEndpointInstance_multiInteractionEndpointInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteSingleInteractionEndpointInstance_multiInteractionEndpointInstance_feature", "_UI_DiscreteSingleInteractionEndpointInstance_type"),
				 ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteSingleInteractionEndpointInstance_next_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteSingleInteractionEndpointInstance_next_feature", "_UI_DiscreteSingleInteractionEndpointInstance_type"),
				 ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteSingleInteractionEndpointInstance_previous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteSingleInteractionEndpointInstance_previous_feature", "_UI_DiscreteSingleInteractionEndpointInstance_type"),
				 ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteSingleInteractionEndpointInstance_first_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteSingleInteractionEndpointInstance_first_feature", "_UI_DiscreteSingleInteractionEndpointInstance_type"),
				 ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteSingleInteractionEndpointInstance_last_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteSingleInteractionEndpointInstance_last_feature", "_UI_DiscreteSingleInteractionEndpointInstance_type"),
				 ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
		
		if (!(instance instanceof DiscreteSinglePortInstance)) {
			return false;
		}
		DiscreteSinglePortInstance singleInstance = (DiscreteSinglePortInstance) instance;
		DiscreteMultiInteractionEndpointInstance multiInstance = singleInstance.getMultiInteractionEndpointInstance();
		if (multiInstance != null && multiInstance.getType() != type) {
			return false;
		}
		
		return true;
	}
	
	
	
	
	/**
	 * This returns DiscreteSinglePortInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiscreteSinglePortInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiscreteSinglePortInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscreteSinglePortInstance_type") :
			getString("_UI_DiscreteSinglePortInstance_type") + " " + label;
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

		switch (notification.getFeatureID(DiscreteSinglePortInstance.class)) {
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__FIRST:
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__LAST:
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
