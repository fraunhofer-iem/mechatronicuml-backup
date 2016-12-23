package org.muml.simulink;

import org.junit.Test;
import org.muml.simulink.test.TestBase;

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
