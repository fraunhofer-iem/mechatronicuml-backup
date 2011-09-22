/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider;


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
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.descriptor.NaturalNumberPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor.MessageInstanceOfPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor.TransitionMessageEventPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition} object.
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

			addSynchronizationPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addClockResetsPropertyDescriptor(object);
			addTriggerMessageEventPropertyDescriptor(object);
			addRaiseMessageEventPropertyDescriptor(object);
			addClockConstraintsPropertyDescriptor(object);
			addAbsoluteDeadlinesPropertyDescriptor(object);
			addRelativeDeadlinePropertyDescriptor(object);
			addBlockablePropertyDescriptor(object);
			addUrgentPropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Synchronization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSynchronizationPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_synchronization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_synchronization_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_SynchronizationPropertyCategory"),
				 null);

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Invocation_callee_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Invocation_callee_feature", "_UI_Invocation_type"),
						CallsPackage.Literals.INVOCATION__CALLEE,
						true,
						false,
						false,
						null,
						getString("_UI_SynchronizationPropertyCategory"),
						null,
						rootPropertyDescriptor));
		
		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Synchronization_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_kind_feature", "_UI_Synchronization_type"),
						RealtimestatechartPackage.Literals.SYNCHRONIZATION__KIND,
						true,
						false,
						false,
						null,
						getString("_UI_SynchronizationPropertyCategory"),
						null,
						rootPropertyDescriptor));
		
		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Invocation_ownedParameterBindings_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_Invocation_ownedParameterBindings_feature",
								"_UI_Invocation_type"),
						CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
						true,
						false,
						false,
						null,
						getString("_UI_SynchronizationPropertyCategory"),
						null,
						rootPropertyDescriptor));
		
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
	 * This adds a property descriptor for the Clock Resets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockResetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_clockResets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_clockResets_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Message Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTriggerMessageEventPropertyDescriptor(Object object) {
		TransitionMessageEventPropertyDescriptor rootPropertyDescriptor = new TransitionMessageEventPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_triggerMessageEvent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_triggerMessageEvent_feature",
						"_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__EVENTS,
				true, false, true, null,
				getString("_UI_TriggerMessageEventPropertyCategory"), null);
		
		rootPropertyDescriptor.setInstanceClass(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT);
		rootPropertyDescriptor.setEventKind(EventKind.TRIGGER);

		IChainedPropertyDescriptor messagePropertyDescriptor = new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_AsynchronousMessageEvent_message_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_AsynchronousMessageEvent_message_feature", "_UI_AsynchronousMessageEvent_type"),
			 RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
			 true,
			 false,
			 false,
			 null,
			 getString("_UI_TriggerMessageEventPropertyCategory"),
			 null,
			 rootPropertyDescriptor);
		
		itemPropertyDescriptors.add(new MessageInstanceOfPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Message_instanceOf_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Message_instanceOf_feature", "_UI_Message_type"),
			 RealtimestatechartPackage.Literals.MESSAGE__INSTANCE_OF,
			 true,
			 false,
			 true,
			 null,
			 getString("_UI_TriggerMessageEventPropertyCategory"),
			 null,
			 messagePropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Invocation_ownedParameterBindings_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Invocation_ownedParameterBindings_feature", "_UI_Invocation_type"),
			CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
			true,
			false,
			false,
			null,
			getString("_UI_TriggerMessageEventPropertyCategory"),
			null,
			messagePropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Raise Message Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRaiseMessageEventPropertyDescriptor(Object object) {
		TransitionMessageEventPropertyDescriptor rootPropertyDescriptor = new TransitionMessageEventPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_raiseMessageEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_raiseMessageEvent_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__EVENTS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RaiseMessageEventPropertyCategory"),
				 null);
		
		rootPropertyDescriptor.setInstanceClass(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT);
		rootPropertyDescriptor.setEventKind(EventKind.RAISE);

		IChainedPropertyDescriptor messagePropertyDescriptor = new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_AsynchronousMessageEvent_message_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_AsynchronousMessageEvent_message_feature", "_UI_AsynchronousMessageEvent_type"),
			 RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
			 true,
			 false,
			 false,
			 null,
			 getString("_UI_RaiseMessageEventPropertyCategory"),
			 null,
			 rootPropertyDescriptor);
		
		itemPropertyDescriptors.add(new MessageInstanceOfPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Message_instanceOf_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Message_instanceOf_feature", "_UI_Message_type"),
			 RealtimestatechartPackage.Literals.MESSAGE__INSTANCE_OF,
			 true,
			 false,
			 true,
			 null,
			 getString("_UI_RaiseMessageEventPropertyCategory"),
			 null,
			 messagePropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Invocation_ownedParameterBindings_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Invocation_ownedParameterBindings_feature", "_UI_Invocation_type"),
			CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
			true,
			false,
			false,
			null,
			getString("_UI_RaiseMessageEventPropertyCategory"),
			null,
			messagePropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Clock Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_clockConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_clockConstraints_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__CLOCK_CONSTRAINTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

/**
	 * This adds a property descriptor for the Absolute Deadlines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsoluteDeadlinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_absoluteDeadlines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_absoluteDeadlines_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

/**
	 * This adds a property descriptor for the Relative Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRelativeDeadlinePropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_relativeDeadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_relativeDeadline_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_RelativeDeadlinePropertyCategory"),
				 null);
		
		
		itemPropertyDescriptors
				.add(new NaturalNumberPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Deadline_lowerBound_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Deadline_lowerBound_feature",
								"_UI_Deadline_type"),
						RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
						true,
						false,
						true,
						null,
						getString("_UI_RelativeDeadlinePropertyCategory"),
						null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new NaturalNumberPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Deadline_upperBound_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Deadline_upperBound_feature",
								"_UI_Deadline_type"),
						RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
						true,
						false,
						true,
						null,
						getString("_UI_RelativeDeadlinePropertyCategory"),
						null,
						rootPropertyDescriptor));

	}

	/**
	 * This adds a property descriptor for the Blockable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_blockable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_blockable_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__BLOCKABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	 * @generated NOT
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		DefaultChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_guard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_guard_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GuardPropertyCategory"),
				 null);
		rootPropertyDescriptor.setInstanceClass(ExpressionsPackage.Literals.TEXTUAL_EXPRESSION);
		

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_expressionText_feature"), getString("_UI_PropertyDescriptor_description", "_UI_TextualExpression_expressionText_feature", "_UI_TextualExpression_type"),
						org.storydriven.modeling.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
						true,
						false,
						false,
						null,
						getString("_UI_GuardPropertyCategory"),
						null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_language_feature"), getString("_UI_PropertyDescriptor_description", "_UI_TextualExpression_language_feature", "_UI_TextualExpression_type"),
						org.storydriven.modeling.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE,
						true,
						false,
						false,
						null,
						getString("_UI_GuardPropertyCategory"),
						null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_languageVersion_feature"), getString("_UI_PropertyDescriptor_description", "_UI_TextualExpression_languageVersion_feature", "_UI_TextualExpression_type"),
						org.storydriven.modeling.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
						true,
						false,
						false,
						null,
						getString("_UI_GuardPropertyCategory"),
						null,
						rootPropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addActionPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_action_feature", "_UI_Transition_type"),
				 RealtimestatechartPackage.Literals.TRANSITION__ACTION,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_ActionPropertyCategory"),
				 null);
		
		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
								getString("_UI_NamedElement_name_feature"), getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
						SDMPackage.Literals.NAMED_ELEMENT__NAME, true, false,
						false, null, getString("_UI_ActionPropertyCategory"), null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
								getString("_UI_Action_expressions_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Action_expressions_feature", "_UI_Action_type"),
						RealtimestatechartPackage.Literals.ACTION__EXPRESSIONS,
						true, false, false, null, getString("_UI_ActionPropertyCategory"), null,
						rootPropertyDescriptor));

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
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__CLOCK_CONSTRAINTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__GUARD);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__EVENTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.TRANSITION__ACTION);
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Transition transition = (Transition)object;
		return getString("_UI_Transition_type") + " " + transition.getSource().getName() +" to " +
			transition.getTarget().getName();
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
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
			case RealtimestatechartPackage.TRANSITION__URGENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
			case RealtimestatechartPackage.TRANSITION__GUARD:
			case RealtimestatechartPackage.TRANSITION__EVENTS:
			case RealtimestatechartPackage.TRANSITION__ACTION:
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
				(RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__CLOCK_CONSTRAINTS,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CoreFactory.eINSTANCE.createActivityCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 ExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createBinaryLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectSetSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__ACTION,
				 RealtimestatechartFactory.eINSTANCE.createAction()));
	}

}
