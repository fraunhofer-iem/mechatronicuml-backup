package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartProvider extends
		StructuredcomponentEditPartProvider {

	public CustomStructuredcomponentEditPartProvider() {
		setFactory(new CustomStructuredcomponentEditPartFactory());
		setAllowCaching(true);
	}

}
