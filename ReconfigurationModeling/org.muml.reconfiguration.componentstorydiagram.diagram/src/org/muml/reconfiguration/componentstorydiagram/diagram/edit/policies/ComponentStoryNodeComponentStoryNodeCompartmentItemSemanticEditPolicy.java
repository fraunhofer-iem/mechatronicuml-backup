package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryPattern_3011 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentStoryPatternCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
