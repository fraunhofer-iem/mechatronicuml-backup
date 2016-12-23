package org.muml.pm.hardware.platforminstance.diagram.custom.providers;

import org.muml.pm.hardware.platforminstance.diagram.custom.parts.CustomPlatformInstanceEditPartFactory;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareEditPartProvider;

public class CustomPlatformInstanceEditPartProvider extends HardwareEditPartProvider{

	
	public CustomPlatformInstanceEditPartProvider(){
		setFactory(new CustomPlatformInstanceEditPartFactory());
		setAllowCaching(true);
	}
}
