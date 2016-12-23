package org.muml.simulink.adapter.m2t;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.DataType;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.adapter.parser.SimulinkBuilder;
import org.muml.simulink.adapter.parser.SimulinkBuilderException;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Event;
import org.muml.simulink.stateflow.History;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.SubStateType;
import org.muml.simulink.stateflow.Transition;
import org.muml.simulink.test.TestBase;

public class StateflowFromScratchTest extends TestBase 
{
	private StateflowFactory factory = null;
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();	
	
	protected final static String FILE_NAME = "fileName.mdl";
	protected final static String MODEL_NAME = "modelName";
	protected final static String CHARTBLOCK_NAME = "chartBlockName";
	
	@Before
	public void setUp()
	{
		this.factory = StateflowFactory.eINSTANCE;
	}
	
	@After
	public void tearDown()
	{
		this.factory = null;
	}
	
	@Test
	public void SubStateTypeParallel() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		final String stateName = "State";
		state.setName(stateName);		
		chart.getNodes().add(state);
		
		State subStateA = this.factory.createState();
		subStateA.setName("StateA");
		state.getNodes().add(subStateA);
		
		State subStateB = this.factory.createState();
		subStateB.setName("StateB");
		state.getNodes().add(subStateB);
		
		state.setSubStateType(SubStateType.PARALLEL);
		

		Chart genChart = this.saveAndReload(chart);
		
		State genState = genChart.getSubState(stateName);
		assertNotNull("State not found", genState);
		assertEquals(state.getNodes().size(), genState.getNodes().size());
		
		assertEquals(SubStateType.PARALLEL, genState.getSubStateType());
	}
	
	@Test
	public void SubStateTypeExclusive() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		final String stateName = "State";
		state.setName(stateName);		
		chart.getNodes().add(state);
		
		State subStateA = this.factory.createState();
		subStateA.setName("StateA");
		state.getNodes().add(subStateA);
		
		State subStateB = this.factory.createState();
		subStateB.setName("StateB");
		state.getNodes().add(subStateB);
		
		state.setSubStateType(SubStateType.EXCLUSIVE);
		

		Chart genChart = this.saveAndReload(chart);
		
		State genState = genChart.getSubState(stateName);
		assertNotNull("State not found", genState);
		assertEquals(state.getNodes().size(), genState.getNodes().size());
		
		assertEquals(SubStateType.EXCLUSIVE, genState.getSubStateType());
	}
	
	@Test
	public void subStates() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		final String stateName = "State";
		state.setName(stateName);
		chart.getNodes().add(state);
		
		State subState = this.factory.createState();
		final String subStateName = "SubState";
		subState.setName(subStateName);
		state.getNodes().add(subState);
		
		State subSubState = this.factory.createState();
		final String subSubStateName = "SubSubState";
		subSubState.setName(subSubStateName);
		subState.getNodes().add(subSubState);
		
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart missing", genChart);
		assertEquals(chart.getNodes().size(), genChart.getNodes().size());
		
		State genState = genChart.getSubState(stateName);
		assertNotNull("State missing", genState);
		assertEquals(state.getNodes().size(), genState.getNodes().size());
		
		State genSubState = genState.getSubState(subStateName);
		assertNotNull("SubState missing", genSubState);
		assertEquals(subState.getNodes().size(), genSubState.getNodes().size());
		
		State genSubSubState = genSubState.getSubState(subSubStateName);
		assertNotNull("SubSubState missing", genSubSubState);
		assertEquals(subSubState.getNodes().size(), genSubSubState.getNodes().size());		
	}
	
	/**
	 * State A -- Event --> State B
	 */
	@Test
	public void events() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State stateA = this.factory.createState();
		final String stateAName = "State A";
		stateA.setName(stateAName);
		chart.getNodes().add(stateA);
		
		State stateB = this.factory.createState();
		final String stateBName = "State B";
		stateB.setName(stateBName);
		chart.getNodes().add(stateB);
		
		Event event = this.factory.createEvent();
		final String eventName = "Event";
		event.setName(eventName);
		chart.getEvents().add(event);
		
		Transition transition = this.factory.createTransition();
		transition.setSource(stateA);
		transition.setTarget(stateB);
		transition.setEvent(event);
		chart.getTransitions().add(transition);	
		
		Chart genChart = this.saveAndReload(chart);
		assertNotNull("Chart missing", genChart);
		assertEquals(2, genChart.getNodes().size());
		assertEquals(1, genChart.getTransitions().size());
		assertEquals(1, genChart.getEvents().size());
		
		Event genEvent = genChart.getEvents().get(0);
		assertNotNull("Event missing", genEvent);		
		assertEquals(eventName, genEvent.getName());
		
		Transition genTransition = genChart.getTransitions().get(0);
		assertNotNull("Transition missing", genTransition);		
		assertEquals(genEvent, genTransition.getEvent());
	}
	
	/**
	 * State -> junction -> State
	 */
	@Test
	public void junction() throws IOException, SimulinkBuilderException
	{		
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("stateAttributes");
		//sm.getCharts().add(chart);	
		
		//State
		State state = StateflowFactory.eINSTANCE.createState();
		final String stateName = "State";
		state.setName(stateName);
		chart.getNodes().add(state);
		
		//Junction
		Junction junction = StateflowFactory.eINSTANCE.createJunction();
		chart.getNodes().add(junction);
		
		//State -> Junction
		Transition stateJunction = StateflowFactory.eINSTANCE.createTransition();
		stateJunction.setSource(state);
		stateJunction.setTarget(junction);
		chart.getTransitions().add(stateJunction);
		
		//Junction -> State
		Transition junctionState = StateflowFactory.eINSTANCE.createTransition();
		junctionState.setSource(junction);
		junctionState.setTarget(state);
		chart.getTransitions().add(junctionState);		
		

		Chart genChart = this.saveAndReload(chart);
		assertNotNull("Chart not available", genChart);		
		
		assertEquals(2, genChart.getNodes().size());
		assertEquals(2, genChart.getTransitions().size());
		
		State genState = genChart.getSubState(stateName);
		assertTrue(genState.getIncoming().get(0).getSource() instanceof Junction);
		assertEquals(genState.getOutgoing().get(0).getTarget(), genState.getIncoming().get(0).getSource());
	}	
	
	/**
	 * A simple chart with a embedded function, a state and a nested embedded function
	 * @throws SimulinkBuilderException 
	 * @throws IOException 
	 */
	@Test
	public void EMF() throws IOException, SimulinkBuilderException
	{
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("EMF");
		
		//Embedded function
		EmbeddedFunction function = StateflowFactory.eINSTANCE.createEmbeddedFunction();
		final String functionName = "doFunction";
		function.setName(functionName);
		final String functionCode = "function doFunction()\\n%do something";
		function.setCode(functionCode);
		chart.getEmbeddedFunctions().add(function);
		
		//State
		State state = StateflowFactory.eINSTANCE.createState();
		final String stateName = "State";
		state.setName(stateName);
		chart.getNodes().add(state);	
		
		//Nested Function
		EmbeddedFunction nestedFunction = StateflowFactory.eINSTANCE.createEmbeddedFunction();
		final String nestedFunctionName = "doNested";
		nestedFunction.setName(nestedFunctionName);
		final String nestedFunctionCode = "%none";
		nestedFunction.setCode(nestedFunctionCode);
		state.getEmbeddedFunctions().add(nestedFunction);
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);
		
		assertEquals(1, genChart.getNodes().size());
		assertEquals(1, genChart.getEmbeddedFunctions().size());
		
		EmbeddedFunction genFunction = genChart.getEmbeddedFunctions().get(0);
		assertEquals(functionName + "()", genFunction.getName());
		assertEquals(functionCode, genFunction.getCode());
		
		State genState = (State) genChart.getNodes().get(0);
		assertEquals(1, genState.getEmbeddedFunctions().size());
		
		EmbeddedFunction genNestedFunction = genState.getEmbeddedFunctions().get(0);
		assertEquals(nestedFunctionName + "()", genNestedFunction.getName());
		assertEquals(nestedFunctionCode, genNestedFunction.getCode());
		
	}
	
	@Test
	public void EMFwithData() throws IOException, SimulinkBuilderException
	{
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("EMF");
		
		//Embedded function
		EmbeddedFunction function = StateflowFactory.eINSTANCE.createEmbeddedFunction();
		function.setName("doFunction");
		function.setCode("function out = doFunction(in)\\n%do something");
		chart.getEmbeddedFunctions().add(function);
		
		Data in = StateflowFactory.eINSTANCE.createData();
		final String inName = "in";
		in.setName(inName);
		final DataType inType = DataType.DOUBLE;
		in.setType(inType);
		function.getInput().add(in);
		
		Data out = StateflowFactory.eINSTANCE.createData();
		final String outName = "out";
		out.setName(outName);
		final DataType outType = DataType.INHERIT;
		out.setType(outType);		
		function.getOutput().add(out);
		
		Data constData = StateflowFactory.eINSTANCE.createData();
		final String constDataName = "const";
		constData.setName(constDataName);
		final DataType constDataType = DataType.BOOLEAN;
		constData.setType(constDataType);
		function.getConstant().add(constData);
		
		Data local = StateflowFactory.eINSTANCE.createData();
		final String localName = "local";
		local.setName(localName);
		final DataType localType = DataType.SINGLE;
		local.setType(localType);
		final String localSize = "[1,1]";
		local.setSize(localSize);
		function.getLocal().add(local);
				
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);
		
		assertEquals(1, genChart.getEmbeddedFunctions().size());
		EmbeddedFunction genFunction = genChart.getEmbeddedFunctions().get(0);
		
		assertEquals(1, genFunction.getInput().size());
		Data genIn = genFunction.getInput().get(0);
		assertEquals(inName, genIn.getName());
		assertEquals(inType, genIn.getType());
		
		assertEquals(1, genFunction.getOutput().size());
		Data genOut = genFunction.getOutput().get(0);
		assertEquals(outName, genOut.getName());
		assertEquals(outType, genOut.getType());
		
		assertEquals(1, genFunction.getConstant().size());
		Data genConstData = genFunction.getConstant().get(0);
		assertEquals(constDataName, genConstData.getName());
		assertEquals(constDataType, genConstData.getType());
		
		assertEquals(1, genFunction.getLocal().size());
		Data genLocal = genFunction.getLocal().get(0);
		assertEquals(localName, genLocal.getName());
		assertEquals(localType, genLocal.getType());	
		assertEquals(localSize, genLocal.getSize());
		
		
	}
	
	@Test
	public void History() throws IOException, SimulinkBuilderException
	{
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("History");
		
		History history = StateflowFactory.eINSTANCE.createHistory();
		chart.getNodes().add(history);
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);
		
		assertEquals(1, genChart.getNodes().size());
		assertTrue(genChart.getNodes().get(0) instanceof History);
		
		
	}
	
	@Test
	public void id() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);
		
		Transition transition = this.factory.createTransition();
		transition.setSource(state);
		transition.setTarget(state);
		chart.getTransitions().add(transition);
		
		Event event = this.factory.createEvent();
		event.setName("Event");
		chart.getEvents().add(event);
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);
		assertEquals(chart.getId(), genChart.getId());
		
		State genState = (State) genChart.getNodes().get(0);
		assertEquals(state.getId(), genState.getId());
		
		Transition genTransition = genChart.getTransitions().get(0);
		assertEquals(transition.getId(), genTransition.getId());
		
		Event genEvent = genChart.getEvents().get(0);
		assertEquals(event.getId(), genEvent.getId());
	}
	
	@Test
	public void chartConstant() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		Data constant = this.factory.createData();
		final String constantName = "Constant";
		constant.setName(constantName);
		final DataType constantType = DataType.UINT8;
		constant.setType(constantType);
		final String constantValue = "7";
		constant.setValue(constantValue);
		chart.getConstant().add(constant);
		
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);

		assertEquals(1, genChart.getConstant().size());
		Data genConstant = genChart.getConstant().get(0);
		assertEquals(constantName, genConstant.getName());
		assertEquals(constantType, genConstant.getType());
		assertEquals(constantValue, genConstant.getValue());
	}
	
	@Test
	public void chartLocal() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		Data local = this.factory.createData();
		final String constantName = "Local Var";
		local.setName(constantName);
		final DataType constantType = DataType.DOUBLE;
		local.setType(constantType);
		chart.getLocal().add(local);
		
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);

		assertEquals(1, genChart.getLocal().size());
		Data genLocal = genChart.getLocal().get(0);
		assertEquals(constantName, genLocal.getName());
		assertEquals(constantType, genLocal.getType());
	}	
	
	@Test
	public void stateLocalAndConstant() throws IOException, SimulinkBuilderException
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		chart.getNodes().add(state);
		
		Data local = this.factory.createData();
		final String localName = "Local Var";
		local.setName(localName);
		final DataType localType = DataType.DOUBLE;
		local.setType(localType);
		state.getLocal().add(local);
		
		Data constant = this.factory.createData();
		final String constantName = "Constant";
		constant.setName(constantName);
		final DataType constantType = DataType.UINT8;
		constant.setType(constantType);
		final String constantValue = "23";
		constant.setValue(constantValue);	
		state.getConstant().add(constant);
		
		
		//Reload
		Chart genChart = this.saveAndReload(chart);		
		assertNotNull("Chart not available", genChart);

		State genState = (State) genChart.getNodes().get(0);
		
		assertEquals(1, genState.getLocal().size());
		Data genLocal = genState.getLocal().get(0);
		assertEquals(localName, genLocal.getName());
		assertEquals(localType, genLocal.getType());
		
		assertEquals(1, genState.getConstant().size());
		Data genConstant = genState.getConstant().get(0);
		assertEquals(constantName, genConstant.getName());
		assertEquals(constantType, genConstant.getType());
		assertEquals(constantValue, genConstant.getValue());		
	}		
	
		

	/**
	 * Saves a chart and reloads it
	 */
	private Chart saveAndReload(Chart chart) throws IOException, SimulinkBuilderException
	{
		//Create Model
		//Simulink part
		SimulinkContainer container = SimulinkFactory.eINSTANCE.createSimulinkContainer();
		
		SimulinkModel model = SimulinkFactory.eINSTANCE.createSimulinkModel();
		model.setName(MODEL_NAME);
		container.getModels().add(model);
		
		ChartBlock chartBlock = SimulinkFactory.eINSTANCE.createChartBlock();
		chartBlock.setName(CHARTBLOCK_NAME);
		model.getBlocks().add(chartBlock);
		
		//Stateflow part
		StateflowMachine stateflowMachine = this.factory.createStateflowMachine();
		model.setStateflowMachine(stateflowMachine);

		stateflowMachine.getCharts().add(chart);
		chartBlock.setChart(chart);		
		
		assertModelIsValid(container);
		
		//Save
		SimulinkWriter writer = new SimulinkWriter();		
		File tmpFile = tmpFolder.newFile(FILE_NAME);
		writer.setModel(container);
		writer.writeToFile(tmpFile.toString());
		
		//Reload
		SimulinkBuilder builder = new SimulinkBuilder();
		SimulinkContainer genContainer = builder.buildFromFile(tmpFile.toString());
		
		assertModelIsValid(genContainer);
		
		assertEquals(1, genContainer.getModels().size());
		assertNotNull("Model is missing", genContainer.getModels().get(0));
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		assertNotNull("StateflowMachine is missing", genModel.getStateflowMachine());
		assertEquals(1, genModel.getStateflowMachine().getCharts().size());
		assertNotNull("Chart is missing", genModel.getStateflowMachine().getCharts().get(0));
		Chart genChart = genModel.getStateflowMachine().getCharts().get(0);
		return genChart;
	}

}
