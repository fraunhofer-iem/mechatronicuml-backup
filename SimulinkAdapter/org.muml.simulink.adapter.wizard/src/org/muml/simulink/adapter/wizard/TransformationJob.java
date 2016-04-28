package org.muml.simulink.adapter.wizard;

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
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.adapter.m2t.SimulinkWriter;
import org.muml.simulink.adapter.m2t.graphviz.GraphVizStateflowLayouter;
import org.muml.simulink.adapter.wizard.transformation.MUMLAnalysis;
import org.muml.simulink.adapter.wizard.transformation.PostTransformationModification;
import org.muml.simulink.adapter.wizard.transformation.TGGTransformation;

public class TransformationJob extends Job {

	/**
	 * Enable run-time measurements.
	 */
	private boolean printTransformationStatistics = false;
	
	protected RootNode model = null;	
	protected ComponentInstanceConfiguration configuration = null;
	protected String destination = null;
	
	protected boolean saveIntermediateModel = false;
	protected int printSentMessages = 0;
	
	private long totalTime = 0;
	private long timeForMumlAnalysis = 0;
	private long timeForTGGTransformation = 0;
	private long timeForPostTransformationStep = 0;
	private long timeForCodeGen = 0;
	
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
		
		long curTime = System.currentTimeMillis();
		totalTime = System.currentTimeMillis();
		
		//Step 1: Analyze Fujaba model
		monitor.subTask("Analyzing MUML Model");
		MUMLAnalysis mumlAnalysis = new MUMLAnalysis();
		mumlAnalysis.MUML_Analysis(this.model, configuration);
		monitor.worked(1);
		timeForMumlAnalysis = System.currentTimeMillis() - curTime;
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;
		
		//Step 2: Run TGG
		curTime = System.currentTimeMillis();
		monitor.subTask("Performing TGG Transformation");
		TGGTransformation tggTransformation = new TGGTransformation();
		SimulinkContainer target = null;
		target = tggTransformation.transform(this.model, new SubProgressMonitor(monitor,1));
		timeForTGGTransformation = System.currentTimeMillis() - curTime;
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;		
		
		curTime = System.currentTimeMillis();
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
		
		timeForPostTransformationStep = System.currentTimeMillis() - curTime;
		
		if(monitor.isCanceled())
			return Status.CANCEL_STATUS;	
		
		//Step 5: Run Xpand
		curTime = System.currentTimeMillis();
		monitor.subTask("Generating Code");
		SimulinkWriter simulinkWriter = new SimulinkWriter();
		simulinkWriter.setModel(target);
		simulinkWriter.setGlobalVar("CommunicationSwitch_debug", Integer.valueOf(this.printSentMessages));
		simulinkWriter.writeToFile(this.destination, new SubProgressMonitor(monitor,1));
		timeForCodeGen = System.currentTimeMillis() - curTime;
		
		totalTime = System.currentTimeMillis() - totalTime;
		
		//Step 6: Refresh resources
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
		
		//Print stats
		if(printTransformationStatistics){
			System.out.println("-------------------- Summary ----------------");
			System.out.println("Applied " + tggTransformation.getNumberOfAppliedRules() + " TGG rules");
			System.out.println("Encountered " + tggTransformation.getNumberOfUnsuccessfullyAppliedRules() + " unsuccessful rule applications");
			System.out.println("Took time:\t\t\t\t" + totalTime + "ms");
			System.out.println("Time for Pretransformation Step:\t" + timeForMumlAnalysis + "ms");
			System.out.println("Time for TGG Transformation:\t\t" + timeForTGGTransformation + "ms");
			System.out.println("Time for Posttransformation Step:\t" + timeForPostTransformationStep + "ms");
			System.out.println("Time for Code Generation:\t\t" + timeForCodeGen + "ms");
		}
		
		
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
	
	protected boolean getPrintTransformationStatistics(){
		return this.printTransformationStatistics;
	}
	
	public void setPrintTransformationStatistics(boolean state){
		this.printTransformationStatistics = state;
	}
	
	protected void saveIntermediateModel(SimulinkContainer model) throws IOException
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(this.destination + ".xmi"));
		resource.getContents().add(model);
		

		resource.save(null);
	}
}
