/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PatternInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage
 * @generated
 */
public class InstanceValidator extends EObjectValidator {
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.instance";

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
			case InstancePackage.CONNECTOR_INSTANCE:
				return validateConnectorInstance((ConnectorInstance)value, diagnostics, context);
			case InstancePackage.PORT_INSTANCE:
				return validatePortInstance((PortInstance)value, diagnostics, context);
			case InstancePackage.ASSEMBLY_INSTANCE:
				return validateAssemblyInstance((AssemblyInstance)value, diagnostics, context);
			case InstancePackage.DELEGATION_INSTANCE:
				return validateDelegationInstance((DelegationInstance)value, diagnostics, context);
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
			case InstancePackage.PATTERN_INSTANCE:
				return validatePatternInstance((PatternInstance)value, diagnostics, context);
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
	public boolean validateConnectorInstance(ConnectorInstance connectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyInstance(AssemblyInstance assemblyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationInstance(DelegationInstance delegationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationInstance_OneDelegationInstancePerPortInstance(delegationInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneDelegationInstancePerPortInstance constraint of '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_INSTANCE__ONE_DELEGATION_INSTANCE_PER_PORT_INSTANCE__EEXPRESSION = "not self.source.oclIsUndefined() implies self.source.outgoingConnectorInstances->select(x | x.oclIsKindOf(DelegationInstance))->size() = 1";

	/**
	 * Validates the OneDelegationInstancePerPortInstance constraint of '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationInstance_OneDelegationInstancePerPortInstance(DelegationInstance delegationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InstancePackage.Literals.DELEGATION_INSTANCE,
				 delegationInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneDelegationInstancePerPortInstance",
				 DELEGATION_INSTANCE__ONE_DELEGATION_INSTANCE_PER_PORT_INSTANCE__EEXPRESSION,
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
		return validate_EveryDefaultConstraint(componentInstanceConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPortInstance(ContinuousPortInstance continuousPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuousPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHybridPortInstance(HybridPortInstance hybridPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hybridPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretePortInstance(DiscretePortInstance discretePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discretePortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSinglePortInstance(DiscreteSinglePortInstance discreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteSinglePortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiPortInstance(DiscreteMultiPortInstance discreteMultiPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteMultiPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternInstance(PatternInstance patternInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternInstance, diagnostics, context);
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
