package org.muml.verification.core.refinement.testautomata;

import java.util.HashSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.common.ArithmeticExpression;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.mumlcore.expressions.common.ComparisonExpression;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.mumlcore.expressions.common.LogicalExpression;
import org.muml.mumlcore.expressions.common.UnaryExpression;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.DoWhileLoop;
import org.muml.pim.actionlanguage.ElseIfStatement;
import org.muml.pim.actionlanguage.ForLoop;
import org.muml.pim.actionlanguage.IfStatement;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.actionlanguage.NondeterministicChoiceExpression;
import org.muml.pim.actionlanguage.OperationCall;
import org.muml.pim.actionlanguage.ReturnStatement;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.actionlanguage.WhileLoop;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;

/**
 * For a given {@link Expression} with embedded
 * {@link NondeterministicChoiceExpression}s, this class generates a set of
 * {@link Expression}s. In the result set,
 * {@link NondeterministicChoiceExpression}s are substituted by concrete values.
 * Thus, the result set consists of all possible outcomes of these
 * substitutions.
 */

// Basic Algorithm
// Add the root Expression to tmpSubstitutedExpressions
// While tmpSubstitutedExpression is not empty
// tmpRootExpression = tmpSubstitutedExpression.pop()
// walk through tmpRootExpression until a NondeterministicChoiceExpression is
// found (depth first)
// for every possible substitution of the NondeterministicChoiceExpression copy
// the rootExpression and substitute
// add the resulting Expression to tmpSubstitutedExpressions

// TODO still has a lot of code whose logic could be expressed via

public class NondeterminismHandler {

	private boolean nonDeterminismFound = false;
	private EList<Expression> tmpSubstitutedExpressions;
	private EList<Expression> completelySubstitutedExpressions;
	private Expression tmpRootExpression;
	private HashSet<Variable> globalVariables = new HashSet<Variable>();
	private HashSet<Assignment> assignmentsToNDVariables;
	private HashSet<Variable> variablesAssignedByND;
	private HashSet<TypedNamedElementExpression> callsOfNDVariables;
	private boolean checkForAssignments = false;
	private boolean checkForCalls = false;
	private HashSet<Variable> allNDVariables;

	public NondeterminismHandler() {

	}

	public void setGlobalVariables(HashSet<Variable> globalVariables) {
		this.globalVariables = globalVariables;
	}

	public void startEvaluation(Expression expression) throws UnsupportedModellingElementException {

		// init
		tmpRootExpression = expression;
		if (tmpSubstitutedExpressions == null)
			tmpSubstitutedExpressions = new BasicEList<Expression>();
		if (completelySubstitutedExpressions == null)
			completelySubstitutedExpressions = new BasicEList<Expression>();
		tmpSubstitutedExpressions.clear();
		completelySubstitutedExpressions.clear();
		nonDeterminismFound = false;
		if (checkForAssignments) {
			if (assignmentsToNDVariables == null)
				assignmentsToNDVariables = new HashSet<Assignment>();
		}
		if (checkForCalls) {
			if (callsOfNDVariables == null)
				callsOfNDVariables = new HashSet<TypedNamedElementExpression>();
		}

		evaluate(tmpRootExpression);

		while (!tmpSubstitutedExpressions.isEmpty()) {
			tmpRootExpression = tmpSubstitutedExpressions.get(0);
			if (!evaluate(tmpSubstitutedExpressions.get(0))) {
				completelySubstitutedExpressions.add(tmpSubstitutedExpressions.get(0));
				tmpSubstitutedExpressions.remove(0);
			} else
				tmpSubstitutedExpressions.remove(0);
		}
	}

	private boolean evaluate(Expression expression) throws UnsupportedModellingElementException {
		if (expression instanceof UnaryExpression)
			return evaluate((UnaryExpression) expression);
		else if (expression instanceof Block)
			return evaluate((Block) expression);
		else if (expression instanceof Assignment)
			return evaluate((Assignment) expression);
		else if (expression instanceof ComparisonExpression)
			return evaluate((ComparisonExpression) expression);
		else if (expression instanceof ArithmeticExpression)
			return evaluate((ArithmeticExpression) expression);
		else if (expression instanceof LiteralExpression)
			return false;
		else if (expression instanceof LogicalExpression)
			return evaluate((LogicalExpression) expression);
		else if (expression instanceof WhileLoop)
			return evaluate((WhileLoop) expression);
		else if (expression instanceof DoWhileLoop)
			return evaluate((DoWhileLoop) expression);
		else if (expression instanceof ForLoop)
			return evaluate((ForLoop) expression);
		else if (expression instanceof IfStatement)
			return evaluate((IfStatement) expression);
		else if (expression instanceof ReturnStatement)
			return evaluate((ReturnStatement) expression);
		else if (expression instanceof OperationCall)
			return evaluate((OperationCall) expression);
		else if (expression instanceof LocalVariableDeclarationStatement)
			return evaluate((LocalVariableDeclarationStatement) expression);
		else if (expression instanceof TypedNamedElementExpression)
			return evaluate((TypedNamedElementExpression) expression);
		else if (expression instanceof NondeterministicChoiceExpression)
			return evaluate((NondeterministicChoiceExpression) expression);
		else
			throw new UnsupportedModellingElementException("NonDeterminismSubstitution does not yet support "
					+ expression.toString() + "evaluation may be corrupted");
		/*
		 * 
		 * throw new UnsupportedModellingElementException("Expressions of type "
		 * + expression.eClass().getName() + " are not yet supported");
		 */

	}

	private boolean evaluate(UnaryExpression expression) throws UnsupportedModellingElementException {
		if (expression.getEnclosedExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) expression.getEnclosedExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) expression.getEnclosedExpression());

			if (checkGlobalVariableReference((TypedNamedElementExpression) expression.getEnclosedExpression())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) expression
						.getEnclosedExpression();

				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				for (LiteralExpression curLitExpression : litExpressions) {
					expression.setEnclosedExpression(curLitExpression);
					addSubstitutedExpression();
				}
				expression.setEnclosedExpression(tneExpression);

				// non-determinism found -> stop recursion
				return true;
			}
			return false;
		} else if (expression.getEnclosedExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) expression
					.getEnclosedExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				expression.setEnclosedExpression(curLitExpression);
				addSubstitutedExpression();
			}
			// non determinism found -> stop recursion

			expression.setEnclosedExpression(nondetExp);
			return true;

		} else
			return evaluate(expression.getEnclosedExpression());

	}

	private boolean evaluate(Block block) throws UnsupportedModellingElementException {
		EList<Expression> expressions = block.getExpressions();

		// HashSet<Assignment> toRemove = new HashSet<Assignment>();
		// TODO can assignments be contained by other expressions as block?
		for (Expression curExpression : expressions) {
			if (checkForAssignments && (curExpression instanceof Assignment) && (checkNondeterminismVariableReference(
					((Assignment) curExpression).getLhs_typedNamedElementExpression()))) {
				assignmentsToNDVariables.add(((Assignment) curExpression));

			} else if (evaluate(curExpression)) {
				return true;
			}
		}
		return false;

	}

	private boolean evaluate(Assignment assignment) throws UnsupportedModellingElementException {

		if (assignment.getRhs_assignExpression() instanceof TypedNamedElementExpression) {

			// check if nondeterministic variable is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) assignment.getRhs_assignExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) assignment.getRhs_assignExpression());
			// if tneExpression references global variable
			if (checkGlobalVariableReference(
					(TypedNamedElementExpression) (TypedNamedElementExpression) assignment.getRhs_assignExpression())) {
				// variable is nondeterministic
				if (assignment.getLhs_typedNamedElementExpression().getTypedNamedElement() instanceof Variable) {
					if (variablesAssignedByND == null)
						variablesAssignedByND = new HashSet<Variable>();
					Variable var = (Variable) assignment.getLhs_typedNamedElementExpression().getTypedNamedElement();
					variablesAssignedByND.add(var);
				}

				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) assignment
						.getRhs_assignExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					assignment.setRhs_assignExpression(curLitExpression);
					addSubstitutedExpression();
				}
				assignment.setRhs_assignExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		else if (assignment.getRhs_assignExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) assignment
					.getRhs_assignExpression();
			// rhs contains nondeterminism -> add variable to
			// variablesAssignedByND
			if (assignment.getLhs_typedNamedElementExpression().getTypedNamedElement() instanceof Variable) {
				if (variablesAssignedByND == null)
					variablesAssignedByND = new HashSet<Variable>();
				Variable var = (Variable) assignment.getLhs_typedNamedElementExpression().getTypedNamedElement();
				variablesAssignedByND.add(var);
			}

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				assignment.setRhs_assignExpression(curLitExpression);
				addSubstitutedExpression();
			}
			assignment.setRhs_assignExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		// if rhs contains nondeterminism, add variable to variablesAssignedByND
		// and return true
		if (evaluate(assignment.getRhs_assignExpression())) {
			// rhs contains nondeterminism
			if (assignment.getLhs_typedNamedElementExpression().getTypedNamedElement() instanceof Variable) {
				if (variablesAssignedByND == null)
					variablesAssignedByND = new HashSet<Variable>();
				Variable var = (Variable) assignment.getLhs_typedNamedElementExpression().getTypedNamedElement();
				variablesAssignedByND.add(var);
				// if(assignmentsToNDVariables == null)
				// assignmentsToNDVariables = new HashSet<Expression>();
				// assignmentsToNDVariables.add(assignment);
			}
			return true;
		}

		else
			return false;

	}

	private boolean evaluate(ComparisonExpression compExpression) throws UnsupportedModellingElementException {
		if (compExpression.getLeftExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) compExpression.getLeftExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) compExpression.getLeftExpression());

			// if tneExpression references global variable
			if (checkGlobalVariableReference((TypedNamedElementExpression) compExpression.getLeftExpression())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) compExpression
						.getLeftExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					compExpression.setLeftExpression(curLitExpression);
					addSubstitutedExpression();
				}
				compExpression.setLeftExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (compExpression.getRightExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) compExpression.getRightExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) compExpression.getRightExpression());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) compExpression
					.getRightExpression();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					compExpression.setRightExpression(curLitExpression);
					addSubstitutedExpression();
				}
				compExpression.setRightExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}

		}

		if (compExpression.getLeftExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) compExpression
					.getLeftExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				compExpression.setLeftExpression(curLitExpression);
				addSubstitutedExpression();
			}
			compExpression.setLeftExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (compExpression.getRightExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) compExpression
					.getLeftExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				compExpression.setRightExpression(curLitExpression);
				addSubstitutedExpression();
			}
			compExpression.setRightExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (evaluate(compExpression.getLeftExpression()))
			return true;

		if (evaluate(compExpression.getRightExpression()))
			return true;

		else
			return false;
	}

	private boolean evaluate(ArithmeticExpression arithExpression) throws UnsupportedModellingElementException {
		if (arithExpression.getLeftExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) arithExpression.getLeftExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) arithExpression.getLeftExpression());

			// if tneExpression references global variable -> substitute
			if (checkGlobalVariableReference((TypedNamedElementExpression) arithExpression.getLeftExpression())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) arithExpression
						.getLeftExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					arithExpression.setLeftExpression(curLitExpression);
					addSubstitutedExpression();
				}
				arithExpression.setLeftExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (arithExpression.getRightExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) arithExpression.getRightExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) arithExpression.getRightExpression());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) arithExpression
					.getRightExpression();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					arithExpression.setRightExpression(curLitExpression);
					addSubstitutedExpression();
				}
				arithExpression.setRightExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (arithExpression.getLeftExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) arithExpression
					.getLeftExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				arithExpression.setLeftExpression(curLitExpression);
				addSubstitutedExpression();
			}
			arithExpression.setLeftExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (arithExpression.getRightExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) arithExpression
					.getRightExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				arithExpression.setRightExpression(curLitExpression);
				addSubstitutedExpression();
			}
			arithExpression.setRightExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (evaluate(arithExpression.getLeftExpression()))
			return true;

		if (evaluate(arithExpression.getRightExpression()))
			return true;

		else
			return false;
	}

	private boolean evaluate(LogicalExpression logExpression) throws UnsupportedModellingElementException {
		if (logExpression.getLeftExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) logExpression.getLeftExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) logExpression.getLeftExpression());

			// if tneExpression references global variable
			if (checkGlobalVariableReference((TypedNamedElementExpression) logExpression.getLeftExpression())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) logExpression
						.getLeftExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					logExpression.setLeftExpression(curLitExpression);
					addSubstitutedExpression();
				}
				logExpression.setLeftExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (logExpression.getRightExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) logExpression.getRightExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) logExpression.getRightExpression());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) logExpression
					.getRightExpression();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					logExpression.setRightExpression(curLitExpression);
					addSubstitutedExpression();
				}
				logExpression.setRightExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (logExpression.getLeftExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) logExpression
					.getLeftExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				logExpression.setLeftExpression(curLitExpression);
				addSubstitutedExpression();
			}
			logExpression.setLeftExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (logExpression.getRightExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) logExpression
					.getRightExpression();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				logExpression.setRightExpression(curLitExpression);
				addSubstitutedExpression();
			}
			logExpression.setRightExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}

		if (evaluate(logExpression.getLeftExpression()))
			return true;

		if (evaluate(logExpression.getRightExpression()))
			return true;

		else
			return false;
	}

	private boolean evaluate(WhileLoop whileLoop) throws UnsupportedModellingElementException {
		if (whileLoop.getLoopTest() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls
					&& checkNondeterminismVariableReference((TypedNamedElementExpression) whileLoop.getLoopTest()))
				callsOfNDVariables.add((TypedNamedElementExpression) whileLoop.getLoopTest());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) whileLoop.getLoopTest();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					whileLoop.setLoopTest(curLitExpression);
					addSubstitutedExpression();
				}
				whileLoop.setLoopTest(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}

		}

		if (whileLoop.getLoopTest() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) whileLoop.getLoopTest();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				whileLoop.setLoopTest(curLitExpression);
				addSubstitutedExpression();
			}
			whileLoop.setLoopTest(nondetExp);
			// non determinism found -> stop recursion
			return true;

		}

		return evaluate(whileLoop.getBlock());

	}

	private boolean evaluate(DoWhileLoop doWhileLoop) throws UnsupportedModellingElementException {
		if (doWhileLoop.getLoopTest() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls
					&& checkNondeterminismVariableReference((TypedNamedElementExpression) doWhileLoop.getLoopTest()))
				callsOfNDVariables.add((TypedNamedElementExpression) doWhileLoop.getLoopTest());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) doWhileLoop.getLoopTest();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					doWhileLoop.setLoopTest(curLitExpression);
					addSubstitutedExpression();
				}
				doWhileLoop.setLoopTest(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (doWhileLoop.getLoopTest() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) doWhileLoop.getLoopTest();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				doWhileLoop.setLoopTest(curLitExpression);
				addSubstitutedExpression();
			}
			doWhileLoop.setLoopTest(nondetExp);
			// non determinism found -> stop recursion
			return true;

		}
		return evaluate(doWhileLoop.getBlock());
	}

	private boolean evaluate(ForLoop forLoop) throws UnsupportedModellingElementException {
		if (forLoop.getLoopTest() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls
					&& checkNondeterminismVariableReference((TypedNamedElementExpression) forLoop.getLoopTest()))
				callsOfNDVariables.add((TypedNamedElementExpression) forLoop.getLoopTest());

			TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) forLoop.getLoopTest();
			// if tneExpression references global variable
			if (checkGlobalVariableReference(tneExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					forLoop.setLoopTest(curLitExpression);
					addSubstitutedExpression();
				}
				forLoop.setLoopTest(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (forLoop.getLoopTest() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) forLoop.getLoopTest();

			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				forLoop.setLoopTest(curLitExpression);
				addSubstitutedExpression();
			}
			forLoop.setLoopTest(nondetExp);
			// non determinism found -> stop recursion
			return true;

		}
		return evaluate(forLoop.getBlock());
		// non determinism found -> stop recursion

	}

	private boolean evaluate(IfStatement ifStatement) throws UnsupportedModellingElementException {
		if (evaluate(ifStatement.getElseBlock()))
			// nondeterminism in elseBlock -> stop recursion
			return true;

		for (ElseIfStatement elseIfStatement : ifStatement.getElseIfStatements())
			if (evaluate(elseIfStatement))
				// nondeterminism in on of the elseIfStatements -> stop
				// recursion
				return true;

		if (evaluate(ifStatement.getIfBlock()))
			// nondeterminism in if block -> stop recursion
			return true;

		if (ifStatement.getIfCondition() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls
					&& checkNondeterminismVariableReference((TypedNamedElementExpression) ifStatement.getIfCondition()))
				callsOfNDVariables.add((TypedNamedElementExpression) ifStatement.getIfCondition());
			// if tneExpression references global variable
			if (checkGlobalVariableReference((TypedNamedElementExpression) ifStatement.getIfCondition())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) ifStatement.getIfCondition();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					ifStatement.setIfCondition(curLitExpression);
					addSubstitutedExpression();
				}
				ifStatement.setIfCondition(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (ifStatement.getIfCondition() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) ifStatement
					.getIfCondition();
			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				ifStatement.setIfCondition(curLitExpression);
				addSubstitutedExpression();
			}
			ifStatement.setIfCondition(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}
		return false;
	}

	private boolean evaluate(ElseIfStatement elseIfStatement) throws UnsupportedModellingElementException {
		// check the block
		if (evaluate(elseIfStatement.getElseIfBlock()))
			// nondeterminism in the elseIfBlocks -> stop recursion
			return true;

		// check the condition
		Expression curExpression = elseIfStatement.getElseIfCondition();

		if (curExpression instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference((TypedNamedElementExpression) curExpression))
				callsOfNDVariables.add((TypedNamedElementExpression) curExpression);

			// if tneExpression references global variable
			if (checkGlobalVariableReference((TypedNamedElementExpression) curExpression)) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) curExpression;
				// int indexOfTneExpression = ifStatement
				// .getElseIfConditions().indexOf(curExpression);
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					elseIfStatement.setElseIfCondition(curLitExpression);
					addSubstitutedExpression();
				}
				elseIfStatement.setElseIfCondition(tneExpression);
				// TODO Refactor:
				// something like:
				// tneExpression.eContainer().eSet(tneExpression.eContainingFeature(),
				// copiedAndSubstitutedTneExpression);
				// in evaluate(TypedNamedElementExpression)
				// This procedure can be applied to a lot of code here

				// non determinism found -> stop recursion
				return true;

			}
		}

		if (curExpression instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExpression = (NondeterministicChoiceExpression) curExpression;

			// if tneExpression references global variable
			if (evaluate(nondetExpression)) {
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					elseIfStatement.setElseIfCondition(curLitExpression);
					addSubstitutedExpression();
				}
				elseIfStatement.setElseIfCondition(nondetExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}
		// }
		return false;
	}

	private boolean evaluate(ReturnStatement returnStatement) throws UnsupportedModellingElementException {
		if (returnStatement.getExpression() instanceof TypedNamedElementExpression) {
			// check if nondeterministic variables is called
			if (checkForCalls && checkNondeterminismVariableReference(
					(TypedNamedElementExpression) returnStatement.getExpression()))
				callsOfNDVariables.add((TypedNamedElementExpression) returnStatement.getExpression());

			if (checkGlobalVariableReference((TypedNamedElementExpression) returnStatement.getExpression())) {
				TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) returnStatement
						.getExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					returnStatement.setExpression(curLitExpression);
					addSubstitutedExpression();
				}
				returnStatement.setExpression(tneExpression);
				// non determinism found -> stop recursion
				return true;
			}
		}

		if (returnStatement.getExpression() instanceof NondeterministicChoiceExpression) {
			NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) returnStatement
					.getExpression();
			HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
			// add substitutions
			for (LiteralExpression curLitExpression : litExpressions) {
				returnStatement.setExpression(curLitExpression);
				addSubstitutedExpression();
			}
			returnStatement.setExpression(nondetExp);
			// non determinism found -> stop recursion
			return true;
		}
		return evaluate(returnStatement.getExpression());
	}

	private boolean evaluate(OperationCall opCall) {
		for (ParameterBinding curParBinding : opCall.getParameterBinding()) {

			if (curParBinding.getValue() instanceof TypedNamedElementExpression) {
				// check if nondeterministic variables is called
				if (checkForCalls
						&& checkNondeterminismVariableReference((TypedNamedElementExpression) curParBinding.getValue()))
					callsOfNDVariables.add((TypedNamedElementExpression) curParBinding.getValue());

				if (checkGlobalVariableReference((TypedNamedElementExpression) curParBinding.getValue())) {
					TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) curParBinding.getValue();
					HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
					// add substitutions
					for (LiteralExpression curLitExpression : litExpressions) {
						curParBinding.setValue(curLitExpression);
						addSubstitutedExpression();
					}
					curParBinding.setValue(tneExpression);
					// non determinism found -> stop recursion
					return true;
				}
			}

			if (curParBinding.getValue() instanceof NondeterministicChoiceExpression) {
				NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) curParBinding
						.getValue();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					curParBinding.setValue(curLitExpression);
					addSubstitutedExpression();
				}
				curParBinding.setValue(nondetExp);
				// non determinism found -> stop recursion
				return true;
			}
		}

		return false;
	}

	private boolean evaluate(LocalVariableDeclarationStatement locVarDecStatement) {

		if (locVarDecStatement.getVariable().getInitializeExpression() != null) {
			if (locVarDecStatement.getVariable().getInitializeExpression() instanceof TypedNamedElementExpression) {
				// check if nondeterministic variables is called
				if (checkForCalls && checkNondeterminismVariableReference(
						(TypedNamedElementExpression) locVarDecStatement.getVariable().getInitializeExpression()))
					callsOfNDVariables.add(
							(TypedNamedElementExpression) locVarDecStatement.getVariable().getInitializeExpression());

				if (checkGlobalVariableReference(
						(TypedNamedElementExpression) locVarDecStatement.getVariable().getInitializeExpression())) {
					TypedNamedElementExpression tneExpression = (TypedNamedElementExpression) locVarDecStatement
							.getVariable().getInitializeExpression();
					HashSet<LiteralExpression> litExpressions = createLiteralExpressions(tneExpression);
					// add substitutions
					for (LiteralExpression curLitExpression : litExpressions) {
						locVarDecStatement.getVariable().setInitializeExpression(curLitExpression);
						addSubstitutedExpression();
					}
					locVarDecStatement.getVariable().setInitializeExpression(tneExpression);
					// non determinism found -> stop recursion
					return true;

				}
			}
			if (locVarDecStatement.getVariable()
					.getInitializeExpression() instanceof NondeterministicChoiceExpression) {
				NondeterministicChoiceExpression nondetExp = (NondeterministicChoiceExpression) locVarDecStatement
						.getVariable().getInitializeExpression();
				HashSet<LiteralExpression> litExpressions = createLiteralExpressions(nondetExp);
				// add substitutions
				for (LiteralExpression curLitExpression : litExpressions) {
					locVarDecStatement.getVariable().setInitializeExpression(curLitExpression);
					addSubstitutedExpression();
				}
				locVarDecStatement.getVariable().setInitializeExpression(nondetExp);
				// non determinism found -> stop recursion
				return true;
			}
		}
		return false;
	}

	/**
	 * Covers the case when initial rootExpression is a
	 * TypedNamedElementExpression
	 * 
	 * @param tneExpression
	 * @return
	 */
	private boolean evaluate(TypedNamedElementExpression tneExpression) {
		// check if nondeterministic variables is called
		if (checkForCalls && checkNondeterminismVariableReference(tneExpression))
			callsOfNDVariables.add(tneExpression);
		if (checkGlobalVariableReference(tneExpression)) {
			tmpSubstitutedExpressions.addAll(createLiteralExpressions(tneExpression));
			nonDeterminismFound = true;
		}
		return false;
	}

	/**
	 * Covers the case when initial rootExpression is a
	 * NondeterministicChoiceExpression
	 * 
	 * @param tneExpression
	 * @return
	 */
	private boolean evaluate(NondeterministicChoiceExpression nondetExpression) {

		tmpSubstitutedExpressions.addAll(createLiteralExpressions(nondetExpression));
		nonDeterminismFound = true;
		return true;
	}

	/**
	 * Returns true if {@link TypedNamedElementExpression} expression references
	 * a globalVariable
	 * 
	 * @param expression
	 * @return
	 */

	private boolean checkGlobalVariableReference(TypedNamedElementExpression expression) {
		TypedNamedElement tne = expression.getTypedNamedElement();
		if (!(tne instanceof Variable))
			return false;
		for (Variable curVariable : globalVariables) {
			if (curVariable.equals((Variable) tne)) {
				return true;
			}
		}
		checkNondeterminismVariableReference(expression);
		return false;
	}

	private boolean checkNondeterminismVariableReference(TypedNamedElementExpression expression) {
		TypedNamedElement tne = expression.getTypedNamedElement();
		if (tne instanceof Variable) {
			Variable var = (Variable) tne;
			if (allNDVariables != null && allNDVariables.contains(var))
				return true;
		}
		return false;

	}

	private HashSet<LiteralExpression> createLiteralExpressions(TypedNamedElementExpression expression) {
		// typed named element should be of type variable, because this is the
		// only case createLiteralExpression is called
		Variable variable = (Variable) expression.getTypedNamedElement();
		HashSet<LiteralExpression> litExpressions = new HashSet<LiteralExpression>();
		if (((PrimitiveDataType) variable.getDataType()).getPrimitiveType().equals(PrimitiveTypes.BOOLEAN)) {
			LiteralExpression litExp = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			litExp.setValue("true");
			litExpressions.add(litExp);
			LiteralExpression litExp2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			litExp2.setValue("false");
			litExpressions.add(litExp2);

		}
		return litExpressions;
	}

	private HashSet<LiteralExpression> createLiteralExpressions(NondeterministicChoiceExpression expression) {
		HashSet<LiteralExpression> litExpressions = new HashSet<LiteralExpression>();

		// TODO only works for discrete types
		for (long i = expression.getRange().getLowerBound(); i <= expression.getRange().getUpperBound(); i++) {
			LiteralExpression litExp = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			litExp.setValue("" + i);
			litExpressions.add(litExp);
		}

		return litExpressions;
	}

	private void addSubstitutedExpression() {
		if (tmpSubstitutedExpressions == null)
			tmpSubstitutedExpressions = new BasicEList<Expression>();
		tmpSubstitutedExpressions.add(EcoreUtil.copy(tmpRootExpression));
		nonDeterminismFound = true;
	}

	public boolean nonDeterminismFound() {
		return nonDeterminismFound;
	}

	public EList<Expression> getSubstitutedExpressions() {
		return completelySubstitutedExpressions;
	}

	/**
	 * Returns set of variables that are on the lhs of an assignment where the
	 * rhs contains nondeterminism. When the rhs does not contain a global
	 * variable or NondeterministicChoiceExpression but is nondeterministic, the
	 * corresponding variable will not be found. e.g.: a:=int<0,1>; b:=a; b will
	 * not be assumed to be nondeterministic.
	 * 
	 * @return
	 */
	// TODO improve this. perhaps by adding variables to globalVariables in
	// evaluate assignment
	public HashSet<Variable> getVariablesAssignedByNonDeterminism() {
		if (variablesAssignedByND == null)
			return new HashSet<Variable>();
		else
			return variablesAssignedByND;
	}

	/**
	 * Returns the assignments corresponding to
	 * getVariablesAssignedByNonDeterminism
	 * 
	 * @return
	 */

	public void setNondeterministicVariables(HashSet<Variable> ndVariables) {
		if (allNDVariables == null)
			allNDVariables = new HashSet<Variable>();
		allNDVariables.clear();
		allNDVariables = ndVariables;
	}

	public void setCheckForAssignmentsToNDVariables(boolean check) {
		checkForAssignments = check;
	}

	public HashSet<Assignment> getAssignmentsToNDVariables() {
		if (assignmentsToNDVariables == null)
			return new HashSet<Assignment>();
		else
			return assignmentsToNDVariables;
	}

	public void setCheckForCallsOfNDVariables(boolean check) {
		checkForCalls = check;
	}

	public HashSet<TypedNamedElementExpression> getCallsOfNDVariables() {
		if (callsOfNDVariables == null)
			return new HashSet<TypedNamedElementExpression>();
		return callsOfNDVariables;
	}

}
