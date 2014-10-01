package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class LinkPartItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkPartItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
