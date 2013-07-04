package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RealtimeStatechartStatechartContentsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RealtimeStatechartStatechartContentsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.State_3032 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.commands.StateCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
