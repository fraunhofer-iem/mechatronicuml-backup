package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DelegationItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
