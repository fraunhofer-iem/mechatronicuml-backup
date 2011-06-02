/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.ExtendableElement;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isSafetyTransition <em>Safety Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Prioritizable, ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Send Synchronization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is sent upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Synchronization</em>' containment reference.
	 * @see #setSendSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_SendSynchronization()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSendSyncRev
	 * @model opposite="sendSyncRev" containment="true"
	 * @generated
	 */
	Synchronization getSendSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Synchronization</em>' containment reference.
	 * @see #getSendSynchronization()
	 * @generated
	 */
	void setSendSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Receive Synchronization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is to be received upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Synchronization</em>' containment reference.
	 * @see #setReceiveSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_ReceiveSynchronization()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getReceiveSyncRev
	 * @model opposite="receiveSyncRev" containment="true"
	 * @generated
	 */
	Synchronization getReceiveSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Synchronization</em>' containment reference.
	 * @see #getReceiveSynchronization()
	 * @generated
	 */
	void setReceiveSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Transition Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Action</em>' containment reference.
	 * @see #setTransitionAction(Action)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_TransitionAction()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	Action getTransitionAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTransitionAction <em>Transition Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Action</em>' containment reference.
	 * @see #getTransitionAction()
	 * @generated
	 */
	void setTransitionAction(Action value);

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
	 * @model opposite="incomingTransitions"
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
	 * @model opposite="outgoingTransitions"
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
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this transition belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(FujabaRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Statechart()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	FujabaRealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(FujabaRealtimeStatechart value);

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
	 * Returns the value of the '<em><b>Trigger Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition <em>Triggeredtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger events of this transition. They are required for this transition to be activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_TriggerEvents()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition
	 * @model opposite="triggeredtransition" containment="true"
	 * @generated
	 */
	EList<AsynchronousEvent> getTriggerEvents();

	/**
	 * Returns the value of the '<em><b>Raised Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedtransition <em>Raisedtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The events which are raised upon activiation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_RaisedEvents()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedtransition
	 * @model opposite="raisedtransition" containment="true"
	 * @generated
	 */
	EList<AsynchronousEvent> getRaisedEvents();

	/**
	 * Returns the value of the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time guard of this transition. It restricts when the transition can be activeted in dependency of the values of the clock. For time guard x<=2 the transition would only be allowed to be activated if x has a value less or equal to 2.
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
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Deadlines</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_AbsoluteDeadlines()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	EList<AbsoluteDeadline> getAbsoluteDeadlines();

	/**
	 * Returns the value of the '<em><b>Relative Deadline</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Deadline</em>' containment reference.
	 * @see #setRelativeDeadline(RelativeDeadline)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_RelativeDeadline()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline#getTransition
	 * @model opposite="transition" containment="true"
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
	 * Returns the value of the '<em><b>Safety Transition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Transition</em>' attribute.
	 * @see #setSafetyTransition(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_SafetyTransition()
	 * @model default="false"
	 * @generated
	 */
	boolean isSafetyTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isSafetyTransition <em>Safety Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Transition</em>' attribute.
	 * @see #isSafetyTransition()
	 * @generated
	 */
	void setSafetyTransition(boolean value);

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getTransition_Urgent()
	 * @model default="true"
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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

} // Transition
