package org.muml.storydiagram.reachanalysis.sdm;

import org.muml.core.reachanalysis.core.ReachabilityComputationStatistics;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * This class is used to gather statistics about the reachability
 * analysis.
 * @author Christian
 *
 */
public class SDMReachabilityComputationStatistics extends ReachabilityComputationStatistics{

	/**
	 * The time needed to transform the input activities into rule
	 * to be used by the reachability analysis.
	 */
	protected long timeForRuleTransformation;
	
	/**
	 * The time needed to identify unchangeable nodes.
	 */
	protected long timeForUnchangeableNodeIdentifiation;
	
	/**
	 * The time spent for copying states of a reachability graph
	 * during the reachability computation.
	 */
	protected long timeForStateCopy;
	
	public SDMReachabilityComputationStatistics(SDMReachabilityGraph reachGraph){
		super(reachGraph);
	}
	
	/**
	 * Returns the time needed to transform the input activities into rule
	 * to be used by the reachability analysis.
	 */
	public long getTimeForRuleTransformation() {
		return timeForRuleTransformation;
	}

	/**
	 * Returns the time needed to identify unchangeable nodes.
	 * @return
	 */
	public long getTimeForUnchangeableNodeIdentifiation() {
		return timeForUnchangeableNodeIdentifiation;
	}

	/**
	 * Get the time spent for copying states of a reachability graph
	 * during the reachability computation.
	 */
	public long getTimeForStateCopy() {
		return timeForStateCopy;
	}
	
	/**
	 * Returns the number of unchangeable graph nodes that have been identified
	 * during the reachability computation. This value will be 0 if the 
	 * detection of unchangeable nodes is deactivated in the reachability 
	 * computation.
	 * @return
	 */
	public int getNumberOfUnchangeableNodes(){
		return ((SDMReachabilityGraph)this.getReachabilityGraph()).getUnchangeableNodes().size();
	}
	
	/**
	 * Returns the maximum number of objects that are contained in
	 * one of the reached states of the reachability graph.
	 * @return
	 */
	public int getMaximumNumberOfObjectsPerState(){
		int maxSize = 0;
		for (ReachabilityGraphState state : this.getReachabilityGraph().getStates()){
			int size = ((StepGraph)state).getChangeableNodes().size();
			if (size > maxSize){
				maxSize = size;
			}
		}
		
		return maxSize + getNumberOfUnchangeableNodes();
	}
	
}
