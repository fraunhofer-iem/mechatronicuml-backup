/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.util;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern";

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
			case ComponentstorypatternPackage.CALL:
				return validateCall((Call)value, diagnostics, context);
			case ComponentstorypatternPackage.FADING_FUNCTION:
				return validateFadingFunction((FadingFunction)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateComponentVariable_OnlyPartVariablesIfTypeIsStructuredComponent(componentVariable, diagnostics, context);
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
	 * The cached validation expression for the OnlyPartVariablesIfTypeIsStructuredComponent constraint of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_VARIABLE__ONLY_PART_VARIABLES_IF_TYPE_IS_STRUCTURED_COMPONENT__EEXPRESSION = "self.type.oclIsKindOf(muml::model::component::StructuredComponent) or self.partVariables->size()=0\r\n" +
		"";

	/**
	 * Validates the OnlyPartVariablesIfTypeIsStructuredComponent constraint of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentVariable_OnlyPartVariablesIfTypeIsStructuredComponent(ComponentVariable componentVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE,
				 componentVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyPartVariablesIfTypeIsStructuredComponent",
				 COMPONENT_VARIABLE__ONLY_PART_VARIABLES_IF_TYPE_IS_STRUCTURED_COMPONENT__EEXPRESSION,
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
		"\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif\r\n" +
		"else\r\n" +
		"\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n" +
		"\t\tif not self.eContainer().oclAsType(PartVariable).type.oclIsUndefined() then\r\n" +
		"\t\t\tself.eContainer().oclAsType(PartVariable).type.oclAsType(muml::model::component::ComponentPart).componentType.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n" +
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
		"\tif self.eContainer().oclAsType(ComponentVariable).type.oclIsKindOf(muml::model::component::StructuredComponent) then\r\n" +
		"\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::model::component::StructuredComponent).embeddedParts->includes(self.type.oclAsType(muml::model::component::ComponentPart))\r\n" +
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
		if (result || diagnostics != null) result &= validateConnectorVariable_ExistingConnectorBetweenPortVariableTypes(connectorVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustNotConnectCreateAndDestroyPorts constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_VARIABLE__MUST_NOT_CONNECT_CREATE_AND_DESTROY_PORTS__EEXPRESSION = "if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n" +
		"\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\n" +
		"else\r\n" +
		"\tif self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n" +
		"\t\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n" +
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
	protected static final String CONNECTOR_VARIABLE__SAME_BINDING_OPERATOR_AS_PORT_VARIABLE__EEXPRESSION = "if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
		"else\r\n" +
		"\tif self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n" +
		"\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n" +
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
	 * The cached validation expression for the ExistingConnectorBetweenPortVariableTypes constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_VARIABLE__EXISTING_CONNECTOR_BETWEEN_PORT_VARIABLE_TYPES__EEXPRESSION = "if self.oclIsKindOf(AssemblyVariable) then\r\n" +
		"\tif not self.oclAsType(AssemblyVariable).type.oclIsUndefined() then\r\n" +
		"\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n" +
		"\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n" +
		"\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n" +
		"\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif\r\n" +
		"else\r\n" +
		"\tif self.oclIsKindOf(DelegationVariable) then\r\n" +
		"\t\tif not self.oclAsType(DelegationVariable).type.oclIsUndefined() then\r\n" +
		"\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n" +
		"\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n" +
		"\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n" +
		"\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n" +
		"\t\telse\r\n" +
		"\t\t\tfalse\r\n" +
		"\t\tendif\t\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif\r\n" +
		"endif";

	/**
	 * Validates the ExistingConnectorBetweenPortVariableTypes constraint of '<em>Connector Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorVariable_ExistingConnectorBetweenPortVariableTypes(ConnectorVariable connectorVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorypatternPackage.Literals.CONNECTOR_VARIABLE,
				 connectorVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExistingConnectorBetweenPortVariableTypes",
				 CONNECTOR_VARIABLE__EXISTING_CONNECTOR_BETWEEN_PORT_VARIABLE_TYPES__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateConnectorVariable_ExistingConnectorBetweenPortVariableTypes(assemblyVariable, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateConnectorVariable_ExistingConnectorBetweenPortVariableTypes(delegationVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall(Call call, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(call, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadingFunction(FadingFunction fadingFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fadingFunction, diagnostics, context);
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
