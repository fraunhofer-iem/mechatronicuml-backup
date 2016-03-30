package org.muml.pim.component.diagram.custom.edit.handlers;

import java.util.List;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.muml.pim.component.Component;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import org.muml.pim.component.diagram.providers.MumlElementTypes;
import org.muml.pim.ui.contextmenu.handlers.component.EmbedAsPartsCommand;

public class EmbedAsPartsGraphicalCommand extends EmbedAsPartsCommand {
	private Diagram diagram;
	private DiagramEditPart diagramEditPart;

	public EmbedAsPartsGraphicalCommand(
			TransactionalEditingDomain editingDomain,
			List<Component> components, Diagram diagram,
			DiagramEditPart diagEditPart) {
		super(editingDomain, components);
		this.diagram = diagram;
		this.diagramEditPart = diagEditPart;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doExecute() {
		super.doExecute();
		StructuredComponent newStructuredComponent = getNewCreatedStructuredComponent();
		if (newStructuredComponent != null && diagramEditPart != null) {
			// Create the View for the new created StructuredComponent in the
			// Diagram
			IElementType elementType = MumlElementTypes
					.getElementType(StaticStructuredComponentEditPart.VISUAL_ID);
			ViewDescriptor viewDescriptor = new ViewDescriptor(
					new EObjectAdapter(newStructuredComponent), Node.class,
					((IHintedType) elementType).getSemanticHint(), true,
					diagramEditPart.getDiagramPreferencesHint());
			viewDescriptor.setPersisted(true);

			CreateViewRequest createViewRequest = new CreateViewRequest(
					viewDescriptor);
			Command cmd = diagramEditPart.getCommand(createViewRequest);

			diagramEditPart.getDiagramEditDomain().getDiagramCommandStack()
					.execute(cmd);
		}
	}

}
