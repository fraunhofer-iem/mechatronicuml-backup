package de.uni_paderborn.fujaba.muml.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;

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
		assertTrue(expression.getLeftExpression() instanceof AttributeExpression);
		assertEquals("foo", ((AttributeExpression) expression.getLeftExpression()).getAttribute().getName());
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
	
	// TODO: unary expressions in an arithmetic expression
	
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
		assertTrue(expression.getRightExpression() instanceof AttributeExpression);
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
		loadResult = LanguageResource.loadFromString(text, rtsc);
	}

}
