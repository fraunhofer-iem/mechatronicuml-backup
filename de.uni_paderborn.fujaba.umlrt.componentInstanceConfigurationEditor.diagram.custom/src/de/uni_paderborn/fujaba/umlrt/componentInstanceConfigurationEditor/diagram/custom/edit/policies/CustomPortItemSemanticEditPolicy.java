package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.PortEditPart;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.policies.PortItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands.CustomConnectorInstanceCreateCommand;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands.CustomConnectorInstanceReorientCommand;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;

/**
 * A customized PortItemSemanticEditPolicy. We create our customized
 * ConnectorInstance command here.
 * 
 * @author bingo
 * 
 */
public class CustomPortItemSemanticEditPolicy extends
		PortItemSemanticEditPolicy {

	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {

		if (ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001 == req
				.getElementType()) {

			return getGEFWrapper(getConnectorInstanceCreateCommand(req));
		}

		return super.getCreateRelationshipCommand(req);
	}

	@Override
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {

		switch (getVisualID(req)) {
		case de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.parts.ConnectorInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(getConnectorInstanceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Creates a CustomConnectorInstanceCreateCommand.
	 * 
	 * @param req
	 *            The Request, which should also contain values for Parameters
	 *            SOURCE_PORT_EDITPART_KEY, TARGET_PORT_EDITPART_KEY, if
	 *            available.
	 * @return the CustomConnectorInstanceCreateCommand.
	 */
	private CustomConnectorInstanceCreateCommand getConnectorInstanceCreateCommand(
			CreateRelationshipRequest req) {
		ComponentInstance sourceComponentInstance = null;
		ComponentInstance targetComponentInstance = null;
		Port sourcePort = null;
		Port targetPort = null;

		if (req.getSource() instanceof Port) {
			sourcePort = (Port) req.getSource();
		}
		if (req.getTarget() instanceof Port) {
			targetPort = (Port) req.getTarget();
		}
		Object sourceEditPart = req.getParameter("SOURCE_PORT_EDITPART");
		Object targetEditPart = req.getParameter("TARGET_PORT_EDITPART");

		// Now get the parent elements
		if (sourceEditPart instanceof PortEditPart) {
			sourceComponentInstance = (ComponentInstance) getParentElement((EditPart) sourceEditPart);
		}
		if (targetEditPart instanceof PortEditPart) {
			targetComponentInstance = (ComponentInstance) getParentElement((EditPart) targetEditPart);
		}

		return new CustomConnectorInstanceCreateCommand(req, sourcePort,
				targetPort, sourceComponentInstance, targetComponentInstance);
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

		return null;
	}

	private ICommand getConnectorInstanceReorientCommand(
			ReorientRelationshipRequest req) {

		ComponentInstance newComponentInstance = null;

		EObject parentElement = getParentElement(getHost());
		if (parentElement instanceof ComponentInstance) {
			newComponentInstance = (ComponentInstance) parentElement;
		}

		ConnectorInstance connector = (ConnectorInstance) req.getRelationship();
		ComponentInstance sourceComponentInstance = connector
				.getFromComponentI();
		ComponentInstance targetComponentInstance = connector.getToComponentI();

		switch (req.getDirection()) {
		case ReorientRequest.REORIENT_SOURCE:
			sourceComponentInstance = newComponentInstance;
			break;
		case ReorientRequest.REORIENT_TARGET:
			targetComponentInstance = newComponentInstance;
			break;
		}

		return new CustomConnectorInstanceReorientCommand(req,
				sourceComponentInstance, targetComponentInstance);
	}

}
