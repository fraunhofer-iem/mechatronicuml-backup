package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageInterface_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageType_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.commands.MessageTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
