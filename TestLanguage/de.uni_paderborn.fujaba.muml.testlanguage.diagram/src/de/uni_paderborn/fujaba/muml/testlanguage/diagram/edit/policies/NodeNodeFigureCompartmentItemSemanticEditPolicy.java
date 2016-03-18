package de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class NodeNodeFigureCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.policies.TestLanguageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeNodeFigureCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.commands.InputCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.commands.OutputCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
