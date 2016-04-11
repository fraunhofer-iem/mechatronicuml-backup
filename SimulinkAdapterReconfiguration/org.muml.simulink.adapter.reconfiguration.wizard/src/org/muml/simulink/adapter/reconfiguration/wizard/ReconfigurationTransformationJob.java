package org.muml.simulink.adapter.reconfiguration.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.adapter.m2t.SimulinkWriter;
import org.muml.simulink.adapter.m2t.graphviz.GraphVizStateflowLayouter;
import org.muml.simulink.adapter.reconfiguration.analysis.inter.SimulinkReconfiguration;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.ReconfigurationMUMLAnalysis;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.ReconfigurationPreTransformation;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.ReconfigurationTGGTransformation;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.ReachAnalysis;
import org.muml.simulink.adapter.wizard.TransformationJob;
import org.muml.simulink.adapter.wizard.transformation.PostTransformationModification;

/**
 * Executes the transformation for reconfigurable models
 */
public class ReconfigurationTransformationJob extends TransformationJob 
{
	public ReconfigurationTransformationJob(RootNode model, String modelFile, ComponentInstanceConfiguration configuration, String destination) 
	{
		super(model, modelFile, configuration, destination);
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) 
	{
		
		monitor.beginTask("Transformation", 9);
		
		//Step 1: Reachability Analysis
		monitor.subTask("Reachability Analysis");
		ReachAnalysis reachAnalysis = new ReachAnalysis(this.model, this.configuration);
		reachAnalysis.computeConfigurations();
		monitor.worked(1);		
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;

		//Step 2: Normalize Executor/Manager
		monitor.subTask("Executor/Manager Transformation");
		ReconfigurationPreTransformation reconfigurationPreTransformation = new ReconfigurationPreTransformation(this.model);
		reconfigurationPreTransformation.transform(this.configuration);
		monitor.worked(1);
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;	
			
		//Step 3: Analyze Fujaba model
		monitor.subTask("Analyzing MUML Model");
		ReconfigurationMUMLAnalysis mumlAnalysis = new ReconfigurationMUMLAnalysis();
		mumlAnalysis.MUML_Analysis(this.model, configuration);
		monitor.worked(1);
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;

		//Step 4: Run TGG
		monitor.subTask("Performing TGG Transformation");
		ReconfigurationTGGTransformation tggTransformation = new ReconfigurationTGGTransformation();
		SimulinkContainer target = tggTransformation.transform(this.model, new SubProgressMonitor(monitor,1));
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;


		//Step 5: Modify simulink model after the transformation 
		monitor.subTask("Modification of Simulink Model");
		PostTransformationModification modification = new PostTransformationModification();
		modification.modify(target);
		monitor.worked(1);
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;
		
		//Step 6: Inject reconfiguration elements
		monitor.subTask("Simulink Reconfiguration Elements");
		SimulinkReconfiguration simuReconf = new SimulinkReconfiguration();
		simuReconf.modify(target);
		monitor.worked(1);
		
		if(this.saveIntermediateModel)
		{
			try {
				this.saveIntermediateModel(target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;		
		
		//Step 7: Layout stateflow
		GraphVizStateflowLayouter layouter = new GraphVizStateflowLayouter();		
		
		for(SimulinkModel model: target.getModels())
			if(model.getStateflowMachine() != null)
				layouter.layout(model.getStateflowMachine());
		
		for(SimulinkLibrary library: target.getLibraries())
			if(library.getStateflowMachine() != null)
				layouter.layout(library.getStateflowMachine());
		
		monitor.worked(1);
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;	
	
		//Step 8: Run Xpand
		monitor.subTask("Generating Code");
		SimulinkWriter simulinkWriter = new SimulinkWriter();
		simulinkWriter.setModel(target);
		simulinkWriter.setGlobalVar("CommunicationSwitch_debug", Integer.valueOf(this.printSentMessages));
		simulinkWriter.writeToFile(this.destination, new SubProgressMonitor(monitor,1));
				
		//Step 9: Refresh resources
		monitor.subTask("Refreshing resources");
		try {
			IPath dest = new Path(this.destination);
			IPath wp = ResourcesPlugin.getWorkspace().getRoot().getRawLocation();
			IPath relDest = dest.makeRelativeTo(wp);
			ResourcesPlugin.getWorkspace().getRoot().getFile(relDest).getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(monitor,1));
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.WARNING,"org.muml.simulink.adapter.reconfiguration.wizard",e.getLocalizedMessage(),e);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
		
		monitor.done();
		
		return Status.OK_STATUS;
	}	
}
