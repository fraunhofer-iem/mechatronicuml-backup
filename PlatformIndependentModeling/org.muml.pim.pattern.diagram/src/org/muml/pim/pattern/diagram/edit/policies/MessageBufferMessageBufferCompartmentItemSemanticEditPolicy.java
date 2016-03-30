package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageBufferMessageBufferCompartmentItemSemanticEditPolicy
		extends org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MessageBufferMessageBufferCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.MessageType_3005 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.MessageTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
