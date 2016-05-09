/**
 */
package org.muml.graphviz.dot.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.muml.graphviz.dot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.graphviz.dot.DotPackage
 * @generated
 */
public class DotValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DotValidator INSTANCE = new DotValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.graphviz.dot";

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
	public DotValidator() {
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
	  return DotPackage.eINSTANCE;
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
			case DotPackage.DOT_GRAPH:
				return validateDotGraph((DotGraph)value, diagnostics, context);
			case DotPackage.DOT_NODE:
				return validateDotNode((DotNode)value, diagnostics, context);
			case DotPackage.DOT_EDGE:
				return validateDotEdge((DotEdge)value, diagnostics, context);
			case DotPackage.SETTING:
				return validateSetting((Setting)value, diagnostics, context);
			case DotPackage.DIRECTED_DOT_EDGE:
				return validateDirectedDotEdge((DirectedDotEdge)value, diagnostics, context);
			case DotPackage.UNDIRECTED_DOT_EDGE:
				return validateUndirectedDotEdge((UndirectedDotEdge)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotGraph(DotGraph dotGraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dotGraph, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dotGraph, diagnostics, context);
		if (result || diagnostics != null) result &= validateDotGraph_validId(dotGraph, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validId constraint of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOT_GRAPH__VALID_ID__EEXPRESSION = "not self.id.oclIsUndefined() and (\n" +
		"\tself.id.size() >= 7 implies self.id.substring(1, 7).toLowerCase() <> 'cluster'\n" +
		")";

	/**
	 * Validates the validId constraint of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotGraph_validId(DotGraph dotGraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DotPackage.Literals.DOT_GRAPH,
				 dotGraph,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "validId",
				 DOT_GRAPH__VALID_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotNode(DotNode dotNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dotNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotEdge(DotEdge dotEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dotEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetting(Setting setting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedDotEdge(DirectedDotEdge directedDotEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedDotEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndirectedDotEdge(UndirectedDotEdge undirectedDotEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(undirectedDotEdge, diagnostics, context);
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

} //DotValidator
