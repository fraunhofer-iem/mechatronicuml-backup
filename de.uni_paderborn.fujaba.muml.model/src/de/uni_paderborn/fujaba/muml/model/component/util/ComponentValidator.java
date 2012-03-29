/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.util;

import de.uni_paderborn.fujaba.muml.model.component.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage
 * @generated
 */
public class ComponentValidator extends EObjectValidator {
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.component";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentValidator() {
		super();
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
			case ComponentPackage.STRUCTURED_COMPONENT:
				return validateStructuredComponent((StructuredComponent)value, diagnostics, context);
			case ComponentPackage.ATOMIC_COMPONENT:
				return validateAtomicComponent((AtomicComponent)value, diagnostics, context);
			case ComponentPackage.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case ComponentPackage.ASSEMBLY:
				return validateAssembly((Assembly)value, diagnostics, context);
			case ComponentPackage.DELEGATION:
				return validateDelegation((Delegation)value, diagnostics, context);
			case ComponentPackage.BEHAVIORAL_CONNECTOR:
				return validateBehavioralConnector((BehavioralConnector)value, diagnostics, context);
			case ComponentPackage.HYBRID_PORT:
				return validateHybridPort((HybridPort)value, diagnostics, context);
			case ComponentPackage.PATTERN_OCCURRENCE:
				return validatePatternOccurrence((PatternOccurrence)value, diagnostics, context);
			case ComponentPackage.COMPONENT_KIND:
				return validateComponentKind((ComponentKind)value, diagnostics, context);
			case ComponentPackage.CONTINUOUS_PORT_DIRECTION_KIND:
				return validateContinuousPortDirectionKind((ContinuousPortDirectionKind)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(continuousPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPort_LowerBoundMustBeZeroOrOne(continuousPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPort_UpperBoundMustBeOne(continuousPort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LowerBoundMustBeZeroOrOne constraint of '<em>Continuous Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUOUS_PORT__LOWER_BOUND_MUST_BE_ZERO_OR_ONE__EEXPRESSION = "-- This Constraint is fulfilled, if no Cardinality exists.\n" +
		"-- But that is okay, as then another Problem-Marker is shown,\n" +
		"-- because Cardinality.lowerBound is 1..1\n" +
		"self.cardinality.oclIsUndefined() or (\n" +
		"\tif self.cardinality.lowerBound.oclIsUndefined() then\n" +
		"\t\tfalse\n" +
		"\telse\n" +
		"\t\tself.cardinality.lowerBound.value = 0 or self.cardinality.lowerBound.value = 1\n" +
		"\tendif\n" +
		")";

	/**
	 * Validates the LowerBoundMustBeZeroOrOne constraint of '<em>Continuous Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPort_LowerBoundMustBeZeroOrOne(ContinuousPort continuousPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.CONTINUOUS_PORT,
				 continuousPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LowerBoundMustBeZeroOrOne",
				 CONTINUOUS_PORT__LOWER_BOUND_MUST_BE_ZERO_OR_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UpperBoundMustBeOne constraint of '<em>Continuous Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUOUS_PORT__UPPER_BOUND_MUST_BE_ONE__EEXPRESSION = "-- This Constraint is fulfilled, if no Cardinality exists.\n" +
		"-- But that is okay, as then another Problem-Marker is shown,\n" +
		"-- because Cardinality.upperBound is 1..1\n" +
		"self.cardinality.oclIsUndefined() or (\n" +
		"\tif self.cardinality.upperBound.oclIsUndefined() then\n" +
		"\t\tfalse\n" +
		"\telse\n" +
		"\t\tself.cardinality.upperBound.value = 1\n" +
		"\tendif\n" +
		")";

	/**
	 * Validates the UpperBoundMustBeOne constraint of '<em>Continuous Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPort_UpperBoundMustBeOne(ContinuousPort continuousPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.CONTINUOUS_PORT,
				 continuousPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UpperBoundMustBeOne",
				 CONTINUOUS_PORT__UPPER_BOUND_MUST_BE_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateDiscretePort_AtLeastOneMessageInterface(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresRole(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAndRoleSameMessageInterface(discretePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_SingleRoleRequiresSinglePort(discretePort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneMessageInterface constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__AT_LEAST_ONE_MESSAGE_INTERFACE__EEXPRESSION = "self.oclIsTypeOf(component::DiscretePort) implies (not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined()))";

	/**
	 * Validates the AtLeastOneMessageInterface constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_AtLeastOneMessageInterface(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneMessageInterface",
				 DISCRETE_PORT__AT_LEAST_ONE_MESSAGE_INTERFACE__EEXPRESSION,
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
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_BEHAVIOR__EEXPRESSION = "-- this also holds for a hybrid port\n" +
		"(not self.component.oclIsUndefined() and not self.component.oclIsTypeOf(component::StructuredComponent))\n" +
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
	protected static final String DISCRETE_PORT__DISCRETE_PORT_REQUIRES_ROLE__EEXPRESSION = "self.oclIsTypeOf(component::DiscretePort) implies not self.refines.oclIsUndefined()";

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
	 * The cached validation expression for the DiscretePortAndRoleSameMessageInterface constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__DISCRETE_PORT_AND_ROLE_SAME_MESSAGE_INTERFACE__EEXPRESSION = "not self.refines.oclIsUndefined() implies\n" +
		"\t(self.senderMessageInterface = self.refines.senderMessageInterface\n" +
		"\t and\n" +
		"\t self.receiverMessageInterface = self.refines.receiverMessageInterface\n" +
		"\t)";

	/**
	 * Validates the DiscretePortAndRoleSameMessageInterface constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_DiscretePortAndRoleSameMessageInterface(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscretePortAndRoleSameMessageInterface",
				 DISCRETE_PORT__DISCRETE_PORT_AND_ROLE_SAME_MESSAGE_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SingleRoleRequiresSinglePort constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__SINGLE_ROLE_REQUIRES_SINGLE_PORT__EEXPRESSION = "if not self.refines.oclIsUndefined() and not self.refines.cardinality.oclIsUndefined() and not self.refines.cardinality.upperBound.oclIsUndefined() then\n" +
		"\t(self.refines.cardinality.upperBound.value = 1) implies not self.isMultiPort\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the SingleRoleRequiresSinglePort constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePort_SingleRoleRequiresSinglePort(DiscretePort discretePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DISCRETE_PORT,
				 discretePort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SingleRoleRequiresSinglePort",
				 DISCRETE_PORT__SINGLE_ROLE_REQUIRES_SINGLE_PORT__EEXPRESSION,
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
	protected static final String COMPONENT_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "self.cardinality.lowerBound->notEmpty()";

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
	protected static final String COMPONENT_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "self.cardinality.upperBound->notEmpty()";

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
		if (result || diagnostics != null) result &= validateStructuredComponent_UniqueComponentPartsWithinStructuredComponent(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_StructuredComponentNoHybridPort(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_ValidComponentType(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_NoCyclicComponentPartHierarchy(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidParts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidParts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_DiscreteStructuredComponentValidPorts(structuredComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponent_HybridStructuredComponentValidPorts(structuredComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueComponentPartsWithinStructuredComponent constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__UNIQUE_COMPONENT_PARTS_WITHIN_STRUCTURED_COMPONENT__EEXPRESSION = "self.embeddedParts->isUnique(p | p.componentType)";

	/**
	 * Validates the UniqueComponentPartsWithinStructuredComponent constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_UniqueComponentPartsWithinStructuredComponent(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueComponentPartsWithinStructuredComponent",
				 STRUCTURED_COMPONENT__UNIQUE_COMPONENT_PARTS_WITHIN_STRUCTURED_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StructuredComponentNoHybridPort constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__STRUCTURED_COMPONENT_NO_HYBRID_PORT__EEXPRESSION = "self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))";

	/**
	 * Validates the StructuredComponentNoHybridPort constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_StructuredComponentNoHybridPort(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StructuredComponentNoHybridPort",
				 STRUCTURED_COMPONENT__STRUCTURED_COMPONENT_NO_HYBRID_PORT__EEXPRESSION,
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
	protected static final String STRUCTURED_COMPONENT__NO_CYCLIC_COMPONENT_PART_HIERARCHY__EEXPRESSION = "not self.allStructuredComponents->includes(self)";

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
	protected static final String STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"implies\n" +
		"\t-- collect all atomic components from parent parts and union them\n" +
		"\t-- with own atomic components\n" +
		"\tself.allAtomicComponents->union(\n" +
		"\t\tself.embeddedParts->select(\n" +
		"\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n" +
		"\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n" +
		"\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)";

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
	 * The cached validation expression for the HybridStructuredComponentValidParts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION = "self.componentType = component::ComponentKind::HYBRID_COMPONENT\n" +
		"implies\n" +
		"\t-- collect all atomic components from parent parts and union them\n" +
		"\t-- with own atomic components\n" +
		"\tself.allAtomicComponents->union(\n" +
		"\t\tself.embeddedParts->select(\n" +
		"\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n" +
		"\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n" +
		"\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)";

	/**
	 * Validates the HybridStructuredComponentValidParts constraint of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponent_HybridStructuredComponentValidParts(StructuredComponent structuredComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.STRUCTURED_COMPONENT,
				 structuredComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HybridStructuredComponentValidParts",
				 STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PARTS__EEXPRESSION,
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
	protected static final String STRUCTURED_COMPONENT__DISCRETE_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION = "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\n" +
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
	protected static final String STRUCTURED_COMPONENT__HYBRID_STRUCTURED_COMPONENT_VALID_PORTS__EEXPRESSION = "self.componentType = component::ComponentKind::HYBRID_COMPONENT\n" +
		"\timplies (\n" +
		"\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\n" +
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assembly, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_NoSelfAssembliesForSinglePorts(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidContinuousPortDirections(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_AssemblyBetweenDiscretePortsRequiresCoordinationPattern(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_AssemblyBetweenDiscretePortsRequiresDifferentRoles(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_AssemblyBetweenDiscretePortsSameMessageInterfaces(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidDiscreteInPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidDiscreteOutPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidDiscreteInOutPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidContinuousInPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidContinuousOutPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidHybridInPortCombination(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidHybridOutPortCombination(assembly, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoSelfAssembliesForSinglePorts constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__NO_SELF_ASSEMBLIES_FOR_SINGLE_PORTS__EEXPRESSION = "self.fromPort.cardinality.upperBound.value <= 1\r\n" +
		"implies\r\n" +
		"self.fromPort <> self.toPort";

	/**
	 * Validates the NoSelfAssembliesForSinglePorts constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_NoSelfAssembliesForSinglePorts(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoSelfAssembliesForSinglePorts",
				 ASSEMBLY__NO_SELF_ASSEMBLIES_FOR_SINGLE_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidContinuousPortDirections constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_CONTINUOUS_PORT_DIRECTIONS__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n" +
		"\timplies\n" +
		"\tself.fromContinuousPort.kind <> self.toContinuousPort.kind";

	/**
	 * Validates the ValidContinuousPortDirections constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidContinuousPortDirections(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousPortDirections",
				 ASSEMBLY__VALID_CONTINUOUS_PORT_DIRECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsRequiresCoordinationPattern constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_COORDINATION_PATTERN__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\t-- assembly between two discrete ports requires a coordination pattern\n" +
		"\tnot self.coordinationPattern.oclIsUndefined()\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the AssemblyBetweenDiscretePortsRequiresCoordinationPattern constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_AssemblyBetweenDiscretePortsRequiresCoordinationPattern(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsRequiresCoordinationPattern",
				 ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_COORDINATION_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PATTERN__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n" +
		"\t\tand\n" +
		"\t\t-- both refinements must belong to the same pattern\n" +
		"\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern",
				 ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsRequiresDifferentRoles constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_DIFFERENT_ROLES__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n" +
		"\t\tand\n" +
		"\t\t-- both ports should have different roles (unless the pattern has only one role)\n" +
		"\t\t(self.fromDiscretePort.refines.coordinationPattern.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the AssemblyBetweenDiscretePortsRequiresDifferentRoles constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_AssemblyBetweenDiscretePortsRequiresDifferentRoles(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsRequiresDifferentRoles",
				 ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_REQUIRES_DIFFERENT_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyBetweenDiscretePortsSameMessageInterfaces constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_SAME_MESSAGE_INTERFACES__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\t-- message interfaces must be compatible\n" +
		"\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n" +
		"\tand\n" +
		"\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the AssemblyBetweenDiscretePortsSameMessageInterfaces constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_AssemblyBetweenDiscretePortsSameMessageInterfaces(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyBetweenDiscretePortsSameMessageInterfaces",
				 ASSEMBLY__ASSEMBLY_BETWEEN_DISCRETE_PORTS_SAME_MESSAGE_INTERFACES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_DISCRETE_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidDiscreteInPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteInPortCombination",
				 ASSEMBLY__VALID_DISCRETE_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_DISCRETE_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidDiscreteOutPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteOutPortCombination",
				 ASSEMBLY__VALID_DISCRETE_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteInOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_DISCRETE_IN_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteInOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidDiscreteInOutPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteInOutPortCombination",
				 ASSEMBLY__VALID_DISCRETE_IN_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidContinuousInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_CONTINUOUS_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n" +
		"\t\tor\n" +
		"\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidContinuousInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidContinuousInPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousInPortCombination",
				 ASSEMBLY__VALID_CONTINUOUS_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidContinuousOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_CONTINUOUS_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n" +
		"\t\tor\n" +
		"\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort\n" +
		"\t)";

	/**
	 * Validates the ValidContinuousOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidContinuousOutPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousOutPortCombination",
				 ASSEMBLY__VALID_CONTINUOUS_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidHybridInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_HYBRID_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidHybridInPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidHybridInPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidHybridInPortCombination",
				 ASSEMBLY__VALID_HYBRID_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidHybridOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_HYBRID_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n" +
		"\t)";

	/**
	 * Validates the ValidHybridOutPortCombination constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidHybridOutPortCombination(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidHybridOutPortCombination",
				 ASSEMBLY__VALID_HYBRID_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidContinuousPortDirections(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_DelegationBetweenContinuousPortsRequiresSameDataType(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_DelegationBetweenDiscretePortsRequiresSameCoordinationPattern(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_DelegationBetweenDiscretePortsRequiresSameRoles(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidDiscreteInPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidDiscreteOutPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidDiscreteInOutPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidContinuousInPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidContinuousOutPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidHybridInPortCombination(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_ValidHybridOutPortCombination(delegation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidContinuousPortDirections constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_CONTINUOUS_PORT_DIRECTIONS__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n" +
		"\timplies\n" +
		"\tself.fromContinuousPort.kind = self.toContinuousPort.kind";

	/**
	 * Validates the ValidContinuousPortDirections constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidContinuousPortDirections(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousPortDirections",
				 DELEGATION__VALID_CONTINUOUS_PORT_DIRECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenContinuousPortsRequiresSameDataType constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__DELEGATION_BETWEEN_CONTINUOUS_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n" +
		"\timplies\n" +
		"\tself.fromContinuousPort.type = self.toContinuousPort.type";

	/**
	 * Validates the DelegationBetweenContinuousPortsRequiresSameDataType constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_DelegationBetweenContinuousPortsRequiresSameDataType(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenContinuousPortsRequiresSameDataType",
				 DELEGATION__DELEGATION_BETWEEN_CONTINUOUS_PORTS_REQUIRES_SAME_DATA_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDiscretePortsRequiresSameCoordinationPattern constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PATTERN__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n" +
		"\t\tand\n" +
		"\t\t-- both refinements must belong to the same pattern\n" +
		"\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the DelegationBetweenDiscretePortsRequiresSameCoordinationPattern constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_DelegationBetweenDiscretePortsRequiresSameCoordinationPattern(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDiscretePortsRequiresSameCoordinationPattern",
				 DELEGATION__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_COORDINATION_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DelegationBetweenDiscretePortsRequiresSameRoles constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_ROLES__EEXPRESSION = "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n" +
		"\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n" +
		"\t\tand\n" +
		"\t\t-- both ports should have the same roles\n" +
		"\t\tself.fromDiscretePort.refines.name = self.toDiscretePort.refines.name\n" +
		"else\n" +
		"\ttrue\n" +
		"endif";

	/**
	 * Validates the DelegationBetweenDiscretePortsRequiresSameRoles constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_DelegationBetweenDiscretePortsRequiresSameRoles(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegationBetweenDiscretePortsRequiresSameRoles",
				 DELEGATION__DELEGATION_BETWEEN_DISCRETE_PORTS_REQUIRES_SAME_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__DISCRETE_MULTI_PORT_DELEGATION_REQUIRES_MULTI_PORT_OR_SINGLE_PORT_AND_MULTI_PART__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined()\n" +
		"and self.fromPort.isMultiPort\n" +
		"\timplies (\n" +
		"\t\t-- the target port is a multi port\n" +
		"\t\tself.toPort.isMultiPort\n" +
		"\t\tor\n" +
		"\t\t-- the target part is a multi part\n" +
		"\t\tself.componentPart.isMultiPart\n" +
		"\t)";

	/**
	 * Validates the DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart",
				 DELEGATION__DISCRETE_MULTI_PORT_DELEGATION_REQUIRES_MULTI_PORT_OR_SINGLE_PORT_AND_MULTI_PART__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_DISCRETE_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidDiscreteInPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteInPortCombination",
				 DELEGATION__VALID_DISCRETE_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_DISCRETE_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidDiscreteOutPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteOutPortCombination",
				 DELEGATION__VALID_DISCRETE_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidDiscreteInOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_DISCRETE_IN_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidDiscreteInOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidDiscreteInOutPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscreteInOutPortCombination",
				 DELEGATION__VALID_DISCRETE_IN_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidContinuousInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_CONTINUOUS_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n" +
		"\t)";

	/**
	 * Validates the ValidContinuousInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidContinuousInPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousInPortCombination",
				 DELEGATION__VALID_CONTINUOUS_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidContinuousOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_CONTINUOUS_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidContinuousOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidContinuousOutPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidContinuousOutPortCombination",
				 DELEGATION__VALID_CONTINUOUS_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidHybridInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_HYBRID_IN_PORT_COMBINATION__EEXPRESSION = "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n" +
		"\t)";

	/**
	 * Validates the ValidHybridInPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidHybridInPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidHybridInPortCombination",
				 DELEGATION__VALID_HYBRID_IN_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidHybridOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__VALID_HYBRID_OUT_PORT_COMBINATION__EEXPRESSION = "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n" +
		"\timplies (\n" +
		"\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n" +
		"\t)";

	/**
	 * Validates the ValidHybridOutPortCombination constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_ValidHybridOutPortCombination(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidHybridOutPortCombination",
				 DELEGATION__VALID_HYBRID_OUT_PORT_COMBINATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralConnector(BehavioralConnector behavioralConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavioralConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPort(HybridPort hybridPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hybridPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_AtLeastOneMessageInterface(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresBehavior(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAtStructuredComponentHasNoBehavior(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortRequiresRole(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_DiscretePortAndRoleSameMessageInterface(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePort_SingleRoleRequiresSinglePort(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPort_LowerBoundMustBeZeroOrOne(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPort_UpperBoundMustBeOne(hybridPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternOccurrence(PatternOccurrence patternOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternOccurrence, diagnostics, context);
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
	public boolean validateContinuousPortDirectionKind(ContinuousPortDirectionKind continuousPortDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
