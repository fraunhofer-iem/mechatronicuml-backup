package org.muml.simulink.adapter.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.Bus;
import org.muml.simulink.BusElement;
import org.muml.simulink.DataType;
import org.muml.simulink.test.TestBase;


public class BusBuilderTest extends TestBase
{
	private BusBuilder busBuilder = null;
	
	@Before
	public void setUp()
	{
		this.busBuilder = new BusBuilder();
	}
	
	@After
	public void tearDown()
	{
		this.busBuilder = null;
	}
	
	@Test
	public void parseElement() throws BusBuilderException
	{
		BusElement element = this.busBuilder.parseElement("BusElement('from','uint8',10,)");
		assertEquals("from", element.getName());
		assertEquals(DataType.UINT8, element.getType());
		assertEquals("10", element.getDimensions());
		assertNull(element.getBus());
	}
	
	@Test
	public void parseElementBus() throws BusBuilderException
	{
		Bus bus = this.busBuilder.parseBus("Bus('PacketBus')");
		BusElement element = this.busBuilder.parseElement("BusElement('rc1','Bus',1,'PacketBus')");
		
		assertEquals("rc1", element.getName());
		assertEquals(DataType.BUS, element.getType());
		assertEquals("1", element.getDimensions());
		assertEquals(bus, element.getBus());		
	}
	
	@Test
	public void parseBus() throws BusBuilderException
	{
		Bus bus = this.busBuilder.parseBus("Bus('MyBus')");
		assertEquals("MyBus", bus.getName());
	}
	
	@Test
	public void packetBusGenerator_m() throws FileNotFoundException, BusBuilderException
	{
		Bus bus = this.busBuilder.loadBus("tests/data/Bus/PacketBusGenerator.m");
		
		assertEquals("PacketBus", bus.getName());
		assertEquals(6,bus.getElements().size());
		
		assertEquals("from", bus.getElements().get(0).getName());
		assertEquals(DataType.UINT8, bus.getElements().get(0).getType());
		assertEquals("10", bus.getElements().get(0).getDimensions());
		assertNull(bus.getElements().get(0).getBus());
		
		assertEquals("to", bus.getElements().get(1).getName());
		assertEquals(DataType.UINT8, bus.getElements().get(1).getType());
		assertEquals("10", bus.getElements().get(1).getDimensions());
		assertNull(bus.getElements().get(1).getBus());
		
		assertEquals("msg", bus.getElements().get(2).getName());
		assertEquals(DataType.UINT16, bus.getElements().get(2).getType());
		assertEquals("10", bus.getElements().get(2).getDimensions());
		assertNull(bus.getElements().get(2).getBus());
		
		assertEquals("param", bus.getElements().get(3).getName());
		assertEquals(DataType.DOUBLE, bus.getElements().get(3).getType());
		assertEquals("10", bus.getElements().get(3).getDimensions());
		assertNull(bus.getElements().get(3).getBus());
		
		assertEquals("pkgid", bus.getElements().get(4).getName());
		assertEquals(DataType.UINT32, bus.getElements().get(4).getType());
		assertEquals("10", bus.getElements().get(4).getDimensions());
		assertNull(bus.getElements().get(4).getBus());
		
		assertEquals("time", bus.getElements().get(5).getName());
		assertEquals(DataType.DOUBLE, bus.getElements().get(5).getType());
		assertEquals("10", bus.getElements().get(5).getDimensions());
		assertNull(bus.getElements().get(5).getBus());		
	}
	
	@Test
	public void railCabBusGenerator_m() throws FileNotFoundException, BusBuilderException
	{
		Bus bus = this.busBuilder.loadBus("tests/data/Bus/RailCabBusGenerator.m");
		
		assertEquals("RailCabBus", bus.getName());
		assertEquals(6,bus.getElements().size());
		
		assertEquals("PacketBus", bus.getElements().get(0).getBus().getName());
	}

}
