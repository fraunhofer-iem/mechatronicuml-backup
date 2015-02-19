package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.commands.CustomDiscreteSinglePortInstance2CreateCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy
		extends
		DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026 == req
				.getElementType()) {
			return getGEFWrapper(new CustomDiscreteSinglePortInstance2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
