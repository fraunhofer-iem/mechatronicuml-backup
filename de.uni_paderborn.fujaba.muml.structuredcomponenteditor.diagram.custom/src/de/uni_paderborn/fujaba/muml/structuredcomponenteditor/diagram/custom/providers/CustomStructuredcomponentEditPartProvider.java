package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts.CustomStaticStructuredcomponentEditPartFactory;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartProvider extends
		MumlEditPartProvider {

	public CustomStructuredcomponentEditPartProvider() {
		setFactory(new CustomStaticStructuredcomponentEditPartFactory());
		setAllowCaching(true);
	}

}
