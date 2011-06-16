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
			case ComponentPackage.CONTINUOUS_COMPONENT:
				return validateContinuousComponent((ContinuousComponent)value, diagnostics, context);
			case ComponentPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case ComponentPackage.CONTINUOUS_PORT:
				return validateContinuousPort((ContinuousPort)value, diagnostics, context);
			case ComponentPackage.DISCRETE_PORT:
				return validateDiscretePort((DiscretePort)value, diagnostics, context);
			case ComponentPackage.HARDWARE_PORT:
				return validateHardwarePort((HardwarePort)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousComponent(ContinuousComponent continuousComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuousComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_body(port, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the body constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__BODY__EEXPRESSION = "self.cardinality.lowerBound->notEmpty()";

	/**
	 * Validates the body constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_body(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "body",
				 PORT__BODY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validatePort_body(continuousPort, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validatePort_body(discretePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePort(HardwarePort hardwarePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hardwarePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwarePort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_body(hardwarePort, diagnostics, context);
		return result;
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
		return validate_EveryDefaultConstraint(structuredComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicComponent(AtomicComponent atomicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomicComponent, diagnostics, context);
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
		return validate_EveryDefaultConstraint(assembly, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePort_body(hybridPort, diagnostics, context);
		return result;
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
