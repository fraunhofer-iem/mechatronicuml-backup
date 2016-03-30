package org.muml.reconfigurationverification.reachanalysis.gtautomaton;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;

import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.SDMReachabilityComputationStatistics;

public class GtAutomatonComputationStatistics extends
		SDMReachabilityComputationStatistics {

	public GtAutomatonComputationStatistics(GtAutomaton reachGraph) {
		super(reachGraph);
	}
	
	protected void setTimeForRuleTransformation(long time){
		this.timeForRuleTransformation = time;
	}

	protected void setTimeForStateCopy(long time){
		this.timeForStateCopy = time;
	}
}
