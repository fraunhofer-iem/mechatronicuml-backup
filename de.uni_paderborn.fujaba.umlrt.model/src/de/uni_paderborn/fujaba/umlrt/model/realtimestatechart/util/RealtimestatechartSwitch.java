/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.util;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.TypedElement;

import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.Invocation;

import org.storydriven.modeling.calls.expressions.MethodCallExpression;

import org.storydriven.modeling.expressions.Expression;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage
 * @generated
 */
public class RealtimestatechartSwitch<T> {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
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
			case RealtimestatechartPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = casePrioritizable(region);
				if (result == null) result = caseNamedElement(region);
				if (result == null) result = caseExtendableElement(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseExtendableElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseNamedElement(vertex);
				if (result == null) result = caseExtendableElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = casePrioritizable(transition);
				if (result == null) result = caseExtendableElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.CLOCK_CONSTRAINT: {
				ClockConstraint clockConstraint = (ClockConstraint)theEObject;
				T result = caseClockConstraint(clockConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.HISTORY_STATE: {
				HistoryState historyState = (HistoryState)theEObject;
				T result = caseHistoryState(historyState);
				if (result == null) result = caseVertex(historyState);
				if (result == null) result = caseNamedElement(historyState);
				if (result == null) result = caseExtendableElement(historyState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExpression(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseTypedElement(action);
				if (result == null) result = caseCommentableElement(action);
				if (result == null) result = caseExtendableElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT: {
				AsynchronousEvent asynchronousEvent = (AsynchronousEvent)theEObject;
				T result = caseAsynchronousEvent(asynchronousEvent);
				if (result == null) result = caseMethodCallExpression(asynchronousEvent);
				if (result == null) result = caseNamedElement(asynchronousEvent);
				if (result == null) result = caseExpression(asynchronousEvent);
				if (result == null) result = caseInvocation(asynchronousEvent);
				if (result == null) result = caseTypedElement(asynchronousEvent);
				if (result == null) result = caseCommentableElement(asynchronousEvent);
				if (result == null) result = caseExtendableElement(asynchronousEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.DO_ACTION: {
				DoAction doAction = (DoAction)theEObject;
				T result = caseDoAction(doAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_OR_EXIT_ACTION: {
				EntryOrExitAction entryOrExitAction = (EntryOrExitAction)theEObject;
				T result = caseEntryOrExitAction(entryOrExitAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_ACTION: {
				EntryAction entryAction = (EntryAction)theEObject;
				T result = caseEntryAction(entryAction);
				if (result == null) result = caseEntryOrExitAction(entryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.EXIT_ACTION: {
				ExitAction exitAction = (ExitAction)theEObject;
				T result = caseExitAction(exitAction);
				if (result == null) result = caseEntryOrExitAction(exitAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: {
				SynchronizationChannel synchronizationChannel = (SynchronizationChannel)theEObject;
				T result = caseSynchronizationChannel(synchronizationChannel);
				if (result == null) result = caseCallable(synchronizationChannel);
				if (result == null) result = caseNamedElement(synchronizationChannel);
				if (result == null) result = caseCommentableElement(synchronizationChannel);
				if (result == null) result = caseExtendableElement(synchronizationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = caseInvocation(synchronization);
				if (result == null) result = caseCommentableElement(synchronization);
				if (result == null) result = caseExtendableElement(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.PRIORITIZABLE: {
				Prioritizable prioritizable = (Prioritizable)theEObject;
				T result = casePrioritizable(prioritizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART: {
				FujabaRealtimeStatechart fujabaRealtimeStatechart = (FujabaRealtimeStatechart)theEObject;
				T result = caseFujabaRealtimeStatechart(fujabaRealtimeStatechart);
				if (result == null) result = caseAbstractRealtimeStatechart(fujabaRealtimeStatechart);
				if (result == null) result = caseNamedElement(fujabaRealtimeStatechart);
				if (result == null) result = caseCommentableElement(fujabaRealtimeStatechart);
				if (result == null) result = caseExtendableElement(fujabaRealtimeStatechart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				T result = caseEntryPoint(entryPoint);
				if (result == null) result = caseVertex(entryPoint);
				if (result == null) result = caseNamedElement(entryPoint);
				if (result == null) result = caseExtendableElement(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.EXIT_POINT: {
				ExitPoint exitPoint = (ExitPoint)theEObject;
				T result = caseExitPoint(exitPoint);
				if (result == null) result = caseVertex(exitPoint);
				if (result == null) result = caseNamedElement(exitPoint);
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
	 * Returns the result of interpreting the object as an instance of '<em>History State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryState(HistoryState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousEvent(AsynchronousEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoAction(DoAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Or Exit Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Or Exit Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryOrExitAction(EntryOrExitAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryAction(EntryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitAction(ExitAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Prioritizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prioritizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritizable(Prioritizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fujaba Realtime Statechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFujabaRealtimeStatechart(FujabaRealtimeStatechart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocation(Invocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCallExpression(MethodCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallable(Callable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Realtime Statechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRealtimeStatechart(AbstractRealtimeStatechart object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //RealtimestatechartSwitch
