package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.policies;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.policies.PortItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.commands.CustomConnectorInstanceCreateCommand;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts.CustomPortEditPart;

public class CustomPortItemSemanticEditPolicy extends
		PortItemSemanticEditPolicy {

	CustomPortEditPart portEditPart;
	/**
	 * @generated
	 */
	public CustomPortItemSemanticEditPolicy(CustomPortEditPart p) {
		super();
		
		portEditPart=p;
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001 == req
				.getElementType()) {
			return getGEFWrapper(new CustomConnectorInstanceCreateCommand(
					req,portEditPart, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001 == req
				.getElementType()) {
			return getGEFWrapper(new CustomConnectorInstanceCreateCommand(
					req,portEditPart, req.getSource(), req.getTarget()));
		}
		return null;
	}
}
