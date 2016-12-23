package org.muml.simulink;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.muml.simulink.test.TestBase;

public class BusSelectorTest extends TestBase 
{
	@Test
	public void busReference()
	{
		Bus bus = SimulinkFactory.eINSTANCE.createBus();
		
		BusSelector busSelector = SimulinkFactory.eINSTANCE.createBusSelector();		
		busSelector.getInPorts().add(SimulinkFactory.eINSTANCE.createInPortBlock());
		
		Line line = SimulinkFactory.eINSTANCE.createLine();
		line.setTargetBlock(busSelector);
		line.setTargetPort(busSelector.getInPorts().get(0));
		line.setBus(bus);
		
		assertModelIsValid(busSelector);
		
		assertEquals(bus, busSelector.getBus());
		
	}

}
