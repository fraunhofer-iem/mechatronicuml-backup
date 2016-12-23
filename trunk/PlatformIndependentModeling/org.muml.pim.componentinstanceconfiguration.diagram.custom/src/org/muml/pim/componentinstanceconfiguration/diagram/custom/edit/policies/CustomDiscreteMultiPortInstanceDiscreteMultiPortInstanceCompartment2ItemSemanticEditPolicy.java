package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.commands.CustomDiscreteSinglePortInstance2CreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy;

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
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026 == req
				.getElementType()) {
			return getGEFWrapper(new CustomDiscreteSinglePortInstance2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
