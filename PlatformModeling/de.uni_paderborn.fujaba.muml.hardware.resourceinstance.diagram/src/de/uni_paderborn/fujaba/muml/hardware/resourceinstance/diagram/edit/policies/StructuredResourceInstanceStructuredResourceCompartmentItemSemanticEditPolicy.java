package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3009 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands.CacheInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3010 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands.ProgrammableLogicDeviceInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3011 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands.ProcessorInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3012 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands.ProcessingMemoryInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3013 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.commands.StorageMemoryInstanceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
