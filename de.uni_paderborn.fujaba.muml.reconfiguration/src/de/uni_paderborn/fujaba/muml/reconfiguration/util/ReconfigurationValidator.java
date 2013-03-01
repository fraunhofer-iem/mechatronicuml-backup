/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.muml.reconfiguration.*;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationValidator() {
		super();
		componentValidator = ComponentValidator.INSTANCE;
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT:
				return validateReconfigurableStructuredComponent((ReconfigurableStructuredComponent)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT:
				return validateReconfigurationPort((ReconfigurationPort)value, diagnostics, context);
			case ReconfigurationPackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case ReconfigurationPackage.MANAGER:
				return validateManager((Manager)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTOR:
				return validateExecutor((Executor)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_RULE:
				return validateReconfigurationRule((ReconfigurationRule)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_CONDITION:
				return validateReconfigurationCondition((ReconfigurationCondition)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURABLE_COMPONENT:
				return validateReconfigurableComponent((ReconfigurableComponent)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT:
				return validateReconfigurationMessagePort((ReconfigurationMessagePort)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT:
				return validateReconfigurationExecutionPort((ReconfigurationExecutionPort)value, diagnostics, context);
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY:
				return validateExecutorSpecificationEntry((ExecutorSpecificationEntry)value, diagnostics, context);
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY:
				return validateManagerSpecificationEntry((ManagerSpecificationEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER:
				return validateReconfigurationController((ReconfigurationController)value, diagnostics, context);
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER:
				return validateRuleBasedReconfigurationController((RuleBasedReconfigurationController)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY:
				return validateReconfigurationPortInterfaceEntry((ReconfigurationPortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY:
				return validateReconfigurationMessagePortInterfaceEntry((ReconfigurationMessagePortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY:
				return validateReconfigurationExecutionPortInterfaceEntry((ReconfigurationExecutionPortInterfaceEntry)value, diagnostics, context);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_KIND:
				return validateReconfigurationMessageKind((ReconfigurationMessageKind)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_StructuredComponentNoHybridPort(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_ValidComponentType(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_NoCyclicComponentPartHierarchy(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_DiscreteStructuredComponentValidParts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_HybridStructuredComponentValidParts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_DiscreteStructuredComponentValidPorts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_HybridStructuredComponentValidPorts(reconfigurableStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateStructuredComponent_ComponentPartsHaveUniqueName(reconfigurableStructuredComponent, diagnostics, context);
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
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_AtLeastOneMessageType(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAndRoleSameMessageTypes(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresBehavior(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresRole(reconfigurationPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_MultiPortMustRefineMultiRole(reconfigurationPort, diagnostics, context);
		return result;
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
		return validate_EveryDefaultConstraint(reconfigurationMessagePortInterfaceEntry, diagnostics, context);
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
	public boolean validateReconfigurationMessageKind(ReconfigurationMessageKind reconfigurationMessageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manager, diagnostics, context);
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
	public boolean validateReconfigurationCondition(ReconfigurationCondition reconfigurationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconfigurationCondition, diagnostics, context);
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
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_AtLeastOneMessageType(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAndRoleSameMessageTypes(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresBehavior(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresRole(reconfigurationMessagePort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_MultiPortMustRefineMultiRole(reconfigurationMessagePort, diagnostics, context);
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
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_AtLeastOneMessageType(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAndRoleSameMessageTypes(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresBehavior(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_DiscretePortRequiresRole(reconfigurationExecutionPort, diagnostics, context);
		if (result || diagnostics != null) result &= componentValidator.validateDiscretePort_MultiPortMustRefineMultiRole(reconfigurationExecutionPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutorSpecificationEntry(ExecutorSpecificationEntry executorSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executorSpecificationEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executorSpecificationEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutorSpecificationEntry_TimeToFailureLessOrEqualToTimeToSuccess(executorSpecificationEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TimeToFailureLessOrEqualToTimeToSuccess constraint of '<em>Executor Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutorSpecificationEntry_TimeToFailureLessOrEqualToTimeToSuccess(ExecutorSpecificationEntry executorSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TimeToFailureLessOrEqualToTimeToSuccess", getObjectLabel(executorSpecificationEntry, context) },
						 new Object[] { executorSpecificationEntry },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerSpecificationEntry(ManagerSpecificationEntry managerSpecificationEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(managerSpecificationEntry, diagnostics, context);
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
