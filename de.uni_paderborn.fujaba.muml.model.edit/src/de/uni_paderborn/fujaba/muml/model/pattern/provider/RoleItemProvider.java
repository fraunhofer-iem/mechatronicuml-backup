/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.descriptor.RoleCardinalityPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.pattern.Role} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleItemProvider
	extends NamedElementItemProvider
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
	public RoleItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintPropertyDescriptor(object);
			addBehaviorPropertyDescriptor(object);
			addRoleConnectorPropertyDescriptor(object);
			addEClassPropertyDescriptor(object);
			addSenderMessageInterfacePropertyDescriptor(object);
			addReceiverMessageInterfacePropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addRoleAndAdaptationBehaviorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstrainableElement_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstrainableElement_constraint_feature", "_UI_ConstrainableElement_type"),
				 CorePackage.Literals.CONSTRAINABLE_ELEMENT__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_roleConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_roleConnector_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__ROLE_CONNECTOR,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_eClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_eClass_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__ECLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 getString("_UI_Role_senderMessageInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_senderMessageInterface_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__SENDER_MESSAGE_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 getString("_UI_Role_receiverMessageInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_receiverMessageInterface_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__RECEIVER_MESSAGE_INTERFACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		// itemPropertyDescriptors.add
		// (createItemPropertyDescriptor
		// (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(),
		// getString("_UI_Role_cardinality_feature"),
		// getString("_UI_PropertyDescriptor_description",
		// "_UI_Role_cardinality_feature", "_UI_Role_type"),
		// PatternPackage.Literals.ROLE__CARDINALITY,
		// true,
		// false,
		// true,
		// null,
		// null,
		// null));
		itemPropertyDescriptors.add(new RoleCardinalityPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				"Lower Bound", "The lower bound of the Role's Cardinality",
				CorePackage.Literals.CARDINALITY__LOWER_BOUND, true, false,
				true, null, null, null));

		itemPropertyDescriptors.add(new RoleCardinalityPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				"Upper Bound", "The upper bound of the Role's Cardinality",
				CorePackage.Literals.CARDINALITY__UPPER_BOUND, true, false,
				true, null, null, null));

	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_port_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__PORT,
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
				 getString("_UI_Role_roleAndAdaptationBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_roleAndAdaptationBehavior_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(PatternPackage.Literals.ROLE__CARDINALITY);
			childrenFeatures.add(PatternPackage.Literals.ROLE__ADAPTATION_BEHAVIOR);
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
	 * This returns Role.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Role"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Role)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Role_type") :
			getString("_UI_Role_type") + " " + label;
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

		switch (notification.getFeatureID(Role.class)) {
			case PatternPackage.ROLE__CARDINALITY:
			case PatternPackage.ROLE__ADAPTATION_BEHAVIOR:
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
				(PatternPackage.Literals.ROLE__CARDINALITY,
				 CoreFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.ROLE__ADAPTATION_BEHAVIOR,
				 RealtimestatechartFactory.eINSTANCE.createFujabaRealtimeStatechart()));
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
