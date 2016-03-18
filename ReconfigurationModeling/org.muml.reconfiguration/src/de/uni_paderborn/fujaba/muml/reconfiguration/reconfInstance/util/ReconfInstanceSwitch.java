/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;

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
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage
 * @generated
 */
public class ReconfInstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfInstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfInstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = ReconfInstancePackage.eINSTANCE;
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
			case ReconfInstancePackage.RECONFIGURABLE_COMPONENT_INSTANCE: {
				ReconfigurableComponentInstance reconfigurableComponentInstance = (ReconfigurableComponentInstance)theEObject;
				T result = caseReconfigurableComponentInstance(reconfigurableComponentInstance);
				if (result == null) result = caseComponentInstance(reconfigurableComponentInstance);
				if (result == null) result = caseNamedElement(reconfigurableComponentInstance);
				if (result == null) result = caseExtendableElement(reconfigurableComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURATION_PORT_INSTANCE: {
				ReconfigurationPortInstance reconfigurationPortInstance = (ReconfigurationPortInstance)theEObject;
				T result = caseReconfigurationPortInstance(reconfigurationPortInstance);
				if (result == null) result = casePortInstance(reconfigurationPortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(reconfigurationPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(reconfigurationPortInstance);
				if (result == null) result = caseNamedElement(reconfigurationPortInstance);
				if (result == null) result = caseCommentableElement(reconfigurationPortInstance);
				if (result == null) result = caseExtendableElement(reconfigurationPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURATION_MESSAGE_PORT_INSTANCE: {
				ReconfigurationMessagePortInstance reconfigurationMessagePortInstance = (ReconfigurationMessagePortInstance)theEObject;
				T result = caseReconfigurationMessagePortInstance(reconfigurationMessagePortInstance);
				if (result == null) result = caseReconfigurationPortInstance(reconfigurationMessagePortInstance);
				if (result == null) result = casePortInstance(reconfigurationMessagePortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(reconfigurationMessagePortInstance);
				if (result == null) result = caseConnectorEndpointInstance(reconfigurationMessagePortInstance);
				if (result == null) result = caseNamedElement(reconfigurationMessagePortInstance);
				if (result == null) result = caseCommentableElement(reconfigurationMessagePortInstance);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURATION_EXECUTION_PORT_INSTANCE: {
				ReconfigurationExecutionPortInstance reconfigurationExecutionPortInstance = (ReconfigurationExecutionPortInstance)theEObject;
				T result = caseReconfigurationExecutionPortInstance(reconfigurationExecutionPortInstance);
				if (result == null) result = caseReconfigurationPortInstance(reconfigurationExecutionPortInstance);
				if (result == null) result = casePortInstance(reconfigurationExecutionPortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(reconfigurationExecutionPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(reconfigurationExecutionPortInstance);
				if (result == null) result = caseNamedElement(reconfigurationExecutionPortInstance);
				if (result == null) result = caseCommentableElement(reconfigurationExecutionPortInstance);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE: {
				InternalReconfigurationCommunicationPortInstance internalReconfigurationCommunicationPortInstance = (InternalReconfigurationCommunicationPortInstance)theEObject;
				T result = caseInternalReconfigurationCommunicationPortInstance(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseReconfigurationPortInstance(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = casePortInstance(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseNamedElement(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseCommentableElement(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = caseExtendableElement(internalReconfigurationCommunicationPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURATION_CONTROLLER_INSTANCE: {
				ReconfigurationControllerInstance reconfigurationControllerInstance = (ReconfigurationControllerInstance)theEObject;
				T result = caseReconfigurationControllerInstance(reconfigurationControllerInstance);
				if (result == null) result = caseControllerInstance(reconfigurationControllerInstance);
				if (result == null) result = caseExtendableElement(reconfigurationControllerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.CONTROLLER_INSTANCE: {
				ControllerInstance controllerInstance = (ControllerInstance)theEObject;
				T result = caseControllerInstance(controllerInstance);
				if (result == null) result = caseExtendableElement(controllerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE: {
				RuleBasedReconfigurationControllerInstance ruleBasedReconfigurationControllerInstance = (RuleBasedReconfigurationControllerInstance)theEObject;
				T result = caseRuleBasedReconfigurationControllerInstance(ruleBasedReconfigurationControllerInstance);
				if (result == null) result = caseReconfigurationControllerInstance(ruleBasedReconfigurationControllerInstance);
				if (result == null) result = caseControllerInstance(ruleBasedReconfigurationControllerInstance);
				if (result == null) result = caseExtendableElement(ruleBasedReconfigurationControllerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.MANAGER_INSTANCE: {
				ManagerInstance managerInstance = (ManagerInstance)theEObject;
				T result = caseManagerInstance(managerInstance);
				if (result == null) result = caseNamedElement(managerInstance);
				if (result == null) result = caseExtendableElement(managerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.EXECUTOR_INSTANCE: {
				ExecutorInstance executorInstance = (ExecutorInstance)theEObject;
				T result = caseExecutorInstance(executorInstance);
				if (result == null) result = caseNamedElement(executorInstance);
				if (result == null) result = caseExtendableElement(executorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE: {
				ReconfigurableAtomicComponentInstance reconfigurableAtomicComponentInstance = (ReconfigurableAtomicComponentInstance)theEObject;
				T result = caseReconfigurableAtomicComponentInstance(reconfigurableAtomicComponentInstance);
				if (result == null) result = caseAtomicComponentInstance(reconfigurableAtomicComponentInstance);
				if (result == null) result = caseComponentInstance(reconfigurableAtomicComponentInstance);
				if (result == null) result = caseNamedElement(reconfigurableAtomicComponentInstance);
				if (result == null) result = caseExtendableElement(reconfigurableAtomicComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfInstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE: {
				ReconfigurableStructuredComponentInstance reconfigurableStructuredComponentInstance = (ReconfigurableStructuredComponentInstance)theEObject;
				T result = caseReconfigurableStructuredComponentInstance(reconfigurableStructuredComponentInstance);
				if (result == null) result = caseStructuredComponentInstance(reconfigurableStructuredComponentInstance);
				if (result == null) result = caseComponentInstance(reconfigurableStructuredComponentInstance);
				if (result == null) result = caseNamedElement(reconfigurableStructuredComponentInstance);
				if (result == null) result = caseExtendableElement(reconfigurableStructuredComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableComponentInstance(ReconfigurableComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationPortInstance(ReconfigurationPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Message Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Message Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationMessagePortInstance(ReconfigurationMessagePortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Execution Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Execution Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationExecutionPortInstance(ReconfigurationExecutionPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Reconfiguration Communication Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Reconfiguration Communication Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalReconfigurationCommunicationPortInstance(InternalReconfigurationCommunicationPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Controller Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Controller Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationControllerInstance(ReconfigurationControllerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerInstance(ControllerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Based Reconfiguration Controller Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Based Reconfiguration Controller Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBasedReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagerInstance(ManagerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutorInstance(ExecutorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Atomic Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableAtomicComponentInstance(ReconfigurableAtomicComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Structured Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableStructuredComponentInstance(ReconfigurableStructuredComponentInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpointInstance(ConnectorEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstance(PortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpointInstance(DiscreteInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicComponentInstance(AtomicComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredComponentInstance(StructuredComponentInstance object) {
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

} //ReconfInstanceSwitch
