package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards.ModifySynchronizationWizard;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart;

public class ModifySynchornizationWizardAction extends AbstractRealtimeStatechartEditorAction implements IWorkbenchWindowActionDelegate
{
	protected Transition selectedTransition = null;
	
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
      
      ModifySynchronizationWizard wizard = new ModifySynchronizationWizard(diag,selectedTransition);
      wizard.init(workbench, null);
      WizardDialog dialog = new WizardDialog(shell, wizard);
      dialog.create();
      dialog.open();
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	     
		if ((selection instanceof IStructuredSelection))
	  	{
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object obj = structured.getFirstElement();

	         if (obj instanceof TransitionEditPart
	               && ((TransitionEditPart) obj).getNotationView().getElement() instanceof Transition){
	        	 
	        	 selectedTransition =(Transition) ((TransitionEditPart) obj).getNotationView().getElement();
	         }
	  	}
		
		super.selectionChanged(action, selection);
	}
}
