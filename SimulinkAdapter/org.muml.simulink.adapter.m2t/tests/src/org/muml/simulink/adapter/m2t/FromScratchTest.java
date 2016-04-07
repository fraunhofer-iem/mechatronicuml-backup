package org.muml.simulink.adapter.m2t;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusElement;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
import org.muml.simulink.DataType;
import org.muml.simulink.DigitalClock;
import org.muml.simulink.EmbeddedMatlabFunction;
import org.muml.simulink.EnablePort;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.MiscBlock;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;
import org.muml.simulink.adapter.parser.SimulinkBuilder;
import org.muml.simulink.adapter.parser.SimulinkBuilderException;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Event;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.Transition;
import org.muml.simulink.test.TestBase;

public class FromScratchTest extends TestBase
{
	private SimulinkFactory factory = null;
	private SimulinkBuilder builder = null;
	private SimulinkWriter writer = null;
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Before
	public void setUp()
	{
		this.factory = SimulinkFactory.eINSTANCE;
		this.builder = new SimulinkBuilder();
		this.writer = new SimulinkWriter();
	}
	
	@After
	public void tearDown()
	{
		this.factory = null;
		this.builder = null;
		this.writer = null;
	}
	
	/**
	 * Inport - Line - Outport
	 * @throws IOException 
	 * @throws SimulinkBuilderException 
	 */
	@Test
	public void simpleModel() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer sourceRoot = this.factory.createSimulinkContainer();
		
		SimulinkModel sourceModel = this.factory.createSimulinkModel();
		sourceRoot.getModels().add(sourceModel);
		sourceModel.setName("simpleModel");
		
		
		InPortBlock sourceInPort = this.factory.createInPortBlock();
		sourceInPort.getOutPorts().add(this.factory.createOutPortBlock());
		
		OutPortBlock sourceOutPort = this.factory.createOutPortBlock();
		sourceOutPort.getInPorts().add(this.factory.createInPortBlock());
		
		sourceModel.getInPorts().add(sourceInPort);
		sourceModel.getOutPorts().add(sourceOutPort);
				
		
		Line sourceLine = this.factory.createLine();
		sourceLine.setSourceBlock(sourceInPort);
		sourceLine.setSourcePort(sourceInPort.getOutPorts().get(0));
		sourceLine.setTargetBlock(sourceOutPort);
		sourceLine.setTargetPort(sourceOutPort.getInPorts().get(0));
		sourceModel.getLines().add(sourceLine);
		
		assertModelIsValid(sourceRoot);
		
		SimulinkModel generatedModel = this.saveAndParseAgain(sourceRoot, "simpleModel.mdl").getModels().get(0);
		assertModelIsValid(generatedModel);
		
		assertEquals(sourceModel.getAllBlocks().size(), generatedModel.getAllBlocks().size());
		assertEquals(sourceModel.getLines().size(), generatedModel.getLines().size());	
		
		//Line starts in first Inport
		assertEquals(generatedModel.getInPorts().get(0), generatedModel.getLines().get(0).getSourceBlock());
		//Line ends in first OutPort
		assertEquals(generatedModel.getOutPorts().get(0), generatedModel.getLines().get(0).getTargetBlock());
	}
	
	@Test
	public void nameAttributeToParameter() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer sourceContainer = this.factory.createSimulinkContainer();
		
		//Create model
		final String sourceModelName = "Some Name";
		SimulinkModel sourceModel = this.factory.createSimulinkModel();
		sourceModel.setName(sourceModelName);
		sourceContainer.getModels().add(sourceModel);		
		
		//Create some block
		final String someBlockName = "Some Block";
		MiscBlock someBlock = this.factory.createMiscBlock();
		someBlock.setName(someBlockName);
		someBlock.setType("Constant");
		sourceModel.getBlocks().add(someBlock);
		
		//Create some subSystem
		final String someSubSystemName = "Some Sub System";
		SubSystem someSubSystem = this.factory.createSubSystem();
		someSubSystem.setName(someSubSystemName);
		sourceModel.getBlocks().add(someSubSystem);		
		
		assertModelIsValid(sourceContainer);
		
		//Save file, load it
		SimulinkContainer generatedContainer = this.saveAndParseAgain(sourceContainer, "SomeModel.mdl");
		assertModelIsValid(generatedContainer);
		
		SimulinkModel generatedSourceModel = generatedContainer.getModels().get(0);		
		assertEquals(sourceModelName, generatedSourceModel.getName());
		
		Block generatedSomeBlock = generatedSourceModel.getBlockByName(someBlockName);
		assertNotNull("Block '" +someBlockName+ "' is missing", generatedSomeBlock);
		
		Block generatedSomeSubSystem = generatedSourceModel.getBlockByName(someSubSystemName);
		assertNotNull("SubSystem '" +someSubSystemName+ "' is missing", generatedSomeSubSystem);			
	}
	
	@Test
	public void typeAttributeToParameter() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.createEmptyModel("TestModel");
		
		MiscBlock miscBlock = this.factory.createMiscBlock();
		final String miscBlockName = "MiscBlockName";
		miscBlock.setName(miscBlockName);
		final String miscBlockType = "Terminator";
		miscBlock.setType(miscBlockType);
		
		container.getModels().get(0).getBlocks().add(miscBlock);
		
		assertModelIsValid(container);
		
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "typeAttributeToParameter.mdl");
		assertModelIsValid(genContainer);
		
		MiscBlock genMiscBlock = (MiscBlock) genContainer.getModels().get(0).getBlockByName(miscBlockName);
		assertNotNull("Could not find block called " + miscBlockName, genMiscBlock);
		assertEquals(miscBlockType, genMiscBlock.getType());		
	}
	
	@Test
	public void usingALibrary() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer source = this.factory.createSimulinkContainer();
		
		//Create Library
		MiscBlock libBlock = this.factory.createMiscBlock();
		final String libBlockName = "Block in Library";
		libBlock.setName(libBlockName);
		libBlock.setType("Constant");
		
		SimulinkLibrary lib = this.factory.createSimulinkLibrary();
		final String libName = "LibraryName";
		lib.setName(libName);
		lib.getBlocks().add(libBlock);
		
		source.getLibraries().add(lib);
		
		//Create Model
		LibraryReference ref = this.factory.createLibraryReference();
		final String refName = "This is a Reference";
		ref.setName(refName);
		ref.setSourceBlock(libBlock);
		
		SimulinkModel model = this.factory.createSimulinkModel();
		model.setName("Model");
		model.getBlocks().add(ref);
		
		source.getModels().add(model);
		
		assertModelIsValid(source);
		
		//Save and parse
		SimulinkContainer generated = this.saveAndParseAgain(source, "usingALibrary.mdl");
		
		assertModelIsValid(generated);
		
		//Check: File creation
		assertTrue("Library file was not created",new File(this.tmpFolder.getRoot().toString() + File.separator + libName + ".mdl" ).exists());
		
		//Check
		assertEquals(source.getLibraries().size(), generated.getLibraries().size());
		assertEquals(source.getModels().size(), generated.getModels().size());
		
		SimulinkLibrary generatedLib = source.getLibraries().get(0);
		SimulinkModel generatedModel = source.getModels().get(0);
		
		LibraryReference generatedLibRef = (LibraryReference) generatedModel.getBlockByName(refName);
		assertNotNull("Reference in the model is missing", generatedLibRef);
		
		assertTrue("Library does not contain the source block.", generatedLib.getBlocks().contains( generatedLibRef.getSourceBlock() ));
	}
	
	/**
	 * SourceBlock --------> TargetBlockA
	 * 					|--> TargetBlockB
	 * @throws SimulinkBuilderException 
	 * @throws IOException 
	 */
	@Test
	public void lineWithBranches() throws IOException, SimulinkBuilderException
	{
		//Create source model
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();
		container.getModels().add(model);
		
		MiscBlock sourceBlock = this.factory.createMiscBlock();
		final String sourceBlockName = "SourceBlock"; 
		sourceBlock.setName(sourceBlockName);
		sourceBlock.setType("Constant");
		sourceBlock.getOutPorts().add(this.factory.createOutPortBlock());
		model.getBlocks().add(sourceBlock);
		
		MiscBlock targetBlockA = this.factory.createMiscBlock();
		final String targetBlockAName = "targetBlockA";
		targetBlockA.setName(targetBlockAName);
		targetBlockA.setType("Scope");
		targetBlockA.getInPorts().add(this.factory.createInPortBlock());
		model.getBlocks().add(targetBlockA);
		
		MiscBlock targetBlockB = this.factory.createMiscBlock();
		final String targetBlockBName = "targetBlockB";
		targetBlockB.setName(targetBlockBName);
		targetBlockB.setType("Scope");
		targetBlockB.getInPorts().add(this.factory.createInPortBlock());
		model.getBlocks().add(targetBlockB);
		
		Line connectionOne = this.factory.createLine();
		connectionOne.setSourceBlock(sourceBlock);
		connectionOne.setSourcePort(sourceBlock.getOutPorts().get(0));
		connectionOne.setTargetBlock(targetBlockA);
		connectionOne.setTargetPort(targetBlockA.getInPorts().get(0));
		model.getLines().add(connectionOne);
		
		Line connectionTwo = this.factory.createLine();
		connectionTwo.setSourceBlock(sourceBlock);
		connectionTwo.setSourcePort(sourceBlock.getOutPorts().get(0));
		connectionTwo.setTargetBlock(targetBlockB);
		connectionTwo.setTargetPort(targetBlockB.getInPorts().get(0));
		model.getLines().add(connectionTwo);
	
		
		assertModelIsValid(container);
		
		//Save and reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "lineWithBranches.mdl");
		assertModelIsValid(genContainer);
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		//Check
		assertEquals(model.getLines().size(), genModel.getLines().size());
		
		assertEquals(genModel.getBlockByName(sourceBlockName), genModel.getBlockByName(targetBlockAName).getIncomingLines().get(0).getSourceBlock());
		assertEquals(genModel.getBlockByName(sourceBlockName), genModel.getBlockByName(targetBlockBName).getIncomingLines().get(0).getSourceBlock());
		
	}
	
	/**
	 * SourceBlock1>---------<TargetA
	 *            2>---------<TargetB
	 * @throws SimulinkBuilderException 
	 * @throws IOException 
	 */
	@Test
	public void multiPort_mdl() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();		
		container.getModels().add(model);
		
		//SourceBlock
		final String sourceBlockName = "SourceBlock";
		SubSystem sourceBlock = this.factory.createSubSystem();
		sourceBlock.setName(sourceBlockName);
		OutPortBlock a = this.factory.createOutPortBlock();
		a.getInPorts().add(this.factory.createInPortBlock());
		sourceBlock.getOutPorts().add(a);
		OutPortBlock b = this.factory.createOutPortBlock();
		b.getInPorts().add(this.factory.createInPortBlock());
		sourceBlock.getOutPorts().add(b);
		model.getBlocks().add(sourceBlock);
		
		//TargetA
		final String targetAName = "TargetA";
		OutPortBlock targetA = this.factory.createOutPortBlock();
		targetA.setName(targetAName);
		targetA.getInPorts().add(this.factory.createInPortBlock());
		model.getOutPorts().add(targetA);
		
		//TargetB
		final String targetBName = "TargetB";
		OutPortBlock targetB = this.factory.createOutPortBlock();
		targetB.setName(targetBName);
		targetB.getInPorts().add(this.factory.createInPortBlock());
		model.getOutPorts().add(targetB);	
		
		//Connection 1<->A
		Line line1A = this.factory.createLine();
		line1A.setSourceBlock(sourceBlock);
		line1A.setSourcePort(sourceBlock.getOutPorts().get(0));
		line1A.setTargetBlock(targetA);
		line1A.setTargetPort(targetA.getInPorts().get(0));
		model.getLines().add(line1A);
		
		//Connection 2<->B
		Line line2B = this.factory.createLine();
		line2B.setSourceBlock(sourceBlock);
		line2B.setSourcePort(sourceBlock.getOutPorts().get(1));
		line2B.setTargetBlock(targetB);
		line2B.setTargetPort(targetB.getInPorts().get(0));
		model.getLines().add(line2B);
		
		assertModelIsValid(container);
		
		//Create and reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "multiPort.mdl");
		assertModelIsValid(genContainer);
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		SubSystem genSourceBlock = (SubSystem) genModel.getBlockByName(sourceBlockName); 
		OutPortBlock genTargetA = (OutPortBlock) genModel.getBlockByName(targetAName); 
		OutPortBlock genTargetB = (OutPortBlock) genModel.getBlockByName(targetBName);
		
		assertEquals(2, genModel.getLines().size());
		
		Line genLine1A = genTargetA.getIncomingLines().get(0);
		assertEquals(genSourceBlock, genLine1A.getSourceBlock());
		assertEquals(genSourceBlock.getOutPorts().get(0), genLine1A.getSourcePort());
		
		Line genLine2B = genTargetB.getIncomingLines().get(0);
		assertEquals(genSourceBlock, genLine2B.getSourceBlock());
		assertEquals(genSourceBlock.getOutPorts().get(1), genLine2B.getSourcePort());
	}
	
	@Test
	public void portOrder() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();		
		container.getModels().add(model);
		
		//Port one
		OutPortBlock outOne = this.factory.createOutPortBlock();
		final String outOneName = "Out1";
		outOne.setName(outOneName);
		outOne.getInPorts().add(this.factory.createInPortBlock());
		outOne.setType(DataType.INT8);
		model.getOutPorts().add(outOne);
		
		//Port two
		OutPortBlock outTwo = this.factory.createOutPortBlock();
		final String outTwoName = "Out2";
		outTwo.setName(outTwoName);
		outTwo.getInPorts().add(this.factory.createInPortBlock());
		model.getOutPorts().add(outTwo);
		
		//Port three
		OutPortBlock outThree = this.factory.createOutPortBlock();
		final String outThreeName = "Out3";
		outThree.setName(outThreeName);
		outThree.getInPorts().add(this.factory.createInPortBlock());
		model.getOutPorts().add(outThree);			
		
		assertModelIsValid(container);
		
		//Create and reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "portOrder.mdl");
		assertModelIsValid(genContainer);
		SimulinkModel genModel = genContainer.getModels().get(0);		
		
		//Check correct order
		assertEquals(outOneName, genModel.getOutPorts().get(0).getName());
		assertEquals(outTwoName, genModel.getOutPorts().get(1).getName());
		assertEquals(outThreeName, genModel.getOutPorts().get(2).getName());
		
		//Type
		assertEquals(outOne.getType(), genModel.getOutPorts().get(0).getType());
	}
	
	/**
	 * Simple chart creation
	 * @throws IOException
	 * @throws SimulinkBuilderException
	 */
	@Test
	public void chartCreation() throws IOException, SimulinkBuilderException
	{		
		//Container & Model
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();
		model.setName("chartCreation");
		container.getModels().add(model);
		
		//Stateflowmachine
		StateflowMachine sm = StateflowFactory.eINSTANCE.createStateflowMachine();
		model.setStateflowMachine(sm);
		
		//Chart
		final String chartName = "MyChart";
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		Parameter chartNameParameter = this.factory.createParameter();
		chartNameParameter.setName("name");
		chartNameParameter.setValue(chartName);
		chartNameParameter.setType(String.class);
		chart.getParameters().add(chartNameParameter);
		sm.getCharts().add(chart);
		
		//ChartBlock
		ChartBlock chartBlock = this.factory.createChartBlock();
		chartBlock.setName(chartName);
		chartBlock.setChart(chart);
		model.getBlocks().add(chartBlock);
		
		assertModelIsValid(container);
		
		//Reload
		SimulinkModel genModel = this.saveAndParseAgain(container, "chartCreation.mdl").getModels().get(0);
		assertModelIsValid(genModel);
		
		StateflowMachine genSm = genModel.getStateflowMachine();
		assertNotNull("Model does not contain a StateflowMachine", genSm);
		assertEquals(1, genSm.getCharts().size());
		
		ChartBlock genChartBlock = (ChartBlock) genModel.getBlockByName(chartName);
		assertNotNull("Model does not contain a ChartBlock", genChartBlock);
		assertNotNull("ChartBlock does not reference a chart", genChartBlock);
		
		//BlockChart connects to chart
		assertEquals(genChartBlock.getChart(), genSm.getCharts().get(0));
	}
	
	@Test
	public void stateAttributes() throws IOException, SimulinkBuilderException
	{
		//Container & Model
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();
		model.setName("stateAttributes");
		container.getModels().add(model);
		
		//Stateflowmachine
		StateflowMachine sm = StateflowFactory.eINSTANCE.createStateflowMachine();
		model.setStateflowMachine(sm);
		
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("stateAttributes");
		sm.getCharts().add(chart);
		
		//State
		State state = StateflowFactory.eINSTANCE.createState();
		chart.getNodes().add(state);
		
		Action duringAction = StateflowFactory.eINSTANCE.createAction();
		final String duringActionExpression = "during()";
		duringAction.setExpression(duringActionExpression);
		state.getDuringAction().add(duringAction);
		
		Action during2Action = StateflowFactory.eINSTANCE.createAction();
		final String duringAction2Expression = "during2()";
		during2Action.setExpression(duringAction2Expression);
		state.getDuringAction().add(during2Action);
				
		
		Action entryAction = StateflowFactory.eINSTANCE.createAction();
		final String entryActionExpression = "entry()";
		entryAction.setExpression(entryActionExpression);
		state.getEntryAction().add(entryAction);
		
		Action exitAction = StateflowFactory.eINSTANCE.createAction();
		final String exitActionExpression = "exit()";
		exitAction.setExpression(exitActionExpression);
		state.getExitAction().add(exitAction);
		
		final boolean initial = true;
		state.setInitial(initial);
		
		final String name = "StateName";
		state.setName(name);
		
		final int priority = 1;
		state.setPriority(priority);
		
		//ChartBlock
		ChartBlock chartBlock = this.factory.createChartBlock();
		chartBlock.setChart(chart);
		model.getBlocks().add(chartBlock);
				
		assertModelIsValid(container);
		
		//Reload
		SimulinkModel genModel = this.saveAndParseAgain(container, "stateAttributes.mdl").getModels().get(0);
		assertModelIsValid(genModel);
		
		StateflowMachine genSm = genModel.getStateflowMachine();
		assertNotNull("StateflowMachine not available", genSm);
		
		Chart genChart = genSm.getCharts().get(0);
		assertNotNull("Chart not available", genChart);
		
		assertEquals(1, genChart.getNodes().size());
		
		State genState = (State) genChart.getNodes().get(0);
		assertNotNull("State not available", genState);
		
		assertEquals(duringAction.getExpression() + "; " + during2Action.getExpression() + ";", genState.getDuringAction().get(0).getExpression());
		assertEquals(entryAction.getExpression()  + ";", genState.getEntryAction().get(0).getExpression());
		assertEquals(exitAction.getExpression()  + ";", genState.getExitAction().get(0).getExpression());
		assertEquals(initial, genState.isInitial());
		assertEquals(name, genState.getName());
		assertEquals(priority, genState.getPriority());
		
		//assertEquals(subStateType, genState.getSubStateType());		
	}
	
	/**
	 * Start -> End
	 * @throws SimulinkBuilderException 
	 * @throws IOException 
	 */
	@Test
	public void transitionAttributes() throws IOException, SimulinkBuilderException
	{
		//Container & Model
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();
		model.setName("transitionAttributes");
		container.getModels().add(model);
		
		//Stateflowmachine
		StateflowMachine sm = StateflowFactory.eINSTANCE.createStateflowMachine();
		model.setStateflowMachine(sm);
		
		//Chart
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName("transitionAttributes");
		sm.getCharts().add(chart);
		
		//Start State
		State start = StateflowFactory.eINSTANCE.createState();
		chart.getNodes().add(start);
		final String startName = "start";
		start.setName(startName);
		
		//End State
		State end = StateflowFactory.eINSTANCE.createState();
		chart.getNodes().add(end);
		final String endName = "end";
		end.setName(endName);		
		
		//Transition
		Transition transition = StateflowFactory.eINSTANCE.createTransition();
		chart.getTransitions().add(transition);
		transition.setSource(start);
		transition.setTarget(end);
		
		Action action = StateflowFactory.eINSTANCE.createAction();
		final String actionExpression = "action()";
		action.setExpression(actionExpression);
		transition.getAction().add(action);
		
		Action action2 = StateflowFactory.eINSTANCE.createAction();
		final String action2Expression = "action2()";
		action2.setExpression(action2Expression);
		transition.getAction().add(action2);		
		
		Action guard = StateflowFactory.eINSTANCE.createAction();
		final String guardExpression = "true";
		guard.setExpression(guardExpression);
		transition.getGuard().add(guard);
		
		Action guard2 = StateflowFactory.eINSTANCE.createAction();
		final String guard2Expression = "false";
		guard2.setExpression(guard2Expression);
		transition.getGuard().add(guard2);		
		
		final int priority = 2;
		transition.setPriority(priority);
		
		Event event = StateflowFactory.eINSTANCE.createEvent();
		final String eventName = "Event";
		event.setName(eventName);
		chart.getEvents().add(event);
		transition.setEvent(event);
		
		//ChartBlock
		ChartBlock chartBlock = this.factory.createChartBlock();
		chartBlock.setChart(chart);
		model.getBlocks().add(chartBlock);
				
		assertModelIsValid(container);
		
		//Reload
		SimulinkModel genModel = this.saveAndParseAgain(container, "transitionAttributes.mdl").getModels().get(0);
		assertModelIsValid(genModel);		
		
		StateflowMachine genSm = genModel.getStateflowMachine();
		assertNotNull("StateflowMachine not available", genSm);
		
		Chart genChart = genSm.getCharts().get(0);
		assertNotNull("Chart not available", genChart);
		
		assertEquals(2, genChart.getNodes().size());
		
		State genStart = (State) genChart.getSubState(startName);
		assertNotNull("Start not available", genStart);
		
		State genEnd = (State) genChart.getSubState(endName);
		assertNotNull("End not available", genEnd);		
		
		Transition genTransition = genStart.getOutgoing().get(0);
		assertNotNull("Transition not available", genTransition);
		
		assertEquals(action.getExpression() + "; " + action2.getExpression() + ";", genTransition.getAction().get(0).getExpression());
		assertEquals(guard.getExpression(), genTransition.getGuard().get(0).getExpression());
		assertEquals(guard2.getExpression(), genTransition.getGuard().get(1).getExpression());
		assertEquals(priority, genTransition.getPriority());
		assertEquals(eventName, genTransition.getEvent().getName());
				
	}
	
	/**
	 * --|     |--
	 *   |=====|
	 * --|     |--
	 */
	@Test
	public void busFromBusCreatorToBusSelector() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();		
		container.getModels().add(model);	
		
		Bus bus = this.factory.createBus();
		final String busName = "Bus";
		bus.setName(busName);
		bus.getElements().add(this.factory.createBusElement());
		bus.getElements().get(0).setName("A");
		bus.getElements().add(this.factory.createBusElement());
		bus.getElements().get(1).setName("B");
		model.getBuses().add(bus);
		
		BusCreator busCreator = this.factory.createBusCreator();
		final String busCreatorName = "BusCreator";
		busCreator.setName(busCreatorName);
		busCreator.getOutPorts().add(this.factory.createOutPortBlock());
		busCreator.getInPorts().add(this.factory.createInPortBlock());
		busCreator.getInPorts().add(this.factory.createInPortBlock());
		model.getBlocks().add(busCreator);
		
		BusSelector busSelector = this.factory.createBusSelector();
		final String busSelectorName = "BusSelector";
		busSelector.setName(busSelectorName);
		busSelector.getInPorts().add(this.factory.createInPortBlock());
		busSelector.getOutPorts().add(this.factory.createOutPortBlock());
		busSelector.getOutPorts().add(this.factory.createOutPortBlock());
		model.getBlocks().add(busSelector);
		
		Line busLine = this.factory.createLine();
		busLine.setSourceBlock(busCreator);
		busLine.setSourcePort(busCreator.getOutPorts().get(0));
		busLine.setTargetBlock(busSelector);
		busLine.setBus(bus);
		model.getLines().add(busLine);
		busLine.setTargetPort(busSelector.getInPorts().get(0));
		
		assertModelIsValid(container);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "BusFromBusCreatorToBusSelector.mdl");
		assertModelIsValid(genContainer);
				
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(2, genModel.getBlocks().size());
		assertEquals(1, genModel.getLines().size());
		
		assertEquals(1, genModel.getBuses().size());
		Bus genBus = genModel.getBuses().get(0);
		assertEquals(busName, genBus.getName());		
		
		BusCreator genBusCreator = (BusCreator) genModel.getBlockByName(busCreatorName);
		assertNotNull("BusCreator not available", genBusCreator);
		assertEquals(genBus, genBusCreator.getBus());
		assertEquals(1, genBusCreator.getOutPorts().size());
		assertEquals(2, genBusCreator.getInPorts().size());	
		
		BusSelector genBusSelector = (BusSelector) genModel.getBlockByName(busSelectorName);
		assertNotNull("BusSelector not available", genBusSelector);
		assertEquals(genBus, genBusSelector.getBus());
		assertEquals(1, genBusSelector.getInPorts().size());
		assertEquals(2, genBusSelector.getOutPorts().size());
	}
	
	/**
	 * A Bus from an Inport directly to an Outport	
	 */
	@Test
	public void busFromPortToPort() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();		
		container.getModels().add(model);	
		
		Bus bus = this.factory.createBus();
		final String busName = "Bus";
		bus.setName(busName);
		model.getBuses().add(bus);
		
		SubSystem busProducer = this.factory.createSubSystem();
		final String busProducerName = "BusProducer";
		busProducer.setName(busProducerName);
		model.getBlocks().add(busProducer);
		
		OutPortBlock producerPort = this.factory.createOutPortBlock();
		producerPort.getInPorts().add(this.factory.createInPortBlock());
		busProducer.getOutPorts().add(producerPort);
		
		SubSystem busConsumer = this.factory.createSubSystem();
		final String busConsumerName = "BusConsumer";
		busConsumer.setName(busConsumerName);
		model.getBlocks().add(busConsumer);
		
		InPortBlock consumerPort = this.factory.createInPortBlock();
		consumerPort.getOutPorts().add(this.factory.createOutPortBlock());
		busConsumer.getInPorts().add(consumerPort);
		
		Line busLine = this.factory.createLine();
		busLine.setSourceBlock(busProducer);
		busLine.setSourcePort(busProducer.getOutPorts().get(0));
		busLine.setTargetBlock(busConsumer);
		busLine.setTargetPort(busConsumer.getInPorts().get(0));
		busLine.setBus(bus);
		model.getLines().add(busLine);
		
		assertModelIsValid(container);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "BusFromPortToPort.mdl");
		assertModelIsValid(genContainer);	
				
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(2, genModel.getBlocks().size());
		assertEquals(1, genModel.getLines().size());
		
		assertEquals(1, genModel.getBuses().size());
		Bus genBus = genModel.getBuses().get(0);
		assertEquals(busName, genBus.getName());		
		
		SubSystem genBusProducer = (SubSystem) genModel.getBlockByName(busProducerName);
		assertNotNull("BusProducer not available", genBusProducer);
				
		SubSystem genBusConsumer = (SubSystem) genModel.getBlockByName(busConsumerName);
		assertNotNull("BusConsumer not available", genBusConsumer);		
		
		Line genLine = genBusProducer.getOutgoingLines().get(0);
		assertEquals(genBus, genLine.getBus());
	}
	
	@Test 
	public void id() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();		
		container.getModels().add(model);
		
		SubSystem subSystem = this.factory.createSubSystem();
		subSystem.setName("SubSystem");
		model.getBlocks().add(subSystem);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "id.mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		SubSystem genSubSystem = (SubSystem) genModel.getBlocks().get(0);
		assertEquals(subSystem.getId(), genSubSystem.getId());
		
	}
	
	@Test
	public void embeddedMatlabFunction() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("embeddedMatlabFunction");
		container.getModels().add(model);	
		
		EmbeddedMatlabFunction function = this.factory.createEmbeddedMatlabFunction();
		final String functionName = "name";
		function.setName(functionName);
		final String functionCode = "code";
		function.setCode(functionCode);
		model.getBlocks().add(function);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "embeddedMatlabFunction.mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(1, genModel.getBlocks().size());
		assertNull(genModel.getStateflowMachine());
		
		EmbeddedMatlabFunction genFunction = (EmbeddedMatlabFunction) genModel.getBlocks().get(0);
		assertEquals(functionName, genFunction.getName());
		assertEquals(functionCode, genFunction.getCode());
		
	}
	
	@Test
	public void embeddedMatlabFunctionWithPorts() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("embeddedMatlabFunctionWithPorts");
		container.getModels().add(model);	
		
		EmbeddedMatlabFunction function = this.factory.createEmbeddedMatlabFunction();
		function.setName("foo");
		function.setCode("function out = foo(in)\\n out=in;");
		model.getBlocks().add(function);
		
		InPortBlock in = this.factory.createInPortBlock();
		final String inName = "in";
		in.setName(inName);
		final DataType inType = DataType.INT16;
		in.setType(inType);
		function.getInPorts().add(in);
		
		OutPortBlock out = this.factory.createOutPortBlock();
		final String outName = "out";
		out.setName(outName);
		final DataType outType = DataType.INT32;
		out.setType(outType);
		function.getOutPorts().add(out);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+".mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		EmbeddedMatlabFunction genFunction = (EmbeddedMatlabFunction) genModel.getBlocks().get(0);
		
		assertEquals(1, genFunction.getInPorts().size());
		InPortBlock genIn = genFunction.getInPorts().get(0);
		assertEquals(inName, genIn.getName());
		assertEquals(inType, genIn.getType());
		
		assertEquals(1, genFunction.getOutPorts().size());
		OutPortBlock genOut = genFunction.getOutPorts().get(0);
		assertEquals(outName, genOut.getName());
		assertEquals(outType, genOut.getType());		
	}
	
	@Test
	public void unitDelay() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("unitDelay");
		container.getModels().add(model);	
		
		UnitDelay unitDelay = this.factory.createUnitDelay();
		final String unitDelayName = "Unit Delay";
		unitDelay.setName(unitDelayName);
		unitDelay.getInPorts().add(this.factory.createInPortBlock());
		unitDelay.getOutPorts().add(this.factory.createOutPortBlock());
		model.getBlocks().add(unitDelay);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, "unitDelay.mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(1, genModel.getBlocks().size());
		assertTrue(genModel.getBlocks().get(0) instanceof UnitDelay);
		
		UnitDelay genUnitDelay = (UnitDelay) genModel.getBlocks().get(0);
		assertEquals(unitDelayName, genUnitDelay.getName());
		
	}	
	
	@Test
	public void digitalClock() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("digitalClock");
		container.getModels().add(model);	
		
		DigitalClock clock = this.factory.createDigitalClock();
		final String clockName = "My Digital Clock";
		clock.setName(clockName);
		final double clockSampleTime = 2.0;
		clock.setSampleTime(clockSampleTime);
		model.getBlocks().add(clock);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(1, genModel.getBlocks().size());
		assertTrue(genModel.getBlocks().get(0) instanceof DigitalClock);
		
		DigitalClock genClock = (DigitalClock) genModel.getBlocks().get(0);
		assertEquals(clockName, genClock.getName());	
		assertEquals(clockSampleTime, genClock.getSampleTime(), 0.001);
	}
	
	@Test
	public void constant() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("constant");
		container.getModels().add(model);	
		
		Constant constant = this.factory.createConstant();
		final String constantName = "My Constant";
		constant.setName(constantName);
		final DataType constantType = DataType.UINT32;
		constant.setType(constantType);
		final String constantValue = "23";
		constant.setValue(constantValue);
		model.getBlocks().add(constant);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		assertEquals(1, genModel.getBlocks().size());
		assertTrue(genModel.getBlocks().get(0) instanceof Constant);
		
		Constant genConstant = (Constant) genModel.getBlocks().get(0);
		assertEquals(constantName, genConstant.getName());
		assertEquals(constantValue, genConstant.getValue());
		assertEquals(constantType, genConstant.getType());
	}
	
	@Test
	public void portDimensions() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("portDimensions");
		container.getModels().add(model);
		
		InPortBlock inport = this.factory.createInPortBlock();
		final String inportDimensions = "23";
		inport.setDimensions(inportDimensions);
		model.getBlocks().add(inport);
		
		OutPortBlock outport = this.factory.createOutPortBlock();
		final String outportDimensions = "23";
		outport.setDimensions(outportDimensions);
		model.getBlocks().add(outport);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);	
		
		SimulinkModel genModel = genContainer.getModels().get(0);		
		assertEquals(inportDimensions, genModel.getInPorts().get(0).getDimensions());
		assertEquals(outportDimensions, genModel.getOutPorts().get(0).getDimensions());
	}
	
	/**
	 * A -     - B
	 *    |===|
	 * B -     - A
	 * @throws SimulinkBuilderException 
	 * @throws IOException 
	 */
	@Test
	public void busWithoutObject() throws IOException, SimulinkBuilderException
	{
		final String busName = "bus";
		final String busElementA = "a";
		final String busElementB = "b";
		
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("busWithoutObject");
		container.getModels().add(model);
		
		Constant A = this.factory.createConstant();
		A.getOutPorts().add(this.factory.createOutPortBlock());
		model.getBlocks().add(A);
		
		Constant B = this.factory.createConstant();
		B.getOutPorts().add(this.factory.createOutPortBlock());
		model.getBlocks().add(B);
		
		BusCreator busCreator = this.factory.createBusCreator();
		final String busCreatorName = "BusCreator";
		busCreator.setName(busCreatorName);
		busCreator.getInPorts().add(this.factory.createInPortBlock());
		busCreator.getInPorts().get(0).setName(busElementA);
		busCreator.getInPorts().add(this.factory.createInPortBlock());
		busCreator.getInPorts().get(1).setName(busElementB);
		busCreator.getOutPorts().add(this.factory.createOutPortBlock());
		busCreator.getOutPorts().get(0).setName(busName);
		model.getBlocks().add(busCreator);
		
		BusSelector busSelector = this.factory.createBusSelector();
		final String busSelectorName = "BusSelector";
		busSelector.setName(busSelectorName);
		busSelector.getInPorts().add(this.factory.createInPortBlock());
		busSelector.getOutPorts().add(this.factory.createOutPortBlock());
		busSelector.getOutPorts().get(0).setName(busElementB);
		busSelector.getOutPorts().add(this.factory.createOutPortBlock());
		busSelector.getOutPorts().get(1).setName(busElementA);
		model.getBlocks().add(busSelector);
		
		MiscBlock scopeA = this.factory.createMiscBlock();
		scopeA.setName("Scope A");
		scopeA.setType("Scope");
		scopeA.getInPorts().add(this.factory.createInPortBlock());
		model.getBlocks().add(scopeA);
		
		MiscBlock scopeB = this.factory.createMiscBlock();
		scopeB.setName("Scope B");
		scopeB.setType("Scope");
		scopeB.getInPorts().add(this.factory.createInPortBlock());
		model.getBlocks().add(scopeB);
		
		Line AbusCreator = this.factory.createLine();
		AbusCreator.setSourceBlock(A);
		AbusCreator.setSourcePort(A.getOutPorts().get(0));
		AbusCreator.setTargetBlock(busCreator);
		AbusCreator.setTargetPort(busCreator.getInPorts().get(0));
		model.getLines().add(AbusCreator);
		
		Line BbusCreator = this.factory.createLine();
		BbusCreator.setSourceBlock(B);
		BbusCreator.setSourcePort(B.getOutPorts().get(0));
		BbusCreator.setTargetBlock(busCreator);
		BbusCreator.setTargetPort(busCreator.getInPorts().get(1));
		model.getLines().add(BbusCreator);
		
		Line busCreatorBusSelector = this.factory.createLine();
		busCreatorBusSelector.setSourceBlock(busCreator);
		busCreatorBusSelector.setSourcePort(busCreator.getOutPorts().get(0));
		busCreatorBusSelector.setTargetBlock(busSelector);
		busCreatorBusSelector.setTargetPort(busSelector.getInPorts().get(0));
		model.getLines().add(busCreatorBusSelector);
		
		Line busSelectorScopeB = this.factory.createLine();
		busSelectorScopeB.setSourceBlock(busSelector);
		busSelectorScopeB.setSourcePort(busSelector.getOutPorts().get(0));
		busSelectorScopeB.setTargetBlock(scopeB);
		busSelectorScopeB.setTargetPort(scopeB.getInPorts().get(0));
		model.getLines().add(busSelectorScopeB);
		
		Line busSelectorScopeA = this.factory.createLine();
		busSelectorScopeA.setSourceBlock(busSelector);
		busSelectorScopeA.setSourcePort(busSelector.getOutPorts().get(1));
		busSelectorScopeA.setTargetBlock(scopeA);
		busSelectorScopeA.setTargetPort(scopeA.getInPorts().get(0));
		model.getLines().add(busSelectorScopeA);
		
		assertModelIsValid(model);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		BusCreator genBusCreator = (BusCreator) genModel.getBlockByName(busCreatorName);
		assertNotNull(genBusCreator);
		assertEquals(2, genBusCreator.getInPorts().size());
		assertEquals(busElementA, genBusCreator.getInPorts().get(0).getName());
		assertEquals(busElementB, genBusCreator.getInPorts().get(1).getName());
		assertEquals(1, genBusCreator.getOutPorts().size());
		assertEquals(busName, genBusCreator.getOutPorts().get(0).getName());
		
		BusSelector genBusSelector = (BusSelector) genModel.getBlockByName(busSelectorName);
		assertNotNull(genBusSelector);
		assertEquals(1, genBusSelector.getInPorts().size());

		assertEquals(2, genBusSelector.getOutPorts().size());
		assertEquals(busElementB, genBusSelector.getOutPorts().get(0).getName());
		assertEquals(busElementA, genBusSelector.getOutPorts().get(1).getName());
	}
		
	@Test
	public void enabledSubSystem() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("enabledSubSystem");
		container.getModels().add(model);		
		
		SubSystem enabledSubSystem = this.factory.createSubSystem();
		enabledSubSystem.setName("EnabledSubSystem");
		enabledSubSystem.getInPorts().add(this.factory.createEnablePort());
		model.getBlocks().add(enabledSubSystem);
		
		assertModelIsValid(model);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		SubSystem genEnabledSubSystem = genModel.getSubSystems().get(0);
		assertEquals(1, genEnabledSubSystem.getInPorts().size());
		assertTrue(genEnabledSubSystem.getInPorts().get(0) instanceof EnablePort);
	}
	
	@Test
	public void triggeredSubSystem() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("triggeredSubSystem");
		container.getModels().add(model);		
		
		SubSystem triggeredSubSystem = this.factory.createSubSystem();
		triggeredSubSystem.setName("TriggeredSubSystem");
		triggeredSubSystem.getInPorts().add(this.factory.createTriggerPort());
		model.getBlocks().add(triggeredSubSystem);
		
		assertModelIsValid(model);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);
		
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		SubSystem genTriggeredSubSystem = genModel.getSubSystems().get(0);
		assertEquals(1, genTriggeredSubSystem.getInPorts().size());
		assertTrue(genTriggeredSubSystem.getInPorts().get(0) instanceof TriggerPort);
	}	
	
	@Test
	public void busGeneration() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("busGeneration");
		container.getModels().add(model);	
		
		BusElement busAElement = this.factory.createBusElement();
		busAElement.setName("elementA");
		busAElement.setDimensions("2");
		busAElement.setType(DataType.SINGLE);
		
		Bus busA = this.factory.createBus();
		busA.setName("BusA");
		busA.getElements().add(busAElement);
		model.getBuses().add(busA);
		
		BusElement busBElement = this.factory.createBusElement();
		busBElement.setName("elementB");
		busBElement.setDimensions("2");
		busBElement.setBus(busA);
		busBElement.setType(DataType.BUS);
		
		Bus busB = this.factory.createBus();
		busB.setName("BusB");
		busB.getElements().add(busBElement);		
		model.getBuses().add(busB);
		
		SubSystem subSystemA = this.factory.createSubSystem();
		model.getBlocks().add(subSystemA);
		
		InPortBlock inPort = this.factory.createInPortBlock();
		inPort.getOutPorts().add(this.factory.createOutPortBlock());
		subSystemA.getInPorts().add(inPort);
		
		SubSystem subSystemB = this.factory.createSubSystem();
		model.getBlocks().add(subSystemB);
		
		OutPortBlock outPort = this.factory.createOutPortBlock();
		outPort.getInPorts().add(this.factory.createInPortBlock());
		subSystemB.getOutPorts().add(outPort);
		
		Line line = this.factory.createLine();
		line.setSourceBlock(subSystemB);
		line.setSourcePort(subSystemB.getOutPorts().get(0));
		line.setTargetBlock(subSystemA);
		line.setTargetPort(subSystemA.getInPorts().get(0));
		line.setBus(busB);
		model.getLines().add(line);
		
		
		
		
		assertModelIsValid(model);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);
		
		SimulinkModel genModel = genContainer.getModels().get(0);	
		
		assertEquals(2, genModel.getBuses().size());
		assertEquals("2", genModel.getBuses().get(0).getElements().get(0).getDimensions());
		
	}
	
	@Test
	public void zeroOrderHold() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();	
		model.setName("zeroOrderHold");
		container.getModels().add(model);
		
		ZeroOrderHold zeroOrderHold = this.factory.createZeroOrderHold();
		final String zeroOrderHoldName = "ZeroOrderHold";
		zeroOrderHold.setName(zeroOrderHoldName);
		final String zeroOrderHoldSampleTime = "2.3";
		zeroOrderHold.setSampleTime(zeroOrderHoldSampleTime);
		model.getBlocks().add(zeroOrderHold);
		
		assertModelIsValid(model);
		
		//Reload
		SimulinkContainer genContainer = this.saveAndParseAgain(container, model.getName()+ ".mdl");
		assertModelIsValid(genContainer);
		
		SimulinkModel genModel = genContainer.getModels().get(0);		
		
		ZeroOrderHold genZeroOrderHold = (ZeroOrderHold) genModel.getBlockByName(zeroOrderHoldName);
		assertNotNull("ZeroOrderHold not found", genZeroOrderHold);
		assertEquals(zeroOrderHoldSampleTime, genZeroOrderHold.getSampleTime());
		
	}
	
	protected SimulinkContainer saveAndParseAgain(SimulinkContainer source, String fileName) throws IOException, SimulinkBuilderException
	{
		File tmpFile = this.tmpFolder.newFile(fileName);
		
		this.writer.setModel(source);
		this.writer.writeToFile(tmpFile.toString());
		
		return this.builder.buildFromFile(tmpFile.toString());
	}
	
	protected SimulinkContainer createEmptyModel(String name)
	{
		SimulinkContainer container = this.factory.createSimulinkContainer();
		SimulinkModel model = this.factory.createSimulinkModel();
		model.setName(name);
		container.getModels().add(model);
		return container;
	}
	

}
