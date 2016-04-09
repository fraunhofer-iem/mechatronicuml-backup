package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.Constraint2CreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class StoryPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy
		extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.StoryPattern_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BasicSDDElementTypes.Constraint_3010 == req.getElementType()) {
			return getGEFWrapper(new Constraint2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
