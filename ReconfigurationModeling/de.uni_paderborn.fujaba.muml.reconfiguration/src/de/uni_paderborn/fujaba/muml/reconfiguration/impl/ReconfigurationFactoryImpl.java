/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase;
import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction;
import de.uni_paderborn.fujaba.muml.reconfiguration.InternalReconfigurationCommunicationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;

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
