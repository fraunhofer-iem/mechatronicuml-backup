package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ReconfigurationPortAssemblyConnectorItemSemanticEditPolicy
		extends
		org.muml.pim.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ReconfigurationPortAssemblyConnectorItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurationPortAssemblyConnector_4075);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
