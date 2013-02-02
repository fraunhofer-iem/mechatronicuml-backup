package de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationProtocolCoordinationPatternContainerCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationProtocolCoordinationPatternContainerCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocol_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocol_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.commands.CoordinationProtocol2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.Role_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
