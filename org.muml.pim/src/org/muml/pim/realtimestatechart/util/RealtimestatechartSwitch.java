/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Deadline;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.EntryOrExitEvent;
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.Event;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.StateEvent;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.TransitionEvent;
import org.muml.pim.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage
 * @generated
 */
public class RealtimestatechartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RealtimestatechartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartSwitch() {
		if (modelPackage == null) {
			modelPackage = RealtimestatechartPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RealtimestatechartPackage.DEADLINE: {
				Deadline deadline = (Deadline)theEObject;
				T result = caseDeadline(deadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE: {
				AbsoluteDeadline absoluteDeadline = (AbsoluteDeadline)theEObject;
				T result = caseAbsoluteDeadline(absoluteDeadline);
				if (result == null) result = caseDeadline(absoluteDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.RELATIVE_DEADLINE: {
				RelativeDeadline relativeDeadline = (RelativeDeadline)theEObject;
				T result = caseRelativeDeadline(relativeDeadline);
				if (result == null) result = caseDeadline(relativeDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				T result = caseClock(clock);
				if (result == null) result = caseNamedElement(clock);
				if (result == null) result = caseExtendableElement(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseCommentableElement(state);
				if (result == null) result = caseExtendableElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseNamedElement(vertex);
				if (result == null) result = caseCommentableElement(vertex);
				if (result == null) result = caseExtendableElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseCommentableElement(transition);
				if (result == null) result = caseExtendableElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.CLOCK_CONSTRAINT: {
				ClockConstraint clockConstraint = (ClockConstraint)theEObject;
				T result = caseClockConstraint(clockConstraint);
				if (result == null) result = caseExtendableElement(clockConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseExtendableElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT: {
				AsynchronousMessageEvent asynchronousMessageEvent = (AsynchronousMessageEvent)theEObject;
				T result = caseAsynchronousMessageEvent(asynchronousMessageEvent);
				if (result == null) result = caseTransitionEvent(asynchronousMessageEvent);
				if (result == null) result = caseEvent(asynchronousMessageEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.DO_EVENT: {
				DoEvent doEvent = (DoEvent)theEObject;
				T result = caseDoEvent(doEvent);
				if (result == null) result = caseStateEvent(doEvent);
				if (result == null) result = caseEvent(doEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT: {
				EntryOrExitEvent entryOrExitEvent = (EntryOrExitEvent)theEObject;
				T result = caseEntryOrExitEvent(entryOrExitEvent);
				if (result == null) result = caseStateEvent(entryOrExitEvent);
				if (result == null) result = caseEvent(entryOrExitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: {
				SynchronizationChannel synchronizationChannel = (SynchronizationChannel)theEObject;
				T result = caseSynchronizationChannel(synchronizationChannel);
				if (result == null) result = caseNamedElement(synchronizationChannel);
				if (result == null) result = caseCommentableElement(synchronizationChannel);
				if (result == null) result = caseExtendableElement(synchronizationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = caseExtendableElement(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.REALTIME_STATECHART: {
				RealtimeStatechart realtimeStatechart = (RealtimeStatechart)theEObject;
				T result = caseRealtimeStatechart(realtimeStatechart);
				if (result == null) result = caseNamedElement(realtimeStatechart);
				if (result == null) result = caseCommentableElement(realtimeStatechart);
				if (result == null) result = caseBehavior(realtimeStatechart);
				if (result == null) result = caseExtendableElement(realtimeStatechart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.TRANSITION_EVENT: {
				TransitionEvent transitionEvent = (TransitionEvent)theEObject;
				T result = caseTransitionEvent(transitionEvent);
				if (result == null) result = caseEvent(transitionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.STATE_EVENT: {
				StateEvent stateEvent = (StateEvent)theEObject;
				T result = caseStateEvent(stateEvent);
				if (result == null) result = caseEvent(stateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseExtendableElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_EVENT: {
				EntryEvent entryEvent = (EntryEvent)theEObject;
				T result = caseEntryEvent(entryEvent);
				if (result == null) result = caseEntryOrExitEvent(entryEvent);
				if (result == null) result = caseStateEvent(entryEvent);
				if (result == null) result = caseEvent(entryEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.EXIT_EVENT: {
				ExitEvent exitEvent = (ExitEvent)theEObject;
				T result = caseExitEvent(exitEvent);
				if (result == null) result = caseEntryOrExitEvent(exitEvent);
				if (result == null) result = caseStateEvent(exitEvent);
				if (result == null) result = caseEvent(exitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.STATE_CONNECTION_POINT: {
				StateConnectionPoint stateConnectionPoint = (StateConnectionPoint)theEObject;
				T result = caseStateConnectionPoint(stateConnectionPoint);
				if (result == null) result = caseVertex(stateConnectionPoint);
				if (result == null) result = caseNamedElement(stateConnectionPoint);
				if (result == null) result = caseCommentableElement(stateConnectionPoint);
				if (result == null) result = caseExtendableElement(stateConnectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				T result = caseEntryPoint(entryPoint);
				if (result == null) result = caseStateConnectionPoint(entryPoint);
				if (result == null) result = caseVertex(entryPoint);
				if (result == null) result = caseNamedElement(entryPoint);
				if (result == null) result = caseCommentableElement(entryPoint);
				if (result == null) result = caseExtendableElement(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.EXIT_POINT: {
				ExitPoint exitPoint = (ExitPoint)theEObject;
				T result = caseExitPoint(exitPoint);
				if (result == null) result = caseStateConnectionPoint(exitPoint);
				if (result == null) result = caseVertex(exitPoint);
				if (result == null) result = caseNamedElement(exitPoint);
				if (result == null) result = caseCommentableElement(exitPoint);
				if (result == null) result = caseExtendableElement(exitPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadline(Deadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteDeadline(AbsoluteDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeDeadline(RelativeDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockConstraint(ClockConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousMessageEvent(AsynchronousMessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoEvent(DoEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Or Exit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Or Exit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryOrExitEvent(EntryOrExitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationChannel(SynchronizationChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realtime Statechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealtimeStatechart(RealtimeStatechart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEvent(TransitionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateEvent(StateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryEvent(EntryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitEvent(ExitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateConnectionPoint(StateConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitPoint(ExitPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RealtimestatechartSwitch
