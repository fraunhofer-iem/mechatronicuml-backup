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
import org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventConstrainedIntervalConditionItemProvider
	extends ConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConstrainedIntervalConditionItemProvider(AdapterFactory adapterFactory) {
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

			addInitialEnabledPropertyDescriptor(object);
			addEnabledInfitePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventConstrainedIntervalCondition_initialEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventConstrainedIntervalCondition_initialEnabled_feature", "_UI_EventConstrainedIntervalCondition_type"),
				 DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled Infite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledInfitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventConstrainedIntervalCondition_enabledInfite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventConstrainedIntervalCondition_enabledInfite_feature", "_UI_EventConstrainedIntervalCondition_type"),
				 DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE,
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
			childrenFeatures.add(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT);
			childrenFeatures.add(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT);
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
	 * This returns EventConstrainedIntervalCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventConstrainedIntervalCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EventConstrainedIntervalCondition eventConstrainedIntervalCondition = (EventConstrainedIntervalCondition)object;
		return getString("_UI_EventConstrainedIntervalCondition_type") + " " + eventConstrainedIntervalCondition.isInitialEnabled();
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

		switch (notification.getFeatureID(EventConstrainedIntervalCondition.class)) {
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED:
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
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
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));
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
			childFeature == DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT ||
			childFeature == DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
