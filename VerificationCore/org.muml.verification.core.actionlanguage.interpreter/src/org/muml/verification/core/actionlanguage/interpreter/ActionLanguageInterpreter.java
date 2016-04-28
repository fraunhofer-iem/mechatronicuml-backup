package org.muml.verification.core.actionlanguage.interpreter;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.TextualExpression;
import org.muml.mumlcore.expressions.common.ArithmeticExpression;
import org.muml.mumlcore.expressions.common.ArithmeticOperator;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.mumlcore.expressions.common.ComparisonExpression;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.mumlcore.expressions.common.LogicOperator;
import org.muml.mumlcore.expressions.common.LogicalExpression;
import org.muml.mumlcore.expressions.common.UnaryExpression;
import org.muml.mumlcore.expressions.common.UnaryOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.DoWhileLoop;
import org.muml.pim.actionlanguage.ElseIfStatement;
import org.muml.pim.actionlanguage.ForLoop;
import org.muml.pim.actionlanguage.IfStatement;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.actionlanguage.OperationCall;
import org.muml.pim.actionlanguage.ReturnStatement;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.actionlanguage.WhileLoop;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import org.muml.verification.core.runtime.VariableBinding;

public class ActionLanguageInterpreter {

	private TypesFactory typeFactory;

	public ActionLanguageInterpreter() {
		typeFactory = TypesFactory.eINSTANCE;

	}

	/**
	 * Modifies variableBindings with respect to expression
	 * 
	 * @param variableBindings
	 * @param expression
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
	public Object evaluateExpression(EList<VariableBinding> variableBindings,
			Expression expression) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings = new HashSet<LocalVariableAndParameterBinding>();
		return evaluate(variableBindings, parAndLocVarBindings, expression);

	}

	/**
	 * Calls evaluate method (corresponding to type of expression) that modifies
	 * the variable bindings
	 * 
	 * @param variableBindings
	 * @param parAndLocVarBindings
	 *            Binding of local variables and parameters to values
	 * @param expression
	 * @return
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			Expression expression) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		HashSet<LocalVariableAndParameterBinding> newParAndLocVarBindings = new HashSet<LocalVariableAndParameterBinding>();
		newParAndLocVarBindings.addAll(parAndLocVarBindings);
		// newParAndLocVarBindings.

		if (expression instanceof UnaryExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(UnaryExpression) expression);
		else if (expression instanceof ComparisonExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(ComparisonExpression) expression);
		else if (expression instanceof ArithmeticExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(ArithmeticExpression) expression);
		else if (expression instanceof LogicalExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(LogicalExpression) expression);
		else if (expression instanceof LiteralExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(LiteralExpression) expression);
		else if (expression instanceof Block)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(Block) expression);
		else if (expression instanceof WhileLoop)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(WhileLoop) expression);
		else if (expression instanceof DoWhileLoop)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(DoWhileLoop) expression);
		else if (expression instanceof Assignment)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(Assignment) expression);

		else if (expression instanceof ForLoop)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(ForLoop) expression);
		else if (expression instanceof IfStatement)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(IfStatement) expression);
		else if (expression instanceof OperationCall)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(OperationCall) expression);
		else if (expression instanceof ReturnStatement)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(ReturnStatement) expression);
		else if (expression instanceof TypedNamedElementExpression)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(TypedNamedElementExpression) expression);
		else if (expression instanceof LocalVariableDeclarationStatement)
			return evaluate(variableBindings, newParAndLocVarBindings,
					(LocalVariableDeclarationStatement) expression);

		throw new UnsupportedModellingElementException("Expressions of type "
				+ expression.eClass().getName() + " are not yet supported");
	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			UnaryExpression unaryExpression)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		double value;
		TypedNamedElement element;
		DataType doubleType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);

		DataType boolType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);
		switch (unaryExpression.getOperator().getValue()) {
		case UnaryOperator.DECREMENT_VALUE:
			value = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							unaryExpression.getEnclosedExpression()));
			value = value - 1;

			element = null;
			if (unaryExpression.getEnclosedExpression() instanceof TypedNamedElementExpression)
				element = ((TypedNamedElementExpression) unaryExpression
						.getEnclosedExpression()).getTypedNamedElement();
			else
				throw new UnsupportedModellingElementException(
						unaryExpression.toString()
								+ " does not have a typedNamedElementExpression as enclosedExpression. This is not yet supported");
			// search for variable in local variables/parameters
			for (LocalVariableAndParameterBinding curBinding : parAndLocVarBindings) {
				if (curBinding.getTypedNamedElement().equals(element)) {

					// found binding -> assign new value
					curBinding.setValue(castTo(element.getDataType(), value));
					return value;
				}
			}

			// search for variable in variable bindings
			if (element instanceof Variable) {
				Variable variable = (Variable) element;
				for (VariableBinding curVarBinding : variableBindings) {
					if (curVarBinding.getVariable().equals(variable)) {
						curVarBinding.setValue(castTo(variable.getDataType(),
								value));
						return value;
					}
				}
			}
			throw new VariableNotInitializedException(element.toString()
					+ " not declared and/or intitialized");

		case UnaryOperator.INCREMENT_VALUE:
			value = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							unaryExpression.getEnclosedExpression()));
			value = value + 1;

			element = null;
			if (unaryExpression.getEnclosedExpression() instanceof TypedNamedElementExpression)
				element = ((TypedNamedElementExpression) unaryExpression
						.getEnclosedExpression()).getTypedNamedElement();
			else
				throw new UnsupportedModellingElementException(
						unaryExpression.toString()
								+ " does not have a typedNamedElementExpression as enclosedExpression. This is not yet supported");
			// search for variable in local variables/parameters
			for (LocalVariableAndParameterBinding curBinding : parAndLocVarBindings) {
				if (curBinding.getTypedNamedElement().equals(element)) {

					// found binding -> assign new value
					curBinding.setValue(castTo(element.getDataType(), value));
					return value;
				}
			}

			// search for variable in variable bindings
			if (element instanceof Variable) {
				Variable variable = (Variable) element;
				for (VariableBinding curVarBinding : variableBindings) {
					if (curVarBinding.getVariable().equals(variable)) {
						curVarBinding.setValue(castTo(variable.getDataType(),
								value));
						return value;
					}
				}
			}
			throw new VariableNotInitializedException(element.toString()
					+ " not declared and/or intitialized");

			// TODO assign value here?
		case UnaryOperator.MINUS_VALUE:
			value = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							unaryExpression.getEnclosedExpression()));
			return (value * -1);

		case UnaryOperator.NOT_VALUE:

			return !((Boolean) castTo(
					boolType,
					evaluate(variableBindings, parAndLocVarBindings,
							unaryExpression.getEnclosedExpression())));
		default:
			throw new UnsupportedModellingElementException("Operator"
					+ unaryExpression.getOperator().toString()
					+ " is not supported for unary expressions");
		}

	}

	/**
	 * Evaluates if comparisonExpression is true with respect to
	 * variableBindings
	 * 
	 * @param variableBindings
	 * @param comparisonExpression
	 * @return
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
	protected Boolean evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			ComparisonExpression comparisonExpression)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		DataType doubleType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);
		double lhe, rhe;
		boolean result;

		switch (comparisonExpression.getOperator().getValue()) {
		case ComparingOperator.EQUAL_VALUE:
			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe == rhe;
			return result;

		case ComparingOperator.GREATER_OR_EQUAL_VALUE:
			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe >= rhe;
			return result;

		case ComparingOperator.GREATER_VALUE:
			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe > rhe;
			return result;

		case ComparingOperator.LESS_OR_EQUAL_VALUE:
			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe <= rhe;
			return result;

		case ComparingOperator.LESS_VALUE:
			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe < rhe;
			return result;

		case ComparingOperator.REGULAR_EXPRESSION_VALUE:
			throw new UnsupportedModellingElementException("Operator "
					+ ComparingOperator.REGULAR_EXPRESSION.toString()
					+ " is not yet supported");

		case ComparingOperator.UNEQUAL_VALUE:

			lhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()));
			rhe = (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));
			result = lhe != rhe;
			return result;

		default:
			throw new UnsupportedModellingElementException("Operator"
					+ comparisonExpression.getOperator().toString()
					+ " is not supported for comparison expressions");
		}

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			ArithmeticExpression arithmeticExpression)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		DataType doubleType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);

		switch (arithmeticExpression.getOperator().getValue()) {
		case ArithmeticOperator.DIVIDE_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getLeftExpression())) / (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.MINUS_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getLeftExpression())) - (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.MODULO_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getLeftExpression())) % (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.PLUS_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getLeftExpression())) + (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.TIMES_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getLeftExpression())) * (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							arithmeticExpression.getRightExpression())));

		default:
			throw new UnsupportedModellingElementException("Operator "
					+ arithmeticExpression.getOperator().toString()
					+ "is not supported for arithmetic expressions");

		}

	}

	protected Boolean evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			LogicalExpression logicalExpression)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		switch (logicalExpression.getOperator().getValue()) {

		case LogicOperator.AND_VALUE:
			return (Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression())
					&& (Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression());
			
		case LogicOperator.EQUIVALENT_VALUE:
			return !((Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression()))
					&& !((Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression()))
					|| (Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getLeftExpression())
					&& (Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression());

		case LogicOperator.IMPLY_VALUE:
			return !((Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression()))
					|| ((Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getLeftExpression()))
					&& ((Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression()));

		case LogicOperator.OR_VALUE:
			return (Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression())
					|| (Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression());

		case LogicOperator.XOR_VALUE:
			return (Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression())
					^ (Boolean) evaluate(variableBindings,
							parAndLocVarBindings,
							logicalExpression.getRightExpression());
		default:
			throw new UnsupportedModellingElementException("Operator "
					+ logicalExpression.getOperator().toString()
					+ " is not supported for logic expressions");
		}

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			LiteralExpression literalExpression) {

		try {
			// check if literalExpression is a boolean
			if (literalExpression.getValue().equals("true"))
				return true;
			if (literalExpression.getValue().equals("false"))
				return false;

			// check if literalExpression is a double
			for (int i = 0; i < literalExpression.getValue().length(); i++) {
				if (literalExpression.getValue().charAt(i) == '.') {
					double d = Double.parseDouble(literalExpression.getValue());

					// return double
					return d;
				}
			}

			// try to cast to long

			long l = Long.parseLong(literalExpression.getValue());
			return l;

			// if NumberFormatException occurs we assume String
		} catch (NumberFormatException e) {
			return literalExpression.getValue();
		}

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			Block block) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		Iterator<Expression> expIterator = block.getExpressions().iterator();
		while (expIterator.hasNext()) {
			Expression nextExpression = expIterator.next();
			if (nextExpression instanceof ReturnStatement) {
				return evaluate(variableBindings, parAndLocVarBindings,
						nextExpression);
			}
			// evaluate LocalVariableDeclarationStatement without creating new
			// parAndLocVarBindingss, therefore new local variable will be
			// accessible in this block
			else if (nextExpression instanceof LocalVariableDeclarationStatement)
				evaluate(variableBindings, parAndLocVarBindings,
						(LocalVariableDeclarationStatement) nextExpression);
			else
				evaluate(variableBindings, parAndLocVarBindings, nextExpression);

		}

		// nothing to return
		return null;
	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			WhileLoop whileLoop) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		while ((Boolean) evaluate(variableBindings, parAndLocVarBindings,
				whileLoop.getLoopTest()))
			evaluate(variableBindings, parAndLocVarBindings,
					whileLoop.getBlock());

		return null;
	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			DoWhileLoop doWhileLoop)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		do
			evaluate(variableBindings, parAndLocVarBindings,
					doWhileLoop.getBlock());
		while ((Boolean) evaluate(variableBindings, parAndLocVarBindings,
				doWhileLoop.getLoopTest()));
		return null;
	}

	/**
	 * Modifies variableBindings with respect to assignment
	 * 
	 * @param variableBindings
	 * @param assignment
	 * @return
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			Assignment assignment) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		if (assignment.getLhs_typedNamedElementExpression() == null
				|| assignment.getLhs_typedNamedElementExpression()
						.getTypedNamedElement() == null)
			throw new IllegalArgumentException("No LHS specified in "
					+ assignment.toString());

		TypedNamedElement element = assignment
				.getLhs_typedNamedElementExpression().getTypedNamedElement();

		if (!(element instanceof Variable) && !(element instanceof Parameter)) {
			throw new UnsupportedModellingElementException(
					"Cannot assign values to " + element.toString());
		}

		// get new value
		Object value = evaluate(variableBindings, parAndLocVarBindings,
				assignment.getRhs_assignExpression());

		// search for variable in local variables/parameters
		for (LocalVariableAndParameterBinding curBinding : parAndLocVarBindings) {
			if (curBinding.getTypedNamedElement().equals(element)) {

				// found binding -> assign new value
				curBinding.setValue(castTo(element.getDataType(), value));
				return null;
			}
		}

		// search for variable in variable bindings
		if (element instanceof Variable) {
			Variable variable = (Variable) element;
			for (VariableBinding curVarBinding : variableBindings) {
				if (curVarBinding.getVariable().equals(variable)) {
					curVarBinding
							.setValue(castTo(variable.getDataType(), value));
					return null;
				}
			}
		}

		throw new VariableNotInitializedException(element.toString()
				+ " not declared and/or intitialized");

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			ForLoop forLoop) throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		evaluate(variableBindings, parAndLocVarBindings,
				forLoop.getInitializeExpression());

		while ((Boolean) evaluate(variableBindings, parAndLocVarBindings,
				forLoop.getLoopTest())) {
			evaluate(variableBindings, parAndLocVarBindings, forLoop.getBlock());
			evaluate(variableBindings, parAndLocVarBindings,
					forLoop.getCountingExpression());
		}

		return null;

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			IfStatement ifStatement)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		boolean blockExecuted = false;
		DataType boolType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);

		if ((Boolean) castTo(
				boolType,
				evaluate(variableBindings, parAndLocVarBindings,
						ifStatement.getIfCondition()))) {
			evaluate(variableBindings, parAndLocVarBindings,
					ifStatement.getIfBlock());
			blockExecuted = true;
		}

		// if if-condition was not evaluated to true evaluate elseIf-conditions
		// and corresponding blocks
		if (!blockExecuted && ifStatement.getElseIfStatements() != null
				&& !ifStatement.getElseIfStatements().isEmpty()) {
			for (ElseIfStatement elseIfStatement : ifStatement.getElseIfStatements()) {
				if ((Boolean) castTo(
						boolType,
						evaluate(variableBindings, parAndLocVarBindings,
								elseIfStatement.getElseIfCondition()))) {
					evaluate(variableBindings, parAndLocVarBindings,
							elseIfStatement.getElseIfBlock());
					blockExecuted = true;
					break;
				}
				
			}
		}

		// if none of the blocks was evaluated evaluate else block
		if (!blockExecuted && ifStatement.getElseBlock() != null) {
			evaluate(variableBindings, parAndLocVarBindings,
					ifStatement.getElseBlock());

		}
		return null;
	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			OperationCall operationCall) throws IncompatibleTypeException,
			UnsupportedModellingElementException,
			VariableNotInitializedException {

		// HashMap initially only containing parameter referring to parameters
		// of this operationCall
		HashSet<LocalVariableAndParameterBinding> newParAndLocVarBindings = new HashSet<LocalVariableAndParameterBinding>();

		// check if all parameters are bound
		if (operationCall.getParameterBinding().size() != operationCall
				.getOperation().getParameters().size())
			throw new IncompatibleTypeException(
					"Wrong number of parameters in " + operationCall.toString());

		for (ParameterBinding parBinding : operationCall.getParameterBinding()) {
			// check data types of parameter values
			Object value = castTo(
					parBinding.getParameter().getDataType(),
					evaluate(variableBindings, parAndLocVarBindings,
							parBinding.getValue()));
			// add parameter binding
			newParAndLocVarBindings.add(new LocalVariableAndParameterBinding(
					parBinding.getParameter(), value));

		}

		if (operationCall.getOperation() == null)
			throw new IllegalArgumentException("Operation not set for "
					+ operationCall.toString());

		if (operationCall.getOperation().getReturnType() == null)
			throw new IllegalArgumentException("Return type not set for "
					+ operationCall.getOperation().toString());

		// operation with return value
		if (operationCall.getOperation().getReturnType() instanceof PrimitiveDataType
				&& !(((PrimitiveDataType) operationCall.getOperation()
						.getReturnType()).getPrimitiveType() == PrimitiveTypes.VOID)) {

			// evaluate
			for (Expression curImplementation : operationCall.getOperation()
					.getImplementations()) {
				// there is exactly one implementation that is not instance of
				// TextualExpression
				if (!(curImplementation instanceof TextualExpression)) {
					Object o = evaluate(variableBindings,
							newParAndLocVarBindings, curImplementation);

					return castTo(operationCall.getOperation().getReturnType(),
							o);
				}
			}
			throw new UnsupportedModellingElementException(
					"No supported implementation found for "
							+ operationCall.getOperation().toString());
		}

		else {

			// evaluate
			for (Expression curImplementation : operationCall.getOperation()
					.getImplementations()) {
				// there is exactly one implementation that is not instance of
				// TextualExpression
				if (!(curImplementation instanceof TextualExpression)) {
					evaluate(variableBindings, newParAndLocVarBindings,
							curImplementation);

					return null;
				}
			}
			throw new UnsupportedModellingElementException(
					"No supported implementation found for "
							+ operationCall.getOperation().toString());
		}

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			ReturnStatement returnStatement)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		Object o = evaluate(variableBindings, parAndLocVarBindings,
				returnStatement.getExpression());

		return o;
	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			TypedNamedElementExpression typedNamedElementExpression)
			throws VariableNotInitializedException {

		if (typedNamedElementExpression.getTypedNamedElement() == null)
			throw new IllegalArgumentException(
					"Reference to typed named element not set in "
							+ typedNamedElementExpression.toString());
		TypedNamedElement tne = typedNamedElementExpression
				.getTypedNamedElement();

		// search in local variable / parameter bindings
		for (LocalVariableAndParameterBinding curBinding : parAndLocVarBindings) {
			if (curBinding.getTypedNamedElement().equals(tne)) {
				if (curBinding.getValue() == null)
					throw new VariableNotInitializedException(tne.toString()
							+ " not initialized until execution of"
							+ typedNamedElementExpression.toString());
				return curBinding.getValue();
			}
		}

		if (tne instanceof Variable) {
			// search in variable bindings
			for (VariableBinding varBinding : variableBindings) {
				if (varBinding.getVariable().equals(tne)) {
					if (varBinding.getValue() == null)
//						throw new VariableNotInitializedException(
//								tne.toString()
//										+ " not initialized until execution of"
//										+ typedNamedElementExpression
//												.toString());
						return null;

					return varBinding.getValue();
				}
			}
		}

		throw new VariableNotInitializedException(tne.toString()
				+ " not declared until execution of"
				+ typedNamedElementExpression.toString());

	}

	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			LocalVariableDeclarationStatement localVariableDeclarationStatement)
			throws VariableNotInitializedException,
			UnsupportedModellingElementException, IncompatibleTypeException {

		Variable variable = localVariableDeclarationStatement.getVariable();
		Object value = null;
		if (variable.getInitializeExpression() != null)
			value = castTo(
					variable.getDataType(),
					evaluate(variableBindings, parAndLocVarBindings,
							variable.getInitializeExpression()));

		parAndLocVarBindings.add(new LocalVariableAndParameterBinding(variable,
				value));
		return null;
	}

	/**
	 * Casts value to Java data type corresponding {@link DataType} type.
	 * 
	 * @param type
	 * @param value
	 *            Supported types of value are {@link String},{@link Boolean},
	 *            {@link Byte}, {@link Short}, {@link Integer}, {@link Long} and
	 *            {@link Double}.
	 * @return
	 * @throws IncompatibleTypeException
	 * @throws UnsupportedModellingElementException
	 */
	public Object castTo(DataType type, Object value)
			throws IncompatibleTypeException,
			UnsupportedModellingElementException {

		switch (((PrimitiveDataType) type).getPrimitiveType().getValue()) {
		// cast to boolean
		case PrimitiveTypes.BOOLEAN_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Boolean) && !(value instanceof String) && !(value instanceof Number)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}
			// value was already of type boolean
			if(value instanceof Boolean)
				return (Boolean) value;
			
			// cast string to boolean
			 if (value instanceof String) {
				if (((String) value).equals("true"))
					return true;
				else if (((String) value).equals("false"))
					return false;
				else
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());

			}
			//use C-semantics for casting a number to boolean (0 = false, > 0 = true, < 0 = true)
			if (value instanceof Number){
				if (((Number) value).longValue() == 0){
					return false;
				} else {
					return true;
				}
			}
			// value was already of type boolean
			return (Boolean) value;

			// cast to byte
		case PrimitiveTypes.INT8_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Short) && !(value instanceof Double)
					&& !(value instanceof Long) && !(value instanceof Integer)
					&& !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}

			// string to byte
			if (value instanceof String)
				try {
					return Byte.parseByte((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Byte");
				}

			// numeric to byte (check whether decimal places are only 0s)
			else {
				if (((Number) value).doubleValue() > Byte.MAX_VALUE
						|| ((Number) value).doubleValue() % 1 != 0)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Byte");
				return ((Number) value).byteValue();
			}

			// cast to double
		case PrimitiveTypes.DOUBLE_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Short) && !(value instanceof Double)
					&& !(value instanceof Long) && !(value instanceof Integer)
					&& !(value instanceof String)) {

				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}

			// string to double
			if (value instanceof String)
				try {
					return Double.parseDouble((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Double");
				}
			// numeric can be casted without constraints
			else
				return ((Number) value).doubleValue();

			// cast to int
		case PrimitiveTypes.INT32_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Long) && !(value instanceof Short)
					&& !(value instanceof Double)
					&& !(value instanceof Integer)
					&& !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}
			// string to int
			if (value instanceof String)
				try {
					return Integer.parseInt((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Integer");
				}

			// numeric (check whether decimal places are only 0s)
			else {
				if (((Number) value).doubleValue() > Integer.MAX_VALUE
						|| ((Number) value).doubleValue() % 1 != 0)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Integer");
				return ((Number) value).intValue();
			}

			// cast to long
		case PrimitiveTypes.INT64_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Long) && !(value instanceof Short)
					&& !(value instanceof Double)
					&& !(value instanceof Integer)
					&& !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}

			// string to long
			if (value instanceof String)
				try {
					return Long.parseLong((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Long");
				}

			// numeric to long (check whether decimal places are only 0s)
			else {
				if (((Number) value).doubleValue() > Long.MAX_VALUE
						|| ((Number) value).doubleValue() % 1 != 0)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Long");
				return ((Number) value).longValue();
			}

			// cast to short
		case PrimitiveTypes.INT16_VALUE:
			// evaluate whether value is of supported type for this cast
			if (!(value instanceof Short) && !(value instanceof Long)
					&& !(value instanceof Double)
					&& !(value instanceof Integer)
					&& !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}

			// string to short
			if (value instanceof String)
				try {
					return Short.parseShort((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Short");
				}

			// numeric to short (check whether decimal places are only 0s)
			else {
				if (((Number) value).doubleValue() > Short.MAX_VALUE
						|| ((Number) value).doubleValue() % 1 != 0)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString() + " to Short");
				return ((Number) value).byteValue();
			}

		default:
			throw new UnsupportedModellingElementException(type.toString()
					+ " is not yet supported");

		}
	}

}
