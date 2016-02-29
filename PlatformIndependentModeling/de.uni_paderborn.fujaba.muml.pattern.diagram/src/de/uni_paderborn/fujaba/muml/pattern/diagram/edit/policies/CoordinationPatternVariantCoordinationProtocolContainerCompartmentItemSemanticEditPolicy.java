package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationPatternVariantCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CoordinationPatternVariantCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_3008 == req
				.getElementType()) {
			return getGEFWrapper(
					new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.CoordinationPatternVariant2CreateCommand(
							req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002 == req.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.RoleCreateCommand(req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004 == req
				.getElementType()) {
			return getGEFWrapper(
					new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.MessageBufferCreateCommand(req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007 == req
				.getElementType()) {
			return getGEFWrapper(
					new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
