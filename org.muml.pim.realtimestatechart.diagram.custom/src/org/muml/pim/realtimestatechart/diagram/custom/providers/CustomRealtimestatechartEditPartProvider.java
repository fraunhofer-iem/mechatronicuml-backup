package org.muml.pim.realtimestatechart.diagram.custom.providers;

import org.muml.pim.realtimestatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import org.muml.pim.realtimestatechart.diagram.providers.MumlEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author braund
 * 
 */
public class CustomRealtimestatechartEditPartProvider extends
		MumlEditPartProvider {

	public CustomRealtimestatechartEditPartProvider() {
		setFactory(new CustomRealtimeStatechartEditPartFactory());
		setAllowCaching(true);
	}

}
