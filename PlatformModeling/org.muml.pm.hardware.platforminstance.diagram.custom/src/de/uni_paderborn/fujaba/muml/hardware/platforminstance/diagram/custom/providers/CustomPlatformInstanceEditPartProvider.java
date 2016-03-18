package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.parts.CustomPlatformInstanceEditPartFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareEditPartProvider;

public class CustomPlatformInstanceEditPartProvider extends HardwareEditPartProvider{

	
	public CustomPlatformInstanceEditPartProvider(){
		setFactory(new CustomPlatformInstanceEditPartFactory());
		setAllowCaching(true);
	}
}
