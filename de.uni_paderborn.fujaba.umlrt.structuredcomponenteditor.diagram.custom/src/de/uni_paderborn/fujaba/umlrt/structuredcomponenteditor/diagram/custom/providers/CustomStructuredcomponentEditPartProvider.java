package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentEditPartProvider;

public class CustomStructuredcomponentEditPartProvider extends
		StructuredcomponentEditPartProvider {

	public CustomStructuredcomponentEditPartProvider() {
		setFactory(new CustomStructuredcomponentEditPartFactory());
		setAllowCaching(true);
	}

}
