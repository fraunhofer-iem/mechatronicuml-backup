/**
 */
package org.muml.reconfiguration.componentstorypattern.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.reconfiguration.componentstorypattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage
 * @generated
 */
public class ComponentstorypatternValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentstorypatternValidator INSTANCE = new ComponentstorypatternValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.reconfiguration.componentstorypattern";

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
	public ComponentstorypatternValidator() {
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
	  return ComponentstorypatternPackage.eINSTANCE;
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN:
				return validateComponentStoryPattern((ComponentStoryPattern)value, diagnostics, context);
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN_VARIABLE:
				return validateComponentStoryPatternVariable((ComponentStoryPatternVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.COMPONENT_VARIABLE:
				return validateComponentVariable((ComponentVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.PORT_VARIABLE:
				return validatePortVariable((PortVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.PART_VARIABLE:
				return validatePartVariable((PartVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE:
				return validateConnectorVariable((ConnectorVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.ASSEMBLY_VARIABLE:
				return validateAssemblyVariable((AssemblyVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.DELEGATION_VARIABLE:
				return validateDelegationVariable((DelegationVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE:
				return validateSinglePortVariable((SinglePortVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE:
				return validateMultiPortVariable((MultiPortVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.TRIGGER_EMBEDDED_COMPONENT_EXPRESSION:
				return validateTriggerEmbeddedComponentExpression((TriggerEmbeddedComponentExpression)value, diagnostics, context);
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE:
				return validateFadingComponentPartVariable((FadingComponentPartVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE:
				return validateComponentPartVariable((ComponentPartVariable)value, diagnostics, context);
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT:
				return validateMultiPortOrderConstraint((MultiPortOrderConstraint)value, diagnostics, context);
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT:
				return validateMultiPortPositionConstraint((MultiPortPositionConstraint)value, diagnostics, context);
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT_TYPE:
				return validateMultiPortOrderConstraintType((MultiPortOrderConstraintType)value, diagnostics, context);
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT_TYPE:
				return validateMultiPortPositionConstraintType((MultiPortPositionConstraintType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryPattern(ComponentStoryPattern componentStoryPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentStoryPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryPatternVariable(ComponentStoryPatternVariable componentStoryPatternVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentStoryPatternVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentVariable(ComponentVariable componentVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentVariable_AtLeastOnePartVariableOrPortVariable(componentVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOnePartVariableOrPortVariable constraint of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_VARIABLE__AT_LEAST_ONE_PART_VARIABLE_OR_PORT_VARIABLE__EEXPRESSION = "self.portVariables->size() > 0 or self.partVariables->size() > 0";

	/**
	 * Validates the AtLeastOnePartVariableOrPortVariable constraint of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentVariable_AtLeastOnePartVariableOrPortVariable(ComponentVariable componentVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE,
				 componentVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOnePartVariableOrPortVariable",
				 COMPONENT_VARIABLE__AT_LEAST_ONE_PART_VARIABLE_OR_PORT_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortVariable(PortVariable portVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingOperatorAsParent(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingSemanticsAsParent(portVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_ValidTypeOfPortVariable(portVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameBindingOperatorAsParent constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_VARIABLE__SAME_BINDING_OPERATOR_AS_PARENT__EEXPRESSION = "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the SameBindingOperatorAsParent constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortVariable_SameBindingOperatorAsParent(PortVariable portVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.PORT_VARIABLE,
				 portVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameBindingOperatorAsParent",
				 PORT_VARIABLE__SAME_BINDING_OPERATOR_AS_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SameBindingSemanticsAsParent constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_VARIABLE__SAME_BINDING_SEMANTICS_AS_PARENT__EEXPRESSION = "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagrams::patterns::BindingSemantics::OPTIONAL then\r\n" +
		"\tself.bindingSemantics = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the SameBindingSemanticsAsParent constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortVariable_SameBindingSemanticsAsParent(PortVariable portVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.PORT_VARIABLE,
				 portVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameBindingSemanticsAsParent",
				 PORT_VARIABLE__SAME_BINDING_SEMANTICS_AS_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidTypeOfPortVariable constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT_VARIABLE__VALID_TYPE_OF_PORT_VARIABLE__EEXPRESSION = "if self.eContainer().oclIsKindOf(ComponentVariable) then\r\n" +
		"\tif not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n" +
		"\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(pim::component::Component).ports->includes(self.dataType.oclAsType(pim::component::Port))\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif\r\n" +
		"else\r\n" +
		"\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n" +
		"\t\tif not self.eContainer().oclAsType(PartVariable).dataType.oclIsUndefined() then\r\n" +
		"\t\t\tself.eContainer().oclAsType(PartVariable).dataType.oclAsType(pim::component::ComponentPart).componentType.oclAsType(pim::component::Component).ports->includes(self.dataType.oclAsType(pim::component::Port))\r\n" +
		"\t\telse\r\n" +
		"\t\t\tfalse\r\n" +
		"\t\tendif\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif\r\n" +
		"endif";

	/**
	 * Validates the ValidTypeOfPortVariable constraint of '<em>Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortVariable_ValidTypeOfPortVariable(PortVariable portVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.PORT_VARIABLE,
				 portVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidTypeOfPortVariable",
				 PORT_VARIABLE__VALID_TYPE_OF_PORT_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartVariable(PartVariable partVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_SameBindingOperatorAsComponentVariable(partVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_ValidTypeOfPartVariable(partVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameBindingOperatorAsComponentVariable constraint of '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PART_VARIABLE__SAME_BINDING_OPERATOR_AS_COMPONENT_VARIABLE__EEXPRESSION = "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the SameBindingOperatorAsComponentVariable constraint of '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartVariable_SameBindingOperatorAsComponentVariable(PartVariable partVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.PART_VARIABLE,
				 partVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameBindingOperatorAsComponentVariable",
				 PART_VARIABLE__SAME_BINDING_OPERATOR_AS_COMPONENT_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidTypeOfPartVariable constraint of '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PART_VARIABLE__VALID_TYPE_OF_PART_VARIABLE__EEXPRESSION = "if not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n" +
		"\tif self.eContainer().oclAsType(ComponentVariable).type.oclIsKindOf(pim::component::StructuredComponent) then\r\n" +
		"\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(pim::component::StructuredComponent).embeddedComponentParts->includes(self.dataType.oclAsType(pim::component::ComponentPart))\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif\r\n" +
		"else\r\n" +
		"\tfalse\r\n" +
		"endif";

	/**
	 * Validates the ValidTypeOfPartVariable constraint of '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartVariable_ValidTypeOfPartVariable(PartVariable partVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.PART_VARIABLE,
				 partVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidTypeOfPartVariable",
				 PART_VARIABLE__VALID_TYPE_OF_PART_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorVariable(ConnectorVariable connectorVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_MustNotConnectCreateAndDestroyPorts(connectorVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_SameBindingOperatorAsPortVariable(connectorVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustNotConnectCreateAndDestroyPorts constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_VARIABLE__MUST_NOT_CONNECT_CREATE_AND_DESTROY_PORTS__EEXPRESSION = "if self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n" +
		"\tself.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\n" +
		"else\r\n" +
		"\tif self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n" +
		"\t\tself.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif\r\n" +
		"endif";

	/**
	 * Validates the MustNotConnectCreateAndDestroyPorts constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorVariable_MustNotConnectCreateAndDestroyPorts(ConnectorVariable connectorVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.CONNECTOR_VARIABLE,
				 connectorVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MustNotConnectCreateAndDestroyPorts",
				 CONNECTOR_VARIABLE__MUST_NOT_CONNECT_CREATE_AND_DESTROY_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SameBindingOperatorAsPortVariable constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_VARIABLE__SAME_BINDING_OPERATOR_AS_PORT_VARIABLE__EEXPRESSION = "if self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
		"else\r\n" +
		"\tif self.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif\r\n" +
		"endif";

	/**
	 * Validates the SameBindingOperatorAsPortVariable constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorVariable_SameBindingOperatorAsPortVariable(ConnectorVariable connectorVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.CONNECTOR_VARIABLE,
				 connectorVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameBindingOperatorAsPortVariable",
				 CONNECTOR_VARIABLE__SAME_BINDING_OPERATOR_AS_PORT_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyVariable(AssemblyVariable assemblyVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_MustNotConnectCreateAndDestroyPorts(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_SameBindingOperatorAsPortVariable(assemblyVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyVariable_ExistingConnectorBetweenPortVariableTypes(assemblyVariable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExistingConnectorBetweenPortVariableTypes constraint of '<em>Assembly Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyVariable_ExistingConnectorBetweenPortVariableTypes(AssemblyVariable assemblyVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ExistingConnectorBetweenPortVariableTypes", getObjectLabel(assemblyVariable, context) },
						 new Object[] { assemblyVariable },
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
	public boolean validateDelegationVariable(DelegationVariable delegationVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_MustNotConnectCreateAndDestroyPorts(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorVariable_SameBindingOperatorAsPortVariable(delegationVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationVariable_ExistingDelegationConnectorBetweenPortVariableTypes(delegationVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ExistingDelegationConnectorBetweenPortVariableTypes constraint of '<em>Delegation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_VARIABLE__EXISTING_DELEGATION_CONNECTOR_BETWEEN_PORT_VARIABLE_TYPES__EEXPRESSION = "if not self.type.oclIsUndefined() then\r\n" +
		"\tlet selfPorts : OrderedSet(pim::component::Port) = self.portVariables.portType.oclAsType(pim::component::Port)->asOrderedSet(),\r\n" +
		"\ttypePorts: OrderedSet(pim::component::Port) = self.type.connectorEndpoints->collect( cE |\r\n" +
		"\t  if cE.oclIsTypeOf(pim::component::PortPart)\t\r\n" +
		"      then cE.oclAsType(pim::component::PortPart).portType\r\n" +
		"\t  else \r\n" +
		"\t  \tif cE.oclIsKindOf(pim::component::Port)\r\n" +
		"\t  \tthen cE.oclAsType(pim::component::Port)\r\n" +
		"\t  \telse  null\r\n" +
		"\t  \tendif\r\n" +
		"\t  endif)->asOrderedSet()\r\n" +
		"\tin \r\n" +
		"\tselfPorts->intersection(typePorts)->size() = 2\t\t\r\n" +
		"else\r\n" +
		"\t\tfalse\r\n" +
		"endif";

	/**
	 * Validates the ExistingDelegationConnectorBetweenPortVariableTypes constraint of '<em>Delegation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationVariable_ExistingDelegationConnectorBetweenPortVariableTypes(DelegationVariable delegationVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.DELEGATION_VARIABLE,
				 delegationVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExistingDelegationConnectorBetweenPortVariableTypes",
				 DELEGATION_VARIABLE__EXISTING_DELEGATION_CONNECTOR_BETWEEN_PORT_VARIABLE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSinglePortVariable(SinglePortVariable singlePortVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singlePortVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingOperatorAsParent(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingSemanticsAsParent(singlePortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_ValidTypeOfPortVariable(singlePortVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPortVariable(MultiPortVariable multiPortVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiPortVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingOperatorAsParent(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_SameBindingSemanticsAsParent(multiPortVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortVariable_ValidTypeOfPortVariable(multiPortVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEmbeddedComponentExpression(TriggerEmbeddedComponentExpression triggerEmbeddedComponentExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEmbeddedComponentExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingComponentPartVariable(FadingComponentPartVariable fadingComponentPartVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fadingComponentPartVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_SameBindingOperatorAsComponentVariable(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_ValidTypeOfPartVariable(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateFadingComponentPartVariable_AppliedFadingFunctionIsContainedInType(fadingComponentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateFadingComponentPartVariable_NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode(fadingComponentPartVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AppliedFadingFunctionIsContainedInType constraint of '<em>Fading Component Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION_IS_CONTAINED_IN_TYPE__EEXPRESSION = " let fadingFunction : reconfiguration::FadingFunction = self.appliedFadingFunction.oclAsType(reconfiguration::FadingFunction) in\r\n" +
		" \tif fadingFunction.oclIsUndefined()\r\n" +
		" \tthen true\r\n" +
		" \telse\r\n" +
		"\t\tself.dataType.oclAsType(pim::component::ComponentPart).componentType.oclAsType(reconfiguration::FadingComponent).fadingFunction\r\n" +
		"\t\t->select(curFadingFunction : reconfiguration::FadingFunction| curFadingFunction = fadingFunction)->size()=1\r\n" +
		"\tendif";

	/**
	 * Validates the AppliedFadingFunctionIsContainedInType constraint of '<em>Fading Component Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingComponentPartVariable_AppliedFadingFunctionIsContainedInType(FadingComponentPartVariable fadingComponentPartVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.FADING_COMPONENT_PART_VARIABLE,
				 fadingComponentPartVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AppliedFadingFunctionIsContainedInType",
				 FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION_IS_CONTAINED_IN_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode constraint of '<em>Fading Component Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FADING_COMPONENT_PART_VARIABLE__NOT_DEFINE_APPLIED_FADING_FUNCTION_FOR_VARIABLE_NOT_CONTAINED_IN_CONTROLLER_EXCHANGE_NODE__EEXPRESSION = "if not self.eContainer().eContainer().eContainer().oclIsTypeOf(componentstorydiagram::ControllerExchangeNode)\r\n" +
		"\tthen self.appliedFadingFunction.oclIsUndefined()\r\n" +
		"else true\r\n" +
		"endif";

	/**
	 * Validates the NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode constraint of '<em>Fading Component Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingComponentPartVariable_NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode(FadingComponentPartVariable fadingComponentPartVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.FADING_COMPONENT_PART_VARIABLE,
				 fadingComponentPartVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NotDefineAppliedFadingFunctionForVariableNotContainedInControllerExchangeNode",
				 FADING_COMPONENT_PART_VARIABLE__NOT_DEFINE_APPLIED_FADING_FUNCTION_FOR_VARIABLE_NOT_CONTAINED_IN_CONTROLLER_EXCHANGE_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPartVariable(ComponentPartVariable componentPartVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentPartVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_SameBindingOperatorAsComponentVariable(componentPartVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartVariable_ValidTypeOfPartVariable(componentPartVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPortOrderConstraint(MultiPortOrderConstraint multiPortOrderConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiPortOrderConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPortPositionConstraint(MultiPortPositionConstraint multiPortPositionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiPortPositionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPortOrderConstraintType(MultiPortOrderConstraintType multiPortOrderConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPortPositionConstraintType(MultiPortPositionConstraintType multiPortPositionConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ComponentstorypatternValidator
