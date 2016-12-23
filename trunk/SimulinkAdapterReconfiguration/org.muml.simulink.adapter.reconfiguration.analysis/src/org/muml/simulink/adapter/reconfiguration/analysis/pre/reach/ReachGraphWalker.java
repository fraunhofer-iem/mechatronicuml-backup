package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach;

import java.util.LinkedList;
import java.util.List;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

/**
 * Implementation of the Visitor Pattern. Visits all states and transitions of
 * a ReachabilityGraph.
 */
public class ReachGraphWalker 
{
	protected List<ReachGraphVisitor> visitors = new LinkedList<ReachGraphVisitor>();
	
	public void walk(ReachabilityGraph graph, ReachGraphVisitor visitor)
	{
		this.addVisitor(visitor);
		this.walk(graph);
		this.removeVisitor(visitor);
	}
	
	public void walk(ReachabilityGraph graph)
	{
		this.start(graph);
		for(ReachabilityGraphState state: graph.getStates())
			visit(state);
		for(ReachabilityGraphTransition transition: graph.getTransitions())
			visit(transition);
		this.finish(graph);
	}
	
	public void addVisitor(ReachGraphVisitor visitor)
	{
		this.visitors.add(visitor);
	}
	
	public void removeVisitor(ReachGraphVisitor visitor)
	{
		this.visitors.remove(visitor);
	}

	protected void visit(ReachabilityGraphTransition transition) 
	{
		for(ReachGraphVisitor v: this.visitors)
			v.visit(transition);		
	}

	protected void visit(ReachabilityGraphState state) 
	{
		for(ReachGraphVisitor v: this.visitors)
			v.visit(state);
	}
	
	protected void start(ReachabilityGraph graph)
	{
		for(ReachGraphVisitor v: this.visitors)
			v.start(graph);
	}
	
	protected void finish(ReachabilityGraph graph)
	{
		for(ReachGraphVisitor v: this.visitors)
			v.finish(graph);
	}

}
