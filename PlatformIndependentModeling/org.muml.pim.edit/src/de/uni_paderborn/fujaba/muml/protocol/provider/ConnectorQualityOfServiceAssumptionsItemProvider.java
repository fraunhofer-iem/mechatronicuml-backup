/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.provider;


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
import org.muml.core.provider.CommentableElementItemProvider;

import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsItemProvider(AdapterFactory adapterFactory) {
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

			addMinMessageDelayPropertyDescriptor(object);
			addMaxMessageDelayPropertyDescriptor(object);
			addMessageLossPossiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Message Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinMessageDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorQualityOfServiceAssumptions_minMessageDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorQualityOfServiceAssumptions_minMessageDelay_feature", "_UI_ConnectorQualityOfServiceAssumptions_type"),
				 ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Message Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMessageDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorQualityOfServiceAssumptions_maxMessageDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorQualityOfServiceAssumptions_maxMessageDelay_feature", "_UI_ConnectorQualityOfServiceAssumptions_type"),
				 ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Loss Possible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageLossPossiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorQualityOfServiceAssumptions_messageLossPossible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorQualityOfServiceAssumptions_messageLossPossible_feature", "_UI_ConnectorQualityOfServiceAssumptions_type"),
				 ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE,
				 true,
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
			childrenFeatures.add(ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY);
			childrenFeatures.add(ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY);
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
	 * This returns ConnectorQualityOfServiceAssumptions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectorQualityOfServiceAssumptions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConnectorQualityOfServiceAssumptions)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectorQualityOfServiceAssumptions_type") :
			getString("_UI_ConnectorQualityOfServiceAssumptions_type") + " " + label;
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

		switch (notification.getFeatureID(ConnectorQualityOfServiceAssumptions.class)) {
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY:
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
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
				(ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY ||
			childFeature == ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return de.uni_paderborn.fujaba.muml.constraint.provider.MumlEditPlugin.INSTANCE;
	}

}
