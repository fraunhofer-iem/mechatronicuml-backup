/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.util;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.SendReconfigurationMessageExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage
 * @generated
 */
public class ComponentstorydiagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentstorydiagramValidator INSTANCE = new ComponentstorydiagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.componentstorydiagram";

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
	public ComponentstorydiagramValidator() {
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
	  return ComponentstorydiagramPackage.eINSTANCE;
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
			case ComponentstorydiagramPackage.COMPONENT_STORY_RULE:
				return validateComponentStoryRule((ComponentStoryRule)value, diagnostics, context);
			case ComponentstorydiagramPackage.COMPONENT_STORY_NODE:
				return validateComponentStoryNode((ComponentStoryNode)value, diagnostics, context);
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE:
				return validateControllerExchangeNode((ControllerExchangeNode)value, diagnostics, context);
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION:
				return validateSendReconfigurationMessageExpression((SendReconfigurationMessageExpression)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryRule(ComponentStoryRule componentStoryRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentStoryRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentStoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentStoryRule_ComponentVariableHasToHaveSameTypeAsReconfiguredComponent(componentStoryRule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ComponentVariableHasToHaveSameTypeAsReconfiguredComponent constraint of '<em>Component Story Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_STORY_RULE__COMPONENT_VARIABLE_HAS_TO_HAVE_SAME_TYPE_AS_RECONFIGURED_COMPONENT__EEXPRESSION = "-- A ComponentVariable has to have the reconfigured component as type\r\n" +
		"self.activity.ownedActivityNode->select(oclIsTypeOf(ComponentStoryNode))->forAll(oAN | oAN.oclAsType(ComponentStoryNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)\r\n" +
		"and\r\n" +
		"self.activity.ownedActivityNode->select(oclIsTypeOf(ControllerExchangeNode))->forAll(oAN | oAN.oclAsType(ControllerExchangeNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)";

	/**
	 * Validates the ComponentVariableHasToHaveSameTypeAsReconfiguredComponent constraint of '<em>Component Story Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryRule_ComponentVariableHasToHaveSameTypeAsReconfiguredComponent(ComponentStoryRule componentStoryRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorydiagramPackage.Literals.COMPONENT_STORY_RULE,
				 componentStoryRule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ComponentVariableHasToHaveSameTypeAsReconfiguredComponent",
				 COMPONENT_STORY_RULE__COMPONENT_VARIABLE_HAS_TO_HAVE_SAME_TYPE_AS_RECONFIGURED_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryNode(ComponentStoryNode componentStoryNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentStoryNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExchangeNode(ControllerExchangeNode controllerExchangeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerExchangeNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateControllerExchangeNode_HasOnlyOneCreateAndOneDestroyPartVariable(controllerExchangeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateControllerExchangeNode_ContainsExactlyOneFadingComponentPartVariable(controllerExchangeNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HasOnlyOneCreateAndOneDestroyPartVariable constraint of '<em>Controller Exchange Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLER_EXCHANGE_NODE__HAS_ONLY_ONE_CREATE_AND_ONE_DESTROY_PART_VARIABLE__EEXPRESSION = "let partVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables\r\n" +
		"->select(pV : componentstorypattern::PartVariable | pV.oclIsKindOf(componentstorypattern::ComponentPartVariable))->asOrderedSet() in\r\n" +
		"partVariables->size() = 2 and\r\n" +
		"if partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY else\r\n" +
		"if partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE else\r\n" +
		"false endif endif\r\n" +
		"";

	/**
	 * Validates the HasOnlyOneCreateAndOneDestroyPartVariable constraint of '<em>Controller Exchange Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExchangeNode_HasOnlyOneCreateAndOneDestroyPartVariable(ControllerExchangeNode controllerExchangeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE,
				 controllerExchangeNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HasOnlyOneCreateAndOneDestroyPartVariable",
				 CONTROLLER_EXCHANGE_NODE__HAS_ONLY_ONE_CREATE_AND_ONE_DESTROY_PART_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContainsExactlyOneFadingComponentPartVariable constraint of '<em>Controller Exchange Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLER_EXCHANGE_NODE__CONTAINS_EXACTLY_ONE_FADING_COMPONENT_PART_VARIABLE__EEXPRESSION = "let fadingComponentPartVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables->select(pv : componentstorypattern::PartVariable | pv.oclIsKindOf(componentstorypattern::FadingComponentPartVariable))->asOrderedSet()\r\n" +
		"  in fadingComponentPartVariables->size() = 1";

	/**
	 * Validates the ContainsExactlyOneFadingComponentPartVariable constraint of '<em>Controller Exchange Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExchangeNode_ContainsExactlyOneFadingComponentPartVariable(ControllerExchangeNode controllerExchangeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE,
				 controllerExchangeNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ContainsExactlyOneFadingComponentPartVariable",
				 CONTROLLER_EXCHANGE_NODE__CONTAINS_EXACTLY_ONE_FADING_COMPONENT_PART_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendReconfigurationMessageExpression(SendReconfigurationMessageExpression sendReconfigurationMessageExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendReconfigurationMessageExpression, diagnostics, context);
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

} //ComponentstorydiagramValidator
