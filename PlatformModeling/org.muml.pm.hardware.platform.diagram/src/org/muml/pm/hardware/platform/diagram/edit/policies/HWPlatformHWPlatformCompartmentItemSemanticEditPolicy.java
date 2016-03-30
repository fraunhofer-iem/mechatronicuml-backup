package org.muml.pm.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformHWPlatformCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformHWPlatformCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platform.diagram.edit.commands.BusCreateCommand(req));
		}
		if (org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platform.diagram.edit.commands.NetworkBridgeCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platform.diagram.edit.commands.HWPlatformPartCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.platform.diagram.edit.commands.ResourcePartCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
