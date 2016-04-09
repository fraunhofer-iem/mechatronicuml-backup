package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.pattern.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand;
import org.muml.pim.pattern.diagram.edit.commands.CoordinationPatternVariant2CreateCommand;
import org.muml.pim.pattern.diagram.edit.commands.MessageBufferCreateCommand;
import org.muml.pim.pattern.diagram.edit.commands.RoleCreateCommand;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class CoordinationPatternVariantCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CoordinationPatternVariantCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.CoordinationPatternVariant_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.CoordinationPatternVariant_3008 == req.getElementType()) {
			return getGEFWrapper(new CoordinationPatternVariant2CreateCommand(req));
		}
		if (MumlElementTypes.Role_3002 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (MumlElementTypes.MessageBuffer_3004 == req.getElementType()) {
			return getGEFWrapper(new MessageBufferCreateCommand(req));
		}
		if (MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007 == req.getElementType()) {
			return getGEFWrapper(new ConnectorQualityOfServiceAssumptionsCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
