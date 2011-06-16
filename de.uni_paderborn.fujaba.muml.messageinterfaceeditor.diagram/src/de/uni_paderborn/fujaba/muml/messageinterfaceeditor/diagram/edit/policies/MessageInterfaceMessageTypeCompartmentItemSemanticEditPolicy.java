package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInterfaceMessageTypeCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterface_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageType_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.commands.MessageTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
