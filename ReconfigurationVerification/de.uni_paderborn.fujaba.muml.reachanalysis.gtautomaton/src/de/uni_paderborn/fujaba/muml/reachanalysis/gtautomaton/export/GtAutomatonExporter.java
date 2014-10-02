package de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton.export;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomatonClockConstraint;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomatonTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SDMTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.StepGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.sdm.export.SDMReachabilityGraphExporter;

public class GtAutomatonExporter extends SDMReachabilityGraphExporter{

	@Override
	protected String getStateLabel(ReachabilityGraphState state) {
		
		//if not a StepGraph, use super class implementation
		if(state instanceof GtStepGraph){
			
			String result = "";
			
			//query the decorator if one is present
			if(getGraphDecorator() != null){
				result = getGraphDecorator().getApplicationSpecificStateLabel((StepGraph)state);
			}
			
			//if the decorator did not override the superclass method, an empty string will be returned
			//if this is the case, use hash value by default
			if(result.length() > 0){
				return result;
			} else {
				StringBuffer buffer = new StringBuffer();
				buffer.append("Hash =" + ((StepGraph) state).getHash());
				buffer.append('\\');
				buffer.append('n');
				
				//print invariants
				boolean first = true;
				for(GtAutomatonClockConstraint inv : ((GtStepGraph)state).getInvariant()){
					
					//write delimiter in front of every element except the first one
					if(!first){
						buffer.append(" and ");
						first = false;
					}
					
					buffer.append(inv.getClockInstanceIdentifier());
					buffer.append(inv.getOperator().toString());
					buffer.append(inv.getValue());
					
				}
				
				return buffer.toString();
			}
		} else {
			return super.getStateLabel(state);
		}	  
	}

	@Override
	protected String getTransitionLabel(ReachabilityGraphTransition transition) {
		
		//if not a SDMTransition, use super class implementation
		if(transition instanceof GtAutomatonTransition){
			
			String result = "";
			
			//query the decorator if one is present
			if(getGraphDecorator() != null){
				result = getGraphDecorator().getApplicationSpecificTransitionLabel((SDMTransition)transition);
			}
			
			//if the decorator did not override the superclass method, an empty string will be returned
			//if this is the case, use hash value by default
			if(result.length() > 0){
				return result;
			} else {
				StringBuffer buffer = new StringBuffer();
				String activityName = ((SDMTransition) transition).getAppliedActivity().getName();
				buffer.append(activityName.substring(0,activityName.length() - 8));
				buffer.append('\\');
				buffer.append('n');
				
				//print clock constraints
				boolean first = true;
				for(GtAutomatonClockConstraint guard : ((GtAutomatonTransition)transition).getTimeGuards()){
					
					//write delimiter in front of every element except the first one
					if(!first){
						buffer.append(" and ");
						first = false;
					}
					
					buffer.append(guard.getClockInstanceIdentifier());
					buffer.append(guard.getOperator().toString());
					buffer.append(guard.getValue());
					
				}
				
				//print resets
				first = true;
				for(String reset : ((GtAutomatonTransition)transition).getClockResets()){
					
					//write delimiter in front of every element except the first one
					if(!first){
						buffer.append(", ");
						first = false;
					}
					
					buffer.append(reset);
					
				}
				
				return buffer.toString();
				
			}
		} else {
			return super.getTransitionLabel(transition);
		}
	}
	
}
