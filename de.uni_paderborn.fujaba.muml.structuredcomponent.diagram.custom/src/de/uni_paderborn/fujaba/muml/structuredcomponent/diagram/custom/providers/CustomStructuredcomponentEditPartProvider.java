package de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;
import de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.providers.MumlEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartProvider extends
		MumlEditPartProvider {

	public CustomStructuredcomponentEditPartProvider() {
		setFactory(new CustomStructuredcomponentEditPartFactory());
		setAllowCaching(true);
	}

}
