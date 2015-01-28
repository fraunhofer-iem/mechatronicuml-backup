package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import pattern.CoordinationPattern;

public class PatternToProtocolHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		
		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			// add StaticStructuredComponent to list
			EObject element = ((View) editPart.getModel()).getElement();
			if (element instanceof CoordinationPattern) {
				CoordinationPattern pattern = (CoordinationPattern)element;				
				WizardDialog dialog = new WizardDialog(window.getShell(), new PatternToProtocolWizard());
				dialog.open(); 
			}
		}
		return null;
	}
	
	

}
