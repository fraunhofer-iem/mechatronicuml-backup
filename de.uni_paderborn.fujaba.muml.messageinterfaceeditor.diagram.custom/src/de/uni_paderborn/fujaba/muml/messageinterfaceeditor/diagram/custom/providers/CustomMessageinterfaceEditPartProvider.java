package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.parts.CustomMessageinterfaceEditPartFactory;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartProvider extends
		MumlEditPartProvider {

	public CustomMessageinterfaceEditPartProvider() {
		setFactory(new CustomMessageinterfaceEditPartFactory());
		setAllowCaching(true);
	}

}
