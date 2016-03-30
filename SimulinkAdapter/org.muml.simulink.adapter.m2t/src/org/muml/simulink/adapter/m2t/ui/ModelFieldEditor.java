package org.muml.simulink.adapter.m2t.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class ModelFieldEditor extends FileFieldEditor 
{
	
    public ModelFieldEditor(String name, String labelText, Composite parent) {
        super(name, labelText, parent);
    }
    
    @Override
    protected String changePressed() 
    {
    	ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(this.getShell(),new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
    	dialog.setTitle("Select EMF Model");
    	dialog.setMessage("Select EMF Model from workspace");
    	dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
    	dialog.setAllowMultiple(false);
    	    	
    	dialog.open();
    	
    	if(dialog.getFirstResult() instanceof IFile)
    	{
    		IFile result = (IFile)dialog.getFirstResult();
    		return result.getFullPath().toString();
    	}
    	else
    		return "";
    }

}
