/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.constraint.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.*;
import de.uni_paderborn.fujaba.muml.types.DataType;

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
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage
 * @generated
 */
public class ReconfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = ReconfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT: {
				ReconfigurableStructuredComponent reconfigurableStructuredComponent = (ReconfigurableStructuredComponent)theEObject;
				T result = caseReconfigurableStructuredComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseStructuredComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseReconfigurableComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseNamedElement(reconfigurableStructuredComponent);
				if (result == null) result = caseCommentableElement(reconfigurableStructuredComponent);
				if (result == null) result = caseConstrainableElement(reconfigurableStructuredComponent);
				if (result == null) result = caseExtendableElement(reconfigurableStructuredComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_PORT: {
				ReconfigurationPort reconfigurationPort = (ReconfigurationPort)theEObject;
				T result = caseReconfigurationPort(reconfigurationPort);
				if (result == null) result = caseDiscretePort(reconfigurationPort);
				if (result == null) result = casePort(reconfigurationPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationPort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationPort);
				if (result == null) result = caseConstrainableElement(reconfigurationPort);
				if (result == null) result = caseDataType(reconfigurationPort);
				if (result == null) result = caseBehavioralElement(reconfigurationPort);
				if (result == null) result = caseNamedElement(reconfigurationPort);
				if (result == null) result = caseCommentableElement(reconfigurationPort);
				if (result == null) result = caseExtendableElement(reconfigurationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseBehavioralElement(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = caseCommentableElement(controller);
				if (result == null) result = caseExtendableElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseCommentableElement(manager);
				if (result == null) result = caseExtendableElement(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTOR: {
				Executor executor = (Executor)theEObject;
				T result = caseExecutor(executor);
				if (result == null) result = caseCommentableElement(executor);
				if (result == null) result = caseExtendableElement(executor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_RULE: {
				ReconfigurationRule reconfigurationRule = (ReconfigurationRule)theEObject;
				T result = caseReconfigurationRule(reconfigurationRule);
				if (result == null) result = caseNamedElement(reconfigurationRule);
				if (result == null) result = caseCommentableElement(reconfigurationRule);
				if (result == null) result = caseExtendableElement(reconfigurationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONDITION: {
				ReconfigurationCondition reconfigurationCondition = (ReconfigurationCondition)theEObject;
				T result = caseReconfigurationCondition(reconfigurationCondition);
				if (result == null) result = caseNamedElement(reconfigurationCondition);
				if (result == null) result = caseCommentableElement(reconfigurationCondition);
				if (result == null) result = caseExtendableElement(reconfigurationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURABLE_COMPONENT: {
				ReconfigurableComponent reconfigurableComponent = (ReconfigurableComponent)theEObject;
				T result = caseReconfigurableComponent(reconfigurableComponent);
				if (result == null) result = caseComponent(reconfigurableComponent);
				if (result == null) result = caseNamedElement(reconfigurableComponent);
				if (result == null) result = caseCommentableElement(reconfigurableComponent);
				if (result == null) result = caseConstrainableElement(reconfigurableComponent);
				if (result == null) result = caseExtendableElement(reconfigurableComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: {
				ReconfigurationMessagePort reconfigurationMessagePort = (ReconfigurationMessagePort)theEObject;
				T result = caseReconfigurationMessagePort(reconfigurationMessagePort);
				if (result == null) result = caseReconfigurationPort(reconfigurationMessagePort);
				if (result == null) result = caseDiscretePort(reconfigurationMessagePort);
				if (result == null) result = casePort(reconfigurationMessagePort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationMessagePort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationMessagePort);
				if (result == null) result = caseConstrainableElement(reconfigurationMessagePort);
				if (result == null) result = caseDataType(reconfigurationMessagePort);
				if (result == null) result = caseBehavioralElement(reconfigurationMessagePort);
				if (result == null) result = caseNamedElement(reconfigurationMessagePort);
				if (result == null) result = caseCommentableElement(reconfigurationMessagePort);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: {
				ReconfigurationExecutionPort reconfigurationExecutionPort = (ReconfigurationExecutionPort)theEObject;
				T result = caseReconfigurationExecutionPort(reconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationPort(reconfigurationExecutionPort);
				if (result == null) result = caseDiscretePort(reconfigurationExecutionPort);
				if (result == null) result = casePort(reconfigurationExecutionPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationExecutionPort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationExecutionPort);
				if (result == null) result = caseConstrainableElement(reconfigurationExecutionPort);
				if (result == null) result = caseDataType(reconfigurationExecutionPort);
				if (result == null) result = caseBehavioralElement(reconfigurationExecutionPort);
				if (result == null) result = caseNamedElement(reconfigurationExecutionPort);
				if (result == null) result = caseCommentableElement(reconfigurationExecutionPort);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: {
				ExecutorSpecificationEntry executorSpecificationEntry = (ExecutorSpecificationEntry)theEObject;
				T result = caseExecutorSpecificationEntry(executorSpecificationEntry);
				if (result == null) result = caseExtendableElement(executorSpecificationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY: {
				ManagerSpecificationEntry managerSpecificationEntry = (ManagerSpecificationEntry)theEObject;
				T result = caseManagerSpecificationEntry(managerSpecificationEntry);
				if (result == null) result = caseCommentableElement(managerSpecificationEntry);
				if (result == null) result = caseExtendableElement(managerSpecificationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER: {
				ReconfigurationController reconfigurationController = (ReconfigurationController)theEObject;
				T result = caseReconfigurationController(reconfigurationController);
				if (result == null) result = caseController(reconfigurationController);
				if (result == null) result = caseBehavioralElement(reconfigurationController);
				if (result == null) result = caseNamedElement(reconfigurationController);
				if (result == null) result = caseCommentableElement(reconfigurationController);
				if (result == null) result = caseExtendableElement(reconfigurationController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER: {
				RuleBasedReconfigurationController ruleBasedReconfigurationController = (RuleBasedReconfigurationController)theEObject;
				T result = caseRuleBasedReconfigurationController(ruleBasedReconfigurationController);
				if (result == null) result = caseReconfigurationController(ruleBasedReconfigurationController);
				if (result == null) result = caseController(ruleBasedReconfigurationController);
				if (result == null) result = caseBehavioralElement(ruleBasedReconfigurationController);
				if (result == null) result = caseNamedElement(ruleBasedReconfigurationController);
				if (result == null) result = caseCommentableElement(ruleBasedReconfigurationController);
				if (result == null) result = caseExtendableElement(ruleBasedReconfigurationController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXTERNAL_RECONFIGURATION_EXECUTION_PORT: {
				ExternalReconfigurationExecutionPort externalReconfigurationExecutionPort = (ExternalReconfigurationExecutionPort)theEObject;
				T result = caseExternalReconfigurationExecutionPort(externalReconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationExecutionPort(externalReconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationPort(externalReconfigurationExecutionPort);
				if (result == null) result = caseDiscretePort(externalReconfigurationExecutionPort);
				if (result == null) result = casePort(externalReconfigurationExecutionPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(externalReconfigurationExecutionPort);
				if (result == null) result = caseConnectorEndpoint(externalReconfigurationExecutionPort);
				if (result == null) result = caseConstrainableElement(externalReconfigurationExecutionPort);
				if (result == null) result = caseDataType(externalReconfigurationExecutionPort);
				if (result == null) result = caseBehavioralElement(externalReconfigurationExecutionPort);
				if (result == null) result = caseNamedElement(externalReconfigurationExecutionPort);
				if (result == null) result = caseCommentableElement(externalReconfigurationExecutionPort);
				if (result == null) result = caseExtendableElement(externalReconfigurationExecutionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.INTERNAL_RECONFIGURATION_EXECUTION_PORT: {
				InternalReconfigurationExecutionPort internalReconfigurationExecutionPort = (InternalReconfigurationExecutionPort)theEObject;
				T result = caseInternalReconfigurationExecutionPort(internalReconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationExecutionPort(internalReconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationPort(internalReconfigurationExecutionPort);
				if (result == null) result = caseDiscretePort(internalReconfigurationExecutionPort);
				if (result == null) result = casePort(internalReconfigurationExecutionPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(internalReconfigurationExecutionPort);
				if (result == null) result = caseConnectorEndpoint(internalReconfigurationExecutionPort);
				if (result == null) result = caseConstrainableElement(internalReconfigurationExecutionPort);
				if (result == null) result = caseDataType(internalReconfigurationExecutionPort);
				if (result == null) result = caseBehavioralElement(internalReconfigurationExecutionPort);
				if (result == null) result = caseNamedElement(internalReconfigurationExecutionPort);
				if (result == null) result = caseCommentableElement(internalReconfigurationExecutionPort);
				if (result == null) result = caseExtendableElement(internalReconfigurationExecutionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Structured Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableStructuredComponent(ReconfigurableStructuredComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationPort(ReconfigurationPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationController(ReconfigurationController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Based Reconfiguration Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Based Reconfiguration Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBasedReconfigurationController(RuleBasedReconfigurationController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reconfiguration Execution Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reconfiguration Execution Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReconfigurationExecutionPort(ExternalReconfigurationExecutionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Reconfiguration Execution Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Reconfiguration Execution Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalReconfigurationExecutionPort(InternalReconfigurationExecutionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutor(Executor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationRule(ReconfigurationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationCondition(ReconfigurationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableComponent(ReconfigurableComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationMessagePort(ReconfigurationMessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationExecutionPort(ReconfigurationExecutionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor Specification Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutorSpecificationEntry(ExecutorSpecificationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager Specification Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagerSpecificationEntry(ManagerSpecificationEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Constrainable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrainable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainableElement(ConstrainableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredComponent(StructuredComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpoint(ConnectorEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralElement(BehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpoint(DiscreteInteractionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscretePort(DiscretePort object) {
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

} //ReconfigurationSwitch
