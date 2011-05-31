package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateRegionCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateRegionCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.State_2020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.Region_3030 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.RegionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
