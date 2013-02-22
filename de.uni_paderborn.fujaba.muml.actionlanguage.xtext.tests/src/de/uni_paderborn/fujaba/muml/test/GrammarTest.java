package de.uni_paderborn.fujaba.muml.test;

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
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.ArithmeticOperator;
import org.storydriven.core.expressions.common.ComparingOperator;
import org.storydriven.core.expressions.common.ComparisonExpression;
import org.storydriven.core.expressions.common.LiteralExpression;
import org.storydriven.core.expressions.common.LogicOperator;
import org.storydriven.core.expressions.common.LogicalExpression;
import org.storydriven.core.expressions.common.UnaryExpression;
import org.storydriven.core.expressions.common.UnaryOperator;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.component.HybridPort;
import de.uni_paderborn.fujaba.muml.actionlanguage.AssignOperator;
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.IncrementDecrementOperator;
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
/* commented out by cbr
import de.uni_paderborn.fujaba.muml.actionlanguage.VariableExpression;
	commented out by cbr */
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

@RunWith(XtextRunner.class)
public class GrammarTest {
	
	private static final String RTSC_FIXTURE = "fixtures/rtsc.fujaba";
	private static final String RTSC_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.realtimestatechart.category";
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
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := bar++ ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		TypedNamedElementExpression typedNamedElementExpression = (TypedNamedElementExpression) expression.getEnclosedExpression();
		assertEquals("bar", typedNamedElementExpression.getTypedNamedElement().getName());
		assertEquals(UnaryOperator.INCREMENT, expression.getOperator());
	}
	
	@Test
	public void testPostIncrementParentheses() {
		// post increment with parentheses
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := (bar)++ ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		assertEquals(UnaryOperator.INCREMENT, expression.getOperator());
	}
	
	@Test
	public void testPostIncrementParenthesesNoAttributeExpression() {
		// type checking should fail here (only attributes in parentheses)
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := (bar + 1) ++ ; }");
		assertTrue(expression.getEnclosedExpression() instanceof ArithmeticExpression);
		assertEquals(UnaryOperator.INCREMENT, expression.getOperator());
	}
	
	@Test
	public void testPostDecrement() {
		// post decrement
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := bar-- ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		assertEquals(UnaryOperator.DECREMENT, expression.getOperator());
	}

	@Test
	public void testUnaryExpressionPlus() {
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := +foo ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		assertEquals(UnaryOperator.PLUS, expression.getOperator());
	}
	
	@Test
	public void testUnaryExpressionPlusParentheses() {
		UnaryExpression expression = (UnaryExpression) getAssignmentRHS("{ foo := + (foo) ; }");
		assertTrue(expression.getEnclosedExpression() instanceof TypedNamedElementExpression);
		assertEquals(UnaryOperator.PLUS, expression.getOperator());
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
		assertTrue(expression.getLeftExpression() instanceof UnaryExpression);
		assertEquals(UnaryOperator.DECREMENT, ((UnaryExpression) expression.getLeftExpression()).getOperator());
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
		Block block = (Block) loadResult.getEObject();
		assertTrue(block.getExpressions().get(0) instanceof TriggerMessageExpression);
		TriggerMessageExpression triggerMessageExpression = (TriggerMessageExpression) block.getExpressions().get(0);
		assertEquals("m1", triggerMessageExpression.getMessageType().getName());
		assertEquals("i", triggerMessageExpression.getParameter().getName());
	}
	
	@Test
	public void testTriggerMessageExpression2() {
		Transition transition = rtsc.getTransitions().get(0);
		loadFromString("m1.i + m1.test", transition);
		assertFalse(loadResult.hasError());
		Block block = (Block) loadResult.getEObject();
		assertTrue(block.getExpressions().get(0) instanceof ArithmeticExpression);
		ArithmeticExpression expression = (ArithmeticExpression) block.getExpressions().get(0);
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
	public void testInvalidHybridPortReadWrite() {
		// TODO: this should be forbidden
		// the best is to add a check for this to the type analysis phase.
		// We could also disallow such an assignment with the help of the scope provider
		// but such checks are better done in the type analysis phase (IMHO)
		TypedNamedElementExpression typedNamedElementExpression = (TypedNamedElementExpression) getAssignmentRHS("{ hybridIn := hybridOut ; }");
		assertTrue(typedNamedElementExpression.getTypedNamedElement() instanceof HybridPort);
		assertEquals("hybridOut", typedNamedElementExpression.getTypedNamedElement().getName());
	}
	
	@Test
	public void testLocalVariableDecl() {
		loadFromString("{ INT i; INT xyz := 42; }");
		assertFalse(loadResult.hasError());
		assertNotNull(loadResult.getEObject());
		assertValidEObject(loadResult.getEObject());
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
