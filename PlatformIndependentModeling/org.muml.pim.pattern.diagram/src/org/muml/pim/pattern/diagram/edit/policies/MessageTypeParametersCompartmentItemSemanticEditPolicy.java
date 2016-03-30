package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeParametersCompartmentItemSemanticEditPolicy
		extends org.muml.pim.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MessageTypeParametersCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.pattern.diagram.providers.MumlElementTypes.MessageType_3005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.pattern.diagram.providers.MumlElementTypes.Parameter_3006 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.pattern.diagram.edit.commands.ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
