package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationPatternPatternCompartmentItemSemanticEditPolicy
		extends org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CoordinationPatternPatternCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_3003 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.CoordinationPattern2CreateCommand(
							req));
		}
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.Role_3002 == req.getElementType()) {
			return getGEFWrapper(new org.muml.pim.pattern.diagram.edit.commands.RoleCreateCommand(req));
		}
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.MessageBufferCreateCommand(req));
		}
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
