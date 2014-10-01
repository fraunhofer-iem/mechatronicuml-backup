package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts.CustomResourceInstanceEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareEditPartProvider;

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
