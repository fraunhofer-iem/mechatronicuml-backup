package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.commands.BusProtocolCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.commands.LinkProtocolCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
