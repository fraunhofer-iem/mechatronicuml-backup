package org.muml.simulink.adapter.m2t.graphviz;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;

public class GraphVizWriterTest extends GraphVizTestBase
{
	private GraphVizWriter writer = null; 
	private GraphVizTestModelFactory models = new GraphVizTestModelFactory();
	private StateflowFactory factory = StateflowFactory.eINSTANCE;
	
	@Before
	public void setUp()
	{
		this.writer = new GraphVizWriter();
	}
	
	@After
	public void tearDown()
	{
		this.writer = null;
	}
	
	@Ignore("Only a demo")
	@Test
	public void usage()
	{
		StateflowMachine sfMachine = this.loadStateflowMachine("data/Stateflow/SubStatesNoPosition.xmi");
		this.writer.write( new PrintWriter(System.out), sfMachine.getCharts().get(0));	
	}
	
	@Test
	public void simpleChartSinlgeState() throws IOException
	{
		Chart chart = this.models.simpleChartSinlgeStateModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/simpleChartSingleState.dot"),this.createGraphvizInput(chart));		
	}
	
	@Test
	public void subState() throws IOException
	{
		Chart chart = this.models.subStateModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/subState.dot"), this.createGraphvizInput(chart));		
	}
	
	@Test 
	public void nestedSubStates() throws IOException
	{		
		Chart chart = this.models.nestedSubStatesModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/nestedSubStates.dot"), this.createGraphvizInput(chart));		
	}
	
	@Test 
	public void transition() throws IOException
	{
		Chart chart = this.models.transitionModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/transition.dot"), this.createGraphvizInput(chart));
	}
	
	@Test
	public void initState() throws IOException
	{
		Chart chart = this.models.initStateModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/initState.dot"), this.createGraphvizInput(chart));		
	}
	
	@Test
	public void junction() throws IOException
	{
		Chart chart = this.models.junctionModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/junction.dot"), this.createGraphvizInput(chart));
	}
	
	@Test
	public void twoSubStates() throws IOException
	{
		Chart chart = this.models.twoSubStatesModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/twoSubStates.dot"), this.createGraphvizInput(chart));
	}	
	
	@Test
	public void embeddedFunction() throws IOException
	{
		Chart chart = this.models.embeddedFunctionModel();
		
		assertEquals(this.loadDotFile("/Layouter/Writer/embeddedFunction.dot"), this.createGraphvizInput(chart));
	}		
	
	protected String createGraphvizInput(Chart chart)
	{
		StateflowMachine sfMachine = this.factory.createStateflowMachine();
		sfMachine.getCharts().add(chart);
		
		StringWriter sWriter = new StringWriter();
		PrintWriter pWriter = new PrintWriter(sWriter);
		this.writer.write(pWriter, sfMachine.getCharts().get(0));
		return sWriter.toString();
	}
}
