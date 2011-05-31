package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.MumlinstanceEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditPartProvider extends
		MumlinstanceEditPartProvider {

	public CustomRealtimeStatechartEditPartProvider() {
		setFactory(new CustomRealtimeStatechartEditPartFactory());
		setAllowCaching(true);
	}

}
