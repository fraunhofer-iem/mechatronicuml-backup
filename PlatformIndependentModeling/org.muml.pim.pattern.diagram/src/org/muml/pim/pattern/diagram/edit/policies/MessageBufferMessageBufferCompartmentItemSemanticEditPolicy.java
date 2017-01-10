package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.pattern.diagram.edit.commands.MessageTypeCreateCommand;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MessageBufferMessageBufferCompartmentItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MessageBufferMessageBufferCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.MessageBuffer_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.MessageType_3005 == req.getElementType()) {
			return getGEFWrapper(new MessageTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
