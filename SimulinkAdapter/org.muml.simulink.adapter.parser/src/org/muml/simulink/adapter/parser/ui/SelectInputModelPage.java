package org.muml.simulink.adapter.parser.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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
import org.muml.simulink.adapter.parser.SimulinkBuilder;


public class SelectInputModelPage extends WizardNewFileCreationPage {
	
	protected FileFieldEditor editor;
	
	private SimulinkContainer model = null;
	
	private IStructuredSelection initialSelection = null;
	
	Composite whitelistArea = null;
	Composite whitelistAreaParent = null;
	
	WhitelistEditor whitelistEditor = null;

	public SelectInputModelPage(String pageName, IStructuredSelection selection) 
	{
		super(pageName, selection);
		this.setTitle(pageName);
		this.setFileExtension("xmi");
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
		
		this.editor = new FileFieldEditor("fileSelect","Select Model: ",fileSelectionArea);
		this.editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				IPath path = new Path(SelectInputModelPage.this.editor.getStringValue());
				setFileName(path.lastSegment().replace("." + path.getFileExtension(), ""));
				SelectInputModelPage.this.validatePage();
			}
		});	
		this.editor.setFileExtensions( new String[] { "*.mdl"});
		fileSelectionArea.moveAbove(null);
		
		//Process initial selection
		if(this.initialSelection.getFirstElement() != null)
		{
			IFile initialFile = (IFile)this.initialSelection.getFirstElement();
			this.editor.setStringValue(initialFile.getLocation().toString());
		}
	
		this.whitelistAreaParent = parent;
	}

	@Override
	protected String getNewFileLabel() 
	{
		return "New EMF Model Name:";
	}
	
	@Override
	protected void handleAdvancedButtonSelect() 
	{
		if(this.whitelistArea != null)
		{
			this.whitelistArea.dispose();
			this.whitelistArea = null;
		}
		else
		{
			this.whitelistArea = new Composite(this.whitelistAreaParent, SWT.NONE);
			GridData whitelistData = new GridData(GridData.FILL_HORIZONTAL);
			this.whitelistArea.setLayoutData(whitelistData);
			this.whitelistEditor = new WhitelistEditor("whitelist", "Parameter Whitelist", this.whitelistArea);
			this.whitelistArea.moveBelow(null);
		}		
		super.handleAdvancedButtonSelect();
	}
	
	protected void loadModel(String fileName)
	{
		SimulinkBuilder builder = new SimulinkBuilder();
		try 
		{
			if(this.whitelistArea != null)
				builder.setParameterWhitelist(this.whitelistEditor.getWhitelist());
			this.model = builder.buildFromFile(fileName);
		} 
		catch (Exception ex) 
		{
			this.setErrorMessage(ex.toString());
		}		
	}
	
	public SimulinkContainer getModel()
	{
		IPath path = new Path(this.editor.getStringValue());
		this.loadModel(path.toString());
		this.validatePage();
		return this.model;
	}

	@Override
	public boolean validatePage()
    {
		boolean valid = super.validatePage();
		
		if(valid)
		{
			this.setErrorMessage(null);
			if(this.editor.getStringValue().isEmpty())
			{
				this.setErrorMessage("Select a model");
			}
		}
		
		return valid;
    }

}
