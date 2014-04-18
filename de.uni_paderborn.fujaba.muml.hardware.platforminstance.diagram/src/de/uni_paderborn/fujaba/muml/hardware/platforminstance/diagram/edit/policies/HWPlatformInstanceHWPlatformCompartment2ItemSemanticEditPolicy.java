package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformInstanceHWPlatformCompartment2ItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceHWPlatformCompartment2ItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3016 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.StructuredResourceInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.HWPlatformInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3024 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.ActuatorInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3025 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.SensorInstanceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
