package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeParametersCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageTypeParametersCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.Parameter_3008 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.commands.ParameterCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
