/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.muml.reconfiguration.ReconfigurableStructuredComponent;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationFactory;
import org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationMessagePort;
import org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import org.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import org.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import org.muml.reconfiguration.RuleBasedReconfigurationController;
import org.muml.reconfiguration.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationFactoryImpl extends EFactoryImpl implements ReconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconfigurationFactory init() {
		try {
			ReconfigurationFactory theReconfigurationFactory = (ReconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ReconfigurationPackage.eNS_URI);
			if (theReconfigurationFactory != null) {
				return theReconfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT: return createReconfigurableAtomicComponent();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT: return createReconfigurableStructuredComponent();
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY: return createReconfigurationPortInterfaceEntry();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: return createReconfigurationMessagePort();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY: return createReconfigurationMessagePortInterfaceEntry();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: return createReconfigurationExecutionPort();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY: return createReconfigurationExecutionPortInterfaceEntry();
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE: return createExecutionTimingSpecificationSinglePhase();
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE: return createExecutionTimingSpecificationThreePhase();
			case ReconfigurationPackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT: return createInternalReconfigurationCommunicationPort();
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER: return createRuleBasedReconfigurationController();
			case ReconfigurationPackage.MANAGER: return createManager();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY: return createManagerSpecificationEntry();
			case ReconfigurationPackage.EXECUTOR: return createExecutor();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: return createExecutorSpecificationEntry();
			case ReconfigurationPackage.SIGNATURE: return createSignature();
			case ReconfigurationPackage.RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR: return createReconfigurationPortAssemblyConnector();
			case ReconfigurationPackage.RECONFIGURATION_PORT_DELEGATION_CONNECTOR: return createReconfigurationPortDelegationConnector();
			case ReconfigurationPackage.FADING_COMPONENT: return createFadingComponent();
			case ReconfigurationPackage.FADING_FUNCTION: return createFadingFunction();
			case ReconfigurationPackage.HYBRID_PORT_MAPPING: return createHybridPortMapping();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY: return createReconfigurationExecutionSpecificationEntry();
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY: return createReconfigurationManagementSpecificationEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_TYPE_ENUM:
				return createReconfigurationMessageTypeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_TYPE_ENUM:
				return convertReconfigurationMessageTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableStructuredComponent createReconfigurableStructuredComponent() {
		ReconfigurableStructuredComponentImpl reconfigurableStructuredComponent = new ReconfigurableStructuredComponentImpl();
		return reconfigurableStructuredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableAtomicComponent createReconfigurableAtomicComponent() {
		ReconfigurableAtomicComponentImpl reconfigurableAtomicComponent = new ReconfigurableAtomicComponentImpl();
		return reconfigurableAtomicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor createExecutor() {
		ExecutorImpl executor = new ExecutorImpl();
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePort createReconfigurationMessagePort() {
		ReconfigurationMessagePortImpl reconfigurationMessagePort = new ReconfigurationMessagePortImpl();
		return reconfigurationMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionPort createReconfigurationExecutionPort() {
		ReconfigurationExecutionPortImpl reconfigurationExecutionPort = new ReconfigurationExecutionPortImpl();
		return reconfigurationExecutionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorSpecificationEntry createExecutorSpecificationEntry() {
		ExecutorSpecificationEntryImpl executorSpecificationEntry = new ExecutorSpecificationEntryImpl();
		return executorSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerSpecificationEntry createManagerSpecificationEntry() {
		ManagerSpecificationEntryImpl managerSpecificationEntry = new ManagerSpecificationEntryImpl();
		return managerSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationController createRuleBasedReconfigurationController() {
		RuleBasedReconfigurationControllerImpl ruleBasedReconfigurationController = new RuleBasedReconfigurationControllerImpl();
		return ruleBasedReconfigurationController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPortInterfaceEntry createReconfigurationPortInterfaceEntry() {
		ReconfigurationPortInterfaceEntryImpl reconfigurationPortInterfaceEntry = new ReconfigurationPortInterfaceEntryImpl();
		return reconfigurationPortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntry createReconfigurationMessagePortInterfaceEntry() {
		ReconfigurationMessagePortInterfaceEntryImpl reconfigurationMessagePortInterfaceEntry = new ReconfigurationMessagePortInterfaceEntryImpl();
		return reconfigurationMessagePortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntry createReconfigurationExecutionPortInterfaceEntry() {
		ReconfigurationExecutionPortInterfaceEntryImpl reconfigurationExecutionPortInterfaceEntry = new ReconfigurationExecutionPortInterfaceEntryImpl();
		return reconfigurationExecutionPortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTimingSpecificationSinglePhase createExecutionTimingSpecificationSinglePhase() {
		ExecutionTimingSpecificationSinglePhaseImpl executionTimingSpecificationSinglePhase = new ExecutionTimingSpecificationSinglePhaseImpl();
		return executionTimingSpecificationSinglePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTimingSpecificationThreePhase createExecutionTimingSpecificationThreePhase() {
		ExecutionTimingSpecificationThreePhaseImpl executionTimingSpecificationThreePhase = new ExecutionTimingSpecificationThreePhaseImpl();
		return executionTimingSpecificationThreePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReconfigurationCommunicationPort createInternalReconfigurationCommunicationPort() {
		InternalReconfigurationCommunicationPortImpl internalReconfigurationCommunicationPort = new InternalReconfigurationCommunicationPortImpl();
		return internalReconfigurationCommunicationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPortAssemblyConnector createReconfigurationPortAssemblyConnector() {
		ReconfigurationPortAssemblyConnectorImpl reconfigurationPortAssemblyConnector = new ReconfigurationPortAssemblyConnectorImpl();
		return reconfigurationPortAssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPortDelegationConnector createReconfigurationPortDelegationConnector() {
		ReconfigurationPortDelegationConnectorImpl reconfigurationPortDelegationConnector = new ReconfigurationPortDelegationConnectorImpl();
		return reconfigurationPortDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingComponent createFadingComponent() {
		FadingComponentImpl fadingComponent = new FadingComponentImpl();
		return fadingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingFunction createFadingFunction() {
		FadingFunctionImpl fadingFunction = new FadingFunctionImpl();
		return fadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPortMapping createHybridPortMapping() {
		HybridPortMappingImpl hybridPortMapping = new HybridPortMappingImpl();
		return hybridPortMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionSpecificationEntry createReconfigurationExecutionSpecificationEntry() {
		ReconfigurationExecutionSpecificationEntryImpl reconfigurationExecutionSpecificationEntry = new ReconfigurationExecutionSpecificationEntryImpl();
		return reconfigurationExecutionSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationManagementSpecificationEntry createReconfigurationManagementSpecificationEntry() {
		ReconfigurationManagementSpecificationEntryImpl reconfigurationManagementSpecificationEntry = new ReconfigurationManagementSpecificationEntryImpl();
		return reconfigurationManagementSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessageTypeEnum createReconfigurationMessageTypeEnumFromString(EDataType eDataType, String initialValue) {
		ReconfigurationMessageTypeEnum result = ReconfigurationMessageTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconfigurationMessageTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPackage getReconfigurationPackage() {
		return (ReconfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReconfigurationPackage getPackage() {
		return ReconfigurationPackage.eINSTANCE;
	}

} //ReconfigurationFactoryImpl
