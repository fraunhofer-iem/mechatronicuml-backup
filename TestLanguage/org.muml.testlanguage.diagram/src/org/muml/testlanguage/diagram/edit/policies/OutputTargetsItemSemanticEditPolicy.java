package org.muml.testlanguage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class OutputTargetsItemSemanticEditPolicy
		extends
		org.muml.testlanguage.diagram.edit.policies.TestLanguageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputTargetsItemSemanticEditPolicy() {
		super(
				org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
