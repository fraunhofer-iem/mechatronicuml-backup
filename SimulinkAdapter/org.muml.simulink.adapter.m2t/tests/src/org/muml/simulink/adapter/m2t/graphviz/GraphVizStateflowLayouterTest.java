package org.muml.simulink.adapter.m2t.graphviz;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.muml.simulink.stateflow.StateflowMachine;

public class GraphVizStateflowLayouterTest extends GraphVizTestBase
{
	protected GraphVizStateflowLayouter layouter = null;
	
	@Before
	public void setUp()
	{
		this.layouter = new GraphVizStateflowLayouter();
	}
	
	@After
	public void tearDown()
	{
		this.layouter = null;
	}
	
	@Ignore("Not yet working with the new format")
	@Test
	public void usage()
	{
		StateflowMachine sfMachine = this.loadStateflowMachine("data/Stateflow/SimpleStateflowNoPosition.xmi");
		this.layouter.layout(sfMachine);		
	}
}
