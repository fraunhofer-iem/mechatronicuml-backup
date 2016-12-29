/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.expressions.Expression;
import org.muml.pim.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transition connects different vertices. If the vertex is a state a self-transition is also possible.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getTriggerMessageEvent <em>Trigger Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getRaiseMessageEvent <em>Raise Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#isBlockable <em>Blockable</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Transition#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UsingAOneToManySchemaAtOneTransitionImpliesUsingSchemaAtAllTransitions LegalTransitionsOnly TriggerMessageEventsMustNotHaveAnOwnedParameterBinding ValidTriggerMessageEvents ValidRaiseMessageEvents StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines StateConnectionPointOutgoingTransitionsNoConditions StateConnectionPointOutgoingTransitionsMustBeUrgent NoCombinationOfRelativeAndAbsoluteDeadlines NoCombinationOfReceivedSynchronizationAndTriggerMessage TransitionMustBeContainedByCorrectStatechart OutgoingTransitionOfUrgentStateMustBeUrgent NotMoreThanOneTriggerAndOneRaiseMessageEvent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LegalTransitionsOnly='-- Inter-level transitions are invalid\r\n\r\nif (self.source.oclIsUndefined() or self.target.oclIsUndefined()) then\r\ntrue\r\nelse\r\n-- State A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to State A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(State)))\t\r\nor\r\n-- EntryPoint of A1 to EntryPoint of A2, where A1 is the direct parent state of A2\r\n(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(EntryPoint).state))\r\nor\r\n-- ExitPoint of A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(ExitPoint).state))\r\n\r\nor \r\n-- State A to State B within the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(State) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(State).parentStatechart)\r\nor\r\n-- State A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to EntryPoint of B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\nor\r\n-- ExitPoint of A to State B, where A and B are in the same statechart\r\n(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(State).parentStatechart)\r\nendif' TriggerMessageEventsMustNotHaveAnOwnedParameterBinding='-- Trigger Message Event must be parameterless (no parameter binding allowed)\r\nnot self.triggerMessageEvent.message.oclIsUndefined() implies\r\nself.triggerMessageEvent.message.parameterBinding->isEmpty()' ValidTriggerMessageEvents='-- Trigger message type must be added to receiver message types\r\nnot triggerMessageEvent.message.instanceOf.oclIsUndefined() implies receiverMessageTypes->includes(triggerMessageEvent.message.instanceOf)' ValidRaiseMessageEvents='-- Raise message type must be added to sender message types\r\nnot raiseMessageEvent.message.instanceOf.oclIsUndefined() implies senderMessageTypes->includes(raiseMessageEvent.message.instanceOf)' StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines='-- Transitions to state connection points must not define side effects or deadlines\r\n(not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.clockResets->isEmpty()\r\n\t\tand self.action.oclIsUndefined()\r\n\t\tand self.raiseMessageEvent.oclIsUndefined()\r\n\t\tand self.absoluteDeadlines->isEmpty()\r\n\t\tand self.relativeDeadline.oclIsUndefined()\r\n\t)' StateConnectionPointOutgoingTransitionsNoConditions='-- Transitions from state connection points must not have conditions\r\n(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.triggerMessageEvent.oclIsUndefined()\r\n\t\tand self.clockConstraints->isEmpty()\r\n\t\tand self.guard.oclIsUndefined()\r\n\t\tand self.synchronization.oclIsUndefined()\r\n\t)' StateConnectionPointOutgoingTransitionsMustBeUrgent='-- Transitions from state connection points must be urgent\r\n(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n\timplies (\r\n\t\tself.urgent\r\n\t)' NoCombinationOfRelativeAndAbsoluteDeadlines='-- Defining both relative and absolute deadlines is forbidden\n(not self.relativeDeadline.oclIsUndefined()) implies (self.absoluteDeadlines->isEmpty())' NoCombinationOfReceivedSynchronizationAndTriggerMessage='-- A transition must not specify a received synchronization and a trigger message at the same time\r\n((not self.synchronization.oclIsUndefined()) and (self.synchronization.kind = SynchronizationKind::RECEIVE))\r\nimplies\r\nself.triggerMessageEvent.oclIsUndefined()' TransitionMustBeContainedByCorrectStatechart='-- A transition must be contained by its logical parent statechart\r\n(not self.statechart.oclIsUndefined()) implies (self.statechart.transitions->includes(self))' OutgoingTransitionOfUrgentStateMustBeUrgent='-- An outgoing transition of an urgent state must be urgent itself\r\n(self.source.oclIsKindOf(State) and self.source.oclAsType(State).urgent) implies self.urgent' UsingAOneToManySchemaAtOneTransitionImpliesUsingSchemaAtAllTransitions='-- If a one-to-many communication schema is used at a transition, the behavioral element must be a multi role or multi port and all other messages of the RTSC must use a one-to-many communication schema  as well. Moreover, the RTSC may not define explicit coordinator and subrole regions.\r\nlet result : Boolean = (\r\nlet selfStatechart : RealtimeStatechart = self.statechart in \r\nlet allChildrenOfRoleOrPortStatechart : Set(RealtimeStatechart) =if selfStatechart.oclIsUndefined() then Set{} else selfStatechart.getPortOrRoleStatechart() -> closure(states.embeddedRegions.embeddedStatechart) endif in \r\nlet allTransitions : OrderedSet(Transition) =  allChildrenOfRoleOrPortStatechart->asOrderedSet()->append(selfStatechart.getPortOrRoleStatechart()).transitions->asOrderedSet() in \r\n\r\n(selfStatechart.usesOneToManyCommunicationSchemata and not (selfStatechart.getPortOrRoleStatechart() = null)) implies ( \r\nallTransitions->forAll(t : Transition |  (not(t.raiseMessageEvent = null) implies not (t.raiseMessageEvent.oneToManyCommunicationSchema = null)) and ( not(t.triggerMessageEvent = null) implies not (t.triggerMessageEvent.oneToManyCommunicationSchema = null)))\r\n)\r\n) in not result.oclIsUndefined() and result\r\n' NotMoreThanOneTriggerAndOneRaiseMessageEvent='-- There may only be at most one Raise MessageEvent and at most one Trigger MessageEvent\r\nself.events->select(event|event.oclIsKindOf(realtimestatechart::AsynchronousMessageEvent) and event.oclAsType(realtimestatechart::AsynchronousMessageEvent).kind = realtimestatechart::EventKind::RAISE) -> size() <2\r\nand self.events->select(event|event.oclIsKindOf(realtimestatechart::AsynchronousMessageEvent) and event.oclAsType(realtimestatechart::AsynchronousMessageEvent).kind = realtimestatechart::EventKind::TRIGGER) -> size() <2'"
 * @generated
 */
public interface Transition extends PrioritizedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is sent upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronization</em>' containment reference.
	 * @see #setSynchronization(Synchronization)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Synchronization()
	 * @model containment="true"
	 * @generated
	 */
	Synchronization getSynchronization();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization</em>' containment reference.
	 * @see #getSynchronization()
	 * @generated
	 */
	void setSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the target of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Target()
	 * @see org.muml.pim.realtimestatechart.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the source of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Source()
	 * @see org.muml.pim.realtimestatechart.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart that this transition locically belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' reference.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Statechart()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.source.oclIsKindOf(State))\r\nthen self.source.oclAsType(State).parentStatechart\r\nelse\r\n   if(self.target.oclIsKindOf(State))\r\n   then self.target.oclAsType(State).parentStatechart\r\n   else\r\n      if(self.source.oclIsKindOf(ExitPoint))\r\n      then self.source.oclAsType(ExitPoint).state.parentStatechart\r\n      else\r\n         if(self.target.oclIsKindOf(EntryPoint))\r\n\t  then self.target.oclAsType(EntryPoint).state.parentStatechart\r\n\t  else null -- this transition is illegal according to our syntactic constraints, no enclosing statechart can be assigned\r\n\t  endif\r\n      endif\r\n   endif\r\nendif\r\n'"
	 * @generated
	 */
	RealtimeStatechart getStatechart();

	/**
	 * Returns the value of the '<em><b>Clock Resets</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock resets of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Resets</em>' reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_ClockResets()
	 * @model
	 * @generated
	 */
	EList<Clock> getClockResets();

	/**
	 * Returns the value of the '<em><b>Trigger Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger event of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Message Event</em>' reference.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_TriggerMessageEvent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let eventSet : Sequence(AsynchronousMessageEvent) = self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::TRIGGER).oclAsType(AsynchronousMessageEvent) in\r\nif eventSet ->size() = 0 then null else eventSet -> first() endif'"
	 * @generated
	 */
	AsynchronousMessageEvent getTriggerMessageEvent();

	/**
	 * Returns the value of the '<em><b>Raise Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The event which is raised upon activiation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raise Message Event</em>' reference.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_RaiseMessageEvent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let eventSet : Sequence(AsynchronousMessageEvent) = self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::RAISE).oclAsType(AsynchronousMessageEvent) in\r\nif eventSet ->size() = 0 then null else eventSet -> first() endif'"
	 * @generated
	 */
	AsynchronousMessageEvent getRaiseMessageEvent();

	/**
	 * Returns the value of the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clock constraint restricts when the transition can be activeted in dependency of the values of the clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Constraints</em>' containment reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_ClockConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getClockConstraints();

	/**
	 * Returns the value of the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.AbsoluteDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a transition can has one or more absolute deadlines
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Absolute Deadlines</em>' containment reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_AbsoluteDeadlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbsoluteDeadline> getAbsoluteDeadlines();

	/**
	 * Returns the value of the '<em><b>Relative Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a transition can have one relative deadline
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Deadline</em>' containment reference.
	 * @see #setRelativeDeadline(RelativeDeadline)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_RelativeDeadline()
	 * @model containment="true"
	 * @generated
	 */
	RelativeDeadline getRelativeDeadline();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Deadline</em>' containment reference.
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	void setRelativeDeadline(RelativeDeadline value);

	/**
	 * Returns the value of the '<em><b>Blockable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needed for failure propagation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blockable</em>' attribute.
	 * @see #setBlockable(boolean)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Blockable()
	 * @model default="false"
	 * @generated
	 */
	boolean isBlockable();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#isBlockable <em>Blockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockable</em>' attribute.
	 * @see #isBlockable()
	 * @generated
	 */
	void setBlockable(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guard of a transition is defined by an expression which should have return type boolean. Comparing clock values is not allowed (use clock constraints instead).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.TransitionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All events which belong to this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransitionEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this transition fires immediately when it is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_Urgent()
	 * @model default="true"
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Transition#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Message Types</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All message types accessible by the trigger message event of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Types</em>' reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_ReceiverMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if statechart.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tif statechart.getPortOrRoleStatechart().oclIsUndefined() then\r\n\t\tOrderedSet { }\r\n\telse \r\n\t\tlet b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\r\n\t\tif b.oclIsUndefined() then\r\n\t\t\tOrderedSet { }\r\n\t\telse\r\n\t\t\tif b.oclIsKindOf(connector::DiscreteInteractionEndpoint) then\r\n\t\t\t\tb.oclAsType(connector::DiscreteInteractionEndpoint).receiverMessageTypes\r\n\t\t\telse\r\n\t\t\t\tOrderedSet { }\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Message Types</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All message types accessible by the raise message event of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Types</em>' reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getTransition_SenderMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if statechart.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tif statechart.getPortOrRoleStatechart().oclIsUndefined() then\r\n\t\tOrderedSet { }\r\n\telse\r\n\t\tlet b : behavior::BehavioralElement = statechart.getPortOrRoleStatechart().behavioralElement in\r\n\t\tif b.oclIsUndefined() then\r\n\t\t\tOrderedSet { }\r\n\t\telse\r\n\t\t\tif b.oclIsKindOf(connector::DiscreteInteractionEndpoint) then\r\n\t\t\t\tb.oclAsType(connector::DiscreteInteractionEndpoint).senderMessageTypes\r\n\t\t\telse\r\n\t\t\t\tOrderedSet { }\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();

} // Transition
