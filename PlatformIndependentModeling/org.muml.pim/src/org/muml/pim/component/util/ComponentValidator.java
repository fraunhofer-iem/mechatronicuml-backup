/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.component.*;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentKind;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.ContinuousPort;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortConnector;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StaticComponent;
import org.muml.pim.component.StaticStructuredComponent;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.connector.util.ConnectorValidator;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.component.ComponentPackage
 */
public class ComponentValidator extends MumlValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentValidator INSTANCE = new ComponentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.component";

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
	protected ConnectorValidator connectorValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentValidator() {
		super();
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
	  return ComponentPackage.eINSTANCE;
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
			case ComponentPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ComponentPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case ComponentPackage.CONTINUOUS_PORT:
				return validateContinuousPort((ContinuousPort)value, diagnostics, context);
			case ComponentPackage.DISCRETE_PORT:
				return validateDiscretePort((DiscretePort)value, diagnostics, context);
			case ComponentPackage.COMPONENT_PART:
				return validateComponentPart((ComponentPart)value, diagnostics, context);
			case ComponentPackage.STATIC_STRUCTURED_COMPONENT:
				return validateStaticStructuredComponent((StaticStructuredComponent)value, diagnostics, context);
			case ComponentPackage.ATOMIC_COMPONENT:
				return validateAtomicComponent((AtomicComponent)value, diagnostics, context);
			case ComponentPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			case ComponentPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case ComponentPackage.PORT_CONNECTOR:
				return validatePortConnector((PortConnector)value, diagnostics, context);
			case ComponentPackage.HYBRID_PORT:
				return validateHybridPort((HybridPort)value, diagnostics, context);
			case ComponentPackage.STRUCTURED_COMPONENT:
				return validateStructuredComponent((StructuredComponent)value, diagnostics, context);
			case ComponentPackage.COORDINATION_PROTOCOL_PART:
				return validateCoordinationProtocolPart((CoordinationProtocolPart)value, diagnostics, context);
			case ComponentPackage.DIRECTED_TYPED_PORT:
				return validateDirectedTypedPort((DirectedTypedPort)value, diagnostics, context);
			case ComponentPackage.PORT_PART:
				return validatePortPart((PortPart)value, diagnostics, context);
			case ComponentPackage.STATIC_ATOMIC_COMPONENT:
				return validateStaticAtomicComponent((StaticAtomicComponent)value, diagnostics, context);
			case ComponentPackage.STATIC_COMPONENT:
				return validateStaticComponent((StaticComponent)value, diagnostics, context);
			case ComponentPackage.COMPONENT_KIND:
				return validateComponentKind((ComponentKind)value, diagnostics, context);
			case ComponentPackage.PORT_DIRECTION_KIND:
				return validatePortDirectionKind((PortDirectionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(component, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniquePortNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__UNIQUE_PORT_NAMES__EEXPRESSION = "-- Port names must be unique\n" +
		"self.ports->isUnique(name)";

	/**
	 * Validates the UniquePortNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_UniquePortNames(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePortNames",
				 COMPONENT__UNIQUE_PORT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueComponentNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__UNIQUE_COMPONENT_NAMES__EEXPRESSION = "-- The component's name must be unique.\n" +
		"Component.allInstances()->select(c|c<>self)->collect(name)->excludes(self.name)\n" +
		"-- author: adann";

	/**
	 * Validates the UniqueComponentNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_UniqueComponentNames(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueComponentNames",
				 COMPONENT__UNIQUE_COMPONENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPort(ContinuousPort continuousPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuousPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discretePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_SetEitherSubRoleAndCoordinatorBehaviorOrNone(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresMessageTypes(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAndRoleSameMessageTypes(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortShouldRefineRole(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortCardinalityMustComplyWithRefinedRoleCardinality(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior(discretePort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DiscretePortRequiresMessageTypes constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_MESSAGE_TYPES__EEXPRESSION = "-- Discrete Port must define sender or receiver message types\n" +
		"self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()";

	/**
	 * Validates the DiscretePortRequiresMessageTypes constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortRequiresMessageTypes(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortRequiresMessageTypes",
				 DISCRETE_PORT__DISCRETE_PORT_REQUIRES_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscretePortAndRoleSameMessageTypes constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_AND_ROLE_SAME_MESSAGE_TYPES__EEXPRESSION = "-- Discrete Port must have the same message types as its refined role\r\n" +
		"not self.refinedRole.oclIsUndefined() implies\r\n" +
		"\t(self.senderMessageTypes->asSet() = self.refinedRole.senderMessageTypes->asSet() \r\n" +
		"\t and\r\n" +
		"\t self.receiverMessageTypes->asSet() = self.refinedRole.receiverMessageTypes->asSet() \r\n" +
		"\t)";

	/**
	 * Validates the DiscretePortAndRoleSameMessageTypes constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortAndRoleSameMessageTypes(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortAndRoleSameMessageTypes",
				 DISCRETE_PORT__DISCRETE_PORT_AND_ROLE_SAME_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscretePortRequiresBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_BEHAVIOR__EEXPRESSION = "-- A discrete port of an atomic component must have a Behavior Specification\r\n" +
		"(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::AtomicComponent))\r\n" +
		"\timplies not self.behavior.oclIsUndefined()";

	/**
	 * Validates the DiscretePortRequiresBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortRequiresBehavior(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortRequiresBehavior",
				 DISCRETE_PORT__DISCRETE_PORT_REQUIRES_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscretePortAtStructuredComponentHasNoBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_AT_STRUCTURED_COMPONENT_HAS_NO_BEHAVIOR__EEXPRESSION = "-- Discrete Port at Structured Component must not have behavior\n" +
		"(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::StructuredComponent))\n" +
		"\timplies self.behavior.oclIsUndefined()";

	/**
	 * Validates the DiscretePortAtStructuredComponentHasNoBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortAtStructuredComponentHasNoBehavior",
				 DISCRETE_PORT__DISCRETE_PORT_AT_STRUCTURED_COMPONENT_HAS_NO_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscretePortShouldRefineRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_SHOULD_REFINE_ROLE__EEXPRESSION = "-- @warning\n" +
		"-- Discrete Port should refine a role\n" +
		"self.oclIsKindOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()";

	/**
	 * Validates the DiscretePortShouldRefineRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortShouldRefineRole(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortShouldRefineRole",
				 DISCRETE_PORT__DISCRETE_PORT_SHOULD_REFINE_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscretePortCardinalityMustComplyWithRefinedRoleCardinality constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_CARDINALITY_MUST_COMPLY_WITH_REFINED_ROLE_CARDINALITY__EEXPRESSION = "-- Cardinality of discrete port and its refined role must match\r\n" +
		"((not self.cardinality.oclIsUndefined()) and (not self.refinedRole.oclIsUndefined())) \r\n" +
		"implies \r\n" +
		"((not self.multi) or self.cardinality.lowerBound.greaterOrEqual(self.refinedRole.cardinality.lowerBound) and self.cardinality.upperBound.lessOrEqual(self.refinedRole.cardinality.upperBound))";

	/**
	 * Validates the DiscretePortCardinalityMustComplyWithRefinedRoleCardinality constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortCardinalityMustComplyWithRefinedRoleCardinality(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortCardinalityMustComplyWithRefinedRoleCardinality",
				 DISCRETE_PORT__DISCRETE_PORT_CARDINALITY_MUST_COMPLY_WITH_REFINED_ROLE_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__MULTI_PORT_OF_ATOMIC_COMPONENT_REQUIRES_SUBROLE_BEHAVIOR_AND_COORDINATOR_BEHAVIOR__EEXPRESSION = "-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n" +
		"(not self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies (self.multiPort and self.component.oclIsKindOf(AtomicComponent)) = not self.coordinatorBehavior.oclIsUndefined())\r\n" +
		"and self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()";

	/**
	 * Validates the MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior",
				 DISCRETE_PORT__MULTI_PORT_OF_ATOMIC_COMPONENT_REQUIRES_SUBROLE_BEHAVIOR_AND_COORDINATOR_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPart(ComponentPart componentPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentPart_CardinalityLowerBoundSet(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentPart_TypeNotEqualToParent(componentPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentPart_CardinalityUpperBoundSet(componentPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CardinalityLowerBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "-- Lower bound of cardinality must be set\r\n" +
		"if self.cardinality.lowerBound.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.cardinality.lowerBound->notEmpty()\r\n" +
		"endif";

	/**
	 * Validates the CardinalityLowerBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPart_CardinalityLowerBoundSet(ComponentPart componentPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT_PART,
				 componentPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityLowerBoundSet",
				 COMPONENT_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TypeNotEqualToParent constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_PART__TYPE_NOT_EQUAL_TO_PARENT__EEXPRESSION = "-- Component Part must have the same type as its parent structured component\n" +
		"self.componentType <> self.parentComponent";

	/**
	 * Validates the TypeNotEqualToParent constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPart_TypeNotEqualToParent(ComponentPart componentPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT_PART,
				 componentPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TypeNotEqualToParent",
				 COMPONENT_PART__TYPE_NOT_EQUAL_TO_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CardinalityUpperBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "-- Upper bound of cardinality must be set\r\n" +
		"if self.cardinality.upperBound.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.cardinality.upperBound->notEmpty()\r\n" +
		"endif";

	/**
	 * Validates the CardinalityUpperBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPart_CardinalityUpperBoundSet(ComponentPart componentPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT_PART,
				 componentPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityUpperBoundSet",
				 COMPONENT_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticStructuredComponent(StaticStructuredComponent staticStructuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticStructuredComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ValidComponentType(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_NoCyclicComponentPartHierarchy(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidParts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ComponentPartsHaveUniqueName(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_SoftwareComponentNoContinuousPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticComponent_SoftwareComponentOnlyDiscreteOrHybridPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticStructuredComponent_StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints(staticStructuredComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints constraint of '<em>Static Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATIC_STRUCTURED_COMPONENT__STATIC_STRUCTURED_COMPONENT_MUST_NOT_HAVE_WRONG_DISCRETE_INTERACTION_ENDPOINTS__EEXPRESSION = "-- Static Structured Component must not have Discrete Interaction Endpoints other than Discrete Ports\n" +
		"ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) implies p.oclIsKindOf(DiscretePort))";

	/**
	 * Validates the StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints constraint of '<em>Static Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticStructuredComponent_StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints(StaticStructuredComponent staticStructuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STATIC_STRUCTURED_COMPONENT,
				 staticStructuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints",
				 STATIC_STRUCTURED_COMPONENT__STATIC_STRUCTURED_COMPONENT_MUST_NOT_HAVE_WRONG_DISCRETE_INTERACTION_ENDPOINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ValidComponentType(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_NoCyclicComponentPartHierarchy(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidParts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ComponentPartsHaveUniqueName(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_SoftwareComponentNoContinuousPorts(structuredComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StructuredComponentAllowsNoHybridPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__STRUCTURED_COMPONENT_ALLOWS_NO_HYBRID_PORTS__EEXPRESSION = "-- A structured component allows no hybrid ports.\r\n" +
		"self.ports->forAll(port | not port.oclIsKindOf(component::HybridPort))";

	/**
	 * Validates the StructuredComponentAllowsNoHybridPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StructuredComponentAllowsNoHybridPorts",
				 STRUCTURED_COMPONENT__STRUCTURED_COMPONENT_ALLOWS_NO_HYBRID_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComponentType constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION = "-- Structured components must be either software or hybrid components\n" +
		"self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"or self.componentKind = component::ComponentKind::HYBRID_COMPONENT";

	/**
	 * Validates the ValidComponentType constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_ValidComponentType(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidComponentType",
				 STRUCTURED_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCyclicComponentPartHierarchy constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__NO_CYCLIC_COMPONENT_PART_HIERARCHY__EEXPRESSION = "-- Hierarchy of embedded component parts must not include myself\r\n" +
		"if self.allStructuredComponents->oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"not self.allStructuredComponents->includes(self)\r\n" +
		"endif";

	/**
	 * Validates the NoCyclicComponentPartHierarchy constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_NoCyclicComponentPartHierarchy(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoCyclicComponentPartHierarchy",
				 STRUCTURED_COMPONENT__NO_CYCLIC_COMPONENT_PART_HIERARCHY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscreteStructuredComponentValidParts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION = "-- Structured software component must only have software component parts \r\n" +
		"if (not self.allAtomicComponents->oclIsUndefined()) then\r\n" +
		"self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\r\n" +
		"implies\r\n" +
		"\t-- collect all atomic components from parent parts and union them\r\n" +
		"\t-- with own atomic components\r\n" +
		"\tself.allAtomicComponents->union(\r\n" +
		"\t\tself.embeddedComponentParts->select(\r\n" +
		"\t\t\tcomponentType.oclIsKindOf(component::AtomicComponent)\r\n" +
		"\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\r\n" +
		"\t)->forAll(componentKind = component::ComponentKind::SOFTWARE_COMPONENT)\r\n" +
		"else\r\n" +
		"true\r\n" +
		"endif";

	/**
	 * Validates the DiscreteStructuredComponentValidParts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_DiscreteStructuredComponentValidParts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscreteStructuredComponentValidParts",
				 STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the HybridStructuredComponentValidPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION = "-- Structured hybrid component must only have discrete or continuous ports\r\n" +
		"self.componentKind = component::ComponentKind::HYBRID_COMPONENT\r\n" +
		"\timplies (\r\n" +
		"\t\tself.ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) or p.oclIsKindOf(component::ContinuousPort))\r\n" +
		"\t)";

	/**
	 * Validates the HybridStructuredComponentValidPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_HybridStructuredComponentValidPorts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HybridStructuredComponentValidPorts",
				 STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ComponentPartsHaveUniqueName constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__COMPONENT_PARTS_HAVE_UNIQUE_NAME__EEXPRESSION = "-- Names of embedded component parts must be unique\n" +
		"self.embeddedComponentParts -> isUnique(name)";

	/**
	 * Validates the ComponentPartsHaveUniqueName constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_ComponentPartsHaveUniqueName(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ComponentPartsHaveUniqueName",
				 STRUCTURED_COMPONENT__COMPONENT_PARTS_HAVE_UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoftwareComponentNoContinuousPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__SOFTWARE_COMPONENT_NO_CONTINUOUS_PORTS__EEXPRESSION = "-- Software component must not have continuous ports\r\n" +
		"self.componentKind = ComponentKind::SOFTWARE_COMPONENT implies self.ports->forAll(p | not p.oclIsKindOf(ContinuousPort))";

	/**
	 * Validates the SoftwareComponentNoContinuousPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_SoftwareComponentNoContinuousPorts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SoftwareComponentNoContinuousPorts",
				 STRUCTURED_COMPONENT__SOFTWARE_COMPONENT_NO_CONTINUOUS_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedTypedPort(DirectedTypedPort directedTypedPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedTypedPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortPart(PortPart portPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticAtomicComponent(StaticAtomicComponent staticAtomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticAtomicComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentRequiresBehavior(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ValidComponentType(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentValidPorts(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ContinuousComponentValidPorts(staticAtomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticComponent_SoftwareComponentOnlyDiscreteOrHybridPorts(staticAtomicComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticComponent(StaticComponent staticComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(staticComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticComponent_SoftwareComponentOnlyDiscreteOrHybridPorts(staticComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoftwareComponentOnlyDiscreteOrHybridPorts constraint of '<em>Static Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATIC_COMPONENT__SOFTWARE_COMPONENT_ONLY_DISCRETE_OR_HYBRID_PORTS__EEXPRESSION = "-- Static software components must only have discrete ports and hybrid ports.\r\n" +
		"self.componentKind = ComponentKind::SOFTWARE_COMPONENT implies self.ports->reject(p | p.oclIsKindOf(DiscretePort) or p.oclIsKindOf(HybridPort))->isEmpty()";

	/**
	 * Validates the SoftwareComponentOnlyDiscreteOrHybridPorts constraint of '<em>Static Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticComponent_SoftwareComponentOnlyDiscreteOrHybridPorts(StaticComponent staticComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STATIC_COMPONENT,
				 staticComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SoftwareComponentOnlyDiscreteOrHybridPorts",
				 STATIC_COMPONENT__SOFTWARE_COMPONENT_ONLY_DISCRETE_OR_HYBRID_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atomicComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniquePortNames(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_UniqueComponentNames(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentRequiresBehavior(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ValidComponentType(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentValidPorts(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ContinuousComponentValidPorts(atomicComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoftwareComponentRequiresBehavior constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__SOFTWARE_COMPONENT_REQUIRES_BEHAVIOR__EEXPRESSION = "-- Software component must have a behavior\n" +
		"self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())";

	/**
	 * Validates the SoftwareComponentRequiresBehavior constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent_SoftwareComponentRequiresBehavior(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ATOMIC_COMPONENT,
				 atomicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SoftwareComponentRequiresBehavior",
				 ATOMIC_COMPONENT__SOFTWARE_COMPONENT_REQUIRES_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidComponentType constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION = "-- Atomic component must be of type SOFTWARE or CONTINUOUS.\n" +
		"self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"or self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT";

	/**
	 * Validates the ValidComponentType constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent_ValidComponentType(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ATOMIC_COMPONENT,
				 atomicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidComponentType",
				 ATOMIC_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoftwareComponentValidPorts constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__SOFTWARE_COMPONENT_VALID_PORTS__EEXPRESSION = "-- Software component must only have hybrid ports or discrete ports\n" +
		"self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) or p.oclIsKindOf(component::HybridPort))\n" +
		"\t)";

	/**
	 * Validates the SoftwareComponentValidPorts constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent_SoftwareComponentValidPorts(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ATOMIC_COMPONENT,
				 atomicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SoftwareComponentValidPorts",
				 ATOMIC_COMPONENT__SOFTWARE_COMPONENT_VALID_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContinuousComponentValidPorts constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__CONTINUOUS_COMPONENT_VALID_PORTS__EEXPRESSION = "-- Continuous Component must only have continuous ports.\n" +
		"self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsKindOf(component::ContinuousPort))\n" +
		"\t)";

	/**
	 * Validates the ContinuousComponentValidPorts constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent_ContinuousComponentValidPorts(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ATOMIC_COMPONENT,
				 atomicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ContinuousComponentValidPorts",
				 ATOMIC_COMPONENT__CONTINUOUS_COMPONENT_VALID_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortConnector(PortConnector portConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblySameStructuredComponent(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_SelfAssemblyOnlyForMultiPortsOrMultiParts(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyBetweenDirectedTypedPortsRequiresSameDataType(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyBetweenDiscretePortsOrDirectedTypedPorts(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_ValidPortDirections(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyBetweenDiscretePortsRequiresDifferentRoles(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyBetweenDiscretePortsCompatibleMessageTypes(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AssemblySameStructuredComponent constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_SAME_STRUCTURED_COMPONENT__EEXPRESSION = "-- Assembly must connect port parts within same structured component.\r\n" +
		"portParts.componentPart.parentComponent->forAll(a, b | a = b)\r\n" +
		"";

	/**
	 * Validates the AssemblySameStructuredComponent constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblySameStructuredComponent(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblySameStructuredComponent",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_SAME_STRUCTURED_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SelfAssemblyOnlyForMultiPortsOrMultiParts constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__SELF_ASSEMBLY_ONLY_FOR_MULTI_PORTS_OR_MULTI_PARTS__EEXPRESSION = "--  Self assembly only allowed for multi ports and multi component-parts\n" +
		"selfConnector implies\n" +
		"let portPart : PortPart = portParts->first() in\n" +
		"portPart.portType.oclIsKindOf(component::DiscretePort) and (portPart.portType.oclAsType(component::DiscretePort).multi or portPart.componentPart.multiPart)\n" +
		"-- author: bingo, cgerking, see MUML #872";

	/**
	 * Validates the SelfAssemblyOnlyForMultiPortsOrMultiParts constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_SelfAssemblyOnlyForMultiPortsOrMultiParts(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SelfAssemblyOnlyForMultiPortsOrMultiParts",
				 ASSEMBLY_CONNECTOR__SELF_ASSEMBLY_ONLY_FOR_MULTI_PORTS_OR_MULTI_PARTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDirectedTypedPortsRequiresSameDataType constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DIRECTED_TYPED_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION = "-- Assembly between DirectedTypedPorts requires same Data Type\n" +
		"let directedTypedPorts : Sequence(component::DirectedTypedPort) = portParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort) in\n" +
		"directedTypedPorts->forAll(p1,p2 | p1.dataType = p2.dataType)\n" +
		"-- author: bingo, cgerking, see MUML #873";

	/**
	 * Validates the AssemblyBetweenDirectedTypedPortsRequiresSameDataType constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyBetweenDirectedTypedPortsRequiresSameDataType(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDirectedTypedPortsRequiresSameDataType",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DIRECTED_TYPED_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsOrDirectedTypedPorts constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_OR_DIRECTED_TYPED_PORTS__EEXPRESSION = "-- Assembly may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\n" +
		"(portParts.portType->forAll(oclIsKindOf(component::DiscretePort)) or portParts.portType->forAll(oclIsKindOf(component::DirectedTypedPort)))\n" +
		"-- author: bingo, cgerking, see MUML #874";

	/**
	 * Validates the AssemblyBetweenDiscretePortsOrDirectedTypedPorts constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyBetweenDiscretePortsOrDirectedTypedPorts(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsOrDirectedTypedPorts",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_OR_DIRECTED_TYPED_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidPortDirections constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__VALID_PORT_DIRECTIONS__EEXPRESSION = "-- Assembly may only connect Directed Typed Ports with different Port Direction Kinds\n" +
		"portParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->isUnique(kind)\n" +
		"-- author: bingo, cgerking, see MUML #875";

	/**
	 * Validates the ValidPortDirections constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_ValidPortDirections(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidPortDirections",
				 ASSEMBLY_CONNECTOR__VALID_PORT_DIRECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PROTOCOL__EEXPRESSION = "-- Assembly may only connect ports refining roles of the same coordination protocol\n" +
		"portParts.refinedRole->reject(oclIsUndefined())->forAll(r1,r2 | r1.coordinationProtocol = r2.coordinationProtocol)\n" +
		"-- author: bingo, cgerking, see MUML #876";

	/**
	 * Validates the AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsRequiresDifferentRoles constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_DIFFERENT_ROLES__EEXPRESSION = "-- Assembly may only connect ports refining different roles\r\n" +
		"portParts.refinedRole->reject(oclIsUndefined())->isUnique(r | r)\r\n" +
		"-- author: bingo, cgerking, see MUML #877";

	/**
	 * Validates the AssemblyBetweenDiscretePortsRequiresDifferentRoles constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyBetweenDiscretePortsRequiresDifferentRoles(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsRequiresDifferentRoles",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_DIFFERENT_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsCompatibleMessageTypes constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_COMPATIBLE_MESSAGE_TYPES__EEXPRESSION = "-- Assembly may only connect discrete ports with compatible message types (a.senderMessageTypes = b.receiverMessageTypes)\n" +
		"portParts.portType->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->\n" +
		"forAll(p1, p2 | p1 <> p2 implies p1.senderMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\n" +
		"-- author: bingo, cgerking, see MUML #878";

	/**
	 * Validates the AssemblyBetweenDiscretePortsCompatibleMessageTypes constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyBetweenDiscretePortsCompatibleMessageTypes(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsCompatibleMessageTypes",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_BETWEEN_DISCRETE_PORTS_COMPATIBLE_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationOnlyBetweenSameDiscreteInteractionEndpoints(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegateToEmbeddedPort(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationBetweenDirectedTypedPortsRequiresSameDataType(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationBetweenDiscretePortsOrDirectedTypedPorts(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationBetweenDiscretePortsEqualMessageTypes(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_ValidPortDirections(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DelegationBetweenDiscretePortsRequiresSameRoles(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnector_DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DelegationOnlyBetweenSameDiscreteInteractionEndpoints constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_ONLY_BETWEEN_SAME_DISCRETE_INTERACTION_ENDPOINTS__EEXPRESSION = "-- Delegations may only connect Ports of the same kind\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\n" +
		"implies (\r\n" +
		"\t(port.oclIsKindOf(connector::DiscreteInteractionEndpoint))\r\n" +
		"\timplies\r\n" +
		"\t(port.oclAsType(ecore::EObject).eClass() = portPart.portType.oclAsType(ecore::EObject).eClass())\r\n" +
		")\r\n" +
		"-- author: chris227, see MUML #1043";

	/**
	 * Validates the DelegationOnlyBetweenSameDiscreteInteractionEndpoints constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationOnlyBetweenSameDiscreteInteractionEndpoints(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationOnlyBetweenSameDiscreteInteractionEndpoints",
				 DELEGATION_CONNECTOR__DELEGATION_ONLY_BETWEEN_SAME_DISCRETE_INTERACTION_ENDPOINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegateToEmbeddedPort constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATE_TO_EMBEDDED_PORT__EEXPRESSION = "-- Delegation must delegate to a Port at an embedded Component Part.\r\n" +
		"if portPart.oclIsUndefined() or portPart.componentPart.oclIsUndefined() or port.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else\r\n" +
		"\tportPart.componentPart.parentComponent = port.component\r\n" +
		"endif\r\n" +
		"";

	/**
	 * Validates the DelegateToEmbeddedPort constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegateToEmbeddedPort(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegateToEmbeddedPort",
				 DELEGATION_CONNECTOR__DELEGATE_TO_EMBEDDED_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDirectedTypedPortsRequiresSameDataType constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DIRECTED_TYPED_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION = "-- Delegation between DirectedTypedPorts requires same Data Type\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and portPart.portType.oclIsKindOf(component::DirectedTypedPort) and port.oclIsKindOf(component::DirectedTypedPort))\r\n" +
		"implies \r\n" +
		"portPart.portType.oclAsType(component::DirectedTypedPort).dataType = port.oclAsType(component::DirectedTypedPort).dataType\r\n" +
		"-- author: bingo, cgerking, see MUML #879";

	/**
	 * Validates the DelegationBetweenDirectedTypedPortsRequiresSameDataType constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationBetweenDirectedTypedPortsRequiresSameDataType(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDirectedTypedPortsRequiresSameDataType",
				 DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DIRECTED_TYPED_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDiscretePortsOrDirectedTypedPorts constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_OR_DIRECTED_TYPED_PORTS__EEXPRESSION = "-- Delegation may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\n" +
		"implies \r\n" +
		"let ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\n" +
		"(ports->forAll(oclIsKindOf(connector::DiscreteInteractionEndpoint)) or ports->forAll(oclIsKindOf(component::DirectedTypedPort)))\r\n" +
		"-- author: bingo, cgerking, see MUML #880";

	/**
	 * Validates the DelegationBetweenDiscretePortsOrDirectedTypedPorts constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationBetweenDiscretePortsOrDirectedTypedPorts(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDiscretePortsOrDirectedTypedPorts",
				 DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_OR_DIRECTED_TYPED_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDiscretePortsEqualMessageTypes constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_EQUAL_MESSAGE_TYPES__EEXPRESSION = "-- Delegation may only connect discrete ports with equal message types\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\n" +
		"implies \r\n" +
		"let ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\n" +
		"ports->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->forAll(p1, p2 | p1.senderMessageTypes->asSet() = p2.senderMessageTypes->asSet() and p1.receiverMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\r\n" +
		"-- author: bingo, cgerking, see MUML #81";

	/**
	 * Validates the DelegationBetweenDiscretePortsEqualMessageTypes constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationBetweenDiscretePortsEqualMessageTypes(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDiscretePortsEqualMessageTypes",
				 DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_EQUAL_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidPortDirections constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__VALID_PORT_DIRECTIONS__EEXPRESSION = "-- Delegation may only connect Directed Typed Ports with different Port Direction Kinds\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\n" +
		"implies \r\n" +
		"let ports : OrderedSet (Port) = OrderedSet { portPart.portType, port } in ports->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->forAll(p1, p2 | p1.kind = p2.kind)\r\n" +
		"-- author: bingo, cgerking, see MUML #882";

	/**
	 * Validates the ValidPortDirections constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_ValidPortDirections(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidPortDirections",
				 DELEGATION_CONNECTOR__VALID_PORT_DIRECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDiscretePortsRequiresSameRoles constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_ROLES__EEXPRESSION = "-- Delegation may only connect ports refining same roles\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort)) \r\n" +
		"implies \r\n" +
		"self.port.oclAsType(DiscretePort).refinedRole = self.portPart.refinedRole\r\n" +
		"-- author: bingo, cgerking, see MUML #883";

	/**
	 * Validates the DelegationBetweenDiscretePortsRequiresSameRoles constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DelegationBetweenDiscretePortsRequiresSameRoles(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDiscretePortsRequiresSameRoles",
				 DELEGATION_CONNECTOR__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__DISCRETE_MULTI_PORT_DELEGATION_REQUIRES_MULTI_PORT_OR_SINGLE_PORT_AND_MULTI_PART__EEXPRESSION = "-- Delegation starting at Multi Port must connect to a multi port or single port at multi part\r\n" +
		"(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort) and self.port.oclAsType(DiscretePort).multi)\r\n" +
		"implies\r\n" +
		"((self.portPart.portType.oclIsKindOf(DiscretePort) and self.portPart.portType.oclAsType(DiscretePort).multi) or self.portPart.componentPart.multiPart)\r\n" +
		"-- author: bingo, cgerking, see MUML #884";

	/**
	 * Validates the DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION_CONNECTOR,
				 delegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart",
				 DELEGATION_CONNECTOR__DISCRETE_MULTI_PORT_DELEGATION_REQUIRES_MULTI_PORT_OR_SINGLE_PORT_AND_MULTI_PART__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPort(HybridPort hybridPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hybridPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocolPart(CoordinationProtocolPart coordinationProtocolPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationProtocolPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationProtocolPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationProtocolPart_OnlyDiscretePortParts(coordinationProtocolPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyDiscretePortParts constraint of '<em>Coordination Protocol Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PROTOCOL_PART__ONLY_DISCRETE_PORT_PARTS__EEXPRESSION = "-- Coordination Protocol Part must only have discrete Port Parts\r\n" +
		"not self.portParts->oclIsUndefined()\r\n" +
		"implies\r\n" +
		"self.portParts->forAll(p : PortPart | p.portType.oclIsKindOf(DiscretePort))";

	/**
	 * Validates the OnlyDiscretePortParts constraint of '<em>Coordination Protocol Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocolPart_OnlyDiscretePortParts(CoordinationProtocolPart coordinationProtocolPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COORDINATION_PROTOCOL_PART,
				 coordinationProtocolPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyDiscretePortParts",
				 COORDINATION_PROTOCOL_PART__ONLY_DISCRETE_PORT_PARTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentKind(ComponentKind componentKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirectionKind(PortDirectionKind portDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ComponentValidator
