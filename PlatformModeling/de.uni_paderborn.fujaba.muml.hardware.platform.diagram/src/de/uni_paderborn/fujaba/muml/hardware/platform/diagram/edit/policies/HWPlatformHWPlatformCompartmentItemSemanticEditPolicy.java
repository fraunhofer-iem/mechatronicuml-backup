package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformHWPlatformCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformHWPlatformCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3023 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands.BusCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3024 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands.NetworkBridgeCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3016 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands.HWPlatformPartCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3019 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.commands.ResourcePartCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
