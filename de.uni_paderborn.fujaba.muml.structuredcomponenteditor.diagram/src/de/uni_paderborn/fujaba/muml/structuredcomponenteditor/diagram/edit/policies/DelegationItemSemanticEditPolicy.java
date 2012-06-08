package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DelegationItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
