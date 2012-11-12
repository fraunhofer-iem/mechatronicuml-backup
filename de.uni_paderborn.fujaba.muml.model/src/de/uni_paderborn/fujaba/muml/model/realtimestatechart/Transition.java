/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerMessageEvent <em>Trigger Message Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaiseMessageEvent <em>Raise Message Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isBlockable <em>Blockable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SetTargetAndSource NoCrossingOfRegionBorders EntryPointMustOnlyPointToStatesOrStateEntryPoints ExitPointMustOnlyPointToStatesOrStateExitPoints TriggerMessageEventsMustNotHaveAnOwnedParameterBinding ValidTriggerMessageEvents ValidRaiseMessageEvents EntryPointOutgoingTransitionNoAdditionalElements StateExitPointOutgoingTransitionNoAdditionalElements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SetTargetAndSource='self.target->notEmpty() and self.source->notEmpty()' NoCrossingOfRegionBorders='self.source.statechart.embeddingRegion=self.target.statechart.embeddingRegion or\r\nself.source.oclAsType(StateEntryPoint).statechart.embeddingRegion=\r\nself.target.statechart.embeddingRegion.parentState.statechart.embeddingRegion  or \t\t\t\t\r\nself.source.statechart.embeddingRegion.parentState.statechart.embeddingRegion=\r\nself.target.oclAsType(StateExitPoint).statechart.embeddingRegion' EntryPointMustOnlyPointToStatesOrStateEntryPoints='self.source.oclIsKindOf(EntryPoint) implies (\n\tself.target.oclIsKindOf(State)\n\tor self.target.oclIsKindOf(StateEntryPoint)\n)' ExitPointMustOnlyPointToStatesOrStateExitPoints='self.source.oclIsKindOf(ExitPoint) implies (\n\tself.target.oclIsKindOf(State) \n\tor self.target.oclIsKindOf(StateExitPoint)\n)' TriggerMessageEventsMustNotHaveAnOwnedParameterBinding='not self.triggerMessageEvent.message.oclIsUndefined() implies\nself.triggerMessageEvent.message.parameterBinding->isEmpty()' ValidTriggerMessageEvents='let a : msgiface::MessageInterface =\r\n(\r\n\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(component::DiscretePort) then\r\n\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(component::DiscretePort).receiverMessageInterface\r\n\telse\r\n\t\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pattern::Role) then\r\n\t\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pattern::Role).receiverMessageInterface\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\tendif\r\n) in\r\n(not triggerMessageEvent.message.instanceOf.oclIsUndefined()) implies (not a.oclIsUndefined() and a.messageTypes->includes(triggerMessageEvent.message.instanceOf))' ValidRaiseMessageEvents='let a : msgiface::MessageInterface =\r\n(\r\n\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(component::DiscretePort) then\r\n\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(component::DiscretePort).senderMessageInterface\r\n\telse\r\n\t\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pattern::Role) then\r\n\t\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pattern::Role).senderMessageInterface\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\tendif\r\n) in\r\n(not raiseMessageEvent.message.instanceOf.oclIsUndefined()) implies (not a.oclIsUndefined() and a.messageTypes->includes(raiseMessageEvent.message.instanceOf))' EntryPointOutgoingTransitionNoAdditionalElements='(not self.source.oclIsUndefined() and self.source.oclIsTypeOf(realtimestatechart::EntryPoint))\n\timplies (\n\t\tself.synchronization.oclIsUndefined()\n\t\tand self.clockResets->isEmpty()\n\t\tand self.triggerMessageEvent.oclIsUndefined()\n\t\tand self.raiseMessageEvent.oclIsUndefined()\n\t\tand self.clockConstraints->isEmpty()\n\t\tand self.absoluteDeadlines->isEmpty()\n\t\tand self.relativeDeadline.oclIsUndefined()\n\t\tand self.guard.oclIsUndefined()\n\t\tand self.events->isEmpty()\n\t\tand self.action.oclIsUndefined()\n\t)' StateExitPointOutgoingTransitionNoAdditionalElements='(not self.source.oclIsUndefined() and self.source.oclIsTypeOf(realtimestatechart::StateExitPoint))\n\timplies (\n\t\tself.synchronization.oclIsUndefined()\n\t\tand self.clockResets->isEmpty()\n\t\tand self.triggerMessageEvent.oclIsUndefined()\n\t\tand self.raiseMessageEvent.oclIsUndefined()\n\t\tand self.clockConstraints->isEmpty()\n\t\tand self.absoluteDeadlines->isEmpty()\n\t\tand self.relativeDeadline.oclIsUndefined()\n\t\tand self.guard.oclIsUndefined()\n\t\tand self.events->isEmpty()\n\t\tand self.action.oclIsUndefined()\n\t)'"
 * @generated
 */
public interface Transition extends ExtendableElement, Prioritizable, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is sent upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronization</em>' containment reference.
	 * @see #setSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Synchronization()
	 * @model containment="true"
	 * @generated
	 */
	Synchronization getSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization</em>' containment reference.
	 * @see #getSynchronization()
	 * @generated
	 */
	void setSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the target of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Target()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the source of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Source()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this transition belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(RealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Statechart()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	RealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Clock Resets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock resets of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Resets</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockResets()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_TriggerMessageEvent()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_RaiseMessageEvent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let eventSet : Sequence(AsynchronousMessageEvent) = self.events->select(e | e.oclIsKindOf(AsynchronousMessageEvent) and e.kind=EventKind::RAISE).oclAsType(AsynchronousMessageEvent) in\r\nif eventSet ->size() = 0 then null else eventSet -> first() endif'"
	 * @generated
	 */
	AsynchronousMessageEvent getRaiseMessageEvent();

	/**
	 * Returns the value of the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clock constraint restricts when the transition can be activeted in dependency of the values of the clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Constraints</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getClockConstraints();

	/**
	 * Returns the value of the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline}.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_AbsoluteDeadlines()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_RelativeDeadline()
	 * @model containment="true"
	 * @generated
	 */
	RelativeDeadline getRelativeDeadline();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Blockable()
	 * @model default="false"
	 * @generated
	 */
	boolean isBlockable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isBlockable <em>Blockable</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.TransitionEvent}.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Events()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Transition
