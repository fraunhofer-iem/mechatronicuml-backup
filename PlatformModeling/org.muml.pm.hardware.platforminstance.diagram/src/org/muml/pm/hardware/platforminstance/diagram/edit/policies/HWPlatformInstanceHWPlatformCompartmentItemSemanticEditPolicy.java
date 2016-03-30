package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformInstanceHWPlatformCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceHWPlatformCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3039 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platforminstance.diagram.edit.commands.HWPlatformInstanceConfigurationCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
