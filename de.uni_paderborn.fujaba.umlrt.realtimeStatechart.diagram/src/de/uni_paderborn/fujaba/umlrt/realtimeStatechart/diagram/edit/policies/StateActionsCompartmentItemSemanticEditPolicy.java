package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateActionsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateActionsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.State_2020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.EntryAction_3025 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.EntryActionCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.DoAction_3026 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.DoActionCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.ExitAction_3027 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ExitActionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
