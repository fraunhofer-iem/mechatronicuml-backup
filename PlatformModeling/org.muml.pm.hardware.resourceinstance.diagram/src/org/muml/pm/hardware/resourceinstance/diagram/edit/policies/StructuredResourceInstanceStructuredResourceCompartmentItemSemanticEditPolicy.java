package org.muml.pm.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3018 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resourceinstance.diagram.edit.commands.CacheInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3019 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProgrammableLogicDeviceInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3020 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProcessorInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3021 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ProcessingMemoryInstanceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3022 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resourceinstance.diagram.edit.commands.StorageMemoryInstanceCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
