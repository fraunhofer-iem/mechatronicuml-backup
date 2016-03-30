/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.provider;


import java.util.ArrayList;
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
import org.muml.core.CorePackage;
import org.muml.core.common.descriptor.DefaultChainedPropertyDescriptor;
import org.muml.core.common.descriptor.IChainedPropertyDescriptor;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.connector.ConnectorFactory;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.descriptor.NaturalNumberPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.muml.pim.connector.DiscreteInteractionEndpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteInteractionEndpointItemProvider
	extends ConnectorEndpointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInteractionEndpointItemProvider(AdapterFactory adapterFactory) {
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

			addBehaviorPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addSenderMessageTypesPropertyDescriptor(object);
			addReceiverMessageTypesPropertyDescriptor(object);
			addCoordinatorBehaviorPropertyDescriptor(object);
			addSubroleBehaviorPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addReceiverMessageBufferPropertyDescriptor(object);
			addMultiPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehavioralElement_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehavioralElement_behavior_feature", "_UI_BehavioralElement_type"),
				 BehaviorPackage.Literals.BEHAVIORAL_ELEMENT__BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 CorePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	public static class MessageTypeItemPropertyDescriptor extends ItemPropertyDescriptor {
		public MessageTypeItemPropertyDescriptor(
			AdapterFactory adapterFactory,
			ResourceLocator resourceLocator,
			String displayName,
			String description,
			EStructuralFeature feature, 
			boolean isSettable,
			boolean multiLine,
			boolean sortChoices,
			Object staticImage,
			String category,
			String [] filterFlags)
		{  
			super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
		}
	
		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			List<Object> values = new ArrayList<Object>();
			List<MessageTypeRepository> repositories = new ArrayList<MessageTypeRepository>();
			for (Object value : super.getChoiceOfValues(object)) {
				if (value instanceof MessageType) {
					MessageType messageType = (MessageType) value;
					MessageTypeRepository repository = messageType.getRepository();
					if (repository != null && !repositories.contains(repository)) {
						repositories.add(repository);
						values.add(repository);
					}
				}
				values.add(value);
			}
			return values;
		}
		  
		@Override
		public void setPropertyValue(Object object, Object values) {
			List<MessageType> messageTypes = new ArrayList<MessageType>();
			for (Object value : (List<?>) values) {
				if (value instanceof MessageType) {
					if (!messageTypes.contains(value)) {
						messageTypes.add((MessageType) value);
					}
				} else if (value instanceof MessageTypeRepository) {
					MessageTypeRepository repository = (MessageTypeRepository) value;
					messageTypes.removeAll(repository.getMessageTypes());
					messageTypes.addAll(repository.getMessageTypes());
				}
			}
			super.setPropertyValue(object, messageTypes);
		}
	}

	/**
	 * This adds a property descriptor for the Sender Message Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSenderMessageTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new MessageTypeItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_senderMessageTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_senderMessageTypes_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receiver Message Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addReceiverMessageTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new MessageTypeItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_receiverMessageTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_receiverMessageTypes_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordinator Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinatorBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_coordinatorBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_coordinatorBehavior_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subrole Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubroleBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_subroleBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_subroleBehavior_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_cardinality_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null);

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cardinality_lowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cardinality_lowerBound_feature", "_UI_Cardinality_type"),
				 ValuetypePackage.Literals.CARDINALITY__LOWER_BOUND,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_CardinalityPropertyCategory"),
				 null,
				 rootPropertyDescriptor));

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cardinality_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cardinality_upperBound_feature", "_UI_Cardinality_type"),
				 ValuetypePackage.Literals.CARDINALITY__UPPER_BOUND,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_CardinalityPropertyCategory"),
				 null,
				 rootPropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Receiver Message Buffer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiverMessageBufferPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_receiverMessageBuffer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_receiverMessageBuffer_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_multi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_multi_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__MULTI,
				 false,
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
			childrenFeatures.add(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY);
			childrenFeatures.add(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER);
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
		String label = ((DiscreteInteractionEndpoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscreteInteractionEndpoint_type") :
			getString("_UI_DiscreteInteractionEndpoint_type") + " " + label;
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

		switch (notification.getFeatureID(DiscreteInteractionEndpoint.class)) {
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME:
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
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
				(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));
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
