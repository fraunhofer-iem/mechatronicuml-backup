package de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class CommunicationLinkItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.deployment.diagram.edit.policies.AllocationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommunicationLinkItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
