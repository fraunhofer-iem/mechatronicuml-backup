package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.CollectionVariableCreateCommand(
					req));
		}
		if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.ObjectVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
