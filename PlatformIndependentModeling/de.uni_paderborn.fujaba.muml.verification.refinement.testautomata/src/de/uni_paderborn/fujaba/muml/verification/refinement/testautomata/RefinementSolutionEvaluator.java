package de.uni_paderborn.fujaba.muml.verification.refinement.testautomata;

import java.util.HashSet;

import de.uni_paderborn.fujaba.muml.reachanalysis.core.SolutionEvaluator;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;

public class RefinementSolutionEvaluator extends SolutionEvaluator{
	private State err;
	private HashSet<State> deadEndStates;
	

	public void setErrorState(State error){
		err=error;
	}
	
	@Override
	public boolean isPostSolution(ReachabilityGraphState state){
		for(ReachabilityGraphTransition successorTransition : state.getOutgoingTransitions()){
			ReachabilityGraphState successor = successorTransition.getTarget();
			if(!(successor instanceof ZoneGraphState))
				continue;
			if(err==null)
				throw new IllegalArgumentException("Error state not set");
			for(RealtimeStatechartInstance curLocation : ((ZoneGraphState)successor).getLocations()){
				if(curLocation.getActiveVertex().equals(err))
					return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean isDeadEnd(ReachabilityGraphState state){
		for(RealtimeStatechartInstance curRtscInstance : ((ZoneGraphState)state).getLocations()){
			if(deadEndStates != null && deadEndStates.contains(curRtscInstance.getActiveVertex()))
				return true;
		}
		return false;
	}
	
	
	public void setDeadEndStates(HashSet<State> deadEndStates){
		this.deadEndStates=deadEndStates;
	}
	
	public HashSet<State> getDeadEndStates(){
		return deadEndStates;
	}

}
