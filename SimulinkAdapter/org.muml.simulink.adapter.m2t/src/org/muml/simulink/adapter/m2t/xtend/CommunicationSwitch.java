package org.muml.simulink.adapter.m2t.xtend;

import org.muml.simulink.Bus;
import org.muml.simulink.BusElement;
import org.muml.simulink.DataType;
import org.muml.simulink.SimulinkFactory;

public class CommunicationSwitch {
		
	/**
	 * Generate a Bus for the internals of the CommunicationSwitch
	 * The Bus contains one element for every input of the CommunicationSwitch
	 */
	public Bus generateBus(org.muml.simulink.msglib.CommunicationSwitch communicationSwitch, Integer size)
	{
		//We fake the PacketBus since we don't have access to it atm
		// But it doesn't matter since we only need the name, not its content
		Bus fakePacketBus = SimulinkFactory.eINSTANCE.createBus();
		fakePacketBus.setName("PacketBus");
		
		Bus bus = SimulinkFactory.eINSTANCE.createBus();
		bus.setName("MainBus");
		for(int i = 1; i <= size; i++)
		{
			BusElement element = SimulinkFactory.eINSTANCE.createBusElement();
			element.setName("rc" + i);
			element.setDimensions("1");
			element.setType(DataType.BUS);
			element.setBus(fakePacketBus);
			bus.getElements().add(element);
		}
		return bus;
		
	}
}
