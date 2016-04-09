package org.muml.pm.hardware.platform.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public HardwareEditPartProvider() {
		super(new HardwareEditPartFactory(), HardwareVisualIDRegistry.TYPED_INSTANCE, HWPlatformEditPart.MODEL_ID);
	}

}
