package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredResourceStructuredResourceCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.StructuredResource_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Cache_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.commands.CacheCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Processor_3003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.commands.ProcessorCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.commands.ProgrammableLogicDeviceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.MemoryResource_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.commands.MemoryResourceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
