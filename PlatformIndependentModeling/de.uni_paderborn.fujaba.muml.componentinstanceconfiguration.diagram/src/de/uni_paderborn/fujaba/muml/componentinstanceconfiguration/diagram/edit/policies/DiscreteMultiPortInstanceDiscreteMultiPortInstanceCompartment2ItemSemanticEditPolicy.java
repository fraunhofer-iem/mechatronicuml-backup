package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
