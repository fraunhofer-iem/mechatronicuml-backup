package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ConnectorInstanceItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.edit.policies.ComponentInstanceConfigurationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorInstanceItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationElementTypes.ConnectorInstance_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
