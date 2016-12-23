package org.muml.verification.core.refinement.testautomata;

import java.util.HashSet;
import java.util.List;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.verification.core.reachanalysis.rtsc.RTSCReachabilityComputation;

public class Verification {
	private RealtimeStatechart testAutomaton;
	private Refinement[] refinementParameters;
	private ReachabilityGraph reachGraph;
	
	/** The error state of the testAutomaton indicating an invalid refinement */
	private State errorState;
	
	/** The neutral state of the testAutomaton indicating a successful condition test */
	private State neutralState;

	public Verification() {

	}

	/** Checks whether behavior of port is correct refinement of role
	 * @param port
	 * @return
	 */
	public boolean checkRefinement(DiscretePort port) {
		
		//check preconditions
		if(!fulfillsPreconditions(port)){
			return false;
		}
		
		RefinementParameterSelection refinementParameterSelection = new RefinementParameterSelection();
		this.refinementParameters = refinementParameterSelection
				.selectRefinementParameters(port);
		TestAutomataGeneration testAutomataGeneration = new TestAutomataGeneration(// rtscs
				port, refinementParameters);
		this.testAutomaton = testAutomataGeneration.constructTA();
		
		//store error and neutral state
		errorState = testAutomataGeneration.getErrorState();
		neutralState = testAutomataGeneration.getNState();
		
		return performReachabilityAnalysis(errorState, neutralState);
	}
	
	/**
	 * @return
	 * ReachabilityGraph, null if not yet computed (performReachabilityAnalysis not yet called)
	 */
	public ReachabilityGraph getReachabilityGraph(){
		return reachGraph;
	}
	
	/**
	 * Checks whether the necessary preconditions for a valid refinement have been met. Currently we check
	 * <ol> 
	 *   <li> port and role need to have the same message type to buffer assignment </li>
	 * </ol>
	 * @param port
	 * @return
	 */
	protected boolean fulfillsPreconditions(DiscretePort port){
		
		/*
		 * Check 1: port and role need to have the same message type to buffer assignment
		 */
		
		//get buffers
		List<MessageBuffer> roleBuffers = port.getRefinedRole().getReceiverMessageBuffer();
		List<MessageBuffer> portBuffers = port.getReceiverMessageBuffer();
		
		if (roleBuffers.size() != portBuffers.size()) return false;
		
		//iterate buffers
		for(MessageBuffer curRoleBuffer : roleBuffers){
			//locate a port buffer that accepts the same set of messages as the role buffer
			boolean bufferFound = false;
			
			for(MessageBuffer curPortBuffer : portBuffers){
				
				boolean uncontainedMsgTypeFound = false;
				
				//iterate messages
				for(MessageType msgType : curRoleBuffer.getMessageType()){
					if(!curPortBuffer.getMessageType().contains(msgType)){
						uncontainedMsgTypeFound = true;
						break;
					}
				}
				
				if (uncontainedMsgTypeFound == false){
					bufferFound = true;
					break;
				}
			}
			
			//check whether fitting buffer has been found, if not, return false
			if(bufferFound == false){
				return false;
			}
			
			
		}
		
		return true;
	}
	

	/**
	 * Perform reachability analysis to check whether the error state is reachable.
	 * @param error
	 * @return
	 */
	protected boolean performReachabilityAnalysis(State error, State n) {

		HashSet<RealtimeStatechart> rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(testAutomaton);
		RTSCReachabilityComputation reach = new RTSCReachabilityComputation(
				rtscs);
		HashSet<State> nAsSet = new HashSet<State>();
		nAsSet.add(n);
		

	
		// set solutionEvaluator which checks, if an location is in "err" state
		RefinementSolutionEvaluator solutionEvaluator = new RefinementSolutionEvaluator();
		solutionEvaluator.setErrorState(error);
		solutionEvaluator.setDeadEndStates(nAsSet);
		reach.setSolutionEvaluator(solutionEvaluator);

		reach.computeReachabilityGraph();
		reachGraph=reach.getReachabilityGraph();

		if (reach.isSolutionFound()) 
	
			
			return false;
		else 

			return true;
		
	}

	public State getErrorState() {
		return errorState;
	}

	public void setErrorState(State errorState) {
		this.errorState = errorState;
	}

	public State getNeutralState() {
		return neutralState;
	}

	public void setNeutralState(State neutralState) {
		this.neutralState = neutralState;
	}
}
