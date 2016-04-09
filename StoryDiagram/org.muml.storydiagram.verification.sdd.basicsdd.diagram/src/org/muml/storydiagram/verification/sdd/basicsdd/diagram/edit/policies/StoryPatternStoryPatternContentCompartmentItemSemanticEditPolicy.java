package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.CollectionVariableCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.ObjectVariableCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy
		extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.StoryPattern_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BasicSDDElementTypes.CollectionVariable_3006 == req.getElementType()) {
			return getGEFWrapper(new CollectionVariableCreateCommand(req));
		}
		if (BasicSDDElementTypes.ObjectVariable_3009 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
