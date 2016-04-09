package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.ActuatorInstanceCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.BusInstanceCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.HWPlatformInstance2CreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.NetworkBridgeInstanceCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.SensorInstanceCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.edit.commands.StructuredResourceInstanceCreateCommand;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentItemSemanticEditPolicy
		extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.HWPlatformInstanceConfiguration_3039);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.HWPlatformInstance_3040 == req.getElementType()) {
			return getGEFWrapper(new HWPlatformInstance2CreateCommand(req));
		}
		if (HardwareElementTypes.StructuredResourceInstance_3042 == req.getElementType()) {
			return getGEFWrapper(new StructuredResourceInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.ActuatorInstance_3044 == req.getElementType()) {
			return getGEFWrapper(new ActuatorInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.SensorInstance_3045 == req.getElementType()) {
			return getGEFWrapper(new SensorInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.BusInstance_3046 == req.getElementType()) {
			return getGEFWrapper(new BusInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.NetworkBridgeInstance_3047 == req.getElementType()) {
			return getGEFWrapper(new NetworkBridgeInstanceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
