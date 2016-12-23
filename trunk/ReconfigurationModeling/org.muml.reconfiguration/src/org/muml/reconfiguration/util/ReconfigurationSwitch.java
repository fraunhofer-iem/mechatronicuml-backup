/**
 */
package org.muml.reconfiguration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Component;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortConnector;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.types.DataType;
import org.muml.reconfiguration.Controller;
import org.muml.reconfiguration.ExecutionTimingSpecification;
import org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase;
import org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.ExecutorSpecificationEntry;
import org.muml.reconfiguration.FadingComponent;
import org.muml.reconfiguration.FadingFunction;
import org.muml.reconfiguration.HybridPortMapping;
import org.muml.reconfiguration.InternalReconfigurationCommunicationPort;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ManagerSpecificationEntry;
import org.muml.reconfiguration.ReconfigurableAtomicComponent;
import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.ReconfigurableStructuredComponent;
import org.muml.reconfiguration.ReconfigurationConstraint;
import org.muml.reconfiguration.ReconfigurationController;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationMessagePort;
import org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.ReconfigurationPort;
import org.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import org.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import org.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationRule;
import org.muml.reconfiguration.RuleBasedReconfigurationController;
import org.muml.reconfiguration.Signature;
import org.muml.reconfiguration.StructuralCondition;

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
 * @see org.muml.reconfiguration.ReconfigurationPackage
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
			case ReconfigurationPackage.RECONFIGURABLE_COMPONENT: {
				ReconfigurableComponent reconfigurableComponent = (ReconfigurableComponent)theEObject;
				T result = caseReconfigurableComponent(reconfigurableComponent);
				if (result == null) result = caseComponent(reconfigurableComponent);
				if (result == null) result = caseDataType(reconfigurableComponent);
				if (result == null) result = caseNamedElement(reconfigurableComponent);
				if (result == null) result = caseExtendableElement(reconfigurableComponent);
				if (result == null) result = caseCommentableElement(reconfigurableComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT: {
				ReconfigurableAtomicComponent reconfigurableAtomicComponent = (ReconfigurableAtomicComponent)theEObject;
				T result = caseReconfigurableAtomicComponent(reconfigurableAtomicComponent);
				if (result == null) result = caseAtomicComponent(reconfigurableAtomicComponent);
				if (result == null) result = caseReconfigurableComponent(reconfigurableAtomicComponent);
				if (result == null) result = caseComponent(reconfigurableAtomicComponent);
				if (result == null) result = caseBehavioralElement(reconfigurableAtomicComponent);
				if (result == null) result = caseVerifiableElement(reconfigurableAtomicComponent);
				if (result == null) result = caseDataType(reconfigurableAtomicComponent);
				if (result == null) result = caseNamedElement(reconfigurableAtomicComponent);
				if (result == null) result = caseExtendableElement(reconfigurableAtomicComponent);
				if (result == null) result = caseCommentableElement(reconfigurableAtomicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT: {
				ReconfigurableStructuredComponent reconfigurableStructuredComponent = (ReconfigurableStructuredComponent)theEObject;
				T result = caseReconfigurableStructuredComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseStructuredComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseReconfigurableComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseComponent(reconfigurableStructuredComponent);
				if (result == null) result = caseDataType(reconfigurableStructuredComponent);
				if (result == null) result = caseNamedElement(reconfigurableStructuredComponent);
				if (result == null) result = caseExtendableElement(reconfigurableStructuredComponent);
				if (result == null) result = caseCommentableElement(reconfigurableStructuredComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_PORT: {
				ReconfigurationPort reconfigurationPort = (ReconfigurationPort)theEObject;
				T result = caseReconfigurationPort(reconfigurationPort);
				if (result == null) result = casePort(reconfigurationPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationPort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationPort);
				if (result == null) result = caseDataType(reconfigurationPort);
				if (result == null) result = caseBehavioralElement(reconfigurationPort);
				if (result == null) result = caseCommentableElement(reconfigurationPort);
				if (result == null) result = caseNamedElement(reconfigurationPort);
				if (result == null) result = caseExtendableElement(reconfigurationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY: {
				ReconfigurationPortInterfaceEntry reconfigurationPortInterfaceEntry = (ReconfigurationPortInterfaceEntry)theEObject;
				T result = caseReconfigurationPortInterfaceEntry(reconfigurationPortInterfaceEntry);
				if (result == null) result = caseExtendableElement(reconfigurationPortInterfaceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: {
				ReconfigurationMessagePort reconfigurationMessagePort = (ReconfigurationMessagePort)theEObject;
				T result = caseReconfigurationMessagePort(reconfigurationMessagePort);
				if (result == null) result = caseReconfigurationPort(reconfigurationMessagePort);
				if (result == null) result = casePort(reconfigurationMessagePort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationMessagePort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationMessagePort);
				if (result == null) result = caseDataType(reconfigurationMessagePort);
				if (result == null) result = caseBehavioralElement(reconfigurationMessagePort);
				if (result == null) result = caseCommentableElement(reconfigurationMessagePort);
				if (result == null) result = caseNamedElement(reconfigurationMessagePort);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY: {
				ReconfigurationMessagePortInterfaceEntry reconfigurationMessagePortInterfaceEntry = (ReconfigurationMessagePortInterfaceEntry)theEObject;
				T result = caseReconfigurationMessagePortInterfaceEntry(reconfigurationMessagePortInterfaceEntry);
				if (result == null) result = caseReconfigurationPortInterfaceEntry(reconfigurationMessagePortInterfaceEntry);
				if (result == null) result = caseExtendableElement(reconfigurationMessagePortInterfaceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: {
				ReconfigurationExecutionPort reconfigurationExecutionPort = (ReconfigurationExecutionPort)theEObject;
				T result = caseReconfigurationExecutionPort(reconfigurationExecutionPort);
				if (result == null) result = caseReconfigurationPort(reconfigurationExecutionPort);
				if (result == null) result = casePort(reconfigurationExecutionPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(reconfigurationExecutionPort);
				if (result == null) result = caseConnectorEndpoint(reconfigurationExecutionPort);
				if (result == null) result = caseDataType(reconfigurationExecutionPort);
				if (result == null) result = caseBehavioralElement(reconfigurationExecutionPort);
				if (result == null) result = caseCommentableElement(reconfigurationExecutionPort);
				if (result == null) result = caseNamedElement(reconfigurationExecutionPort);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY: {
				ReconfigurationExecutionPortInterfaceEntry reconfigurationExecutionPortInterfaceEntry = (ReconfigurationExecutionPortInterfaceEntry)theEObject;
				T result = caseReconfigurationExecutionPortInterfaceEntry(reconfigurationExecutionPortInterfaceEntry);
				if (result == null) result = caseReconfigurationPortInterfaceEntry(reconfigurationExecutionPortInterfaceEntry);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionPortInterfaceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION: {
				ExecutionTimingSpecification executionTimingSpecification = (ExecutionTimingSpecification)theEObject;
				T result = caseExecutionTimingSpecification(executionTimingSpecification);
				if (result == null) result = caseExtendableElement(executionTimingSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE: {
				ExecutionTimingSpecificationSinglePhase executionTimingSpecificationSinglePhase = (ExecutionTimingSpecificationSinglePhase)theEObject;
				T result = caseExecutionTimingSpecificationSinglePhase(executionTimingSpecificationSinglePhase);
				if (result == null) result = caseExecutionTimingSpecification(executionTimingSpecificationSinglePhase);
				if (result == null) result = caseExtendableElement(executionTimingSpecificationSinglePhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE: {
				ExecutionTimingSpecificationThreePhase executionTimingSpecificationThreePhase = (ExecutionTimingSpecificationThreePhase)theEObject;
				T result = caseExecutionTimingSpecificationThreePhase(executionTimingSpecificationThreePhase);
				if (result == null) result = caseExecutionTimingSpecification(executionTimingSpecificationThreePhase);
				if (result == null) result = caseExtendableElement(executionTimingSpecificationThreePhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT: {
				InternalReconfigurationCommunicationPort internalReconfigurationCommunicationPort = (InternalReconfigurationCommunicationPort)theEObject;
				T result = caseInternalReconfigurationCommunicationPort(internalReconfigurationCommunicationPort);
				if (result == null) result = caseReconfigurationPort(internalReconfigurationCommunicationPort);
				if (result == null) result = casePort(internalReconfigurationCommunicationPort);
				if (result == null) result = caseDiscreteInteractionEndpoint(internalReconfigurationCommunicationPort);
				if (result == null) result = caseConnectorEndpoint(internalReconfigurationCommunicationPort);
				if (result == null) result = caseDataType(internalReconfigurationCommunicationPort);
				if (result == null) result = caseBehavioralElement(internalReconfigurationCommunicationPort);
				if (result == null) result = caseCommentableElement(internalReconfigurationCommunicationPort);
				if (result == null) result = caseNamedElement(internalReconfigurationCommunicationPort);
				if (result == null) result = caseExtendableElement(internalReconfigurationCommunicationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = caseBehavioralElement(controller);
				if (result == null) result = caseCommentableElement(controller);
				if (result == null) result = caseExtendableElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER: {
				ReconfigurationController reconfigurationController = (ReconfigurationController)theEObject;
				T result = caseReconfigurationController(reconfigurationController);
				if (result == null) result = caseController(reconfigurationController);
				if (result == null) result = caseNamedElement(reconfigurationController);
				if (result == null) result = caseBehavioralElement(reconfigurationController);
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
				if (result == null) result = caseNamedElement(ruleBasedReconfigurationController);
				if (result == null) result = caseBehavioralElement(ruleBasedReconfigurationController);
				if (result == null) result = caseCommentableElement(ruleBasedReconfigurationController);
				if (result == null) result = caseExtendableElement(ruleBasedReconfigurationController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseCommentableElement(manager);
				if (result == null) result = caseBehavioralElement(manager);
				if (result == null) result = caseExtendableElement(manager);
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
			case ReconfigurationPackage.EXECUTOR: {
				Executor executor = (Executor)theEObject;
				T result = caseExecutor(executor);
				if (result == null) result = caseCommentableElement(executor);
				if (result == null) result = caseBehavioralElement(executor);
				if (result == null) result = caseExtendableElement(executor);
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
			case ReconfigurationPackage.RECONFIGURATION_RULE: {
				ReconfigurationRule reconfigurationRule = (ReconfigurationRule)theEObject;
				T result = caseReconfigurationRule(reconfigurationRule);
				if (result == null) result = caseCommentableElement(reconfigurationRule);
				if (result == null) result = caseExtendableElement(reconfigurationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseNamedElement(signature);
				if (result == null) result = caseExtendableElement(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.STRUCTURAL_CONDITION: {
				StructuralCondition structuralCondition = (StructuralCondition)theEObject;
				T result = caseStructuralCondition(structuralCondition);
				if (result == null) result = caseNamedElement(structuralCondition);
				if (result == null) result = caseCommentableElement(structuralCondition);
				if (result == null) result = caseExtendableElement(structuralCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR: {
				ReconfigurationPortAssemblyConnector reconfigurationPortAssemblyConnector = (ReconfigurationPortAssemblyConnector)theEObject;
				T result = caseReconfigurationPortAssemblyConnector(reconfigurationPortAssemblyConnector);
				if (result == null) result = casePortConnector(reconfigurationPortAssemblyConnector);
				if (result == null) result = caseConnector(reconfigurationPortAssemblyConnector);
				if (result == null) result = caseCommentableElement(reconfigurationPortAssemblyConnector);
				if (result == null) result = caseExtendableElement(reconfigurationPortAssemblyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_PORT_DELEGATION_CONNECTOR: {
				ReconfigurationPortDelegationConnector reconfigurationPortDelegationConnector = (ReconfigurationPortDelegationConnector)theEObject;
				T result = caseReconfigurationPortDelegationConnector(reconfigurationPortDelegationConnector);
				if (result == null) result = casePortConnector(reconfigurationPortDelegationConnector);
				if (result == null) result = caseConnector(reconfigurationPortDelegationConnector);
				if (result == null) result = caseCommentableElement(reconfigurationPortDelegationConnector);
				if (result == null) result = caseExtendableElement(reconfigurationPortDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.FADING_COMPONENT: {
				FadingComponent fadingComponent = (FadingComponent)theEObject;
				T result = caseFadingComponent(fadingComponent);
				if (result == null) result = caseAtomicComponent(fadingComponent);
				if (result == null) result = caseComponent(fadingComponent);
				if (result == null) result = caseBehavioralElement(fadingComponent);
				if (result == null) result = caseVerifiableElement(fadingComponent);
				if (result == null) result = caseDataType(fadingComponent);
				if (result == null) result = caseNamedElement(fadingComponent);
				if (result == null) result = caseExtendableElement(fadingComponent);
				if (result == null) result = caseCommentableElement(fadingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.FADING_FUNCTION: {
				FadingFunction fadingFunction = (FadingFunction)theEObject;
				T result = caseFadingFunction(fadingFunction);
				if (result == null) result = caseNamedElement(fadingFunction);
				if (result == null) result = caseCommentableElement(fadingFunction);
				if (result == null) result = caseExtendableElement(fadingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_CONSTRAINT: {
				ReconfigurationConstraint reconfigurationConstraint = (ReconfigurationConstraint)theEObject;
				T result = caseReconfigurationConstraint(reconfigurationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.HYBRID_PORT_MAPPING: {
				HybridPortMapping hybridPortMapping = (HybridPortMapping)theEObject;
				T result = caseHybridPortMapping(hybridPortMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY: {
				ReconfigurationExecutionSpecificationEntry reconfigurationExecutionSpecificationEntry = (ReconfigurationExecutionSpecificationEntry)theEObject;
				T result = caseReconfigurationExecutionSpecificationEntry(reconfigurationExecutionSpecificationEntry);
				if (result == null) result = caseDataType(reconfigurationExecutionSpecificationEntry);
				if (result == null) result = caseNamedElement(reconfigurationExecutionSpecificationEntry);
				if (result == null) result = caseCommentableElement(reconfigurationExecutionSpecificationEntry);
				if (result == null) result = caseExtendableElement(reconfigurationExecutionSpecificationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY: {
				ReconfigurationManagementSpecificationEntry reconfigurationManagementSpecificationEntry = (ReconfigurationManagementSpecificationEntry)theEObject;
				T result = caseReconfigurationManagementSpecificationEntry(reconfigurationManagementSpecificationEntry);
				if (result == null) result = caseDataType(reconfigurationManagementSpecificationEntry);
				if (result == null) result = caseNamedElement(reconfigurationManagementSpecificationEntry);
				if (result == null) result = caseCommentableElement(reconfigurationManagementSpecificationEntry);
				if (result == null) result = caseExtendableElement(reconfigurationManagementSpecificationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigurable Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigurable Atomic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurableAtomicComponent(ReconfigurableAtomicComponent object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Port Interface Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Interface Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationPortInterfaceEntry(ReconfigurationPortInterfaceEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message Port Interface Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Port Interface Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationMessagePortInterfaceEntry(ReconfigurationMessagePortInterfaceEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Execution Port Interface Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Port Interface Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationExecutionPortInterfaceEntry(ReconfigurationExecutionPortInterfaceEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Timing Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Timing Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTimingSpecification(ExecutionTimingSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Timing Specification Single Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Timing Specification Single Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTimingSpecificationSinglePhase(ExecutionTimingSpecificationSinglePhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Timing Specification Three Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Timing Specification Three Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTimingSpecificationThreePhase(ExecutionTimingSpecificationThreePhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Reconfiguration Communication Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Reconfiguration Communication Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalReconfigurationCommunicationPort(InternalReconfigurationCommunicationPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralCondition(StructuralCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Assembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationPortAssemblyConnector(ReconfigurationPortAssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationPortDelegationConnector(ReconfigurationPortDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fading Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fading Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadingComponent(FadingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fading Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fading Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadingFunction(FadingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationConstraint(ReconfigurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridPortMapping(HybridPortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationExecutionSpecificationEntry(ReconfigurationExecutionSpecificationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Specification Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationManagementSpecificationEntry(ReconfigurationManagementSpecificationEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableElement(VerifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicComponent(AtomicComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnector(PortConnector object) {
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
