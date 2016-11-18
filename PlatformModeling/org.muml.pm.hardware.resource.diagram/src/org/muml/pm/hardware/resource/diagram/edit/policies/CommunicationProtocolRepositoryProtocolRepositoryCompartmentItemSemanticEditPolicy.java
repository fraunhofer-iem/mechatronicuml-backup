package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.resource.diagram.edit.commands.BusProtocolCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.LinkProtocolCreateCommand;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy
		extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.CommunicationProtocolRepository_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.BusProtocol_3017 == req.getElementType()) {
			return getGEFWrapper(new BusProtocolCreateCommand(req));
		}
		if (HardwareElementTypes.LinkProtocol_3018 == req.getElementType()) {
			return getGEFWrapper(new LinkProtocolCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
