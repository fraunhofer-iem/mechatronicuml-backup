package org.muml.pm.hardware.platforminstance.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public HardwareEditPartProvider() {
		super(new HardwareEditPartFactory(), HardwareVisualIDRegistry.TYPED_INSTANCE,
				HWPlatformInstanceConfigurationEditPart.MODEL_ID);
	}

}
