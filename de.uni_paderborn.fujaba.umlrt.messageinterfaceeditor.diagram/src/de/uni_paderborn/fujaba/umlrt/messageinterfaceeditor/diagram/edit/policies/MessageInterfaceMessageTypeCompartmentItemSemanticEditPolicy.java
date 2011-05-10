package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies.MessageinterfaceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MessageinterfaceElementTypes.MessageInterface_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MessageinterfaceElementTypes.MessageType_3001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.commands.MessageTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
