package de.uni_paderborn.fujaba.simulink.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class BusTest extends TestBase
{
	SimulinkFactory factory = null;
		
	@Before
	public void setUp()
	{		
		this.factory = SimulinkFactory.eINSTANCE;
	}
	
	@After
	public void tearDown()
	{
		this.factory = null;
	}
	
	@Test
	public void busNeedsName()
	{
		Bus bus = this.factory.createBus();
		assertModelIsNotValid(bus);
		bus.setName("Bus");
		assertModelIsValid(bus);
	}
}
