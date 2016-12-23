package org.muml.reconfiguration.ui.providers;

import org.muml.pim.component.diagram.custom.providers.CustomStructuredcomponentEditPartProvider;
import org.muml.reconfiguration.ui.edit.parts.CustomReconfigurationEditPartFactory;

public class CustomReconfigurationEditPartProvider 
		extends CustomStructuredcomponentEditPartProvider{
	
	public CustomReconfigurationEditPartProvider() {
		setFactory(new CustomReconfigurationEditPartFactory());
		setAllowCaching(true);
	}

}
