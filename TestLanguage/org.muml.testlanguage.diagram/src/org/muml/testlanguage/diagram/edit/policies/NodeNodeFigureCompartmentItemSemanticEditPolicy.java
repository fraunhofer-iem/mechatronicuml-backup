package org.muml.testlanguage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class NodeNodeFigureCompartmentItemSemanticEditPolicy
		extends
		org.muml.testlanguage.diagram.edit.policies.TestLanguageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeNodeFigureCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.testlanguage.diagram.edit.commands.InputCreateCommand(
					req));
		}
		if (org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.testlanguage.diagram.edit.commands.OutputCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
