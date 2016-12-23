package org.muml.simulink.adapter.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.adapter.parser.StateLabelParser.LabelString;

public class StateLabelParserTest 
{
	private StateLabelParser parser = null;
	
	@Before
	public void setUp()
	{
		this.parser = new StateLabelParser();
	}
	
	@After
	public void tearDown()
	{
		this.parser = null;
	}
	
	@Test
	public void nameOnly()
	{
		final String name = "TestName";
		LabelString result = this.parser.parseLabelString(name);
		assertEquals(name, result.name);		
	}
	
	@Test
	public void allOptionsEntryFirst()
	{
		LabelString result = this.parser.parseLabelString("State\\nentry: doEntry()\\nduring: doDuring()\\nexit: doExit()");
		assertEquals("State", result.name);
		assertEquals("doEntry()", result.entryAction);
		assertEquals("doDuring()", result.duringAction);
		assertEquals("doExit()", result.exitAction);
	}
	
	@Test
	public void allOptionsDuringFirst()
	{
		LabelString result = this.parser.parseLabelString("State\\nduring: doDuring()\\nentry: doEntry()\\nexit: doExit()");
		assertEquals("State", result.name);
		assertEquals("doEntry()", result.entryAction);
		assertEquals("doDuring()", result.duringAction);
		assertEquals("doExit()", result.exitAction);
	}	
	
	@Test
	public void allOptionsExitFirst()
	{
		LabelString result = this.parser.parseLabelString("State\\nexit: doExit()\\nduring: doDuring()\\nentry: doEntry()");
		assertEquals("State", result.name);
		assertEquals("doEntry()", result.entryAction);
		assertEquals("doDuring()", result.duringAction);
		assertEquals("doExit()", result.exitAction);
	}		
	
	@Test
	public void nameEntryOnly()
	{
		LabelString result = this.parser.parseLabelString("State\\nentry: doEntry()");
		assertEquals("State", result.name);
		assertEquals("doEntry()", result.entryAction);
		assertNull(result.duringAction);
		assertNull(result.exitAction);	
	}
	
	

}
