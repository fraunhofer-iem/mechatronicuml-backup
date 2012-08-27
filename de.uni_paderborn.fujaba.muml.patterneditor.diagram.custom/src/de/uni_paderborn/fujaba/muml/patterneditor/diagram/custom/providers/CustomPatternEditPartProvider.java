package de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.patterneditor.diagram.custom.edit.parts.CustomPatternEditPartFactory;
import de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomPatternEditPartProvider extends MumlEditPartProvider {

	public CustomPatternEditPartProvider() {
		setFactory(new CustomPatternEditPartFactory());
		setAllowCaching(true);
	}

}
