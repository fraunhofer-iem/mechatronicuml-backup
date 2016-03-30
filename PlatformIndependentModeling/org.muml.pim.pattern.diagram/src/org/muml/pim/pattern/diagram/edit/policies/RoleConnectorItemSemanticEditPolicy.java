package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

/**
 * @generated
 */
public class RoleConnectorItemSemanticEditPolicy
		extends org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RoleConnectorItemSemanticEditPolicy() {
		super(org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.RoleConnectorConnectorQualityOfServiceAssumptionsCreateCommand(
							req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.RoleConnectorConnectorQualityOfServiceAssumptionsReorientCommand(
							req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
