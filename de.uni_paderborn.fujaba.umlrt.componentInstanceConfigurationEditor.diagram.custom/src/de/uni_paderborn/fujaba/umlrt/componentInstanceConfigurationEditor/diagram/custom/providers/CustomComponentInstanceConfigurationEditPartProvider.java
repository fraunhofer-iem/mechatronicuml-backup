package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.providers.ComponentInstanceConfigurationEditPartProvider;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.edit.parts.CustomComponentInstanceConfigurationEditPartFactory;

/**
 * Our EditPartProvider, which uses our custom EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomComponentInstanceConfigurationEditPartProvider extends
		ComponentInstanceConfigurationEditPartProvider {

	public CustomComponentInstanceConfigurationEditPartProvider() {
		setFactory(new CustomComponentInstanceConfigurationEditPartFactory());
		setAllowCaching(true);
	}

}
