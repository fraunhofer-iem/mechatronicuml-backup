package org.muml.simulink.adapter.m2t.graphviz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.After;
import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.Transition;


public class GraphVizReaderTest extends GraphVizTestBase 
{
	private GraphVizReader reader = null;
		
	private GraphVizTestModelFactory models = new GraphVizTestModelFactory();
	
	@Before
	public void setUp()
	{
		this.reader = new GraphVizReader();
	}
	
	@After
	public void tearDown()
	{
		this.reader = null;
	}
	
	@Test
	public void simpleChartSingleState() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.simpleChartSinlgeStateModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/simpleChartSingleState.dot");
		
		State state = chart.getSubState("State");
		assertPosition("[72.0 0.0 54.0 36.0]", state.getParameter("position"));
	}
	
	@Test
	public void transition() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.transitionModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/transition.dot");
		
		State stateA = chart.getSubState("StateA");
		assertPosition("[72.0 0.0 64.0 36.0]", stateA.getParameter("position"));
		
		State stateB = chart.getSubState("StateB");
		assertPosition("[72.0 90.0 64.0 36.0]", stateB.getParameter("position"));
		
		Transition transition = stateA.getOutgoing().get(0);
		assertEquals("[3 0 1 0 104.0 36.213 0 0]", transition.getParameter("src.intersection"));
		assertEquals("[1 0 -1 0 104.0 89.814 0 0]", transition.getParameter("dst.intersection"));

		assertEquals("[104.0 63.013504]", transition.getParameter("midPoint"));
		
		assertPosition("[108.0 59.0 32.0 8.0]", transition.getParameter("labelPosition"));
	}	
	
	@Test
	public void junction() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.junctionModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/junction.dot");
		
		State state = chart.getSubState("State");
		assertNotNull("State not found", state);
		
		Transition transitionStateJunction = state.getOutgoing().get(0);
		assertNotNull("Transition State -> Junction not found", transitionStateJunction);
		
		Junction junction = (Junction) transitionStateJunction.getTarget();
		assertNotNull("Junction not found", junction);
		assertEquals("[99.0 79.0 7]",junction.getParameter("position"));
		
		Transition transitionJunctionState = junction.getOutgoing().get(0);
		assertNotNull("Transition Junction -> State not found", transitionJunctionState);
	}
	
	@Test
	public void initState() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.initStateModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/initState.dot");
		
		State state = chart.getSubState("State");
		assertNotNull("State not found", state);
		assertPosition("[0.0 72.0 54.0 36.0]", state.getParameter("position"));
		
		//initState is not layouted!
		assertEquals(1, chart.getNodes().size());
	}
	
	@Test
	public void subState() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.subStateModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/subState.dot");
		
		State state = chart.getSubState("State");
		assertNotNull("State not found", state);
		assertPosition("[64.0 8.0 96.0 78.0]", state.getParameter("position"));
		
		State subState = state.getSubState("SubState");
		assertNotNull("SubState not found", subState);
		assertPosition("[72.0 42.0 80.0 36.0]", subState.getParameter("position"));
	}	
	
	@Test
	public void nestedSubState() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.nestedSubStatesModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/nestedSubStates.dot");
		
		State state = chart.getSubState("State");
		assertNotNull("State not found", state);
		assertPosition("[62.0 8.0 138.0 120.0]", state.getParameter("position"));
		
		State subState = state.getSubState("SubState");
		assertNotNull("SubState not found", subState);
		assertPosition("[70.0 42.0 122.0 78.0]", subState.getParameter("position"));
		
		State subSubState = subState.getSubState("SubSubState");
		assertNotNull("SubSubState not found", subSubState);
		assertPosition("[78.0 76.0 106.0 36.0]", subSubState.getParameter("position"));		
	}
	
	@Test
	public void twoSubStates() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.twoSubStatesModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/twoSubStates.dot");
		
		State state = chart.getSubState("State");
		assertNotNull("State not found", state);
		assertPosition("[62.0 8.0 288.0 120.0]", state.getParameter("position"));
		
		State subStateA = state.getSubState("SubStateA");
		assertNotNull("SubStateA not found", subStateA);
		assertPosition("[210.0 42.0 132.0 78.0]", subStateA.getParameter("position"));
		
		State subStateB = state.getSubState("SubStateB");
		assertNotNull("SubStateB not found", subStateB);
		assertPosition("[70.0 42.0 132.0 78.0]", subStateB.getParameter("position"));		
	}		
	
	@Test
	public void embeddedFunction() throws IOException, GraphVizReaderException
	{
		Chart chart = this.models.embeddedFunctionModel();
		this.layoutChartWithDotFile(chart, "/Layouter/Reader/embeddedFunction.dot");
		
		State state = chart.getSubState("State");
		EmbeddedFunction doSomething = chart.getEmbeddedFunctions().get(0);
		assertNotNull("EMF doSomething not found", doSomething);
		assertPosition("[280.0 42.0 106.0 36.0]", doSomething.getParameter("position"));
		
		EmbeddedFunction nestedEMF = state.getEmbeddedFunctions().get(0);
		assertNotNull("EMF nestedEMF not found", nestedEMF);
		assertPosition("[72.0 42.0 92.0 36.0]", nestedEMF.getParameter("position"));
	}		
	
	@Test
	public void BoundingBoxPattern()
	{
		assertTrue(GraphVizReader.BOUNDINGBOX_PATTERN.matcher("bb=\"0,86,110,0\"").matches());
		assertTrue(GraphVizReader.BOUNDINGBOX_PATTERN.matcher("bb=\"0,0,0,0\"").matches());
		assertTrue(GraphVizReader.BOUNDINGBOX_PATTERN.matcher("bb=\"0.23812,321.86,294.24,0.85911\"").matches());
		assertTrue(GraphVizReader.BOUNDINGBOX_PATTERN.matcher("bb=\"-0.33324,335.94,309.67,65.939\"").matches());
		assertTrue(GraphVizReader.BOUNDINGBOX_PATTERN.matcher("bb=\"-1,-1,-1,-1\"").matches());
		
		
	}
	
	@Test
	public void PositionPattern()
	{
		assertTrue(GraphVizReader.POSITION_PATTERN.matcher("pos=\"28,67\"").matches());
		assertTrue(GraphVizReader.POSITION_PATTERN.matcher("pos=\"0,0\"").matches());
		assertTrue(GraphVizReader.POSITION_PATTERN.matcher("pos=\"64.238,8.3591\"").matches());
		 
	}	

	@Test
	public void HeightPattern()
	{
		assertTrue(GraphVizReader.HEIGHT_PATTERN.matcher("height=\"0.5\"").matches());
		assertTrue(GraphVizReader.HEIGHT_PATTERN.matcher("height=\"0\"").matches());
		assertTrue(GraphVizReader.HEIGHT_PATTERN.matcher("height=1").matches());
	}
	
	@Test
	public void WidthPattern()
	{
		assertTrue(GraphVizReader.WIDTH_PATTERN.matcher("width=\"0.75\"").matches());
		assertTrue(GraphVizReader.WIDTH_PATTERN.matcher("width=\"0\"").matches());
		assertTrue(GraphVizReader.WIDTH_PATTERN.matcher("width=1").matches());
	}		
	
	@Test
	public void PositionSplinePattern()
	{
		assertTrue(GraphVizReader.POSITIONSPLINE_PATTERN.matcher("pos=\"e,104,71.587 104,36.169 104,43.869 104,53.026 104,61.583\"").matches());
	}
	
	@Test
	public void IdPattern()
	{
		assertTrue(GraphVizReader.ID_PATTERN.matcher("id=0").matches());
		assertTrue(GraphVizReader.ID_PATTERN.matcher("id=5640").matches());
	}		
	
	@Test
	public void LpPattern()
	{
		assertTrue(GraphVizReader.LP_PATTERN.matcher("lp=\"54.2,45\"").matches());
		assertTrue(GraphVizReader.LP_PATTERN.matcher("lp=\"56,40\"").matches());
	}		
		
	
	private void layoutChartWithDotFile(Chart chart, String fileName) throws IOException, GraphVizReaderException
	{
		StateflowMachine sfMachine = StateflowFactory.eINSTANCE.createStateflowMachine();
		sfMachine.getCharts().add(chart);
		
		StringReader sReader = new StringReader(this.loadDotFile(fileName));
		BufferedReader bReader = new BufferedReader(sReader);
		this.reader.read(bReader, sfMachine.getCharts().get(0));
	}
	
	public static void assertPosition(String expected, String actual)
	{
		assertPosition(null, expected, actual);
	}
	
	public static void assertPosition(String message, String expected, String actual)
	{
		if(expected == null && actual == null)
			return;
		
		String cleanmessage = (message!=null)?message:"";
		
		String[] expectedValues = expected.replace("[", "").replace("]", "").split(" ");
		String[] actualValues = actual.replace("[", "").replace("]", "").split(" ");
		
		if(expectedValues.length != actualValues.length && expectedValues.length != 4)
			throw new ComparisonFailure(cleanmessage, expected, actual);
		
		for(int i=0; i < 4; i++)
		{
			Double expectedValue = Double.parseDouble(expectedValues[i]);
			Double actualValue = Double.parseDouble(actualValues[i]);
			try
			{
				assertEquals(expectedValue, actualValue, 0.05);
			}
			catch(AssertionError e)
			{
				throw new ComparisonFailure(cleanmessage, expected, actual);
			}
		}

	}
	
}
