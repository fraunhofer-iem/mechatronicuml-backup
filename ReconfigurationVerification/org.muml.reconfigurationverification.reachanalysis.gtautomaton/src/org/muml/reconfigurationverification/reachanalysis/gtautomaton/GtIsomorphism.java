package org.muml.reconfigurationverification.reachanalysis.gtautomaton;

import org.eclipse.emf.ecore.EObject;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.storydiagram.reachanalysis.sdm.Isomorphism;


public class GtIsomorphism extends Isomorphism{
	
	/**
	 * This method implements the first step of the isomorphism computation.
	 * It iterates the leftGraph and adds an entry to the candidates map
	 * that has the object of the leftGraph as a key and all objects of
	 * the rightGraph having the same attribute values to the value list.
	 * @return true, if at least one candidate could be identified for each object of the 
	 * leftGraph, false otherwise
	 */
	protected boolean fillCandidatesList(){
		boolean success = true;
		
		//initialize variables
		int i = 0;
		String currentLeftIdentifier = null;
		EObject currentRightObject = null;
		
		
		//iterate all objects of the leftGraph
		for(EObject curLeftObj : this.getLeftStepGraph().getChangeableNodes()){
					
			//obtain object of the left graph
			this.leftMapping[i] = curLeftObj;
			currentRightObject=null;
			
			//get Identifier and search for object with the same identifier in the right graph
			currentLeftIdentifier = ((GtStepGraph)this.getLeftStepGraph()).getObjectIdentifier().getIdentifier(curLeftObj);
			currentRightObject = ((GtStepGraph)this.getRightStepGraph()).getObjectIdentifier().getEObject(currentLeftIdentifier);
			
			//if object with the same identifier exists, add it to the candidates
			if(currentRightObject != null){
				rightMapping[i] = currentRightObject;
			} else{
				success = false;
				break;
			}
			
			i++;	
		}
		
		return success;
		
	}
	
	
	@Override
	protected boolean createInitialMapping() {
		//no actions necessary
		return true;
	}
	
	protected boolean identifyMapping(){
		//there only exists one possible mapping that is defined by the identifiers
		return false;
	}
	
}

