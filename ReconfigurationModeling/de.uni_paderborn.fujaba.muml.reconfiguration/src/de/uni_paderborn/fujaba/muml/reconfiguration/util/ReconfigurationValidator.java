/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.muml.connector.util.ConnectorValidator;
import de.uni_paderborn.fujaba.muml.reconfiguration.Controller;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecification;
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
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule;
import de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;
import de.uni_paderborn.fujaba.muml.reconfiguration.StructuralCondition;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage
 * @generated
 */
public class ReconfigurationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ReconfigurationValidator INSTANCE = new ReconfigurationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.reconfiguration";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentValidator componentValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorValidator connectorValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationValidator() {
		super();
		componentValidator = ComponentValidator.INSTANCE;
		connectorValidator = ConnectorValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ReconfigurationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ReconfigurationPackage.RECONFIGURABLE_COMPONENT:
				return validateReconfigurableComponent((ReconfigurableComponent)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT:
				return validateReconfigurableAtomicComponent((ReconfigurableAtomicComponent)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT:
				return validateReconfigurableStructuredComponent((ReconfigurableStructuredComponent)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT:
				return validateReconfigurationPort((ReconfigurationPort)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY:
				return validateReconfigurationPortInterfaceEntry((ReconfigurationPortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT:
				return validateReconfigurationMessagePort((ReconfigurationMessagePort)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY:
				return validateReconfigurationMessagePortInterfaceEntry((ReconfigurationMessagePortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT:
				return validateReconfigurationExecutionPort((ReconfigurationExecutionPort)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY:
				return validateReconfigurationExecutionPortInterfaceEntry((ReconfigurationExecutionPortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION:
				return validateExecutionTimingSpecification((ExecutionTimingSpecification)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE:
				return validateExecutionTimingSpecificationSinglePhase((ExecutionTimingSpecificationSinglePhase)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE:
				return validateExecutionTimingSpecificationThreePhase((ExecutionTimingSpecificationThreePhase)value, diagnostics, context);
			case ReconfigurationPackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT:
				return validateInternalReconfigurationCommunicationPort((InternalReconfigurationCommunicationPort)value, diagnostics, context);
			case ReconfigurationPackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER:
				return validateReconfigurationController((ReconfigurationController)value, diagnostics, context);
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER:
				return validateRuleBasedReconfigurationController((RuleBasedReconfigurationController)value, diagnostics, context);
			case ReconfigurationPackage.MANAGER:
				return validateManager((Manager)value, diagnostics, context);
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY:
				return validateManagerSpecificationEntry((ManagerSpecificationEntry)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTOR:
				return validateExecutor((Executor)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY:
				return validateExecutorSpecificationEntry((ExecutorSpecificationEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_RULE:
				return validateReconfigurationRule((ReconfigurationRule)value, diagnostics, context);
			case ReconfigurationPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case ReconfigurationPackage.STRUCTURAL_CONDITION:
				return validateStructuralCondition((StructuralCondition)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR:
				return validateReconfigurationPortAssemblyConnector((ReconfigurationPortAssemblyConnector)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT_DELEGATION_CONNECTOR:
				return validateReconfigurationPortDelegationConnector((ReconfigurationPortDelegationConnector)value, diagnostics, context);
			case ReconfigurationPackage.FADING_COMPONENT:
				return validateFadingComponent((FadingComponent)value, diagnostics, context);
			case ReconfigurationPackage.FADING_FUNCTION:
				return validateFadingFunction((FadingFunction)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_TYPE_ENUM:
				return validateReconfigurationMessageTypeEnum((ReconfigurationMessageTypeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurableStructuredComponent(ReconfigurableStructuredComponent reconfigurableStructuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurableStructuredComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniquePortNames(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniqueComponentNames(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_ValidComponentType(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_NoCyclicComponentPartHierarchy(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_DiscreteStructuredComponentValidParts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_HybridStructuredComponentValidPorts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_ComponentPartsHaveUniqueName(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_SoftwareComponentNoContinuousPorts(reconfigurableStructuredComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurableAtomicComponent(ReconfigurableAtomicComponent reconfigurableAtomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurableAtomicComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniquePortNames(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniqueComponentNames(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_SoftwareComponentRequiresBehavior(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_ValidComponentType(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_SoftwareComponentValidPorts(reconfigurableAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_ContinuousComponentValidPorts(reconfigurableAtomicComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPort(ReconfigurationPort reconfigurationPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortRequiresMessageTypes(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortAtStructuredComponentHasNoBehavior(reconfigurationPort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ReconfigurationPortRequiresMessageTypes constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECONFIGURATION_PORT__RECONFIGURATION_PORT_REQUIRES_MESSAGE_TYPES__EEXPRESSION = "self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()";

	/**
	 * Validates the ReconfigurationPortRequiresMessageTypes constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPort_ReconfigurationPortRequiresMessageTypes(ReconfigurationPort reconfigurationPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.RECONFIGURATION_PORT,
				 reconfigurationPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReconfigurationPortRequiresMessageTypes",
				 RECONFIGURATION_PORT__RECONFIGURATION_PORT_REQUIRES_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ReconfigurationPortAtStructuredComponentHasNoBehavior constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECONFIGURATION_PORT__RECONFIGURATION_PORT_AT_STRUCTURED_COMPONENT_HAS_NO_BEHAVIOR__EEXPRESSION = "(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(muml::component::StructuredComponent))\r\n" +
		"\timplies self.behavior.oclIsUndefined()";

	/**
	 * Validates the ReconfigurationPortAtStructuredComponentHasNoBehavior constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPort_ReconfigurationPortAtStructuredComponentHasNoBehavior(ReconfigurationPort reconfigurationPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.RECONFIGURATION_PORT,
				 reconfigurationPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReconfigurationPortAtStructuredComponentHasNoBehavior",
				 RECONFIGURATION_PORT__RECONFIGURATION_PORT_AT_STRUCTURED_COMPONENT_HAS_NO_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ImplementMessagesOfChildren(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ImplementMessagesOfferedToParent(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_TreatAndNotPropagateMessagesOfferedToParent(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_PropagatedMessageMustAppearInRMPort(manager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ImplementMessagesOfChildren constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__IMPLEMENT_MESSAGES_OF_CHILDREN__EEXPRESSION = "-- The manager specification needs to have entries for all reconfiguration messages that are sent by embedded components.\r\n" +
		"(self.reconfigurationController.structuredComponent.embeddedComponentParts.componentType.ports -> \r\n" +
		"\t\t\tselect(oclIsTypeOf(ReconfigurationMessagePort))).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType\r\n" +
		"\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)";

	/**
	 * Validates the ImplementMessagesOfChildren constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ImplementMessagesOfChildren(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ImplementMessagesOfChildren",
				 MANAGER__IMPLEMENT_MESSAGES_OF_CHILDREN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ImplementMessagesOfferedToParent constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__IMPLEMENT_MESSAGES_OFFERED_TO_PARENT__EEXPRESSION = "-- The manager needs to contain ManagerSpecificationEntries for each reconfiguration message that is provided by the reconfiguration execution port.\r\n" +
		"(self.reconfigurationController.structuredComponent.ports -> \r\n" +
		"\t\t\tselect(oclIsTypeOf(ReconfigurationExecutionPort))).oclAsType(ReconfigurationExecutionPort).interfaceEntries.messageType\r\n" +
		"\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)";

	/**
	 * Validates the ImplementMessagesOfferedToParent constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ImplementMessagesOfferedToParent(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ImplementMessagesOfferedToParent",
				 MANAGER__IMPLEMENT_MESSAGES_OFFERED_TO_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TreatAndNotPropagateMessagesOfferedToParent constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__TREAT_AND_NOT_PROPAGATE_MESSAGES_OFFERED_TO_PARENT__EEXPRESSION = "-- All reconfiguration messages offered to the parent in the reconfiguration execution port need to be treated and not propagated in the manager specification.\r\n" +
		"self.specificationEntries -> select(entry : ManagerSpecificationEntry | self.reconfigurationController.structuredComponent.ports\r\n" +
		"\t-> select(oclIsTypeOf(ReconfigurationExecutionPort)).oclAsType(ReconfigurationExecutionPort).interfaceEntries \r\n" +
		"\t-> select(messageType = entry.messageType) -> size() > 0) -> forAll(treat = true and propagate = false)";

	/**
	 * Validates the TreatAndNotPropagateMessagesOfferedToParent constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_TreatAndNotPropagateMessagesOfferedToParent(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TreatAndNotPropagateMessagesOfferedToParent",
				 MANAGER__TREAT_AND_NOT_PROPAGATE_MESSAGES_OFFERED_TO_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PropagatedMessageMustAppearInRMPort constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__PROPAGATED_MESSAGE_MUST_APPEAR_IN_RM_PORT__EEXPRESSION = "self.reconfigurationController.structuredComponent.ports -> any(oclIsKindOf(ReconfigurationMessagePort)).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType -- messages in RM Port\r\n" +
		"= \r\n" +
		"self.specificationEntries -> select(propagate = true).messageType -- message propagated in manager specification";

	/**
	 * Validates the PropagatedMessageMustAppearInRMPort constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_PropagatedMessageMustAppearInRMPort(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PropagatedMessageMustAppearInRMPort",
				 MANAGER__PROPAGATED_MESSAGE_MUST_APPEAR_IN_RM_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutor(Executor executor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationRule(ReconfigurationRule reconfigurationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconfigurationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralCondition(StructuralCondition structuralCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurableComponent(ReconfigurableComponent reconfigurableComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurableComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniquePortNames(reconfigurableComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniqueComponentNames(reconfigurableComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationMessagePort(ReconfigurationMessagePort reconfigurationMessagePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationMessagePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortRequiresMessageTypes(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortAtStructuredComponentHasNoBehavior(reconfigurationMessagePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationExecutionPort(ReconfigurationExecutionPort reconfigurationExecutionPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationExecutionPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortRequiresMessageTypes(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortAtStructuredComponentHasNoBehavior(reconfigurationExecutionPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutorSpecificationEntry(ExecutorSpecificationEntry executorSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executorSpecificationEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managerSpecificationEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerSpecificationEntry_NotTreatAndPropagate(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerSpecificationEntry_InvokePlannerOnlyForTreatedMessage(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerSpecificationEntry_TimeForPlanningRequiresToInvokePlanner(managerSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerSpecificationEntry_OnlyBlockTreatedMessage(managerSpecificationEntry, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NotTreatAndPropagate constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_SPECIFICATION_ENTRY__NOT_TREAT_AND_PROPAGATE__EEXPRESSION = "not(self.treat and self.propagate)";

	/**
	 * Validates the NotTreatAndPropagate constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry_NotTreatAndPropagate(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER_SPECIFICATION_ENTRY,
				 managerSpecificationEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NotTreatAndPropagate",
				 MANAGER_SPECIFICATION_ENTRY__NOT_TREAT_AND_PROPAGATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvokePlannerOnlyForTreatedMessage constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER_ONLY_FOR_TREATED_MESSAGE__EEXPRESSION = "self.invokePlanner implies self.treat";

	/**
	 * Validates the InvokePlannerOnlyForTreatedMessage constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry_InvokePlannerOnlyForTreatedMessage(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER_SPECIFICATION_ENTRY,
				 managerSpecificationEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "InvokePlannerOnlyForTreatedMessage",
				 MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER_ONLY_FOR_TREATED_MESSAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TimeForPlanningRequiresToInvokePlanner constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING_REQUIRES_TO_INVOKE_PLANNER__EEXPRESSION = "(not self.timeForPlanning.oclIsUndefined()) implies self.invokePlanner";

	/**
	 * Validates the TimeForPlanningRequiresToInvokePlanner constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry_TimeForPlanningRequiresToInvokePlanner(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER_SPECIFICATION_ENTRY,
				 managerSpecificationEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TimeForPlanningRequiresToInvokePlanner",
				 MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING_REQUIRES_TO_INVOKE_PLANNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyBlockTreatedMessage constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_SPECIFICATION_ENTRY__ONLY_BLOCK_TREATED_MESSAGE__EEXPRESSION = "self.blockable implies self.treat";

	/**
	 * Validates the OnlyBlockTreatedMessage constraint of '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry_OnlyBlockTreatedMessage(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.MANAGER_SPECIFICATION_ENTRY,
				 managerSpecificationEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyBlockTreatedMessage",
				 MANAGER_SPECIFICATION_ENTRY__ONLY_BLOCK_TREATED_MESSAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationController(ReconfigurationController reconfigurationController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconfigurationController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleBasedReconfigurationController(RuleBasedReconfigurationController ruleBasedReconfigurationController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleBasedReconfigurationController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPortInterfaceEntry(ReconfigurationPortInterfaceEntry reconfigurationPortInterfaceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconfigurationPortInterfaceEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationMessagePortInterfaceEntry(ReconfigurationMessagePortInterfaceEntry reconfigurationMessagePortInterfaceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationMessagePortInterfaceEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationMessagePortInterfaceEntry_RequestRequiresExpectedResponseTime(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RequestRequiresExpectedResponseTime constraint of '<em>Message Port Interface Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__REQUEST_REQUIRES_EXPECTED_RESPONSE_TIME__EEXPRESSION = "self.reconfigurationMessageType = ReconfigurationMessageTypeEnum::REQUEST implies (not self.expectedResponseTime.oclIsUndefined())";

	/**
	 * Validates the RequestRequiresExpectedResponseTime constraint of '<em>Message Port Interface Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationMessagePortInterfaceEntry_RequestRequiresExpectedResponseTime(ReconfigurationMessagePortInterfaceEntry reconfigurationMessagePortInterfaceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY,
				 reconfigurationMessagePortInterfaceEntry,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RequestRequiresExpectedResponseTime",
				 RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__REQUEST_REQUIRES_EXPECTED_RESPONSE_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationExecutionPortInterfaceEntry(ReconfigurationExecutionPortInterfaceEntry reconfigurationExecutionPortInterfaceEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconfigurationExecutionPortInterfaceEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionTimingSpecification(ExecutionTimingSpecification executionTimingSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionTimingSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionTimingSpecificationSinglePhase(ExecutionTimingSpecificationSinglePhase executionTimingSpecificationSinglePhase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionTimingSpecificationSinglePhase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionTimingSpecificationThreePhase(ExecutionTimingSpecificationThreePhase executionTimingSpecificationThreePhase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionTimingSpecificationThreePhase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReconfigurationCommunicationPort(InternalReconfigurationCommunicationPort internalReconfigurationCommunicationPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalReconfigurationCommunicationPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortRequiresMessageTypes(internalReconfigurationCommunicationPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPort_ReconfigurationPortAtStructuredComponentHasNoBehavior(internalReconfigurationCommunicationPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPortAssemblyConnector(ReconfigurationPortAssemblyConnector reconfigurationPortAssemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationPortAssemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationPortAssemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPortAssemblyConnector_OnlyConnectReconfigurationPorts(reconfigurationPortAssemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyConnectReconfigurationPorts constraint of '<em>Port Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__ONLY_CONNECT_RECONFIGURATION_PORTS__EEXPRESSION = "-- A reconfiguration Port Assembly may only connect reconfiguration ports or a port part typed by a reconfiguration port.\r\n" +
		"(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2) -- two reconfiguration ports\r\n" +
		"or \r\n" +
		"((self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 1) and -- or one reconfiguration port and one port part\r\n" +
		"(self.connectorEndpoints -> select(oclIsKindOf(muml::component::PortPart)) -> size() = 1) and \r\n" +
		"(self.connectorEndpoints -> any(oclIsKindOf(muml::component::PortPart)).oclAsType(muml::component::PortPart).portType.oclIsKindOf(ReconfigurationPort))) -- that is typed over a reconfiguration port";

	/**
	 * Validates the OnlyConnectReconfigurationPorts constraint of '<em>Port Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPortAssemblyConnector_OnlyConnectReconfigurationPorts(ReconfigurationPortAssemblyConnector reconfigurationPortAssemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR,
				 reconfigurationPortAssemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyConnectReconfigurationPorts",
				 RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__ONLY_CONNECT_RECONFIGURATION_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPortDelegationConnector(ReconfigurationPortDelegationConnector reconfigurationPortDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigurationPortDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigurationPortDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateReconfigurationPortDelegationConnector_OnlyConnectReconfigurationPorts(reconfigurationPortDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyConnectReconfigurationPorts constraint of '<em>Port Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECONFIGURATION_PORT_DELEGATION_CONNECTOR__ONLY_CONNECT_RECONFIGURATION_PORTS__EEXPRESSION = "-- A reconfiguration Port Delegation may only connect reconfiguration ports of structured component to reconfiguration ports of reconfiguration controller.\r\n" +
		"(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2)";

	/**
	 * Validates the OnlyConnectReconfigurationPorts constraint of '<em>Port Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationPortDelegationConnector_OnlyConnectReconfigurationPorts(ReconfigurationPortDelegationConnector reconfigurationPortDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReconfigurationPackage.Literals.RECONFIGURATION_PORT_DELEGATION_CONNECTOR,
				 reconfigurationPortDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyConnectReconfigurationPorts",
				 RECONFIGURATION_PORT_DELEGATION_CONNECTOR__ONLY_CONNECT_RECONFIGURATION_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingComponent(FadingComponent fadingComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fadingComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniquePortNames(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateComponent_UniqueComponentNames(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_SoftwareComponentRequiresBehavior(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_ValidComponentType(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_SoftwareComponentValidPorts(fadingComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateAtomicComponent_ContinuousComponentValidPorts(fadingComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingFunction(FadingFunction fadingFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fadingFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigurationMessageTypeEnum(ReconfigurationMessageTypeEnum reconfigurationMessageTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ReconfigurationValidator
