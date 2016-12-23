package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.ComponentVariable2CreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class ComponentStoryPatternComponentStoryPatternCompartment2ItemSemanticEditPolicy
		extends ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStoryPatternComponentStoryPatternCompartment2ItemSemanticEditPolicy() {
		super(ComponentStoryDiagramElementTypes.ComponentStoryPattern_3022);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentStoryDiagramElementTypes.ComponentVariable_3023 == req.getElementType()) {
			return getGEFWrapper(new ComponentVariable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
