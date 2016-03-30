package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CollectionVariableCollectionVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CollectionVariableCollectionVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.AttributeAssignmentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
