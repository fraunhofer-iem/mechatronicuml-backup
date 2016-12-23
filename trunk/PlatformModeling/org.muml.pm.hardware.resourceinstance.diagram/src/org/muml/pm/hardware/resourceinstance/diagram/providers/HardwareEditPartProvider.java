package org.muml.pm.hardware.resourceinstance.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HardwareEditPartFactory;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public HardwareEditPartProvider() {
		super(new HardwareEditPartFactory(), HardwareVisualIDRegistry.TYPED_INSTANCE,
				ResourceInstanceRepositoryEditPart.MODEL_ID);
	}

}
