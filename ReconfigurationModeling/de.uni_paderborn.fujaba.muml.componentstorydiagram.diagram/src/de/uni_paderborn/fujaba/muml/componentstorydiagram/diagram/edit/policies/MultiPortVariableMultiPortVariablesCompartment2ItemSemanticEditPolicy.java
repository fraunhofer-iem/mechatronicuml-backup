package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MultiPortVariableMultiPortVariablesCompartment2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MultiPortVariableMultiPortVariablesCompartment2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.commands.SinglePortVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
