package de.uni_paderborn.fujaba.muml.deployment.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.deployment.diagram.custom.edit.parts.CustomMumlEditPartFactory;
import de.uni_paderborn.fujaba.muml.deployment.diagram.providers.MumlEditPartProvider;

public class CustomMumlEditPartProvider extends MumlEditPartProvider {

	public CustomMumlEditPartProvider() {
		setFactory(new CustomMumlEditPartFactory());
		setAllowCaching(true);
	}

}
