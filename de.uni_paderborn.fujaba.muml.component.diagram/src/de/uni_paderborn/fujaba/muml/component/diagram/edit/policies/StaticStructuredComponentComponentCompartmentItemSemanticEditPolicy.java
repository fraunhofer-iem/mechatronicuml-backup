package de.uni_paderborn.fujaba.muml.component.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.StaticStructuredComponent_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ComponentPart_3012 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.component.diagram.edit.commands.ComponentPartCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.CoordinationProtocolOccurrence_3016 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.component.diagram.edit.commands.CoordinationProtocolCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
