package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.StoryPatternCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
