package org.muml.simulink.adapter.m2t.xtend;

import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.DataType;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.Transition;

public class EmbeddedMatlabFunction 
{
	private final static String FUNCTION_NAME = "eML_blk_kernel";
	
	/**
	 * An EmbeddedMatlabFunction in Simulink is not stored in a "traditional" block, but
	 *  instead stored in a separate Stateflow chart. This method generates all needed
	 *  elements and adds it to the model.
	 */
	public static int generateAdditionalModelElements(org.muml.simulink.EmbeddedMatlabFunction emf)
	{
		SimulinkFile root = getRoot(emf);
		
		String name = getLocalQualifiedName(emf);
		
		//Stateflow		
		Chart chart = StateflowFactory.eINSTANCE.createChart();
		chart.setName(name);
		Parameter typeParameter = SimulinkFactory.eINSTANCE.createParameter();
		typeParameter.setName("type");
		typeParameter.setValue("EML_CHART");
		Parameter chartDisableImplCasting = SimulinkFactory.eINSTANCE.createParameter();
		chartDisableImplCasting.setName("disableImplicitCasting");
		chartDisableImplCasting.setValue("1");		
		chart.getParameters().add(chartDisableImplCasting);
		chart.getParameters().add(typeParameter);
		
		Junction junction = StateflowFactory.eINSTANCE.createJunction();
		Parameter junctionPosition = SimulinkFactory.eINSTANCE.createParameter();
		junctionPosition.setName("position");
		junctionPosition.setValue("[23.5747 49.5747 7]");		
		chart.getNodes().add(junction);
		
		Transition transition = StateflowFactory.eINSTANCE.createTransition();
		transition.setTarget(junction);
		Action functionCall = StateflowFactory.eINSTANCE.createAction();
		functionCall.setExpression(FUNCTION_NAME + "()");
		transition.getAction().add(functionCall);
		chart.getTransitions().add(transition);
		

		EmbeddedFunction embeddedFunction = StateflowFactory.eINSTANCE.createEmbeddedFunction();
		embeddedFunction.setName(FUNCTION_NAME);
		embeddedFunction.setCode(emf.getCode());	
		Parameter embeddedFunctionPosition = SimulinkFactory.eINSTANCE.createParameter();
		embeddedFunctionPosition.setName("position");
		embeddedFunctionPosition.setValue("[18 64.5 118 66]");
		chart.getEmbeddedFunctions().add(embeddedFunction);
				
		for(InPortBlock inPort: emf.getInPorts())
		{
			Data in = StateflowFactory.eINSTANCE.createData();
			in.setName(inPort.getName());
			in.setType(inPort.getType());
			in.setSize(inPort.getDimensions());
			chart.getInput().add(in);
			
			if(in.getType() == DataType.BUS)
			{
				Bus bus = EmbeddedMatlabFunction.getBusForInPort(inPort);
				Parameter busObject = SimulinkFactory.eINSTANCE.createParameter();
				busObject.setName("BusObject");
				if(bus != null)			
					busObject.setValue( bus.getName());
				else
					busObject.setValue("None");			
				in.getParameters().add(busObject);
			}
			
			if(in.getName() == null || in.getName().isEmpty())
				in.setName("Inport" + (chart.getInput().indexOf(in) +1));
		}
		
		for(OutPortBlock outPort: emf.getOutPorts())
		{
			Data out = StateflowFactory.eINSTANCE.createData();
			out.setName(outPort.getName());
			out.setType(outPort.getType());
			out.setSize(outPort.getDimensions());
			chart.getOutput().add(out);
			
			if(out.getType() == DataType.BUS)
			{
				Bus bus = EmbeddedMatlabFunction.getBusForOutPort(outPort);
				Parameter busObject = SimulinkFactory.eINSTANCE.createParameter();
				busObject.setName("BusObject");
				if(bus != null)			
					busObject.setValue( bus.getName());
				else
					busObject.setValue("None");			
				out.getParameters().add(busObject);
			}			
			
			if(out.getName() == null || out.getName().isEmpty())
				out.setName("Outport" + (chart.getOutput().indexOf(out)+1));			
		}		
		
		if(root.getStateflowMachine() == null)
			root.setStateflowMachine(StateflowFactory.eINSTANCE.createStateflowMachine());
		root.getStateflowMachine().getCharts().add(chart);
			
		return root.getStateflowMachine().getCharts().indexOf(chart)+1;
	}
	
	public static SimulinkFile getRoot(Block block)
	{
		if(block.getParent() instanceof SimulinkFile)
			return (SimulinkFile)block.getParent();
		return getRoot(block.getParent());
	}
	
	public static String getLocalQualifiedName(Block block)
	{
		if(block.getParent() == null | block.getParent() instanceof SimulinkFile)
			return block.getName();
		else
			return getLocalQualifiedName(block.getParent()) + "/" + block.getName();
		
	}
	
	public static Bus getBusForInPort(InPortBlock inPort)
	{
		for(Line l: inPort.getBlock().getIncomingLines())
			if(l.getTargetPort() == inPort)
				return l.getBus();
		return null;
	}
	
	public static Bus getBusForOutPort(OutPortBlock outPort)
	{
		for(Line l: outPort.getBlock().getOutgoingLines())
			if(l.getSourcePort() == outPort)
				return l.getBus();
		return null;
	}	
	
	/**
	 * Splits the given line into chunks of a defined length
	 */
	public static String foldLine(String line, Integer offset, Integer length)
	{
		if(line == null)
			return "";
		
		final int indent = 6;
		final String cleanedLine = line.replace("\r", "").replace("\n", "\\n");
		
		//Nothing to do
		if(cleanedLine.length() < length - offset)
			return line;
		
		StringBuffer result = new StringBuffer();
		int last = 0;
		int next = length - offset;		
		do
		{
			//Do not split between \ and n
			if("\\".equals(cleanedLine.subSequence(next-1, next)))
				next -= 1;
			
			result.append(cleanedLine.subSequence(last, next));			
			last = next;
			next += length - indent - 2/*Both " signs*/ ;
			
			result.append("\"\r\n");
			result.append("      \"");
		}while(next < cleanedLine.length());
		
		result.append(cleanedLine.subSequence(last, cleanedLine.length()));
		
		return result.toString();
	}
}
