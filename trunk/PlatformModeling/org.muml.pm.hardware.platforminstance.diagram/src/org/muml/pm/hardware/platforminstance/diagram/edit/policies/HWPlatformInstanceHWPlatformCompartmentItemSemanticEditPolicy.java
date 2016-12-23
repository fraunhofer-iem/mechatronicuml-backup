package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.HWPlatformInstanceConfigurationCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HWPlatformInstanceHWPlatformCompartmentItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceHWPlatformCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.HWPlatformInstance_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.HWPlatformInstanceConfiguration_3039 == req.getElementType()) {
			return getGEFWrapper(new HWPlatformInstanceConfigurationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
