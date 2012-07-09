/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
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
import org.storydriven.core.CorePackage;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.provider.ExtendableElementItemProvider;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.activities.expressions.ActivitiesExpressionsFactory;
import org.storydriven.storydiagrams.calls.CallsFactory;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsFactory;
import org.storydriven.storydiagrams.patterns.expressions.PatternsExpressionsFactory;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.utils.FujabaEcoreUtil;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.descriptor.NaturalNumberPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor.ClockPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.descriptor.TransitionMessageEventPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider extends ExtendableElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPriorityPropertyDescriptor(object);
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
			addGuardPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Prioritizable_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Prioritizable_priority_feature", "_UI_Prioritizable_type"),
				 RealtimestatechartPackage.Literals.PRIORITIZABLE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	 /**
	 * This adds a property descriptor for the Synchronization feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	protected void addSynchronizationPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_synchronization_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Transition_synchronization_feature",
						"_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
				true, false, false, null,
				getString("_UI_SynchronizationPropertyCategory"), null);
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Synchronization_syncChannel_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_syncChannel_feature", "_UI_Synchronization_type"),
			 RealtimestatechartPackage.Literals.SYNCHRONIZATION__SYNC_CHANNEL,
			 true,
			 false,
			 true,
			 null,
			 getString("_UI_SynchronizationPropertyCategory"),
			 null,
			 rootPropertyDescriptor) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Transition transition = (Transition) object;

						Collection<?> choices = super.getChoiceOfValues(object);
						Iterator<?> it = choices.iterator();
						while (it.hasNext()) {
							Object choice = it.next();
							if (choice == null) {
								continue;
							}
							if (choice instanceof SynchronizationChannel) {
								SynchronizationChannel channel = (SynchronizationChannel) choice;
								if (channel.getState().isSuperVertexOf(
										transition.getSource())) {
									continue;
								}
							}
							it.remove();
						}
						return choices;
					}

				});

		itemPropertyDescriptors.add
			(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Synchronization_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_kind_feature", "_UI_Synchronization_type"),
				 RealtimestatechartPackage.Literals.SYNCHRONIZATION__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SynchronizationPropertyCategory"),
				 null,
				 rootPropertyDescriptor));

		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Synchronization_parameterBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Synchronization_parameterBinding_feature", "_UI_Synchronization_type"),
				 RealtimestatechartPackage.Literals.SYNCHRONIZATION__PARAMETER_BINDING,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_SynchronizationPropertyCategory"),
				 null,
				 rootPropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Target feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a property descriptor for the Source feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a property descriptor for the Clock Resets feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addClockResetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ClockPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_clockResets_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_clockResets_feature",
						"_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS,
				true, false, true, null,
				getString("_UI_ClockPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Trigger Message Event feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				RealtimestatechartPackage.Literals.TRANSITION__EVENTS, true,
				false, true, null,
				getString("_UI_TriggerMessageEventPropertyCategory"), null);

		rootPropertyDescriptor
				.setInstanceClass(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT);
		rootPropertyDescriptor.setEventKind(EventKind.TRIGGER);

		IChainedPropertyDescriptor messagePropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AsynchronousMessageEvent_message_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AsynchronousMessageEvent_message_feature",
						"_UI_AsynchronousMessageEvent_type"),
				RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
				true, false, false, null,
				getString("_UI_TriggerMessageEventPropertyCategory"), null,
				rootPropertyDescriptor);

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
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
				 messagePropertyDescriptor) {
		
			@Override
			public Collection<?> getChoiceOfValues(Object message) {
				Collection<MessageType> choices = new ArrayList<MessageType>();
				choices.add(null);
				
				RealtimeStatechart statechart = (RealtimeStatechart) FujabaEcoreUtil
						.deduceContainer(
								(EObject) message,
								RealtimestatechartPackage.Literals.REALTIME_STATECHART);
				
				BehavioralElement element = statechart.getPortOrRoleStatechart().getBehavioralElement();
				MessageInterface messageInterface = null;
				if (element instanceof DiscretePort) {
					messageInterface = ((DiscretePort) element).getReceiverMessageInterface();
				} else if (element instanceof Role) {
					messageInterface = ((Role) element).getReceiverMessageInterface();
				}
				if (messageInterface != null) {
					choices.addAll(messageInterface.getAllAvailableMessageTypes());
				}
				return choices;
			}
		});

		// Note: The following PropertyDescriptor was removed due to bug #146.

		// itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
		// ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		// getResourceLocator(),
		// getString("_UI_Invocation_ownedParameterBindings_feature"),
		// getString("_UI_PropertyDescriptor_description",
		// "_UI_Invocation_ownedParameterBindings_feature",
		// "_UI_Invocation_type"),
		// CallsPackage.Literals.INVOCATION__OWNED_PARAMETER_BINDINGS,
		// true,
		// false,
		// false,
		// null,
		// getString("_UI_TriggerMessageEventPropertyCategory"),
		// null,
		// messagePropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Raise Message Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRaiseMessageEventPropertyDescriptor(Object object) {
		TransitionMessageEventPropertyDescriptor rootPropertyDescriptor = new TransitionMessageEventPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_raiseMessageEvent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_raiseMessageEvent_feature",
						"_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__EVENTS, true,
				false, true, null,
				getString("_UI_RaiseMessageEventPropertyCategory"), null);

		rootPropertyDescriptor
				.setInstanceClass(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT);
		rootPropertyDescriptor.setEventKind(EventKind.RAISE);

		IChainedPropertyDescriptor messagePropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AsynchronousMessageEvent_message_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AsynchronousMessageEvent_message_feature",
						"_UI_AsynchronousMessageEvent_type"),
				RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE,
				true, false, false, null,
				getString("_UI_RaiseMessageEventPropertyCategory"), null,
				rootPropertyDescriptor);
		
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
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
				 messagePropertyDescriptor) {

			@Override
			public Collection<?> getChoiceOfValues(Object message) {
				Collection<MessageType> choices = new ArrayList<MessageType>();
				choices.add(null);
				
				RealtimeStatechart statechart = (RealtimeStatechart) FujabaEcoreUtil
						.deduceContainer(
								(EObject) message,
								RealtimestatechartPackage.Literals.REALTIME_STATECHART);
				
				BehavioralElement element = statechart.getPortOrRoleStatechart().getBehavioralElement();
				MessageInterface messageInterface = null;
				if (element instanceof DiscretePort) {
					messageInterface = ((DiscretePort) element).getSenderMessageInterface();
				} else if (element instanceof Role) {
					messageInterface = ((Role) element).getSenderMessageInterface();
				}
				if (messageInterface != null) {
					choices.addAll(messageInterface.getAllAvailableMessageTypes());
				}
				return choices;
			}
		});
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Message_parameterBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Message_parameterBinding_feature", "_UI_Message_type"),
				 RealtimestatechartPackage.Literals.MESSAGE__PARAMETER_BINDING,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_RaiseMessageEventPropertyCategory"),
				 null,
				 messagePropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Clock Constraints feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 getString("_UI_ClockPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Absolute Deadlines feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
				 getString("_UI_AbsoluteDeadlinePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Deadline feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addRelativeDeadlinePropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_relativeDeadline_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_relativeDeadline_feature",
						"_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE,
				false, false, false, null,
				getString("_UI_RelativeDeadlinePropertyCategory"), null);

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
						true, false, true, null,
						getString("_UI_RelativeDeadlinePropertyCategory"),
						null, rootPropertyDescriptor));

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
						true, false, true, null,
						getString("_UI_RelativeDeadlinePropertyCategory"),
						null, rootPropertyDescriptor));

	}

	/**
	 * This adds a property descriptor for the Blockable feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a property descriptor for the Guard feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		DefaultChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_guard_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Transition_guard_feature", "_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__GUARD, true,
				false, false, null, getString("_UI_GuardPropertyCategory"),
				null);
		rootPropertyDescriptor
				.setInstanceClass(ExpressionsPackage.Literals.TEXTUAL_EXPRESSION);

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_expressionText_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_expressionText_feature",
								"_UI_TextualExpression_type"),
						org.storydriven.core.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
						true, false, false, null,
						getString("_UI_GuardPropertyCategory"), null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_language_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_language_feature",
								"_UI_TextualExpression_type"),
						org.storydriven.core.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE,
						true, false, false, null,
						getString("_UI_GuardPropertyCategory"), null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_languageVersion_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_languageVersion_feature",
								"_UI_TextualExpression_type"),
						org.storydriven.core.expressions.ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
						true, false, false, null,
						getString("_UI_GuardPropertyCategory"), null,
						rootPropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Action feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addActionPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_action_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_action_feature", "_UI_Transition_type"),
				RealtimestatechartPackage.Literals.TRANSITION__ACTION, true,
				false, false, null, getString("_UI_ActionPropertyCategory"),
				null);

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NamedElement_name_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_NamedElement_name_feature",
						"_UI_NamedElement_type"),
				org.storydriven.core.CorePackage.Literals.NAMED_ELEMENT__NAME,
				true, false, false,
				null, getString("_UI_ActionPropertyCategory"), null,
				rootPropertyDescriptor));

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Action_expressions_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Action_expressions_feature", "_UI_Action_type"),
				RealtimestatechartPackage.Literals.ACTION__EXPRESSIONS, true,
				false, false, null, getString("_UI_ActionPropertyCategory"),
				null, rootPropertyDescriptor));

	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Transition.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Transition transition = (Transition) object;
		StringBuffer sb = new StringBuffer();
		sb.append(getString("_UI_Transition_type"));
		sb.append(' ');
		if (transition.getSource() != null
				&& transition.getSource().getName() != null) {
			sb.append(transition.getSource().getName());
		} else {
			sb.append("null");
		}
		sb.append(" to ");
		if (transition.getTarget() != null
				&& transition.getTarget().getName() != null) {
			sb.append(transition.getTarget().getName());
		} else {
			sb.append("null");
		}
		return sb.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transition.class)) {
			case RealtimestatechartPackage.TRANSITION__PRIORITY:
			case RealtimestatechartPackage.TRANSITION__TRIGGER_MESSAGE_EVENT:
			case RealtimestatechartPackage.TRANSITION__RAISE_MESSAGE_EVENT:
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
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
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
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
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createBooleanLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createIntegerLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createDoubleLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CommonExpressionsFactory.eINSTANCE.createStringLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CallsExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__GUARD,
				 PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.TRANSITION__ACTION,
				 RealtimestatechartFactory.eINSTANCE.createAction()));
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
