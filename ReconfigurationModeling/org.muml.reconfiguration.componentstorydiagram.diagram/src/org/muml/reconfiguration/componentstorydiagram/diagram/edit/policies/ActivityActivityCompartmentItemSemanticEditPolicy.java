package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ActivityFinalNodeCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentStoryNodeCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ControllerExchangeNodeCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.InitialNodeCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.JunctionNodeCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class ActivityActivityCompartmentItemSemanticEditPolicy extends ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityActivityCompartmentItemSemanticEditPolicy() {
		super(ComponentStoryDiagramElementTypes.Activity_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentStoryDiagramElementTypes.ComponentStoryNode_3001 == req.getElementType()) {
			return getGEFWrapper(new ComponentStoryNodeCreateCommand(req));
		}
		if (ComponentStoryDiagramElementTypes.InitialNode_3007 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (ComponentStoryDiagramElementTypes.JunctionNode_3008 == req.getElementType()) {
			return getGEFWrapper(new JunctionNodeCreateCommand(req));
		}
		if (ComponentStoryDiagramElementTypes.ActivityFinalNode_3010 == req.getElementType()) {
			return getGEFWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		if (ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021 == req.getElementType()) {
			return getGEFWrapper(new ControllerExchangeNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
