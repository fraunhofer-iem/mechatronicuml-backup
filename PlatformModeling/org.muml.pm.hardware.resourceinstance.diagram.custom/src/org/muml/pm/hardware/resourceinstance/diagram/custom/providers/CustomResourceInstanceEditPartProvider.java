package org.muml.pm.hardware.resourceinstance.diagram.custom.providers;

import org.muml.pm.hardware.resourceinstance.diagram.custom.parts.CustomResourceInstanceEditPartFactory;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceEditPartProvider extends HardwareEditPartProvider{
	
	
	public CustomResourceInstanceEditPartProvider(){
		setFactory(new CustomResourceInstanceEditPartFactory());
		setAllowCaching(true);
	}

}
