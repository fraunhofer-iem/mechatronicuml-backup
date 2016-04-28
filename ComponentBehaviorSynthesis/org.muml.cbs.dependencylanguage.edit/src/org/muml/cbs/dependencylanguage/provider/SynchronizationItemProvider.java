/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Synchronization;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.pim.actionlanguage.ActionlanguageFactory;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.Synchronization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizationItemProvider
	extends DependencyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationItemProvider(AdapterFactory adapterFactory) {
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

			addChannelNamePropertyDescriptor(object);
			addSelectorTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Channel Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Synchronization_channelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_channelName_feature", "_UI_Synchronization_type"),
				 DependencylanguagePackage.Literals.SYNCHRONIZATION__CHANNEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selector Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Synchronization_selectorType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_selectorType_feature", "_UI_Synchronization_type"),
				 DependencylanguagePackage.Literals.SYNCHRONIZATION__SELECTOR_TYPE,
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
			childrenFeatures.add(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS);
			childrenFeatures.add(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS);
			childrenFeatures.add(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION);
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
	 * This returns Synchronization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Synchronization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Synchronization)object).getChannelName();
		return label == null || label.length() == 0 ?
			getString("_UI_Synchronization_type") :
			getString("_UI_Synchronization_type") + " " + label;
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

		switch (notification.getFeatureID(Synchronization.class)) {
			case DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
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
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 DependencylanguageFactory.eINSTANCE.createDataAssignmentEffect()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));
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
			childFeature == DependencylanguagePackage.Literals.SYNCHRONIZATION__SENDING_EVENTS ||
			childFeature == DependencylanguagePackage.Literals.SYNCHRONIZATION__RECEIVING_EVENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
