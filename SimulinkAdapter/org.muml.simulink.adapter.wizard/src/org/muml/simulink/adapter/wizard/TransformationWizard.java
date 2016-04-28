package org.muml.simulink.adapter.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.adapter.wizard.pages.SelectDebugOptionsPage;
import org.muml.simulink.adapter.wizard.pages.SelectDestinationPage;
import org.muml.simulink.adapter.wizard.pages.SelectFujabaModelPage;
import org.muml.simulink.adapter.wizard.pages.SelectInstanceConfigurationPage;

public class TransformationWizard extends Wizard implements IExportWizard {

	private SelectFujabaModelPage selectFujaba = null;
	private SelectInstanceConfigurationPage selectInstance = null;
	private SelectDestinationPage selectDestination = null;
	private SelectDebugOptionsPage selectDebug = null;
	
	//Source model
	private RootNode model =  null;
	
	public TransformationWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.setWindowTitle("Transformation");
		this.selectFujaba 		= new SelectFujabaModelPage("Select Fujaba Model", selection);
		this.selectInstance 	= new SelectInstanceConfigurationPage("Select Instance Configuration");
		this.selectDestination 	= new SelectDestinationPage("Select Destination", selection);
		this.selectDebug		= new SelectDebugOptionsPage("Delect Debug Options");
	}

	@Override
	public boolean performFinish() {
		
		String modelFile = this.getModelFile();
		ComponentInstanceConfiguration configuration = this.getConfiguration();
		String destination = this.getDestination();

		TransformationJob job = new TransformationJob(model, modelFile, configuration, destination);
		job.saveIntermediateModel(this.getSaveIntermediateModel());
		job.printSentMessages(this.getPrintSentMessages());
		job.setPrintTransformationStatistics(this.getTransformationPrintStatistics());
		job.setUser(true);
		job.schedule();
		
		return true;
	}
	
	@Override
	public void addPages()
	{
		super.addPages();
		this.addPage(this.selectFujaba);
		this.addPage(this.selectInstance);
		this.addPage(this.selectDestination);
		this.addPage(this.selectDebug);
	}
	
	public void setModel(RootNode model, String name)
	{
		this.model = model;
		
		this.selectInstance.setModel(model);
		
		if(name != null)
			this.selectDestination.setFileName(name);
	}
	
	protected String getModelFile()
	{
		return this.selectFujaba.getModelFile();
	}
	
	protected ComponentInstanceConfiguration getConfiguration() 
	{
		return this.selectInstance.getConfiguration();
	}
	
	protected String getDestination() 
	{
		return this.selectDestination.getDestination();
	}	
	
	protected RootNode getModel()
	{
		return this.model;
	}
	
	protected boolean getSaveIntermediateModel()
	{
		return this.selectDebug.saveIntermediateModel();
	}
	
	protected int getPrintSentMessages() 
	{
		return this.selectDebug.printSentMessages();
	}
	
	protected boolean getTransformationPrintStatistics(){
		return this.selectDebug.printTransformationStatistics();
	}
}
