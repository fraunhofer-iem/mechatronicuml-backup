package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts.CustomPlatformEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareEditPartProvider;

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
