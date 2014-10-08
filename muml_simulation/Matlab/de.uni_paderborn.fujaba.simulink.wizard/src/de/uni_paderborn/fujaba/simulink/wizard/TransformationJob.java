package de.uni_paderborn.fujaba.simulink.wizard;

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
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.simulink.m2t.SimulinkWriter;
import de.uni_paderborn.fujaba.simulink.m2t.graphviz.GraphVizStateflowLayouter;
import de.uni_paderborn.fujaba.simulink.model.SimulinkContainer;
import de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary;
import de.uni_paderborn.fujaba.simulink.model.SimulinkModel;
import de.uni_paderborn.fujaba.simulink.wizard.transformation.MUMLAnalysis;
import de.uni_paderborn.fujaba.simulink.wizard.transformation.PostTransformationModification;
import de.uni_paderborn.fujaba.simulink.wizard.transformation.TGGTransformation;

public class TransformationJob extends Job {

	protected RootNode model = null;	
	protected ComponentInstanceConfiguration configuration = null;
	protected String destination = null;
	
	protected boolean saveIntermediateModel = false;
	protected int printSentMessages = 0;
	
	public TransformationJob(RootNode model, String modelFile, ComponentInstanceConfiguration configuration, String destination) 
	{
		super("MATLAB/Simulink Transformation");		
		this.model = model;
		this.configuration = configuration;
		this.destination = destination;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) 
	{
		monitor.beginTask("Transformation", 6);
		
		//Step 1: Analyze Fujaba model
		monitor.subTask("Analyzing MUML Model");
		MUMLAnalysis mumlAnalysis = new MUMLAnalysis();
		mumlAnalysis.MUML_Analysis(this.model, configuration);
		monitor.worked(1);
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;
		
		//Step 2: Run TGG
		monitor.subTask("Performing TGG Transformation");
		TGGTransformation tggTransformation = new TGGTransformation();
		SimulinkContainer target = null;
		target = tggTransformation.transform(this.model, new SubProgressMonitor(monitor,1));
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;		
		
		//Step 3: Modify simulink model after the transformation 
		monitor.subTask("Modification of Simulink Model");
		PostTransformationModification modification = new PostTransformationModification();
		modification.modify(target);
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
		
		//Step 4: Layout stateflow
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
		
		//Step 5: Run Xpand
		monitor.subTask("Generating Code");
		SimulinkWriter simulinkWriter = new SimulinkWriter();
		simulinkWriter.setModel(target);
		simulinkWriter.setGlobalVar("CommunicationSwitch_debug", Integer.valueOf(this.printSentMessages));
		simulinkWriter.writeToFile(this.destination, new SubProgressMonitor(monitor,1));
				
		//Step 6: Refresh resources
		monitor.subTask("Refreshing resources");
		try {
			IPath dest = new Path(this.destination);
			IPath wp = ResourcesPlugin.getWorkspace().getRoot().getRawLocation();
			IPath relDest = dest.makeRelativeTo(wp);
			ResourcesPlugin.getWorkspace().getRoot().getFile(relDest).getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(monitor,1));
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.WARNING,"de.uni_paderborn.fujaba.simulink.wizard",e.getLocalizedMessage(),e);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
		
		monitor.done();
		
		return Status.OK_STATUS;
	}

	
	public void saveIntermediateModel(boolean state)
	{
		this.saveIntermediateModel = state;
	}
	
	public void printSentMessages(int state)
	{
		this.printSentMessages = state;
	}
	
	protected void saveIntermediateModel(SimulinkContainer model) throws IOException
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(this.destination + ".xmi"));
		resource.getContents().add(model);
		

		resource.save(null);
	}
}
