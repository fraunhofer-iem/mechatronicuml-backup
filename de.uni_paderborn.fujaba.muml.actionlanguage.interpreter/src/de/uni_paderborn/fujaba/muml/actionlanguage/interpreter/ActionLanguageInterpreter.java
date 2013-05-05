package de.uni_paderborn.fujaba.muml.actionlanguage.interpreter;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.common.UnaryOperator;

import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.DoWhileLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.ForLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.WhileLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;

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

	// TODO evaluate loc variables and parameters
	protected Object evaluate(EList<VariableBinding> variableBindings,
			HashSet<LocalVariableAndParameterBinding> parAndLocVarBindings,
			UnaryExpression unaryExpression)
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		double value;
		switch (unaryExpression.getOperator().getValue()) {
		case UnaryOperator.DECREMENT_VALUE:
			value = (Double) evaluate(variableBindings, parAndLocVarBindings,
					unaryExpression.getEnclosedExpression());
			return value--;

		case UnaryOperator.INCREMENT_VALUE:
			value = (Double) evaluate(variableBindings, parAndLocVarBindings,
					unaryExpression.getEnclosedExpression());
			return value++;

		case UnaryOperator.MINUS_VALUE:
			value = (Double) evaluate(variableBindings, parAndLocVarBindings,
					unaryExpression.getEnclosedExpression());
			return value * -1;

		case UnaryOperator.NOT_VALUE:

			return !((Boolean) evaluate(variableBindings, parAndLocVarBindings,
					unaryExpression.getEnclosedExpression()));
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

		switch (comparisonExpression.getOperator().getValue()) {
		case ComparingOperator.EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression())) == (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.GREATER_OR_EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression())) >= (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.GREATER_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression()))) > ((Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression())));

		case ComparingOperator.LESS_OR_EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression())) <= (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.LESS_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression())) < (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.REGULAR_EXPRESSION_VALUE:
			throw new UnsupportedModellingElementException("Operator "
					+ ComparingOperator.REGULAR_EXPRESSION.toString()
					+ " is not yet supported");

		case ComparingOperator.UNEQUAL_VALUE:

			return (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getLeftExpression())) != (Double) castTo(
					doubleType,
					evaluate(variableBindings, parAndLocVarBindings,
							comparisonExpression.getRightExpression()));

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
			// TODO not sure here
		case LogicOperator.EQUIVALENT_VALUE:
			return (Boolean) evaluate(variableBindings, parAndLocVarBindings,
					logicalExpression.getLeftExpression()) == (Boolean) evaluate(
					variableBindings, parAndLocVarBindings,
					logicalExpression.getRightExpression());
			// TODO check if correctly implemented
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
					curVarBinding.setValue(castTo(variable.getDataType(), value));
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
		if (!blockExecuted && ifStatement.getElseIfConditions() != null
				&& !ifStatement.getElseIfConditions().isEmpty()) {
			Iterator<Block> elseIfIterator = ifStatement.getElseIfBlocks()
					.iterator();
			for (Expression elseIfCondition : ifStatement.getElseIfConditions()) {
				if ((Boolean) castTo(
						boolType,
						evaluate(variableBindings, parAndLocVarBindings,
								elseIfCondition))) {
					evaluate(variableBindings, parAndLocVarBindings,
							elseIfIterator.next());
					blockExecuted = true;
					break;
				}
				elseIfIterator.next();
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
			if (curBinding.getTypedNamedElement().equals(tne)){
				if (curBinding.getValue() == null)
					throw new VariableNotInitializedException(tne.toString()
							+ " not initialized until execution of"
							+ typedNamedElementExpression.toString());
			return curBinding.getValue();}
		}

		if (tne instanceof Variable) {
			// search in variable bindings
			for (VariableBinding varBinding : variableBindings) {
				if (varBinding.getVariable().equals(tne)) {
					if (varBinding.getValue() == null)
						throw new VariableNotInitializedException(
								tne.toString()
										+ " not initialized until execution of"
										+ typedNamedElementExpression
												.toString());

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
	 * Casts value to Java data type corresponding {@link DataType} type
	 * 
	 * @param type
	 * @param value
	 * @return
	 * @throws IncompatibleTypeException
	 * @throws UnsupportedModellingElementException
	 */
	public Object castTo(DataType type, Object value)
			throws IncompatibleTypeException,
			UnsupportedModellingElementException {
		switch (((PrimitiveDataType) type).getPrimitiveType().getValue()) {
		case PrimitiveTypes.BOOLEAN_VALUE:
			if (!(value instanceof Boolean) && !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}
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
			return (Boolean) value;

		case PrimitiveTypes.BYTE_VALUE:

			if (!(value instanceof Short) && !(value instanceof Double)
					&& !(value instanceof Long) && !(value instanceof Integer)
					&& !(value instanceof String)) {
				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}

			else if (value instanceof Short) {
				if ((Short) value > Byte.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Short) value).byteValue();
			}

			else if (value instanceof Long) {
				if ((Long) value > Byte.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Long) value).byteValue();
			}

			else if (value instanceof Integer) {
				if ((Integer) value > Byte.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Integer) value).byteValue();
			}

			else if (value instanceof String)
				try {
					return Byte.parseByte((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				}
			else
				return (Byte) value;

		case PrimitiveTypes.DOUBLE_VALUE:
			if (!(value instanceof Short) && !(value instanceof Double)
					&& !(value instanceof Long) && !(value instanceof Integer)
					&& !(value instanceof String)) {

				throw new IncompatibleTypeException("Cannot cast "
						+ value.toString()
						+ " to "
						+ ((PrimitiveDataType) type).getPrimitiveType()
								.toString());
			}
			if (value instanceof Short)
				return ((Short) value).doubleValue();
			else if (value instanceof Long)
				return ((Long) value).doubleValue();
			else if (value instanceof Integer)
				return ((Integer) value).doubleValue();
			else if (value instanceof String)
				try {
					return Double.parseDouble((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				}
			else
				return (Double) value;

		case PrimitiveTypes.INT_VALUE:
			// all integer numbers are parsed to Long by evaluate
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

			if (value instanceof Short)
				return ((Short) value).intValue();

			else if (value instanceof Long) {
				if ((Long) value > Integer.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Long) value).intValue();
			}

			// TODO check for decimal places
			else if (value instanceof Double) {
				if ((Double) value > Integer.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Double) value).intValue();
			}

			else if (value instanceof Byte) {

				return ((Byte) value).intValue();
			}

			else if (value instanceof String)
				try {
					return Byte.parseByte((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				}
			else

				return (Integer) value;

		case PrimitiveTypes.LONG_VALUE:
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
			if (value instanceof Short)
				return ((Short) value).longValue();

			if (value instanceof Integer) {

				return ((Integer) value).longValue();
			}

			// TODO check for decimal places
			else if (value instanceof Double) {
				if ((Double) value > Long.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Double) value).longValue();
			}

			else if (value instanceof Byte) {

				return ((Byte) value).longValue();
			}

			else if (value instanceof String)
				try {
					return Long.parseLong((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				}
			else

				return (Long) value;

		case PrimitiveTypes.SHORT_VALUE:
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

			if (value instanceof Long) {
				if ((Long) value > Short.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Long) value).shortValue();
			}

			// TODO check for decimal places
			else if (value instanceof Double) {
				if ((Double) value > Integer.MAX_VALUE)
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				return ((Double) value).shortValue();
			}

			else if (value instanceof Byte) {

				return ((Byte) value).shortValue();
			}

			else if (value instanceof String)
				try {
					return Short.parseShort((String) value);
				} catch (NumberFormatException e) {
					throw new IncompatibleTypeException("Cannot cast "
							+ value.toString()
							+ " to "
							+ ((PrimitiveDataType) type).getPrimitiveType()
									.toString());
				}
			else

				return (Short) value;

		default:
			throw new UnsupportedModellingElementException(type.toString()
					+ " is not yet supported");

		}
	}

}
