package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredComponentInstanceComponentInstanceContentsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredComponentInstanceComponentInstanceContentsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.ComponentInstanceConfigurationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
