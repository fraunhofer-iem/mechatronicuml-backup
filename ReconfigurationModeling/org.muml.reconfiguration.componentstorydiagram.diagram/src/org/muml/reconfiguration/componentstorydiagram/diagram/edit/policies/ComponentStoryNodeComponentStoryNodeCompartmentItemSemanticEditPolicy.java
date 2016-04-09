package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentStoryPatternCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy
		extends ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStoryNodeComponentStoryNodeCompartmentItemSemanticEditPolicy() {
		super(ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentStoryDiagramElementTypes.ComponentStoryPattern_3011 == req.getElementType()) {
			return getGEFWrapper(new ComponentStoryPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
