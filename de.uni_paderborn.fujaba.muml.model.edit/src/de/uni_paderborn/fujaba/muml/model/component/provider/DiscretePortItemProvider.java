/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.provider;


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

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort} object.
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
			addRefinesPropertyDescriptor(object);
			addSenderMessageInterfacePropertyDescriptor(object);
			addReceiverMessageInterfacePropertyDescriptor(object);
			addAdaptationBehaviorPropertyDescriptor(object);
			addRoleAndAdaptationBehaviorPropertyDescriptor(object);
			addIsDiscreteInPortPropertyDescriptor(object);
			addIsDiscreteOutPortPropertyDescriptor(object);
			addIsDiscreteInOutPortPropertyDescriptor(object);
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
				 CorePackage.Literals.BEHAVIORAL_ELEMENT__BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BehaviorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_refines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_refines_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__REFINES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sender Message Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSenderMessageInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_senderMessageInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_senderMessageInterface_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_MessageInterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Receiver Message Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiverMessageInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscretePort_receiverMessageInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_receiverMessageInterface_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_MessageInterfacePropertyCategory"),
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
				 getString("_UI_DiscretePort_adaptationBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_adaptationBehavior_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__ADAPTATION_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BehaviorPropertyCategory"),
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
				 getString("_UI_DiscretePort_roleAndAdaptationBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscretePort_roleAndAdaptationBehavior_feature", "_UI_DiscretePort_type"),
				 ComponentPackage.Literals.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BehaviorPropertyCategory"),
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
