/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.util;

import de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.*;

import de.uni_paderborn.fujaba.muml.verification.sdd.util.SDDValidator;

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
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD";

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
	 * Validates the noNegativeObjects constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noNegativeObjects(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "noNegativeObjects", getObjectLabel(storyPatternNode, context) },
						 new Object[] { storyPatternNode },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the noLinkModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noLinkModifications(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "noLinkModifications", getObjectLabel(storyPatternNode, context) },
						 new Object[] { storyPatternNode },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the noNegativeLinks constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noNegativeLinks(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "noNegativeLinks", getObjectLabel(storyPatternNode, context) },
						 new Object[] { storyPatternNode },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the noObjectModifications constraint of '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryPatternNode_noObjectModifications(StoryPatternNode storyPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "noObjectModifications", getObjectLabel(storyPatternNode, context) },
						 new Object[] { storyPatternNode },
						 context));
			}
			return false;
		}
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

} //BasicSDDValidator
