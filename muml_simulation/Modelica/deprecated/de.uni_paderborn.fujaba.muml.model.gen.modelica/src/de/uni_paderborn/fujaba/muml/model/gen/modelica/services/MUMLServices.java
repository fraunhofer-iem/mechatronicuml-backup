package de.uni_paderborn.fujaba.muml.model.gen.modelica.services;

import java.util.List;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class MUMLServices {
	
	public boolean isCycleTransition(Transition t){
		return false;
	}
	
/*	private List<Transition> getCycleTransition(Transition startTransition){
		return removeCycleTransition(startTransition, startTransition.getTarget().getOutgoingTransitions().)
	}
	
	private List<Transition> removeCycleTransition(Transition startTransition, List<Transition> cycleTransition, Transition removedTransition){
		
	} */

}
