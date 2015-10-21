package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageBufferMessageBufferCompartmentItemSemanticEditPolicy
		extends de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageBufferMessageBufferCompartmentItemSemanticEditPolicy() {
		super(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageType_3005 == req
				.getElementType()) {
			return getGEFWrapper(
					new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.MessageTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
