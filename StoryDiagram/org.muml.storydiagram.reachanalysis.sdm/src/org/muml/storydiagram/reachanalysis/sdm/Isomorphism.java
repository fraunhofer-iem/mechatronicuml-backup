package org.muml.storydiagram.reachanalysis.sdm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * This class represents and computes an isomorphism relation between 
 * two {@link StepGraph} objects.
 * @author Christian
 *
 */
public class Isomorphism {

	/**
	 * The one graph ...
	 */
	private StepGraph leftGraph;
	
	/**
	 * ... and the other graph.
	 */
	private StepGraph rightGraph;
	
	/**
	 * The mapping represents the isomorphism function. This array
	 * contains the objects of the left graph, the object of the right graph matched to
	 * this object is mapped to is placed in rightMapping at the same position.
	 */
	protected EObject[] leftMapping;
	
	/**
	 * The mapping represents the isomorphism function. This array
	 * contains the objects of the right graph, the object of the left graph matched to
	 * this object is mapped to is placed in rightMapping at the same position.
	 */
	protected EObject[] rightMapping;
	
	/**
	 * Temporarily stores the the EClass of the object at position i of the mapping.
	 */
	private EClass[] classForMappingPosition;
	
	/**
	 * The hashmap maps EClasses to the objects of that EClass that are contained in the
	 * right graph. They are used for computing the permutations of the objects of a
	 * certain EClass.
	 */
	private HashMap<EClass, List<EObject>> candidatesPerClass;
	
	/**
	 * The Deque for maintaining the choice points that are used for enumerating all possible
	 * isomorphisms between the two graphs.
	 */
	private Deque<ChoicePoint> choicePoints;
	
	/**
	 * The hash set contains all objects that still need to be inserted into the rightMapping.
	 */
	private HashSet<EObject> objectsToMap;
	
	/**
	 * This is a buffer variable that stores the unchangeable nodes of the reachability graph.
	 * The unchangeable nodes do not change during the reachability computation and are
	 * the same for all StepGraphs, but they need to be queried and analyzed regularly. 
	 */
	private EObject[] unchangeableNodes;
	
	/**
	 * Stores an array containing all attributes of the the EClass to prevent 
	 * continuous iteration of the attributes by an iterator.
	 */
	private HashMap<EClass, EAttribute[]> classAttributes;
	
	/**
	 * Stores an array containing all non-derived to-one references of the the EClass to prevent 
	 * continuous iteration of the references by an iterator.
	 */
	private HashMap<EClass, EReference[]> classToOneReferences;
	
	/**
	 * Stores an array containing all non-derived to-many references of the the EClass to prevent 
	 * continuous iteration of the references by an iterator.
	 */
	private HashMap<EClass, EReference[]> classToManyReferences;
	
	public Isomorphism(){
		classAttributes = new HashMap<EClass, EAttribute[]>();
		classToOneReferences = new HashMap<EClass, EReference[]>();
		classToManyReferences = new HashMap<EClass, EReference[]>();
	}
	
	/**
	 * Init function taking the two graphs which shall be compared as 
	 * arguments. It initializes all of the variables used for computing the isomorphism.
	 * @param leftGraph
	 * @param rightGraph
	 */
	protected void init(StepGraph leftGraph, StepGraph rightGraph){
		this.leftGraph = leftGraph;
		this.rightGraph = rightGraph;
		int size = leftGraph.getChangeableNodes().size();
		this.leftMapping = new EObject[size];
		this.rightMapping = new EObject[size];
		this.classForMappingPosition = new EClass[size];
		this.choicePoints = new ArrayDeque<ChoicePoint>();
		this.objectsToMap = new HashSet<EObject>((int) (size*1.5));
		
		//initialize unchangeable nodes if they do not have been initialized before
		if(unchangeableNodes == null){
			List<EObject> unchangeableGraphNodes = leftGraph.getUnchangeableNodes();
			unchangeableNodes = new EObject[unchangeableGraphNodes.size()];
			
			//copy all elements from the list into the array
			int i = 0;
			for(EObject curObj : unchangeableGraphNodes){
				unchangeableNodes[i] = curObj;
				i++;
			}
		}
	}
	
	/**
	 * Computes an isomorphism based on the graphs that have been
	 * passed to this object.
	 * @return true if an isomorphism could be found, false otherwise 
	 */
	public boolean computeIsomorphism(StepGraph leftGraph, StepGraph rightGraph){
		boolean success = true;
		
		//initialize
		init(leftGraph, rightGraph);
		
		//Step 0: Check for same number of objects
		if (leftGraph.getChangeableNodes().size() != rightGraph.getChangeableNodes().size()){
			success = false;
		}
		
		//Step 1: Identify candidates for the isomorphism
		if(success){
			success = fillCandidatesList();
		}
		
		//Step 2: establish initial mapping from the candidates
		if (success){
			success = createInitialMapping();
		}
		
		//Step 3: check whether there are more objects that need to be mapped
		if(objectsToMap.isEmpty()){
			//if no more objects need to be mapped, the initial mapping produced
			//the only possible isomorphism
			success = validateMapping();
		} else {
			// check references between the objects, identify correct candidates
			success = identifyMapping();
		}

		return success;
	}
	
	/**
	 * This method implements the first step of the isomorphism computation.
	 * It fills the leftMapping with the objects of the leftGraph and 
	 * stores for each EClass used in the rightGraph a list of all
	 * objects of this EClass appearing in the right graph.
	 * @return true, if the rightGraph contains the same number of objects
	 * of each EClass as the leftGraph, false otherwise
	 */
	protected boolean fillCandidatesList(){
		boolean success = true;
		
		//write all objects of the left graph to the leftMapping
		int i = 0;
		for(EObject curLeftObj : leftGraph.getChangeableNodes()){
			leftMapping[i] = curLeftObj;
			classForMappingPosition[i] = curLeftObj.eClass();
			i++;
		}
		
		candidatesPerClass = new HashMap<EClass, List<EObject>>();
		
		//add all objects of the rightGraph to the lists of objects
		for(EObject curRightObj : rightGraph.getChangeableNodes()){
			//get EClass of the right object
			EClass clazz = curRightObj.eClass();
			
			//retrieve list for that EClass from the map and add object
			if(candidatesPerClass.containsKey(clazz)){
				candidatesPerClass.get(clazz).add(curRightObj);
			} else {
				List<EObject> list = new ArrayList<EObject>();
				list.add(curRightObj);
				candidatesPerClass.put(clazz, list);
			}
			
		}
		
		//check that the right graph has the same number of objects of every class
		//as the left graph
		for(EClass clazz : candidatesPerClass.keySet()){
			
			int numOfObjects = 0;
			
			for(i = 0; i < leftMapping.length; i++){
				if(leftMapping[i].eClass() == clazz){
					numOfObjects++;
				}
			}
			
			if (numOfObjects != candidatesPerClass.get(clazz).size()){
				success = false;
				break;
			}
			
		}
		
		//add all objects of the right graph to the objectsToMap
		objectsToMap.addAll(rightGraph.getChangeableNodes());
		
		return success;
	}
	
	/**
	 * Helper function that adds all objects of the rightGraph to the
	 * rightMapping where only one possibility for the mapping exists.
	 * This is the case if only one object of an EClass exists in the
	 * rightGraph. Then, each possible isomorphism must
	 * map these objects to each other. As a result, the corresponding
	 * list of objects is removed from the candidatesPerClass map such
	 * that all lists in the candidatesPerClass map contain at least 
	 * two objects.
	 */
	protected boolean createInitialMapping(){
		
		boolean success = true;
		boolean finished = false;
		
		//add objects to the right mapping for which only a single choice exists as
		//long as objects can be added
		while(success && !finished){
			List<EObject> result = checkSingleChoiceInsertions();
			if(result != null){
				finished = result.isEmpty();
			} else {
				//object, for which only a single choice exists, could not be mapped
				//thus, there can't be an isomorphism
				success = false;
			}
		}
		
		return success;
	}
	

	
	/**
	 * Checks whether objects can be inserted into the rightMapping where only one 
	 * possibility exists. If so, these objects are inserted into the graph and
	 * returned. If an error is detected such that an object cannot be inserted
	 * at a place where it needs to be inserted, null is returned.
	 * @return
	 */
	protected List<EObject> checkSingleChoiceInsertions(){
		List<EObject> result = new ArrayList<EObject>();

		//add all objects where only one candidatePerClass exists
		Iterator<Map.Entry<EClass,List<EObject>>> iter = candidatesPerClass.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<EClass,List<EObject>> curEntry = iter.next();
			if(curEntry.getValue().size() == 1){
				//iterate objects of the leftMapping to find insertion field
				for(int i = 0; i < leftMapping.length; i++){
					if(leftMapping[i].eClass() == curEntry.getKey() && rightMapping[i] == null){
						
						EObject value = curEntry.getValue().get(0);
						
						//insert, because for the object, there is no other choice
						if(addObjectToRightMapping(value, i)){
							result.add(value);
							break;
						} else {
							//insertion returned with an error, return error
							removeAllObjectsFromRightMapping(result);
							return null;
						}
					}
				}
			}
		}
		
		//check already inserted objects whether they refer to additional objects where
		//only one choice exists
		for(int i = 0; i < rightMapping.length; i++){

			if(rightMapping[i] != null){
				
				//check attributes that reference an EObject via a wrapped JavaObject that is contained in the graph
				EAttribute[] attributes = getClassAttributes(rightMapping[i].eClass());
				for(int j = 0; j < attributes.length; j++){
					Object leftValue = leftMapping[i].eGet(attributes[j]);
					
					if(leftValue instanceof EObject){
						int leftIndex = getObjectInLeftMapping(leftValue);
						Object rightValue = rightMapping[i].eGet(attributes[j]);
						
						//if rightValue is not an EObject -> return error because leftValue is EObject and, thus, there can't be an isomorphism
						if(!(rightValue instanceof EObject)){
							removeAllObjectsFromRightMapping(result);
							return null;
						}
						
						//try to insert into the graph
						if(leftIndex >= 0){
							//object is contained in the left graph (and thus changeable), check index in the right mapping
							//if an object is located at the specified index, do nothing (validation will fail)
							if(rightMapping[leftIndex] == null){

								//field in the rightMapping is still empty although this is a graph node => insert!
								//insert, because for the object, there is no other choice
								if(addObjectToRightMapping((EObject)rightValue, leftIndex)){
									result.add((EObject)rightValue);
								} else {
									//insertion returned with an error, return error
									removeAllObjectsFromRightMapping(result);
									return null;
								}

							} else {;} //prevent dangling else problem by empty else clause
						} else { 
							//object is not contained in the leftMapping, check if it is unchangeable
							if(isObjectInUnchangeableNodes(leftValue)){
								//if the reference points to an unchangeable node, the object of the leftGraph
								//and the object to be inserted into the right graph must point
								//to exactly the same unchangeable node to be isomorphic
								if(leftValue != rightValue){
									//inserted object is misplaced, return error
									removeAllObjectsFromRightMapping(result);
									return null;
								}
							}
						}
					}
				}
				
				//check to-one references
				EReference[] references = getClassToOneReferences(rightMapping[i].eClass());
				for(int j = 0; j < references.length; j++){
					EReference curRef = references[j];

					//retrieve objects the leftMapping and rightMapping point to
					Object refLeftValue = leftMapping[i].eGet(curRef);
					Object refRightValue = rightMapping[i].eGet(curRef);

					//check that either both are null or both are not null (xor)
					if (refLeftValue == null ^ refRightValue == null){
						//inserted object is misplaced, return error
						removeAllObjectsFromRightMapping(result);
						return null;
					} else if(refLeftValue == null && refRightValue == null){ //both are null => OK, nothing to check
						continue;
					} else { //both references point to objects => check the objects

						int leftIndex = getObjectInLeftMapping(refLeftValue);

						if(leftIndex >= 0){
							//object is contained in the left graph (and thus changeable), check index in the right mapping
							//if an object is located at the specified index, do nothing (validation will fail)
							if(rightMapping[leftIndex] == null){

								//field in the rightMapping is still empty although this is a graph node => insert!
								//insert, because for the object, there is no other choice
								if(addObjectToRightMapping((EObject)refRightValue, leftIndex)){
									result.add((EObject)refRightValue);
								} else {
									//insertion returned with an error, return error
									removeAllObjectsFromRightMapping(result);
									return null;
								}

							} else {;} //prevent dangling else problem by empty else clause
						} else { 
							//object is not contained in the leftMapping, check if it is unchangeable
							if(isObjectInUnchangeableNodes(refLeftValue)){
								//if the reference points to an unchangeable node, the object of the leftGraph
								//and the object to be inserted into the right graph must point
								//to exactly the same unchangeable node to be isomorphic
								if(refLeftValue != refRightValue){
									//inserted object is misplaced, return error
									removeAllObjectsFromRightMapping(result);
									return null;
								}
							}
						}

					}
				} //End for iteration of to-one references
				
				
				//check to-many references that only reference one node
				references = getClassToManyReferences(rightMapping[i].eClass());
				for(int j = 0; j < references.length; j++){
					EReference curRef = references[j];
					Collection leftContainer = (Collection) leftMapping[i].eGet(curRef);
					Collection rightContainer = (Collection)rightMapping[i].eGet(curRef);
					
					//retrieve all referenced graph objects that are not yet inserted
					List<EObject> unassignedObjects = candidatesPerClass.get(curRef.getEReferenceType());
					if(unassignedObjects == null || unassignedObjects.isEmpty()){
						//no graph objects or no objects to insert
						continue;
					}
					
					//add object if it is contained in the rightGraph, but is still unassigned
					List<EObject> referencedObjects = new ArrayList<EObject>();
					for(Object obj : rightContainer){
						if(rightGraph.getChangeableNodes().contains(obj) &&
								unassignedObjects.contains(obj)){
							referencedObjects.add((EObject)obj);
						}
					}
					
					if(referencedObjects.size() == 1){
						//there is only one unassigned object, and thus, only one choice
						//insert!
						EObject insertedObject = referencedObjects.get(0);
						
						//search insertion position
						int leftIndex = -1;
						boolean doInsert = false;
						for(Object obj : leftContainer){
							leftIndex = getObjectInLeftMapping(obj);
							if(leftIndex >= 0 && rightMapping[leftIndex] == null){
								doInsert = true;
								break;
							}
						}
						
						//do not write to a location where an object is already located
						if(!doInsert) continue;
						
						//insert!
						if(addObjectToRightMapping(insertedObject, leftIndex)){
							result.add(insertedObject);
						} else {
							//insertion returned with an error, return error
							removeAllObjectsFromRightMapping(result);
							return null;
						}
					}
				}
				
				
			}//End for iteration of rightMapping
		}
		
		return result;
	}

	/**
	 * Helper function that adds an object to the right mapping. The object is inserted at position i. In addition,
	 * all objects that the inserted object references by to-one references are added to the right mapping because
	 * there is no choice for them being at a different position. These objects are returned via 
	 * insertedDependingObjects. If the insertion fails, because a to-one referenced object cannot be added to the
	 * graph, the function returns false. If this function returns false, the rightMapping is not changed.
	 * @param object an object of the rightGraph
	 * @param position the position where the object should be inserted
	 * @param insertedDependingObjects
	 * @return
	 */
	protected boolean addObjectToRightMapping(EObject object, int position){
		
		//guard against NPE
		if(object == null) return false;
		
		//guard against exception
		if(position < 0 || position >= rightMapping.length) return false;
		
		//check conditions for inserting the object
		boolean success = checkAttributeEquality(leftMapping[position], object);

		success = success && checkToManyReferenceCardinalities(leftMapping[position], object);
		
		
		//if insertion was successful, update data structures and return true
		if(success){
			//add the object
			rightMapping[position] = object;
			
			//objects have been mapped, remove from objects to map set
			objectsToMap.remove(object);
			candidatesPerClass.get(object.eClass()).remove(object);
			
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Helper function that removes all objects specified by the
	 * parameter list <emph>objects</emph> from the rightMapping. As a
	 * postcondition, the rightMapping array contains null at the positions
	 * where the objects were located. The objects that are removed
	 * are inserted into the objectsToMap and candidatesPerClass data structures.
	 * @param objects
	 */
	protected void removeAllObjectsFromRightMapping(List<EObject> objects){
		for(EObject curObj : objects){
			removeObjectFromRightMapping(getObjectInRightMapping(curObj));
		}
	}
	
	/**
	 * Helper function that removes all objects specified by the
	 * parameter array <emph>objects</emph> from the rightMapping. As a
	 * postcondition, the rightMapping array contains null at the positions
	 * where the objects were located. The objects that are removed
	 * are inserted into the objectsToMap and candidatesPerClass data structures.
	 * @param objects
	 */
	protected void removeAllObjectsFromRightMapping(EObject[] objects){
		for(EObject curObj : objects){
			removeObjectFromRightMapping(getObjectInRightMapping(curObj));
		}
	}
	
	/**
	 * Helper function that removes an object from the rightMapping. As a
	 * postcondition, the rightMapping array contains null at the position
	 * given as a parameter. The object located at the specified position
	 * is inserted into the objectsToMap and candidatesPerClass data structures.
	 * @param position
	 */
	protected void removeObjectFromRightMapping(int position){
		
		//guard against exception
		if(position < 0 || position >= rightMapping.length) return;
		
		//add object to the list of objects that need to be mapped
		objectsToMap.add(rightMapping[position]);
		candidatesPerClass.get(rightMapping[position].eClass()).add(rightMapping[position]);
		
		//finally remove the object itself
		rightMapping[position] = null;
	}
	
	/**
	 * Helper function which is used to check whether two objects have the same values
	 * for all attributes. The two provided objects must have the same types.
	 * @param obj1 
	 * @param obj2
	 * @return
	 */
	protected boolean checkAttributeEquality(EObject obj1, EObject obj2){
		boolean equal = true;
		
		EClass obj1Clazz = obj1.eClass();
		if(obj1Clazz != obj2.eClass()) return false;
		
		//compare all attribute values
		EAttribute[] attrs = getClassAttributes(obj1Clazz);
		int i = 0;
		while(equal && i < attrs.length){
			EAttribute curAttribute = attrs[i];
			
			//get attribute values of both objects
			Object attributeValue1 = obj1.eGet(curAttribute);
			Object attributeValue2 = obj2.eGet(curAttribute);
			
			//compare values if both values are not null
			if(attributeValue1 == null && attributeValue2 == null){
				; // equal remains true in this case; case, however, needs to be checked
			}
			else if(attributeValue1 != null && attributeValue2 != null){
				if(attributeValue1 instanceof EObject && attributeValue2 instanceof EObject){
					; // do nothing -> in principle a reference, needs to be checked as one
				} else {
					equal = attributeValue1.equals(attributeValue2);
				}
			} //if one attribute is null and the other isn't => not equal
			else {
				equal = false;
			}

			i++;
		}
		
		return equal;
	}
	
	/**
	 * Helper function that checks whether all to-many references of the objects given as parameters
	 * contain an equal number of objects. The function returns true if all to-many references indeed
	 * contain the same number of objects. It returns false, otherwise.
	 * @param leftGraphObj
	 * @param rightGraphObj
	 * @return
	 */
	protected boolean checkToManyReferenceCardinalities(EObject leftGraphObj, EObject rightGraphObj) {
		//check all to-many references
		int j = 0;
		EReference[] references = getClassToManyReferences(rightGraphObj.eClass());
		while(j < references.length){
			EReference curRef = references[j];
			j++;

			//get values
			Collection srcContainer = (Collection) leftGraphObj.eGet(curRef);
			Collection tgtContainer = (Collection)rightGraphObj.eGet(curRef);

			if(srcContainer.size() != tgtContainer.size()) return false;

		}//End While of iteration of to-many references
		return true;
	}
	
	/**
	 * Based on the initial mapping and the candidates to complete the mapping,
	 * this method identifies one possible, isomorphic mapping of objects of the
	 * left graph to objects of the right graph and stores it in the mapping arrays.
	 * @return true if a mapping could be found, false otherwise
	 */
	protected boolean identifyMapping(){
		boolean success = false;
		
		//create initial choice point
		ChoicePoint cp = createChoicePoint();
		if(cp == null){
			//no choice point could be created based on the initial mapping => no isomorphism exists
			return false;
		} else {
			choicePoints.offer(cp);
		}
		
		//validate mappings until one has been found or until no more mappings exist
		while(!success && generateNextMapping()){
			success = validateMapping();
		}
		
		return success;
	}
	
	/**
	 * Assigns one possilbe mapping to the mapping arrays, i.e., for each node of the
	 * left graph that may be mapped to multiple nodes of the right graph, one node of
	 * the right graph is chosen. Each call to this method will generate a new mapping
	 * thereby replacing the old one in the mapping arrays. The method guarantees to 
	 * produce each possible combination and it guarantees to produce it exactly once.
	 * @return true if a new mapping was produced, false otherwise
	 */
	protected boolean generateNextMapping(){
		boolean success = false;
		
		//generate next mapping
		boolean finished = false;
		while(!finished && !choicePoints.isEmpty()){
			if (choicePoints.peekLast().hasNext()){
				ChoicePoint curCP = choicePoints.peekLast();
				
				if(handleNextChoice(curCP) == false){
					continue;
				}
				
				//check whether all objects have been inserted
				if(!objectsToMap.isEmpty()){
					ChoicePoint cp = createChoicePoint();
					
					if(cp == null){
						//no additional choice point is possible based on the selection
						//of the current peek object => try next selection
						continue;
					}
					
					choicePoints.offerLast(cp);
				}
				finished = objectsToMap.isEmpty();
				success = true;
			} else { 
				/* no further choices for the current peek element
				 * remove elements until the peek has a next element,
				 * if stack is empty, no more choices exist
				 */ 
				ChoicePoint cp = choicePoints.pollLast();
				removeAllObjectsFromRightMapping(cp.getAdditionallyCreatedObjects());
				removeAllObjectsFromRightMapping(cp.getContainedObjects());
			}
		}
		
		return success;
	}
	
	/**
	 * Applies the next choice of the choice point given as a parameter to the rightMapping.
	 * Therefore, it first undos the modification of the previous choice before applying the next one.
	 * This method requires that a valid next choice exists.
	 * If the choice cannot be inserted into the graph without violating the attribute equivalence
	 * condition for associated objects, it returns false. It returns true, if all objects could
	 * be successfully inserted into the rightMapping.
	 * @param curCP
	 * @return
	 */
	protected boolean handleNextChoice(ChoicePoint curCP){
		//remove objects that were additionally added by the old permutation
		if(curCP.getAdditionallyCreatedObjects() != null){
			removeAllObjectsFromRightMapping(curCP.getAdditionallyCreatedObjects());
		}
		
		EObject[] permutation = curCP.next();
		
		for(int i = 0; i < permutation.length; i++){
			if (addObjectToRightMapping(permutation[i], curCP.getInsertionPositions()[i]) == false){
				//this choice does not fit, loop to get the next one, created objects will be removed by next one
				return false;
			}
		}
		
		
		//add objects to the right mapping for which only a single choice exists as
		//long as objects can be added
		List<EObject> addedObjects = new ArrayList<EObject>();
		boolean success = true;
		boolean finished = false;
		while(success && !finished){
			List<EObject> result = checkSingleChoiceInsertions();
			if(result != null){
				finished = result.isEmpty();
				addedObjects.addAll(result);
			} else {
				//object, for which only a single choice exists, could not be mapped
				//thus, there can't be an isomorphism
				success = false;
			}
		}

		if(!success){
			//insertion of depending objects failed => not a valid choice
			removeAllObjectsFromRightMapping(addedObjects);
			return false;
		}
		curCP.setAdditionallyCreatedObjects(addedObjects);
		
		return true;
	}
	
	/**
	 * Helper function that creates a new choice point based on the objectsToMap 
	 * hash set. It searches a reference of an object already contained in the 
	 * rightMapping which has a to-many reference to at least one of the objects
	 * which needs to be mapped. If no such object exists, it selects the smallest
	 * set from the candidatesPerClass hash map and creates a choice point for that map.
	 * The function returns a valid choice point or null if no choice point could be created.
	 * @return
	 */
	protected ChoicePoint createChoicePoint(){
		ChoicePoint result = null;
				
		//search assigned object that references these objects and that has not yet been used
		for(int i = 0; i < rightMapping.length && result == null; i++){
			
			//check whether there is an object at this position
			if(rightMapping[i] != null){
				
				//check outgoing references of the object at position i
				EReference[] outgoingReferences = getClassToManyReferences(rightMapping[i].eClass());
				for(int j = 0; j < outgoingReferences.length && result == null; j++){
					
					//check whether there is already a choice point for that object and that reference
					if(existsChoicePoint(rightMapping[i], outgoingReferences[j])){
						continue;
					}
					
					//whether objects of the references type are contained in the graph 
					if(candidatesPerClass.containsKey(outgoingReferences[j].getEReferenceType())){
						//reference points to the right type, check objects for choice point
						Collection rightContainer = (Collection)rightMapping[i].eGet(outgoingReferences[j]);
						
						//continue if no elements are contained in this reference
						if(rightContainer.size() == 0){
							continue;
						}

						//search all objects that are referenced for objects that
						//are contained in the graph and not have been assigned to the mapping
						List<EObject> referencedObjects = new ArrayList<EObject>();
						List<Integer> occupiedPositions = new ArrayList<Integer>(); 
						for(Object curObj : rightContainer){
							int posInRightMapping = getObjectInRightMapping((EObject)curObj);
							if(rightGraph.getChangeableNodes().contains(curObj)){
								if(posInRightMapping == -1){
									referencedObjects.add((EObject)curObj);
								} else {
									occupiedPositions.add(posInRightMapping);
								}
							}

						}

						//continue with next reference if none of the objects is 
						//contained in the graph and unassigned
						if(referencedObjects.size() == 0){
							continue;
						}

						//search insertion points
						Collection leftContainer = (Collection)leftMapping[i].eGet(outgoingReferences[j]);
						List<Integer> insertionPositions = new ArrayList<Integer>();
						for(Object curObj : leftContainer){
							//if object is contained in the left mapping and it is not located in a position
							//where an object has already been mapped to, add position to the list of insertion positions
							int posInLeftMapping = getObjectInLeftMapping((EObject)curObj);
							if(posInLeftMapping >= 0 && !occupiedPositions.contains(posInLeftMapping)){
								insertionPositions.add(posInLeftMapping);
							}
						}
						
						//should not happen, but if it happens, that is not a valid choice point
						if(referencedObjects.size() != insertionPositions.size()){
							continue;
						}
						
						//create choice point
						result = new ChoicePoint(rightMapping[i], outgoingReferences[j], referencedObjects, insertionPositions);
					}
				}
			}
		}
		
		
		//if no choice point has been created so far, create choice point for the set
		//with the least number of elements without using an object and reference
		if(result == null){
			int size = Integer.MAX_VALUE;
			List<EObject> list = null;
			EClass clazz = null;
			for(Map.Entry<EClass, List<EObject>> curEntry : candidatesPerClass.entrySet()){
				int listSize = curEntry.getValue().size();
				if(listSize < size && listSize > 0){
					size = listSize;
					list = curEntry.getValue();
					clazz = curEntry.getKey();
				}
			}


			//find insertion points => positions where the leftMapping contains an object of the right type
			//while the rightMapping does not contain an object at this position
			List<Integer> insertionPositions = new ArrayList<Integer>();
			for(int i = 0; i < leftMapping.length; i++){
				if(leftMapping[i].eClass() == clazz && rightMapping[i] == null){
					insertionPositions.add(i);
				}
			}
			
			if(insertionPositions.size() == list.size()){
				result = new ChoicePoint(null, null, list, insertionPositions);
			}
		}
		
		return result;
	}
	
	/**
	 * Helper function that returns true if the choicePoints deque already contains
	 * a ChoicePoint for the object and reference given as a parameter and false otherwise.
	 * @param obj 
	 * @param ref
	 * @return
	 */
	protected boolean existsChoicePoint(EObject obj, EReference ref){
		//iterate all choice points and search for an entry with the given object and reference
		for(ChoicePoint cp : choicePoints){
			if(cp.getTheObject() == obj && cp.getTheReference() == ref){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * For a given mapping of objects of the leftGraph to objects of the rightGraph, 
	 * this method validates whether this mapping represents an isomorphism function or not.
	 * @return true if the mapping is a valid isomorphism, false otherwise
	 */
	protected boolean validateMapping(){
		boolean success = true;
		
		//check that each object of the rightGraph occurs only once in the rightMapping
		for(int i = 0; i < rightMapping.length; i++){
			for(int j = 0; j < rightMapping.length; j++){
				if(i!= j && rightMapping[i] == rightMapping[j]){
					success = false;
					break;
				}
			}

			if (!success) break;
		}
		
		//compare all objects
		int i = 0;
		while(success && i < leftMapping.length){
			//iterate objects of the left graph
			EObject curLeftObj = leftMapping[i];
			EObject curRightObj = rightMapping[i];
			
			//check whether they have the same attribute values
			if (checkAttributeEquality(curLeftObj, curRightObj) == false){
				success = false;
				continue;
			}
			
			//
			int j = 0;
			EAttribute[] attributes = getClassAttributes(curLeftObj.eClass());
			while(success && j < attributes.length){
				EAttribute curAttr = attributes[j];
				j++;
				
				//retrieve objects the curLeftObj and curRightObj point to
				Object leftValue = curLeftObj.eGet(curAttr);
				Object rightValue = curRightObj.eGet(curAttr);
				
				//either both must be EObject or both must not -> otherwise attributes differ
				if(leftValue instanceof EObject ^ rightValue instanceof EObject){
					success = false;
				} else {
					//both references either point to EObjects or to plain objects => check the objects
					if(leftValue instanceof EObject && leftGraph.getChangeableNodes().contains(leftValue)){
						//leftValue points to an object also contained in the left graph => check that 
						//rightValue points to an object isomorphic to the object 
						//of the left graph => is the case if the point to the same array index of the mapping
						success = areIsomorphicObjects((EObject)leftValue, (EObject)rightValue);
					} else if(isObjectInUnchangeableNodes(leftValue)){
						//if the reference points to an unchangeable node, curLeftObj and curRightObj must point
						//to exactly the same unchangeable node to be isomorphic
						success = (leftValue == rightValue);
					}
				}
			}
			
			//check all to-one references
			j = 0;
			EReference[] references = getClassToOneReferences(curLeftObj.eClass());
			while(success && j < references.length){
				EReference curRef = references[j];
				j++;

				//retrieve objects the curLeftObj and curRightObj point to
				Object refLeftValue = curLeftObj.eGet(curRef);
				Object refRightValue = curRightObj.eGet(curRef);

				//check that either both are null or both are not null (xor)
				if (refLeftValue == null ^ refRightValue == null){
					success = false;
				} else {
					//both references either point to null (which is OK) or to objects => check the objects
					if(leftGraph.getChangeableNodes().contains(refLeftValue)){
						//curLeftObj points to an object also contained in the left graph => check that 
						//curRightObj points to an object isomorphic to the object 
						//of the left graph => is the case if the point to the same array index of the mapping
						success = areIsomorphicObjects((EObject)refLeftValue, (EObject)refRightValue);
					} else if(isObjectInUnchangeableNodes(refLeftValue)){
						//if the reference points to an unchangeable node, curLeftObj and curRightObj must point
						//to exactly the same unchangeable node to be isomorphic
						success = (refLeftValue == refRightValue);
					}
				}
			} //End While iteration of to-one references		
			
			//check all to-many references
			j = 0;
			references = getClassToManyReferences(curLeftObj.eClass());
			while(success && j < references.length){
				EReference curRef = references[j];
				j++;

				Collection srcContainer = (Collection)curLeftObj.eGet(curRef);
				Collection tgtContainer = (Collection)curRightObj.eGet(curRef);

				//objects will only be isomorphic if they reference the same number of objects in this reference
				if(srcContainer.size() != tgtContainer.size()) {
					success = false;
					continue;
				}

				//iterate all objects that are referenced by this to-many link
				for(Object elem : srcContainer){
					if (elem instanceof EObject){ //only consider EObjects, because our graphs may only contains those
						//check whether EObject elem is contained in the source graph
						if (leftGraph.getChangeableNodes().contains(elem)){
							boolean matchFound = false;

							//iterate objects of the right graph
							for(Object rightElem : tgtContainer){
								if(rightElem instanceof EObject){
									//check whether object of right graph is isomorphic to the object of the left graph
									matchFound = areIsomorphicObjects((EObject)elem, (EObject)rightElem);
									if(matchFound) break;
								}
							}

							//if no match has been found for an object of the left graph, no isomorphism function exists between
							//these two graphs
							if(!matchFound){
								success = false;
								break;
							}
						} else if(isObjectInUnchangeableNodes(elem)){
							//if the reference points to an unchangeable node, curLeftObj and curRightObj must point
							//to exactly the same unchangeable node to be isomorphic
							//iterate objects of the right graph
							boolean matchFound = false;

							for(Object rightElem : tgtContainer){
								if(rightElem instanceof EObject){
									//check whether both objects point to the same unchangeable node
									matchFound = (elem == rightElem);
									if(matchFound) break;
								}
							}

							//if no match has been found for an object of the left graph, no isomorphism function exists between
							//these two graphs
							if(!matchFound){
								success = false;
								break;
							}
						}
					}//End if (elem instanceof EObject) 
				}//End For of iteration of objects within to-many reference

			}//End While of iteration of to-many references

			i++;
		} // End While iteration of leftMapping
		
		return success;
	}
	
	/**
	 * Helper function that checks whether two objects, one of the leftGraph and one of the 
	 * rightGraph, are considered to be isomorphic in the current mapping.
	 * @param leftObj
	 * @param rightObj
	 * @return true, if they are considered to be isomorphic, false otherwise
	 */
	protected boolean areIsomorphicObjects(EObject leftObj, EObject rightObj){
		//locate object in the leftMapping array
		for(int j = 0; j < leftMapping.length; j++){
			if (leftMapping[j] == leftObj){
				//found object on the left side, check that rightObj is placed at the same index
				//in the right mapping, otherwise they are not isomorphic under the current mapping
				if(rightMapping[j] == rightObj){
					//same object in the right graph => isomorphic
					return true;
				}
				break;
			}
		}
		
		return false;
	}
	
	/**
	 * Helper function that checks whether the object given as a parameter is contained
	 * in the set of unchangeable nodes of the reachability graph that is currently computed.
	 * @param obj
	 * @return true, if the object obj is contained in the unchangeable nodes, false otherwise
	 */
	protected boolean isObjectInUnchangeableNodes(Object obj){
		for(int i = 0; i < unchangeableNodes.length; i++){
			if (unchangeableNodes[i] == obj){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Helper function that returns the index of the object given as a parameter in the leftMapping.
	 * If the object is null or not contained in the leftMapping, the function returns -1.
	 * @param obj
	 * @return
	 */
	protected int getObjectInLeftMapping(Object obj){
		if(obj == null) return -1;
		
		for(int i = 0; i < leftMapping.length; i++){
			if(leftMapping[i] == obj){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Helper function that returns the index of the object given as a parameter in the rightMapping.
	 * If the object is null or not contained in the rightMapping, the function returns -1.
	 * @param obj
	 * @return
	 */
	protected int getObjectInRightMapping(Object obj){
		if(obj == null) return -1;
		
		for(int i = 0; i < rightMapping.length; i++){
			if(rightMapping[i] == obj){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Helper class that returns an array containing all EAttributes of
	 * the EClass given as a parameter. 
	 * @param clazz
	 * @return
	 */
	protected EAttribute[] getClassAttributes(EClass clazz){
		EAttribute[] result = classAttributes.get(clazz);
		
		//check if result is null
		if(result == null){
			//then analyze attributes of class and add to the map
			List<EAttribute> attrs = clazz.getEAllAttributes();
			result = new EAttribute[attrs.size()];
			
			int i = 0;
			for(EAttribute curAttr : attrs){
				result[i] = curAttr;
				i++;
			}
			
			classAttributes.put(clazz, result);
		}
		
		return result;
	}
	
	/**
	 * Helper class that returns an array containing all to-one EReferences of
	 * the EClass given as a parameter. 
	 * @param clazz
	 * @return
	 */
	protected EReference[] getClassToOneReferences(EClass clazz){
		EReference[] result = classToOneReferences.get(clazz);
		
		//check if result is null
		if(result == null){
			createClassReferencesArrays(clazz);
			result = classToOneReferences.get(clazz);
		}
		
		return result;
	}
	
	/**
	 * Helper class that returns an array containing all to-one EReferences of
	 * the EClass given as a parameter. 
	 * @param clazz
	 * @return
	 */
	protected EReference[] getClassToManyReferences(EClass clazz){
		EReference[] result = classToManyReferences.get(clazz);
		
		//check if result is null
		if(result == null){
			createClassReferencesArrays(clazz);
			result = classToManyReferences.get(clazz);
		}
		
		return result;
	}
	
	/**
	 * Helper function that creates array of the to-one and to-many references
	 * of the Class given as a parameter. The two resulting arrays are then
	 * added to the HashMaps classToOneReferences and classToManyReferences.
	 * Derived references are not added to the lists.
	 */
	protected void createClassReferencesArrays(EClass clazz){
		//then analyze references of class and add to a list
		List<EReference> toOneRefs = new ArrayList<EReference>();
		List<EReference> toManyRefs = new ArrayList<EReference>();
		
		List<EReference> refs = clazz.getEAllReferences();
		
		//collect references, skip the derived ones
		for(EReference curRef : refs){
			if(curRef.isDerived()) continue;
			
			if(curRef.getUpperBound() == 1){
				toOneRefs.add(curRef);
			} else {
				toManyRefs.add(curRef);
			}
		}
		
		//copy to-one references to array and add to the map
		int i = 0;
		EReference[] refArray = new EReference[toOneRefs.size()];
		for(EReference curRef : toOneRefs){
			refArray[i] = curRef;
			i++;
		}
		classToOneReferences.put(clazz, refArray);
		
		//copy to-one references to array and add to the map
		i = 0;
		refArray = new EReference[toManyRefs.size()];
		for(EReference curRef : toManyRefs){
			refArray[i] = curRef;
			i++;
		}
		classToManyReferences.put(clazz, refArray);

	}
	
	/**
	 * Returns the "left" StepGraph of the isomorphism computation. This is the graph
	 * which is the source for the computation.
	 * @return
	 */
	public StepGraph getLeftStepGraph(){
		return	leftGraph;
	}
	
	/**
	 * Returns the "right" StepGraph of the isomorphism computation. This is the graph
	 * whose objects are permuted and compared to the "left" StepGraph.
	 * @return
	 */
	public StepGraph getRightStepGraph(){
		return rightGraph;
	}
	
}
