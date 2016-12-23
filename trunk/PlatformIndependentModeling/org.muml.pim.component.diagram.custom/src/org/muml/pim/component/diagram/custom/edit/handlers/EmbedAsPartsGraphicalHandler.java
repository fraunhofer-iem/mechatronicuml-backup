package org.muml.pim.component.diagram.custom.edit.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.component.Component;

public class EmbedAsPartsGraphicalHandler extends AbstractHandler {

	public EmbedAsPartsGraphicalHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IWorkbenchSite edit = HandlerUtil.getActiveSite(event);
		Diagram diagram = null;

		DiagramEditPart diagramEditPart = null;

		List<Component> objects = new ArrayList<Component>();

		for (Object sel : ((IStructuredSelection) selection).toArray()) {
			if (false == sel instanceof GraphicalEditPart) {
				continue;
			}
			GraphicalEditPart editPart = (GraphicalEditPart) sel;
			Diagram currentDiagram = editPart.getNotationView().getDiagram();

			if (diagram == null) {
				diagram = currentDiagram;
			}
			Object topEditPart = editPart.getViewer().getEditPartRegistry().get(diagram);
			if (topEditPart instanceof DiagramEditPart) {
				diagramEditPart = (DiagramEditPart) topEditPart;
			}
			EObject object = editPart.resolveSemanticElement();
			if (object instanceof Component) {
				objects.add((Component) object);
			}
		}

		if (!objects.isEmpty()) {
			TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(diagram);
			EmbedAsPartsGraphicalCommand command = new EmbedAsPartsGraphicalCommand(
					editingDomain, objects, diagram, diagramEditPart);
			editingDomain.getCommandStack().execute(command);
		}
		return null; // return null as required by the current API
	}

	

}
