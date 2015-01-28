package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.providers;


import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.parts.CustomProtocolEditPartFactory;
import de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomPatternEditPartProvider extends PatternEditPartProvider {

	public CustomPatternEditPartProvider() {
		setFactory(new CustomProtocolEditPartFactory());
		setAllowCaching(true);
	}

}
