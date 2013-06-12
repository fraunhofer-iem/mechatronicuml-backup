package de.uni_paderborn.fujaba.muml.deployment.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.deployment.diagram.custom.edit.parts.CustomMumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationEditPartProvider;;

public class CustomMumlEditPartProvider extends AllocationEditPartProvider {

	public CustomMumlEditPartProvider() {
		setFactory(new CustomMumlEditPartFactory());
		setAllowCaching(true);
	}

}
