package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeRepositoryMessageTypesCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageTypeRepositoryMessageTypesCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageTypeRepository_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.commands.MessageTypeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
