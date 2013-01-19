package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts.CustomProtocolEditPartFactory;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomPatternEditPartProvider extends MumlEditPartProvider {

	public CustomPatternEditPartProvider() {
		setFactory(new CustomProtocolEditPartFactory());
		setAllowCaching(true);
	}

}
