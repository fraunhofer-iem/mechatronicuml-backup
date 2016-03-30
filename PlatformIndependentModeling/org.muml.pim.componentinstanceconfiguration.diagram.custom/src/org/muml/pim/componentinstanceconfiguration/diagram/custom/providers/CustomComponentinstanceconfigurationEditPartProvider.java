package org.muml.pim.componentinstanceconfiguration.diagram.custom.providers;

import org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts.CustomComponentinstanceconfigurationEditPartFactory;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlEditPartProvider;


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
