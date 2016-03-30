package de.uni_paderborn.fujaba.simulink.model.stateflow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.adapter.model.ChartBlock;
import org.muml.simulink.adapter.model.InPortBlock;
import org.muml.simulink.adapter.model.OutPortBlock;
import org.muml.simulink.adapter.model.SimulinkFactory;
import org.muml.simulink.adapter.model.SimulinkModel;
import org.muml.simulink.adapter.model.stateflow.Chart;
import org.muml.simulink.adapter.model.stateflow.Data;
import org.muml.simulink.adapter.model.stateflow.StateflowFactory;
import org.muml.simulink.adapter.model.stateflow.StateflowMachine;

import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class ChartTest extends TestBase 
{
	private StateflowFactory factory = null;
	
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
	public void chartWithChartBlockPortSync()
	{
		SimulinkModel model = SimulinkFactory.eINSTANCE.createSimulinkModel();
		model.setName("chartWithChartBlockPortSync");
		
		StateflowMachine machine = this.factory.createStateflowMachine();
		model.setStateflowMachine(machine);
		
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		machine.getCharts().add(chart);
		
		Data input = this.factory.createData();
		input.setName("input");
		chart.getInput().add(input);
		
		Data output = this.factory.createData();
		output.setName("output");
		chart.getOutput().add(output);
		
		assertModelIsValid(model);
		
		ChartBlock chartBlock = SimulinkFactory.eINSTANCE.createChartBlock();
		chartBlock.setName("ChartBlock");
		model.getBlocks().add(chartBlock);
		chart.setBlock(chartBlock);
		
		assertModelIsNotValid(model);
		
		
		InPortBlock inPort = SimulinkFactory.eINSTANCE.createInPortBlock();
		inPort.setName(input.getName());
		chartBlock.getInPorts().add(inPort);
		
		OutPortBlock outPort = SimulinkFactory.eINSTANCE.createOutPortBlock();
		outPort.setName(output.getName());
		chartBlock.getOutPorts().add(outPort);
		
		assertModelIsValid(model);
		
	}
}
