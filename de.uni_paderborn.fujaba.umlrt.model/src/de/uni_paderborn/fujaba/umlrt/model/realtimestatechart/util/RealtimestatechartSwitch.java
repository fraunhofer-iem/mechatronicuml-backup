/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.util;

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
			case RealtimestatechartPackage.UML_CLOCK: {
				UMLClock umlClock = (UMLClock)theEObject;
				T result = caseUMLClock(umlClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE: {
				UMLRealtimeComplexState umlRealtimeComplexState = (UMLRealtimeComplexState)theEObject;
				T result = caseUMLRealtimeComplexState(umlRealtimeComplexState);
				if (result == null) result = caseUMLRealtimeState(umlRealtimeComplexState);
				if (result == null) result = caseNamedElement(umlRealtimeComplexState);
				if (result == null) result = caseExtendableElement(umlRealtimeComplexState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART: {
				UMLInterfaceStatechart umlInterfaceStatechart = (UMLInterfaceStatechart)theEObject;
				T result = caseUMLInterfaceStatechart(umlInterfaceStatechart);
				if (result == null) result = caseUMLRealtimeStatechart(umlInterfaceStatechart);
				if (result == null) result = caseNamedElement(umlInterfaceStatechart);
				if (result == null) result = caseCommentableElement(umlInterfaceStatechart);
				if (result == null) result = caseExtendableElement(umlInterfaceStatechart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_ACTION: {
				UMLRealtimeAction umlRealtimeAction = (UMLRealtimeAction)theEObject;
				T result = caseUMLRealtimeAction(umlRealtimeAction);
				if (result == null) result = caseExpression(umlRealtimeAction);
				if (result == null) result = caseTypedElement(umlRealtimeAction);
				if (result == null) result = caseCommentableElement(umlRealtimeAction);
				if (result == null) result = caseExtendableElement(umlRealtimeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_EVENT: {
				UMLRealtimeEvent umlRealtimeEvent = (UMLRealtimeEvent)theEObject;
				T result = caseUMLRealtimeEvent(umlRealtimeEvent);
				if (result == null) result = caseMethodCallExpression(umlRealtimeEvent);
				if (result == null) result = caseExpression(umlRealtimeEvent);
				if (result == null) result = caseInvocation(umlRealtimeEvent);
				if (result == null) result = caseTypedElement(umlRealtimeEvent);
				if (result == null) result = caseCommentableElement(umlRealtimeEvent);
				if (result == null) result = caseExtendableElement(umlRealtimeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_FADING_FUNCTION: {
				UMLRealtimeFadingFunction umlRealtimeFadingFunction = (UMLRealtimeFadingFunction)theEObject;
				T result = caseUMLRealtimeFadingFunction(umlRealtimeFadingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING: {
				UMLRealtimeFlatSwitching umlRealtimeFlatSwitching = (UMLRealtimeFlatSwitching)theEObject;
				T result = caseUMLRealtimeFlatSwitching(umlRealtimeFlatSwitching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_START_STATE: {
				UMLRealtimeStartState umlRealtimeStartState = (UMLRealtimeStartState)theEObject;
				T result = caseUMLRealtimeStartState(umlRealtimeStartState);
				if (result == null) result = caseUMLRealtimeState(umlRealtimeStartState);
				if (result == null) result = caseNamedElement(umlRealtimeStartState);
				if (result == null) result = caseExtendableElement(umlRealtimeStartState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_STATE: {
				UMLRealtimeState umlRealtimeState = (UMLRealtimeState)theEObject;
				T result = caseUMLRealtimeState(umlRealtimeState);
				if (result == null) result = caseNamedElement(umlRealtimeState);
				if (result == null) result = caseExtendableElement(umlRealtimeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_STATECHART: {
				UMLRealtimeStatechart umlRealtimeStatechart = (UMLRealtimeStatechart)theEObject;
				T result = caseUMLRealtimeStatechart(umlRealtimeStatechart);
				if (result == null) result = caseNamedElement(umlRealtimeStatechart);
				if (result == null) result = caseCommentableElement(umlRealtimeStatechart);
				if (result == null) result = caseExtendableElement(umlRealtimeStatechart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_STOP_STATE: {
				UMLRealtimeStopState umlRealtimeStopState = (UMLRealtimeStopState)theEObject;
				T result = caseUMLRealtimeStopState(umlRealtimeStopState);
				if (result == null) result = caseUMLRealtimeState(umlRealtimeStopState);
				if (result == null) result = caseNamedElement(umlRealtimeStopState);
				if (result == null) result = caseExtendableElement(umlRealtimeStopState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION: {
				UMLRealtimeTransition umlRealtimeTransition = (UMLRealtimeTransition)theEObject;
				T result = caseUMLRealtimeTransition(umlRealtimeTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: {
				SynchronizationChannel synchronizationChannel = (SynchronizationChannel)theEObject;
				T result = caseSynchronizationChannel(synchronizationChannel);
				if (result == null) result = caseNamedElement(synchronizationChannel);
				if (result == null) result = caseCallable(synchronizationChannel);
				if (result == null) result = caseCommentableElement(synchronizationChannel);
				if (result == null) result = caseExtendableElement(synchronizationChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT: {
				UMLTimeConstraint umlTimeConstraint = (UMLTimeConstraint)theEObject;
				T result = caseUMLTimeConstraint(umlTimeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.HISTORY_STATE: {
				HistoryState historyState = (HistoryState)theEObject;
				T result = caseHistoryState(historyState);
				if (result == null) result = caseUMLRealtimeState(historyState);
				if (result == null) result = caseNamedElement(historyState);
				if (result == null) result = caseExtendableElement(historyState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.DO_EVENT: {
				DoEvent doEvent = (DoEvent)theEObject;
				T result = caseDoEvent(doEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT: {
				EntryOrExitEvent entryOrExitEvent = (EntryOrExitEvent)theEObject;
				T result = caseEntryOrExitEvent(entryOrExitEvent);
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
	 * Returns the result of interpreting the object as an instance of '<em>UML Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClock(UMLClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Complex State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Complex State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeComplexState(UMLRealtimeComplexState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Interface Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Interface Statechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLInterfaceStatechart(UMLInterfaceStatechart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeAction(UMLRealtimeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeEvent(UMLRealtimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Fading Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Fading Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeFadingFunction(UMLRealtimeFadingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Flat Switching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Flat Switching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeFlatSwitching(UMLRealtimeFlatSwitching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Start State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Start State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeStartState(UMLRealtimeStartState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeState(UMLRealtimeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Statechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeStatechart(UMLRealtimeStatechart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Stop State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Stop State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeStopState(UMLRealtimeStopState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Realtime Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Realtime Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRealtimeTransition(UMLRealtimeTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>UML Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLTimeConstraint(UMLTimeConstraint object) {
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
