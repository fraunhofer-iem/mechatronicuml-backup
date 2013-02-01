package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ControllerExchangeNodeControllerExchangeNodeCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerExchangeNodeControllerExchangeNodeCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryPattern_3022 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.commands.ComponentStoryPattern2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
