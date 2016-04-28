/**
 */
package org.muml.reconfiguration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.NamedElement;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.ReconfigurationPackage
 * @generated
 */
public class ReconfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReconfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationSwitch<Adapter> modelSwitch =
		new ReconfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseReconfigurableComponent(ReconfigurableComponent object) {
				return createReconfigurableComponentAdapter();
			}
			@Override
			public Adapter caseReconfigurableAtomicComponent(ReconfigurableAtomicComponent object) {
				return createReconfigurableAtomicComponentAdapter();
			}
			@Override
			public Adapter caseReconfigurableStructuredComponent(ReconfigurableStructuredComponent object) {
				return createReconfigurableStructuredComponentAdapter();
			}
			@Override
			public Adapter caseReconfigurationPort(ReconfigurationPort object) {
				return createReconfigurationPortAdapter();
			}
			@Override
			public Adapter caseReconfigurationPortInterfaceEntry(ReconfigurationPortInterfaceEntry object) {
				return createReconfigurationPortInterfaceEntryAdapter();
			}
			@Override
			public Adapter caseReconfigurationMessagePort(ReconfigurationMessagePort object) {
				return createReconfigurationMessagePortAdapter();
			}
			@Override
			public Adapter caseReconfigurationMessagePortInterfaceEntry(ReconfigurationMessagePortInterfaceEntry object) {
				return createReconfigurationMessagePortInterfaceEntryAdapter();
			}
			@Override
			public Adapter caseReconfigurationExecutionPort(ReconfigurationExecutionPort object) {
				return createReconfigurationExecutionPortAdapter();
			}
			@Override
			public Adapter caseReconfigurationExecutionPortInterfaceEntry(ReconfigurationExecutionPortInterfaceEntry object) {
				return createReconfigurationExecutionPortInterfaceEntryAdapter();
			}
			@Override
			public Adapter caseExecutionTimingSpecification(ExecutionTimingSpecification object) {
				return createExecutionTimingSpecificationAdapter();
			}
			@Override
			public Adapter caseExecutionTimingSpecificationSinglePhase(ExecutionTimingSpecificationSinglePhase object) {
				return createExecutionTimingSpecificationSinglePhaseAdapter();
			}
			@Override
			public Adapter caseExecutionTimingSpecificationThreePhase(ExecutionTimingSpecificationThreePhase object) {
				return createExecutionTimingSpecificationThreePhaseAdapter();
			}
			@Override
			public Adapter caseInternalReconfigurationCommunicationPort(InternalReconfigurationCommunicationPort object) {
				return createInternalReconfigurationCommunicationPortAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseReconfigurationController(ReconfigurationController object) {
				return createReconfigurationControllerAdapter();
			}
			@Override
			public Adapter caseRuleBasedReconfigurationController(RuleBasedReconfigurationController object) {
				return createRuleBasedReconfigurationControllerAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseManagerSpecificationEntry(ManagerSpecificationEntry object) {
				return createManagerSpecificationEntryAdapter();
			}
			@Override
			public Adapter caseExecutor(Executor object) {
				return createExecutorAdapter();
			}
			@Override
			public Adapter caseExecutorSpecificationEntry(ExecutorSpecificationEntry object) {
				return createExecutorSpecificationEntryAdapter();
			}
			@Override
			public Adapter caseReconfigurationRule(ReconfigurationRule object) {
				return createReconfigurationRuleAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseStructuralCondition(StructuralCondition object) {
				return createStructuralConditionAdapter();
			}
			@Override
			public Adapter caseReconfigurationPortAssemblyConnector(ReconfigurationPortAssemblyConnector object) {
				return createReconfigurationPortAssemblyConnectorAdapter();
			}
			@Override
			public Adapter caseReconfigurationPortDelegationConnector(ReconfigurationPortDelegationConnector object) {
				return createReconfigurationPortDelegationConnectorAdapter();
			}
			@Override
			public Adapter caseFadingComponent(FadingComponent object) {
				return createFadingComponentAdapter();
			}
			@Override
			public Adapter caseFadingFunction(FadingFunction object) {
				return createFadingFunctionAdapter();
			}
			@Override
			public Adapter caseReconfigurationConstraint(ReconfigurationConstraint object) {
				return createReconfigurationConstraintAdapter();
			}
			@Override
			public Adapter caseHybridPortMapping(HybridPortMapping object) {
				return createHybridPortMappingAdapter();
			}
			@Override
			public Adapter caseReconfigurationExecutionSpecificationEntry(ReconfigurationExecutionSpecificationEntry object) {
				return createReconfigurationExecutionSpecificationEntryAdapter();
			}
			@Override
			public Adapter caseReconfigurationManagementSpecificationEntry(ReconfigurationManagementSpecificationEntry object) {
				return createReconfigurationManagementSpecificationEntryAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseBehavioralElement(BehavioralElement object) {
				return createBehavioralElementAdapter();
			}
			@Override
			public Adapter caseVerifiableElement(VerifiableElement object) {
				return createVerifiableElementAdapter();
			}
			@Override
			public Adapter caseAtomicComponent(AtomicComponent object) {
				return createAtomicComponentAdapter();
			}
			@Override
			public Adapter caseStructuredComponent(StructuredComponent object) {
				return createStructuredComponentAdapter();
			}
			@Override
			public Adapter caseConnectorEndpoint(ConnectorEndpoint object) {
				return createConnectorEndpointAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseDiscreteInteractionEndpoint(DiscreteInteractionEndpoint object) {
				return createDiscreteInteractionEndpointAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter casePortConnector(PortConnector object) {
				return createPortConnectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurableComponent
	 * @generated
	 */
	public Adapter createReconfigurableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurableAtomicComponent <em>Reconfigurable Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurableAtomicComponent
	 * @generated
	 */
	public Adapter createReconfigurableAtomicComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent <em>Reconfigurable Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent
	 * @generated
	 */
	public Adapter createReconfigurableStructuredComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationPort
	 * @generated
	 */
	public Adapter createReconfigurationPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationPortInterfaceEntry <em>Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationPortInterfaceEntry
	 * @generated
	 */
	public Adapter createReconfigurationPortInterfaceEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationMessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePort
	 * @generated
	 */
	public Adapter createReconfigurationMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry <em>Message Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry
	 * @generated
	 */
	public Adapter createReconfigurationMessagePortInterfaceEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationExecutionPort <em>Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPort
	 * @generated
	 */
	public Adapter createReconfigurationExecutionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry <em>Execution Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry
	 * @generated
	 */
	public Adapter createReconfigurationExecutionPortInterfaceEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ExecutionTimingSpecification <em>Execution Timing Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecification
	 * @generated
	 */
	public Adapter createExecutionTimingSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase <em>Execution Timing Specification Single Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase
	 * @generated
	 */
	public Adapter createExecutionTimingSpecificationSinglePhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase <em>Execution Timing Specification Three Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase
	 * @generated
	 */
	public Adapter createExecutionTimingSpecificationThreePhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.InternalReconfigurationCommunicationPort <em>Internal Reconfiguration Communication Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.InternalReconfigurationCommunicationPort
	 * @generated
	 */
	public Adapter createInternalReconfigurationCommunicationPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationController
	 * @generated
	 */
	public Adapter createReconfigurationControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.RuleBasedReconfigurationController <em>Rule Based Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.RuleBasedReconfigurationController
	 * @generated
	 */
	public Adapter createRuleBasedReconfigurationControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ManagerSpecificationEntry <em>Manager Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry
	 * @generated
	 */
	public Adapter createManagerSpecificationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.Executor
	 * @generated
	 */
	public Adapter createExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ExecutorSpecificationEntry <em>Executor Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry
	 * @generated
	 */
	public Adapter createExecutorSpecificationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	public Adapter createReconfigurationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.StructuralCondition <em>Structural Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.StructuralCondition
	 * @generated
	 */
	public Adapter createStructuralConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationPortAssemblyConnector <em>Port Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationPortAssemblyConnector
	 * @generated
	 */
	public Adapter createReconfigurationPortAssemblyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationPortDelegationConnector <em>Port Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationPortDelegationConnector
	 * @generated
	 */
	public Adapter createReconfigurationPortDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.FadingComponent <em>Fading Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.FadingComponent
	 * @generated
	 */
	public Adapter createFadingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.FadingFunction <em>Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.FadingFunction
	 * @generated
	 */
	public Adapter createFadingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationConstraint
	 * @generated
	 */
	public Adapter createReconfigurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.HybridPortMapping <em>Hybrid Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.HybridPortMapping
	 * @generated
	 */
	public Adapter createHybridPortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry <em>Execution Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry
	 * @generated
	 */
	public Adapter createReconfigurationExecutionSpecificationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry <em>Management Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry
	 * @generated
	 */
	public Adapter createReconfigurationManagementSpecificationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.types.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.component.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.behavior.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.behavior.BehavioralElement
	 * @generated
	 */
	public Adapter createBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.constraint.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.constraint.VerifiableElement
	 * @generated
	 */
	public Adapter createVerifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.component.AtomicComponent <em>Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.component.AtomicComponent
	 * @generated
	 */
	public Adapter createAtomicComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.component.StructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.component.StructuredComponent
	 * @generated
	 */
	public Adapter createStructuredComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.connector.ConnectorEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.connector.ConnectorEndpoint
	 * @generated
	 */
	public Adapter createConnectorEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.component.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.component.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.connector.DiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint
	 * @generated
	 */
	public Adapter createDiscreteInteractionEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.connector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.connector.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.component.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.component.PortConnector
	 * @generated
	 */
	public Adapter createPortConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReconfigurationAdapterFactory
