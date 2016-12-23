package org.muml.reconfigurationverification.timedstorychart.transform;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperFactory;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple;

public class TransitionAnalysis {
	
	private HashMap<SynchronizationChannel,HashSet<TransitionTuple>> syncPairs;
	private HashMap<SynchronizationChannel,HashSet<Transition>> receive;
	private HashMap<SynchronizationChannel,HashSet<Transition>> initiate;
	private HashSet<Transition> noSync;
	private RealtimeStatechart adaptationBehavior;
	
	/** 
	 * Compute all pairs of transitions that may synchronize in the behavior of the connector endpoint. 
	 * In the case of a multi-role or multi-port, also the adaptationBehavior is considered. 
	 * @param endpoint the {@link DiscreteInteractionEndpoint}
	 * @return a HashMap that maps {@link SynchronizationChannel}s to pairs of {@link Transition}s that may synchronize.
	 */
	public HashMap<SynchronizationChannel,HashSet<TransitionTuple>> computeSyncPairs(DiscreteInteractionEndpoint endpoint) {
		RealtimeStatechart rtsc;
		if (isMultiEndpoint(endpoint)) {
			rtsc = (RealtimeStatechart) endpoint.getBehavior();
			adaptationBehavior = (RealtimeStatechart) endpoint.getCoordinatorBehavior();
		}
		else
			// there is no adaptation behavior
			rtsc = (RealtimeStatechart) endpoint.getBehavior();
		
		// initialize HashMaps
		syncPairs = new HashMap<SynchronizationChannel,HashSet<TransitionTuple>>();
		receive = new HashMap<SynchronizationChannel,HashSet<Transition>>();
		initiate = new HashMap<SynchronizationChannel,HashSet<Transition>>();
		noSync = new HashSet<Transition>();

		// no synchronizations in the parent statechart
		for(Transition transition : rtsc.getTransitions()) {
			noSync.add(transition);
		}	
		//  --> search for states with channels
		computeSyncPairsInStates(rtsc);

		return syncPairs;
	}
	
	private boolean isMultiEndpoint(DiscreteInteractionEndpoint endpoint) {
		if(endpoint.getCardinality() != null && endpoint.getCardinality().getUpperBound().getValue() > 1)
			return true;
		return false;
	}

	public HashSet<Transition> getNoSyncTransitions() {
		return noSync;
	}

	/** 
	 * Searches for sync channels in the states of the rtsc and sorts the transitions of the sub-statechart. 
	 * This method is called recursively for sub-statecharts
	 * @param rtsc The {@link RealtimeStatechart}
	 */
	private void computeSyncPairsInStates(RealtimeStatechart rtsc) {
		for(State state : rtsc.getStates()) {
			EList<SynchronizationChannel> syncChannels = state.getChannels();
			for(SynchronizationChannel channel : syncChannels) {
				receive.put(channel, new HashSet<Transition>());
				initiate.put(channel, new HashSet<Transition>());
			}
			sortTransitions(state);
			
			for(SynchronizationChannel channel : syncChannels) {
				syncPairs.put(channel, computePairs(channel));
			}
		}
	}

	/**
	 * Sort transitions in the regions of the state according to receiving and initiating synchronizations. 
	 * Transitions with no synchronization are stored in the field noSync.
	 * @param state the {@link State}
	 */
	private void sortTransitions(State state) {

		for(Region region : state.getEmbeddedRegions()) {
			for(Transition transition : region.getEmbeddedStatechart().getTransitions()) {
				Synchronization synchronization = transition.getSynchronization();
				if(synchronization != null) {
					if(synchronization.getKind() == SynchronizationKind.RECEIVE) {
						HashSet<Transition> transitions = receive.get(synchronization.getSyncChannel());
						transitions.add(transition);
					}
					else if(synchronization.getKind() == SynchronizationKind.SEND) {
						HashSet<Transition> transitions = initiate.get(synchronization.getSyncChannel());
						transitions.add(transition);
					}
				}
				else
					noSync.add(transition);
			}
			// repeat recursively for sub-statecharts
			computeSyncPairsInStates(region.getEmbeddedStatechart());
		}
	}

	/**
	 * Computes a set of tuples of transitions that may synchronize since they have the same channel.
	 * Ensures only, that the transitions of a tuple are not both in the adaptation behavior of a multi-role
	 * @param channel the {@link SynchronizationChannel}
	 * @return the set of {@link TransitionTuple}s
	 */
	private HashSet<TransitionTuple> computePairs(SynchronizationChannel channel) {
		HashSet<TransitionTuple> tuples = new HashSet<TransitionTuple>();
		for(Transition initiatingTransition : initiate.get(channel)) {
			for(Transition receivingTransition : receive.get(channel)) {
				// not both transitions may be in the adaptationBehavior
				if(! (isInAdaptionBehavior(initiatingTransition) && isInAdaptionBehavior(receivingTransition))) {
					TransitionTuple transitionTuple = HelperFactory.eINSTANCE.createTransitionTuple();
					transitionTuple.setSending(initiatingTransition);
					transitionTuple.setReceiving(receivingTransition);
					tuples.add(transitionTuple);
				}
			}
		}
		
		return tuples;
	}

	private boolean isInAdaptionBehavior(Transition transition) {
		return adaptationBehavior != null && adaptationBehavior.getTransitions().contains(transition);
	}
	

}
