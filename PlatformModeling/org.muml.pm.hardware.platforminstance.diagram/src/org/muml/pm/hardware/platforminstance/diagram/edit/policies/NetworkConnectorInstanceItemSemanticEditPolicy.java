package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class NetworkConnectorInstanceItemSemanticEditPolicy extends
		org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NetworkConnectorInstanceItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}