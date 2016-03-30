package org.muml.core.reachanalysis.core;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;


/**
 * Evaluates whether a given state is a solution for the reachability analysis. If a
 * solution has been found, the reachability analysis terminates. This standard implementation
 * will regard all states as being no solution and is intended to be subclassed.
 */
public class SolutionEvaluator{
	
	/** 
	 * Stores the last ReachabilityGraphState that was considered as a solution (either
	 * identified as pre-solution or post-solution). 
	 */
	private ReachabilityGraphState lastSolution = null;
	
	
	/**
	 * Stores the last ReachabilityGraphState that was considered as a dead end.
	 */
	private ReachabilityGraphState lastDeadEnd = null;
	
	
	/**
	 * This method checks whether the state is a solution <b>before</b> the state is being 
	 * expanded. If the state is a solution, it is stored in lastSolution. 
	 * 
	 * Subclasses should override isPreSolution for defining concrete conditions for a solution.
	 * @param state
	 * @return
	 */
	protected final boolean checkForPreSolution(ReachabilityGraphState state){
		//check for solution
		boolean result = isPreSolution(state);
		
		//store solution if it is one
		if(result == true){
			lastSolution = state;
		}
		
		return result;
	}
	
	/**
	 * This method checks whether a state is a solution <b>before</b> the state is being
	 * expanded.
	 * 
	 * This method is intended to be overridden by subclasses.
	 * 
	 * @param state the state to be checked
	 * @return <i>true</i> if the state is a solution, <i>false</i> otherwise
	 */
	public boolean isPreSolution(ReachabilityGraphState state) {
		return false;
	}
	
	/**
	 * This method checks whether the state is a solution <b>before</b> the state is being 
	 * expanded. If the state is a solution, it is stored in lastSolution. 
	 * 
	 * Subclasses should override isPostSolution for defining concrete conditions for a solution.
	 * @param state
	 * @return
	 */
	protected final boolean checkForPostSolution(ReachabilityGraphState state){
		//check for solution
		boolean result = isPostSolution(state);
		
		//store solution if it is one
		if(result == true){
			lastSolution = state;
		}
		
		return result;
	}
	
	/**
	 * This method checks whether a state is a solution <b>after</b> the state has been
	 * expanded.
	 * 
	 * This method is intended to be overridden by subclasses.
	 * 
	 * @param state the state to be checked
	 * @return <i>true</i> if the state is a solution, <i>false</i> otherwise
	 */
	public boolean isPostSolution(ReachabilityGraphState state){
		return false;
	}
	
	/**
	 * This method checks whether the state is a dead end <b>before</b> the state is being 
	 * expanded. If the state is a dead end, it is stored in lastDeadEnd. 
	 * 
	 * Subclasses should override isDeadEnd for defining concrete conditions for a dead end.
	 * @param state
	 * @return
	 */
	protected final boolean checkForDeadEnd(ReachabilityGraphState state){
		//check for dead end
		boolean result = isDeadEnd(state);

		//store dead end if it is one
		if(result == true){
			lastDeadEnd = state;
		}

		return result;
	}
	
	/**
	 * This method checks whether a state is a dead end <b>before</b> the state is
	 * expanded. A dead end will not lead to a solution and usually will not be
	 * expanded.
	 * 
	 * This method is intended to be overridden by subclasses.
	 * 
	 * @param state the state to be checked
	 * @return <i>true</i> if the state is a dead end, <i>false</i> otherwise
	 */
	public boolean isDeadEnd(ReachabilityGraphState state){
		return false;
	}

	/**
	 * Returns the last ReachabilityGraphState that was considered as a solution (either
	 * identified as pre-solution or post-solution). 
	 * @return
	 */
	public ReachabilityGraphState getLastSolution() {
		return lastSolution;
	}
	
	/**
	 * Returns the last ReachabilityGraphState that was considered as a solution (either
	 * identified as pre-solution or post-solution). 
	 * @return
	 */
	public ReachabilityGraphState getLastDeadEnd() {
		return lastDeadEnd;
	}

} // SolutionEvaluator
