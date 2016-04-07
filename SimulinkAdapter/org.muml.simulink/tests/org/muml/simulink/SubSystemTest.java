package org.muml.simulink;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.test.TestBase;

public class SubSystemTest extends TestBase
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
	public void getSubSystem()
	{
		SubSystem subSys = this.factory.createSubSystem();
		subSys.getBlocks().add(this.factory.createSubSystem());
		
		assertEquals(1, subSys.getSubSystems().size());
	}
	
	@Test
	public void getSubSystemUndefined()
	{
		SubSystem subSys = this.factory.createSubSystem();
		
		assertEquals(0, subSys.getSubSystems().size());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void SubSystemReferenceIsReadOnly()
	{
		SubSystem subSys = this.factory.createSubSystem();
		
		subSys.getSubSystems().add(this.factory.createSubSystem());
		
		fail("SubSystem reference should be read only. Add SubSystem through Block reference.");
	}
	
	@Test
	public void BlockHasParent()
	{
		SimulinkModel model = this.factory.createSimulinkModel();
		MiscBlock block = this.factory.createMiscBlock();
		model.getBlocks().add(block);
		
		assertEquals(model, block.getParent());
	}
	
	@Test
	public void getBlockByName()
	{
		SubSystem subSys = this.factory.createSubSystem();
		final String blockName = "BlockName";
		Block block = this.factory.createMiscBlock();
		block.setName(blockName);
		subSys.getBlocks().add(block);
		
		assertEquals(block, subSys.getBlockByName(blockName));
	}
	
	@Test
	public void getBlockByNameRecursive()
	{
		SimulinkModel model = this.factory.createSimulinkModel();
		final String modelName = "TestModel";
		model.setName(modelName);
		
		SubSystem subSystem = this.factory.createSubSystem();
		final String subSystemName = "TestSubSystem";
		subSystem.setName(subSystemName);
		model.getBlocks().add(subSystem);
		
		MiscBlock innerBlock = this.factory.createMiscBlock();
		final String innerBlockName = "TestInnerBlock";
		innerBlock.setName(innerBlockName);
		subSystem.getBlocks().add(innerBlock);
		
		assertEquals(model, model.getBlockByName(""));
		assertEquals(subSystem, model.getBlockByName(subSystemName));
		assertEquals(innerBlock, model.getBlockByName(subSystemName + "/" + innerBlockName));
	}	
	
	/**
	 * Attribute allBlocks = blocks + inPorts + outPorts
	 */
	@Test
	public void getAllBlocks()
	{
		SubSystem subSys = this.factory.createSubSystem();
		subSys.getInPorts().add(this.factory.createInPortBlock());
		subSys.getOutPorts().add(this.factory.createOutPortBlock());
		subSys.getBlocks().add(this.factory.createMiscBlock());
		
		assertEquals(1, subSys.getInPorts().size());
		assertEquals(1, subSys.getOutPorts().size());
		assertEquals(1, subSys.getBlocks().size());
		
		assertEquals(3, subSys.getAllBlocks().size());
	}
	
	/**
	 * An InPort in a SubSystem needs an OutPort
	 */
	@Test
	public void oclInportInSubsystemNeedsOutport()
	{
		SubSystem subSys = this.factory.createSubSystem();
		InPortBlock inPort = this.factory.createInPortBlock();
		subSys.getInPorts().add(inPort);
		
		assertModelIsNotValid("Model should not be valid",subSys);
		
		inPort.getOutPorts().add(this.factory.createOutPortBlock());
		assertModelIsValid(subSys);		
	}
	
	/**
	 * An OutPort in a SubSystem needs an InPort
	 */
	@Test
	public void oclOutportInSubsystemNeedsInport()
	{
		SubSystem subSys = this.factory.createSubSystem();
		OutPortBlock outPort = this.factory.createOutPortBlock();
		subSys.getOutPorts().add(outPort);
		
		assertModelIsNotValid("Model should not be valid",subSys);
		
		outPort.getInPorts().add(this.factory.createInPortBlock());
		assertModelIsValid(subSys);		
	}	
	
	/**
	 * You should not have Ports in your blocks-association. They
	 * should be in inPorts and outPorts.
	 */
	@Test
	public void oclNoPortsInBlocks()
	{
		SubSystem subSys = this.factory.createSubSystem();
		OutPortBlock outPort = this.factory.createOutPortBlock();
		outPort.getInPorts().add(this.factory.createInPortBlock());
		subSys.getBlocks().add(outPort);
		InPortBlock inPort = this.factory.createInPortBlock();
		inPort.getOutPorts().add(this.factory.createOutPortBlock());
		subSys.getBlocks().add(inPort);
		
		assertEquals(2, subSys.getAllBlocks().size());
		assertModelIsNotValid("Model should not be valid",subSys);
		
		subSys.getBlocks().remove(outPort);
		subSys.getBlocks().remove(inPort);
		subSys.getOutPorts().add(outPort);
		subSys.getInPorts().add(inPort);
		assertEquals(2, subSys.getAllBlocks().size());
		assertModelIsValid(subSys);		
	}
	
	@Test 
	public void oclOnlySingleEnablePort()
	{
		SubSystem subSys = this.factory.createSubSystem();
		assertModelIsValid(subSys);
		
		subSys.getInPorts().add(this.factory.createEnablePort());
		assertModelIsValid(subSys);
		
		subSys.getInPorts().add(this.factory.createEnablePort());
		assertModelIsNotValid(subSys);
	}
	
	@Test 
	public void oclOnlySingleTriggerPort()
	{
		SubSystem subSys = this.factory.createSubSystem();
		assertModelIsValid(subSys);
		
		subSys.getInPorts().add(this.factory.createTriggerPort());
		assertModelIsValid(subSys);
		
		subSys.getInPorts().add(this.factory.createTriggerPort());
		assertModelIsNotValid(subSys);
	}	


}
