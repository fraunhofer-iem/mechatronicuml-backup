package org.muml.simulink.adapter.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
import org.muml.simulink.DataType;
import org.muml.simulink.DigitalClock;
import org.muml.simulink.Element;
import org.muml.simulink.EmbeddedMatlabFunction;
import org.muml.simulink.EnablePort;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.MiscBlock;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.PortBlock;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerEvent;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.StateflowMachine;

import edu.tum.cs.commons.logging.SimpleLogger;
import edu.tum.cs.simulink.builder.SimulinkModelBuilder;
import edu.tum.cs.simulink.model.SimulinkBlock;
import edu.tum.cs.simulink.model.SimulinkConstants;
import edu.tum.cs.simulink.model.SimulinkInPort;
import edu.tum.cs.simulink.model.SimulinkOutPort;

public class SimulinkBuilder extends BuilderBase
{
	private SimulinkFactory factory = SimulinkFactory.eINSTANCE;
	
	protected static final Pattern ID_PATTERN = Pattern.compile("id=(_[A-Za-z0-9_\\-+/]{22})");
	
	protected static final String ENABLEPORT_NAME = "Enable";
	protected static final String ENABLEPORT_INDEX = "enable";
	protected static final String TRIGGERPORT_NAME = "Trigger";
	protected static final String TRIGGERPORT_INDEX = "trigger";
	
	private HashMap<Object, Object> traceModel = new HashMap<Object, Object>();
	private HashMap<String, SimulinkLibrary> libraries = new HashMap<String, SimulinkLibrary>();
	private Stack<SimulinkFile> currentFile = new Stack<SimulinkFile>();
	
	private Set<String> parameterWhitelist = null;
	
	//Needed to resolve libraries 
	private String workingDirectory = "";
	
	
	public void setParameterWhitelist(Set<String> whitelist)
	{
		this.parameterWhitelist = whitelist;
	}
	
	/**
	 * SimulinkModel -> SimulinkModel
	 * @param sourceModel
	 * @return SimulinkModel
	 * @throws SimulinkBuilderException 
	 */
	public SimulinkModel buildModel(edu.tum.cs.simulink.model.SimulinkModel sourceModel) throws SimulinkBuilderException
	{		
		SimulinkModel targetModel = this.factory.createSimulinkModel();
		this.fillFile(sourceModel, targetModel);		
		return targetModel;
	}
	
	/**
	 * SimlinkModel[library=true] -> SimulinkLibrary
	 * @param sourceModel
	 * @return SimulinkLibrary
	 * @throws SimulinkBuilderException 
	 */
	public SimulinkLibrary buildLibrary(edu.tum.cs.simulink.model.SimulinkModel sourceModel) throws SimulinkBuilderException
	{
		SimulinkLibrary targetLibrary = this.factory.createSimulinkLibrary();
		this.fillFile(sourceModel, targetLibrary);
		return targetLibrary;
	}
	
	/**
	 * Populate a SimulinkFile
	 * @param srcModel
	 * @param genFile
	 * @throws SimulinkBuilderException 
	 */
	protected void fillFile(edu.tum.cs.simulink.model.SimulinkModel srcModel, SimulinkFile genFile) throws SimulinkBuilderException
	{
		this.currentFile.push(genFile);
		
		this.traceModel.put(srcModel, genFile);
		
		//Process Stateflow
		if(srcModel.getStateflowMachine() != null)
		{
			StateflowBuilder stateflowBuilder = new StateflowBuilder();
			StateflowMachine stateflowMachine = stateflowBuilder.buildStateflowMachine(srcModel.getStateflowMachine());
			genFile.setStateflowMachine(stateflowMachine);
		}		

		//Handle parameters
		this.copyParameters(srcModel, genFile);
		this.remapKnownAttributes(genFile);
		
		//Create Ports
		this.createPortsForFile(srcModel, genFile);
		
		//Create remaining Blocks
		this.fillSubSystem(genFile, srcModel);
		
		//Create lines
		this.fillLines(genFile, srcModel);
		
		//Remove parameters
		if(this.parameterWhitelist != null)
			this.processParameterWhitelist(genFile);
		
		this.currentFile.pop();
	}

	/**
	 * This is a simple redirector method.
	 * SimulinkBlock -> Block
	 * @param sourceBlock
	 * @return SimulinkBlock
	 * @throws SimulinkBuilderException 
	 */
	public Block buildBlock(edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException 
	{		
		String type = sourceBlock.getParameter(SimulinkConstants.PARAM_BlockType);

		Block targetBlock = null;
		
		if(SimulinkConstants.TYPE_SubSystem.equals(type))
		{
			//Merge to Chart/EMF?
			if(this.subSystemIsComposition(sourceBlock))
			{
				if(this.subSystemIsEmbeddedMatlabFunction(sourceBlock))
					targetBlock = this.buildEmbeddedMatlabFunction(sourceBlock);
				else if(this.subSystemIsAChart(sourceBlock))
					targetBlock = this.buildChartBlock(sourceBlock);
			}
			else
				targetBlock = this.buildSubSystem(sourceBlock);
		}
		else if(SimulinkConstants.TYPE_Reference.equals(type))
		{
			targetBlock = this.buildReference(sourceBlock);
		}
		else if(SimulinkConstants.TYPE_Inport.equals(type))
		{
			throw new SimulinkBuilderException("We do not build Inports this way");
		}
		else if(SimulinkConstants.TYPE_Outport.equals(type))
		{
			throw new SimulinkBuilderException("We do not build Outports this way");
		}
		else if(SimulinkConstants.TYPE_BusCreator.equals(type))
		{
			targetBlock = this.buildBusCreator(sourceBlock);
		}
		else if(SimulinkConstants.TYPE_BusSelector.equals(type))
		{
			targetBlock = this.buildBusSelector(sourceBlock);
		}		
		else if(SimulinkConstants.TYPE_UnitDelay.equals(type))
		{
			targetBlock = this.buildUnitDelay(sourceBlock);
		}
		else if(SimulinkConstants.TYPE_DigitalClock.equals(type))
		{
			targetBlock = this.buildDigitalClock(sourceBlock);
		}
		else if(SimulinkConstants.TYPE_Constant.equals(type))
		{
			targetBlock = this.buildConstant(sourceBlock);
		}
		else if("EnablePort".equals(type))
		{
			throw new SimulinkBuilderException("We do not build EnablePorts this way");
		}
		else if("TriggerPort".equals(type))
		{
			throw new SimulinkBuilderException("We do not build TriggerPorts this way");
		}		
		else if(SimulinkConstants.TYPE_ZeroOrderHold.equals(type))
		{
			targetBlock = this.buildZeroOrderHold(sourceBlock);
		}
		else
		{
			targetBlock = this.buildMiscBlock(sourceBlock);
		}		

		return targetBlock;		
	}


	protected void remapKnownAttributes(Block targetBlock) 
	{
		//Remap known attributes
		targetBlock.setName(targetBlock.getParameter(SimulinkConstants.PARAM_Name));
		this.deleteParameter(targetBlock, SimulinkConstants.PARAM_Name);
		
		this.remapId(targetBlock);
	}
	
	protected void remapKnownAttributes(PortBlock targetBlock)
	{
		this.remapKnownAttributes((Block)targetBlock);
		
		targetBlock.setType(DataType.get(targetBlock.getParameter("DataType")));
		this.deleteParameter(targetBlock, "DataType");
		
		//TODO: Integrate this.handlePortDimensions(srcBlock, genPort)
		
	}
	
	protected void remapId(Element targetElement)
	{
		String paramName = "Tag";
		
		String sourceId = targetElement.getParameter(paramName);
		if(sourceId != null)
		{
			//Check if id is given
			Matcher idMatcher = SimulinkBuilder.ID_PATTERN.matcher(sourceId);
			if(idMatcher.find())
			{
				targetElement.setId(idMatcher.group(1));
			}
		}
	}	
	
	
	public Line buildLine(edu.tum.cs.simulink.model.SimulinkLine sourceLine) throws SimulinkBuilderException
	{	
		//Step 1: Find the Blocks the line connects
		Block genSrcBlock = null;
		Block genDstBlock = null;
		
		edu.tum.cs.simulink.model.SimulinkBlock srcBlock = sourceLine.getSrcPort().getBlock();
		edu.tum.cs.simulink.model.SimulinkBlock dstBlock = sourceLine.getDstPort().getBlock();
		
		/**
		 * We do not process InPorts directly. So we do not have them in our trace model.
		 * We need to find the corresponding port by name.
		 */
		if(SimulinkConstants.TYPE_Inport.equals(srcBlock.getType()))
		{
			SubSystem genSrcParent = (SubSystem) this.traceModel.get(srcBlock.getParent());
			genSrcBlock = genSrcParent.getBlockByName(srcBlock.getName());
		}
		else
		{
			genSrcBlock = (Block) this.traceModel.get(srcBlock);
		}
		if(genSrcBlock == null)
			throw new SimulinkBuilderException("Could not find the generated source block for " + sourceLine);
				
		
		/**
		 * We do not process OutPorts directly. So we do not have them in our trace model.
		 * We need to find the corresponding port by name.
		 */		
		if(SimulinkConstants.TYPE_Outport.equals(dstBlock.getType()))
		{
			SubSystem genDstParent = (SubSystem) this.traceModel.get(dstBlock.getParent());
			genDstBlock = genDstParent.getBlockByName(dstBlock.getName());
		}
		else
		{
			genDstBlock = (Block) this.traceModel.get(dstBlock);
		}
		
		if(genDstBlock == null)
			throw new SimulinkBuilderException("Could not find the generated target block for " + sourceLine);		
		

		//Step 2: Find the actual ports the line connects		
		OutPortBlock genSrcPort = null;
		InPortBlock genDstPort = null;		

		
		//The source can either be an InPortBlock or an Port of a Block. If it is an
		// InPort, we need its OutPort.
		if(genSrcBlock instanceof InPortBlock )
		{
			genSrcPort = genSrcBlock.getOutPorts().get(0);			
		}
		else
		{
			int srcPortIndex = 0; 
			try
			{
				srcPortIndex = Integer.parseInt(sourceLine.getSrcPort().getIndex());
			}
			catch(NumberFormatException e)
			{
				throw new SimulinkBuilderException("Could not parse the index for the source port of " + sourceLine,e);
			}
			
			if(srcPortIndex == 0)
				throw new SimulinkBuilderException("Invalid source port index(0) for " + sourceLine);
			
			//Simulink is 1 based, we are 0 based
			srcPortIndex = srcPortIndex-1;
			
			if(srcPortIndex >= genSrcBlock.getOutPorts().size())
				throw new SimulinkBuilderException("Invalid source port index("+srcPortIndex+") for " + sourceLine);
			
			//Do not count EnablePort/TriggerPort
			int numOtherPorts = 0;
			for(int i=0; i <= srcPortIndex;i++)
			{
				OutPortBlock currentPort = genSrcBlock.getOutPorts().get(i);
				
				if(currentPort instanceof EnablePort || currentPort instanceof TriggerPort)
					numOtherPorts++;
			}			
			
			genSrcPort = genSrcBlock.getOutPorts().get(srcPortIndex + numOtherPorts);			
		}		
		
		if(genSrcPort == null)
			throw new SimulinkBuilderException("Could not find the generated source port block for " + sourceLine);
		
		//The target can either be a OutPortBlock or an Port of a Block. If it is a
		// OutPort, we need its InPort.
		if(genDstBlock instanceof OutPortBlock )
		{
			genDstPort = genDstBlock.getInPorts().get(0);			
		}
		//Line is connected to an EnablePort. Parser doesnt give an index, but
		// rather the keyword 'enable'. We need to find the corresponding port
		// by its name or type.
		else if(sourceLine.getDstPort().getIndex().equals(ENABLEPORT_INDEX))
		{
			for(InPortBlock inPort: genDstBlock.getInPorts())
			{
				if(ENABLEPORT_NAME.equals(inPort.getName()) && inPort instanceof EnablePort )
				{
					genDstPort = inPort;
					break;
				}
			}
			if(genDstPort == null)
				throw new SimulinkBuilderException("Could not find EnablePort in " + genDstBlock);
		}
		//Line is connected to an TriggerPort. Parser doesnt give an index, but
		// rather the keyword 'trigger'. We need to find the corresponding port
		// by its name or type.
		else if(sourceLine.getDstPort().getIndex().equals(TRIGGERPORT_INDEX))
		{
			for(InPortBlock inPort: genDstBlock.getInPorts())
			{
				if(TRIGGERPORT_NAME.equals(inPort.getName()) && inPort instanceof TriggerPort )
				{
					genDstPort = inPort;
					break;
				}
			}
			if(genDstPort == null)
				throw new SimulinkBuilderException("Could not find TriggerPort in " + genDstBlock);
		}		
		else
		{		
			int dstPortIndex = 0; 
			try
			{
				dstPortIndex = Integer.parseInt(sourceLine.getDstPort().getIndex());
			}
			catch(NumberFormatException e)
			{
				throw new SimulinkBuilderException("Could not parse the index for the target port of " + sourceLine,e);
			}
			
			if(dstPortIndex == 0)
				throw new SimulinkBuilderException("Invalid target port index(0) for " + sourceLine);
			
			//Simulink is 1 based, we are 0 based
			dstPortIndex = dstPortIndex-1;
			
			if(dstPortIndex >= genDstBlock.getInPorts().size())
				throw new SimulinkBuilderException("Invalid target port index("+dstPortIndex+") for " + sourceLine);
			
			//Do not count EnablePort/TriggerPort
			int numOtherPorts = 0;
			for(int i=0; i <= dstPortIndex;i++)
			{
				InPortBlock currentPort = genDstBlock.getInPorts().get(i);
				
				if(currentPort instanceof EnablePort || currentPort instanceof TriggerPort)
					numOtherPorts++;
			}
			
			genDstPort = genDstBlock.getInPorts().get(dstPortIndex + numOtherPorts);				
		}
		
		if(genDstPort == null)
			throw new SimulinkBuilderException("Could not find the generated target port block for " + sourceLine);
		

		//Step 3: Create the actual line		
		Line targetLine = this.factory.createLine();
		targetLine.setSourceBlock(genSrcBlock);
		targetLine.setSourcePort(genSrcPort);
		targetLine.setTargetBlock(genDstBlock);
		targetLine.setTargetPort(genDstPort);		

		this.copyParameters(sourceLine, targetLine);
						
		//Delete parameters, we have native attributes for
		this.deleteParameter(targetLine, SimulinkConstants.PARAM_SrcBlock);
		this.deleteParameter(targetLine, SimulinkConstants.PARAM_SrcPort);
		this.deleteParameter(targetLine, SimulinkConstants.PARAM_DstBlock);
		this.deleteParameter(targetLine, SimulinkConstants.PARAM_DstPort);
		
		//Id
		this.remapId(targetLine);
		
		//Bus handling
		String busName = null;
		if(targetLine.getSourceBlock() instanceof BusCreator)
		{
			busName = ((BusCreator)targetLine.getSourceBlock()).getParameter("BusObject");
		}
		else if(targetLine.getSourceBlock() instanceof InPortBlock)
		{
			busName = targetLine.getSourceBlock().getParameter("BusObject");
		}
		else
		{
			busName = targetLine.getSourcePort().getParameter("BusObject");
		}
		if(busName != null)
			targetLine.setBus(this.getBus(busName, this.currentFile.peek()));
		
		return targetLine;
	}

	public void buildModelAndSaveToFile(edu.tum.cs.simulink.model.SimulinkModel sourceModel,String fileName) throws IOException, SimulinkBuilderException 
	{
		SimulinkModel targetModel = this.buildModel(sourceModel);
		
		Resource res = new XMIResourceFactoryImpl().createResource(URI.createURI(fileName));
		res.getContents().add(targetModel);
		
		res.save(Collections.EMPTY_MAP);
	}
		
		
	protected SubSystem buildSubSystem(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		//Step 1: Create SubSystem
		SubSystem genBlock = this.factory.createSubSystem();
		this.traceModel.put(srcBlock, genBlock);
		
		//Step 2: Handle parameters
		this.copyParameters(srcBlock, genBlock);		
		this.remapKnownAttributes(genBlock);
		
		//Step 3: Create Ports
		this.createPortsForSubSystem(srcBlock, genBlock);		
		
		//Step 4: Create all remaining blocks
		this.fillSubSystem(genBlock, srcBlock);
		
		//Step 5: Create all lines
		this.fillLines(genBlock, srcBlock);
		
		return genBlock;		
	}

	/**
	 * Create In- and OutPorts for a SubSystem. This function merges Simulink[In|Out]Ports with
	 * their corresponding SimulinkBlock of type [In|Out]Port.
	 * @param srcBlock
	 * @param genBlock
	 * @throws SimulinkBuilderException
	 */
	protected void createPortsForSubSystem(	edu.tum.cs.simulink.model.SimulinkBlock srcBlock, SubSystem genBlock) throws SimulinkBuilderException 
	{
		//Step 1: Create OutPorts
		for(edu.tum.cs.simulink.model.SimulinkOutPort srcOutPort: srcBlock.getOutPorts())
		{
			genBlock.getOutPorts().add(this.buildOutPortForSubSystem(srcOutPort));
		}
		this.orderPorts(genBlock.getOutPorts());
		
		//Step 2: Create InPorts
		for(edu.tum.cs.simulink.model.SimulinkInPort srcInPort: srcBlock.getInPorts())
		{
			if(srcInPort.getIndex().equals(ENABLEPORT_INDEX))
				genBlock.getInPorts().add(this.buildEnablePort(srcInPort));
			else if(srcInPort.getIndex().equals(TRIGGERPORT_INDEX))
				genBlock.getInPorts().add(this.buildTriggerPort(srcInPort));
			else
				genBlock.getInPorts().add(this.buildInPortForSubSystem(srcInPort));
		}
		this.orderPorts(genBlock.getInPorts());
	}
	

	/**
	 * Create In- and OutPorts for a File. A SimulinkModel only contains SimulinkBlocks of Type [In|Out]Port, but no
	 * direct [In|Out]Ports. This method creates [In|Out]PortBlocks from SimulinkBlocks.
	 * @param srcModel
	 * @param genFile
	 * @throws SimulinkBuilderException 
	 */
	protected void createPortsForFile(edu.tum.cs.simulink.model.SimulinkModel srcModel, SimulinkFile genFile) throws SimulinkBuilderException
	{
		//Step 1: Create In- and OutPorts
		for(edu.tum.cs.simulink.model.SimulinkBlock srcBlock: srcModel.getSubBlocks())
		{
			if(SimulinkConstants.TYPE_Inport.equals(srcBlock.getType()))
				genFile.getInPorts().add(this.buildInPortForFile(srcBlock));
			else if(SimulinkConstants.TYPE_Outport.equals(srcBlock.getType()))
				genFile.getOutPorts().add(this.buildOutPortForFile(srcBlock));
		}	
		//Step 2: Order ports
		this.orderPorts(genFile.getInPorts());
		this.orderPorts(genFile.getOutPorts());
	}
	
	protected void createPortsForBlock(edu.tum.cs.simulink.model.SimulinkBlock srcModel, Block genBlock) throws SimulinkBuilderException
	{
		//Step 1: Create OutPorts
		for(edu.tum.cs.simulink.model.SimulinkOutPort srcOutPort: srcModel.getOutPorts())
			genBlock.getOutPorts().add(this.buildOutPortForBlock(srcOutPort));
		
		//Step 2: Create InPorts
		for(edu.tum.cs.simulink.model.SimulinkInPort srcInPort: srcModel.getInPorts())
			genBlock.getInPorts().add(this.buildInPortForBlock(srcInPort));
		
		//Step 3: Order Ports
		this.orderPorts(genBlock.getOutPorts());
		this.orderPorts(genBlock.getInPorts());		
	}
	
	/**
	 * This method maps Blocks type InPort to InPortBlocks.
	 */
	protected InPortBlock buildInPortForFile(edu.tum.cs.simulink.model.SimulinkBlock srcBlock)
	{
		InPortBlock genPort = this.factory.createInPortBlock();
		this.traceModel.put(srcBlock, genPort);
		
		this.copyParameters(srcBlock, genPort);
		this.remapKnownAttributes(genPort);
		
		this.handlePortDimensions(srcBlock, genPort);
		
		//Add an OutPort
		genPort.getOutPorts().add(this.factory.createOutPortBlock());
		genPort.getOutPorts().get(0).setName("Out1");		

		return genPort;
	}
	
	/**
	 * This method maps InPorts to InPortBlocks
	 * @throws SimulinkBuilderException 
	 */
	protected InPortBlock buildInPortForSubSystem(edu.tum.cs.simulink.model.SimulinkInPort srcPort) throws SimulinkBuilderException
	{		
		InPortBlock genPort = this.factory.createInPortBlock();
		
		this.traceModel.put(srcPort, genPort);
		
		//Find the corresponding Inport-Block		
		edu.tum.cs.simulink.model.SimulinkBlock srcCorrespondBlock = null;		
		for(edu.tum.cs.simulink.model.SimulinkBlock subBlock: srcPort.getBlock().getSubBlocks())
		{
			if(srcPort.getIndex().equals(subBlock.getParameter(SimulinkConstants.PARAM_Port)) &&
					SimulinkConstants.TYPE_Inport.equals(subBlock.getType()))
			{
				srcCorrespondBlock = subBlock;				
				break;
			}
		}	
		
		if(srcCorrespondBlock == null)
			throw new SimulinkBuilderException("Could not find the corresponding block for Inport " +srcPort.getIndex());
		
		this.copyParameters(srcCorrespondBlock, genPort);		
		this.remapKnownAttributes(genPort);
		
		this.handlePortDimensions(srcCorrespondBlock, genPort);
		
		//Add an OutPort
		genPort.getOutPorts().add(this.factory.createOutPortBlock());
		genPort.getOutPorts().get(0).setName("Out1");
			
		return genPort;
	}
	
	protected InPortBlock buildInPortForBlock(edu.tum.cs.simulink.model.SimulinkInPort srcPort) throws SimulinkBuilderException
	{
		InPortBlock genPort = this.factory.createInPortBlock();
		this.traceModel.put(srcPort, genPort);
		
		genPort.setName(srcPort.getIndex());
		
		Parameter portParameter = this.factory.createParameter();
		portParameter.setName(SimulinkConstants.PARAM_Port);
		portParameter.setValue(srcPort.getIndex());
		//portParameter.setType(String.class.getName());
		
		genPort.getParameters().add(portParameter);
		
		return genPort;
	}		
	
	
	/**
	 * This method maps Blocks type OutPort to OutPortBlocks
	 **/
	protected OutPortBlock buildOutPortForFile(edu.tum.cs.simulink.model.SimulinkBlock srcPort)
	{
		OutPortBlock genPort = this.factory.createOutPortBlock();
		this.traceModel.put(srcPort, genPort);
		
		this.copyParameters(srcPort, genPort);
		this.remapKnownAttributes(genPort);

		this.handlePortDimensions(srcPort, genPort);
		
		//Add an InPort
		genPort.getInPorts().add(this.factory.createInPortBlock());
		genPort.getInPorts().get(0).setName("In1");
		
		return genPort;
	}
	
	/**
	 * This method creates a OutPort from a given SimulinkOutPorts.
	 * @throws SimulinkBuilderException 
	 */	
	protected OutPortBlock buildOutPortForSubSystem(edu.tum.cs.simulink.model.SimulinkOutPort srcPort) throws SimulinkBuilderException
	{
		OutPortBlock genPort = this.factory.createOutPortBlock();
		this.traceModel.put(srcPort, genPort);
		
		//Find the corresponding Outport-Block		
		edu.tum.cs.simulink.model.SimulinkBlock srcCorrespondBlock = null;		
		for(edu.tum.cs.simulink.model.SimulinkBlock subBlock: srcPort.getBlock().getSubBlocks())
		{
			if(srcPort.getIndex().equals(subBlock.getParameter(SimulinkConstants.PARAM_Port)) &&
				SimulinkConstants.TYPE_Outport.equals(subBlock.getType()))
			{
				srcCorrespondBlock = subBlock;				
				break;
			}
		}
	
		
		if(srcCorrespondBlock == null)
			throw new SimulinkBuilderException("Could not find the corresponding block for Outport " +srcPort.getIndex());
		
		this.copyParameters(srcCorrespondBlock, genPort);		
		this.remapKnownAttributes(genPort);
		
		this.handlePortDimensions(srcCorrespondBlock, genPort);
		
		//Add an InPort
		genPort.getInPorts().add(this.factory.createInPortBlock());
		genPort.getInPorts().get(0).setName("In1");
			
		return genPort;
	}	
	
	protected OutPortBlock buildOutPortForBlock(edu.tum.cs.simulink.model.SimulinkOutPort srcPort) throws SimulinkBuilderException
	{
		OutPortBlock genPort = this.factory.createOutPortBlock();
		this.traceModel.put(srcPort, genPort);
		
		genPort.setName(srcPort.getIndex());
		
		Parameter portParameter = this.factory.createParameter();
		portParameter.setName(SimulinkConstants.PARAM_Port);
		portParameter.setValue(srcPort.getIndex());
		//portParameter.setType(String.class.getName());
		
		genPort.getParameters().add(portParameter);
		
		return genPort;
	}		
	
	/**
	 * Builds an EnablePort from a given InPort that has an index named 'enable'
	 */
	protected EnablePort buildEnablePort(edu.tum.cs.simulink.model.SimulinkInPort srcInPort) throws SimulinkBuilderException {
		assert srcInPort.getIndex().equals(ENABLEPORT_INDEX);
		
		EnablePort genPort = this.factory.createEnablePort();
		this.traceModel.put(srcInPort, genPort);
		
		//Find the corresponding EnablePort-Block		
		edu.tum.cs.simulink.model.SimulinkBlock srcCorrespondBlock = null;		
		for(edu.tum.cs.simulink.model.SimulinkBlock subBlock: srcInPort.getBlock().getSubBlocks())
		{
			if(ENABLEPORT_NAME.equals(subBlock.getName()))					
			{
				srcCorrespondBlock = subBlock;				
				break;
			}
		}	
		
		if(srcCorrespondBlock == null)
			throw new SimulinkBuilderException("Could not find the corresponding block for EnablePort " +srcInPort);
		
		this.copyParameters(srcCorrespondBlock, genPort);
		this.remapKnownAttributes(genPort);
		this.handlePortDimensions(srcCorrespondBlock, genPort);
				
		return genPort;
	}
	
	/**
	 * Builds an TriggerPort from a given InPort that has an index named 'trigger'
	 */
	protected TriggerPort buildTriggerPort(edu.tum.cs.simulink.model.SimulinkInPort srcInPort) throws SimulinkBuilderException {
		assert srcInPort.getIndex().equals(TRIGGERPORT_INDEX);
		
		TriggerPort genPort = this.factory.createTriggerPort();
		this.traceModel.put(srcInPort, genPort);
		
		//Find the corresponding TriggerPort-Block		
		edu.tum.cs.simulink.model.SimulinkBlock srcCorrespondBlock = null;		
		for(edu.tum.cs.simulink.model.SimulinkBlock subBlock: srcInPort.getBlock().getSubBlocks())
		{
			if(TRIGGERPORT_NAME.equals(subBlock.getName()))					
			{
				srcCorrespondBlock = subBlock;				
				break;
			}
		}	
		
		if(srcCorrespondBlock == null)
			throw new SimulinkBuilderException("Could not find the corresponding block for TriggerPort " +srcInPort);
		
		this.copyParameters(srcCorrespondBlock, genPort);
		this.remapKnownAttributes(genPort);
		this.handlePortDimensions(srcCorrespondBlock, genPort);
		
		if(genPort.getParameter("TriggerType") != null)
		{
			genPort.setTriggerInput(TriggerEvent.get(genPort.getParameter("TriggerType")));
			this.deleteParameter(genPort, "TriggerType");
		}
		
		return genPort;
	}	
	
	/**
	 * This methods maps all remaining blocks to MiscBlocks
	 * @throws SimulinkBuilderException 
	 */
	protected MiscBlock buildMiscBlock(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		MiscBlock genBlock = this.factory.createMiscBlock();
		this.traceModel.put(srcBlock, genBlock);
		
		//Handle parameters
		this.copyParameters(srcBlock, genBlock);
		this.remapKnownAttributes(genBlock);
		
		//Remove the BlockType parameter and set it as an attribute
		genBlock.setType(genBlock.getParameter(SimulinkConstants.PARAM_BlockType));
		this.deleteParameter(genBlock, SimulinkConstants.PARAM_BlockType);
		
		//Create Ports
		this.createPortsForBlock(srcBlock, genBlock);
		
		return genBlock;
	}		
	
	protected LibraryReference buildReference(edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException
	{
		LibraryReference targetReference = this.factory.createLibraryReference();
		this.traceModel.put(sourceBlock, targetReference);
		this.copyParameters(sourceBlock, targetReference);
		this.remapKnownAttributes(targetReference);

		//Resolve referenced element
		Block referencedBlock = this.resolveBlockFromLibraries(sourceBlock);
		
		targetReference.setSourceBlock(referencedBlock);
		
		return targetReference;
	}
	
	protected BusCreator buildBusCreator(edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException 
	{
		assert SimulinkConstants.TYPE_BusCreator == sourceBlock.getType();
		BusCreator genBusCreator = this.factory.createBusCreator();
		this.traceModel.put(sourceBlock, genBusCreator);
		this.copyParameters(sourceBlock, genBusCreator);
		this.remapKnownAttributes(genBusCreator);
		
		//Inports in a BusCreator are only defined implicitly
		if(sourceBlock.getParameter("Inputs") == null)
			throw new SimulinkBuilderException("Could not find Inputs for " + sourceBlock);
		int numInputs = Integer.parseInt(sourceBlock.getParameter("Inputs"));
		
		if(sourceBlock.getInLines().size() > numInputs)
			throw new SimulinkBuilderException(numInputs + " Inputs defined, but " + sourceBlock.getInLines().size() + " Signals defined for " + sourceBlock);
		
		//The name of the inports are derived from the name of the incoming signals
		for(SimulinkInPort srcInport: sourceBlock.getInPorts())
		{
			InPortBlock genInPort = this.buildInPortForBlock(srcInport);			
			genBusCreator.getInPorts().add(genInPort);
			genInPort.setName(null);
			if(srcInport.getLine() != null)
			{
				String signalName = srcInport.getLine().getParameter("Name");
				if(signalName != null)
					genInPort.setName(signalName);
			}
		}
		this.orderPorts(genBusCreator.getInPorts());
		
		
		//By definition every BusCreator has a single Outport. It is also not defined
		// in Simulink explicitly. The Name of the outport is defined by the signal
		// leaving the port
		OutPortBlock genOutPort = this.factory.createOutPortBlock();
		genBusCreator.getOutPorts().add(genOutPort);
		
		SimulinkOutPort srcOutPort = sourceBlock.getOutPorts().iterator().next();
		if(srcOutPort == null)
			throw new SimulinkBuilderException("Could not find outport for " + genOutPort);
		
		if(srcOutPort.getLines().size() > 0)
		{
		
			String genOutPortName = srcOutPort.getLines().iterator().next().getParameter("Name");
			if(genOutPortName != null)
				genOutPort.setName(genOutPortName);
		}
		
		//Bus will be set while creating lines
			
		return genBusCreator;
	}	
	
	protected BusSelector buildBusSelector(edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException 
	{
		assert SimulinkConstants.TYPE_BusSelector == sourceBlock.getType();
		BusSelector genBusSelector = this.factory.createBusSelector();
		this.traceModel.put(sourceBlock, genBusSelector);
		this.copyParameters(sourceBlock, genBusSelector);
		this.remapKnownAttributes(genBusSelector);
		

		//By definition every BusSelector has a single Inport. It is not defined
		// in Simulink explicitly.
		genBusSelector.getInPorts().add(this.factory.createInPortBlock());
		
		//The Outports of a BusSelector are defined explicitelty but not as normal 
		// Outports. So we have to create them manually.
		for(edu.tum.cs.simulink.model.SimulinkOutPort outPort: sourceBlock.getOutPorts())
			genBusSelector.getOutPorts().add(this.buildOutPortForBlock(outPort));
		this.orderPorts(genBusSelector.getOutPorts());
		
		String srcOutputSignals = sourceBlock.getParameter("OutputSignals");
		if(srcOutputSignals != null)
		{
			String[] signals = srcOutputSignals.split(",");
			for(int i=0; i<signals.length; i++)
				genBusSelector.getOutPorts().get(i).setName(signals[i]);
		}
					
		return genBusSelector;
	}		
	

	/**
	 * Create UnitDelay 
	 */
	protected UnitDelay buildUnitDelay(SimulinkBlock sourceBlock) {		
		assert SimulinkConstants.TYPE_UnitDelay == sourceBlock.getType();
		
		UnitDelay genUnitDelay = this.factory.createUnitDelay();
		this.traceModel.put(sourceBlock, genUnitDelay);
		this.copyParameters(sourceBlock, genUnitDelay);
		this.remapKnownAttributes(genUnitDelay);
		
		//A unit delay has exactly one in- and one outport
		genUnitDelay.getInPorts().add(this.factory.createInPortBlock());
		genUnitDelay.getOutPorts().add(this.factory.createOutPortBlock());
		
		return genUnitDelay;
	}	
	

	/**
	 * Create DigitalClock
	 */
	protected DigitalClock buildDigitalClock(SimulinkBlock sourceBlock) {
		assert SimulinkConstants.TYPE_DigitalClock == sourceBlock.getType();
		
		DigitalClock genDigitalClock = this.factory.createDigitalClock();
		this.traceModel.put(sourceBlock, genDigitalClock);
		this.copyParameters(sourceBlock, genDigitalClock);
		this.remapKnownAttributes(genDigitalClock);
		
		String sampleTime = sourceBlock.getParameter("SampleTime");
		if(sampleTime != null)
		{		
			genDigitalClock.setSampleTime(Double.parseDouble(sampleTime));
			this.deleteParameter(genDigitalClock, "SampleTime");
		}
		
		//A DigitalClock has exactly one outport
		genDigitalClock.getOutPorts().add(this.factory.createOutPortBlock());
		
		return genDigitalClock;
	}	
	
	/**
	 * Create Constant
	 */
	protected Constant buildConstant(SimulinkBlock sourceBlock) {
		assert SimulinkConstants.TYPE_Constant == sourceBlock.getType();
		
		Constant genConstant = this.factory.createConstant();
		this.traceModel.put(sourceBlock, genConstant);
		this.copyParameters(sourceBlock, genConstant);
		this.remapKnownAttributes(genConstant);
		
		String value = null; 
		try
		{
			value = sourceBlock.getParameter("Value");
		}
		catch(NullPointerException e)
		{/*Looks like the tum parser does something wrong*/}
		
		if(value != null)
		{
			genConstant.setValue(value);
			this.deleteParameter(genConstant, "Value");
		}
				
		String type = null;
		try
		{
			type = sourceBlock.getParameter("OutDataTypeStr");		
		}
		catch(NullPointerException e)
		{/*Looks like the tum parser does something wrong*/}
	
		if(type != null)
		{
			genConstant.setType(DataType.get(type));
			this.deleteParameter(genConstant, "OutDataTypeStr");
		}
		
		//A Constant has exactly one outport
		genConstant.getOutPorts().add(this.factory.createOutPortBlock());		
		
		return genConstant;
	}
	
	/**
	 * Create ZeroOrderHold
	 */
	protected ZeroOrderHold buildZeroOrderHold(SimulinkBlock sourceBlock) {
		assert SimulinkConstants.TYPE_ZeroOrderHold == sourceBlock.getType();
		
		ZeroOrderHold genZeroOrderHold = this.factory.createZeroOrderHold();
		this.traceModel.put(sourceBlock, genZeroOrderHold);
		this.copyParameters(sourceBlock, genZeroOrderHold);
		this.remapKnownAttributes(genZeroOrderHold);
		
		if(sourceBlock.getParameter("SampleTime") != null)
		{
			genZeroOrderHold.setSampleTime(sourceBlock.getParameter("SampleTime"));
			this.deleteParameter(genZeroOrderHold, "SampleTime");
		}
		
		//A ZeroOrderHold has exactly one in- and one outport
		genZeroOrderHold.getInPorts().add(this.factory.createInPortBlock());
		genZeroOrderHold.getOutPorts().add(this.factory.createOutPortBlock());
		
		return genZeroOrderHold;
	}
	
	/**
	 * Resolves an block referenced by a string in a SourceBlock parameter
	 * @param sourceElementPath
	 * @return
	 * @throws SimulinkBuilderException
	 */
	protected Block resolveBlockFromLibraries(edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException
	{
		assert SimulinkConstants.TYPE_Reference == sourceBlock.getType();
		
		final String sourceElementPath = sourceBlock.getParameter("SourceBlock");
		String[] sourceElementPathElements = sourceElementPath.split("/");	
		final String libraryName = sourceElementPathElements[0];
		
		//Get current model
		SimulinkFile currentModel = (SimulinkFile) this.traceModel.get(sourceBlock.getModel());
		
		//Load library
		SimulinkFile referencedLibrary = null;
		
		//A reference in/to the current file
		if(currentModel.getName().equals(libraryName))
		{
			referencedLibrary = currentModel;			
		}
		//Load external library
		else
		{			
			if(!this.libraries.containsKey(libraryName))
			{
				String libraryFile = this.workingDirectory + File.separator + libraryName + ".mdl";
				SimulinkLibrary lib = this.buildLibrary(this.parseModelFromFile(libraryFile));
				this.libraries.put(libraryName, lib);
			}
			referencedLibrary = this.libraries.get(libraryName);
		}
		
		if(referencedLibrary == null)
			throw new SimulinkBuilderException("Could not find referenced library " + libraryName);
		
		//Find referenced element
		final String referencedBlockName = sourceElementPath.replace(libraryName + "/", "");
		Block referencedBlock = referencedLibrary.getBlockByName(referencedBlockName);		
		if(referencedBlock == null)
			throw new SimulinkBuilderException("Could not resolve block " + sourceElementPath);
		return referencedBlock;
	}
	
	/**
	 * Populates a subsystem
	 * @param targetSystem
	 * @param sourceBlock
	 * @throws SimulinkBuilderException 
	 */
	protected void fillSubSystem(SubSystem targetSystem, edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException
	{		
		//Build Subblocks
		for(edu.tum.cs.simulink.model.SimulinkBlock sourceSubBlock: sourceBlock.getSubBlocks())
		{
			//Do not build ports
			String subBlockType = sourceSubBlock.getParameter(SimulinkConstants.PARAM_BlockType);
			if(SimulinkConstants.TYPE_Inport.equals(subBlockType) ||
					SimulinkConstants.TYPE_Outport.equals(subBlockType) ||
					"EnablePort".equals(subBlockType) ||
					"TriggerPort".equals(subBlockType))
				continue;			
			
			Block subBlock = this.buildBlock(sourceSubBlock);
			targetSystem.getBlocks().add(subBlock);
		}
					

	}
	
	/**
	 * Fills a SubSystem with lines
	 * @param targetSystem
	 * @param sourceBlock
	 * @throws SimulinkBuilderException
	 */
	protected void fillLines(SubSystem targetSystem, edu.tum.cs.simulink.model.SimulinkBlock sourceBlock) throws SimulinkBuilderException
	{		
		//Collect lines
		Set<edu.tum.cs.simulink.model.SimulinkLine> lines = new HashSet<edu.tum.cs.simulink.model.SimulinkLine>();
		for(edu.tum.cs.simulink.model.SimulinkBlock subBlock: sourceBlock.getSubBlocks())
		{
			lines.addAll(subBlock.getInLines());
			lines.addAll(subBlock.getOutLines());
		}
		//Process lines
		for(edu.tum.cs.simulink.model.SimulinkLine sourceLine: lines)
		{
			Line targetLine = this.buildLine(sourceLine);
			targetSystem.getLines().add(targetLine);
		}
		
	}
	
	
	/**
	 * Builds a model from a given .mdl file
	 * @param fileName
	 * @return SimulinkModel
	 * @throws SimulinkBuilderException 
	 */
	public SimulinkContainer buildFromFile(String fileName) throws SimulinkBuilderException
	{	
		SimulinkContainer root = this.factory.createSimulinkContainer();
		
		edu.tum.cs.simulink.model.SimulinkModel  sourceModel = this.parseModelFromFile(fileName);
		
		if(sourceModel.isLibrary())
		{
			SimulinkLibrary targetLibrary = this.buildLibrary(sourceModel); 
			root.getLibraries().add(targetLibrary);
		}
		else
		{
			SimulinkModel targetModel = this.buildModel(sourceModel);		
			root.getModels().add(targetModel);
		}		
		
		//Add all resolved libraries
		root.getLibraries().addAll(this.libraries.values());
		
				
		return root;
	}
	
	/**
	 * @see SimulinkBuilder#subSystemIsComposition
	 */
	protected boolean subSystemIsAChart(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		if(!this.subSystemIsComposition(srcBlock))
			return false;
		
		edu.tum.cs.simulink.model.stateflow.StateflowChart chart = this.getChartFromSubSystemComposition(srcBlock);
		if(chart == null)
			return false;
		
		if(chart.getParameter("type") != null)
			return false;
		
		return true;
	}
	
	/**
	 * Simulink saves Charts/Embedded Matlab Functions in a composed structure:
	 * 	$inports->SFunction->Demux->Terminator
	 * 				|->$outports
	 */
	protected boolean subSystemIsComposition(edu.tum.cs.simulink.model.SimulinkBlock srcBlock)
	{
		if(srcBlock.getSubBlocks().size() < 2)
			return false;
				
		if(srcBlock.getSubBlock(" Demux ") == null)
			return false;
				
		edu.tum.cs.simulink.model.SimulinkBlock sFunction = srcBlock.getSubBlock(" SFunction ");
		if(sFunction == null)
			return false;
		
		String tagParameter = sFunction.getParameter("Tag");
		if(tagParameter == null )
			return false;
		
		if(!tagParameter.startsWith("Stateflow S-Function"))
			return false;
		
		return true;
	}
	
	protected edu.tum.cs.simulink.model.stateflow.StateflowChart getChartFromSubSystemComposition(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		edu.tum.cs.simulink.model.SimulinkBlock sFunction = srcBlock.getSubBlock(" SFunction ");

		String tagParameter = sFunction.getParameter("Tag");
		if(tagParameter == null)
			throw new SimulinkBuilderException("No parameter Tag for " + srcBlock);
		
		//Looking for a line like:  "Stateflow S-Function EmbeddedMatLabFunction 1"
		String tagPieces[] = tagParameter.split(" ");
		if(tagPieces.length != 4)
			throw new SimulinkBuilderException("Invalid length of parameter Tag for " + srcBlock);
		
		if(!"Stateflow".equals(tagPieces[0]))
			throw new SimulinkBuilderException("Missing keyword 'Stateflow' in parameter Tag for " + srcBlock);
		
		if(!"S-Function".equals(tagPieces[1]))
			throw new SimulinkBuilderException("Missing keyword 'S-Function' in parameter Tag for " + srcBlock);
		
		String chartFileNumber = tagPieces[3];
		
		edu.tum.cs.simulink.model.stateflow.StateflowChart chart = null;
		for(edu.tum.cs.simulink.model.stateflow.StateflowChart currentChart: srcBlock.getModel().getStateflowMachine().getCharts())
		{
			if(chartFileNumber.equals(currentChart.getParameter("chartFileNumber")))
			{				
				chart = currentChart;
				break;
			}			
		}
		
		if(chart == null)
			throw new SimulinkBuilderException("No chart found for " + srcBlock);
		
		return chart;
	}
	
	/**
	 * @see SimulinkBuilder#subSystemIsComposition
	 */
	protected boolean subSystemIsEmbeddedMatlabFunction(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		if(!this.subSystemIsComposition(srcBlock))
			return false;
		
		edu.tum.cs.simulink.model.stateflow.StateflowChart chart = this.getChartFromSubSystemComposition(srcBlock);
		if(chart == null)
			return false;
		
		
		if(!"EML_CHART".equals(chart.getParameter("type")))
			return false;
		
		return true;
	}
	
	/**
	 * Simulink saves a chart as a SubSystem with 4 blocks: Ground->SFunction->Demux->Terminator
	 * We want to merge them into a single block.
	 * @param srcBlock
	 * @return
	 * @throws SimulinkBuilderException 
	 */	
	protected ChartBlock buildChartBlock(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		ChartBlock genBlock = this.factory.createChartBlock();
		this.traceModel.put(srcBlock, genBlock);
		
		this.copyParameters(srcBlock, genBlock);
		this.remapKnownAttributes(genBlock);
		this.remapId(genBlock);
		
		SimulinkFile genModel = (SimulinkFile) this.traceModel.get(srcBlock.getModel());
		if(genModel == null)
			throw new SimulinkBuilderException("Could not find generated root model of " + srcBlock);
		
		//Find the corresponding chart
		final String chartTag = srcBlock.getSubBlock(" SFunction ").getParameter("Tag");
		final String chartNumber = chartTag.substring(chartTag.lastIndexOf(" ")+1);
		
		for(Chart chart: genModel.getStateflowMachine().getCharts())
		{
			if(chartNumber.equals(chart.getParameter("chartFileNumber")))
			{
				genBlock.setChart(chart);
				break;
			}
		}		
		
		if(genBlock.getChart() == null)
			throw new SimulinkBuilderException("Could not find the referenced chart for " + genBlock);
		
		// If a chart has no inports/inputs the parser nevertheless reports one inport
		if(genBlock.getChart().getInput().size() > 0)
		{
			for(edu.tum.cs.simulink.model.SimulinkInPort srcInPort: srcBlock.getInPorts())
			{
				InPortBlock genInPort = this.buildInPortForSubSystem(srcInPort);			
				genBlock.getInPorts().add(genInPort);
			}
			this.orderPorts(genBlock.getInPorts());
		}
		
		// If a chart has no outports/outputs the parser nevertheless reports one outport
		if(genBlock.getChart().getOutput().size() > 0)
		{
			for(edu.tum.cs.simulink.model.SimulinkOutPort srcOutPort: srcBlock.getOutPorts())
			{
				OutPortBlock genOutPort = this.buildOutPortForSubSystem(srcOutPort);
				genBlock.getOutPorts().add(genOutPort);
			}
			this.orderPorts(genBlock.getOutPorts());
		}
			
		return genBlock;
	}
	
	/**
	 * Orders ports according to their Port parameter
	 */
	@SuppressWarnings("unchecked")
	protected <P extends PortBlock> void orderPorts(EList<P> ports)
	{
		List<P> iterList = new LinkedList<P>(ports);		
		for(PortBlock portBlock: iterList)
		{
			String portParameter = portBlock.getParameter(SimulinkConstants.PARAM_Port);
			int portIndex = 0;
			//For the first port, the port parameter is omitted
			if(portParameter != null)
				portIndex = Integer.parseInt(portParameter) -1; //Simulink starts counting by 1
			ports.move(portIndex, (P) portBlock);
		}
		
	}
	
	protected EmbeddedMatlabFunction buildEmbeddedMatlabFunction(edu.tum.cs.simulink.model.SimulinkBlock srcBlock) throws SimulinkBuilderException
	{
		EmbeddedMatlabFunction genBlock = this.factory.createEmbeddedMatlabFunction();
		this.traceModel.put(srcBlock, genBlock);
		
		this.copyParameters(srcBlock, genBlock);
		this.remapKnownAttributes(genBlock);
		this.remapId(genBlock);
		
		SimulinkFile genModel = (SimulinkFile) this.traceModel.get(srcBlock.getModel());
		if(genModel == null)
			throw new SimulinkBuilderException("Could not find generated root model of " + srcBlock);		
		
		//For a EmbeddedMatlabFunction, Data is not stored in the function
		// but in the Chart		
		
		//Find the corresponding chart
		Chart genChart = null;
		final String chartTag = srcBlock.getSubBlock(" SFunction ").getParameter("Tag");
		final String chartNumber = chartTag.substring(chartTag.lastIndexOf(" ")+1);
		
		for(Chart chart: genModel.getStateflowMachine().getCharts())
		{
			if(chartNumber.equals(chart.getParameter("chartFileNumber")))
			{
				genChart = chart;
				break;
			}
		}		
		
		if(genChart == null)
			throw new SimulinkBuilderException("Could not find the referenced chart for " + genBlock);
		
		EmbeddedFunction stateflowFunction = genChart.getEmbeddedFunctions().get(0);
		genBlock.setCode(stateflowFunction.getCode());
		
		/**
		 * If a chart has no inports/inputs the parser nevertheless reports one inport
		 */
		if(genChart.getInput().size() > 0)
		{
			for(edu.tum.cs.simulink.model.SimulinkInPort srcInPort: srcBlock.getInPorts())
			{
				InPortBlock genInPort = this.buildInPortForSubSystem(srcInPort);			
				genBlock.getInPorts().add(genInPort);
			}
			this.orderPorts(genBlock.getInPorts());
		}
		
		//Simulink doesn't store the type of a port in the Port itself, but rather in the data of the chart
		// We need to copy it to the port
		InPortIteration:
		for(InPortBlock genInport: genBlock.getInPorts())
		{
			for(Data genData: genChart.getInput())
			{
				if(genData.getName().equals(genInport.getName()))
				{
					genInport.setType(genData.getType());
					continue InPortIteration;
				}
			}
			throw new SimulinkBuilderException("Could not find chart input for inport " + genInport + " in " + genBlock);
		}
		
		/**
		 * If a chart has no outports/outputs the parser nevertheless reports one outport
		 */
		if(genChart.getOutput().size() > 0)
		{		
			for(edu.tum.cs.simulink.model.SimulinkOutPort srcOutPort: srcBlock.getOutPorts())
			{
				OutPortBlock genOutPort = this.buildOutPortForSubSystem(srcOutPort);
				genBlock.getOutPorts().add(genOutPort);
			}
			this.orderPorts(genBlock.getOutPorts());
		}
		
		//Copy type from data
		OutPortIteration:
		for(OutPortBlock genOutport: genBlock.getOutPorts())
		{
			for(Data genData: genChart.getOutput())
			{
				if(genData.getName().equals(genOutport.getName()))
				{
					genOutport.setType(genData.getType());
					continue OutPortIteration;
				}
			}
			throw new SimulinkBuilderException("Could not find chart output for outport " + genOutport + " in " + genBlock);
		}		
		
		//Remove chart
		StateflowMachine genMachine = genChart.getMachine();
		genMachine.getCharts().remove(genChart);
		
		//Remove empty machine
		if(genMachine.getCharts().size() == 0)
			genMachine.setModel(null);
		
		return genBlock;		
	}
	
	/**
	 * Parses a mdl file using the simulink scanner library
	 * @param fileName
	 * @return edu.tum.cs.simulink.model.SimulinkModel 
	 * @throws SimulinkBuilderException
	 */
	protected edu.tum.cs.simulink.model.SimulinkModel parseModelFromFile(String fileName) throws SimulinkBuilderException
	{
		File file = new File(fileName);
		this.workingDirectory = file.getParent();
		SimulinkModelBuilder smb = new SimulinkModelBuilder(file, new SimpleLogger());
		edu.tum.cs.simulink.model.SimulinkModel sourceModel = null; 
		try 
		{
			sourceModel = smb.buildModel();
		}
		catch(Exception e)
		{
			throw new SimulinkBuilderException("Could not parse model file: " +fileName,e);
		}		
		return sourceModel;
	}
	
	/**
	 * Returns the Bus with the given name. If no Bus exists,
	 * it is created.
	 * @return Bus
	 * @throws SimulinkBuilderException 
	 */
	protected Bus getBus(String name, SimulinkFile file) throws SimulinkBuilderException
	{
		for(Bus bus: file.getBuses())
		{
			if(bus.getName().equals(name))
				return bus;
		}
		
		BusBuilder busBuilder = new BusBuilder();
		Bus bus;
		try {
			bus = busBuilder.loadBus(workingDirectory + File.separator + name + "Generator.m");
			//Add implicitel loaded buses
			file.getBuses().addAll(busBuilder.getLoadedBuses());
		} catch (FileNotFoundException e) {
			//Ignore Bus and create Dummy Bus
			bus = this.factory.createBus();
			bus.setName(name);
		} catch (BusBuilderException e) {
			throw new SimulinkBuilderException("Could not load Bus "+name,e);
		}		
		file.getBuses().add(bus);
		return bus;
	}
	
	/**
	 * Sets the dimensions attribute for a PortBlock
	 */
	private void handlePortDimensions(edu.tum.cs.simulink.model.SimulinkBlock srcBlock, PortBlock genPort)
	{
		String dimensions = srcBlock.getParameter("PortDimensions");
		if(dimensions != null)
		{
			genPort.setDimensions(dimensions);
			this.deleteParameter(genPort, "PortDimensions");
		}
		
	}
	
	/**
	 * Computes the root SimulinkFile for a given base block
	 * @throws SimulinkBuilderException
	 */
	protected SimulinkFile getRootFile(Block base) throws SimulinkBuilderException
	{
		if(base instanceof SimulinkFile)
			return (SimulinkFile) base;
		else if(base.eContainer() == null)
			throw new SimulinkBuilderException("Could not find root file for " + base);
		else
			return this.getRootFile((Block)base.eContainer());
	}
	
	/**
	 * Remove all Parameter instances not in the whitelist
	 */
	protected void processParameterWhitelist(EObject object)
	{
		if(this.parameterWhitelist == null)
			return;
		
		if(object instanceof Element)
		{
			Element elem = (Element) object;
			List<Parameter> deleteParam = new ArrayList<Parameter>(elem.getParameters().size());
			//Find parameters to delete
			for(Parameter param: elem.getParameters())
				if(!this.parameterWhitelist.contains(param.getName()))
					deleteParam.add(param);
			//Delete parameters
			for(Parameter param: deleteParam)
				elem.getParameters().remove(param);
		}

		for(EObject obj: object.eContents())
			this.processParameterWhitelist(obj);
	}
}
