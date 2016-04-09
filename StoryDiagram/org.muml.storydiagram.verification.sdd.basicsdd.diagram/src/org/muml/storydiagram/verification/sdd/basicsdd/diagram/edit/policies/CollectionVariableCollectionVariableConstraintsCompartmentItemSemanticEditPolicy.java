package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.ConstraintCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy
		extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableConstraintsCompartmentItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.CollectionVariable_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BasicSDDElementTypes.Constraint_3008 == req.getElementType()) {
			return getGEFWrapper(new ConstraintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
