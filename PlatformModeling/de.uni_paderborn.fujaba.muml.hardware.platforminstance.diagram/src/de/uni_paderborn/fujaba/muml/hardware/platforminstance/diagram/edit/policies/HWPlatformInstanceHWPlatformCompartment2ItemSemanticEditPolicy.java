package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWPlatformInstanceHWPlatformCompartment2ItemSemanticEditPolicy extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWPlatformInstanceHWPlatformCompartment2ItemSemanticEditPolicy() {
		super(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3040);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3039 == req
				.getElementType()) {
			return getGEFWrapper(
					new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.commands.HWPlatformInstanceConfigurationCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
