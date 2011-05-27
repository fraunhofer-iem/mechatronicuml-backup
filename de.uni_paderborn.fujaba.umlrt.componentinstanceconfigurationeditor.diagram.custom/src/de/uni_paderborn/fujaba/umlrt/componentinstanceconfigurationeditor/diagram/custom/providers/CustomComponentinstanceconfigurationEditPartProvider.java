package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.parts.CustomComponentinstanceconfigurationEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.UmlrtEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartProvider extends
		UmlrtEditPartProvider {

	public CustomComponentinstanceconfigurationEditPartProvider() {
		setFactory(new CustomComponentinstanceconfigurationEditPartFactory());
		setAllowCaching(true);
	}

}
