package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditPartProvider extends
		MumlEditPartProvider {

	public CustomRealtimeStatechartEditPartProvider() {
		setFactory(new CustomRealtimeStatechartEditPartFactory());
		setAllowCaching(true);
	}

}
