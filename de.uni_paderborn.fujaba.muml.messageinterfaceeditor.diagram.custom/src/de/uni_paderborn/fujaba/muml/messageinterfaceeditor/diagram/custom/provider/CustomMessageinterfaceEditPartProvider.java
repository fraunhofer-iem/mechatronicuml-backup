package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.provider;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.part.CustomMessageinterfaceEditPartFactory;
import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.UmlrtEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomMessageinterfaceEditPartProvider extends
		UmlrtEditPartProvider {

	public CustomMessageinterfaceEditPartProvider() {
		setFactory(new CustomMessageinterfaceEditPartFactory());
		setAllowCaching(true);
	}

}
