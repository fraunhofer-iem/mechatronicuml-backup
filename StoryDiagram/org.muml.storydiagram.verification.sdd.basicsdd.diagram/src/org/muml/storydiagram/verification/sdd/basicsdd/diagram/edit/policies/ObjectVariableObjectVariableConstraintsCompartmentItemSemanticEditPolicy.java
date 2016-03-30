package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ObjectVariableObjectVariableConstraintsCompartmentItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectVariableObjectVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
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
