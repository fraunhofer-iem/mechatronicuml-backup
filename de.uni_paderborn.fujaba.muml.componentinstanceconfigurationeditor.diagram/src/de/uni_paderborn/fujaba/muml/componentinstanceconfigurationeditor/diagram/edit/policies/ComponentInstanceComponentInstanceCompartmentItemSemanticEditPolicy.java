package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentInstanceComponentInstanceCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceComponentInstanceCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstance_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3015 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.ComponentInstanceConfigurationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
