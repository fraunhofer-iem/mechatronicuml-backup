package de.uni_paderborn.fujaba.simulink.reconfiguration.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.simulink.wizard.TransformationWizard;

/**
 * Wizard to configure the transformation for reconfigurable models
 */
public class ReconfigurationWizard extends TransformationWizard implements
		IExportWizard {

	public ReconfigurationWizard() {
		super();
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		super.init(workbench, selection);
		this.setWindowTitle("Reconfiguration Transformation");
	}
	
	@Override
	public boolean performFinish() {
		
		String modelFile = this.getModelFile();
		ComponentInstanceConfiguration configuration = this.getConfiguration();
		String destination = this.getDestination();

		ReconfigurationTransformationJob job = new ReconfigurationTransformationJob(this.getModel(), modelFile, configuration, destination);
		job.saveIntermediateModel(this.getSaveIntermediateModel());
		job.printSentMessages(this.getPrintSentMessages());
		job.setUser(true);
		job.schedule();
		
		return true;
	}

}
