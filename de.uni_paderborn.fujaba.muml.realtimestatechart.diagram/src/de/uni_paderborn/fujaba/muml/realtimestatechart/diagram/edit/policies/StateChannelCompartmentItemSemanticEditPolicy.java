package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateChannelCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateChannelCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.State_3032);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.commands.SynchronizationChannelCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
