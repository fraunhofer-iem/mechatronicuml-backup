package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateActionsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.RealtimeStatechartBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateActionsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.State_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.EntryEvent_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.EntryEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.DoEvent_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.DoEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.ExitEvent_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ExitEventCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
