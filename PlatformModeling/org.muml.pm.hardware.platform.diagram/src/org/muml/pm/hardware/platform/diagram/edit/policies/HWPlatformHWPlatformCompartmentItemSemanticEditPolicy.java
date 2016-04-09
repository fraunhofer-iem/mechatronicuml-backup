package org.muml.pm.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.platform.diagram.edit.commands.BusCreateCommand;
import org.muml.pm.hardware.platform.diagram.edit.commands.HWPlatformPartCreateCommand;
import org.muml.pm.hardware.platform.diagram.edit.commands.NetworkBridgeCreateCommand;
import org.muml.pm.hardware.platform.diagram.edit.commands.ResourcePartCreateCommand;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HWPlatformHWPlatformCompartmentItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformHWPlatformCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.HWPlatform_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.Bus_3025 == req.getElementType()) {
			return getGEFWrapper(new BusCreateCommand(req));
		}
		if (HardwareElementTypes.NetworkBridge_3026 == req.getElementType()) {
			return getGEFWrapper(new NetworkBridgeCreateCommand(req));
		}
		if (HardwareElementTypes.HWPlatformPart_3027 == req.getElementType()) {
			return getGEFWrapper(new HWPlatformPartCreateCommand(req));
		}
		if (HardwareElementTypes.ResourcePart_3030 == req.getElementType()) {
			return getGEFWrapper(new ResourcePartCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
