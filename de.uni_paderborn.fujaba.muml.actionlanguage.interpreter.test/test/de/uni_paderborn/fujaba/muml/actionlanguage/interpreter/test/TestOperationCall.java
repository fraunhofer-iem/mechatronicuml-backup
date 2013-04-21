package de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguageFactory;
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.ActionLanguageInterpreter;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;

public class TestOperationCall {
	private ActionlanguageFactory alFactory;
	private CommonExpressionsFactory expFactory;
	private RuntimeFactory runtimeFactory;
	private BehaviorFactory behaviourFactory;
	private TypesFactory typeFactory;

	private Block block;
	private Operation op;
	private OperationCall opCall;
	private Parameter parameter;

	private ActionLanguageInterpreter actionLanguageInterpreter;
	private Variable intA, intB;
	private VariableBinding varBindingIntA, varBindingIntB;
	private HashSet<VariableBinding> varBindings;
	private DataType intType, voidType;

	@Before
	public void setUp() {
		// set up factories
		alFactory = ActionlanguageFactory.eINSTANCE;
		actionLanguageInterpreter = new ActionLanguageInterpreter();
		runtimeFactory = RuntimeFactory.eINSTANCE;
		behaviourFactory = BehaviorFactory.eINSTANCE;
		expFactory = CommonExpressionsFactory.eINSTANCE;
		typeFactory = TypesFactory.eINSTANCE;

		// set up block for embedding of other expressions
		block = alFactory.createBlock();

		// set up data types
		intType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT);

		voidType = typeFactory.createPrimitiveDataType();
		((PrimitiveDataType) voidType).setPrimitiveType(PrimitiveTypes.VOID);

		// set up variables
		intA = behaviourFactory.createVariable();
		intA.setName("intA");
		intA.setDataType(intType);

		intB = behaviourFactory.createVariable();
		intB.setName("intB");
		intB.setDataType(intType);

		// set up variable bindings
		varBindings = new HashSet<VariableBinding>();

		varBindingIntA = runtimeFactory.createVariableBinding();
		varBindingIntA.setValue(0);
		varBindingIntA.setVariable(intA);

		varBindings.add(varBindingIntA);

		varBindingIntB = runtimeFactory.createVariableBinding();
		varBindingIntB.setValue(2);
		varBindingIntB.setVariable(intB);

		varBindings.add(varBindingIntB);

		// set up operation
		op = behaviourFactory.createOperation();

		// set up operation call
		opCall = alFactory.createOperationCall();
		opCall.setOperation(op);

	}

	@Test
	public void testNoParameters() throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		// set up implementation
		TypedNamedElementExpression tneExp = alFactory
				.createTypedNamedElementExpression();
		tneExp.setTypedNamedElement(intA);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp);

		LiteralExpression litExp = expFactory.createLiteralExpression();
		litExp.setValue("2");

		assignment.setRhs_assignExpression(litExp);

		op.getImplementations().add(assignment);
		op.setReturnType(voidType);

		actionLanguageInterpreter.evaluateExpression(varBindings, opCall);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(2));
		}

	}

	@Test
	public void testParameters() throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		parameter = behaviourFactory.createParameter();
		parameter.setDataType(intType);

		// set up implementation
		TypedNamedElementExpression tneExp = alFactory
				.createTypedNamedElementExpression();
		tneExp.setTypedNamedElement(intA);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp);

		TypedNamedElementExpression rhs = alFactory
				.createTypedNamedElementExpression();
		rhs.setTypedNamedElement(parameter);

		assignment.setRhs_assignExpression(rhs);

		op.getImplementations().add(assignment);
		op.getParameters().add(parameter);
		op.setReturnType(voidType);

		// create typed named element expression for intB
		TypedNamedElementExpression intBExp = alFactory
				.createTypedNamedElementExpression();
		intBExp.setTypedNamedElement(intB);

		// set up parameter bindings
		ParameterBinding parBinding = behaviourFactory.createParameterBinding();
		parBinding.setParameter(parameter);
		parBinding.setValue(intBExp);

		opCall.getParameterBinding().add(parBinding);

		actionLanguageInterpreter.evaluateExpression(varBindings, opCall);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(2));
		}

	}

	@Test
	public void testReturnValue() throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {

		// set up implementation
		TypedNamedElementExpression intBExp = alFactory
				.createTypedNamedElementExpression();
		intBExp.setTypedNamedElement(intB);

		ReturnStatement rtStatement = alFactory.createReturnStatement();
		rtStatement.setExpression(intBExp);

		block.getExpressions().add(rtStatement);

		op.getImplementations().add(block);
		op.setReturnType(intType);

		// set up with operation call and assignment
		TypedNamedElementExpression tneExp = alFactory
				.createTypedNamedElementExpression();
		tneExp.setTypedNamedElement(intA);

		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(tneExp);
		assignment.setRhs_assignExpression(opCall);

		actionLanguageInterpreter.evaluateExpression(varBindings, assignment);
		for (VariableBinding curVarBinding : varBindings) {
			if (curVarBinding.getVariable().equals(intA))
				assertTrue(curVarBinding.getValue().equals(2));
		}

	}
}
