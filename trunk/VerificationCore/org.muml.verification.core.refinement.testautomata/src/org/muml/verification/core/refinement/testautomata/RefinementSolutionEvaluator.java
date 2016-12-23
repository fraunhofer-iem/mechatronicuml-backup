package org.muml.verification.core.refinement.testautomata;

import java.util.HashSet;

import org.muml.core.reachanalysis.core.SolutionEvaluator;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.realtimestatechart.State;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;

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
