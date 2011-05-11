package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart;

public class CommonTransitionCreateAction implements IObjectActionDelegate {

	protected Transition selectedTransition = null;
	
	@Override
	public void run(IAction action) {
		
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
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

}
