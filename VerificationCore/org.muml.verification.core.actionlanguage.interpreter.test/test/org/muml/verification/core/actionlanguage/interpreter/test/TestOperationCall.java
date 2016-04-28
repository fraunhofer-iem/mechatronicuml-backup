package org.muml.verification.core.actionlanguage.interpreter.test;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.actionlanguage.OperationCall;
import org.muml.pim.actionlanguage.ReturnStatement;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.verification.core.actionlanguage.interpreter.ActionLanguageInterpreter;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.VariableBinding;

public class TestOperationCall {
	private ActionlanguageFactory alFactory;
	private CommonExpressionsFactory expFactory;
	private RuntimeFactory runtimeFactory;
	private BehaviorFactory behaviourFactory;
	private TypesFactory typeFactory;

	private Block block;
	private Operation op, op1, op2;
	private OperationCall opCall, opCall1, opCall2;
	private Parameter parameter, parameterA, parameterB;

	private ActionLanguageInterpreter actionLanguageInterpreter;
	private Variable intA, intB;
	private VariableBinding varBindingIntA, varBindingIntB;
	private EList<VariableBinding> varBindings;
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
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

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
		varBindings = new BasicEList<VariableBinding>();

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
		op1 = behaviourFactory.createOperation();
		op2 = behaviourFactory.createOperation();

		// set up operation call
		opCall = alFactory.createOperationCall();
		opCall.setOperation(op);
		opCall1 = alFactory.createOperationCall();
		opCall1.setOperation(op1);
		opCall2 = alFactory.createOperationCall();
		opCall2.setOperation(op2);

	}

	/**
	 * op();
	 * 
	 * op(){ intA=2; }
	 * 
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
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

	/**
	 * op(intB);
	 * 
	 * op(int parameter){ intA=parameter; }
	 * 
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
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

	/**
	 * intA=op();
	 * 
	 * op(){ return intB; //which has value 2 in variableBindings }
	 * 
	 * @throws UnsupportedModellingElementException
	 * @throws VariableNotInitializedException
	 * @throws IncompatibleTypeException
	 */
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

//@formatter:off
	/**
	 * op1(2);
	 * 
	 * op1(int parameterA){ 
	 *  op2(intB);
	 * }
	 * 
	 * op2(int parameterB){ 
	 * 
	 *  intA=parameterA; //op2 should not be able to access parameterA
	 * 
	 *   }
	 * 
	 * @throws IncompatibleTypeException
	 * @throws UnsupportedModellingElementException
	 * 
	 */
//@formatter:on
	@Test
	public void testEmbeddedOperationCalls1()
			{
		// set up parameters
		parameterA = behaviourFactory.createParameter();
		parameterA.setDataType(intType);
		parameterA.setName("parameterA");

		parameterB = behaviourFactory.createParameter();
		parameterB.setDataType(intType);

		// set up typedNamedElementExpressions
		TypedNamedElementExpression intAExp = alFactory
				.createTypedNamedElementExpression();
		intAExp.setTypedNamedElement(intA);
		TypedNamedElementExpression intBExp = alFactory
				.createTypedNamedElementExpression();
		intBExp.setTypedNamedElement(intB);
		TypedNamedElementExpression paraAExp = alFactory
				.createTypedNamedElementExpression();
		paraAExp.setTypedNamedElement(parameterA);

		// set up literalExpression
		LiteralExpression litExp = expFactory.createLiteralExpression();
		litExp.setValue("2");

		// set up parameter bindings
		ParameterBinding parBindingA = behaviourFactory
				.createParameterBinding();
		parBindingA.setParameter(parameterA);
		parBindingA.setValue(litExp);
		ParameterBinding parBindingB = behaviourFactory
				.createParameterBinding();
		parBindingB.setParameter(parameterB);
		parBindingB.setValue(intBExp);

		// set up operation calls
		opCall1.getParameterBinding().add(parBindingA);
		opCall2.getParameterBinding().add(parBindingB);

		// set up assignment as implementation of op2
		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(intAExp);
		assignment.setRhs_assignExpression(paraAExp);

		// set up operations
		op1.getParameters().add(parameterA);
		op1.getImplementations().add(opCall2);
		op1.setReturnType(voidType);
		op1.setName("op1");
		op2.getParameters().add(parameterB);
		op2.getImplementations().add(assignment);
		op2.setReturnType(voidType);
		op2.setName("op2");

		try {
			actionLanguageInterpreter.evaluateExpression(varBindings, opCall1);
			assertTrue(false);
		} catch (VariableNotInitializedException e) {
			assertTrue(true);
		} catch (UnsupportedModellingElementException e) {
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//@formatter:off
	/**
	 * op1(2);
	 * 
	 * op1(int parameterA){ 
	 *  op2(intB);
	 *  intA=parameterB; //op1 should not be able to access parameterB
	 * }
	 * 
	 * op2(int parameterB){ 
	 *   }
	 * @throws IncompatibleTypeException 
	 * @throws UnsupportedModellingElementException 
	 * 
	 * 
	 */
	//@formatter:on
	@Test
	public void testEmbeddedOperationCalls2()
			throws UnsupportedModellingElementException,
			IncompatibleTypeException {

		// set up parameters
		parameterA = behaviourFactory.createParameter();
		parameterA.setDataType(intType);
		parameterA.setName("parameterA");

		parameterB = behaviourFactory.createParameter();
		parameterB.setDataType(intType);

		// set up typedNamedElementExpressions
		TypedNamedElementExpression intAExp = alFactory
				.createTypedNamedElementExpression();
		intAExp.setTypedNamedElement(intA);
		TypedNamedElementExpression intBExp = alFactory
				.createTypedNamedElementExpression();
		intBExp.setTypedNamedElement(intB);
		TypedNamedElementExpression paraBExp = alFactory
				.createTypedNamedElementExpression();
		paraBExp.setTypedNamedElement(parameterB);

		// set up literalExpression
		LiteralExpression litExp = expFactory.createLiteralExpression();
		litExp.setValue("2");

		// set up parameter bindings
		ParameterBinding parBindingA = behaviourFactory
				.createParameterBinding();
		parBindingA.setParameter(parameterA);
		parBindingA.setValue(litExp);
		ParameterBinding parBindingB = behaviourFactory
				.createParameterBinding();
		parBindingB.setParameter(parameterB);
		parBindingB.setValue(intBExp);

		// set up operation calls
		opCall1.getParameterBinding().add(parBindingA);
		opCall2.getParameterBinding().add(parBindingB);

		// set up assignment
		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(intAExp);
		assignment.setRhs_assignExpression(paraBExp);

		// set up block as implementation of op1
		block.getExpressions().add(opCall2);
		block.getExpressions().add(assignment);

		// set up empty block as implementation of op2
		Block emptyBlock = alFactory.createBlock();

		// set up operations
		op1.getParameters().add(parameterA);
		op1.getImplementations().add(block);
		op1.setReturnType(voidType);
		op1.setName("op1");
		op2.getParameters().add(parameterB);
		op2.getImplementations().add(emptyBlock);
		op2.setReturnType(voidType);
		op2.setName("op2");

		try {
			actionLanguageInterpreter.evaluateExpression(varBindings, opCall1);
			assertTrue(false);
		} catch (VariableNotInitializedException e) {
			assertTrue(true);
		}

	}

	//@formatter:off
	/**
	 * intC=2;
	 * op();
	 * 
	 * op(){
	 * intA=intC; //should not be possible
	 * }
	 * @throws IncompatibleTypeException  
	 * @throws UnsupportedModellingElementException 
	 * 
	 */
	//@formatter:on
	@Test
	public void testLocalVariable1()
			throws UnsupportedModellingElementException,
			VariableNotInitializedException, IncompatibleTypeException {
		// set up initialization expression
		LiteralExpression litExpression = expFactory.createLiteralExpression();
		litExpression.setValue("2");
		// set up inC
		Variable intC = behaviourFactory.createVariable();
		intC.setDataType(intType);
		intC.setInitializeExpression(litExpression);

		// set up declaration expression
		LocalVariableDeclarationStatement decExpression = alFactory
				.createLocalVariableDeclarationStatement();
		decExpression.setVariable(intC);
		
		// set up block
		block.getExpressions().add(decExpression);
		block.getExpressions().add(opCall);

		// set up tne expression for intC
		TypedNamedElementExpression intCExp = alFactory
				.createTypedNamedElementExpression();
		intCExp.setTypedNamedElement(intC);

		// set up tne expression for intA
		TypedNamedElementExpression intAExp = alFactory
				.createTypedNamedElementExpression();
		intAExp.setTypedNamedElement(intA);

		// set up Assignment
		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(intAExp);
		assignment.setRhs_assignExpression(intCExp);

		// set up op
		op.getImplementations().add(assignment);
		op.setReturnType(voidType);
		op.setName("op");

		try {
			actionLanguageInterpreter.evaluateExpression(varBindings, block);
			assertTrue(false);
		} catch (VariableNotInitializedException e) {
			assertTrue(true);
		}

	}

	//@formatter:off
	/**
	 * 
	 * op();
	 * intA=intC; //should not be possible
	 * 
	 * op(){
	 * intC=2; 
	 * }
	 * @throws IncompatibleTypeException 
	 * @throws UnsupportedModellingElementException 
	 * 
	 */
	//@formatter:on
	@Test
	public void testLocalVariable2()
			throws UnsupportedModellingElementException,
			IncompatibleTypeException {

		// set up initialization expression
		LiteralExpression litExpression = expFactory.createLiteralExpression();
		litExpression.setValue("2");
		// set up inC
		Variable intC = behaviourFactory.createVariable();
		intC.setDataType(intType);
		intC.setInitializeExpression(litExpression);

		// set up declaration expression
		LocalVariableDeclarationStatement decExpression = alFactory
				.createLocalVariableDeclarationStatement();
		decExpression.setVariable(intC);
	

		// set up tne expression for intC
		TypedNamedElementExpression intCExp = alFactory
				.createTypedNamedElementExpression();
		intCExp.setTypedNamedElement(intC);

		// set up tne expression for intA
		TypedNamedElementExpression intAExp = alFactory
				.createTypedNamedElementExpression();
		intAExp.setTypedNamedElement(intA);

		// set up Assignment
		Assignment assignment = alFactory.createAssignment();
		assignment.setLhs_typedNamedElementExpression(intAExp);
		assignment.setRhs_assignExpression(intCExp);

		// set up block
		block.getExpressions().add(opCall);
		block.getExpressions().add(assignment);

		// set up op
		op.getImplementations().add(decExpression);
		op.setReturnType(voidType);
		op.setName("op");

		try {
			actionLanguageInterpreter.evaluateExpression(varBindings, block);
			assertTrue(false);
		} catch (VariableNotInitializedException e) {
			assertTrue(true);
		}

	}
	
	
}
