package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentInstanceComponentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.policies.ComponentinstanceconfigurationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.commands.ComponentInstance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
