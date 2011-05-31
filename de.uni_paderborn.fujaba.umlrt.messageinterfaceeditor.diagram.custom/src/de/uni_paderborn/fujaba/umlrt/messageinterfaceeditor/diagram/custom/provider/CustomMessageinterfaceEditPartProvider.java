package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.provider;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.edit.part.CustomMessageinterfaceEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartProvider extends
		MumlinstanceEditPartProvider {

	public CustomMessageinterfaceEditPartProvider() {
		setFactory(new CustomMessageinterfaceEditPartFactory());
		setAllowCaching(true);
	}

}
