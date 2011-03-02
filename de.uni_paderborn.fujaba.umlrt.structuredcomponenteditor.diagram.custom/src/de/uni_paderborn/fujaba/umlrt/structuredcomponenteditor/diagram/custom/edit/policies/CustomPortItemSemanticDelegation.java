package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomAssemblyCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomDelegationCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;

/**
 * This class contains all logic that is common between
 * CustomPortItemSemanticEditPolicy and CustomPort2ItemSemanticEditPolicy.
 * 
 * @author bingo
 */
public class CustomPortItemSemanticDelegation {

	public CustomDelegationCreateCommand getDelegationCreateCommand(
			CreateRelationshipRequest req) {

		ComponentPart componentPart = null;
		StructuredComponent structuredComponent = null;
		Port sourcePort = null;
		Port targetPort = null;

		if (req.getSource() instanceof Port) {
			sourcePort = (Port) req.getSource();
		}

		if (req.getTarget() instanceof Port) {
			targetPort = (Port) req.getTarget();
		}
		Object sourceEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.SOURCE_PORT_EDITPART_KEY);
		Object targetEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.TARGET_PORT_EDITPART_KEY);

		List<EditPart> editParts = new LinkedList<EditPart>();
		if (sourceEditPart instanceof EditPart) {
			editParts.add((EditPart) sourceEditPart);
		}
		if (targetEditPart instanceof EditPart) {
			editParts.add((EditPart) targetEditPart);
		}

		// Now get the parent elements
		for (EditPart editPart : editParts) {
			if (editPart instanceof PortEditPart) {
				structuredComponent = (StructuredComponent) getParentElement(editPart);
			} else if (editPart instanceof Port2EditPart) {
				componentPart = (ComponentPart) getParentElement(editPart);
			}
		}

		return new CustomDelegationCreateCommand(req, sourcePort, targetPort,
				componentPart, structuredComponent);
	}

	/**
	 * Creates a CustomAssemblyCreateCommand.
	 * 
	 * @param req
	 *            The Request, which should also contain values for Parameters
	 *            PARAMETER_SOURCE_EDITPART, PARAMETER_TARGET_EDITPART, if
	 *            available.
	 * @return the CustomAssemblyCreateCommand.
	 */
	public CustomAssemblyCreateCommand getAssemblyCreateCommand(
			CreateRelationshipRequest req) {
		ComponentPart sourceComponentPart = null;
		ComponentPart targetComponentPart = null;
		Port sourcePort = null;
		Port targetPort = null;

		if (req.getSource() instanceof Port) {
			sourcePort = (Port) req.getSource();
		}
		if (req.getTarget() instanceof Port) {
			targetPort = (Port) req.getTarget();
		}
		Object sourceEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.SOURCE_PORT_EDITPART_KEY);
		Object targetEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.TARGET_PORT_EDITPART_KEY);

		// Now get the parent elements
		if (sourceEditPart instanceof Port2EditPart) {
			sourceComponentPart = (ComponentPart) getParentElement((EditPart) sourceEditPart);
		}
		if (targetEditPart instanceof Port2EditPart) {
			targetComponentPart = (ComponentPart) getParentElement((EditPart) targetEditPart);
		}

		return new CustomAssemblyCreateCommand(req, sourcePort, targetPort,
				sourceComponentPart, targetComponentPart);
	}

	/**
	 * Retrieves the model element of the editPart's parent EditPart.
	 * 
	 * @param editPart
	 *            the editPart.
	 * @return the model element of the parent EditPart.
	 */
	private EObject getParentElement(EditPart editPart) {
		ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
				.getParent();
		return parentEditPart.getNotationView().getElement();
	}

	public EditElementCommand getCreateRelationshipCommand(
			CreateRelationshipRequest req, EditPart host) {

		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Delegation_4001 == req
				.getElementType()) {

			return getDelegationCreateCommand(req);
		}
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Assembly_4002 == req
				.getElementType()) {
			return getAssemblyCreateCommand(req);
		}
		return null;
	}

}
