package org.muml.storydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.diagram.edit.commands.CollectionVariableCreateCommand;
import org.muml.storydiagram.diagram.edit.commands.ObjectVariableCreateCommand;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.StoryPattern_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.CollectionVariable_3002 == req.getElementType()) {
			return getGEFWrapper(new CollectionVariableCreateCommand(req));
		}
		if (StorydiagramsElementTypes.ObjectVariable_3005 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
