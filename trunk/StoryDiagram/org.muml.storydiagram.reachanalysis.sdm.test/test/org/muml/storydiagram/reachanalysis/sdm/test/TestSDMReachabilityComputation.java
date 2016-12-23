package org.muml.storydiagram.reachanalysis.sdm.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;

public class TestSDMReachabilityComputation extends SDMReachabilityComputation {

	protected TestSDMReachabilityComputation(){
		super();
		stats = this.createStatisticsObject();
	}
	
	public TestSDMReachabilityComputation(Set<EObject> initialGraphObjects, List<Activity> activities) {
		super(initialGraphObjects, activities);
		this.createStatisticsObject();
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
	protected boolean isIsomorphic(ReachabilityGraphState state1, ReachabilityGraphState state2) {
		// TODO Auto-generated method stub
		return super.isIsomorphic(state1, state2);
	}

	@Override
	protected void unifyStates(ReachabilityGraphState newState) {
		// TODO Auto-generated method stub
		super.unifyStates(newState);
	}

	@Override
	protected void addGraphObjectsToResource(StepGraph state) {
		// TODO Auto-generated method stub
		super.addGraphObjectsToResource(state);
	}

	
	
}
