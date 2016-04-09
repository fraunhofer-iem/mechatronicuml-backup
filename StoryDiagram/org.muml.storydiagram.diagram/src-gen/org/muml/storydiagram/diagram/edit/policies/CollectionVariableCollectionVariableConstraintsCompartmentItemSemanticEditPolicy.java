package org.muml.storydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.diagram.edit.commands.ConstraintCreateCommand;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.CollectionVariable_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.Constraint_3004 == req.getElementType()) {
			return getGEFWrapper(new ConstraintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
