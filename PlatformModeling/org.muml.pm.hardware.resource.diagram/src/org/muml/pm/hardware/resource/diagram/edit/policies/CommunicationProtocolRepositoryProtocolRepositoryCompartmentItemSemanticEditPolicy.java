package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.resource.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommunicationProtocolRepositoryProtocolRepositoryCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3017 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.BusProtocolCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3018 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.LinkProtocolCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
