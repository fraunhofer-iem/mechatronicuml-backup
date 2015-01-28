package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeParametersCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.PatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageTypeParametersCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.MessageType_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.Parameter_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.ParameterCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
