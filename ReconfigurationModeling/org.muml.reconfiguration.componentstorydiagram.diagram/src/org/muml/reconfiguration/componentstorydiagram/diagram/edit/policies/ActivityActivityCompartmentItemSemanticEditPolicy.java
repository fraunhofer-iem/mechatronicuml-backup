package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActivityActivityCompartmentItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityActivityCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentStoryNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.InitialNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.JunctionNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ActivityFinalNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ControllerExchangeNodeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
