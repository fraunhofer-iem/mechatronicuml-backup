package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts.CustomRealtimeStatechartEditPartFactory;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtEditPartProvider;


/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditPartProvider extends
		UmlrtEditPartProvider {

	public CustomRealtimeStatechartEditPartProvider() {
		setFactory(new CustomRealtimeStatechartEditPartFactory());
		setAllowCaching(true);
	}

}
