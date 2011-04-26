/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTransitionMappingVector <em>Transition Mapping Vector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockConstraint <em>Clock Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isSafetyTransition <em>Safety Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getEventExpr <em>Event Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffectExpr <em>Side Effect Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockConstraintExpr <em>Clock Constraint Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlineExpr <em>Absolute Deadline Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadlineExpr <em>Relative Deadline Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuardExpr <em>Guard Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSynchroExpr <em>Synchro Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockResetsExpr <em>Clock Resets Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Prioritizable, ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Transition Mapping Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Mapping Vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Mapping Vector</em>' attribute.
	 * @see #setTransitionMappingVector(Vector)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_TransitionMappingVector()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Vector"
	 * @generated
	 */
	Vector getTransitionMappingVector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTransitionMappingVector <em>Transition Mapping Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Mapping Vector</em>' attribute.
	 * @see #getTransitionMappingVector()
	 * @generated
	 */
	void setTransitionMappingVector(Vector value);

	/**
	 * Returns the value of the '<em><b>Send Synchronization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is sent upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Synchronization</em>' containment reference.
	 * @see #setSendSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_SendSynchronization()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev
	 * @model opposite="sendSyncRev" containment="true"
	 * @generated
	 */
	Synchronization getSendSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Synchronization</em>' containment reference.
	 * @see #getSendSynchronization()
	 * @generated
	 */
	void setSendSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Receive Synchronization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is to be received upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Synchronization</em>' containment reference.
	 * @see #setReceiveSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_ReceiveSynchronization()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev
	 * @model opposite="receiveSyncRev" containment="true"
	 * @generated
	 */
	Synchronization getReceiveSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Synchronization</em>' containment reference.
	 * @see #getReceiveSynchronization()
	 * @generated
	 */
	void setReceiveSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Side Effect</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Side Effect</em>' containment reference.
	 * @see #setSideEffect(Action)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_SideEffect()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	Action getSideEffect();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect <em>Side Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effect</em>' containment reference.
	 * @see #getSideEffect()
	 * @generated
	 */
	void setSideEffect(Action value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the target of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_Target()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the source of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_Source()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this transition belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(AbstractStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_Statechart()
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	AbstractStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(AbstractStatechart value);

	/**
	 * Returns the value of the '<em><b>Clock Resets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock resets of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Resets</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockResets()
	 * @model
	 * @generated
	 */
	EList<Clock> getClockResets();

	/**
	 * Returns the value of the '<em><b>Trigger Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition <em>Triggeredtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger events of this transition. They are required for this transition to be activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_TriggerEvents()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition
	 * @model opposite="triggeredtransition" containment="true"
	 * @generated
	 */
	EList<AsynchronousEvent> getTriggerEvents();

	/**
	 * Returns the value of the '<em><b>Raised Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent#getRaisedtransition <em>Raisedtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The events which are raised upon activiation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_RaisedEvents()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent#getRaisedtransition
	 * @model opposite="raisedtransition" containment="true"
	 * @generated
	 */
	EList<AsynchronousEvent> getRaisedEvents();

	/**
	 * Returns the value of the '<em><b>Clock Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time guard of this transition. It restricts when the transition can be activeted in dependency of the values of the clock. For time guard x<=2 the transition would only be allowed to be activated if x has a value less or equal to 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Constraint</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getClockConstraint();

	/**
	 * Returns the value of the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Deadlines</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_AbsoluteDeadlines()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	EList<AbsoluteDeadline> getAbsoluteDeadlines();

	/**
	 * Returns the value of the '<em><b>Relative Deadline</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Deadline</em>' containment reference.
	 * @see #setRelativeDeadline(RelativeDeadline)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_RelativeDeadline()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	RelativeDeadline getRelativeDeadline();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Deadline</em>' containment reference.
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	void setRelativeDeadline(RelativeDeadline value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_Urgent()
	 * @model default="true"
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Expression)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Event Expr</b></em>' attribute.
	 * The default value is <code>"eventExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Expr</em>' attribute.
	 * @see #setEventExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_EventExpr()
	 * @model default="eventExpr" derived="true"
	 * @generated
	 */
	String getEventExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getEventExpr <em>Event Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Expr</em>' attribute.
	 * @see #getEventExpr()
	 * @generated
	 */
	void setEventExpr(String value);

	/**
	 * Returns the value of the '<em><b>Side Effect Expr</b></em>' attribute.
	 * The default value is <code>"sideEffectExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Effect Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Effect Expr</em>' attribute.
	 * @see #setSideEffectExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_SideEffectExpr()
	 * @model default="sideEffectExpr" derived="true"
	 * @generated
	 */
	String getSideEffectExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffectExpr <em>Side Effect Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effect Expr</em>' attribute.
	 * @see #getSideEffectExpr()
	 * @generated
	 */
	void setSideEffectExpr(String value);

	/**
	 * Returns the value of the '<em><b>Clock Constraint Expr</b></em>' attribute.
	 * The default value is <code>"timeGuardExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Constraint Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Constraint Expr</em>' attribute.
	 * @see #setClockConstraintExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockConstraintExpr()
	 * @model default="timeGuardExpr" derived="true"
	 * @generated
	 */
	String getClockConstraintExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockConstraintExpr <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Constraint Expr</em>' attribute.
	 * @see #getClockConstraintExpr()
	 * @generated
	 */
	void setClockConstraintExpr(String value);

	/**
	 * Returns the value of the '<em><b>Absolute Deadline Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadline Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Deadline Expr</em>' attribute.
	 * @see #isSetAbsoluteDeadlineExpr()
	 * @see #unsetAbsoluteDeadlineExpr()
	 * @see #setAbsoluteDeadlineExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_AbsoluteDeadlineExpr()
	 * @model default="" unsettable="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if relativeDeadline.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tabsoluteDeadlines->iterate( a:AbsoluteDeadline;  return: String = \'\' | \r\n\treturn.concat(a.toMyString())) \r\nendif'"
	 * @generated
	 */
	String getAbsoluteDeadlineExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlineExpr <em>Absolute Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Deadline Expr</em>' attribute.
	 * @see #isSetAbsoluteDeadlineExpr()
	 * @see #unsetAbsoluteDeadlineExpr()
	 * @see #getAbsoluteDeadlineExpr()
	 * @generated
	 */
	void setAbsoluteDeadlineExpr(String value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlineExpr <em>Absolute Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbsoluteDeadlineExpr()
	 * @see #getAbsoluteDeadlineExpr()
	 * @see #setAbsoluteDeadlineExpr(String)
	 * @generated
	 */
	void unsetAbsoluteDeadlineExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlineExpr <em>Absolute Deadline Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Absolute Deadline Expr</em>' attribute is set.
	 * @see #unsetAbsoluteDeadlineExpr()
	 * @see #getAbsoluteDeadlineExpr()
	 * @see #setAbsoluteDeadlineExpr(String)
	 * @generated
	 */
	boolean isSetAbsoluteDeadlineExpr();

	/**
	 * Returns the value of the '<em><b>Relative Deadline Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Deadline Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Deadline Expr</em>' attribute.
	 * @see #isSetRelativeDeadlineExpr()
	 * @see #unsetRelativeDeadlineExpr()
	 * @see #setRelativeDeadlineExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_RelativeDeadlineExpr()
	 * @model default="" unsettable="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if relativeDeadline.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\trelativeDeadline.toMyString()\r\nendif'"
	 * @generated
	 */
	String getRelativeDeadlineExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadlineExpr <em>Relative Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Deadline Expr</em>' attribute.
	 * @see #isSetRelativeDeadlineExpr()
	 * @see #unsetRelativeDeadlineExpr()
	 * @see #getRelativeDeadlineExpr()
	 * @generated
	 */
	void setRelativeDeadlineExpr(String value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadlineExpr <em>Relative Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeDeadlineExpr()
	 * @see #getRelativeDeadlineExpr()
	 * @see #setRelativeDeadlineExpr(String)
	 * @generated
	 */
	void unsetRelativeDeadlineExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadlineExpr <em>Relative Deadline Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Deadline Expr</em>' attribute is set.
	 * @see #unsetRelativeDeadlineExpr()
	 * @see #getRelativeDeadlineExpr()
	 * @see #setRelativeDeadlineExpr(String)
	 * @generated
	 */
	boolean isSetRelativeDeadlineExpr();

	/**
	 * Returns the value of the '<em><b>Guard Expr</b></em>' attribute.
	 * The default value is <code>"guardExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expr</em>' attribute.
	 * @see #setGuardExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_GuardExpr()
	 * @model default="guardExpr" derived="true"
	 * @generated
	 */
	String getGuardExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuardExpr <em>Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expr</em>' attribute.
	 * @see #getGuardExpr()
	 * @generated
	 */
	void setGuardExpr(String value);

	/**
	 * Returns the value of the '<em><b>Synchro Expr</b></em>' attribute.
	 * The default value is <code>"synchroExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchro Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchro Expr</em>' attribute.
	 * @see #setSynchroExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_SynchroExpr()
	 * @model default="synchroExpr" derived="true"
	 * @generated
	 */
	String getSynchroExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSynchroExpr <em>Synchro Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchro Expr</em>' attribute.
	 * @see #getSynchroExpr()
	 * @generated
	 */
	void setSynchroExpr(String value);

	/**
	 * Returns the value of the '<em><b>Clock Resets Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Resets Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Resets Expr</em>' attribute.
	 * @see #isSetClockResetsExpr()
	 * @see #unsetClockResetsExpr()
	 * @see #setClockResetsExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_ClockResetsExpr()
	 * @model default="" unsettable="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if relativeDeadline.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tclockResets->iterate( c:Clock;  return: String = \'\' | \r\n\treturn.concat(c.toMyString())) \r\nendif'"
	 * @generated
	 */
	String getClockResetsExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockResetsExpr <em>Clock Resets Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Resets Expr</em>' attribute.
	 * @see #isSetClockResetsExpr()
	 * @see #unsetClockResetsExpr()
	 * @see #getClockResetsExpr()
	 * @generated
	 */
	void setClockResetsExpr(String value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockResetsExpr <em>Clock Resets Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClockResetsExpr()
	 * @see #getClockResetsExpr()
	 * @see #setClockResetsExpr(String)
	 * @generated
	 */
	void unsetClockResetsExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getClockResetsExpr <em>Clock Resets Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock Resets Expr</em>' attribute is set.
	 * @see #unsetClockResetsExpr()
	 * @see #getClockResetsExpr()
	 * @see #setClockResetsExpr(String)
	 * @generated
	 */
	boolean isSetClockResetsExpr();

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getTransition_SafetyTransition()
	 * @model default="false"
	 * @generated
	 */
	boolean isSafetyTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isSafetyTransition <em>Safety Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Transition</em>' attribute.
	 * @see #isSafetyTransition()
	 * @generated
	 */
	void setSafetyTransition(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NaturalNumber calculateWorstCaseDeadlineAsNaturalNumber();

} // Transition
