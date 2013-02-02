package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.FadingFunction_3023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.commands.FadingFunctionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
