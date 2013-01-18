package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlEditPartProvider;


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
