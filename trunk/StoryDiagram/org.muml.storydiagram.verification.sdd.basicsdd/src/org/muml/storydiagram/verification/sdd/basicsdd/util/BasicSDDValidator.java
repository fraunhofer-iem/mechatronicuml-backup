/**
 */
package org.muml.storydiagram.verification.sdd.basicsdd.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.storydiagram.verification.sdd.basicsdd.*;
import org.muml.storydiagram.verification.sdd.util.SDDValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage
 * @generated
 */
public class BasicSDDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicSDDValidator INSTANCE = new BasicSDDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.storydiagram.verification.sdd.basicsdd";

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
	protected SDDValidator sddValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSDDValidator() {
		super();
		sddValidator = SDDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BasicSDDPackage.eINSTANCE;
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
			case BasicSDDPackage.STORY_DECISION_DIAGRAM:
				return validateStoryDecisionDiagram((StoryDecisionDiagram)value, diagnostics, context);
			case BasicSDDPackage.STORY_PATTERN_NODE:
				return validateStoryPatternNode((StoryPatternNode)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryDecisionDiagram(StoryDecisionDiagram storyDecisionDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storyDecisionDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storyDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= sddValidator.validateAbstractStoryDecisionDiagram_oneRootNode(storyDecisionDiagram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storyPatternNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoryPatternNode_noNegativeObjects(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoryPatternNode_noLinkModifications(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoryPatternNode_noNegativeLinks(storyPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoryPatternNode_noObjectModifications(storyPatternNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noNegativeObjects constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORY_PATTERN_NODE__NO_NEGATIVE_OBJECTS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(storydiagrams::patterns::ObjectVariable)).oclAsType(storydiagrams::patterns::ObjectVariable)->forAll(oV | oV.bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)";

	/**
	 * Validates the noNegativeObjects constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noNegativeObjects(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicSDDPackage.Literals.STORY_PATTERN_NODE,
				 storyPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noNegativeObjects",
				 STORY_PATTERN_NODE__NO_NEGATIVE_OBJECTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noLinkModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORY_PATTERN_NODE__NO_LINK_MODIFICATIONS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(storydiagrams::patterns::LinkVariable))->forAll(lV | lV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)";

	/**
	 * Validates the noLinkModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noLinkModifications(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicSDDPackage.Literals.STORY_PATTERN_NODE,
				 storyPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noLinkModifications",
				 STORY_PATTERN_NODE__NO_LINK_MODIFICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noNegativeLinks constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORY_PATTERN_NODE__NO_NEGATIVE_LINKS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(storydiagrams::patterns::LinkVariable))->forAll(bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)";

	/**
	 * Validates the noNegativeLinks constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noNegativeLinks(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicSDDPackage.Literals.STORY_PATTERN_NODE,
				 storyPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noNegativeLinks",
				 STORY_PATTERN_NODE__NO_NEGATIVE_LINKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noObjectModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORY_PATTERN_NODE__NO_OBJECT_MODIFICATIONS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(storydiagrams::patterns::ObjectVariable)).oclAsType(storydiagrams::patterns::ObjectVariable)->forAll(oV |oV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)";

	/**
	 * Validates the noObjectModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noObjectModifications(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicSDDPackage.Literals.STORY_PATTERN_NODE,
				 storyPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noObjectModifications",
				 STORY_PATTERN_NODE__NO_OBJECT_MODIFICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //BasicSDDValidator
