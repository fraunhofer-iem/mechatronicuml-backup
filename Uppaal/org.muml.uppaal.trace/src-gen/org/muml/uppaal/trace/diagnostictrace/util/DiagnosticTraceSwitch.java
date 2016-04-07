/**
 */
package org.muml.uppaal.trace.diagnosticTrace.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.trace.diagnosticTrace.ActionTransition;
import org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization;
import org.muml.uppaal.trace.diagnosticTrace.DelayTransition;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.EdgeActivity;
import org.muml.uppaal.trace.diagnosticTrace.LocationActivity;
import org.muml.uppaal.trace.diagnosticTrace.NamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier;
import org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.State;
import org.muml.uppaal.trace.diagnosticTrace.Synchronization;
import org.muml.uppaal.trace.diagnosticTrace.Trace;
import org.muml.uppaal.trace.diagnosticTrace.TraceItem;
import org.muml.uppaal.trace.diagnosticTrace.TraceRepository;
import org.muml.uppaal.trace.diagnosticTrace.Transition;
import org.muml.uppaal.trace.diagnosticTrace.VariableValue;
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
 * @see org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage
 * @generated
 */
public class DiagnosticTraceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticTraceSwitch() {
		if (modelPackage == null) {
			modelPackage = org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.eINSTANCE;
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY: {
				org.muml.uppaal.trace.diagnostictrace.TraceRepository traceRepository = (org.muml.uppaal.trace.diagnostictrace.TraceRepository)theEObject;
				T result = caseTraceRepository(traceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE: {
				org.muml.uppaal.trace.diagnostictrace.Trace trace = (org.muml.uppaal.trace.diagnostictrace.Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.PROCESS_IDENTIFIER: {
				org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier processIdentifier = (org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier)theEObject;
				T result = caseProcessIdentifier(processIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.LOCATION_ACTIVITY: {
				org.muml.uppaal.trace.diagnostictrace.LocationActivity locationActivity = (org.muml.uppaal.trace.diagnostictrace.LocationActivity)theEObject;
				T result = caseLocationActivity(locationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE: {
				org.muml.uppaal.trace.diagnostictrace.VariableValue variableValue = (org.muml.uppaal.trace.diagnostictrace.VariableValue)theEObject;
				T result = caseVariableValue(variableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.SINGLE_NAMED_ELEMENT_REFERENCE: {
				org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference singleNamedElementReference = (org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference)theEObject;
				T result = caseSingleNamedElementReference(singleNamedElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE: {
				org.muml.uppaal.trace.diagnostictrace.NamedElementReference namedElementReference = (org.muml.uppaal.trace.diagnostictrace.NamedElementReference)theEObject;
				T result = caseNamedElementReference(namedElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_ITEM: {
				org.muml.uppaal.trace.diagnostictrace.TraceItem traceItem = (org.muml.uppaal.trace.diagnostictrace.TraceItem)theEObject;
				T result = caseTraceItem(traceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE: {
				org.muml.uppaal.trace.diagnostictrace.State state = (org.muml.uppaal.trace.diagnostictrace.State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseTraceItem(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.EDGE_ACTIVITY: {
				org.muml.uppaal.trace.diagnostictrace.EdgeActivity edgeActivity = (org.muml.uppaal.trace.diagnostictrace.EdgeActivity)theEObject;
				T result = caseEdgeActivity(edgeActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.SYNCHRONIZATION: {
				org.muml.uppaal.trace.diagnostictrace.Synchronization synchronization = (org.muml.uppaal.trace.diagnostictrace.Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.CHANNEL_SYNCHRONIZATION: {
				org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization channelSynchronization = (org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization)theEObject;
				T result = caseChannelSynchronization(channelSynchronization);
				if (result == null) result = caseSynchronization(channelSynchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.DELAY_TRANSITION: {
				org.muml.uppaal.trace.diagnostictrace.DelayTransition delayTransition = (org.muml.uppaal.trace.diagnostictrace.DelayTransition)theEObject;
				T result = caseDelayTransition(delayTransition);
				if (result == null) result = caseTransition(delayTransition);
				if (result == null) result = caseTraceItem(delayTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.ACTION_TRANSITION: {
				org.muml.uppaal.trace.diagnostictrace.ActionTransition actionTransition = (org.muml.uppaal.trace.diagnostictrace.ActionTransition)theEObject;
				T result = caseActionTransition(actionTransition);
				if (result == null) result = caseTransition(actionTransition);
				if (result == null) result = caseTraceItem(actionTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRANSITION: {
				org.muml.uppaal.trace.diagnostictrace.Transition transition = (org.muml.uppaal.trace.diagnostictrace.Transition)theEObject;
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
	public T caseTraceRepository(org.muml.uppaal.trace.diagnostictrace.TraceRepository object) {
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
	public T caseTrace(org.muml.uppaal.trace.diagnostictrace.Trace object) {
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
	public T caseProcessIdentifier(org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier object) {
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
	public T caseLocationActivity(org.muml.uppaal.trace.diagnostictrace.LocationActivity object) {
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
	public T caseVariableValue(org.muml.uppaal.trace.diagnostictrace.VariableValue object) {
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
	public T caseSingleNamedElementReference(org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference object) {
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
	public T caseNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference object) {
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
	public T caseTraceItem(org.muml.uppaal.trace.diagnostictrace.TraceItem object) {
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
	public T caseState(org.muml.uppaal.trace.diagnostictrace.State object) {
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
	public T caseEdgeActivity(org.muml.uppaal.trace.diagnostictrace.EdgeActivity object) {
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
	public T caseSynchronization(org.muml.uppaal.trace.diagnostictrace.Synchronization object) {
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
	public T caseChannelSynchronization(org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization object) {
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
	public T caseDelayTransition(org.muml.uppaal.trace.diagnostictrace.DelayTransition object) {
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
	public T caseActionTransition(org.muml.uppaal.trace.diagnostictrace.ActionTransition object) {
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
	public T caseTransition(org.muml.uppaal.trace.diagnostictrace.Transition object) {
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

} //DiagnosticTraceSwitch
