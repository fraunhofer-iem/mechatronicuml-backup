package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredComponentInstanceComponentInstanceContentsCompartment2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredComponentInstanceComponentInstanceContentsCompartment2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.ComponentInstanceConfigurationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
