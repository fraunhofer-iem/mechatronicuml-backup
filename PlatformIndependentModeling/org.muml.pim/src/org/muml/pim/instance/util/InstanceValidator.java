/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.connector.util.ConnectorValidator;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscretePortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.instance.InstancePackage
 */
public class InstanceValidator extends MumlValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InstanceValidator INSTANCE = new InstanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.instance";

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
	public InstanceValidator() {
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
	  return InstancePackage.eINSTANCE;
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
			case InstancePackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case InstancePackage.PORT_CONNECTOR_INSTANCE:
				return validatePortConnectorInstance((PortConnectorInstance)value, diagnostics, context);
			case InstancePackage.PORT_INSTANCE:
				return validatePortInstance((PortInstance)value, diagnostics, context);
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE:
				return validateAssemblyConnectorInstance((AssemblyConnectorInstance)value, diagnostics, context);
			case InstancePackage.DELEGATION_CONNECTOR_INSTANCE:
				return validateDelegationConnectorInstance((DelegationConnectorInstance)value, diagnostics, context);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION:
				return validateComponentInstanceConfiguration((ComponentInstanceConfiguration)value, diagnostics, context);
			case InstancePackage.CONTINUOUS_PORT_INSTANCE:
				return validateContinuousPortInstance((ContinuousPortInstance)value, diagnostics, context);
			case InstancePackage.HYBRID_PORT_INSTANCE:
				return validateHybridPortInstance((HybridPortInstance)value, diagnostics, context);
			case InstancePackage.DISCRETE_PORT_INSTANCE:
				return validateDiscretePortInstance((DiscretePortInstance)value, diagnostics, context);
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE:
				return validateDiscreteSinglePortInstance((DiscreteSinglePortInstance)value, diagnostics, context);
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE:
				return validateDiscreteMultiPortInstance((DiscreteMultiPortInstance)value, diagnostics, context);
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE:
				return validateCoordinationProtocolInstance((CoordinationProtocolInstance)value, diagnostics, context);
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE:
				return validateStructuredComponentInstance((StructuredComponentInstance)value, diagnostics, context);
			case InstancePackage.ATOMIC_COMPONENT_INSTANCE:
				return validateAtomicComponentInstance((AtomicComponentInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_AllPortsAreInitialized(componentInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllPortsAreInitialized constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_INSTANCE__ALL_PORTS_ARE_INITIALIZED__EEXPRESSION = "-- All Ports with a lowerBound>0 must be initialized\n" +
		"let discretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port|port.oclIsKindOf(connector::DiscreteInteractionEndpoint)).oclAsType(component::Port)->asOrderedSet() endif in\n" +
		"let nonDiscretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port| port.oclIsKindOf(component::DirectedTypedPort)) endif in\n" +
		"let portsWhichShallBeInitialized : Set(component::Port) = nonDiscretePorts -> select(port | not(port.oclAsType(component::DirectedTypedPort).optional))->union(discretePorts->select(discretePort| discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.value > 0 or discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.infinity)) in\n" +
		"portsWhichShallBeInitialized -> forAll(port | self.portInstances -> exists(portInstance | portInstance.type = port))\n" +
		"-- adann,chris227";

	/**
	 * Validates the AllPortsAreInitialized constraint of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance_AllPortsAreInitialized(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.COMPONENT_INSTANCE,
				 componentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllPortsAreInitialized",
				 COMPONENT_INSTANCE__ALL_PORTS_ARE_INITIALIZED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortConnectorInstance(PortConnectorInstance portConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portConnectorInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortConnectorInstance_ValidPortConnectorInstance(portConnectorInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidPortConnectorInstance constraint of '<em>Port Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_CONNECTOR_INSTANCE__VALID_PORT_CONNECTOR_INSTANCE__EEXPRESSION = "-- The connected PortInstances do not correspond to the selected PortConnectorType\n" +
		"let directPortTypes : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints->select(endPoint|endPoint.oclIsKindOf(component::Port)).oclAsType(component::Port)->asOrderedSet() else OrderedSet{} endif in\n" +
		"let portTypesFromPortParts : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints->select(endPoint | endPoint.oclIsKindOf(component::PortPart)).oclAsType(component::PortPart)->collect(portType)->asOrderedSet() else OrderedSet{} endif  in\n" +
		"let allPortTypes : Set(component::Port) = directPortTypes->union(portTypesFromPortParts)->asOrderedSet() in\n" +
		"if (self.type.oclIsUndefined() or self.connectorEndpointInstances->isEmpty()) then \n" +
		"\ttrue\n" +
		"else\n" +
		"\tallPortTypes->symmetricDifference(self.connectorEndpointInstances.type.oclAsType(component::Port)->asSet())->isEmpty()\n" +
		"endif\n" +
		"-- adann\r\n" +
		"";

	/**
	 * Validates the ValidPortConnectorInstance constraint of '<em>Port Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortConnectorInstance_ValidPortConnectorInstance(PortConnectorInstance portConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.PORT_CONNECTOR_INSTANCE,
				 portConnectorInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidPortConnectorInstance",
				 PORT_CONNECTOR_INSTANCE__VALID_PORT_CONNECTOR_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(portInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PortInstanceMustReferencePortType constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_INSTANCE__PORT_INSTANCE_MUST_REFERENCE_PORT_TYPE__EEXPRESSION = "-- The type of a port instance must be a port type\r\n" +
		"if (not self.type->oclIsUndefined()) then\r\n" +
		"self.type.oclIsKindOf(component::Port)\r\n" +
		"else\r\n" +
		"false\r\n" +
		"endif";

	/**
	 * Validates the PortInstanceMustReferencePortType constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance_PortInstanceMustReferencePortType(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.PORT_INSTANCE,
				 portInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortInstanceMustReferencePortType",
				 PORT_INSTANCE__PORT_INSTANCE_MUST_REFERENCE_PORT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PortInstanceMustDelegateToEmbeddedCIC constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_INSTANCE__PORT_INSTANCE_MUST_DELEGATE_TO_EMBEDDED_CIC__EEXPRESSION = "-- PortInstance at Structured Component must delegate to embedded CIC\r\n" +
		"(componentInstance.oclIsKindOf(StructuredComponentInstance) and not self.oclIsKindOf(connector::DiscreteMultiInteractionEndpointInstance) and ( self.oclIsKindOf(HybridPortInstance) or self.oclIsKindOf(DiscretePortInstance) or self.oclIsKindOf(ContinuousPortInstance))) \r\n" +
		"implies not portConnectorInstances->select(ci | ci.oclIsKindOf(DelegationConnectorInstance) and \r\n" +
		"\tcomponentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance)\r\n" +
		")->isEmpty()\r\n" +
		"-- sthiele2: Check only HybridPortInstance, DiscretePortInstance, ContinousPortInstance ";

	/**
	 * Validates the PortInstanceMustDelegateToEmbeddedCIC constraint of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.PORT_INSTANCE,
				 portInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortInstanceMustDelegateToEmbeddedCIC",
				 PORT_INSTANCE__PORT_INSTANCE_MUST_DELEGATE_TO_EMBEDDED_CIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnectorInstance(AssemblyConnectorInstance assemblyConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnectorInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortConnectorInstance_ValidPortConnectorInstance(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnectorInstance_AssemblyConnectorInstanceNeedsTypeIfNotTopLevel(assemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnectorInstance_NoQoSAssumptionsIfNotDiscretePortConnector(assemblyConnectorInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AssemblyConnectorInstanceNeedsTypeIfNotTopLevel constraint of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_INSTANCE_NEEDS_TYPE_IF_NOT_TOP_LEVEL__EEXPRESSION = "-- Assembly Connector Instance needs type, if not top-level\r\n" +
		"portInstances.componentInstance->exists(not parentCIC.parentStructuredComponentInstance.oclIsUndefined()) implies not assemblyConnectorType.oclIsUndefined()\r\n" +
		"";

	/**
	 * Validates the AssemblyConnectorInstanceNeedsTypeIfNotTopLevel constraint of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnectorInstance_AssemblyConnectorInstanceNeedsTypeIfNotTopLevel(AssemblyConnectorInstance assemblyConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE,
				 assemblyConnectorInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AssemblyConnectorInstanceNeedsTypeIfNotTopLevel",
				 ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_INSTANCE_NEEDS_TYPE_IF_NOT_TOP_LEVEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoQoSAssumptionsIfNotDiscretePortConnector constraint of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR_INSTANCE__NO_QO_SASSUMPTIONS_IF_NOT_DISCRETE_PORT_CONNECTOR__EEXPRESSION = "-- An assembly instance connector may only have QoS assumptions if it connects two discrete port instances\r\n" +
		"(not connectorQualityOfServiceAssumptions.oclIsUndefined()) \r\n" +
		"implies \r\n" +
		"(portInstances->forAll(portInstance | not portInstance.oclIsUndefined() and portInstance.oclIsKindOf(instance::DiscretePortInstance)))";

	/**
	 * Validates the NoQoSAssumptionsIfNotDiscretePortConnector constraint of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnectorInstance_NoQoSAssumptionsIfNotDiscretePortConnector(AssemblyConnectorInstance assemblyConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE,
				 assemblyConnectorInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoQoSAssumptionsIfNotDiscretePortConnector",
				 ASSEMBLY_CONNECTOR_INSTANCE__NO_QO_SASSUMPTIONS_IF_NOT_DISCRETE_PORT_CONNECTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnectorInstance(DelegationConnectorInstance delegationConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnectorInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortConnectorInstance_ValidPortConnectorInstance(delegationConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationConnectorInstance_DelegateToEmbeddedCIC(delegationConnectorInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DelegateToEmbeddedCIC constraint of '<em>Delegation Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR_INSTANCE__DELEGATE_TO_EMBEDDED_CIC__EEXPRESSION = "-- Delegation Connector Instance must delegate to embedded Component Instance Configuration\n" +
		"self.portInstances->exists(a, b | b.componentInstance.parentCIC.parentStructuredComponentInstance = a.componentInstance)";

	/**
	 * Validates the DelegateToEmbeddedCIC constraint of '<em>Delegation Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnectorInstance_DelegateToEmbeddedCIC(DelegationConnectorInstance delegationConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DELEGATION_CONNECTOR_INSTANCE,
				 delegationConnectorInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DelegateToEmbeddedCIC",
				 DELEGATION_CONNECTOR_INSTANCE__DELEGATE_TO_EMBEDDED_CIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstanceConfiguration(ComponentInstanceConfiguration componentInstanceConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstanceConfiguration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstanceConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstanceConfiguration_UniqueComponentInstanceNames(componentInstanceConfiguration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueComponentInstanceNames constraint of '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_INSTANCE_CONFIGURATION__UNIQUE_COMPONENT_INSTANCE_NAMES__EEXPRESSION = "--  Component instances of a component instance configuration must have unique names on top level.\r\n" +
		"self.componentInstances->isUnique(name)";

	/**
	 * Validates the UniqueComponentInstanceNames constraint of '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstanceConfiguration_UniqueComponentInstanceNames(ComponentInstanceConfiguration componentInstanceConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION,
				 componentInstanceConfiguration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueComponentInstanceNames",
				 COMPONENT_INSTANCE_CONFIGURATION__UNIQUE_COMPONENT_INSTANCE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPortInstance(ContinuousPortInstance continuousPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(continuousPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPortInstance_PortTypeIsKindOfContinuousPort(continuousPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PortTypeIsKindOfContinuousPort constraint of '<em>Continuous Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUOUS_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_CONTINUOUS_PORT__EEXPRESSION = "-- The port type of a ContinuousPortInstance has to be of kind ContinuousPort\n" +
		"(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::ContinuousPort)\n" +
		"-- adann";

	/**
	 * Validates the PortTypeIsKindOfContinuousPort constraint of '<em>Continuous Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPortInstance_PortTypeIsKindOfContinuousPort(ContinuousPortInstance continuousPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.CONTINUOUS_PORT_INSTANCE,
				 continuousPortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortTypeIsKindOfContinuousPort",
				 CONTINUOUS_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_CONTINUOUS_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPortInstance(HybridPortInstance hybridPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hybridPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(hybridPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateHybridPortInstance_PortTypeIsKindOfHybridPort(hybridPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PortTypeIsKindOfHybridPort constraint of '<em>Hybrid Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HYBRID_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_HYBRID_PORT__EEXPRESSION = "-- The port type of a HybridPortInstance has to be of kind HybridPort\n" +
		"(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::HybridPort)\n" +
		"-- adann";

	/**
	 * Validates the PortTypeIsKindOfHybridPort constraint of '<em>Hybrid Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPortInstance_PortTypeIsKindOfHybridPort(HybridPortInstance hybridPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.HYBRID_PORT_INSTANCE,
				 hybridPortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortTypeIsKindOfHybridPort",
				 HYBRID_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_HYBRID_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePortInstance(DiscretePortInstance discretePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discretePortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(discretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(discretePortInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PortTypeIsKindOfDiscretePort constraint of '<em>Discrete Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_DISCRETE_PORT__EEXPRESSION = "-- The port type of a DiscretePortInstance has to be of kind DiscretePort\n" +
		"(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::DiscretePort)";

	/**
	 * Validates the PortTypeIsKindOfDiscretePort constraint of '<em>Discrete Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(DiscretePortInstance discretePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DISCRETE_PORT_INSTANCE,
				 discretePortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortTypeIsKindOfDiscretePort",
				 DISCRETE_PORT_INSTANCE__PORT_TYPE_IS_KIND_OF_DISCRETE_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSinglePortInstance(DiscreteSinglePortInstance discreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteSinglePortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteSingleInteractionEndpointInstance_StandaloneSingleEndpointInstanceRequiresSingleEndpointType(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSinglePortInstance_PortInstanceNotMultipleAssemblyConnectorInstances(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSinglePortInstance_PortInstanceNotMultipleDelegationConnectorInstances(discreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSinglePortInstance_PortInstanceNeedsDelegationToParentOrAssembly(discreteSinglePortInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PortInstanceNotMultipleAssemblyConnectorInstances constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NOT_MULTIPLE_ASSEMBLY_CONNECTOR_INSTANCES__EEXPRESSION = "-- PortInstance must have not have mulltiple Assembly Connector Instances assigned.\n" +
		"portConnectorInstances->select(\n" +
		"\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n" +
		")->size() <= 1";

	/**
	 * Validates the PortInstanceNotMultipleAssemblyConnectorInstances constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSinglePortInstance_PortInstanceNotMultipleAssemblyConnectorInstances(DiscreteSinglePortInstance discreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DISCRETE_SINGLE_PORT_INSTANCE,
				 discreteSinglePortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortInstanceNotMultipleAssemblyConnectorInstances",
				 DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NOT_MULTIPLE_ASSEMBLY_CONNECTOR_INSTANCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PortInstanceNotMultipleDelegationConnectorInstances constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NOT_MULTIPLE_DELEGATION_CONNECTOR_INSTANCES__EEXPRESSION = "-- PortInstance must have not have multiple Delegation Connector Instances per directiond assigned.\r\n" +
		"let delegationInstances : Set(instance::DelegationConnectorInstance) = portConnectorInstances->select(oclIsKindOf(instance::DelegationConnectorInstance)).oclAsType(instance::DelegationConnectorInstance)->asSet() in\r\n" +
		"let incoming : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or pi.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(self.componentInstance))) in\r\n" +
		"let outgoing : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or self.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(pi.componentInstance))) in\r\n" +
		"incoming->size() <= 1 and outgoing->size() <= 1";

	/**
	 * Validates the PortInstanceNotMultipleDelegationConnectorInstances constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSinglePortInstance_PortInstanceNotMultipleDelegationConnectorInstances(DiscreteSinglePortInstance discreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DISCRETE_SINGLE_PORT_INSTANCE,
				 discreteSinglePortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortInstanceNotMultipleDelegationConnectorInstances",
				 DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NOT_MULTIPLE_DELEGATION_CONNECTOR_INSTANCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PortInstanceNeedsDelegationToParentOrAssembly constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NEEDS_DELEGATION_TO_PARENT_OR_ASSEMBLY__EEXPRESSION = "-- PortInstance needs a Delegation Connector Instance to the parent component's port or an Assembly Connector Instance to a port within this CIC.\r\n" +
		"\r\n" +
		"if(self.componentInstance.oclIsInvalid() or self.componentInstance = null) then true else (not self.componentInstance.topLevel) implies (\r\n" +
		"not portConnectorInstances->select(\r\n" +
		"\tci | ci.oclIsKindOf(DelegationConnectorInstance)\r\n" +
		"\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclIsKindOf(StructuredComponentInstance)\r\n" +
		"\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(componentInstance)\r\n" +
		")->isEmpty() or\r\n" +
		"not portConnectorInstances->select(\r\n" +
		"\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\r\n" +
		")->isEmpty()\r\n" +
		")\r\n" +
		"endif\r\n" +
		"";

	/**
	 * Validates the PortInstanceNeedsDelegationToParentOrAssembly constraint of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSinglePortInstance_PortInstanceNeedsDelegationToParentOrAssembly(DiscreteSinglePortInstance discreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DISCRETE_SINGLE_PORT_INSTANCE,
				 discreteSinglePortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PortInstanceNeedsDelegationToParentOrAssembly",
				 DISCRETE_SINGLE_PORT_INSTANCE__PORT_INSTANCE_NEEDS_DELEGATION_TO_PARENT_OR_ASSEMBLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiPortInstance(DiscreteMultiPortInstance discreteMultiPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteMultiPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustReferencePortType(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_TypeIsMultiDiscreteInteractionEndpoint(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToLowerBound(discreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToUpperBound(discreteMultiPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocolInstance(CoordinationProtocolInstance coordinationProtocolInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinationProtocolInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponentInstance(StructuredComponentInstance structuredComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_AllPortsAreInitialized(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponentInstance_NumberOfembeddedComponentInstancesCorrespondsToLowerBound(structuredComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredComponentInstance_NumberOfembeddedComponentInstancesCorrespondsToUpperBound(structuredComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NumberOfembeddedComponentInstancesCorrespondsToLowerBound constraint of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT_INSTANCE__NUMBER_OFEMBEDDED_COMPONENT_INSTANCES_CORRESPONDS_TO_LOWER_BOUND__EEXPRESSION = " -- Not all ComponentParts with a lowerBound > 0 are initialized\n" +
		"let componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\n" +
		" let componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\n" +
		"componentParts->forAll(part| if (not part.cardinality.lowerBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()>=part.cardinality.lowerBound.value else true endif)\n" +
		"-- adann";

	/**
	 * Validates the NumberOfembeddedComponentInstancesCorrespondsToLowerBound constraint of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponentInstance_NumberOfembeddedComponentInstancesCorrespondsToLowerBound(StructuredComponentInstance structuredComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE,
				 structuredComponentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NumberOfembeddedComponentInstancesCorrespondsToLowerBound",
				 STRUCTURED_COMPONENT_INSTANCE__NUMBER_OFEMBEDDED_COMPONENT_INSTANCES_CORRESPONDS_TO_LOWER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NumberOfembeddedComponentInstancesCorrespondsToUpperBound constraint of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_COMPONENT_INSTANCE__NUMBER_OFEMBEDDED_COMPONENT_INSTANCES_CORRESPONDS_TO_UPPER_BOUND__EEXPRESSION = " -- The number of initialized ComponentInstances does not corresponds to the specified upperBound\n" +
		"let componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\n" +
		"let componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\n" +
		"componentParts->forAll(part| if (not part.cardinality.upperBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()<=part.cardinality.upperBound.value else true endif)\n" +
		"-- adann ticket:937";

	/**
	 * Validates the NumberOfembeddedComponentInstancesCorrespondsToUpperBound constraint of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredComponentInstance_NumberOfembeddedComponentInstancesCorrespondsToUpperBound(StructuredComponentInstance structuredComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE,
				 structuredComponentInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NumberOfembeddedComponentInstancesCorrespondsToUpperBound",
				 STRUCTURED_COMPONENT_INSTANCE__NUMBER_OFEMBEDDED_COMPONENT_INSTANCES_CORRESPONDS_TO_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponentInstance(AtomicComponentInstance atomicComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atomicComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(atomicComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentInstance_AllPortsAreInitialized(atomicComponentInstance, diagnostics, context);
		return result;
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

} //InstanceValidator
