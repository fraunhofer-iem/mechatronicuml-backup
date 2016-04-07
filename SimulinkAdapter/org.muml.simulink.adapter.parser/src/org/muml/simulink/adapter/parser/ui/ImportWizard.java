package org.muml.simulink.adapter.parser.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.muml.simulink.SimulinkContainer;

public class ImportWizard extends Wizard implements IImportWizard {
	
	SelectInputModelPage inputModelPage;

	public ImportWizard() 
	{
		super();
	}


	@Override
	public boolean performFinish() 
	{
		//Convert model
		SimulinkContainer targetModel = this.inputModelPage.getModel();
		if(targetModel == null)
			return false;
		
		//Save target model
		String targetModelFileName = this.inputModelPage.getContainerFullPath().append(this.inputModelPage.getFileName()).toString();
		Resource res = new XMIResourceFactoryImpl().createResource(URI.createURI(targetModelFileName));
		res.getContents().add(targetModel);
		
		try 
		{
			res.save(Collections.EMPTY_MAP);
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
			return false;
		}		
				
		return true;
	}
	 
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.setWindowTitle("Simulink Model Import Wizard");
		this.setNeedsProgressMonitor(false);
		this.inputModelPage = new SelectInputModelPage("Simulink Model Import",selection);
	}
	

	@Override
    public void addPages() 
    {
        super.addPages(); 
        this.addPage(this.inputModelPage);        
    }
    
}
