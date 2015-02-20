package de.uni_paderborn.fujaba.simulink.model.stateflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class StateTest extends TestBase 
{
	private StateflowFactory factory = null;
	
	@Before
	public void setUp()
	{
		this.factory = StateflowFactory.eINSTANCE;
	}
	
	@After
	public void tearDown()
	{
		this.factory = null;
	}
	
	@Test
	public void getSubState()
	{
		State state = this.factory.createState();
		
		final String subStateAName = "A";
		State subStateA = this.factory.createState();
		subStateA.setName(subStateAName);
		state.getNodes().add(subStateA);
		
		final String subStateBName = "B";
		State subStateB = this.factory.createState();
		subStateB.setName(subStateBName);
		state.getNodes().add(subStateB);
		
		assertEquals(subStateA, state.getSubState(subStateAName));
		assertEquals(subStateB, state.getSubState(subStateBName));
		
		assertNull( state.getSubState("Not Existing"));
	}

}
