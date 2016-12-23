package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.test;

import org.eclipse.emf.ecore.EObject;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.sdm.export.ApplicationSpecificGraphDecorator;

public class CarPlatooningStepGraphDecorator extends ApplicationSpecificGraphDecorator{

	@Override
	public String getApplicationSpecificStateLabel(StepGraph step) {

		StringBuffer result = new StringBuffer();
		
		//print the hash value
		result.append("Hash: ");
		result.append(step.getHash());
		result.append('\\');
		result.append('n');
		
		result.append('[');
		
		//print the states of all processes
		boolean first = true;
		for(EObject obj : step.getChangeableNodes()){
			if (obj instanceof Carprocess){
				
				//place delimiter before all entries but the first one
				if (!first){
					result.append('|');
				}
				
				Carprocess cProc = (Carprocess) obj;
				result.append(cProc.getCurState().getActive().getName());
				
				//print message if any
				if (cProc.getQueue().getMessages().size() > 0){
					result.append('{');
					
					boolean firstMsg = true;
					for(Message m : cProc.getQueue().getMessages()){
						if(!firstMsg){
							result.append(',');
						}
						
						result.append(m.getName());
						firstMsg = false;
					}
					
					result.append('}');
				}
				
				first = false;
				
			}
		}
		
		result.append(']');
		
		return result.toString();
	}

	
}
