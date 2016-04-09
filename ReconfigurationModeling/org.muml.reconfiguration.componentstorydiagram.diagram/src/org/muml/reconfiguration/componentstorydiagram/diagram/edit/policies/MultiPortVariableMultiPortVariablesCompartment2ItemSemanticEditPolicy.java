package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.SinglePortVariableCreateCommand;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;

/**
 * @generated
 */
public class MultiPortVariableMultiPortVariablesCompartment2ItemSemanticEditPolicy
		extends ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MultiPortVariableMultiPortVariablesCompartment2ItemSemanticEditPolicy() {
		super(ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentStoryDiagramElementTypes.SinglePortVariable_3017 == req.getElementType()) {
			return getGEFWrapper(new SinglePortVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
