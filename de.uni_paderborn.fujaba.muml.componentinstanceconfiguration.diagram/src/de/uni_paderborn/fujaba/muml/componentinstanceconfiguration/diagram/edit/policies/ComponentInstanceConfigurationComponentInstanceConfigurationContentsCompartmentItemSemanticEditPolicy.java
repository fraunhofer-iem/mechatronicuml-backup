package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_3024 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.AtomicComponentInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.StructuredComponentInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_3035 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.CoordinationProtocolInstance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
