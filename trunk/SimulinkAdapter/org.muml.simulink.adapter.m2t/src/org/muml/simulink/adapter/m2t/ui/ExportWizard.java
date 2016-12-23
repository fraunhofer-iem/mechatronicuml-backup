package org.muml.simulink.adapter.m2t.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.adapter.m2t.SimulinkWriter;
import org.muml.simulink.adapter.m2t.graphviz.GraphVizStateflowLayouter;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.StateflowMachine;


public class ExportWizard extends Wizard implements IExportWizard 
{	
	private SelectOutputModelPage selectOutputModelPage = null;


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.setWindowTitle("Simulink Model Export");
		this.setNeedsProgressMonitor(true);
		this.selectOutputModelPage = new SelectOutputModelPage("Simulink Model Export",selection);
	}
	
	@Override
	public void addPages()
	{
		super.addPages();
		this.addPage(this.selectOutputModelPage);
	}

	@Override
	public boolean performFinish() 
	{
		final IFile outputFile = this.selectOutputModelPage.createNewFile();

		final SimulinkContainer inputModel = this.selectOutputModelPage.getModel();
		
		//Check validity
		BasicDiagnostic chain = new BasicDiagnostic();
		if(!Diagnostician.INSTANCE.validate(inputModel,chain))
		{
			MessageDialog.openError(getShell(), "Selected Model is not valid", chain.getChildren().get(0).getMessage());
			return false;	
		}			
		
		try 
		{
			this.performFinishOperation(inputModel, outputFile);
		} 
		catch (InterruptedException ie) 
		{
			//User canceled
			return false;
		} 
		catch (Exception e) 
		{
			IStatus status = new Status(IStatus.ERROR, "org.muml.simulink.adapter.m2t",0, "Could not export model", e);
			ResourcesPlugin.getPlugin().getLog().log(status);
			return false;
		} 

		return true;
	}
	
	protected void performFinishOperation(final SimulinkContainer inputModel, final IFile outputFile) throws InterruptedException, CoreException, InvocationTargetException
	{
		
		this.getContainer().run(true, true, new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException
					{
						monitor.beginTask("Generating Model", 3);

						monitor.subTask("Generating Layout");
						ExportWizard.this.layoutStateflow(inputModel, new SubProgressMonitor (monitor, 1));
						
						monitor.subTask("Generating Code");
						saveTargetModel(outputFile.getLocation().toString(), inputModel, new SubProgressMonitor (monitor, 1));
						
						monitor.subTask("Refreshing Workspace");
						try 
						{							
							outputFile.getParent().refreshLocal(1, null);
						} 
						catch (CoreException e) 
						{
							throw new InvocationTargetException(e);
						}		
						monitor.worked(1);
						
						monitor.done();						
					}
			});
	}
	
	protected void saveTargetModel(String targetFile, SimulinkContainer sourceModel, IProgressMonitor monitor)
	{
		monitor.beginTask("Writing Files", 1);
		SimulinkWriter writer = new SimulinkWriter();
		writer.setModel(sourceModel);
		writer.writeToFile(targetFile,monitor);
		monitor.done();
	}
	
	
	protected void layoutStateflow(SimulinkContainer sourceModel, IProgressMonitor monitor)
	{
		List<StateflowMachine> machines = new LinkedList<StateflowMachine>();
		
		for(SimulinkModel model: sourceModel.getModels())
			if(model.getStateflowMachine() != null)
				machines.add(model.getStateflowMachine());
		
		for(SimulinkLibrary library: sourceModel.getLibraries())
			if(library.getStateflowMachine() != null)
				machines.add(library.getStateflowMachine());
		
		monitor.beginTask("Generating Layout", machines.size());
		
		for(StateflowMachine machine: machines)
		{
			monitor.subTask("Generating Layout for Statecharts in " + machine.getModel().getName());
			//needs layouting?
			for(Chart chart: machine.getCharts())
			{
				//layout info given?
				if(chart.getParameter("windowPosition") != null)
					continue;
				else
				{
					GraphVizStateflowLayouter layouter = new GraphVizStateflowLayouter();
					layouter.layout(machine);
				}
			}
			monitor.worked(1);
		}	
		monitor.done();
	}

}
