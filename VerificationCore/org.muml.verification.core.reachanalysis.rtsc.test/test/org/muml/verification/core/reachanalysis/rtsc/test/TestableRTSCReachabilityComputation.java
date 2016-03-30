package org.muml.verification.core.reachanalysis.rtsc.test;

import java.util.Collection;
import java.util.HashSet;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.udbm.Federation;
import org.muml.verification.core.reachanalysis.rtsc.RTSCReachabilityComputation;

public class TestableRTSCReachabilityComputation extends
		RTSCReachabilityComputation {

	public TestableRTSCReachabilityComputation(HashSet<RealtimeStatechart> rtscs) {
		super(rtscs);
	}

	public ReachabilityGraphState createInitialState() {
		return super.createInitialState();
	}

	public boolean isIsomorphic(ReachabilityGraphState state1,
			ReachabilityGraphState state2) {
		return super.isIsomorphic(state1, state2);
	}

	public HashSet<ReachabilityGraphState> computeSuccessors(
			ReachabilityGraphState state) {
		return super.computeSuccessors(state);
	}

	public void computeHashValue(ReachabilityGraphState state) {
		super.computeHashValue(state);
	}

	public void initialize() {
		super.initialize();
	}

	public ReachabilityGraphState delay(
			ReachabilityGraphState state,
			Collection<org.muml.udbm.ClockConstraint> invariants,
			boolean urgent, Collection<Federation> federations) {
		return super.delay(state, invariants, urgent, federations);
	}
	
	public void applyClockConstraint(ReachabilityGraphState state, ClockConstraint cc, Federation fed){
		super.applyClockConstraint(state, cc, fed);
	}

}
