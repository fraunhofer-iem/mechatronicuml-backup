/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.util;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;

import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

import de.uni_paderborn.fujaba.muml.model.core.DataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

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
				if (result == null) result = casePort(reconfigurationPort);
				if (result == null) result = caseNamedElement(reconfigurationPort);
				if (result == null) result = caseCommentableElement(reconfigurationPort);
				if (result == null) result = caseConstrainableElement(reconfigurationPort);
				if (result == null) result = caseExtendableElement(reconfigurationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER: {
				ReconfigurationController reconfigurationController = (ReconfigurationController)theEObject;
				T result = caseReconfigurationController(reconfigurationController);
				if (result == null) result = caseNamedElement(reconfigurationController);
				if (result == null) result = caseCommentableElement(reconfigurationController);
				if (result == null) result = caseExtendableElement(reconfigurationController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseReconfigurationController(manager);
				if (result == null) result = caseNamedElement(manager);
				if (result == null) result = caseCommentableElement(manager);
				if (result == null) result = caseExtendableElement(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTOR: {
				Executor executor = (Executor)theEObject;
				T result = caseExecutor(executor);
				if (result == null) result = caseReconfigurationController(executor);
				if (result == null) result = caseNamedElement(executor);
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
			case ReconfigurationPackage.PART_DATA_TYPE: {
				PartDataType partDataType = (PartDataType)theEObject;
				T result = casePartDataType(partDataType);
				if (result == null) result = caseDataType(partDataType);
				if (result == null) result = caseNamedElement(partDataType);
				if (result == null) result = caseCommentableElement(partDataType);
				if (result == null) result = caseExtendableElement(partDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.PORT_DATA_TYPE: {
				PortDataType portDataType = (PortDataType)theEObject;
				T result = casePortDataType(portDataType);
				if (result == null) result = caseDataType(portDataType);
				if (result == null) result = caseNamedElement(portDataType);
				if (result == null) result = caseCommentableElement(portDataType);
				if (result == null) result = caseExtendableElement(portDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURABLE_COMPONENT: {
				ReconfigurableComponent reconfigurableComponent = (ReconfigurableComponent)theEObject;
				T result = caseReconfigurableComponent(reconfigurableComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER_IMPLEMENTATION: {
				ReconfigurationControllerImplementation reconfigurationControllerImplementation = (ReconfigurationControllerImplementation)theEObject;
				T result = caseReconfigurationControllerImplementation(reconfigurationControllerImplementation);
				if (result == null) result = caseNamedElement(reconfigurationControllerImplementation);
				if (result == null) result = caseCommentableElement(reconfigurationControllerImplementation);
				if (result == null) result = caseExtendableElement(reconfigurationControllerImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.STATECHART_IMPLEMENTATION: {
				StatechartImplementation statechartImplementation = (StatechartImplementation)theEObject;
				T result = caseStatechartImplementation(statechartImplementation);
				if (result == null) result = caseReconfigurationControllerImplementation(statechartImplementation);
				if (result == null) result = caseNamedElement(statechartImplementation);
				if (result == null) result = caseCommentableElement(statechartImplementation);
				if (result == null) result = caseExtendableElement(statechartImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: {
				ReconfigurationMessagePort reconfigurationMessagePort = (ReconfigurationMessagePort)theEObject;
				T result = caseReconfigurationMessagePort(reconfigurationMessagePort);
				if (result == null) result = caseReconfigurationPort(reconfigurationMessagePort);
				if (result == null) result = casePort(reconfigurationMessagePort);
				if (result == null) result = caseNamedElement(reconfigurationMessagePort);
				if (result == null) result = caseCommentableElement(reconfigurationMessagePort);
				if (result == null) result = caseConstrainableElement(reconfigurationMessagePort);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: {
				ReconfigurationExecutionPort reconfigurationExecutionPort = (ReconfigurationExecutionPort)theEObject;
				T result = caseReconfigurationExecutionPort(reconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationPort(reconfigurationExecutionPort);
				if (result == null) result = casePort(reconfigurationExecutionPort);
				if (result == null) result = caseNamedElement(reconfigurationExecutionPort);
				if (result == null) result = caseCommentableElement(reconfigurationExecutionPort);
				if (result == null) result = caseConstrainableElement(reconfigurationExecutionPort);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: {
				ExecutorSpecificationEntry executorSpecificationEntry = (ExecutorSpecificationEntry)theEObject;
				T result = caseExecutorSpecificationEntry(executorSpecificationEntry);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_TYPE: {
				ReconfigurationMessageType reconfigurationMessageType = (ReconfigurationMessageType)theEObject;
				T result = caseReconfigurationMessageType(reconfigurationMessageType);
				if (result == null) result = caseNamedElement(reconfigurationMessageType);
				if (result == null) result = caseExtendableElement(reconfigurationMessageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY: {
				ReconfigurationMessagePortEntry reconfigurationMessagePortEntry = (ReconfigurationMessagePortEntry)theEObject;
				T result = caseReconfigurationMessagePortEntry(reconfigurationMessagePortEntry);
				if (result == null) result = caseCommentableElement(reconfigurationMessagePortEntry);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePortEntry);
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
	public T caseReconfigurationController(ReconfigurationController object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Part Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDataType(PartDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDataType(PortDataType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Controller Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationControllerImplementation(ReconfigurationControllerImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statechart Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statechart Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatechartImplementation(StatechartImplementation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationMessageType(ReconfigurationMessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Port Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Port Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationMessagePortEntry(ReconfigurationMessagePortEntry object) {
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
