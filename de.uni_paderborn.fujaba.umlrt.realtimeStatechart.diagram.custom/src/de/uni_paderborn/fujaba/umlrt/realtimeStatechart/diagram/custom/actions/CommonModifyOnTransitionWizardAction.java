package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart;

public abstract class CommonModifyOnTransitionWizardAction extends AbstractRealtimeStatechartEditorAction implements IWorkbenchWindowActionDelegate
{
	protected Transition selectedTransition = null;
	
	protected IWorkbenchWindow window;
	protected Shell shell = null;
	protected IWorkbench workbench = null;
	   
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
