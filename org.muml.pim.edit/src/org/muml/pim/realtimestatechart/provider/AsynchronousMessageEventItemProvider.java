/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataFactory;

/**
 * This is the item provider adapter for a {@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMessageEventItemProvider
	extends TransitionEventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEventItemProvider(AdapterFactory adapterFactory) {
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

			addMessagePropertyDescriptor(object);
			addOneToManyCommunicationSchemaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsynchronousMessageEvent_message_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsynchronousMessageEvent_message_feature", "_UI_AsynchronousMessageEvent_type"),
				 RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the One To Many Communication Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOneToManyCommunicationSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsynchronousMessageEvent_oneToManyCommunicationSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsynchronousMessageEvent_oneToManyCommunicationSchema_feature", "_UI_AsynchronousMessageEvent_type"),
				 RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 true,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE);
			childrenFeatures.add(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA);
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
	 * This returns AsynchronousMessageEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AsynchronousMessageEvent"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EventKind labelValue = ((AsynchronousMessageEvent)object).getKind();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AsynchronousMessageEvent_type") :
			getString("_UI_AsynchronousMessageEvent_type") + " " + label;
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

		switch (notification.getFeatureID(AsynchronousMessageEvent.class)) {
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
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
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createMulticast()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createUnicast()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createIterate()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createLoadBalancing()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createSingleReceive()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA,
				 One_to_n_schemataFactory.eINSTANCE.createMultiReceive()));
	}

}
