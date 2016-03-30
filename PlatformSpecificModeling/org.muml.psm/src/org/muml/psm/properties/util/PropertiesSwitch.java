/**
 */
package org.muml.psm.properties.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.psm.properties.CANMessageFrame;
import org.muml.psm.properties.MessageFrame;
import org.muml.psm.properties.PropertiesPackage;
import org.muml.psm.properties.RequiredMemory;
import org.muml.psm.properties.Scheduling;
import org.muml.psm.properties.WCET;

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
 * @see org.muml.psm.properties.PropertiesPackage
 * @generated
 */
public class PropertiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesSwitch() {
		if (modelPackage == null) {
			modelPackage = PropertiesPackage.eINSTANCE;
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
			case PropertiesPackage.WCET: {
				WCET wcet = (WCET)theEObject;
				T result = caseWCET(wcet);
				if (result == null) result = caseExtension(wcet);
				if (result == null) result = caseExtendableElement(wcet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.REQUIRED_MEMORY: {
				RequiredMemory requiredMemory = (RequiredMemory)theEObject;
				T result = caseRequiredMemory(requiredMemory);
				if (result == null) result = caseExtension(requiredMemory);
				if (result == null) result = caseExtendableElement(requiredMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.SCHEDULING: {
				Scheduling scheduling = (Scheduling)theEObject;
				T result = caseScheduling(scheduling);
				if (result == null) result = caseExtension(scheduling);
				if (result == null) result = caseExtendableElement(scheduling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.MESSAGE_FRAME: {
				MessageFrame messageFrame = (MessageFrame)theEObject;
				T result = caseMessageFrame(messageFrame);
				if (result == null) result = caseExtension(messageFrame);
				if (result == null) result = caseExtendableElement(messageFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PropertiesPackage.CAN_MESSAGE_FRAME: {
				CANMessageFrame canMessageFrame = (CANMessageFrame)theEObject;
				T result = caseCANMessageFrame(canMessageFrame);
				if (result == null) result = caseMessageFrame(canMessageFrame);
				if (result == null) result = caseExtension(canMessageFrame);
				if (result == null) result = caseExtendableElement(canMessageFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCET(WCET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredMemory(RequiredMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduling(Scheduling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFrame(MessageFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAN Message Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAN Message Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCANMessageFrame(CANMessageFrame object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
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

} //PropertiesSwitch
