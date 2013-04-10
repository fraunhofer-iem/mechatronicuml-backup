package de.uni_paderborn.fujaba.muml.actionlanguage.interpreter;

import java.util.HashSet;
import java.util.Iterator;

import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.BinaryExpression;
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
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.WhileLoop;
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
	 */
	public void evaluateExpression(HashSet<VariableBinding> variableBindings,
			Expression expression) {
	
			evaluate(variableBindings, expression);
			
	
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			Expression expression)  {
		if (expression instanceof UnaryExpression)
			return evaluate(variableBindings, (UnaryExpression) expression);
		else if (expression instanceof ComparisonExpression)
			return evaluate(variableBindings, (ComparisonExpression) expression);
		else if (expression instanceof ArithmeticExpression)
			return evaluate(variableBindings, (ArithmeticExpression) expression);
		else if (expression instanceof LogicalExpression)
			return evaluate(variableBindings, (LogicalExpression) expression);
		else if (expression instanceof LiteralExpression)
			return evaluate(variableBindings, (LiteralExpression) expression);
		else if (expression instanceof Block)
			return evaluate(variableBindings, (Block) expression);
		else if (expression instanceof WhileLoop)
			return evaluate(variableBindings, (WhileLoop) expression);
		else if (expression instanceof DoWhileLoop)
			return evaluate(variableBindings, (DoWhileLoop) expression);
		else if (expression instanceof Assignment)
			return evaluate(variableBindings, (Assignment) expression);
		else if (expression instanceof ForLoop)
			return evaluate(variableBindings, (ForLoop) expression);
		else if (expression instanceof IfStatement)
			return evaluate(variableBindings, (IfStatement) expression);
		else if (expression instanceof TypedNamedElementExpression)
			return evaluate(variableBindings,
					(TypedNamedElementExpression) expression);

		return null;
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			UnaryExpression unaryExpression) {
		double value;
		switch (unaryExpression.getOperator().getValue()) {
		case UnaryOperator.DECREMENT_VALUE:
			value = (Double) evaluate(variableBindings,
					unaryExpression.getEnclosedExpression());
			return value--;

		case UnaryOperator.INCREMENT_VALUE:
			value = (Double) evaluate(variableBindings,
					unaryExpression.getEnclosedExpression());
			return value++;

			// TODO check in assignment
		case UnaryOperator.MINUS_VALUE:
			value = (Double) evaluate(variableBindings,
					unaryExpression.getEnclosedExpression());
			return value;

			// TODO check in assignment
		case UnaryOperator.PLUS_VALUE:
			value = (Double) evaluate(variableBindings,
					unaryExpression.getEnclosedExpression());
			return value;

		case UnaryOperator.NOT_VALUE:

			return !((Boolean) evaluate(variableBindings,
					unaryExpression.getEnclosedExpression()));

		}
		// TODO throw exception
		return null;
	}

	protected HashSet<VariableBinding> evaluate(
			HashSet<VariableBinding> variableBindings,
			BinaryExpression binaryExpression) {

		// TODO is this ever used?
		return variableBindings;
	}

	/**
	 * Evaluates if comparisonExpression is true with respect to
	 * variableBindings
	 * 
	 * @param variableBindings
	 * @param comparisonExpression
	 * @return
	 */
	protected Boolean evaluate(HashSet<VariableBinding> variableBindings,
			ComparisonExpression comparisonExpression) {

		DataType doubleType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);

		switch (comparisonExpression.getOperator().getValue()) {
		case ComparingOperator.EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) == (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.GREATER_OR_EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) >= (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.GREATER_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) > (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.LESS_OR_EQUAL_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) <= (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.LESS_VALUE:
			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) < (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));

		case ComparingOperator.REGULAR_EXPRESSION_VALUE:
			// TODO ??
			break;

		case ComparingOperator.UNEQUAL_VALUE:

			return (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getLeftExpression())) != (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							comparisonExpression.getRightExpression()));
		}
		// TODO throw exception
		return null;

	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			ArithmeticExpression arithmeticExpression) {

		DataType doubleType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);

		switch (arithmeticExpression.getOperator().getValue()) {
		case ArithmeticOperator.DIVIDE_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getLeftExpression())) / (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.MINUS_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getLeftExpression())) - (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.MODULO_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getLeftExpression())) % (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.PLUS_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getLeftExpression())) + (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getRightExpression())));

		case ArithmeticOperator.TIMES_VALUE:
			return ((Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getLeftExpression())) * (Double) castTo(
					doubleType,
					evaluate(variableBindings,
							arithmeticExpression.getRightExpression())));

		default:
			// should never happen
			return null;

		}

	}

	protected Boolean evaluate(HashSet<VariableBinding> variableBindings,
			LogicalExpression logicalExpression) {

		switch (logicalExpression.getOperator().getValue()) {
		// TODO is this & or &&
		case LogicOperator.AND_VALUE:
			return (Boolean) evaluate(variableBindings,
					logicalExpression.getLeftExpression())
					& (Boolean) evaluate(variableBindings,
							logicalExpression.getRightExpression());
			// TODO not sure here
		case LogicOperator.EQUIVALENT_VALUE:
			return (Boolean) evaluate(variableBindings,
					logicalExpression.getLeftExpression()) == (Boolean) evaluate(
					variableBindings, logicalExpression.getRightExpression());
			// TODO implement by substitute
		case LogicOperator.IMPLY_VALUE:
			return false;

			// TODO is this | or ||
		case LogicOperator.OR_VALUE:
			return (Boolean) evaluate(variableBindings,
					logicalExpression.getLeftExpression())
					| (Boolean) evaluate(variableBindings,
							logicalExpression.getRightExpression());

		case LogicOperator.XOR_VALUE:
			return (Boolean) evaluate(variableBindings,
					logicalExpression.getLeftExpression())
					^ (Boolean) evaluate(variableBindings,
							logicalExpression.getRightExpression());
		}
		// TODO throw exception
		return null;
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
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

	/**
	 * Modifies variableBindings according to expression of type {@link Block}
	 * 
	 * @param variableBindings
	 * @param block
	 */
	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			Block block) {
		Iterator<Expression> expIterator = block.getExpressions().iterator();
		while (expIterator.hasNext())
			evaluate(variableBindings, expIterator.next());
		return null;
	}

	/**
	 * Modifies variableBindings according to expression of type
	 * {@link WhileLoop}
	 * 
	 * @param variableBindings
	 * @param whileLoop
	 */
	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			WhileLoop whileLoop) {
		while ((Boolean) evaluate(variableBindings, whileLoop.getLoopTest()))
			evaluate(variableBindings, whileLoop.getBlock());

		return null;
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			DoWhileLoop doWhileLoop) {
		do
			evaluate(variableBindings, doWhileLoop.getBlock());
		while ((Boolean) evaluate(variableBindings, doWhileLoop.getLoopTest()));
		return null;
	}

	/**
	 * Modifies variableBindings with respect to assignment
	 * 
	 * @param variableBindings
	 * @param assignment
	 * @return
	 */
	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			Assignment assignment) {
		TypedNamedElement element = assignment
				.getLhs_typedNamedElementExpression().getTypedNamedElement();
		if (!(element instanceof Variable)) {
			// TODO throw exception
		}

		Variable variable = (Variable) element;
		VariableBinding variableBinding = null;
		for (VariableBinding curVarBinding : variableBindings) {
			if (curVarBinding.getVariable().equals(variable)) {
				variableBinding = curVarBinding;
				break;
			}
		}

		// TODO throw exception if variableBinding == null
		if (variableBinding != null) {
			// get new value
			Object value = evaluate(variableBindings,
					assignment.getRhs_assignExpression());
			// assign new value
			variableBinding.setValue(castTo(variable.getDataType(), value));
		}

		return null;
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			ForLoop forLoop) {

		evaluate(variableBindings, forLoop.getInitializeExpression());

		while ((Boolean) evaluate(variableBindings, forLoop.getLoopTest())) {
			evaluate(variableBindings, forLoop.getBlock());
			evaluate(variableBindings, forLoop.getCountingExpression());
		}

		return null;

	}

	protected Object evaluate(
			HashSet<VariableBinding> variableBindings, IfStatement ifStatement) {
		boolean blockExecuted = false;
		DataType boolType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);

		if ((Boolean) castTo(boolType,
				evaluate(variableBindings, ifStatement.getIfCondition()))) {
			evaluate(variableBindings, ifStatement.getIfBlock());
			blockExecuted = true;
		}

		// if if-condition was not evaluated to true evaluate elseIf conditions
		// and corresponding block
		if (!blockExecuted && ifStatement.getElseIfConditions() != null
				&& !ifStatement.getElseIfConditions().isEmpty()) {
			Iterator<Block> elseIfIterator = ifStatement.getElseIfBlocks()
					.iterator();
			for (Expression elseIfCondition : ifStatement.getElseIfConditions()) {
				if ((Boolean) castTo(boolType,
						evaluate(variableBindings, elseIfCondition))) {
					evaluate(variableBindings, elseIfIterator.next());
					blockExecuted = true;
					break;
				}
				elseIfIterator.next();
			}
		}
		
		//if none of the blocks was evaluated evaluate else block
		if (!blockExecuted && ifStatement.getElseBlock() != null) {
			evaluate(variableBindings, ifStatement.getElseBlock());

		}
		return null;
	}

	// TODO implement
	protected HashSet<VariableBinding> evaluate(
			HashSet<VariableBinding> variableBindings,
			OperationCall operationCall) {
		return variableBindings;
	}

	// TODO implement
	protected HashSet<VariableBinding> evaluate(
			HashSet<VariableBinding> variableBindings,
			ReturnStatement returnStatement) {

		return variableBindings;
	}

	protected Object evaluate(HashSet<VariableBinding> variableBindings,
			TypedNamedElementExpression typedNamedElementExpression) {

		Variable variable = (Variable) typedNamedElementExpression
				.getTypedNamedElement();

		for (VariableBinding varBinding : variableBindings) {
			if (varBinding.getVariable().equals(variable))
				return varBinding.getValue();
			// TODO throw exception if value == null
		}

		// TODO throw exception
		return null;
	}

	/**
	 * Casts value to Java data type corresponding {@link DataType} type
	 * 
	 * @param type
	 * @param value
	 * @return
	 */
	protected Object castTo(DataType type, Object value) {
		switch (((PrimitiveDataType) type).getPrimitiveType().getValue()) {
		case PrimitiveTypes.BOOLEAN_VALUE:
			if (!(value instanceof Boolean)) {
				// TODO Throw exception
			}
			return (Boolean) value;

		case PrimitiveTypes.BYTE_VALUE:
			// all integer numbers are parsed to Long by evaluate
			if (!(value instanceof Long)) {
				// TODO Throw exception
			}
			if ((Long) value > Byte.MAX_VALUE) {
				// TODO Throw exception
			}
			return ((Long) value).byteValue();

		case PrimitiveTypes.DOUBLE_VALUE:
			if (!(value instanceof Double) || !(value instanceof Long)
					|| !(value instanceof Integer)) {
				// TODO Throw exception
			}
			if (value instanceof Long)
				return ((Long) value).doubleValue();
			else if (value instanceof Integer)
				return ((Integer) value).doubleValue();
			else
				return (Double) value;

		case PrimitiveTypes.INT_VALUE:
			// all integer numbers are parsed to Long by evaluate
			if (!(value instanceof Long || !(value instanceof Double) || !(value instanceof Integer))) {
				// TODO Throw exception
			}
			if (value instanceof Long && (Long) value > Integer.MAX_VALUE) {
				// TODO Throw exception
			} else if (value instanceof Double) {

				int r = ((Double) value).intValue();
				if ((Double) value == r)
					return r;
				else {
					// TODO throw exception
				}

			}
			return ((Long) value).intValue();

		case PrimitiveTypes.LONG_VALUE:
			// all integer numbers are parsed to Long by evaluate
			if (!(value instanceof Long)) {
				// TODO Throw exception
			}

			return (Long) value;

		case PrimitiveTypes.SHORT_VALUE:
			// all integer numbers are parsed to Long by evaluate
			if (!(value instanceof Long)) {
				// TODO Throw exception
			}
			if ((Long) value > Short.MAX_VALUE) {
				// TODO Throw exception
			}
			return ((Long) value).shortValue();


		default:
			// should never happen
			return null;

		}
	}



}
