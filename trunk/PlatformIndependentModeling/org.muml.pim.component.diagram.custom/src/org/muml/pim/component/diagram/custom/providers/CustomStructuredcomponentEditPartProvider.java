package org.muml.pim.component.diagram.custom.providers;

import org.muml.pim.component.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;
import org.muml.pim.component.diagram.providers.MumlEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredcomponentEditPartProvider extends
		MumlEditPartProvider {

	public CustomStructuredcomponentEditPartProvider() {
		setFactory(new CustomStructuredcomponentEditPartFactory());
		setAllowCaching(true);
	}

}
