/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.util;

import de.uni_paderborn.fujaba.muml.instance.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import de.uni_paderborn.fujaba.common.validator.MumlValidator;
import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance;
import de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.instance";

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
	public InstanceValidator() {
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
		return validate_EveryDefaultConstraint(componentInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortConnectorInstance(PortConnectorInstance portConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portConnectorInstance, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnectorInstance(AssemblyConnectorInstance assemblyConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyConnectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnectorInstance(DelegationConnectorInstance delegationConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationConnectorInstance, diagnostics, context);
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
		return result;
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
		return result;
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
		return result;
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
		return result;
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
		return validate_EveryDefaultConstraint(structuredComponentInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponentInstance(AtomicComponentInstance atomicComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomicComponentInstance, diagnostics, context);
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
