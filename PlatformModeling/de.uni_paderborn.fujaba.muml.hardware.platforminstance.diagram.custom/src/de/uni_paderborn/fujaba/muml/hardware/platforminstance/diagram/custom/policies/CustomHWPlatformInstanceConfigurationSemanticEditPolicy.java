package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HWPlatformInstanceConfigurationItemSemanticEditPolicy;

public class CustomHWPlatformInstanceConfigurationSemanticEditPolicy extends HWPlatformInstanceConfigurationItemSemanticEditPolicy{
	
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
	if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_2004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.commands.HWPlatformInstanceCreateCommand(
					req));
		} 
		return super.getCreateCommand(req);
	}

}
