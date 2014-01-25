package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryPattern_3022 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.commands.ComponentStoryPattern2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
