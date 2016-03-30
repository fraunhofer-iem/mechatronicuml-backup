package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3008 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.ConstraintCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
