package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DelegationInstanceItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationInstanceItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
