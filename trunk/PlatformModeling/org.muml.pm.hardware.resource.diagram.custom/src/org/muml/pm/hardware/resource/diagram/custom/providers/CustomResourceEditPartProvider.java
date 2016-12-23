package org.muml.pm.hardware.resource.diagram.custom.providers;

import org.muml.pm.hardware.resource.diagram.custom.parts.CustomResourceEditPartFactory;
import org.muml.pm.hardware.resource.diagram.providers.HardwareEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author adann
 * 
 */
public class CustomResourceEditPartProvider extends HardwareEditPartProvider{
	
	public CustomResourceEditPartProvider() {
		setFactory(new CustomResourceEditPartFactory());
		setAllowCaching(true);
	}

}
