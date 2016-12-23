package org.muml.testlanguage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.testlanguage.diagram.edit.commands.InputCreateCommand;
import org.muml.testlanguage.diagram.edit.commands.OutputCreateCommand;
import org.muml.testlanguage.diagram.providers.TestLanguageElementTypes;

/**
 * @generated
 */
public class NodeNodeFigureCompartmentItemSemanticEditPolicy extends TestLanguageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeNodeFigureCompartmentItemSemanticEditPolicy() {
		super(TestLanguageElementTypes.Node_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TestLanguageElementTypes.Input_3001 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (TestLanguageElementTypes.Output_3002 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
