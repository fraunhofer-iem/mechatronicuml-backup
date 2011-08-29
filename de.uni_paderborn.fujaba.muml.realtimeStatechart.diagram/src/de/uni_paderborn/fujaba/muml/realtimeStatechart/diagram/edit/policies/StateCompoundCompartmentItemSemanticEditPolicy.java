package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateCompoundCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateCompoundCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryEvent_3001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.EntryEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.DoEvent_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.DoEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitEvent_3003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.ExitEventCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ClockConstraint_3004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.ClockConstraintCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.SynchronizationChannelCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
