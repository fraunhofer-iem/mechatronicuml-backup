package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentStoryPattern2CreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy
		extends ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy() {
		super(ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentStoryDiagramElementTypes.ComponentStoryPattern_3022 == req.getElementType()) {
			return getGEFWrapper(new ComponentStoryPattern2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
