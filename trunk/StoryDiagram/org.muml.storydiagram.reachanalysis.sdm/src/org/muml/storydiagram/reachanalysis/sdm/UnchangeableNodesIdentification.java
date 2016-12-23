package org.muml.storydiagram.reachanalysis.sdm;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.ObjectVariable;

/**
 * The set of initial graph nodes may contain nodes that are needed 
 * for the reachability analysis, but they are not modified by the 
 * given set of story diagrams. These nodes, however, are part of 
 * every graph which is reachable during the analysis. We call these 
 * nodes unchangeable graph nodes. All nodes which are actually 
 * modified by the given set of story diagrams are called changeable 
 * graph nodes. 
 * 
 * Whether a concrete node remains unchanged by the given set of story
 * diagrams cannot be decided statically. We can, however, decide 
 * whether all nodes of a given class may never be changed. The conditions
 * for nodes of class A to be changeable are as follows:
 *    1. There exists a story diagram which contains an object variable of 
 *       type A which has binding operator CREATE or DESTROY.
 *    2. There exists a story diagram which contains an object variable of 
 *       type of A which has an AttributeAssignment.
 *    3. There exists a story diagram which contains a link variable originating 
 *       from an object of class A which has binding operator CREATE or DESTROY.
 *    4. There exists a story diagram which contains a link variable pointing to 
 *       an object of class A which has binding operator CREATE or DESTROY and which is bidirectional.
 *    5. There exists a class B which is changeable and (recursively) contains 
 *       objects of class A.
 *    6. There exists a class B which is changeable and objects of class A recursively 
 *       contain objects of class B (creating or deleting B changes the reference of A to B)
 *    7. There exists a class B which is changeable and A is a subclass of B (recursively) 
 *       (superclasses of B or not necessarily changeable).
 *    8. There exists a class B which is changeable and objects of class A have
 *       a bidirectional reference to objects of class B.
 * 
 * Then, the conditions for nodes of class A to be unchangable are:
 *    A. A node of class C may only be unchangeable if it is contained in the initial graph nodes.
 *    B. A node of class C may only be unchangeable if C is not considered to be changeable by the above conditions for changeable nodes.
 * 
 * This class encapsulates the functionality for computing the classes
 * of unchangeables nodes based on the initial graph objects and a given
 * set of rules.
 * 
 * Assumptions for the unchangeable node identification:
 *   - all inner classes of the type hierarchy are abstract, i.e., a concrete class has no subclasses
 * 
 * @author Denis B., Christian H.
 */
public class UnchangeableNodesIdentification {

	/**
	 * Identifies nodes which are contained in the initial graph objects and
	 * will never be changed by the rules provided for the reachability
	 * analysis.
	 * 
	 * @param activities
	 *            the activities used for the reachability analysis
	 * @param initialGraphObjects
	 *            the initial graph objects on which the reachability analysis
	 *            is to be started
	 * @return a set of classes, all nodes being an instance of one of these
	 *         classes will be considered to be unchangeable by the provided
	 *         activities
	 * 
	 */
	public Set<EClass> identifyUnchangeableNodes(List<Activity> activities,
			Set<EObject> initialGraphObjects) {
		
		//create result container		
		Set<EClass> unchangeableObjectVariableClasses = new HashSet<EClass>();
		
		//identify which classes are used by the initial graph objects
		Set<EClass> classesOfInitialGraphObjects = identifyClassesOfInitialGraphObjects(initialGraphObjects);
		
		// collect all classes of changeable object variables
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.addAll(classesOfInitialGraphObjects);
		Set<EClass> changeableObjectVariableClasses = identifyChangeableObjectVariables(activities, usedObjectVariableClasses, classesOfInitialGraphObjects);
		
		//only classes of objects being contained in the initial graph objects may be unchangeable (Condition A) 
		unchangeableObjectVariableClasses.addAll(classesOfInitialGraphObjects);
		
		//remove all classes which are considered to be changeable (Condition B)
		unchangeableObjectVariableClasses.removeAll(changeableObjectVariableClasses);

		return unchangeableObjectVariableClasses;
	}

	/**
	 * Identifies all EClasses which are used to type the objects
	 * in the set given as a parameter.
	 * @param initialGraphObjects
	 * @return
	 */
	protected Set<EClass> identifyClassesOfInitialGraphObjects(
			Set<EObject> initialGraphObjects) {
		
		HashSet<EClass> result = new HashSet<EClass>();
		
		if (initialGraphObjects != null){
			//add EClass of each object to the list
			for(EObject curObj : initialGraphObjects){
				result.add(curObj.eClass());
			}
		}
		
		return result;
	}

	/**
	 * Identifies all classes whose objects are modifiable by the given
	 * set of activities.
	 * 
	 * @param activities
	 *            the activities used for the reachability analysis
	 * @param usedObjectVariableClasses
	 * 			all classes which are used by the activities
	 * @return changableClasses
	 */
	protected Set<EClass> identifyChangeableObjectVariables(List<Activity> activities, 
			Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects) {
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		
		//prevent NPE
		if (activities == null){
			return changeableClasses;
		}
		
		//analyze story diagrams for changeable nodes
		//considers Cases 1-4
		for(Activity act : activities){
			analyzeStoryDiagram(act, changeableClasses, usedObjectVariableClasses);
		}
		
		boolean update = true;
		//cases 5,6,7 are performed till no new changeable class is determined
		while(update){
			update=false;
			//all sub-classes of changeable classes are also changeable
			//considers Case 7
			update = update || identifySubclassesOfChangeableNodes(changeableClasses, usedObjectVariableClasses);
			
			//in a containment "tree" all classes that contain changeable
			//nodes or are contained in changeable nodes are changeable as well
			//considers Cases 5-6
			update = update || extendByContainedClasses(changeableClasses, usedObjectVariableClasses, classesOfInitialGraphObjects);
		}
		return changeableClasses;
	}

	/**
	 * Identifies object variables which are contained in the given activity and
	 * are changeable, meaning they are created, deleted, modified or having a
	 * modified incoming link variable with a corresponding bidirectional EReference
	 * or a modified outgoing link variable. 
	 * 
	 * @param activity
	 *            one of several activities which are used for the reachability
	 *            analysis
	 * @param changableClasses
	 * @param usedObjectVariableClasses
	 * 			
	 */
	protected void analyzeStoryDiagram(Activity activity,
			Set<EClass> changableClasses,
			Set<EClass> usedObjectVariableClasses){
		
		//check inputs to avoid NPE
		if (activity == null || changableClasses == null || usedObjectVariableClasses == null){
			return;
		}
		
		// iterate all activity nodes looking for ModifyingStoryNodes
		for (ActivityNode node : activity.getOwnedActivityNodes()) {
			if (node instanceof ModifyingStoryNode) {

				// iterate all variables of the story node
				for (AbstractVariable abstractVariable : ((ModifyingStoryNode) node)
						.getStoryPattern().getVariables()) {
					
					// if it is an object variable
					if (abstractVariable instanceof ObjectVariable) {
						
						ObjectVariable objectVariable = (ObjectVariable) abstractVariable;
						if (objectVariable.getClassifier() instanceof EClass) {
							/* **********************************************************
							 * Case 1: Object Variable has binding operator CREATE or DESTROY.
							 * **********************************************************/	
							if (BindingOperator.CREATE.equals(objectVariable.getBindingOperator())
									|| BindingOperator.DESTROY.equals(objectVariable.getBindingOperator())) {
								
								changableClasses.add((EClass) objectVariable.getClassifier());
	
							} else if(!objectVariable.getAttributeAssignments().isEmpty()){
								/* **********************************************************
								 * Case 2: Object Variable has attribute assignment.
								 * **********************************************************/	
								changableClasses.add((EClass) objectVariable.getClassifier());
							} else {
								
								//check link variables
								
								/* **********************************************************
								 * Case 3: Object variable has outgoing link variable which 
								 *         has binding operator CREATE or DESTROY.
								 * **********************************************************/
								if (!objectVariable.getOutgoingLinks().isEmpty()){
									//iterate outgoing links
									for (AbstractLinkVariable abstractLinkVariable : objectVariable
											.getOutgoingLinks()) {
										//link variable is created or destroyed...
										if (abstractLinkVariable instanceof LinkVariable
												&& (BindingOperator.CREATE
														.equals(abstractLinkVariable
																.getBindingOperator()) || BindingOperator.DESTROY
														.equals(abstractLinkVariable
																.getBindingOperator()))) {
		
											changableClasses.add((EClass) objectVariable.getClassifier());
										}
									}
								} // End If (!objectVariable.getOutgoingLinks().isEmpty())
								
								/* **********************************************************
								 * Case 4: Object variable has a link variable pointing to it
								 *         which has binding operator CREATE or DESTROY and 
								 *         which is bidirectional.
								 * **********************************************************/
								if(!objectVariable.getIncomingLinks().isEmpty()){
									
									//iterate incoming links
									for (AbstractLinkVariable abstractLinkVariable : objectVariable
											.getIncomingLinks()) {
										//link variable is created or destroyed...
										if (abstractLinkVariable instanceof LinkVariable
												&& (BindingOperator.CREATE
														.equals(abstractLinkVariable
																.getBindingOperator()) || BindingOperator.DESTROY
														.equals(abstractLinkVariable
																.getBindingOperator()))) {
		
											EReference targetEndReference = ((LinkVariable) abstractLinkVariable)
													.getTargetEnd();
		
											//... and the reference is bidirectional
											if (targetEndReference.getEOpposite() != null) {
												changableClasses.add((EClass) objectVariable.getClassifier());
											}
										}
									}
								} //End If (!objectVariable.getIncomingLinks().isEmpty())
							} // End If (BindingOperator.CREATE ....)
						}
					} //End if (abstractVariable instanceof ObjectVariable)
				}//End for (iteration of abstract variables)
			} // End if (node instanceof ModifyingStoryNode)
		} // End for (ActivityNode node : activity.getOwnedActivityNodes())
	}
	
	/**
	 * Uses the set of already identified changeable classes and the set of classes of
	 * the initial graph nodes to identity all subclasses of changeable nodes which appear
	 * in the initial graph nodes.
	 * 
	 * Subclasses may not be determined without a search limit because EMF
	 *	does not support to compute subclasses. Thus, the initial graph
	 *	objects are checked whether they are of a sub-class of curClazz.
	 *	This is sufficient because any creation must use the concrete class
	 *	(which is then recognized as changeable). Thus, only modification and
	 *	deletion may be specified for a super-class. Thus, the class is either
	 *	known from analyzing created nodes or an object of it is already contained
	 *	in the initial graph nodes.
	 * 
	 * @param changeableClasses
	 * @param usedObjectVariableClasses
	 */
	protected boolean identifySubclassesOfChangeableNodes(Set<EClass> changeableClasses,
			Set<EClass>  usedObjectVariableClasses){
		
		boolean update = false;
		
		//iterate all used classes (= class of initial graph object or class used in the rules)
		for(EClass curClazz : usedObjectVariableClasses){
			
			//skip classes that have already been identified as being changeable
			if (changeableClasses.contains(curClazz)){
				continue;
			}
			
			//if a superclass of a used class is changeable, the class is changeable as well
			for(EClass superClazz : curClazz.getEAllSuperTypes()){
				if (changeableClasses.contains(superClazz)){
					changeableClasses.add(curClazz);
					
					update = true;
				}
			}
			
		}
		
		return update;
	}
	
	/**
	 * Checks Case 8
	 * @return
	 */
	protected boolean extendByClassesWithBidirectionalReference(Set<EClass> changeableClasses,
			Set<EClass> usedObjectVariableClasses){
		boolean update = false;
		
		//check inputs
		if (changeableClasses == null || usedObjectVariableClasses == null){
			return update;
		}

		//iterate all non-containment references of changeable classes
		for(EClass changeableClass : changeableClasses){
			for(EReference curRef : changeableClass.getEAllReferences()){
				
				//skip containments, derived references, transient references and 
				//references without opposite
				if (curRef.isContainment() || curRef.isDerived() || curRef.isTransient()
						|| curRef.getEOpposite() == null){
					continue;
				} else {
					
					EClass opposite = curRef.getEReferenceType();
					
					//check whether class is already changeable, if yes => continue
					if(changeableClasses.contains(opposite)){
						continue;
					}
					
					//check whether opposite is a used class
					//if yes, then the opposite is changeable
					if(usedObjectVariableClasses.contains(opposite)){
						changeableClasses.add(opposite);
						update = true;
						continue;
					}
					
					//if opposite is not used, but abstract, a
					//subclass of the opposite may be used
					//if a used subclass exists, this class is also changeable
					if (opposite.isAbstract() && isSubClassChangeable(opposite, usedObjectVariableClasses)){
						changeableClasses.add(opposite);
						update = true;
					}
				}
				
			}
		}
		
		return update;
	}

	/**
	 * Identifies further classes which can be reached starting at the given
	 * set of classes using containment references. Treats Cases 5 and 6.
	 * 
	 * @param changeableClasses
	 *            that need to be explored
	 */
	protected boolean extendByContainedClasses(Set<EClass> changeableClasses,
			Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects) {
		
		boolean update = false;
		
		//Case 6: If an initial node contains (recursively) a changeable node, then it is changeable
		update = extendByClassesOfChangeableInitialNodes(changeableClasses, usedObjectVariableClasses, classesOfInitialGraphObjects);
		
		//Case 5: All classes which are contained by a changeable class are changeable as well
		ArrayDeque<EClass> todo = new ArrayDeque<EClass>();
		todo.addAll(changeableClasses);

		//Collect all classes that curClazz contains
		while(!todo.isEmpty()){
			EClass curChangeableClazz = todo.poll();

			//iterate all containments
			for(EReference curRef : curChangeableClazz.getEAllContainments()){
				EClass curCandidateClazz = curRef.getEReferenceType();

				//if the class is abstract, check whether a concrete subclass is used in the analysis
				//if a subclass is used, this abstract class is changeable
				//these classes will not be matched by the next test case because it cannot be a used class as no objects can exist
				if (!changeableClasses.contains(curCandidateClazz) && curCandidateClazz.isAbstract()){
					if (isSubClassChangeable(curCandidateClazz, usedObjectVariableClasses)){
						changeableClasses.add(curCandidateClazz);
						todo.add(curCandidateClazz);
						
						update = true;
					}
				}

				//if the class is used in the analysis, add it to the list of changeable ones
				//if it is not already considered to be changeable
				if (!changeableClasses.contains(curCandidateClazz) && usedObjectVariableClasses.contains(curCandidateClazz)){
					changeableClasses.add(curCandidateClazz);
					todo.add(curCandidateClazz);

					update = true;
				}
			}
		}
		//End Checking Case 5

		return update;
	}
	
	/**
	 * The given set of changeable classes represents all classes which are considered to
	 * be changeable and their contained classes. If an initial node contains one of these,
	 * it also needs to be considered changeable. Treats Case 6 of changeable nodes.
	 * 	 @param changeableClasses
	 *            the currently identified changeable classes
	 */
	protected boolean extendByClassesOfChangeableInitialNodes(Set<EClass> changeableClasses,
			Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects){
		
		boolean update = false;
		
		// Check whether an initial node contains a changeable node
		//Transitivity of the containment is considered by executing Case 5 after this one
		for(EClass curInitialClazz : classesOfInitialGraphObjects){
			
			//class is not yet marked as being changeable
			if(!changeableClasses.contains(curInitialClazz)){
			
				if(containsChangeableNode(curInitialClazz, changeableClasses)){
					changeableClasses.add(curInitialClazz);
					
					update = true;
				}
			}
		}
		
		return update;
	}
	
	protected boolean containsChangeableNode(EClass currentClazz, Set<EClass> changeableClasses){
		
		
		for(EReference curRef : currentClazz.getEAllContainments()){
			EClass tgtClazz = curRef.getEReferenceType();
			
			//if the contained class is changeable or one of its subClasses, return true
			if(changeableClasses.contains(tgtClazz) || isSubClassChangeable(tgtClazz, changeableClasses)){
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Determines whether the tgtClazz has a sub class which is changeable.
	 * 
	 * @param tgtClazz
	 * @param changeableClasses
	 * @return
	 */
	protected boolean isSubClassChangeable(EClass tgtClazz,
			Set<EClass> changeableClasses) {
		
		for(EClass changeableClazz: changeableClasses){
			if(changeableClazz.getEAllSuperTypes().contains(tgtClazz)){
				return true;
			}
		}
		
		return false;
	}
	
}
