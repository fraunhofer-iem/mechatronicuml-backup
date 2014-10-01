package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3033);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.CacheInstance_3017 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.CacheInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3018 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.ProgrammableLogicDeviceInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3019 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.ProcessorInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3020 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.ProcessingMemoryInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3021 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.StorageMemoryInstanceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
