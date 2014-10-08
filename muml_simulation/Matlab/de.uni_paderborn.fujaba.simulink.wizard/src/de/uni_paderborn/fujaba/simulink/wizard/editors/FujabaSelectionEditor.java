package de.uni_paderborn.fujaba.simulink.wizard.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class FujabaSelectionEditor extends FileFieldEditor 
{
	public FujabaSelectionEditor(String name, String labelText,Composite parent)
	{
		super(name, labelText, parent);
	}
	
	@Override
	protected String changePressed()
	{
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(this.getShell(),new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
    	dialog.setTitle("Select Fujaba Model");
    	dialog.setMessage("Select Fujaba Model from workspace");
    	dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
    	dialog.setAllowMultiple(false);		    	
		dialog.open();
		
		
		if(dialog.getFirstResult() instanceof IFile)
		{
			IFile file = (IFile)dialog.getFirstResult();
			if("fujaba".equals(file.getFileExtension()))
				return file.getFullPath().toPortableString();
		}
		return null;
	}

}
