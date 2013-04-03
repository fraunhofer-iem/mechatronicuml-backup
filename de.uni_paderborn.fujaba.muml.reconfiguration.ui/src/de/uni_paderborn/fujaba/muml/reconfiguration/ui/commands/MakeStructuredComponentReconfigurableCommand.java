package de.uni_paderborn.fujaba.muml.reconfiguration.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart;

public class MakeStructuredComponentReconfigurableCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();
			
			//if a StaticStructuredComponent has been found, call transformation function
			if(editPart instanceof StaticStructuredComponentEditPart){
				StaticStructuredComponent sc = (StaticStructuredComponent) ((View) editPart.getModel()).getElement();
				
				makeStructuredComponentReconfigurable(sc);
			}
			
		}
		
		return null;
	}
	
	private void makeStructuredComponentReconfigurable(StaticStructuredComponent sc){
		
		
	}

}
