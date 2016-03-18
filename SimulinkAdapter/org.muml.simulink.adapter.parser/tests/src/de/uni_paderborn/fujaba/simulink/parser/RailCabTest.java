package de.uni_paderborn.fujaba.simulink.parser;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.simulink.model.ChartBlock;
import de.uni_paderborn.fujaba.simulink.model.EmbeddedMatlabFunction;
import de.uni_paderborn.fujaba.simulink.model.LibraryReference;
import de.uni_paderborn.fujaba.simulink.model.SimulinkContainer;
import de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary;
import de.uni_paderborn.fujaba.simulink.model.SimulinkModel;
import de.uni_paderborn.fujaba.simulink.model.SubSystem;
import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class RailCabTest extends TestBase {
	
	private SimulinkBuilder builder = null;
	
	@Before
	public void setUp()
	{
		
		this.builder = new SimulinkBuilder();
	}
	
	@After
	public void tearDown()
	{
		this.builder = null;		
	}
	
	@Test
	public void communication() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/RailCab/Communication.mdl"); 
		assertEquals(1, container.getLibraries().size());
		
		SimulinkLibrary communicationLib = container.getLibraries().get(0);
		assertEquals(1,communicationLib.getBlocks().size());
		
		//Level 1
		SubSystem communicationSys = (SubSystem) communicationLib.getAllBlocks().get(0);
		assertEquals(4, communicationSys.getBlocks().size());
		
		//Level 2
		SubSystem communicationUnit = (SubSystem) communicationSys.getBlockByName("Communication");
		assertNotNull(communicationUnit);		
		assertEquals(7, communicationUnit.getBlocks().size());
		
		//Level 3
		EmbeddedMatlabFunction sendPacket = (EmbeddedMatlabFunction) communicationUnit.getBlockByName("Send Packet");
		assertNotNull(sendPacket);
		
		//Level 3
		EmbeddedMatlabFunction receivePacket = (EmbeddedMatlabFunction) communicationUnit.getBlockByName("Receive Packet");
		assertNotNull(receivePacket);		
		
		//Level 3
		SubSystem dataLinkLayer = (SubSystem) communicationUnit.getBlockByName("DataLinkLayer");
		assertNotNull(dataLinkLayer);
		assertEquals(2, dataLinkLayer.getBlocks().size());		
		
		//Level 2
		SubSystem convoyUnit = (SubSystem) communicationSys.getBlockByName("Convoy");
		assertNotNull(convoyUnit);
		assertEquals(3, convoyUnit.getBlocks().size());
		
		//Level 3
		ChartBlock convoyChartBlock = (ChartBlock) convoyUnit.getBlockByName("convoy\\n");
		assertNotNull(convoyChartBlock);
	}
	
	@Test
	public void railCab() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/RailCab/RailCab.mdl"); 
		assertEquals(2, container.getLibraries().size()); //Loads Communication.mdl, too
		
		SimulinkLibrary railCabLib = container.getLibraries().get(0);
		assertEquals("RailCab", railCabLib.getName());
		assertEquals(1, railCabLib.getBlocks().size());
		
		//Level 1
		SubSystem railCabSys = (SubSystem) railCabLib.getBlocks().get(0);
		assertEquals(2, railCabSys.getBlocks().size());
		
		//Level 2
		LibraryReference communication = (LibraryReference) railCabSys.getBlockByName("Communication");
		assertNotNull(communication);
		
		//Level 2
		SubSystem control = (SubSystem) railCabSys.getBlockByName("Control");
		assertNotNull(control);
	}	
	
	@Test
	public void simulation() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/RailCab/Simulation.mdl"); 
		assertEquals(2, container.getLibraries().size());
		assertEquals(1, container.getModels().size());
				
		SimulinkModel simulationModel = container.getModels().get(0);
		assertEquals(16, simulationModel.getBlocks().size());
		
		LibraryReference railCab1 = (LibraryReference) simulationModel.getBlockByName("RailCab2");
		assertNotNull(railCab1);
		
		LibraryReference railCab2 = (LibraryReference) simulationModel.getBlockByName("RailCab2");
		assertNotNull(railCab2);
	}		
		
}
