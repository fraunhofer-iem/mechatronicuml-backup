/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage
 * @generated
 */
public class ControlflowValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ControlflowValidator INSTANCE = new ControlflowValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow";

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
	public ControlflowValidator() {
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
	  return ControlflowPackage.eINSTANCE;
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
			case ControlflowPackage.COMPONENT_STORY_RULE:
				return validateComponentStoryRule((ComponentStoryRule)value, diagnostics, context);
			case ControlflowPackage.COMPONENT_STORY_NODE:
				return validateComponentStoryNode((ComponentStoryNode)value, diagnostics, context);
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE:
				return validateControllerExchangeNode((ControllerExchangeNode)value, diagnostics, context);
			case ControlflowPackage.CONTROLLER_EXCHANGE_STRATEGY:
				return validateControllerExchangeStrategy((ControllerExchangeStrategy)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateComponentStoryRule_AllThisVariablesHaveSameType(componentStoryRule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllThisVariablesHaveSameType constraint of '<em>Component Story Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_STORY_RULE__ALL_THIS_VARIABLES_HAVE_SAME_TYPE__EEXPRESSION = "if not self.activity.oclIsUndefined() then\r\n" +
		"\tself.activity.oclAsType(storydiagrams::activities::Activity).ownedActivityNode->collect(oclAsType(ComponentStoryNode).componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).type)->asSet()->size() = 1\r\n" +
		"else\r\n" +
		"\tfalse\r\n" +
		"endif";

	/**
	 * Validates the AllThisVariablesHaveSameType constraint of '<em>Component Story Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryRule_AllThisVariablesHaveSameType(ComponentStoryRule componentStoryRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ControlflowPackage.Literals.COMPONENT_STORY_RULE,
				 componentStoryRule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllThisVariablesHaveSameType",
				 COMPONENT_STORY_RULE__ALL_THIS_VARIABLES_HAVE_SAME_TYPE__EEXPRESSION,
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
		return validate_EveryDefaultConstraint(controllerExchangeNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExchangeStrategy(ControllerExchangeStrategy controllerExchangeStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ControlflowValidator
