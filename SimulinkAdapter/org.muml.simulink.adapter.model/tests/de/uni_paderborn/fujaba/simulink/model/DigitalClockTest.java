package de.uni_paderborn.fujaba.simulink.model;

import org.junit.Test;
import org.muml.simulink.adapter.model.DigitalClock;
import org.muml.simulink.adapter.model.SimulinkFactory;

import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class DigitalClockTest extends TestBase {
	
	@Test
	public void OutportOCL()
	{
		DigitalClock clock = SimulinkFactory.eINSTANCE.createDigitalClock();
		
		assertModelIsNotValid(clock);
		
		clock.getOutPorts().add(SimulinkFactory.eINSTANCE.createOutPortBlock());
		
		assertModelIsValid(clock);
	}
}
