package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateActionsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateActionsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.EEActionCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.DoEvent_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.SynchroChannel2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.DoActionCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.ClockConstraint_3004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.SynchroChannelCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.SynchronizationChannel_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.commands.EEAction2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
