package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.commands.CoordinationProtocol2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.Role_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
