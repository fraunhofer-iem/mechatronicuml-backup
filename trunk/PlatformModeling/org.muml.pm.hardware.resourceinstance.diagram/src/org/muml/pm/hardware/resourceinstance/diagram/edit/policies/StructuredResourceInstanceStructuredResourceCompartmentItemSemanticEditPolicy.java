package org.muml.pm.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.CacheInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProcessingMemoryInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProcessorInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProgrammableLogicDeviceInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.StorageMemoryInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy
		extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.StructuredResourceInstance_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.CacheInstance_3018 == req.getElementType()) {
			return getGEFWrapper(new CacheInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.ProgrammableLogicDeviceInstance_3019 == req.getElementType()) {
			return getGEFWrapper(new ProgrammableLogicDeviceInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.ProcessorInstance_3020 == req.getElementType()) {
			return getGEFWrapper(new ProcessorInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.ProcessingMemoryInstance_3021 == req.getElementType()) {
			return getGEFWrapper(new ProcessingMemoryInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.StorageMemoryInstance_3022 == req.getElementType()) {
			return getGEFWrapper(new StorageMemoryInstanceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
