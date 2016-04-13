/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.valuetype.util;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.valuetype.*;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.Range;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.valuetype.ValuetypePackage
 */
public class ValuetypeValidator extends MumlValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ValuetypeValidator INSTANCE = new ValuetypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.valuetype";

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
	public ValuetypeValidator() {
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
	  return ValuetypePackage.eINSTANCE;
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
			case ValuetypePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case ValuetypePackage.TIME_VALUE:
				return validateTimeValue((TimeValue)value, diagnostics, context);
			case ValuetypePackage.NATURAL_NUMBER:
				return validateNaturalNumber((NaturalNumber)value, diagnostics, context);
			case ValuetypePackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case ValuetypePackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			default:
				return true;
		}
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
	protected static final String CARDINALITY__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION = "-- lower bound of cardinality must be less or equal than upper bound\r\n" +
		"(not self.lowerBound.oclIsUndefined() and not self.upperBound.oclIsUndefined()) implies\n" +
		"(\n" +
		"\t((not self.lowerBound.infinity and not self.upperBound.infinity) implies (self.lowerBound.value <= self.upperBound.value))\r\n" +
		"\tand (self.lowerBound.infinity implies self.upperBound.infinity)\n" +
		")";

	/**
	 * Validates the LowerBoundMustBeLessOrEqualThanUpperBound constraint of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality_LowerBoundMustBeLessOrEqualThanUpperBound(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuetypePackage.Literals.CARDINALITY,
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
	public boolean validateTimeValue(TimeValue timeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeValue_LiteralExpressionMustBeANaturalNumber(timeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeValue_NestedTimeValuesMustDefineEqualTimeUnits(timeValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LiteralExpressionMustBeANaturalNumber constraint of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_VALUE__LITERAL_EXPRESSION_MUST_BE_ANATURAL_NUMBER__EEXPRESSION = "-- If a TimeValue has as value a LiteralExpression, it must be a natural number.\r\n" +
		"-- 1. Check if the LiteralExpression can be cast to an Integer\r\n" +
		"-- 2. Check if this Integer is greater or equal to zero.\r\n" +
		"\r\n" +
		"(\r\n" +
		"not self.value.oclIsUndefined()\r\n" +
		"and \r\n" +
		"self.value.oclIsKindOf(core::expressions::common::LiteralExpression)\r\n" +
		")\r\n" +
		"implies\r\n" +
		"(\r\n" +
		"not self.value.oclAsType(core::expressions::common::LiteralExpression).value.toInteger().oclIsUndefined()\r\n" +
		"and \r\n" +
		"self.value.oclAsType(core::expressions::common::LiteralExpression).value.toInteger()>=0\r\n" +
		")\r\n" +
		"-- author: xell\r\n" +
		"-- ticket: 770";

	/**
	 * Validates the LiteralExpressionMustBeANaturalNumber constraint of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeValue_LiteralExpressionMustBeANaturalNumber(TimeValue timeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuetypePackage.Literals.TIME_VALUE,
				 timeValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LiteralExpressionMustBeANaturalNumber",
				 TIME_VALUE__LITERAL_EXPRESSION_MUST_BE_ANATURAL_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NestedTimeValuesMustDefineEqualTimeUnits constraint of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_VALUE__NESTED_TIME_VALUES_MUST_DEFINE_EQUAL_TIME_UNITS__EEXPRESSION = "-- Nested TimeValues must use equal time units\r\n" +
		"self.eContents()->closure(element| element.oclAsType(ecore::EObject).eContents()->union(element.oclAsType(ecore::EObject).eCrossReferences()))->forAll(element| element.oclIsTypeOf(valuetype::TimeValue) implies element.oclAsType(valuetype::TimeValue).unit = self.unit)";

	/**
	 * Validates the NestedTimeValuesMustDefineEqualTimeUnits constraint of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeValue_NestedTimeValuesMustDefineEqualTimeUnits(TimeValue timeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuetypePackage.Literals.TIME_VALUE,
				 timeValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NestedTimeValuesMustDefineEqualTimeUnits",
				 TIME_VALUE__NESTED_TIME_VALUES_MUST_DEFINE_EQUAL_TIME_UNITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalNumber(NaturalNumber naturalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(naturalNumber, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(naturalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaturalNumber_ValueGreaterOrEqualZero(naturalNumber, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValueGreaterOrEqualZero constraint of '<em>Natural Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NATURAL_NUMBER__VALUE_GREATER_OR_EQUAL_ZERO__EEXPRESSION = "-- Natural number must not be negative\n" +
		"self.value >= 0";

	/**
	 * Validates the ValueGreaterOrEqualZero constraint of '<em>Natural Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalNumber_ValueGreaterOrEqualZero(NaturalNumber naturalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuetypePackage.Literals.NATURAL_NUMBER,
				 naturalNumber,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValueGreaterOrEqualZero",
				 NATURAL_NUMBER__VALUE_GREATER_OR_EQUAL_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(range, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(range, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(range, diagnostics, context);
		if (result || diagnostics != null) result &= validateRange_LowerBoundMustBeLessOrEqualThanUpperBound(range, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LowerBoundMustBeLessOrEqualThanUpperBound constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RANGE__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION = "-- lower bound of range must be less or equal than upper bound\r\n" +
		"self.lowerBound <= self.upperBound";

	/**
	 * Validates the LowerBoundMustBeLessOrEqualThanUpperBound constraint of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange_LowerBoundMustBeLessOrEqualThanUpperBound(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuetypePackage.Literals.RANGE,
				 range,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LowerBoundMustBeLessOrEqualThanUpperBound",
				 RANGE__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ValuetypeValidator
