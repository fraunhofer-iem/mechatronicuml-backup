package org.muml.simulink;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.test.TestBase;

public class BlockTest extends TestBase
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
	public void fullyQualifiedName()
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
		
		assertEquals(modelName, model.getFullyQualifiedName());
		assertEquals(modelName + "/" + subSystemName, subSystem.getFullyQualifiedName());
		assertEquals(modelName + "/" + subSystemName + "/" + innerBlockName, innerBlock.getFullyQualifiedName());
	}
}
