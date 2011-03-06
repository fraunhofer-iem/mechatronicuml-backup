package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomAssemblyCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomDelegationCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.PortItemSemanticEditPolicy;

/**
 * A customized PortItemSemanticEditPolicy. We create our customized Delegation
 * and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */
public class CustomPortItemSemanticEditPolicy extends
		PortItemSemanticEditPolicy {

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
			EObject parentElement = getParentElement(editPart);
			if (parentElement instanceof StructuredComponent) {
				structuredComponent = (StructuredComponent) parentElement;
			} else if (parentElement instanceof ComponentPart) {
				componentPart = (ComponentPart) parentElement;
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
	 *            SOURCE_PORT_EDITPART_KEY, TARGET_PORT_EDITPART_KEY, if
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

		// Now get the parent elements
		Object sourceEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.SOURCE_PORT_EDITPART_KEY);
		if (sourceEditPart instanceof EditPart) {
			EObject sourceParentElement = getParentElement((EditPart) sourceEditPart);
			if (sourceParentElement instanceof ComponentPart) {
				sourceComponentPart = (ComponentPart) sourceParentElement;
			}
		}

		Object targetEditPart = req
				.getParameter(CustomPortGraphicalNodeEditPolicy.TARGET_PORT_EDITPART_KEY);
		if (targetEditPart instanceof EditPart) {
			EObject targetParentElement = getParentElement((EditPart) targetEditPart);
			if (targetParentElement instanceof ComponentPart) {
				targetComponentPart = (ComponentPart) targetParentElement;
			}
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

	public Command getCreateRelationshipCommand(CreateRelationshipRequest req) {

		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Delegation_4001 == req
				.getElementType()) {
			return getGEFWrapper(getDelegationCreateCommand(req));
		}
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Assembly_4002 == req
				.getElementType()) {
			return getGEFWrapper(getAssemblyCreateCommand(req));
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * Deleting a PartPort also deletes the Port on Type-Layer. So we forbid
	 * deleting this model element; instead only the view object will be
	 * deleted.
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		if (getParentElement(getHost()) instanceof ComponentPart) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getDestroyElementCommand(req);
	}

}
