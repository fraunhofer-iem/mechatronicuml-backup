package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pm.hardware.resource.diagram.edit.commands.CacheCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.CommunicationResource2CreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.MemoryResourceCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.ProcessorCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.ProgrammableLogicDeviceCreateCommand;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy
		extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(HardwareElementTypes.StructuredResource_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.CommunicationResource_3012 == req.getElementType()) {
			return getGEFWrapper(new CommunicationResource2CreateCommand(req));
		}
		if (HardwareElementTypes.Cache_3013 == req.getElementType()) {
			return getGEFWrapper(new CacheCreateCommand(req));
		}
		if (HardwareElementTypes.Processor_3014 == req.getElementType()) {
			return getGEFWrapper(new ProcessorCreateCommand(req));
		}
		if (HardwareElementTypes.ProgrammableLogicDevice_3015 == req.getElementType()) {
			return getGEFWrapper(new ProgrammableLogicDeviceCreateCommand(req));
		}
		if (HardwareElementTypes.MemoryResource_3016 == req.getElementType()) {
			return getGEFWrapper(new MemoryResourceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
