package org.muml.simulink.adapter.wizard.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class SelectDestinationPage extends WizardNewFileCreationPage {

	public SelectDestinationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		this.setFileExtension("mdl");
		this.setAllowExistingResources(true);
		this.setTitle("Destination");
		this.setDescription("Select a destination");
	}
	
	public String getDestination()
	{
		return this.createFileHandle(this.getContainerFullPath().append(this.getFileName())).getLocation().toString();
	}
}
