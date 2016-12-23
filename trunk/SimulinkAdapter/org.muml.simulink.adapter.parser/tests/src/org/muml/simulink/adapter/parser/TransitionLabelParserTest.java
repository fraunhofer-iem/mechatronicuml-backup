package org.muml.simulink.adapter.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.adapter.parser.TransitionLabelParser.Label;


public class TransitionLabelParserTest 
{
	private TransitionLabelParser parser = null;
	
	@Before
	public void setUp()
	{
		this.parser = new TransitionLabelParser();
	}
	
	@After
	public void tearDown()
	{
		this.parser = null;
	}
	
	@Test
	public void eventOnly()
	{
		Label res = this.parser.parseLabel("event");
		assertEquals("event", res.event);
		assertNull(res.condition);
		assertNull(res.conditionAction);
		assertNull(res.transitionAction);
	}
	
	@Test
	public void conditionOnly()
	{
		Label res = this.parser.parseLabel("[condition]");
		assertEquals("condition", res.condition[0]);
		assertNull(res.event);
		assertNull(res.conditionAction);
		assertNull(res.transitionAction);		
	}
	
	@Test
	public void conditionActionOnly()
	{
		Label res = this.parser.parseLabel("{conditionAction()}");
		assertEquals("conditionAction()", res.conditionAction);
		assertNull(res.event);
		assertNull(res.condition);
		assertNull(res.transitionAction);		
	}
	
	@Test
	public void transitionActionOnly()
	{
		Label res = this.parser.parseLabel("/transitionAction()");
		assertEquals("transitionAction()", res.transitionAction);
		assertNull(res.event);
		assertNull(res.condition);
		assertNull(res.conditionAction);		
	}		
	
	@Test
	public void all()
	{
		Label res = this.parser.parseLabel("event [condition]{conditionAction()}/transitionAction()");
		assertEquals("transitionAction()", res.transitionAction);
		assertEquals("event", res.event);
		assertEquals("condition", res.condition[0]);
		assertEquals("conditionAction()",res.conditionAction);
		assertEquals("transitionAction()", res.transitionAction);
	}
	
	/**
	 * A multiline is not separated by a \n; instead the parser returns a \\n
	 */
	@Test
	public void allMultiline()
	{
		Label res = this.parser.parseLabel("event\\n [condition]\\n {conditionAction()}\\n /transitionAction()");
		assertEquals("event", res.event);
		assertEquals("condition", res.condition[0]);
		assertEquals("conditionAction()",res.conditionAction);
		assertEquals("transitionAction()", res.transitionAction);
	}
	
	@Test
	public void splitConditions()
	{
		Label res1 = this.parser.parseLabel("[A]");
		assertEquals(1, res1.condition.length);
		assertEquals("A", res1.condition[0]);
		
		Label res2 = this.parser.parseLabel("[A&&B]");
		assertEquals(2, res2.condition.length);
		assertEquals("A", res2.condition[0]);
		assertEquals("B", res2.condition[1]);
		
		Label res21 = this.parser.parseLabel("[A && B]");
		assertEquals(2, res21.condition.length);
		assertEquals("A", res21.condition[0]);
		assertEquals("B", res21.condition[1]);		
		
		Label res3 = this.parser.parseLabel("[(A) && (B)]");
		assertEquals(2, res3.condition.length);
		assertEquals("A", res3.condition[0]);
		assertEquals("B", res3.condition[1]);
		
		Label res4 = this.parser.parseLabel("[(A) && (B && C)]");
		assertEquals(2, res4.condition.length);
		assertEquals("A", res4.condition[0]);
		assertEquals("B && C", res4.condition[1]);	
		
		Label res5 = this.parser.parseLabel("[(A) && ((B) && (C))]");
		assertEquals(2, res5.condition.length);
		assertEquals("A", res5.condition[0]);
		assertEquals("(B) && (C)", res5.condition[1]);				
	}

}
