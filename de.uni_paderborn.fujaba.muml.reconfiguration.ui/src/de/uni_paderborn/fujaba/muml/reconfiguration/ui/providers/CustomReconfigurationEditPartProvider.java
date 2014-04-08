package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;

import de.uni_paderborn.fujaba.muml.component.diagram.custom.providers.CustomStructuredcomponentEditPartProvider;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.CustomReconfigurationEditPartFactory;

public class CustomReconfigurationEditPartProvider 
		extends CustomStructuredcomponentEditPartProvider{
	
	public CustomReconfigurationEditPartProvider() {
		setFactory(new CustomReconfigurationEditPartFactory());
		setAllowCaching(true);
	}

}
