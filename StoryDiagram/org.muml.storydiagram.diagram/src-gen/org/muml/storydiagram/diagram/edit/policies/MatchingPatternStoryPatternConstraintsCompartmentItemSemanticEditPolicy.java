package org.muml.storydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.diagram.edit.commands.Constraint2CreateCommand;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class MatchingPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.MatchingPattern_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.Constraint_3006 == req.getElementType()) {
			return getGEFWrapper(new Constraint2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
