/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.provider;


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

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.ConnectorFactory;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.descriptor.NaturalNumberPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.component.DiscretePort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscretePortItemProvider
	extends PortItemProvider
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
	public DiscretePortItemProvider(AdapterFactory adapterFactory) {
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
			addSenderMessageTypesPropertyDescriptor(object);
			addReceiverMessageTypesPropertyDescriptor(object);
			addAdaptationBehaviorPropertyDescriptor(object);
			addRoleAndAdaptationBehaviorPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addReceiverMessageBufferPropertyDescriptor(object);
			addRefinedRolePropertyDescriptor(object);
			addIsDiscreteInPortPropertyDescriptor(object);
			addIsDiscreteOutPortPropertyDescriptor(object);
			addIsDiscreteInOutPortPropertyDescriptor(object);
			addMultiPortPropertyDescriptor(object);
			addCoordinationProtocolPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Sender Message Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSenderMessageTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
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
	 * @generated
	 */
	protected void addReceiverMessageTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
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
	 * This adds a property descriptor for the Adaptation Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdaptationBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_adaptationBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_adaptationBehavior_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__ADAPTATION_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role And Adaptation Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleAndAdaptationBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInteractionEndpoint_roleAndAdaptationBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInteractionEndpoint_roleAndAdaptationBehavior_feature", "_UI_DiscreteInteractionEndpoint_type"),
				 ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__ROLE_AND_ADAPTATION_BEHAVIOR,
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
	 * This adds a property descriptor for the Refined Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_refinedRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_refinedRole_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Discrete In Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDiscreteInPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_isDiscreteInPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_isDiscreteInPort_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_IN_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Discrete Out Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDiscreteOutPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_isDiscreteOutPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_isDiscreteOutPort_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_OUT_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Discrete In Out Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDiscreteInOutPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_isDiscreteInOutPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_isDiscreteInOutPort_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_multiPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_multiPort_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__MULTI_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DiscretePort_coordinationProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_coordinationProtocol_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__COORDINATION_PROTOCOL,
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
	 * This returns DiscretePort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiscretePort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiscretePort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscretePort_type") :
			getString("_UI_DiscretePort_type") + " " + label;
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

		switch (notification.getFeatureID(DiscretePort.class)) {
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT:
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT:
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT:
			case ComponentPackage.DISCRETE_PORT__MULTI_PORT:
			case ComponentPackage.DISCRETE_PORT__COORDINATION_PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
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

}
