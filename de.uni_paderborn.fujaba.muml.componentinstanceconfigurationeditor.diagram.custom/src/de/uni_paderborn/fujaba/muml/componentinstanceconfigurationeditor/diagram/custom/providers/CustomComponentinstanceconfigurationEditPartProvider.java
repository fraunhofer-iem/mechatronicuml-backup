package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts.CustomComponentinstanceconfigurationEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationEditPartProvider extends
		MumlEditPartProvider {

	public CustomComponentinstanceconfigurationEditPartProvider() {
		setFactory(new CustomComponentinstanceconfigurationEditPartFactory());
		setAllowCaching(true);
	}

}
