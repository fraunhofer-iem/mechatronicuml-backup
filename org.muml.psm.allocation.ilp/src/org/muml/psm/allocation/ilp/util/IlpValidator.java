/**
 */
package org.muml.psm.allocation.ilp.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.ILPDataType;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.ilp.IlpPackage
 * @generated
 */
public class IlpValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IlpValidator INSTANCE = new IlpValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.allocation.ilp";

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
	public IlpValidator() {
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
	  return IlpPackage.eINSTANCE;
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
			case IlpPackage.INTEGER_LINEAR_PROGRAM:
				return validateIntegerLinearProgram((IntegerLinearProgram)value, diagnostics, context);
			case IlpPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case IlpPackage.CONSTRAINT_EXPRESSION:
				return validateConstraintExpression((ConstraintExpression)value, diagnostics, context);
			case IlpPackage.VARIABLE_EXPRESSION:
				return validateVariableExpression((VariableExpression)value, diagnostics, context);
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION:
				return validateObjectiveFunctionExpression((ObjectiveFunctionExpression)value, diagnostics, context);
			case IlpPackage.ILP_DATA_TYPE:
				return validateILPDataType((ILPDataType)value, diagnostics, context);
			case IlpPackage.OBJECTIVE_GOAL:
				return validateObjectiveGoal((ObjectiveGoal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLinearProgram(IntegerLinearProgram integerLinearProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerLinearProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintExpression(ConstraintExpression constraintExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraintExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraintExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraintExpression_ValidOperator(constraintExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidOperator constraint of '<em>Constraint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINT_EXPRESSION__VALID_OPERATOR__EEXPRESSION = "-- Invalid comparison operator (allowed <, <=, =, >=, >)\n" +
		"Set{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL, core::expressions::common::ComparingOperator::EQUAL, core::expressions::common::ComparingOperator::GREATER_OR_EQUAL, core::expressions::common::ComparingOperator::GREATER}->includes(operator)";

	/**
	 * Validates the ValidOperator constraint of '<em>Constraint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintExpression_ValidOperator(ConstraintExpression constraintExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(IlpPackage.Literals.CONSTRAINT_EXPRESSION,
				 constraintExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidOperator",
				 CONSTRAINT_EXPRESSION__VALID_OPERATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableExpression(VariableExpression variableExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveFunctionExpression(ObjectiveFunctionExpression objectiveFunctionExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectiveFunctionExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILPDataType(ILPDataType ilpDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveGoal(ObjectiveGoal objectiveGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //IlpValidator
