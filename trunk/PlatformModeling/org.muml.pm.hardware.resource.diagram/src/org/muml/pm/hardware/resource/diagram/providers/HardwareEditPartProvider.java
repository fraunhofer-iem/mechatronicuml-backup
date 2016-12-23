package org.muml.pm.hardware.resource.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pm.hardware.resource.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public HardwareEditPartProvider() {
		super(new HardwareEditPartFactory(), HardwareVisualIDRegistry.TYPED_INSTANCE,
				ResourceRepositoryEditPart.MODEL_ID);
	}

}
