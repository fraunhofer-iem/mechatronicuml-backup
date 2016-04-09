package org.muml.testlanguage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.muml.testlanguage.diagram.providers.TestLanguageElementTypes;

/**
 * @generated
 */
public class OutputTargetsItemSemanticEditPolicy extends TestLanguageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputTargetsItemSemanticEditPolicy() {
		super(TestLanguageElementTypes.OutputTargets_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
