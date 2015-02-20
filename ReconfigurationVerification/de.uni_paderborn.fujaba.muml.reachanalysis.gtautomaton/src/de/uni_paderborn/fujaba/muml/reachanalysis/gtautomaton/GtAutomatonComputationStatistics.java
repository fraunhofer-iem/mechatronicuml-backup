package de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomaton;
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
