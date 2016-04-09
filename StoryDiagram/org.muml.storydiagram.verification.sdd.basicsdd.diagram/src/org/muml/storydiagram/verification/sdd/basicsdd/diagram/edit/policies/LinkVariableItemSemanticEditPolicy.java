package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class LinkVariableItemSemanticEditPolicy extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkVariableItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.LinkVariable_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
