package org.muml.pm.hardware.platform.diagram.custom.providers;

import org.muml.pm.hardware.platform.diagram.custom.parts.CustomPlatformEditPartFactory;
import org.muml.pm.hardware.platform.diagram.providers.HardwareEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author adann
 * 
 */
public class CustomPlatformEditPartProvider extends HardwareEditPartProvider {

	public CustomPlatformEditPartProvider() {
		setFactory(new CustomPlatformEditPartFactory());
		setAllowCaching(true);
	}

}
