package org.muml.simulink.adapter.reconfiguration.analysis.inter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.muml.simulink.Block;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.DataType;
import org.muml.simulink.EnablePort;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.PortBlock;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SubSystem;
import org.muml.simulink.reconfiguration.MultiSourceControl;
import org.muml.simulink.reconfiguration.MultiTargetControl;
import org.muml.simulink.reconfiguration.ReconfigurationFactory;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.StateflowFactory;

/**
 * Modify the Simulink model:
 * 1. Inject MultiSourceControl/MultiTargetControl
 * 2. Inject EnablePorts 
 * 3. Connect everything to the Subsystem 'State'
 *
 */
public class SimulinkReconfiguration 
{	
	public void modify(SimulinkContainer container)
	{
		for(SimulinkModel model:container.getModels())
			this.modifyFile(model);
			
		for(SimulinkLibrary lib:container.getLibraries())
			this.modifyFile(lib);
		
	}
	
	private void modifyFile(SimulinkFile file)
	{
		for(SubSystem sys: file.getSubSystems())
			this.modifySubSystem(sys);
	}
	
	private void modifySubSystem(SubSystem subSys)
	{
		//Detect what type of SubSystem this is		
		
		//SubSys is ReconfigurableSubsystem
		for(Block block: subSys.getBlocks())
		{
			if(block instanceof LibraryReference)
			{
				LibraryReference libref = (LibraryReference)block;
				if("State".equals(libref.getName())) 
				{					
					this.modifyReconfigurableSubSystem(subSys, libref);
					break;
				}
			}
		}
		//SubSystem is Enabled SubSystem
		for(InPortBlock inPort: subSys.getInPorts())
		{
			if(inPort instanceof EnablePort) 
			{
				this.modifyEnabledSubSyste(subSys);
				break;
			}
		}
	}
	
	/**
	 * Modify the properties of all OutPorts for the given Subsystem
	 */
	private void modifyEnabledSubSyste(SubSystem subSys)
	{
		this.setOutPortsToResetWhenDisabled(subSys);
	}
	
	/**
	 * Modify a reconfigurable subsystem
	 */
	private void modifyReconfigurableSubSystem(SubSystem subSys, LibraryReference state)
	{
		this.addPortsToState(state, subSys);
		this.connectStateToInstances(state, subSys);
		
		this.injectFadingConnections(subSys, state);
		
		this.injectConnectionControllElements(subSys, state);		
	}
	
	/**
	 * Create the connections between all FadingComponents and the State. I.e. a
	 * line for each control signal and a line for each feedback signal.
	 */
	private void injectFadingConnections(SubSystem parent,LibraryReference state) 
	{
		for(LibraryReference ref: this.getFadingComponents(parent) )
		{
			SubSystem fadingComponent = (SubSystem) ref.getSourceBlock();
			//1. Add ctrl Port
			InPortBlock inCtrl = SimulinkFactory.eINSTANCE.createInPortBlock();
			inCtrl.setName("ctrl");
			inCtrl.setBlock(fadingComponent);
			
			Line lctrl = this.createLine(state, this.getOutPortByName(state, "ctrl_fad_"+ref.getName()), ref, inCtrl);
			parent.getLines().add(lctrl);
			
			//2. Add fdbc Port
			OutPortBlock outFdbc = SimulinkFactory.eINSTANCE.createOutPortBlock();
			outFdbc.setName("fdbc");
			outFdbc.setBlock(fadingComponent);
			
			Line lfdbc = this.createLine(ref, outFdbc, state, this.getInPortByName(state, "fdbc_" + ref.getName()));
			parent.getLines().add(lfdbc);
		}
		
	}

	/**
	 * For all OutPorts of that Subsystem set the following parameters:
	 *  parameterOutputWhenDisabled = reset
	 *  InitialOutput = 0
	 */
	protected void setOutPortsToResetWhenDisabled(SubSystem subSys)
	{
		for(OutPortBlock outPort: subSys.getOutPorts())
		{
			this.addParameter(outPort, "OutputWhenDisabled", "reset");
			this.addParameter(outPort, "InitialOutput", "0");			
		}
		
	}
	
	/**
	 * Inject the MultiTargetControl and MultiSourceControl Blocks for all 1:N and
	 * N:1 Connections
	 */
	protected void injectConnectionControllElements(SubSystem subSys, LibraryReference state)
	{		
		HashMap<OutPortBlock, LinkedList<Line>> connections1N = new HashMap<OutPortBlock, LinkedList<Line>>();
		HashMap<InPortBlock, LinkedList<Line>> connectionsN1 = new HashMap<InPortBlock, LinkedList<Line>>();
		
		//Collect connections
		for(Line line: subSys.getLines())
		{
			InPortBlock target = line.getTargetPort();
			OutPortBlock source = line.getSourcePort();
			
			if(!connections1N.containsKey(source))
				connections1N.put(source, new LinkedList<Line>());
			if(!connectionsN1.containsKey(target))
				connectionsN1.put(target, new LinkedList<Line>());
			
			connections1N.get(source).add(line);
			connectionsN1.get(target).add(line);
		}
		
		for(Entry<OutPortBlock, LinkedList<Line>> e: connections1N.entrySet())
			if(e.getValue().size() > 1)
				this.inject1NConnectionControl(e.getValue(), e.getKey(), subSys, state);
		
		for(Entry<InPortBlock, LinkedList<Line>> e: connectionsN1.entrySet())
			if(e.getValue().size() > 1)
				this.injectN1ConnectionControl(e.getValue(), e.getKey(), subSys, state);		

	}
	
	/**
	 * Inject a MultiSourceControl block between the lines of the target port
	 */
	private void injectN1ConnectionControl(List<Line> incomingLines, InPortBlock target, SubSystem parent, LibraryReference state) 
	{
		MultiSourceControl ctrl = ReconfigurationFactory.eINSTANCE.createMultiSourceControl();
		ctrl.setName("mcc " + target.getName());
		parent.getBlocks().add(ctrl);
		
		//Control signal
		InPortBlock inCtrl = this.createInPort("ctrl");
		ctrl.getInPorts().add(inCtrl);		
		
		OutPortBlock stateCtrl = this.addControlPortToState((SubSystem) state.getSourceBlock(),  "ctrl_conn_" + target.getName().substring(0, target.getName().indexOf(':')));
		Line ctrlLine = this.createLine(state, stateCtrl, ctrl, inCtrl);
		parent.getLines().add(ctrlLine);		
		
		Block targetBlock = null;
		InPortBlock targetPort = null;
		
		//Redirect incoming connections
		for(int i=0; i < incomingLines.size(); i++)
		{
			Line line = incomingLines.get(i);
			
			InPortBlock in = this.createInPort("in" + (i+1));
			ctrl.getInPorts().add(in);

			if(line.getParameter("multilineindex") != null)
			{
				int index = Integer.parseInt(line.getParameter("multilineindex"))+2;// Respect control port
				this.addParameter(in, "Port", Integer.toString(index));
			}
				
			targetBlock = line.getTargetBlock();
			targetPort = line.getTargetPort();
			
			line.setTargetBlock(ctrl);
			line.setTargetPort(in);

		}
		
		//Create line from ctrl
		ctrl.getOutPorts().add(this.createOutPort("out"));		
		Line line = this.createLine(ctrl, ctrl.getOutPorts().get(0), targetBlock, targetPort);
		parent.getLines().add(line);
	}

	/**
	 *  Inject a MultiTargetControl block between the lines of the target port
	 */
	private void inject1NConnectionControl(List<Line> outgoingLines, OutPortBlock source, SubSystem parent, LibraryReference state) 
	{
		String srcName = source.getName();
		if(srcName == null)
			srcName = source.getBlock().getName();
		
		MultiTargetControl ctrl = ReconfigurationFactory.eINSTANCE.createMultiTargetControl();
		ctrl.setName("mcc " + srcName);
		parent.getBlocks().add(ctrl);
		
		//Control signal
		InPortBlock inCtrl = this.createInPort("ctrl");
		ctrl.getInPorts().add(inCtrl);
		
		String dimension = "[1 " + outgoingLines.size() + "]";		
		OutPortBlock stateCtrl = this.addControlPortToState((SubSystem) state.getSourceBlock(), "ctrl_conn_" + srcName.substring(0, srcName.indexOf(':')), dimension);
		Line ctrlLine = this.createLine(state, stateCtrl, ctrl, inCtrl);
		parent.getLines().add(ctrlLine);
		
		Block sourceBlock = null;
		OutPortBlock sourcePort = null;
		
		//Redirect outgoing connections
		for(int i=0; i < outgoingLines.size(); i++)
		{
			Line line = outgoingLines.get(i);
			
			OutPortBlock out = this.createOutPort("out" + (i+1));
			ctrl.getOutPorts().add(out);
			
			if(line.getParameter("multilineindex") != null)
			{
				int index = Integer.parseInt(line.getParameter("multilineindex"))+1;
				this.addParameter(out, "Port", Integer.toString(index));
			}
			
			sourceBlock = line.getSourceBlock();
			sourcePort = line.getSourcePort();
			
			line.setSourceBlock(ctrl);
			line.setSourcePort(out);
		}
		
		//Create line to ctrl
		InPortBlock srcIn = this.createInPort("in");
		ctrl.getInPorts().add(srcIn);
		Line line = this.createLine(sourceBlock, sourcePort, ctrl, srcIn);
		parent.getLines().add(line);
	}

	/**
	 * Helper to add a parameter to the given block.
	 */
	private void addParameter(Block out, String name, String value) 
	{
		Parameter param = SimulinkFactory.eINSTANCE.createParameter();
		param.setName(name);
		param.setValue(value);
		out.getParameters().add(param);
	}

	/**
	 * Add ports for the controllable elements to the 'State' Subsystem
	 */
	protected void addPortsToState(LibraryReference state, SubSystem parent)
	{
		//Enabled Subsystem
		for(Block block: parent.getBlocks())
		{
			if(block instanceof LibraryReference)
			{
				for(PortBlock port: block.getInPorts())
				{
					if(port instanceof EnablePort)
					{
						//Could be changed to this.addControlPortToState()
						OutPortBlock outerPort = this.createOutPort("ctrl_inst_" + block.getName());
						InPortBlock outerInPort = SimulinkFactory.eINSTANCE.createInPortBlock();
						outerPort.getInPorts().add(outerInPort);
						OutPortBlock innerPort = this.createOutPort("ctrl_inst_" + block.getName());
						
						SubSystem stateSys = (SubSystem) state.getSourceBlock();
						ChartBlock chart = this.getStateChartBlock((SubSystem) state.getSourceBlock());
						
						stateSys.getOutPorts().add(outerPort);
						chart.getOutPorts().add(innerPort);
						
						//Add data to chart
						Data data = StateflowFactory.eINSTANCE.createData();
						data.setName("ctrl_inst_" + block.getName());
						data.setType(DataType.INHERIT);
						chart.getChart().getOutput().add(data);
						
						Line line = this.createLine(chart, innerPort,outerPort , outerInPort);
						stateSys.getLines().add(line);

						break;
					}
				}
			}
		}
		//Ctrl and Feedback port for fading components
		for(LibraryReference ref: this.getFadingComponents(parent))
		{
			this.addControlPortToState((SubSystem) state.getSourceBlock(), "ctrl_fad_" + ref.getName());
			this.addFeedbackPortToState((SubSystem) state.getSourceBlock(), "fdbc_" + ref.getName());
		}
	}
	
	/**
	 * Adds a control port to the 'State' Subsystem
	 */
	protected OutPortBlock addControlPortToState(SubSystem state, String name)
	{
		return this.addControlPortToState(state, name, null);
	}
	
	/**
	 * Adds a control port to the 'State' Subsystem. Creates the port in
	 * the Subsystem and also in the Chart Block inside the Subsystem.
	 */	
	protected OutPortBlock addControlPortToState(SubSystem state, String name, String dimension)
	{
		OutPortBlock outerPort = this.createOutPort(name);
		InPortBlock outerInPort = SimulinkFactory.eINSTANCE.createInPortBlock();
		outerPort.getInPorts().add(outerInPort);
		OutPortBlock innerPort = this.createOutPort(name);

		ChartBlock chart = this.getStateChartBlock(state);
		
		state.getOutPorts().add(outerPort);
		chart.getOutPorts().add(innerPort);
		
		Line line = this.createLine(chart, innerPort,outerPort , outerInPort);
		state.getLines().add(line);	
		
		//Add data to chart
		Data data = StateflowFactory.eINSTANCE.createData();
		data.setName(name);
		data.setType(DataType.INHERIT);
		if(dimension != null)
			data.setSize(dimension);
		chart.getChart().getOutput().add(data);
		
		return outerPort;
	}
	
	/**
	 * Adds a feedback port to the 'State' Subsystem
	 */
	protected InPortBlock addFeedbackPortToState(SubSystem state, String name)
	{
		return this.addFeedbackPortToState(state, name, null);
	}
	
	/**
	 * Adds a feedback port to the 'State' Subsystem. Creates the port in
	 * the Subsystem and also in the Chart Block inside the Subsystem.
	 */		
	protected InPortBlock addFeedbackPortToState(SubSystem state, String name, String dimension)
	{
		InPortBlock outerPort = this.createInPort(name);
		OutPortBlock outerInPort = SimulinkFactory.eINSTANCE.createOutPortBlock();
		outerPort.getOutPorts().add(outerInPort);
		InPortBlock innerPort = this.createInPort(name);

		ChartBlock chart = this.getStateChartBlock(state);
		
		state.getInPorts().add(outerPort);
		chart.getInPorts().add(innerPort);
		
		Line line = this.createLine(outerPort , outerInPort, chart, innerPort);
		state.getLines().add(line);	
		
		//Add data to chart
		Data data = StateflowFactory.eINSTANCE.createData();
		data.setName(name);
		data.setType(DataType.INHERIT);
		if(dimension != null)
			data.setSize(dimension);
		chart.getChart().getInput().add(data);
		
		return outerPort;
	}	
	
	/**
	 * Creates an outport
	 */
	private OutPortBlock createOutPort(String portname)
	{
		OutPortBlock port = SimulinkFactory.eINSTANCE.createOutPortBlock();
		port.setName(portname);
		port.setType(DataType.INHERIT);
		return port;
	}
	
	/**
	 * Creates an inport
	 */	
	private InPortBlock createInPort(String portname)
	{
		InPortBlock port = SimulinkFactory.eINSTANCE.createInPortBlock();
		port.setName(portname);
		port.setType(DataType.INHERIT);
		return port;
	}	
	
	/**
	 * Connects the 'State' Subsystem to all LibraryReferences to Enabled Subsystems; i.e. reconfigurable instances 
	 */
	protected void connectStateToInstances(LibraryReference state, SubSystem parent)
	{
		for(Block block: parent.getBlocks())
		{
			if(block instanceof LibraryReference)
			{
				for(PortBlock port: block.getInPorts())
				{
					if(port instanceof EnablePort)
					{
						this.connectStateToInstance(state, (LibraryReference)block, (EnablePort) port);
						break;
					}
				}
			}
		}		
	}
	
	/**
	 * Connects the 'State' Subsystem to a LibraryReferences to an Enabled Subsystem
	 */
	private void connectStateToInstance(LibraryReference state, LibraryReference instance, EnablePort enablePort)
	{
		Line line = this.createLine(state, this.getOutPortByName(state, "ctrl_inst_" + instance.getName()), instance, enablePort);
		state.getParent().getLines().add(line);
	}

	/**
	 * Returns the outport with the given name
	 */
	private OutPortBlock getOutPortByName(Block source, String name)
	{
		for(OutPortBlock port: source.getOutPorts())
			if(name.equals(port.getName()))
				return port;
		throw new IllegalArgumentException("No OutPortBlock with name '" + name +"' found");		
	}
	
	/**
	 * Returns the inport with the given name
	 */	
	private InPortBlock getInPortByName(Block source, String name)
	{
		for(InPortBlock port: source.getInPorts())
			if(name.equals(port.getName()))
				return port;
		throw new IllegalArgumentException("No InPortBlock with name '" + name +"' found");		
	}
		
	/**
	 * Creates a line
	 */
	private Line createLine(Block sourceBlock, OutPortBlock sourcePort, Block targetBlock, InPortBlock targetPort)
	{
		Line line = SimulinkFactory.eINSTANCE.createLine();
		line.setSourceBlock(sourceBlock);
		line.setSourcePort(sourcePort);
		line.setTargetBlock(targetBlock);
		line.setTargetPort(targetPort);
		return line;
	}
	
	/**
	 * Returns the first Chart block in a SubSystem
	 */
	private ChartBlock getStateChartBlock(SubSystem state)
	{
		for(Block block: state.getBlocks())
			if(block instanceof ChartBlock)
				return (ChartBlock) block;
		throw new IllegalArgumentException("No ChartBlock in " + state);
	}
	
	/**
	 * Returns all FadingComponents in a SubSystem
	 */
	private List<LibraryReference> getFadingComponents(SubSystem parent)
	{
		List<LibraryReference> fading = new LinkedList<LibraryReference>();
		for(Block block: parent.getBlocks())
			if(block instanceof LibraryReference && block.getName().equals("FadingComponent"))
				fading.add((LibraryReference) block);
		return fading;		
	}
}
