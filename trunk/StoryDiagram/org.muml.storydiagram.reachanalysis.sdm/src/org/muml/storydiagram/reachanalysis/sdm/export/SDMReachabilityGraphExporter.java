package org.muml.storydiagram.reachanalysis.sdm.export;

import org.muml.core.reachanalysis.core.export.ApplicationSpecificDecorator;
import org.muml.core.reachanalysis.core.export.GraphVizExport;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

public class SDMReachabilityGraphExporter extends GraphVizExport{
	
	public SDMReachabilityGraphExporter(){
		super();
	}
	
	public SDMReachabilityGraphExporter(ApplicationSpecificGraphDecorator decorator){
		super(decorator);
	}

	@Override
	protected String getStateLabel(ReachabilityGraphState state) {
		
		//if not a StepGraph, use super class implementation
		if(state instanceof StepGraph){
			
			String result = "";
			ApplicationSpecificGraphDecorator decorator = getGraphDecorator();
			
			//query the decorator if one is present
			if(decorator != null){
				result = decorator.getApplicationSpecificStateLabel((StepGraph)state);
			}
			
			//if the decorator did not override the superclass method, an empty string will be returned
			//if this is the case, use hash value by default
			if(result.length() > 0){
				return result;
			} else {
				return "Hash =" + ((StepGraph) state).getHash();
			}
		} else {
			return super.getStateLabel(state);
		}	  
	}

	@Override
	protected String getTransitionLabel(ReachabilityGraphTransition transition) {
		
		//if not a SDMTransition, use super class implementation
		if(transition instanceof SDMTransition){
			
			String result = "";
			ApplicationSpecificGraphDecorator decorator = getGraphDecorator();
			
			//query the decorator if one is present
			if(decorator != null){
				result = decorator.getApplicationSpecificTransitionLabel((SDMTransition)transition);
			}
			
			//if the decorator did not override the superclass method, an empty string will be returned
			//if this is the case, use hash value by default
			if(result.length() > 0 || (((SDMTransition) transition).getAppliedActivity() == null)){
				return result;
			} else {
				return ((SDMTransition) transition).getAppliedActivity().getName();
			}
		} else {
			return super.getTransitionLabel(transition);
		}
	}

	protected ApplicationSpecificGraphDecorator getGraphDecorator() {
		ApplicationSpecificDecorator decorator = super.getDecorator();
		
		if(decorator instanceof ApplicationSpecificGraphDecorator){
			return (ApplicationSpecificGraphDecorator) decorator;
		}
		
		return null;
	}

}
