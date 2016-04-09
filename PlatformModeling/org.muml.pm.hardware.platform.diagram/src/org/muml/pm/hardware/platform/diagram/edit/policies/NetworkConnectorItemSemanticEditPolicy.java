package org.muml.pm.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class NetworkConnectorItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NetworkConnectorItemSemanticEditPolicy() {
		super(HardwareElementTypes.NetworkConnector_4032);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
