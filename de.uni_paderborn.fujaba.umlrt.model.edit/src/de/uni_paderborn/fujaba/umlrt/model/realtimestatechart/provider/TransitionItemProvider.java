/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.activities.ActivitiesFactory;

import org.storydriven.modeling.calls.CallsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider
	extends PrioritizableItemProvider
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
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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

			addUMLRealtimeTransitionMappingVectorPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addStatechartPropertyDescriptor(object);
			addResetsPropertyDescriptor(object);
			addUrgentPropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
			addEventExprPropertyDescriptor(object);
			addSideEffectExprPropertyDescriptor(object);
			addTimeGuardExprPropertyDescriptor(object);
			addClockResetExprPropertyDescriptor(object);
			addDeadlineExprPropertyDescriptor(object);
			addGuardExprPropertyDescriptor(object);
			addSafetyTransitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UML Realtime Transition Mapping Vector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLRealtimeTransitionMappingVectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_uMLRealtimeTransitionMappingVector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_uMLRealtimeTransitionMappingVector_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_target_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_source_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatechartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_statechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_statechart_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__STATECHART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_resets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_resets_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__RESETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Urgent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrgentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_urgent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_urgent_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__URGENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_guard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_guard_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_eventExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_eventExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__EVENT_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Side Effect Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideEffectExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_sideEffectExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_sideEffectExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__SIDE_EFFECT_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Guard Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeGuardExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_timeGuardExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_timeGuardExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__TIME_GUARD_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clock Reset Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockResetExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_clockResetExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_clockResetExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESET_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlineExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_deadlineExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_deadlineExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__DEADLINE_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_guardExpr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_guardExpr_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__GUARD_EXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safety Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafetyTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_safetyTransition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_safetyTransition_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__SAFETY_TRANSITION,
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
			childrenFeatures.add(SDMPackage.Literals.EXTENDABLE_ELEMENT__ANNOTATION);
			childrenFeatures.add(SDMPackage.Literals.EXTENDABLE_ELEMENT__EXTENSION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__SEND_SYNCHRONIZATION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__RECEIVE_SYNCHRONIZATION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__SIDE_EFFECT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__UML_REALTIME_FLAT_SWITCHING);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__UML_REALTIME_FADING_FUNCTION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_EVENTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__RAISED_EVENTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__TIMEGUARD);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE);
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
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Transition transition = (Transition)object;
		return getString("_UI_Transition_type") + " " + transition.getPriority();
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

		switch (notification.getFeatureID(Transition.class)) {
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
			case RealtimestatechartPackage.TRANSITION__URGENT:
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR:
			case RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR:
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESET_EXPR:
			case RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR:
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
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
				(SDMPackage.Literals.EXTENDABLE_ELEMENT__ANNOTATION,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(SDMPackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(SDMPackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__SEND_SYNCHRONIZATION,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__RECEIVE_SYNCHRONIZATION,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__SIDE_EFFECT,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__UML_REALTIME_FLAT_SWITCHING,
				 RealtimestatechartFactory.eINSTANCE.createFlatSwitching()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__UML_REALTIME_FADING_FUNCTION,
				 RealtimestatechartFactory.eINSTANCE.createFadingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__RAISED_EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__TIMEGUARD,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));
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
			childFeature == RealtimestatechartPackage.Literals.TRANSITION__SEND_SYNCHRONIZATION ||
			childFeature == RealtimestatechartPackage.Literals.TRANSITION__RECEIVE_SYNCHRONIZATION ||
			childFeature == RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_EVENTS ||
			childFeature == RealtimestatechartPackage.Literals.TRANSITION__RAISED_EVENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
