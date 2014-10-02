/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.util;

import de.uni_paderborn.fujaba.muml.verification.sdd.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram;
import de.uni_paderborn.fujaba.muml.verification.sdd.Edge;
import de.uni_paderborn.fujaba.muml.verification.sdd.EdgeType;
import de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.Node;
import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType;
import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage
 * @generated
 */
public class SDDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SDDValidator INSTANCE = new SDDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.verification.sdd";

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
	public SDDValidator() {
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
	  return SDDPackage.eINSTANCE;
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
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM:
				return validateAbstractStoryDecisionDiagram((AbstractStoryDecisionDiagram)value, diagnostics, context);
			case SDDPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case SDDPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case SDDPackage.LEAF_NODE:
				return validateLeafNode((LeafNode)value, diagnostics, context);
			case SDDPackage.PATTERN_NODE:
				return validatePatternNode((PatternNode)value, diagnostics, context);
			case SDDPackage.EDGE_TYPE:
				return validateEdgeType((EdgeType)value, diagnostics, context);
			case SDDPackage.PATTERN_NODE_TYPE:
				return validatePatternNodeType((PatternNodeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractStoryDecisionDiagram(AbstractStoryDecisionDiagram abstractStoryDecisionDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractStoryDecisionDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractStoryDecisionDiagram_oneRootNode(abstractStoryDecisionDiagram, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneRootNode constraint of '<em>Abstract Story Decision Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_STORY_DECISION_DIAGRAM__ONE_ROOT_NODE__EEXPRESSION = "nodes->size()>0 implies nodes->select(e|e.incomingEdges->size()=0)->size()=1";

	/**
	 * Validates the oneRootNode constraint of '<em>Abstract Story Decision Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractStoryDecisionDiagram_oneRootNode(AbstractStoryDecisionDiagram abstractStoryDecisionDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.ABSTRACT_STORY_DECISION_DIAGRAM,
				 abstractStoryDecisionDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneRootNode",
				 ABSTRACT_STORY_DECISION_DIAGRAM__ONE_ROOT_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateEdge_noSelfEdge(edge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noSelfEdge constraint of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EDGE__NO_SELF_EDGE__EEXPRESSION = "sourceNode <> targetNode";

	/**
	 * Validates the noSelfEdge constraint of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge_noSelfEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.EDGE,
				 edge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noSelfEdge",
				 EDGE__NO_SELF_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeafNode(LeafNode leafNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leafNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(leafNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeafNode_noOutgoingEdge(leafNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noOutgoingEdge constraint of '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LEAF_NODE__NO_OUTGOING_EDGE__EEXPRESSION = "outgoingEdges->size()=0";

	/**
	 * Validates the noOutgoingEdge constraint of '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeafNode_noOutgoingEdge(LeafNode leafNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.LEAF_NODE,
				 leafNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noOutgoingEdge",
				 LEAF_NODE__NO_OUTGOING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNode(PatternNode patternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patternNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternNode_noNegativeObjects(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternNode_noLinkModifications(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternNode_noNegativeLinks(patternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternNode_noObjectModifications(patternNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noNegativeObjects constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PATTERN_NODE__NO_NEGATIVE_OBJECTS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(sdmp::ObjectVariable)).oclAsType(sdmp::ObjectVariable)->forAll(bindingSemantics = sdmp::BindingSemantics::MANDATORY)";

	/**
	 * Validates the noNegativeObjects constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNode_noNegativeObjects(PatternNode patternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.PATTERN_NODE,
				 patternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noNegativeObjects",
				 PATTERN_NODE__NO_NEGATIVE_OBJECTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noLinkModifications constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PATTERN_NODE__NO_LINK_MODIFICATIONS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(sdmp::LinkVariable))->forAll(bindingOperator = sdmp::BindingOperator::CHECK_ONLY)";

	/**
	 * Validates the noLinkModifications constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNode_noLinkModifications(PatternNode patternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.PATTERN_NODE,
				 patternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noLinkModifications",
				 PATTERN_NODE__NO_LINK_MODIFICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noNegativeLinks constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PATTERN_NODE__NO_NEGATIVE_LINKS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(sdmp::LinkVariable))->forAll(bindingSemantics = sdmp::BindingSemantics::MANDATORY)";

	/**
	 * Validates the noNegativeLinks constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNode_noNegativeLinks(PatternNode patternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.PATTERN_NODE,
				 patternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noNegativeLinks",
				 PATTERN_NODE__NO_NEGATIVE_LINKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noObjectModifications constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PATTERN_NODE__NO_OBJECT_MODIFICATIONS__EEXPRESSION = "(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(sdmp::ObjectVariable)).oclAsType(sdmp::ObjectVariable)->forAll(bindingOperator = sdmp::BindingOperator::CHECK_ONLY)";

	/**
	 * Validates the noObjectModifications constraint of '<em>Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNode_noObjectModifications(PatternNode patternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SDDPackage.Literals.PATTERN_NODE,
				 patternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noObjectModifications",
				 PATTERN_NODE__NO_OBJECT_MODIFICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeType(EdgeType edgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternNodeType(PatternNodeType patternNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //SDDValidator
