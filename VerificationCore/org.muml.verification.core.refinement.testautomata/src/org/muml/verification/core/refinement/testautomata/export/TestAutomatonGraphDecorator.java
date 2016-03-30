package org.muml.verification.core.refinement.testautomata.export;

import org.muml.core.reachanalysis.core.export.ApplicationSpecificDecorator;
import org.muml.core.reachanalysis.core.export.GraphVizColors;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.pim.realtimestatechart.State;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;

public class TestAutomatonGraphDecorator extends ApplicationSpecificDecorator {

	private final State errorState;
	
	private final State neutralState;
	
	public TestAutomatonGraphDecorator(State errorState, State neutralState){
		this.errorState = errorState;
		this.neutralState = neutralState;
	}
	
	@Override
	public GraphVizColors getNodeColor(ReachabilityGraphState state) {

		// if this is not a ZoneGraphState, return value of default implementation
		if(!(state instanceof ZoneGraphState)){
			return super.getNodeColor(state);
		}
		
		ZoneGraphState zoneState = (ZoneGraphState) state;
		
		//based on the current implementation, only one of the two variables may become true
		boolean errorStateActive = false;
		boolean neutralStateActive = false;
		
		//check whether any RTSC instance has the errorState or the neutralState as the active location
		for(RealtimeStatechartInstance curRTSCInst : zoneState.getLocations()){
			if(curRTSCInst.getActiveVertex() == errorState){
				errorStateActive = true;
				break;
			} else if (curRTSCInst.getActiveVertex() == neutralState){
				neutralStateActive = true;
				break;
			}
		}
		
		//return color
		if(errorStateActive){
			return GraphVizColors.RED;
		} else if (neutralStateActive){
			return GraphVizColors.GREEN;
		} else {
			return GraphVizColors.LIGHT_GREY;
		}
	}

	
}
