package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Test;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;

public class TestInitialGraphCreation {

	
	@Test
	public void testInitialGraphCreation(){
		
		EcoreFactory factory = EcoreFactoryImpl.eINSTANCE;
		EClass c1 = factory.createEClass();
		c1.setName("Test1");
		
		EClass c2 = factory.createEClass();
		c2.setName("Test2");
		
		EReference ref1 = factory.createEReference();
		ref1.setName("bla1");
		ref1.setContainment(true);
		ref1.setEType(c2);
		ref1.setUpperBound(-1);
		c1.getEStructuralFeatures().add(ref1);
		
		EReference ref2 = factory.createEReference();
		ref2.setName("blubb");
		ref2.setEType(c1);
		c2.getEStructuralFeatures().add(ref2);
		
		HashSet<EObject> initialObjects = new HashSet<EObject>();
		initialObjects.add(c1);
		initialObjects.add(c2);
		initialObjects.add(ref1);
		initialObjects.add(ref2);
		
		TimedGraphTransformationSystem emptyTGTS = TimedstorydiagramFactory.eINSTANCE.createTimedGraphTransformationSystem();
		
		//query the rule sets to initialize the references to empty lists
		emptyTGTS.getClockInstanceRules();
		emptyTGTS.getInvariants();
		emptyTGTS.getRules();
		emptyTGTS.getInitialGraphObjects().addAll(initialObjects);
		
		//create reachability computation
		TestGtAutomatonComputation reachComp = new TestGtAutomatonComputation(emptyTGTS);
		GtStepGraph step = (GtStepGraph) reachComp.createInitialState();
		
		assertTrue(step != null);
		
		assertTrue(step.getContains().size() == 4);
		
		//check identifiers
		ObjectIdentifier identifiers = step.getObjectIdentifier();
		assertTrue(identifiers.getIdentifier(c1) != null);
		assertTrue(identifiers.getIdentifier(c2) != null);
		assertTrue(identifiers.getIdentifier(ref1) != null);
		assertTrue(identifiers.getIdentifier(ref2) != null);
		
		
	}
}
