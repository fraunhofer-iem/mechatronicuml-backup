package org.muml.pim.actionlanguage.xtext.tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;
import org.muml.mumlcore.expressions.common.ArithmeticExpression;
import org.muml.mumlcore.expressions.common.ArithmeticOperator;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.mumlcore.expressions.common.ComparisonExpression;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.mumlcore.expressions.common.LogicOperator;
import org.muml.mumlcore.expressions.common.LogicalExpression;
import org.muml.mumlcore.expressions.common.UnaryExpression;
import org.muml.mumlcore.expressions.common.UnaryOperator;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.actionlanguage.ArrayInitializeExpression;
import org.muml.pim.actionlanguage.AssignOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.IncrementDecrementOperator;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.actionlanguage.NondeterministicChoiceExpression;
import org.muml.pim.actionlanguage.OperationCall;
import org.muml.pim.actionlanguage.TriggerMessageExpression;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.HybridPort;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Transition;

@RunWith(XtextRunner.class)
public class GrammarTest {
	
	private static final String RTSC_FIXTURE = "fixtures/rtsc.fujaba";
	private static final String RTSC_CATEGORY_KEY = "org.muml.realtimestatechart.category";
	private RealtimeStatechart rtsc;
	private ILoadResult loadResult;
	
	@Before
	public void setUpLoadResult() {
		loadResult = null;
	}
	
	@Before
	public void setUpScope() {
		// load fixture file
		Map<String, Object> map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
	    map.put("fujaba", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.getResource(URI.createURI(RTSC_FIXTURE), true);
		RootNode root = (RootNode) res.getContents().get(0);
		root.getCategories();
		ModelElementCategory modelElementCategory = new ModelElementCategoryRegistry(false)
			.getModelElementCategory(root, RTSC_CATEGORY_KEY);
		rtsc = (RealtimeStatechart) modelElementCategory.getModelElements().get(0);
	}
	
	@Test
	public void testArithmeticExpression1() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ foo := 2 + 2; }");
		assertEquals(ArithmeticOperator.PLUS, expression.getOperator());
		assertTrue(expression.getLeftExpression() instanceof LiteralExpression);
		assertTrue(expression.getRightExpression() instanceof LiteralExpression);
	}
	
	@Test
	public void testArithmeticExpression2() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ bar := foo / 2; }");
		assertEquals(ArithmeticOperator.DIVIDE, expression.getOperator());
		assertTrue(expression.getLeftExpression() instanceof TypedNamedElementExpression);
		assertEquals("foo", ((TypedNamedElementExpression) expression.getLeftExpression()).getTypedNamedElement().getName());
		assertNotNull(expression.getRightExpression());
	}
	
	@Test
	public void testArithmeticExpression3() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ bar := call() * 1; }");
		assertEquals(ArithmeticOperator.TIMES, expression.getOperator());
		assertTrue(expression.getLeftExpression() instanceof OperationCall);
		assertEquals("call", ((OperationCall) expression.getLeftExpression()).getOperation().getName());
		assertNotNull(expression.getRightExpression());
	}
	
	@Test
	public void testArithmeticExpression4() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ bar := 4 * 3 + 1; }");
		// check precedence
		assertEquals(ArithmeticOperator.PLUS, expression.getOperator());
		assertTrue(expression.getLeftExpression() instanceof ArithmeticExpression);
		assertEquals(ArithmeticOperator.TIMES, ((ArithmeticExpression) expression.getLeftExpression()).getOperator());
		assertNotNull(expression.getRightExpression());
	}
	
	@Test
	public void testArithmeticExpression5() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ bar := 4 * (3 + 1) ; }");
		// check precedence
		assertEquals(ArithmeticOperator.TIMES, expression.getOperator());
		assertTrue(expression.getRightExpression() instanceof ArithmeticExpression);
		assertEquals(ArithmeticOperator.PLUS, ((ArithmeticExpression) expression.getRightExpression()).getOperator());
		assertNotNull(expression.getLeftExpression());
	}

	@Test
	public void testComparisonExpression1() {
		ComparisonExpression expression = (ComparisonExpression) getAssignmentRHS("{ b := 5 < 8; }");
		assertTrue(expression.getLeftExpression() instanceof LiteralExpression);
		assertTrue(expression.getRightExpression() instanceof LiteralExpression);
		assertEquals(ComparingOperator.LESS, expression.getOperator());
	}
	
	@Test
	public void testComparisonExpression2() {
		ComparisonExpression expression = (ComparisonExpression) getAssignmentRHS("{ b := 5 < 8 == b >= 3; }");
		assertTrue(expression.getLeftExpression() instanceof ComparisonExpression);
		assertTrue(expression.getRightExpression() instanceof ComparisonExpression);
		// check precedence
		assertEquals(ComparingOperator.EQUAL, expression.getOperator());
		assertEquals(ComparingOperator.LESS, ((ComparisonExpression) expression.getLeftExpression()).getOperator());
		assertEquals(ComparingOperator.GREATER_OR_EQUAL, ((ComparisonExpression) expression.getRightExpression()).getOperator());
	}
	
	@Test
	public void testComparisonExpression3() {
		ComparisonExpression expression = (ComparisonExpression) getAssignmentRHS("{ b := b < 8 <> 5 < bool_op() ; }");
		assertTrue(expression.getLeftExpression() instanceof ComparisonExpression);
		assertTrue(expression.getRightExpression() instanceof ComparisonExpression);
		// check precedence
		assertEquals(ComparingOperator.UNEQUAL, expression.getOperator());
		assertEquals(ComparingOperator.LESS, ((ComparisonExpression) expression.getLeftExpression()).getOperator());
		assertEquals(ComparingOperator.LESS, ((ComparisonExpression) expression.getRightExpression()).getOperator());
	}
	
	@Test
	public void testComparisonExpression4() {
		ComparisonExpression expression = (ComparisonExpression) getAssignmentRHS("{ b := 5 + 1 < 7; }");
		assertTrue(expression.getLeftExpression() instanceof ArithmeticExpression);
		assertTrue(expression.getRightExpression() instanceof LiteralExpression);
		assertEquals(ArithmeticOperator.PLUS, ((ArithmeticExpression) expression.getLeftExpression()).getOperator());
		assertEquals(ComparingOperator.LESS, expression.getOperator());
	}
	
	@Test
	public void testComparisonExpression5() {
		ComparisonExpression expression = (ComparisonExpression) getAssignmentRHS("{ b := 5 + 1 < 7 == 9 > 8; }");
		assertTrue(expression.getLeftExpression() instanceof ComparisonExpression);
		assertTrue(expression.getRightExpression() instanceof ComparisonExpression);
		ComparisonExpression left = (ComparisonExpression) expression.getLeftExpression();
		assertEquals(ComparingOperator.LESS, left.getOperator());
		assertTrue(left.getLeftExpression() instanceof ArithmeticExpression);
		assertTrue(left.getRightExpression() instanceof LiteralExpression);
		assertEquals(ArithmeticOperator.PLUS, ((ArithmeticExpression) left.getLeftExpression()).getOperator());
		ComparisonExpression right = (ComparisonExpression) expression.getRightExpression();
		assertEquals(ComparingOperator.GREATER, right.getOperator());
		assertTrue(right.getLeftExpression() instanceof LiteralExpression);
		assertTrue(right.getRightExpression() instanceof LiteralExpression);
		assertEquals(ComparingOperator.EQUAL, expression.getOperator());
	}
	
	@Test
	public void testComparisonExpressionInvalid1() {
		loadFromString("{ b := 5 < 8 > 7 ; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testLogicalExpression1() {
		LogicalExpression expression = (LogicalExpression) getAssignmentRHS("{ b := 7 > bar && b ; }");
		assertTrue(expression.getLeftExpression() instanceof ComparisonExpression);
		assertTrue(expression.getRightExpression() instanceof TypedNamedElementExpression);
		assertEquals(LogicOperator.AND, expression.getOperator());
	}
	
	@Test
	public void testLogicalExpression2() {
		LogicalExpression expression = (LogicalExpression) getAssignmentRHS("{ b := 7 > bar || 9 + 7 < 15 && b ; }");
		assertTrue(expression.getLeftExpression() instanceof ComparisonExpression);
		assertTrue(expression.getRightExpression() instanceof LogicalExpression);
		assertEquals(LogicOperator.AND, ((LogicalExpression) expression.getRightExpression()).getOperator());
		assertEquals(LogicOperator.OR, expression.getOperator());
	}
	
	@Test
	public void testLogicalExpression3() {
		// that grammar allows it even though it is nonsense (type checking has to detect it)
		LogicalExpression expression = (LogicalExpression) getAssignmentRHS("{ b := 5 + 9 && 7 ; }");
		assertTrue(expression.getLeftExpression() instanceof ArithmeticExpression);
		assertTrue(expression.getRightExpression() instanceof LiteralExpression);
		assertEquals(LogicOperator.AND, expression.getOperator());
	}

	@Test
	public void testLogicalExpressionParentheses() {
		LogicalExpression expression = (LogicalExpression) getAssignmentRHS("{ b := (b || not b) && b ; }");
		assertTrue(expression.getLeftExpression() instanceof LogicalExpression);
		assertEquals(LogicOperator.OR, ((LogicalExpression) expression.getLeftExpression()).getOperator());
		assertTrue(expression.getRightExpression() instanceof TypedNamedElementExpression);
		assertEquals(LogicOperator.AND, expression.getOperator());
	}
	
	@Test
	public void testAssignment1() {
		Assignment assignment = (Assignment) getModel("{ bar := foo + 9 ; }");
		assertTrue(assignment.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		assertTrue(assignment.getRhs_assignExpression() instanceof ArithmeticExpression);
		assertEquals(AssignOperator.ASSIGN, assignment.getAssignOperator());
		assertEquals(IncrementDecrementOperator.UNSET, assignment.getIncrementDecrementOperator());
	}
	
	@Test
	public void testAssignment2() {
		Assignment assignment = (Assignment) getModel("{ bar += call() ; }");
		assertTrue(assignment.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		assertEquals("bar", assignment.getLhs_typedNamedElementExpression().getTypedNamedElement().getName());
		assertTrue(assignment.getRhs_assignExpression() instanceof OperationCall);
		assertEquals(AssignOperator.PLUS_EQUAL, assignment.getAssignOperator());
		assertEquals(IncrementDecrementOperator.UNSET, assignment.getIncrementDecrementOperator());
	}
	
	@Test
	public void testAssignment3() {
		Assignment assignment = (Assignment) getModel("{ bar -= 7 ; }");
		assertTrue(assignment.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		assertTrue(assignment.getRhs_assignExpression() instanceof LiteralExpression);
		assertEquals(AssignOperator.MINUS_EQUAL, assignment.getAssignOperator());
		assertEquals(IncrementDecrementOperator.UNSET, assignment.getIncrementDecrementOperator());
	}
	
	@Test
	public void testPostIncrement() {
		// post increment
		Assignment expression = (Assignment) getAssignmentRHS("{ foo := bar++ ; }");
		assertTrue(expression.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		TypedNamedElementExpression typedNamedElementExpression = expression.getLhs_typedNamedElementExpression();
		assertEquals("bar", typedNamedElementExpression.getTypedNamedElement().getName());
		assertEquals(IncrementDecrementOperator.INCREMENT, expression.getIncrementDecrementOperator());
	}
	
	@Test
	public void testPostIncrementTopLevel() {
		// post increment top level
		Assignment expression = (Assignment) getModel("{ bar++ ; }");
		assertTrue(expression.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		TypedNamedElementExpression typedNamedElementExpression = expression.getLhs_typedNamedElementExpression();
		assertEquals("bar", typedNamedElementExpression.getTypedNamedElement().getName());
		assertEquals(IncrementDecrementOperator.INCREMENT, expression.getIncrementDecrementOperator());
	}
	
	@Test
	public void testPostIncrementParentheses() {
		// post increment with parentheses
		loadFromString("{ foo := (bar)++ ; }");
		assertTrue(loadResult.hasError());
	}
	
	@Test
	public void testPostIncrementParenthesesNoAttributeExpression() {
		// only typed named elements are allowed
		loadFromString("{ foo := (bar + 1) ++ ; }");
		assertTrue(loadResult.hasError());
	}
	
	@Test
	public void testPostDecrement() {
		// post decrement
		Assignment expression = (Assignment) getAssignmentRHS("{ foo := bar-- ; }");
		assertTrue(expression.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		assertEquals(IncrementDecrementOperator.DECREMENT, expression.getIncrementDecrementOperator());
	}
	
	@Test
	public void testPostDecrementTopLevel() {
		// post decrement top level
		Assignment expression = (Assignment) getModel("{ bar-- ; }");
		assertTrue(expression.getLhs_typedNamedElementExpression() instanceof TypedNamedElementExpression);
		assertEquals(IncrementDecrementOperator.DECREMENT, expression.getIncrementDecrementOperator());
	}
	
	@Test
	public void testUnaryExpressionMinus() {
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := -foo ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		assertEquals(UnaryOperator.MINUS, expression.getOperator());
	}
	
	@Test
	public void testUnaryInArithmeticExpression() {
		ArithmeticExpression expression = (ArithmeticExpression) getAssignmentRHS("{ bar := bar-- + 4 ; }");
		assertEquals(ArithmeticOperator.PLUS, expression.getOperator());
		assertTrue(expression.getLeftExpression() instanceof Assignment);
		assertEquals(IncrementDecrementOperator.DECREMENT, ((Assignment) expression.getLeftExpression()).getIncrementDecrementOperator());
		assertTrue(expression.getRightExpression() instanceof LiteralExpression);
	}
	
	@Test
	public void testGuardSyntax1() {
		loadFromString("bar > 9 && b || foo == 9");
		assertFalse(loadResult.hasError());
	}
	
	@Test
	public void testGuardSyntax2() {
		// this is no valid guard expression (because it is no boolean)
		// we have to fix this later
		loadFromString("42");
		assertFalse(loadResult.hasError());
	}
	
	@Test
	public void testTriggerMessageExpression1() {
		Transition transition = rtsc.getTransitions().get(0);
		loadFromString("m1.i", transition);
		assertFalse(loadResult.hasError());
		TriggerMessageExpression triggerMessageExpression = (TriggerMessageExpression) loadResult.getEObject();
		assertEquals("m1", triggerMessageExpression.getMessageType().getName());
		assertEquals("i", triggerMessageExpression.getParameter().getName());
	}
	
	@Test
	public void testTriggerMessageExpression2() {
		Transition transition = rtsc.getTransitions().get(0);
		loadFromString("m1.i + m1.test", transition);
		assertFalse(loadResult.hasError());
		ArithmeticExpression expression = (ArithmeticExpression) loadResult.getEObject();
		// left expression
		assertTrue(expression.getLeftExpression() instanceof TriggerMessageExpression);
		TriggerMessageExpression triggerMessageExpression = (TriggerMessageExpression) expression.getLeftExpression();
		assertEquals("m1", triggerMessageExpression.getMessageType().getName());
		assertEquals("i", triggerMessageExpression.getParameter().getName());
		// right expression
		assertTrue(expression.getRightExpression() instanceof TriggerMessageExpression);
		triggerMessageExpression = (TriggerMessageExpression) expression.getRightExpression();
		assertEquals("m1", triggerMessageExpression.getMessageType().getName());
		assertEquals("test", triggerMessageExpression.getParameter().getName());
	}
	
	@Test
	public void testHybridPortRead() {
		TypedNamedElementExpression typedNamedElementExpression = (TypedNamedElementExpression) getAssignmentRHS("{ foo := hybridIn ; }");
		assertTrue(typedNamedElementExpression.getTypedNamedElement() instanceof HybridPort);
		assertEquals("hybridIn", typedNamedElementExpression.getTypedNamedElement().getName());
	}
	
	@Test
	public void testHybridPortWrite() {
		Assignment assignment = (Assignment) getModel("{ hybridOut := foo; }");
		assertTrue(assignment.getLhs_typedNamedElementExpression().getTypedNamedElement() instanceof HybridPort);
		assertEquals("hybridOut", assignment.getLhs_typedNamedElementExpression().getTypedNamedElement().getName());
	}
	
	@Test
	public void testInvalidHybridInPortWrite() {
		// do not assign to an in port
		loadFromString("{ hybridIn := bar ; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testValidHybridOutPortRead() {
		// a hybrid out port is also readable #375
		loadFromString("{ bar := hybridOut ; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		assertValidEObject(loadResult.getEObject());
	}
	
	@Test
	public void testLocalVariableDecl() {
		loadFromString("{ INT i; INT xyz := 42; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		assertValidEObject(loadResult.getEObject());
		Block block = (Block) loadResult.getEObject();
		assertEquals(2, block.getExpressions().size());
		LocalVariableDeclarationStatement localVariableDeclarationStatement = (LocalVariableDeclarationStatement) block.getExpressions().get(1);
		assertNotNull(localVariableDeclarationStatement.getVariable());
		assertEquals("xyz", localVariableDeclarationStatement.getVariable().getName());
		assertFalse(localVariableDeclarationStatement.getVariable().isConstant());
		assertNotNull(localVariableDeclarationStatement.getVariable().getInitializeExpression());
	}
	
	@Test
	public void testLocalVariableDDiagnosticeclInDifferentBlocks() {
		loadFromString("{ INT i; if (2 == 2) { INT q := 42; } }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		assertValidEObject(loadResult.getEObject());
	}
	
	@Test
	public void testLocalVariableDeclUniqueNamesViolated() {
		loadFromString("{ INT i; INT i := 0; }");
		// the next two assertions hold because it is no parse error
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		// validation is supposed to fail
		assertInvalidEObject(loadResult.getEObject());
	}
	
	@Test
	public void testLocalVariableDeclInDifferentBlocksUniqueNamesViolated() {
		loadFromString("{ INT i; if (2 == 2) { INT i := 42; } }");
		// the next two assertions hold because it is no parse error
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		// validation is supposed to fail
		assertInvalidEObject(loadResult.getEObject());
	}
	
	@Test
	public void testLocalConstantDecl() {
		EObject expression = getModel("{ const INT myConst := 3; }");
		assertTrue(expression instanceof LocalVariableDeclarationStatement);
		LocalVariableDeclarationStatement decl = (LocalVariableDeclarationStatement) expression;
		assertTrue(decl.getVariable().isConstant());
	}
	
	@Test
	public void testLocalConstantDeclNoInit() {
		loadFromString("{ const INT myConst; }");
		assertTrue(loadResult.hasError());
	}
	
	@Test
	public void testLocalConstantNoAssignmentAfterDecl() {
		loadFromString("{ const INT myConst := 3; myConst := 7; }");
		assertTrue(loadResult.hasError());
	}
	
	@Test
	public void testNoAssignmentToRTSCConstant() {
		loadFromString("{ constant := 7; }");
		assertTrue(loadResult.hasError());
	}
	
	@Test
	public void testOperationImplementation() {
		Operation operation = rtsc.getOperations().get(1);
		assertTrue(operation.getParameters().size() == 2);
		loadFromString("{ p1 := p2 + 3; }", operation);
		assertFalse(loadResult.hasError());
		Block block = (Block) loadResult.getEObject();
		assertTrue(block.getExpressions().get(0) instanceof Assignment);
		Assignment assignment = (Assignment) block.getExpressions().get(0);
		TypedNamedElement lhs = assignment.getLhs_typedNamedElementExpression().getTypedNamedElement();
		assertTrue(lhs instanceof Parameter);
		assertEquals("p1", lhs.getName());
	}
	
	@Test
	public void testOperationCallStatement() {
		loadFromString("{ callp(p1 := 42, p2 := 21) ; }");
		assertFalse(loadResult.hasError());
	}
	
	@Test
	public void testOperationCallAsParameter() {
		loadFromString("{ callp(p1 := call(), p2 := callp(p1 := 3, p2 := 4)) ; }");
		assertFalse(loadResult.hasError());
	}
	
	@Test
	public void testArrayInitializeExpression() {
		// intArray is an array
		EObject expression = getAssignmentRHS("{ intArray := [ 1 + 1, 2, call(), 4 ] ; }");
		assertTrue(expression instanceof ArrayInitializeExpression);
		ArrayInitializeExpression arrayInitializeExpression = (ArrayInitializeExpression) expression; 
		assertEquals(4, arrayInitializeExpression.getExpressions().size());
		assertTrue(arrayInitializeExpression.getExpressions().get(0) instanceof ArithmeticExpression);
		assertTrue(arrayInitializeExpression.getExpressions().get(2) instanceof OperationCall);
	}
	
	@Test
	public void testMultiDimensionalArrayInitializeExpression() {
		// multArray is a 2x3x2 array
		String initializer = "[ [ [1, 2], [3, 4], [5, 6] ], [ [7, 8], [9, 10], [11, 12] ] ]";
		EObject expression = getAssignmentRHS("{ multArray := " + initializer + " ; }");
		assertTrue(expression instanceof ArrayInitializeExpression);
		ArrayInitializeExpression arrayInitializeExpression = (ArrayInitializeExpression) expression; 
		assertEquals(2, arrayInitializeExpression.getExpressions().size());
		assertTrue(arrayInitializeExpression.getExpressions().get(0) instanceof ArrayInitializeExpression);
		assertTrue(arrayInitializeExpression.getExpressions().get(1) instanceof ArrayInitializeExpression);
		ArrayInitializeExpression firstInitializer = (ArrayInitializeExpression) arrayInitializeExpression.getExpressions().get(0);
		ArrayInitializeExpression secondInitializer = (ArrayInitializeExpression) arrayInitializeExpression.getExpressions().get(1);
		// check firstInitializer
		assertEquals(3, firstInitializer.getExpressions().size());
		assertTrue(firstInitializer.getExpressions().get(0) instanceof ArrayInitializeExpression);
		arrayInitializeExpression = (ArrayInitializeExpression) firstInitializer.getExpressions().get(0); 
		assertEquals(2, arrayInitializeExpression.getExpressions().size());
		assertTrue(arrayInitializeExpression.getExpressions().get(0) instanceof LiteralExpression);
		assertTrue(arrayInitializeExpression.getExpressions().get(1) instanceof LiteralExpression);
		// just test the second element
		assertEquals("2", ((LiteralExpression) arrayInitializeExpression.getExpressions().get(1)).getValue());
		// check secondInitializer
		assertEquals(3, secondInitializer.getExpressions().size());
		assertTrue(secondInitializer.getExpressions().get(0) instanceof ArrayInitializeExpression);
		arrayInitializeExpression = (ArrayInitializeExpression) secondInitializer.getExpressions().get(2); 
		assertEquals(2, arrayInitializeExpression.getExpressions().size());
		assertTrue(arrayInitializeExpression.getExpressions().get(0) instanceof LiteralExpression);
		assertTrue(arrayInitializeExpression.getExpressions().get(1) instanceof LiteralExpression);
		// just test the first element
		assertEquals("11", ((LiteralExpression) arrayInitializeExpression.getExpressions().get(0)).getValue());
	}
	
	@Test
	public void testInvalidArrayInitializeExpression() {
		// an empty array initializer is not supported because it (probably) makes no
		// sense in our actionlanguage
		loadFromString("{ intArray := []; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testTopLevelArrayInitializeExpression() {
		loadFromString("[1, 4, 5]");
		assertFalse(loadResult.hasError());
		assertTrue(loadResult.getEObject() instanceof ArrayInitializeExpression);
	}
	
	@Test
	public void testLocalArrayDeclarationAndInitialization1() {
		// in fact this is simply a local variable declaration + array initialization
		loadFromString("{ INTARRAY localArray := [1, 2, 3, 4, 5]; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
	}
	
	@Test
	public void testLocalArrayDeclarationAndInitialization2() {
		// check if brackets in the datatype's name are supported
		loadFromString("{ INT[2][5] lArray := [ [1, 2, 3, 4, 5], [6, 7, 8, 9, 10] ]; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
	}
	
	@Test
	public void testGuardExpression() {
		loadFromString("bar + 7 < 42");
		assertFalse(loadResult.hasError());
		assertTrue(loadResult.getEObject() instanceof ComparisonExpression);
	}
	
	@Test
	public void testNondeterministicChoiceExpression() {
		NondeterministicChoiceExpression expression = (NondeterministicChoiceExpression) getAssignmentRHS("{ foo := INT<2,4>; }");
		assertNotNull(expression.getDataType());
		assertEquals("INT", expression.getDataType().getName());
		assertNotNull(expression.getRange());
		assertEquals(2, expression.getRange().getLowerBound());
		assertEquals(4, expression.getRange().getUpperBound());	
	}
	
	@Test
	public void testNondeterministicChoiceExpressionInvalidType() {
		// only INT datatype is supported
		loadFromString("{ foo := DOUBLE<2,4>; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testNoStringLiterals() {
		loadFromString("{ foo := \"foobar\"; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testNoEqualMinusOperator() {
		loadFromString("{ foo =- 2; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testNoEqualPlusOperator() {
		loadFromString("{ foo =+ 1; }");
		assertTrue(loadResult.hasError());
		assertNull(loadResult.getEObject());
	}
	
	@Test
	public void testValidMinusEqualOperator() {
		loadFromString("{ foo -= 2; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
	}
	
	@Test
	public void testValidPlusEqualOperator() {
		loadFromString("{ foo += 1; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
	}
	
	protected static void assertValidEObject(EObject object) {
		assertTrue(validEObject(object));
	}
	
	protected static void assertInvalidEObject(EObject object) {
		assertFalse(validEObject(object));
	}
	
	protected static boolean validEObject(EObject object) {
		// TODO: file bug: we cannot pass null as context object
		// (although according to the EValidator interface it is ok)
		Map<Object, Object> context = new HashMap<Object, Object>();
		return Diagnostician.INSTANCE.validate(object, null, context);
	}
	
	protected EObject getAssignmentRHS(String text) {
		Assignment assignment = (Assignment) getModel(text);
		EObject expression = assignment.getRhs_assignExpression();
		assertNotNull(expression);
		return expression;
	}
	
	protected EObject getModel(String text) {
		loadFromString(text);
		Block block = (Block) loadResult.getEObject();
		assertNotNull(loadResult.getError(), block);
		assertTrue(block.getExpressions().size() >= 1);
		return block.getExpressions().get(0);
	}
	
	protected void loadFromString(String text) {
		loadFromString(text, rtsc);
	}
	
	protected void loadFromString(String text, EObject object) {
		loadResult = LanguageResource.loadFromString(text, object);
	}

}
