package org.muml.simulink.adapter.m2t;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.adapter.m2t.graphviz.GraphVizStateflowLayouter;
import org.muml.simulink.stateflow.StateflowMachine;

public class LayoutComponent extends AbstractWorkflowComponent {

	private String modelSlot = null;
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	public void setModelSlot(String modelSlot)
	{
		this.modelSlot = modelSlot;
	}
	
	public void invokeInternal(WorkflowContext ctx, ProgressMonitor pm, Issues arg2) 
	{	
		SimulinkContainer container = (SimulinkContainer) ctx.get(this.modelSlot);
		
		GraphVizStateflowLayouter layouter = new GraphVizStateflowLayouter();
		
		List<StateflowMachine> sfMachines = new LinkedList<StateflowMachine>();
		
		for(SimulinkModel model: container.getModels())
		{
			if(model.getStateflowMachine() != null)
				sfMachines.add(model.getStateflowMachine());
		}
		
		for(SimulinkLibrary library: container.getLibraries())
		{
			if(library.getStateflowMachine() != null)
				sfMachines.add(library.getStateflowMachine());
		}		
		
		for(StateflowMachine machine: sfMachines)
		{						
			pm.subTask(machine.getModel().getName());			
			this.logger.info("Creating layout for StateflowMachine "+machine.getModel().getName());
			layouter.layout(machine);
			pm.worked(1);
		}
			
	}


	@Override
	public String getComponentName() 
	{
		return "LayoutComponent";
	}

	@Override
	public void checkConfiguration(Issues arg0) {
	}
}
