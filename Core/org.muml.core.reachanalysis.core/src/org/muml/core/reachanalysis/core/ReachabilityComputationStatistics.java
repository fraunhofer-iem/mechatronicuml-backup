package org.muml.core.reachanalysis.core;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;

/**
 * This class is used to gather statistics about the reachability
 * analysis.
 * @author Christian
 *
 */
public class ReachabilityComputationStatistics {

	/**
	 * The number of hash collisions that occurred during the reachability analysis.
	 */
	protected int hashCollisions = 0;
	
	/**
	 * The number of isomorphic states that were found during the reachability analysis.
	 */
	protected int isomorphismsFound = 0;
	
	/**
	 * The number of branches in the reachability graph that were pruned
	 * due to the maxPathLength.
	 */
	protected int numberOfPrunedBranches = 0;
	
	/**
	 * The time needed to compute the reachability graph not including
	 * the initialization phase.
	 */
	protected long timeForReachabilityGraphComputation;
	
	/**
	 * The total time needed for the reachability analysis including both,
	 * the initialization phase and the computation of the reachability graph.
	 */
	protected long totalTimeForReachabilityAnalysis;
	
	/**
	 * The time spent for computing isomorphisms between states of a reachability graph
	 * during the reachability computation.
	 */
	protected long timeForIsomorphismCheck;
	
	/**
	 * The time spent for computing hash values for states of a reachability graph
	 * during the reachability computation.
	 */
	protected long timeForHashComputation;
	
	
	/** 
	 * The reachability graph for which the statistics are collected. 
	 */
	private ReachabilityGraph reachabilityGraph;
	
	/**
	 * Constructor.
	 * @param reachGraph
	 */
	public ReachabilityComputationStatistics(ReachabilityGraph reachGraph){
		this.reachabilityGraph = reachGraph;
	}
	
	/**
	 * Returns the number of hash collisions that occurred during the reachability analysis.
	 * @return
	 */
	public int getHashCollisions() {
		return hashCollisions;
	}

	/**
	 * Returns the number of isomorphic states that were found during the reachability analysis.
	 * @return
	 */
	public int getIsomorphismsFound() {
		return isomorphismsFound;
	}
	
	/**
	 * Returns the number of branches in the reachability graph that were pruned
	 * due to the maxPathLength.
	 */
	public int getNumberOfPrunedBranches() {
		return numberOfPrunedBranches;
	}

	/**
	 * Returns the time needed to compute the reachability graph not including
	 * the initialization phase.
	 * @return
	 */
	public long getTimeForReachabilityGraphComputation() {
		return timeForReachabilityGraphComputation;
	}

	/**
	 * Returns the total time needed for the reachability analysis including both,
	 * the initialization phase and the computation of the reachability graph.
	 * @return
	 */
	public long getTotalTimeForReachabilityAnalysis() {
		return totalTimeForReachabilityAnalysis;
	}

	/**
	 * Returns the reachability graph for which the statistics are collected.
	 * @return
	 */
	public ReachabilityGraph getReachabilityGraph() {
		return reachabilityGraph;
	}
	
	/**
	 * Get the time spent for computing isomorphisms between states of a reachability graph
	 * during the reachability computation.
	 */
	public long getTimeForIsomorphismCheck() {
		return timeForIsomorphismCheck;
	}

	/**
	 * Get the time spent for computing hash values for states of a reachability graph
	 * during the reachability computation.
	 */
	public long getTimeForHashComputation() {
		return timeForHashComputation;
	}

	/**
	 * Returns the number of states that have been reached by the reachability analysis.
	 * @return
	 */
	public int getNumberOfStates(){
		return reachabilityGraph.getStates().size();
	}
	
	/**
	 * Returns the number of transitions that have been derived by the reachability analysis.
	 * @return
	 */
	public int getNumberOfTransitions(){
		return reachabilityGraph.getTransitions().size();
	}
	
}
