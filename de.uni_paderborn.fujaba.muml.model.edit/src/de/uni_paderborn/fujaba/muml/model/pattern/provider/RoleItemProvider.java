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
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.descriptor.NaturalNumberPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.pattern.Role} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleItemProvider
	extends DiscreteInteractionPointItemProvider
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

			addIncomingRoleConnectorPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addOutgoingRoleConnectorPropertyDescriptor(object);
			addRoleConnectorPropertyDescriptor(object);
			addIsMultiRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Incoming Role Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingRoleConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_incomingRoleConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_incomingRoleConnector_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__INCOMING_ROLE_CONNECTOR,
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
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	

	/**
	 * This adds a property descriptor for the Is Multi Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMultiRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_isMultiRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_isMultiRole_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__IS_MULTI_ROLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Role_cardinality_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Role_cardinality_feature", "_UI_Role_type"),
				PatternPackage.Literals.ROLE__CARDINALITY, true, false, false,
				null, getString("_UI_CardinalityPropertyCategory"), null);

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Cardinality_lowerBound_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Cardinality_lowerBound_feature",
						"_UI_Cardinality_type"),
				CorePackage.Literals.CARDINALITY__LOWER_BOUND, true, false,
				false, null, getString("_UI_CardinalityPropertyCategory"),
				null, rootPropertyDescriptor));

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Cardinality_upperBound_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Cardinality_upperBound_feature",
						"_UI_Cardinality_type"),
				CorePackage.Literals.CARDINALITY__UPPER_BOUND, true, false,
				false, null, getString("_UI_CardinalityPropertyCategory"),
				null, rootPropertyDescriptor));
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
	 * This adds a property descriptor for the Outgoing Role Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingRoleConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Role_outgoingRoleConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Role_outgoingRoleConnector_feature", "_UI_Role_type"),
				 PatternPackage.Literals.ROLE__OUTGOING_ROLE_CONNECTOR,
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
			childrenFeatures.add(PatternPackage.Literals.ROLE__RECEIVER_MESSAGE_BUFFER);
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Role role = (Role) object;
		StringBuffer b = new StringBuffer();
		if (role.getCoordinationPattern() != null
				&& role.getCoordinationPattern().getName() != null) {
			b.append(role.getCoordinationPattern().getName());
			b.append('.');
		}
		b.append(role.getName());
		String label = b.toString();
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
			case PatternPackage.ROLE__ROLE_CONNECTOR:
			case PatternPackage.ROLE__IS_MULTI_ROLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternPackage.ROLE__CARDINALITY:
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
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
				(PatternPackage.Literals.ROLE__RECEIVER_MESSAGE_BUFFER,
				 PatternFactory.eINSTANCE.createMessageBuffer()));
	}

}
