package org.muml.simulink.adapter.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.DataType;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.History;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.SubStateType;
import org.muml.simulink.stateflow.Transition;
import org.muml.simulink.test.TestBase;

import edu.tum.cs.commons.logging.SimpleLogger;
import edu.tum.cs.simulink.builder.SimulinkModelBuilder;

public class StateflowBuilderTest extends TestBase
{
	private StateflowBuilder builder = null;
	
	
	@Before
	public void setUp()
	{	
		this.builder = new StateflowBuilder();
	}
	
	@After
	public void tearDown()
	{
		this.builder = null;
	}
	
	@Test
	public void machineHasParameters() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = new edu.tum.cs.simulink.model.stateflow.StateflowMachine(new edu.tum.cs.simulink.model.SimulinkModel(null,true));
		sourceMachine.setParameter("id", "1");
		sourceMachine.setParameter("name", "sourceMachine");
		
		StateflowMachine targetMachine = this.builder.buildStateflowMachine(sourceMachine);
		assertEquals("1", targetMachine.getParameter("id"));
		assertEquals("sourceMachine", targetMachine.getParameter("name"));
	}
	
	@Test
	public void chartHasParameters() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowChart sourceChart = new edu.tum.cs.simulink.model.stateflow.StateflowChart();
		sourceChart.setParameter("id", "2");
		sourceChart.setParameter("name", "sourceChart");
		
		Chart targetChart = this.builder.buildChart(sourceChart);
		assertEquals("2", targetChart.getParameter("id"));
		assertEquals("sourceChart", targetChart.getName());		
	}

	
	@Test
	public void emptyStateflow_mdl() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/EmptyStateflow.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);
		
		assertNotNull(machine);
		assertEquals("EmptyStateflow", machine.getParameter("name"));		
		
		assertEquals(sourceMachine.getCharts().size(), machine.getCharts().size());		
	}
	
	@Test
	public void simpleStateflow_mdl() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/SimpleStateflow.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);
		
		assertEquals(1, machine.getCharts().size());
		
		Chart chart = machine.getCharts().get(0);
		
		assertEquals(2, chart.getNodes().size());
		//"default transition" not represented in the model
		assertEquals(1, chart.getTransitions().size());
		
		State startState = chart.getSubState("Start");
		State endState = chart.getSubState("End");
		
		assertNotNull("There is a state labeled Start", startState);
		assertNotNull("There is a state labeled End", endState);
		
		assertEquals(0, startState.getIncoming().size());
		assertEquals(1, startState.getOutgoing().size());
		assertTrue(startState.isInitial());

		assertEquals(1, endState.getIncoming().size());
		assertEquals(0, endState.getOutgoing().size());
		
		assertEquals(endState,startState.getOutgoing().get(0).getTarget());		
	}
	
	@Test
	public void StateAttributes() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/StateAttributes.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);
		
		assertEquals(1, machine.getCharts().size());
		
		Chart chart = machine.getCharts().get(0);
		
		assertEquals("Chart", chart.getName());
		assertEquals(0, chart.getEntryAction().size());
		assertEquals(0, chart.getDuringAction().size());
		assertEquals(0, chart.getExitAction().size());
		assertTrue(chart.isInitial());
		assertEquals(SubStateType.EXCLUSIVE,chart.getSubStateType());
		assertNull(chart.getParent());
		assertEquals(1, chart.getPriority());
		
		assertEquals(1, chart.getNodes().size());
		
		State state = (State) chart.getNodes().get(0);
		assertEquals("State", state.getName());
		assertNotNull("No entryAction found", state.getEntryAction());
		assertEquals("doEntry()", state.getEntryAction().get(0).getExpression());
		assertNotNull("No duringAction found", state.getDuringAction());
		assertEquals("doDuring()", state.getDuringAction().get(0).getExpression());
		assertNotNull("No exitAction found", state.getExitAction());
		assertEquals("doExit()", state.getExitAction().get(0).getExpression());
		assertTrue(state.isInitial());
		assertEquals(SubStateType.PARALLEL, state.getSubStateType());
		assertEquals(chart, state.getParent());
		assertEquals(1, state.getPriority());
		
		assertEquals(1, state.getLocal().size());
		
		assertEquals(1, state.getConstant().size());
		assertEquals("5", state.getConstant().get(0).getValue());
	}
	
	@Test
	public void transitionAttributes() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/TransitionAttributes.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		
		State stateA = chart.getSubState("A");
		
		assertNotNull(stateA);
		
		Transition transition = stateA.getOutgoing().get(0);
		
		assertNotNull(transition);
		
		assertNotNull("No guard found", transition.getGuard());
		assertEquals(2, transition.getGuard().size());
		assertEquals("true", transition.getGuard().get(0).getExpression());
		assertEquals("A", transition.getGuard().get(1).getExpression());
		assertNotNull("No action found", transition.getAction());
		assertEquals("doCondition()", transition.getAction().get(0).getExpression());
		assertEquals(1, transition.getPriority());
		
		assertEquals("event", transition.getEvent().getName());		
	}
	
	@Test
	public void transitionPriorities() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/TransitionPriorities.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		Transition transition1 = null;
		Transition transition2 = null;
		Transition transition3 = null;
		
		for(Transition transition: chart.getTransitions())
		{
			if("Prio1".equals(transition.getGuard().get(0).getExpression()))
				transition1 = transition;
			else if("Prio2".equals(transition.getGuard().get(0).getExpression()))
				transition2 = transition;
			else if("Prio3".equals(transition.getGuard().get(0).getExpression()))
				transition3 = transition;
		}
		
		assertEquals(1, transition1.getPriority());
		assertEquals(2, transition2.getPriority());
		assertEquals(3, transition3.getPriority());
	}
	
	@Test
	public void events() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/Events.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		State state = (State) chart.getNodes().get(0);
		State subState = (State) state.getNodes().get(0);
		
		assertEquals(1, chart.getEvents().size());
		assertEquals("chartEvent", chart.getEvents().get(0).getName());
		
		assertEquals(1, state.getEvents().size());
		assertEquals("stateEvent", state.getEvents().get(0).getName());		
		
		assertEquals(1, subState.getEvents().size());
		assertEquals("subStateEvent", subState.getEvents().get(0).getName());			
	}
	
	@Test
	public void junctions() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/Junctions.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		
		assertEquals(4, chart.getNodes().size());
		
		State startState = chart.getSubState("Start");
		State endState = chart.getSubState("End");
			
		assertNotNull("Start-State not available", startState);
		assertNotNull("End-State not available", endState);
		
		Junction leftJunction = (Junction) startState.getOutgoing().get(0).getTarget();
		assertNotNull("Left junction not available", leftJunction);
		assertEquals(2, leftJunction.getOutgoing().size());		
		
		Junction rightJunction = (Junction) endState.getIncoming().get(0).getSource();
		assertNotNull("Right junction not available",rightJunction);
		assertEquals(2, rightJunction.getIncoming().size());
		
		
		assertEquals(rightJunction, leftJunction.getOutgoing().get(0).getTarget());
		assertEquals(rightJunction, leftJunction.getOutgoing().get(1).getTarget());
		
		assertEquals(leftJunction, rightJunction.getIncoming().get(0).getSource());
		assertEquals(leftJunction, rightJunction.getIncoming().get(1).getSource());
	}
	
	@Test
	public void subStates() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/SubStates.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		
		State state = chart.getSubState("State");
		assertNotNull("State not available", state);
		
		State subStateA = state.getSubState("SubStateA");
		assertNotNull("SubStateA not available", subStateA);
		
		State subStateB = state.getSubState("SubStateB");
		assertNotNull("SubStateB not available", subStateB);
		
		State subSubStateA = subStateA.getSubState("SubSubState");
		assertNotNull("SubStateA.SubSubState not available", subSubStateA);
		
		State subSubStateB = subStateB.getSubState("SubSubState");
		assertNotNull("SubStateB.SubSubState not available", subSubStateB);
	}
	
	@Test 
	public void initState() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/InitState.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		
		State state = (State) chart.getNodes().get(0);
		assertTrue(state.isInitial());
		assertEquals(0, chart.getTransitions().size());
		assertEquals(0, state.getIncoming().size());		
	}
	
	@Test
	public void EMF() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/EMF.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);	
		
		assertEquals(2, chart.getEmbeddedFunctions().size());
		
		EmbeddedFunction doTransition = null;
		EmbeddedFunction doState = null;
		
		for(EmbeddedFunction function: chart.getEmbeddedFunctions())
		{
			if(function.getName().equals("doTransition"))
				doTransition = function;
			else if(function.getName().equals("doState"))
				doState = function;			
		}		
		assertNotNull("Embedded Function doTransition is not available", doTransition);
		assertNotNull("Embedded Function doState is not available", doState);
		
		assertEquals("function doTransition\\n%doTransition", doTransition.getCode());
		assertEquals("function doState\\n%doState", doState.getCode());
		
		State state = chart.getSubState("State");
		assertEquals(1, state.getEmbeddedFunctions().size());
		
		EmbeddedFunction nestedEMF = state.getEmbeddedFunctions().get(0);
		assertEquals("nestedEMF", nestedEMF.getName());
		assertEquals("function nestedEMF\\n%nestedEMF\\n", nestedEMF.getCode());
		
		assertNull("eml.isEML Parameter is still there", doTransition.getParameter("eml.isEML"));
		assertNull("eml.script Parameter is still there", doTransition.getParameter("eml.script"));
		
	}
	
	@Test
	public void EMFwithData() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/EMFwithData.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);	
		
		assertEquals(1, chart.getEmbeddedFunctions().size());
		EmbeddedFunction emf = chart.getEmbeddedFunctions().get(0);
		
		assertEquals(2, emf.getInput().size());
		Data in = emf.getInput().get(0);
		assertTrue(in.getName().startsWith("in"));
		assertEquals(DataType.DOUBLE, in.getType());
		
			
		assertEquals(2, emf.getOutput().size());
		Data out = emf.getOutput().get(0);
		assertTrue(out.getName().startsWith("out"));
		assertEquals(DataType.DOUBLE, out.getType());
		
		assertEquals(1, emf.getConstant().size());
		Data emfconst = emf.getConstant().get(0);
		assertEquals("const", emfconst.getName());
		assertEquals(DataType.DOUBLE, emfconst.getType());
		assertEquals("1", emfconst.getSize());
		
		assertEquals(1, emf.getLocal().size());
		Data emflocal = emf.getLocal().get(0);
		assertEquals("local", emflocal.getName());
		assertEquals(DataType.DOUBLE, emflocal.getType());	
		assertEquals("[1,2]", emflocal.getSize());

		//Chart
		assertEquals(1, chart.getConstant().size());
		Data constData = chart.getConstant().get(0);
		assertEquals("const", constData.getName());
		assertEquals(DataType.DOUBLE, constData.getType());
		
		
		assertEquals(1, chart.getLocal().size());
		Data local = chart.getLocal().get(0);
		assertEquals("localVar", local.getName());
		assertEquals(DataType.DOUBLE, local.getType());		
		
		
		
	}
	
	@Test
	public void History() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/History.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);		
		Chart chart = machine.getCharts().get(0);
		
		assertEquals(1, chart.getNodes().size());
		assertTrue(chart.getNodes().get(0) instanceof History);
	}
	
	@Test
	public void id() throws StateflowBuilderException
	{
		edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine = this.loadStateflowFromFile("tests/data/Stateflow/SimpleStateflow.mdl");
		StateflowMachine machine = this.builder.buildStateflowMachine(sourceMachine);

		assertEquals("_MACHINETESTIDcvwp0ASHE", machine.getId());
		
		Chart chart = machine.getCharts().get(0);
		assertEquals("_CHARTTESTIDcvwp0ASHEdf", chart.getId());
		
		State startState = chart.getSubState("Start");
		assertEquals("_STARTTESTIDcvwp0ASHErt", startState.getId());
		
		State endState = chart.getSubState("End");
		assertEquals("_ENDTESTIDcvwp0ASHErtzu", endState.getId());
		
		assertEquals("_TRANSITIONTESTIDcvwp0A", chart.getTransitions().get(0).getId());
	}	

	protected edu.tum.cs.simulink.model.stateflow.StateflowMachine loadStateflowFromFile(String fileName)
	{
		SimulinkModelBuilder smb = new SimulinkModelBuilder(new File(fileName), new SimpleLogger());		
		try 
		{
			edu.tum.cs.simulink.model.SimulinkModel model = smb.buildModel();
			return model.getStateflowMachine();
		} 
		catch (Exception e) 
		{
			fail(e.toString());
			return null;
		}		
	}

}
