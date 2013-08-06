/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.util;

import de.uni_paderborn.fujaba.muml.component.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import de.uni_paderborn.fujaba.common.validator.MumlValidator;
import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.HybridPort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortConnector;
import de.uni_paderborn.fujaba.muml.component.PortDirectionKind;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.connector.util.ConnectorValidator;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.component";

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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE:
				return validateCoordinationProtocolOccurrence((CoordinationProtocolOccurrence)value, diagnostics, context);
			case ComponentPackage.DIRECTED_TYPED_PORT:
				return validateDirectedTypedPort((DirectedTypedPort)value, diagnostics, context);
			case ComponentPackage.PORT_PART:
				return validatePortPart((PortPart)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateComponent_SoftwareComponentsMustNotHaveContinuousPorts(component, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniquePortNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__UNIQUE_PORT_NAMES__EEXPRESSION = "self.ports->isUnique(name)";

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
	 * The cached validation expression for the SoftwareComponentsMustNotHaveContinuousPorts constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__SOFTWARE_COMPONENTS_MUST_NOT_HAVE_CONTINUOUS_PORTS__EEXPRESSION = "-- Components with component type \"SOFTARE_COMPONENT\" must not have continuous ports.\r\n" +
		"componentType = ComponentKind::SOFTWARE_COMPONENT implies ports->select(p | p.oclIsKindOf(ContinuousPort))->isEmpty()";

	/**
	 * Validates the SoftwareComponentsMustNotHaveContinuousPorts constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_SoftwareComponentsMustNotHaveContinuousPorts(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SoftwareComponentsMustNotHaveContinuousPorts",
				 COMPONENT__SOFTWARE_COMPONENTS_MUST_NOT_HAVE_CONTINUOUS_PORTS__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateDiscretePort_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresMessageTypes(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAndRoleSameMessageTypes(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresRole(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_MultiPortMustRefineMultiRole(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_ReceiverPortRequiresMessageBuffer(discretePort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DiscretePortRequiresMessageTypes constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_MESSAGE_TYPES__EEXPRESSION = "self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()";

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
	protected static final String DISCRETE_PORT__DISCRETE_PORT_AND_ROLE_SAME_MESSAGE_TYPES__EEXPRESSION = "not self.refinedRole.oclIsUndefined() implies\r\n" +
		"\t(self.senderMessageTypes = self.refinedRole.senderMessageTypes\r\n" +
		"\t and\r\n" +
		"\t self.receiverMessageTypes = self.refinedRole.receiverMessageTypes\r\n" +
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
		"(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n" +
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
	protected static final String DISCRETE_PORT__DISCRETE_PORT_AT_STRUCTURED_COMPONENT_HAS_NO_BEHAVIOR__EEXPRESSION = "(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n" +
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
	 * The cached validation expression for the DiscretePortRequiresRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_ROLE__EEXPRESSION = "self.oclIsTypeOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()";

	/**
	 * Validates the DiscretePortRequiresRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortRequiresRole(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortRequiresRole",
				 DISCRETE_PORT__DISCRETE_PORT_REQUIRES_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MultiPortMustRefineMultiRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__MULTI_PORT_MUST_REFINE_MULTI_ROLE__EEXPRESSION = "if not (self.refinedRole.oclIsUndefined() and self.refinedRole.cardinality.oclIsUndefined() and self.refinedRole.cardinality.upperBound.oclIsUndefined()) then\r\n" +
		"       self.multiPort implies self.refinedRole.multiRole\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the MultiPortMustRefineMultiRole constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_MultiPortMustRefineMultiRole(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MultiPortMustRefineMultiRole",
				 DISCRETE_PORT__MULTI_PORT_MUST_REFINE_MULTI_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the ReceiverPortRequiresMessageBuffer constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_ReceiverPortRequiresMessageBuffer(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ReceiverPortRequiresMessageBuffer", getObjectLabel(discretePort, context) },
						 new Object[] { discretePort },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
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
						 new Object[] { "ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer", getObjectLabel(discretePort, context) },
						 new Object[] { discretePort },
						 context));
			}
			return false;
		}
		return connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(discretePort, diagnostics, context);
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
	protected static final String COMPONENT_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "if self.cardinality.lowerBound.oclIsUndefined() then\r\n" +
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
	protected static final String COMPONENT_PART__TYPE_NOT_EQUAL_TO_PARENT__EEXPRESSION = "self.componentType <> self.parentComponent";

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
	protected static final String COMPONENT_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "if self.cardinality.upperBound.oclIsUndefined() then\r\n" +
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
		if (result || diagnostics != null) result &= validateComponent_SoftwareComponentsMustNotHaveContinuousPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ValidComponentType(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_NoCyclicComponentPartHierarchy(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidParts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidPorts(staticStructuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ComponentPartsHaveUniqueName(staticStructuredComponent, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateComponent_SoftwareComponentsMustNotHaveContinuousPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_StructuredComponentAllowsNoHybridPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ValidComponentType(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_NoCyclicComponentPartHierarchy(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidParts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ComponentPartsHaveUniqueName(structuredComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StructuredComponentAllowsNoHybridPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__STRUCTURED_COMPONENT_ALLOWS_NO_HYBRID_PORTS__EEXPRESSION = "-- A structured component allows no hybrid ports.\r\n" +
		"self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))";

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
	protected static final String STRUCTURED_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"or self.componentType = component::ComponentKind::HYBRID_COMPONENT";

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
	protected static final String STRUCTURED_COMPONENT__NO_CYCLIC_COMPONENT_PART_HIERARCHY__EEXPRESSION = "if self.allStructuredComponents->oclIsUndefined() then\r\n" +
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
	protected static final String STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION = "if (not self.allAtomicComponents->oclIsUndefined()) then\r\n" +
		"self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\r\n" +
		"implies\r\n" +
		"\t-- collect all atomic components from parent parts and union them\r\n" +
		"\t-- with own atomic components\r\n" +
		"\tself.allAtomicComponents->union(\r\n" +
		"\t\tself.embeddedComponentParts->select(\r\n" +
		"\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\r\n" +
		"\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\r\n" +
		"\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)\r\n" +
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
	 * The cached validation expression for the DiscreteStructuredComponentValidPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION = "-- A structured software component may only have discrete ports\r\n" +
		"self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\r\n" +
		"\timplies (\r\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\r\n" +
		"\t)";

	/**
	 * Validates the DiscreteStructuredComponentValidPorts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_DiscreteStructuredComponentValidPorts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscreteStructuredComponentValidPorts",
				 STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION,
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
	protected static final String STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION = "self.componentType = component::ComponentKind::HYBRID_COMPONENT\r\n" +
		"\timplies (\r\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\r\n" +
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
	protected static final String STRUCTURED_COMPONENT__COMPONENT_PARTS_HAVE_UNIQUE_NAME__EEXPRESSION = "self.embeddedComponentParts -> isUnique(name)";

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
		if (result || diagnostics != null) result &= validateComponent_SoftwareComponentsMustNotHaveContinuousPorts(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentRequiresBehavior(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ValidComponentType(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_SoftwareComponentValidPorts(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_ContinuousComponentValidPorts(atomicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtomicComponent_AtomicComponentsNamesMustBeUnique(atomicComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoftwareComponentRequiresBehavior constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__SOFTWARE_COMPONENT_REQUIRES_BEHAVIOR__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())";

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
	protected static final String ATOMIC_COMPONENT__VALID_COMPONENT_TYPE__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"or self.componentType = component::ComponentKind::CONTINUOUS_COMPONENT";

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
	protected static final String ATOMIC_COMPONENT__SOFTWARE_COMPONENT_VALID_PORTS__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::HybridPort))\n" +
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
	protected static final String ATOMIC_COMPONENT__CONTINUOUS_COMPONENT_VALID_PORTS__EEXPRESSION = "self.componentType = component::ComponentKind::CONTINUOUS_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::ContinuousPort))\n" +
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
	 * The cached validation expression for the AtomicComponentsNamesMustBeUnique constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_COMPONENT__ATOMIC_COMPONENTS_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "AtomicComponent.allInstances().name->count(self.name) = 1";

	/**
	 * Validates the AtomicComponentsNamesMustBeUnique constraint of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent_AtomicComponentsNamesMustBeUnique(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ATOMIC_COMPONENT,
				 atomicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtomicComponentsNamesMustBeUnique",
				 ATOMIC_COMPONENT__ATOMIC_COMPONENTS_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
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
		return validate_EveryDefaultConstraint(assemblyConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationConnector, diagnostics, context);
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
	public boolean validateCoordinationProtocolOccurrence(CoordinationProtocolOccurrence coordinationProtocolOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationProtocolOccurrence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationProtocolOccurrence, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationProtocolOccurrence_OnlyDiscretePortParts(coordinationProtocolOccurrence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyDiscretePortParts constraint of '<em>Coordination Protocol Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PROTOCOL_OCCURRENCE__ONLY_DISCRETE_PORT_PARTS__EEXPRESSION = "not self.portParts->oclIsUndefined()\r\n" +
		"implies\r\n" +
		"self.portParts->forAll(p : PortPart | p.portType.oclIsKindOf(DiscretePort))";

	/**
	 * Validates the OnlyDiscretePortParts constraint of '<em>Coordination Protocol Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocolOccurrence_OnlyDiscretePortParts(CoordinationProtocolOccurrence coordinationProtocolOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.COORDINATION_PROTOCOL_OCCURRENCE,
				 coordinationProtocolOccurrence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyDiscretePortParts",
				 COORDINATION_PROTOCOL_OCCURRENCE__ONLY_DISCRETE_PORT_PARTS__EEXPRESSION,
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
