package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.GtAutomatonComputation;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;

/**
 * This class exists for testing purpose only. It is required by the junit tests in this package to access the protected methods 
 * of the GtAutomatonComputation.
 *
 */
public class TestGtAutomatonComputation extends GtAutomatonComputation {

	protected TestGtAutomatonComputation(){
		super();
	}
	
	public TestGtAutomatonComputation(TimedGraphTransformationSystem activities) {
		super(activities);
		this.reachabilityGraph = createReachabilityGraph();
	}
	
	@Override
	protected HashSet<? extends ReachabilityGraphState> computeSuccessors(ReachabilityGraphState state) {
		// TODO Auto-generated method stub
		return super.computeSuccessors(state);
	}

	@Override
	protected void computeHashValue(ReachabilityGraphState state) {
		// TODO Auto-generated method stub
		super.computeHashValue(state);
	}

	@Override
	protected long computeAttributeHash(EObject obj) {
		// TODO Auto-generated method stub
		return super.computeAttributeHash(obj);
	}

	@Override
	protected long computeNeighborhoodHash(EObject obj,
			HashMap<EObject, Long> lowerLevelHashes) {
		// TODO Auto-generated method stub
		return super.computeNeighborhoodHash(obj, lowerLevelHashes);
	}

	@Override
	public ReachabilityGraphState copyState(ReachabilityGraphState state, ReachabilityGraphTransition trans) {
		// TODO Auto-generated method stub
		return super.copyState(state, trans);
	}

	@Override
	public boolean isIsomorphic(ReachabilityGraphState state1, ReachabilityGraphState state2) {
		// TODO Auto-generated method stub
		return super.isIsomorphic(state1, state2);
	}

	@Override
	protected TimedGraphTransformationSystem createForEachRules(
			TimedGraphTransformationSystem inputTimedGTS) {
		// TODO Auto-generated method stub
		return super.createForEachRules(inputTimedGTS);
	}

	@Override
	protected void addClockInstancesToState(GtStepGraph stepGraph) {
		// TODO Auto-generated method stub
		super.addClockInstancesToState(stepGraph);
	}

	@Override
	protected void addInvariantsToState(GtStepGraph stepGraph) {
		// TODO Auto-generated method stub
		super.addInvariantsToState(stepGraph);
	}

	@Override
	protected ReachabilityGraphState createInitialState() {
		// TODO Auto-generated method stub
		return super.createInitialState();
	}

	@Override
	protected void sanitizeVariableBindings(GtStepGraph step) {
		// TODO Auto-generated method stub
		super.sanitizeVariableBindings(step);
	}
	
	
	
}
