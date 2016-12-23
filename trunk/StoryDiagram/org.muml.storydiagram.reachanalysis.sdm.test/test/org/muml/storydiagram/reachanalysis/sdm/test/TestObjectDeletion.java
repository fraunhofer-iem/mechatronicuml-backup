package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.storydiagram.activities.ActivitiesFactory;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;

public class TestObjectDeletion {
	
	private EClass c1;
	
	private EClass c2;
	
	private EReference ref1;
	
	private EReference ref2;
	
	
	@Before
	public void createTestGraphs(){
		EcoreFactory factory = EcoreFactoryImpl.eINSTANCE;
		c1 = factory.createEClass();
		c1.setName("Test1");
		
		c2 = factory.createEClass();
		c2.setName("Test2");
		
		ref1 = factory.createEReference();
		ref1.setName("bla1");
		ref1.setContainment(true);
		ref1.setEType(c2);
		ref1.setUpperBound(-1);
		c1.getEStructuralFeatures().add(ref1);
		
		ref2 = factory.createEReference();
		ref2.setName("blubb");
		ref2.setEType(c1);
		c2.getEStructuralFeatures().add(ref2);
	}
	
	@Test
	public void deleteObjectTest(){
		
		HashSet<EObject> objects = new HashSet<EObject>();
		objects.add(c1);
		objects.add(c2);
		objects.add(ref1);
		objects.add(ref2);
		
		List<Activity> activities = new ArrayList<Activity>(); 
		Activity emptyActivity = ActivitiesFactory.eINSTANCE.createActivity();
		activities.add(emptyActivity);
		
		//create reachability graph -> needs to contain one state
		TestObjectDeletionSDMReachComp reachComp = new TestObjectDeletionSDMReachComp(objects, activities);
		reachComp.setStoreIndexMap(true);
		reachComp.computeReachabilityGraph();
		
		ReachabilityGraph reachGraph = reachComp.getReachabilityGraph();
		
		assertTrue(reachGraph != null);
		
		SDMTransition trans = (SDMTransition) reachGraph.getStartState().getOutgoingTransitions().get(0);
		StepGraph tgtState = (StepGraph) trans.getTarget();
		
		//only two objects in tgtState
		assertEquals(4, ((StepGraph)reachGraph.getStartState()).getChangeableNodes().size());
		assertEquals(2, tgtState.getChangeableNodes().size());
		
		//since we omit that graph objects are copied using our TestSDMRechComp below, 
		//we can query the index using the initial graph objects
		EObject c1Copy = trans.getIndex().get(c1);
		EObject c2Copy = trans.getIndex().get(c2);
		EObject ref1Copy = trans.getIndex().get(ref1);
		EObject ref2Copy = trans.getIndex().get(ref2);
		
		//index must not return values for c1 and ref1, because they have been deleted
		assertNull(c1Copy);
		assertNotNull(c2Copy);
		assertNull(ref1Copy);
		assertNotNull(ref2Copy);
		
		//ref2Copy must no longer reference c1Copy as a type
		assertNull(((EReference)ref2Copy).getEReferenceType());
		
	}
	
	class TestObjectDeletionSDMReachComp extends SDMReachabilityComputation{

		boolean first = true;
		
		public TestObjectDeletionSDMReachComp(HashSet<EObject> objects,
				List<Activity> activities) {
			super(objects, activities);
		}

		@Override
		protected void initialize() {
			//Do nothing
		}

		@Override
		protected Map<String, Variable<EClassifier>> callInterpreter(StepGraph step,
				Activity activity, EObject returnValue) {

			SuccessorStepGraphs successor = (SuccessorStepGraphs) returnValue;
			
			//produce exactly one successor state
			if (first){
				
				first = false;
				
				//clone initial state
				SDMTransition trans = SdmFactory.eINSTANCE.createSDMTransition();
				this.copyState(this.getReachabilityGraph().getStartState(), trans);
				StepGraph newState = (StepGraph) trans.getTarget();
				this.getReachabilityGraph().getStates().add(newState);
				this.getReachabilityGraph().getTransitions().add(trans);
				
				//modify cloned state by deleting the object corresponding to class c1
				EClass c1Copy = (EClass) trans.getIndex().get(c1);
				EcoreUtil.delete(c1Copy, true);

				successor.getSuccessors().add(newState);
			}
			
			return new HashMap<String, Variable<EClassifier>>();
		}

		@Override
		protected void unifyStates(ReachabilityGraphState newState) {
			//Do nothing
		}
		
		
	}
}
