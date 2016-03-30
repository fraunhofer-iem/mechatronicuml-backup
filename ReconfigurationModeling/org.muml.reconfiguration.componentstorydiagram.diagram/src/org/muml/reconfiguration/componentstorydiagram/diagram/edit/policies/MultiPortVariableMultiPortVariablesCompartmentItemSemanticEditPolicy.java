package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MultiPortVariableMultiPortVariablesCompartmentItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MultiPortVariableMultiPortVariablesCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.SinglePortVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
