package org.muml.simulink.adapter.m2t.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkPackage;


public class SelectOutputModelPage extends WizardNewFileCreationPage {
	
	protected FileFieldEditor editor;
	
	private SimulinkContainer model = null;
	
	private IStructuredSelection initialSelection = null;

	public SelectOutputModelPage(String pageName, IStructuredSelection selection) 
	{
		super(pageName, selection);
		this.setTitle(pageName);
		this.setFileExtension("mdl");
		this.setAllowExistingResources(true);
		this.initialSelection = selection;
	}

	@Override
	protected void createAdvancedControls(Composite parent) 
	{
		super.createAdvancedControls(parent);
		
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);
		
		this.editor = new ModelFieldEditor("fileSelect","Select EMF Model: ",fileSelectionArea);

		this.editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				IPath path = new Path(SelectOutputModelPage.this.editor.getStringValue());
				setFileName(path.lastSegment().replace("." + path.getFileExtension(), ""));
				SelectOutputModelPage.this.loadModel(path.toString());
				SelectOutputModelPage.this.validatePage();
			}
		});	
		this.editor.setFileExtensions( new String[] { "*.xmi"});
		fileSelectionArea.moveAbove(null);
		
		//Process initial selection
		if(this.initialSelection.getFirstElement() != null)
		{
			IFile initialFile = (IFile)this.initialSelection.getFirstElement();
			this.editor.setStringValue(initialFile.getFullPath().toString());
			this.loadModel(this.editor.getStringValue());
			this.validatePage();
		}
	}

	@Override
	protected String getNewFileLabel() 
	{
		return "New Model Name:";
	}
	
	protected void loadModel(String fileName)
	{
		//Init model
		SimulinkPackage.eINSTANCE.eClass();
		this.model = null;
		try
		{
			Resource res = new ResourceSetImpl().getResource(URI.createURI(fileName), true);
			this.model = (SimulinkContainer)res.getContents().get(0);
		}
		catch(Exception e)
		{
			this.setErrorMessage(e.getMessage());
		}
	}
	
	public SimulinkContainer getModel()
	{
		return this.model;
	}

	@Override
	public boolean validatePage()
    {
		boolean valid = super.validatePage();
		
		if(valid)
		{
			this.setErrorMessage(null);
			if(this.model == null)
			{
				this.setErrorMessage("Select a model");
			}
		}		
		return valid;
    }

}
