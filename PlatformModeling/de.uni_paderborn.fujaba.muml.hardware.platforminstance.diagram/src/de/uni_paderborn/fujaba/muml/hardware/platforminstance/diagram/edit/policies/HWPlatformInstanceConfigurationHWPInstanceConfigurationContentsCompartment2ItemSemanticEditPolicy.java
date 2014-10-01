package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartment2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3032);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3031 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.HWPlatformInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3033 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.StructuredResourceInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3034 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.ActuatorInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3035 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.SensorInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.BusInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.BridgeInstanceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
