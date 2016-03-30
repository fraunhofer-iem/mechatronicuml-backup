package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class LinkVariableItemSemanticEditPolicy
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkVariableItemSemanticEditPolicy() {
		super(
				org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
