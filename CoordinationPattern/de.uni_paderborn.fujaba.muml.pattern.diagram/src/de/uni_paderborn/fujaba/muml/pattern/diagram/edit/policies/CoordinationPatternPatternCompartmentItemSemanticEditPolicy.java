package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationPatternPatternCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationPatternPatternCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_3003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.CoordinationPattern2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.MessageBufferCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
