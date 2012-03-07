package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateRegionCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateRegionCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Region_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.RegionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
