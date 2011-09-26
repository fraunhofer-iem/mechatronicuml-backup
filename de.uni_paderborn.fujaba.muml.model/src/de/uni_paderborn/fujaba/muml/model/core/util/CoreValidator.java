/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core.util;

import de.uni_paderborn.fujaba.muml.model.core.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.core.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.Infinity;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.core";

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
	public CoreValidator() {
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
	  return CorePackage.eINSTANCE;
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
			case CorePackage.NATURAL_NUMBER:
				return validateNaturalNumber((NaturalNumber)value, diagnostics, context);
			case CorePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case CorePackage.INFINITY:
				return validateInfinity((Infinity)value, diagnostics, context);
			case CorePackage.BEHAVIORAL_ELEMENT:
				return validateBehavioralElement((BehavioralElement)value, diagnostics, context);
			case CorePackage.CONSTRAINABLE_ELEMENT:
				return validateConstrainableElement((ConstrainableElement)value, diagnostics, context);
			case CorePackage.ABSTRACT_REALTIME_STATECHART:
				return validateAbstractRealtimeStatechart((AbstractRealtimeStatechart)value, diagnostics, context);
			case CorePackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case CorePackage.ACTIVITY_CALL_EXPRESSION:
				return validateActivityCallExpression((ActivityCallExpression)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalNumber(NaturalNumber naturalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naturalNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateCardinality_LowerBoundMustBeLessOrEqualThanUpperBound(cardinality, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LowerBoundMustBeLessOrEqualThanUpperBound constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CARDINALITY__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION = "((self.lowerBound.value <= self.upperBound.value) and self.lowerBound.infinity=false and self.upperBound.infinity=false) or (self.lowerBound.infinity=true and self.upperBound.infinity=true)";

	/**
	 * Validates the LowerBoundMustBeLessOrEqualThanUpperBound constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality_LowerBoundMustBeLessOrEqualThanUpperBound(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.CARDINALITY,
				 cardinality,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LowerBoundMustBeLessOrEqualThanUpperBound",
				 CARDINALITY__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfinity(Infinity infinity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infinity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralElement(BehavioralElement behavioralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavioralElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainableElement(ConstrainableElement constrainableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRealtimeStatechart(AbstractRealtimeStatechart abstractRealtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRealtimeStatechart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityCallExpression(ActivityCallExpression activityCallExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityCallExpression, diagnostics, context);
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

} //CoreValidator
