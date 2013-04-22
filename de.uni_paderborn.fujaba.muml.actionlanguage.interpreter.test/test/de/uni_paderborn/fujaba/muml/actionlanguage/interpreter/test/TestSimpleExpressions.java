package de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguageFactory;
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.ActionLanguageInterpreter;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;

public class TestSimpleExpressions {

	private ActionlanguageFactory alFactory;
	private CommonExpressionsFactory expFactory;
	private RuntimeFactory runtimeFactory;
	private BehaviorFactory behaviourFactory;
	private TypesFactory typeFactory;

	private Variable intA, intB, boolA, boolB;
	private VariableBinding varBindingIntA, varBindingIntB, varBindingBoolA,
			varBindingBoolB;
	private DataType intType, boolType;
	private HashSet<VariableBinding> varBindings;
	private Block block, block2;
	private Assignment assignment;
	private ActionLanguageInterpreter actionLanguageInterpreter;

	@Before
	public void setUp() {
		// set up factories
		alFactory = ActionlanguageFactory.eINSTANCE;
		actionLanguageInterpreter = new ActionLanguageInterpreter();
		runtimeFactory = RuntimeFactory.eINSTANCE;
		behaviourFactory = BehaviorFactory.eINSTANCE;
		expFactory = CommonExpressionsFactory.eINSTANCE;
		typeFactory = TypesFactory.eINSTANCE;

		// set up misc for embedding of expressions
		block = alFactory.createBlock();
		block2 = alFactory.createBlock();

		// set up data types
		intType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT);

		boolType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);

		// set up variables
		intA = behaviourFactory.createVariable();
		intA.setName("intA");
		intA.setDataType(intType);

		intB = behaviourFactory.createVariable();
		intB.setName("intB");
		intB.setDataType(intType);

		boolA = behaviourFactory.createVariable();
		boolA.setName("boolA");
		boolA.setDataType(boolType);

		boolB = behaviourFactory.createVariable();
		boolB.setName("boolB");
		boolB.setDataType(boolType);

		// set up variable bindings
		varBindingIntA = runtimeFactory.createVariableBinding();
		varBindingIntA.setValue(0);
		varBindingIntA.setVariable(intA);

		varBindings = new HashSet<VariableBinding>();
		varBindings.add(varBindingIntA);

		varBindingIntB = runtimeFactory.createVariableBinding();
		varBindingIntB.setValue(0);
		varBindingIntB.setVariable(intB);

		varBindings.add(varBindingIntB);

		varBindingBoolA = runtimeFactory.createVariableBinding();
		varBindingBoolA.setValue(true);
		varBindingBoolA.setVariable(boolA);

		varBindings.add(varBindingBoolA);

		varBindingBoolB = runtimeFactory.createVariableBinding();
		varBindingBoolB.setValue(false);
		varBindingBoolB.setVariable(boolB);

		varBindings.add(varBindingBoolB);
	}

	@Test
	public void testAssignment() throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		TypedNamedElementExpression tneExp = alFactory
				.createTypedNamedElementExpression();
		tneExp.setTypedNamedElement(intA);

		assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp);

		LiteralExpression litExp = expFactory.createLiteralExpression();
		litExp.setValue("2");

		assignment.setRhs_assignExpression(litExp);

		block.getExpressions().add(assignment);

		actionLanguageInterpreter.evaluateExpression(varBindings, block);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(2));
		}
	}

	@Test
	public void testComparisonExpression()
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		TypedNamedElementExpression tneExp1 = alFactory
				.createTypedNamedElementExpression();
		tneExp1.setTypedNamedElement(intA);

		TypedNamedElementExpression tneExp2 = alFactory
				.createTypedNamedElementExpression();
		tneExp2.setTypedNamedElement(intB);

		TypedNamedElementExpression boolExp = alFactory
				.createTypedNamedElementExpression();
		boolExp.setTypedNamedElement(boolA);

		ComparisonExpression compExpression = expFactory
				.createComparisonExpression();
		compExpression.setLeftExpression(tneExp1);
		compExpression.setRightExpression(tneExp2);
		compExpression.setOperator(ComparingOperator.GREATER);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(boolExp);
		assignment.setRhs_assignExpression(compExpression);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);

		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(boolA))
				assertTrue(curVarBinding.getValue().equals(false));
		}

		compExpression.setOperator(ComparingOperator.GREATER_OR_EQUAL);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);

		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(boolA))
				assertTrue(curVarBinding.getValue().equals(true));
		}

	}

	@Test
	public void testArithmeticExpression()
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		varBindingIntA.setValue(22);
		TypedNamedElementExpression tneExp1 = alFactory
				.createTypedNamedElementExpression();
		tneExp1.setTypedNamedElement(intA);

		TypedNamedElementExpression tneExp3 = alFactory
				.createTypedNamedElementExpression();
		tneExp3.setTypedNamedElement(intA);

		varBindingIntB.setValue(7);
		TypedNamedElementExpression tneExp2 = alFactory
				.createTypedNamedElementExpression();
		tneExp2.setTypedNamedElement(intB);

		ArithmeticExpression ariExpression = expFactory
				.createArithmeticExpression();
		ariExpression.setLeftExpression(tneExp1);
		ariExpression.setRightExpression(tneExp2);
		ariExpression.setOperator(ArithmeticOperator.MODULO);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp3);
		assignment.setRhs_assignExpression(ariExpression);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);

		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(1));
		}
	}

	@Test
	public void testLogicalExpression()
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		TypedNamedElementExpression boolExp1 = alFactory
				.createTypedNamedElementExpression();
		boolExp1.setTypedNamedElement(boolA);

		TypedNamedElementExpression boolExp2 = alFactory
				.createTypedNamedElementExpression();
		boolExp2.setTypedNamedElement(boolB);

		TypedNamedElementExpression boolExpAssign = alFactory
				.createTypedNamedElementExpression();
		boolExpAssign.setTypedNamedElement(boolA);

		LogicalExpression logExpression = expFactory.createLogicalExpression();
		logExpression.setLeftExpression(boolExp1);
		logExpression.setRightExpression(boolExp2);
		logExpression.setOperator(LogicOperator.AND);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(boolExpAssign);
		assignment.setRhs_assignExpression(logExpression);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(boolA))
				assertTrue(curVarBinding.getValue().equals(false));
		}

		varBindingBoolA.setValue(true);
		varBindingBoolB.setValue(true);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(boolA))
				assertTrue(curVarBinding.getValue().equals(true));
		}

	}

	@Test
	public void testIfStatement() throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		IfStatement ifStatement = alFactory.createIfStatement();
		ifStatement.setIfBlock(block);

		// false
		TypedNamedElementExpression boolExp1 = alFactory
				.createTypedNamedElementExpression();
		boolExp1.setTypedNamedElement(boolB);

		TypedNamedElementExpression boolExp3 = alFactory
				.createTypedNamedElementExpression();
		boolExp3.setTypedNamedElement(boolB);

		// true
		TypedNamedElementExpression boolExp2 = alFactory
				.createTypedNamedElementExpression();
		boolExp2.setTypedNamedElement(boolA);

		ifStatement.setIfCondition(boolExp1);

		TypedNamedElementExpression tneExp = alFactory
				.createTypedNamedElementExpression();
		tneExp.setTypedNamedElement(intA);

		// add expression to if block
		assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp);

		LiteralExpression litExp = expFactory.createLiteralExpression();
		litExp.setValue("2");

		assignment.setRhs_assignExpression(litExp);

		block.getExpressions().add(assignment);

		// evaluate if statement
		actionLanguageInterpreter.evaluateExpression(varBindings, ifStatement);

		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(0));
		}

		// add else if block with true condition
		ifStatement.getElseIfConditions().add(boolExp2);
		ifStatement.getElseIfBlocks().add(block);

		// evaluate if statement
		actionLanguageInterpreter.evaluateExpression(varBindings, ifStatement);

		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(2));
		}

		// add false elseifcondition and else block
		ifStatement.getElseIfBlocks().clear();
		ifStatement.getElseIfBlocks().add(block2);
		ifStatement.getElseIfConditions().clear();
		ifStatement.getElseIfConditions().add(boolExp3);
		ifStatement.setElseBlock(block);
		litExp.setValue("3");

		// evaluate if statement
		actionLanguageInterpreter.evaluateExpression(varBindings, ifStatement);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(3));
		}
	}

//@formatter:off
	/**
	 * intC=2;
	 * intA=intC;
	 * 
	 * @throws IncompatibleTypeException
	 * @throws VariableNotInitializedException
	 * @throws UnsupportedModellingElementException
	 * 
	 */
//@formatter:on
	@Test
	public void testLocalVariableDeclaration()
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		// set up initialization expression
		LiteralExpression litExpression = expFactory.createLiteralExpression();
		litExpression.setValue("2");
		// set up inC
		Variable intC = behaviourFactory.createVariable();
		intC.setDataType(intType);
		// intC.setInitializeExpression(litExpression);

		// set up declaration expression
		LocalVariableDeclarationStatement decExpression = alFactory
				.createLocalVariableDeclarationStatement();
		decExpression.setVariable(intC);
		decExpression.setInitializeExpression(litExpression);

		// set up tne expression for intA
		TypedNamedElementExpression intAExp = alFactory
				.createTypedNamedElementExpression();
		intAExp.setTypedNamedElement(intA);

		// set up tne expression for intC
		TypedNamedElementExpression intCExp = alFactory
				.createTypedNamedElementExpression();
		intCExp.setTypedNamedElement(intC);

		// set up Assignment
		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(intAExp);
		assignment.setRhs_assignExpression(intCExp);

		// set up Block
		block.getExpressions().add(decExpression);
		block.getExpressions().add(assignment);

		// evaluate
		actionLanguageInterpreter.evaluateExpression(varBindings, block);

		assertTrue(varBindingIntA.getValue().equals(2));

	}
}
