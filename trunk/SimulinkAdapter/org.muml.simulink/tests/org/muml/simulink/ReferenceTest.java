package org.muml.simulink;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.test.TestBase;

public class ReferenceTest extends TestBase
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
	
	/**
	 * A LibraryReference does not have own ports. It returns the ports of
	 * its source block.
	 */
	@Test
	public void retrievePortsFromSourceBlock()
	{
		SubSystem referencedSystem = this.factory.createSubSystem();
		referencedSystem.setName("RefSys");
		
		InPortBlock inPort = this.factory.createInPortBlock();
		inPort.getOutPorts().add(this.factory.createOutPortBlock());
		referencedSystem.getInPorts().add(inPort);
		
		OutPortBlock outPort = this.factory.createOutPortBlock();
		outPort.getInPorts().add(this.factory.createInPortBlock());
		referencedSystem.getOutPorts().add(outPort);
		
		LibraryReference reference = this.factory.createLibraryReference();
		reference.setSourceBlock(referencedSystem);
		
		assertModelIsValid(referencedSystem);
		assertModelIsValid(reference);
		
		assertEquals(referencedSystem.getInPorts(),reference.getInPorts());
		assertEquals(referencedSystem.getOutPorts(),reference.getOutPorts());
	}
	
	/**
	 * A LibraryReference does not have own ports. If a port is added to
	 * the reference, it will be forwarded to the source block.
	 */
	@Test 
	public void addPortsToALibraryReference()
	{
		SubSystem referencedSystem = this.factory.createSubSystem();
		referencedSystem.setName("RefSys");
		
		LibraryReference reference = this.factory.createLibraryReference();
		reference.setSourceBlock(referencedSystem);
		
		InPortBlock inPort = this.factory.createInPortBlock();
		inPort.getOutPorts().add(this.factory.createOutPortBlock());
		reference.getInPorts().add(inPort);
		
		OutPortBlock outPort = this.factory.createOutPortBlock();
		outPort.getInPorts().add(this.factory.createInPortBlock());
		reference.getOutPorts().add(outPort);		
		
		assertModelIsValid(referencedSystem);
		assertModelIsValid(reference);
		
		assertEquals(referencedSystem.getInPorts(),reference.getInPorts());
		assertEquals(referencedSystem.getOutPorts(),reference.getOutPorts());		
	}
}
