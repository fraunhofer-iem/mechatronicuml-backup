package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy extends
		org.muml.pm.hardware.resource.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3012 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.CommunicationResource2CreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Cache_3013 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.CacheCreateCommand(req));
		}
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3014 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.ProcessorCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3015 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.ProgrammableLogicDeviceCreateCommand(
							req));
		}
		if (org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.MemoryResource_3016 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pm.hardware.resource.diagram.edit.commands.MemoryResourceCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
