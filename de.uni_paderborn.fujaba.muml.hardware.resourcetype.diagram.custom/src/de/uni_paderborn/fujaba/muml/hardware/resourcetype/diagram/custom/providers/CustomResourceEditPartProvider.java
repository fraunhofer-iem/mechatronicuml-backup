package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.custom.parts.CustomResourceEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareEditPartProvider;

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
