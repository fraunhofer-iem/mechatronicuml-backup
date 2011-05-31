package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateInvariantCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateInvariantCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.State_2020);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceElementTypes.ClockConstraint_3028 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ClockConstraintCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
