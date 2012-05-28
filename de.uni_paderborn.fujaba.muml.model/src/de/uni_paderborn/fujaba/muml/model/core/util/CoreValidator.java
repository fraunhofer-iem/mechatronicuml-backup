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

import de.uni_paderborn.fujaba.muml.model.core.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.model.core.ArrayDataType;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.CompositeDataType;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.DataType;
import de.uni_paderborn.fujaba.muml.model.core.InnerDeclaration;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.core.Operation;
import de.uni_paderborn.fujaba.muml.model.core.Parameter;
import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.core.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.model.core.PrimitiveTypes;

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
			case CorePackage.BEHAVIORAL_ELEMENT:
				return validateBehavioralElement((BehavioralElement)value, diagnostics, context);
			case CorePackage.CONSTRAINABLE_ELEMENT:
				return validateConstrainableElement((ConstrainableElement)value, diagnostics, context);
			case CorePackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case CorePackage.ACTIVITY_CALL_EXPRESSION:
				return validateActivityCallExpression((ActivityCallExpression)value, diagnostics, context);
			case CorePackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case CorePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case CorePackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case CorePackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case CorePackage.PRIMITIVE_DATA_TYPE:
				return validatePrimitiveDataType((PrimitiveDataType)value, diagnostics, context);
			case CorePackage.COMPOSITE_DATA_TYPE:
				return validateCompositeDataType((CompositeDataType)value, diagnostics, context);
			case CorePackage.ARRAY_DATA_TYPE:
				return validateArrayDataType((ArrayDataType)value, diagnostics, context);
			case CorePackage.INNER_DECLARATION:
				return validateInnerDeclaration((InnerDeclaration)value, diagnostics, context);
			case CorePackage.PARAMETER_BINDING:
				return validateParameterBinding((ParameterBinding)value, diagnostics, context);
			case CorePackage.PRIMITIVE_TYPES:
				return validatePrimitiveTypes((PrimitiveTypes)value, diagnostics, context);
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
	protected static final String NATURAL_NUMBER__VALUE_GREATER_OR_EQUAL_ZERO__EEXPRESSION = "self.value >= 0";

	/**
	 * Validates the ValueGreaterOrEqualZero constraint of '<em>Natural Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalNumber_ValueGreaterOrEqualZero(NaturalNumber naturalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.NATURAL_NUMBER,
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
	protected static final String CARDINALITY__LOWER_BOUND_MUST_BE_LESS_OR_EQUAL_THAN_UPPER_BOUND__EEXPRESSION = "((not self.lowerBound.infinity and not self.upperBound.infinity) implies (self.lowerBound.value <= self.upperBound.value))\n" +
		"and (self.lowerBound.infinity implies self.upperBound.infinity)";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataType(PrimitiveDataType primitiveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataType(CompositeDataType compositeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDataType(ArrayDataType arrayDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerDeclaration(InnerDeclaration innerDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterBinding(ParameterBinding parameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveTypes(PrimitiveTypes primitiveTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CoreValidator
