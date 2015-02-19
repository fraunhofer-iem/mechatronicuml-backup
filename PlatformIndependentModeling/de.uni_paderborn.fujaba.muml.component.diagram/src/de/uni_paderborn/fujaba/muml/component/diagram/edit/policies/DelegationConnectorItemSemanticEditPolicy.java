package de.uni_paderborn.fujaba.muml.component.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DelegationConnectorItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DelegationConnectorItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
