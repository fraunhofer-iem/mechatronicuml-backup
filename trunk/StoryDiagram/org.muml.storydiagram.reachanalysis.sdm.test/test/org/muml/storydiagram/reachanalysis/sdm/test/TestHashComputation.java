package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

public class TestHashComputation {

	private StepGraph step1;
	
	private StepGraph step2;
	
	private StepGraph step3;
	
	private EClass c1;
	
	private EClass c2;
	
	private EClass c3;
	
	private EClass c4;
	
	private EClass c5;
	
	private EClass c6;
	
	private EReference ref1;
	
	private EReference ref2;
	
	private EReference ref3;
	
	private EReference ref4;
	
	private EReference ref5;
	
	private EReference ref6;
	
	@Before
	public void createTestGraphs(){
		SdmFactory graphFact = SdmFactory.eINSTANCE;
		SDMReachabilityGraph reachGraph = graphFact.createSDMReachabilityGraph();
		
		step1 = graphFact.createStepGraph();
		reachGraph.getStates().add(step1);
		step2 = graphFact.createStepGraph();
		reachGraph.getStates().add(step2);
		step3 = graphFact.createStepGraph();
		reachGraph.getStates().add(step3);
		
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
		
		step1.getChangeableNodes().add(c1);
		step1.getChangeableNodes().add(c2);
		step1.getChangeableNodes().add(ref1);
		step1.getChangeableNodes().add(ref2);
		
		c3 = factory.createEClass();
		c3.setName("Test1");
		
		c4 = factory.createEClass();
		c4.setName("Test2");
		
		ref3 = factory.createEReference();
		ref3.setName("bla1");
		ref3.setContainment(true);
		ref3.setEType(c4);
		ref3.setUpperBound(-1);
		c3.getEStructuralFeatures().add(ref3);
		
		ref4 = factory.createEReference();
		ref4.setName("blubb");
		ref4.setEType(c3);
		c4.getEStructuralFeatures().add(ref4);
		
		step2.getChangeableNodes().add(ref3);
		step2.getChangeableNodes().add(ref4);
		step2.getChangeableNodes().add(c3);
		step2.getChangeableNodes().add(c4);
		
		c5 = factory.createEClass();
		c5.setName("Test1");
		
		c6 = factory.createEClass();
		c6.setName("Test2");
		
		ref5 = factory.createEReference();
		ref5.setName("bla1");
		ref5.setContainment(true);
		ref5.setEType(c6);
		ref5.setUpperBound(-1);
		c5.getEStructuralFeatures().add(ref5);
		
		ref6 = factory.createEReference();
		ref6.setName("blubb");
		ref6.setEType(c5);
		c6.getEStructuralFeatures().add(ref6);
		
		step3.getChangeableNodes().add(c6);
		step3.getChangeableNodes().add(ref6);
		step3.getChangeableNodes().add(c5);
		step3.getChangeableNodes().add(ref5);
	}
	
	@Test
	public void testAttributeHash(){
		
		TestSDMReachabilityComputation reachComp = new TestSDMReachabilityComputation(new HashSet<EObject>(), new ArrayList<Activity>());
		
		//check attr hashes for classes
		long attrHash1 = reachComp.computeAttributeHash(c1);
		long attrHash2 = reachComp.computeAttributeHash(c3);
		long attrHash3 = reachComp.computeAttributeHash(c5);
		
		assertTrue(attrHash1 == attrHash2 && attrHash2 == attrHash3);
		
		// check attr hashes for references
		long refHash1 = reachComp.computeAttributeHash(ref1);
		long refHash2 = reachComp.computeAttributeHash(ref3);
		long refHash3 = reachComp.computeAttributeHash(ref5);
		
		assertTrue(refHash1 == refHash2 && refHash2 == refHash3);
	}
	
	@Test
	public void testNeighborhoodHash(){
		TestSDMReachabilityComputation reachComp = new TestSDMReachabilityComputation(new HashSet<EObject>(), new ArrayList<Activity>());
		HashMap<EObject, Long> lowerLevelHash = new HashMap<EObject, Long>();
		
		lowerLevelHash.put(c1, reachComp.computeAttributeHash(c1));
		lowerLevelHash.put(ref1, reachComp.computeAttributeHash(ref1));
		
		long neighborHash1 = reachComp.computeNeighborhoodHash(c1, lowerLevelHash);
		
		lowerLevelHash.clear();
		lowerLevelHash.put(c3, reachComp.computeAttributeHash(c3));
		lowerLevelHash.put(ref3, reachComp.computeAttributeHash(ref3));
		
		long neighborHash2 = reachComp.computeNeighborhoodHash(c3, lowerLevelHash);
		
		lowerLevelHash.clear();
		lowerLevelHash.put(c5, reachComp.computeAttributeHash(c5));
		lowerLevelHash.put(ref5, reachComp.computeAttributeHash(ref5));
		
		long neighborHash3 = reachComp.computeNeighborhoodHash(c5, lowerLevelHash);
		
		assertTrue(neighborHash1 == neighborHash2 && neighborHash2 == neighborHash3);
	}
	
	@Test
	public void testHashComputation(){
		TestSDMReachabilityComputation reachComp = new TestSDMReachabilityComputation(new HashSet<EObject>(), new ArrayList<Activity>());
		
		reachComp.computeHashValue(step1);
		reachComp.computeHashValue(step2);
		reachComp.computeHashValue(step3);
		
		long hashStep1 = step1.getHash();
		long hashStep2 = step2.getHash();
		long hashStep3 = step3.getHash();
		
		assertTrue(hashStep1 == hashStep2 && hashStep2 == hashStep3);
	}
	
}
