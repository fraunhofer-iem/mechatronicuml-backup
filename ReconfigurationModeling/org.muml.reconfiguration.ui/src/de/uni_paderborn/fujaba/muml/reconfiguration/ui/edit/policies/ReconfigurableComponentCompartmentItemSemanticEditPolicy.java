package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ReconfigurableComponentCompartmentItemSemanticEditPolicy
		extends
		org.muml.pim.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ReconfigurableComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableStructuredComponent_2076);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.component.diagram.providers.MumlElementTypes.ComponentPart_3012 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.pim.component.diagram.edit.commands.ComponentPartCreateCommand(
					req));
		}
		if (org.muml.pim.component.diagram.providers.MumlElementTypes.CoordinationProtocolPart_3016 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.pim.component.diagram.edit.commands.CoordinationProtocolPartCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
