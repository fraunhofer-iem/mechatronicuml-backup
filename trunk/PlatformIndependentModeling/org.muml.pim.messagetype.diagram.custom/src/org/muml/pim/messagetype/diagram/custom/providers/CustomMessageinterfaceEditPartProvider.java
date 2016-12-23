package org.muml.pim.messagetype.diagram.custom.providers;

import org.muml.pim.messagetype.diagram.custom.edit.parts.CustomMessageinterfaceEditPartFactory;
import org.muml.pim.messagetype.diagram.providers.MumlEditPartProvider;


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
