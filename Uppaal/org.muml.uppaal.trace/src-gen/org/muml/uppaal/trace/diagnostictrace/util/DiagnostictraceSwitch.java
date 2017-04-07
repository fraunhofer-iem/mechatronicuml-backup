/**
 */
package org.muml.uppaal.trace.diagnostictrace.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.muml.uppaal.trace.diagnostictrace.*;

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
 * @see org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage
 * @generated
 */
public class DiagnostictraceSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static DiagnostictracePackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DiagnostictraceSwitch()
  {
		if (modelPackage == null) {
			modelPackage = DiagnostictracePackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case DiagnostictracePackage.TRACE_REPOSITORY: {
				TraceRepository traceRepository = (TraceRepository)theEObject;
				T result = caseTraceRepository(traceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.PROCESS_IDENTIFIER: {
				ProcessIdentifier processIdentifier = (ProcessIdentifier)theEObject;
				T result = caseProcessIdentifier(processIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.LOCATION_ACTIVITY: {
				LocationActivity locationActivity = (LocationActivity)theEObject;
				T result = caseLocationActivity(locationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.VARIABLE_VALUE: {
				VariableValue variableValue = (VariableValue)theEObject;
				T result = caseVariableValue(variableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.SINGLE_NAMED_ELEMENT_REFERENCE: {
				SingleNamedElementReference singleNamedElementReference = (SingleNamedElementReference)theEObject;
				T result = caseSingleNamedElementReference(singleNamedElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.NAMED_ELEMENT_REFERENCE: {
				NamedElementReference namedElementReference = (NamedElementReference)theEObject;
				T result = caseNamedElementReference(namedElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.TRACE_ITEM: {
				TraceItem traceItem = (TraceItem)theEObject;
				T result = caseTraceItem(traceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseTraceItem(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.EDGE_ACTIVITY: {
				EdgeActivity edgeActivity = (EdgeActivity)theEObject;
				T result = caseEdgeActivity(edgeActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.CHANNEL_SYNCHRONIZATION: {
				ChannelSynchronization channelSynchronization = (ChannelSynchronization)theEObject;
				T result = caseChannelSynchronization(channelSynchronization);
				if (result == null) result = caseSynchronization(channelSynchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.DELAY_TRANSITION: {
				DelayTransition delayTransition = (DelayTransition)theEObject;
				T result = caseDelayTransition(delayTransition);
				if (result == null) result = caseTransition(delayTransition);
				if (result == null) result = caseTraceItem(delayTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.ACTION_TRANSITION: {
				ActionTransition actionTransition = (ActionTransition)theEObject;
				T result = caseActionTransition(actionTransition);
				if (result == null) result = caseTransition(actionTransition);
				if (result == null) result = caseTraceItem(actionTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagnostictracePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseTraceItem(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Repository</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTraceRepository(TraceRepository object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTrace(Trace object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Process Identifier</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcessIdentifier(ProcessIdentifier object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Location Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLocationActivity(LocationActivity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableValue(VariableValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Single Named Element Reference</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Named Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSingleNamedElementReference(SingleNamedElementReference object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Reference</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamedElementReference(NamedElementReference object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Item</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTraceItem(TraceItem object)
  {
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
  public T caseState(State object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEdgeActivity(EdgeActivity object)
  {
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
  public T caseSynchronization(Synchronization object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Synchronization</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseChannelSynchronization(ChannelSynchronization object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Transition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDelayTransition(DelayTransition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActionTransition(ActionTransition object)
  {
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
  public T caseTransition(Transition object)
  {
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //DiagnostictraceSwitch
