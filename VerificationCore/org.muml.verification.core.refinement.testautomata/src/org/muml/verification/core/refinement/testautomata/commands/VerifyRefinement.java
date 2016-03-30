package org.muml.verification.core.refinement.testautomata.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.reachanalysis.core.export.GraphVizExportFileTypes;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.verification.core.reachanalysis.rtsc.export.RTSCExporter;
import org.muml.verification.core.refinement.testautomata.Verification;
import org.muml.verification.core.refinement.testautomata.export.TestAutomatonGraphDecorator;

public class VerifyRefinement extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		Iterator<?> selectionIterator = ((StructuredSelection) selection)
				.iterator();
		while (selectionIterator.hasNext()) {
			DiscretePort port = null;
			Object curObj = selectionIterator.next();
			
			//obtain port from selection
			if(curObj instanceof DiscretePortEditPart){
				DiscretePortEditPart portEditPart = (DiscretePortEditPart) curObj;
				port = (DiscretePort) ((View) portEditPart.getModel()).getElement();
			} else if(curObj instanceof DiscretePort){
				port = (DiscretePort) curObj;
			}
			
			//check refinement if port is set
			if(port != null){
				Verification verification = new Verification();
				boolean correct = verification.checkRefinement(port);
				if (correct) {
					MessageBox dialog = new MessageBox(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(), SWT.ICON_WORKING
							| SWT.YES | SWT.NO);
					dialog.setText("Correct Refinement");
					dialog.setMessage("The checked port is a correct refinement of the specified role. \nDo you want to export the reachabilitygraph to your workspace?");
					Object result = dialog.open();
					if (result.equals(SWT.YES)) {
						exportReachabilityGraph(verification);
					}
				} else {
					MessageBox dialog = new MessageBox(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(), SWT.ICON_ERROR
							| SWT.YES | SWT.NO);
					dialog.setText("Incorrect Refinement");
					dialog.setMessage("The checked port is not a correct refinement of the specified role. \nDo you want to export the reachabilitygraph to your workspace?");
					Object result = dialog.open();
					if (result.equals(SWT.YES)) {
						exportReachabilityGraph(verification);
					}
				}
			}
		}
		return null;
	}

	
	private void exportReachabilityGraph(Verification verif){
		TestAutomatonGraphDecorator decorator = new TestAutomatonGraphDecorator(verif.getErrorState(), verif.getNeutralState());
		RTSCExporter gvExport = new RTSCExporter(decorator);
		gvExport.setType(GraphVizExportFileTypes.SVG);
		gvExport.export(verif.getReachabilityGraph());
	}
	
}
