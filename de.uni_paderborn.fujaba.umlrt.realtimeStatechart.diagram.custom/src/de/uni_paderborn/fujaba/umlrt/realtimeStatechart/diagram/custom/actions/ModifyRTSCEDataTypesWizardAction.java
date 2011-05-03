package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards.CreateEDataTypeWizard;

public class ModifyRTSCEDataTypesWizardAction extends AbstractRealtimeStatechartEditorAction implements IWorkbenchWindowActionDelegate
{	
	private IWorkbenchWindow window;
	   
	public void dispose()
	{
	      // nothing to do
	}

	public void init(IWorkbenchWindow window)
	{
	    this.window = window;
	}
	
	@Override
	public void run(IAction action) {
		
		org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag = (org.eclipse.gmf.runtime.notation.impl.DiagramImpl) getEditor().getDiagram();
	  
      Shell shell = null;
      IWorkbench workbench = null;
      if (this.getEditor() != null)
      {
         shell = this.getEditor().getSite()
         .getShell();
         workbench = this.getEditor().getEditorSite().getWorkbenchWindow().getWorkbench();
      }
      else
      {
         shell = this.window.getShell();
         workbench = this.window.getWorkbench();
      }
      
      CreateEDataTypeWizard wizard = new CreateEDataTypeWizard(diag);
      wizard.init(workbench, null);
      WizardDialog dialog = new WizardDialog(shell, wizard);
      dialog.create();
      dialog.open();
	}
}
