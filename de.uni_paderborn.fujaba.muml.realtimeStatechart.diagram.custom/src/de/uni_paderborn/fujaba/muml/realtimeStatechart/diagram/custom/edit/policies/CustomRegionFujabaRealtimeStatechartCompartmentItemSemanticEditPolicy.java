package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.RegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy;

/**
 * @generated
 */
public class CustomRegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy
		extends
		RegionFujabaRealtimeStatechartCompartmentItemSemanticEditPolicy {

	protected Command getCreateCommand(CreateElementRequest req) {
		Region region = (Region) req.getContainer();
		if (region.getStatechart() == null) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getCreateCommand(req);
	}

}
