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
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneMessageInterface constraint of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT__AT_LEAST_ONE_MESSAGE_INTERFACE__EEXPRESSION = "not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined())";

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
		return result;
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
		if (result || diagnostics != null) result &= validateAssembly_ValidDiscretePortDiscretePortConnection(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_NoSelfAssembliesForSinglePorts(assembly, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembly_ValidContinuousPortDirections(assembly, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidDiscretePortDiscretePortConnection constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY__VALID_DISCRETE_PORT_DISCRETE_PORT_CONNECTION__EEXPRESSION = "if not self.fromPort.oclIsUndefined() and not self.toPort.oclIsUndefined() then\n" +
		"    if self.fromPort.oclIsKindOf(component::DiscretePort) and self.toPort.oclIsKindOf(component::DiscretePort) then\n" +
		"        -- check compatibility of message interfaces\n" +
		"        let fromPort : component::DiscretePort = self.fromPort.oclAsType(component::DiscretePort) in\n" +
		"        let toPort : component::DiscretePort = self.toPort.oclAsType(component::DiscretePort) in\n" +
		"        fromPort.senderMessageInterface = toPort.receiverMessageInterface \n" +
		"        and fromPort.receiverMessageInterface = toPort.senderMessageInterface\n" +
		"        and (\n" +
		"            -- check refines\n" +
		"            if fromPort.refines.oclIsUndefined() xor toPort.refines.oclIsUndefined() then\n" +
		"                -- only one port has a refinement\n" +
		"                false\n" +
		"            else\n" +
		"                fromPort.refines.oclIsUndefined() \n" +
		"                -- both ports have a refinement\n" +
		"                or fromPort.refines.coordinationPattern = toPort.refines.coordinationPattern\n" +
		"                -- this check is sufficient\n" +
		"                and not fromPort.refines.coordinationPattern.oclIsUndefined()\n" +
		"                and (\n" +
		"                    if fromPort.refines.coordinationPattern.roles->size() = 2 then\n" +
		"                        fromPort.refines.name <> toPort.refines.name\n" +
		"                    else\n" +
		"                        -- both ports have the same role and belong the same pattern\n" +
		"                        true\n" +
		"                    endif\n" +
		"                )\n" +
		"            endif\n" +
		"        )\n" +
		"    else\n" +
		"        -- this case must be checked by other constraints\n" +
		"        true\n" +
		"    endif\n" +
		"else\n" +
		"    false\n" +
		"endif";

	/**
	 * Validates the ValidDiscretePortDiscretePortConnection constraint of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly_ValidDiscretePortDiscretePortConnection(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.ASSEMBLY,
				 assembly,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidDiscretePortDiscretePortConnection",
				 ASSEMBLY__VALID_DISCRETE_PORT_DISCRETE_PORT_CONNECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	protected static final String ASSEMBLY__VALID_CONTINUOUS_PORT_DIRECTIONS__EEXPRESSION = "not self.fromPort.oclIsUndefined() and self.fromPort.oclIsKindOf(component::ContinuousPort) and\n" +
		"not self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::ContinuousPort)\n" +
		"implies\n" +
		"self.fromPort.oclAsType(component::ContinuousPort).kind <> self.toPort.oclAsType(component::ContinuousPort).kind";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegation, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateHybridPort_LowerBoundMustBeZeroOrOne(hybridPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateHybridPort_UpperBoundMustBeOne(hybridPort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LowerBoundMustBeZeroOrOne constraint of '<em>Hybrid Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HYBRID_PORT__LOWER_BOUND_MUST_BE_ZERO_OR_ONE__EEXPRESSION = "-- This Constraint is fulfilled, if no Cardinality exists.\n" +
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
	 * Validates the LowerBoundMustBeZeroOrOne constraint of '<em>Hybrid Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPort_LowerBoundMustBeZeroOrOne(HybridPort hybridPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "LowerBoundMustBeZeroOrOne", getObjectLabel(hybridPort, context) },
						 new Object[] { hybridPort },
						 context));
			}
			return false;
		}
		return validateContinuousPort_LowerBoundMustBeZeroOrOne(hybridPort, diagnostics, context);
	}

	/**
	 * The cached validation expression for the UpperBoundMustBeOne constraint of '<em>Hybrid Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HYBRID_PORT__UPPER_BOUND_MUST_BE_ONE__EEXPRESSION = "-- This Constraint is fulfilled, if no Cardinality exists.\n" +
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
	 * Validates the UpperBoundMustBeOne constraint of '<em>Hybrid Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPort_UpperBoundMustBeOne(HybridPort hybridPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "UpperBoundMustBeOne", getObjectLabel(hybridPort, context) },
						 new Object[] { hybridPort },
						 context));
			}
			return false;
		}
		return validateContinuousPort_UpperBoundMustBeOne(hybridPort, diagnostics, context);
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
