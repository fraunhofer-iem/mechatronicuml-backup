package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach;

import java.util.HashSet;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

/**
 * Visits all states/transitions of a ReachabilityGraph by
 * using a DFS strategy. Leaves out back edges.
 */
public class DFSReachGraphWalker extends ReachGraphWalker 
{
	private HashSet<ReachabilityGraphState> visited = new HashSet<ReachabilityGraphState>();
	
	@Override
	public void walk(ReachabilityGraph graph)
	{
		this.start(graph);
		
		this.walkState(graph.getStartState());
		
		this.finish(graph);
	}
	
	protected void walkState(ReachabilityGraphState state)
	{
		this.visited.add(state);
		
		for(ReachabilityGraphTransition transition: state.getOutgoingTransitions())
		{
			ReachabilityGraphState target = transition.getTarget();
			if(this.visited.contains(target))//Back edge detected
				continue;
			
			this.walkState(target);
			this.visit(transition);
		}
		this.visit(state);
	}
}
