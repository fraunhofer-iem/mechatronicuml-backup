/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.buffer.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.simulink.Element;
import org.muml.simulink.msglib.buffer.BufferFunction;
import org.muml.simulink.msglib.buffer.BufferPackage;
import org.muml.simulink.msglib.buffer.CheckQueue;
import org.muml.simulink.msglib.buffer.Dequeue;
import org.muml.simulink.msglib.buffer.Enqueue;
import org.muml.simulink.msglib.buffer.SharedCheckQueue;
import org.muml.simulink.msglib.buffer.SharedDequeue;
import org.muml.simulink.msglib.buffer.SharedEnqueue;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.StateflowElement;

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
 * @see org.muml.simulink.msglib.buffer.BufferPackage
 * @generated
 */
public class BufferSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BufferPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferSwitch() {
		if (modelPackage == null) {
			modelPackage = BufferPackage.eINSTANCE;
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
			case BufferPackage.ENQUEUE: {
				Enqueue enqueue = (Enqueue)theEObject;
				T result = caseEnqueue(enqueue);
				if (result == null) result = caseBufferFunction(enqueue);
				if (result == null) result = caseEmbeddedFunction(enqueue);
				if (result == null) result = caseStateflowElement(enqueue);
				if (result == null) result = caseElement(enqueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.DEQUEUE: {
				Dequeue dequeue = (Dequeue)theEObject;
				T result = caseDequeue(dequeue);
				if (result == null) result = caseBufferFunction(dequeue);
				if (result == null) result = caseEmbeddedFunction(dequeue);
				if (result == null) result = caseStateflowElement(dequeue);
				if (result == null) result = caseElement(dequeue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.CHECK_QUEUE: {
				CheckQueue checkQueue = (CheckQueue)theEObject;
				T result = caseCheckQueue(checkQueue);
				if (result == null) result = caseBufferFunction(checkQueue);
				if (result == null) result = caseEmbeddedFunction(checkQueue);
				if (result == null) result = caseStateflowElement(checkQueue);
				if (result == null) result = caseElement(checkQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.SHARED_ENQUEUE: {
				SharedEnqueue sharedEnqueue = (SharedEnqueue)theEObject;
				T result = caseSharedEnqueue(sharedEnqueue);
				if (result == null) result = caseBufferFunction(sharedEnqueue);
				if (result == null) result = caseEmbeddedFunction(sharedEnqueue);
				if (result == null) result = caseStateflowElement(sharedEnqueue);
				if (result == null) result = caseElement(sharedEnqueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.SHARED_DEQUEUE: {
				SharedDequeue sharedDequeue = (SharedDequeue)theEObject;
				T result = caseSharedDequeue(sharedDequeue);
				if (result == null) result = caseBufferFunction(sharedDequeue);
				if (result == null) result = caseEmbeddedFunction(sharedDequeue);
				if (result == null) result = caseStateflowElement(sharedDequeue);
				if (result == null) result = caseElement(sharedDequeue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.SHARED_CHECK_QUEUE: {
				SharedCheckQueue sharedCheckQueue = (SharedCheckQueue)theEObject;
				T result = caseSharedCheckQueue(sharedCheckQueue);
				if (result == null) result = caseBufferFunction(sharedCheckQueue);
				if (result == null) result = caseEmbeddedFunction(sharedCheckQueue);
				if (result == null) result = caseStateflowElement(sharedCheckQueue);
				if (result == null) result = caseElement(sharedCheckQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BufferPackage.BUFFER_FUNCTION: {
				BufferFunction bufferFunction = (BufferFunction)theEObject;
				T result = caseBufferFunction(bufferFunction);
				if (result == null) result = caseEmbeddedFunction(bufferFunction);
				if (result == null) result = caseStateflowElement(bufferFunction);
				if (result == null) result = caseElement(bufferFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enqueue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enqueue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnqueue(Enqueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dequeue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dequeue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDequeue(Dequeue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckQueue(CheckQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Enqueue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Enqueue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedEnqueue(SharedEnqueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Dequeue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Dequeue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedDequeue(SharedDequeue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Check Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Check Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedCheckQueue(SharedCheckQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferFunction(BufferFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateflowElement(StateflowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedFunction(EmbeddedFunction object) {
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

} //BufferSwitch
