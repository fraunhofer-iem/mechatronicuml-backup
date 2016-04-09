package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.StoryPatternCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy
		extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.StoryPatternNode_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BasicSDDElementTypes.StoryPattern_3011 == req.getElementType()) {
			return getGEFWrapper(new StoryPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
