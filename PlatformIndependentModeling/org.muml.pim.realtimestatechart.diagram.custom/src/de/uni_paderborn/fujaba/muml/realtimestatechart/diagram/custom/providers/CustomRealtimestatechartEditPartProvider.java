package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlEditPartProvider;


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
