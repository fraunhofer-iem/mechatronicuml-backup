package org.muml.storydiagram.reachanalysis.sdm;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class ChoicePoint {

	
	private EObject theObject;
	
	private EReference theReference;
	
	private Permutation permutation = null;
	
	private List<EObject> additionallyCreatedObjects;

	private EObject[] containedObjects;
	
	private EObject[] currentChoice;
	
	private int[] insertionPositions;
	
	public ChoicePoint(EObject obj, EReference ref, List<EObject> referencedObjects, List<Integer> insertionPos) {
		theReference = ref;
		theObject = obj;
		
		//store objects contained in the list in the array
		containedObjects = new EObject[referencedObjects.size()];
		int i = 0;
		for(EObject curObj : referencedObjects){
			containedObjects[i] = curObj;
			i++;
		}
		
		insertionPositions = new int[referencedObjects.size()];
		i=0;
		for(Integer curPos : insertionPos){
			insertionPositions[i] = curPos.intValue();
			i++;
		}
		
		additionallyCreatedObjects = new ArrayList<EObject>();
	}
	
	
	private void initialize(){
		permutation = new Permutation(containedObjects.length);
	}
	
	
	public boolean hasNext(){
		if(containedObjects.length == 0){
			return false;
		} else if(permutation == null){
			initialize();
			return true;
		} else { //check if another permutation exists
			return permutation.hasNext();
		}
	}
	
	
	public EObject[] next(){

		EObject[] result = null;
		
		if (this.hasNext()){

			//check for init phase, initialize and return initial permutation
			if(permutation == null){
				initialize();
				result = new EObject[containedObjects.length];
				int[] currentPermutation = permutation.next();
				for(int i = 0; i < currentPermutation.length; i++){
					//the position at which the i^th object is inserted is stored
					//at position i of the currentPermutation
					result[i] = containedObjects[currentPermutation[i]];
				}
			} else { //compute next permutation
				result = new EObject[containedObjects.length];
				int[] currentPermutation = permutation.next();
				for(int i = 0; i < currentPermutation.length; i++){
					//the position at which the i^th object is inserted is stored
					//at position i of the currentPermutation
					result[i] = containedObjects[currentPermutation[i]];
				}
			}
		} else {
			permutation = null;
		}

		currentChoice = result;
		return result;
	}
	
	public int getNumberOfContainedObjects(){
		return containedObjects.length;
	}
	
	public EObject getTheObject() {
		return theObject;
	}


	public void setTheObject(EObject theObject) {
		this.theObject = theObject;
	}


	public EReference getTheReference() {
		return theReference;
	}


	public void setTheReference(EReference theReference) {
		this.theReference = theReference;
	}


	public List<EObject> getAdditionallyCreatedObjects() {
		return additionallyCreatedObjects;
	}


	public void setAdditionallyCreatedObjects(List<EObject> createdObjects) {
		this.additionallyCreatedObjects = createdObjects;
	}


	public EObject[] getCurrentChoice() {
		return currentChoice;
	}


	public void setCurrentChoice(EObject[] currentChoice) {
		this.currentChoice = currentChoice;
	}


	public int[] getInsertionPositions() {
		return insertionPositions;
	}


	public void setInsertionPositions(int[] insertionPositions) {
		this.insertionPositions = insertionPositions;
	}


	public EObject[] getContainedObjects() {
		return containedObjects;
	}
	
}
