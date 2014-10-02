package de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.reach;

import java.util.HashSet;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition;

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
