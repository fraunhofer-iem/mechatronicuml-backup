package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.reachanalysis.core.ReachabilityComputation;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.sdm.SDMReachabilityComputation;

public class TestStepGraphCopy {

	private StepGraph step1;
	
	private SDMTransition trans;
	
	private EClass c1;
	
	private EClass c2;
	
	private EReference ref1;
	
	private EReference ref2;
	
	
	@Before
	public void createTestGraphs(){
		SdmFactory graphFact = SdmFactory.eINSTANCE;
		step1 = graphFact.createStepGraph();
		
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
		
		trans = SdmFactory.eINSTANCE.createSDMTransition();
	}
	
	@Test
	public void copyStateTest(){
		
		ReachabilityComputation reachComp = new TestSDMReachabilityComputation();	
		StepGraph copy = (StepGraph) reachComp.copyState(step1, trans);
		
		assertTrue(copy != null);
		
		//retrieve copied objects
		EClass c1Copy = (EClass) trans.getIndex().get(c1);
		EClass c2Copy = (EClass) trans.getIndex().get(c2);
		EReference ref1Copy = (EReference) trans.getIndex().get(ref1);
		EReference ref2Copy = (EReference) trans.getIndex().get(ref2);
		
		//make sure the copies exist in the copy
		assertTrue(copy.getChangeableNodes().contains(c1Copy) && 
				copy.getChangeableNodes().contains(c2Copy) &&
				copy.getChangeableNodes().contains(ref1Copy) &&
				copy.getChangeableNodes().contains(ref2Copy));
		
		//make sure that all references are correctly set
		assertTrue(c1Copy.getEReferences().contains(ref1Copy));
		assertTrue(c2Copy.getEReferences().contains(ref2Copy));
		assertTrue(ref1Copy.getEType() == c2Copy);
		assertTrue(ref2Copy.getEType() == c1Copy);
	}
	
	@Test
	public void accessStaticCopyTest(){
		StepGraph copy = SDMReachabilityComputation.copyStepGraph(step1, trans);
		
		assertTrue(copy != null);
		
		//retrieve copied objects
		EClass c1Copy = (EClass) trans.getIndex().get(c1);
		EClass c2Copy = (EClass) trans.getIndex().get(c2);
		EReference ref1Copy = (EReference) trans.getIndex().get(ref1);
		EReference ref2Copy = (EReference) trans.getIndex().get(ref2);
		
		//make sure the copies exist in the copy
		assertTrue(copy.getChangeableNodes().contains(c1Copy) && 
				copy.getChangeableNodes().contains(c2Copy) &&
				copy.getChangeableNodes().contains(ref1Copy) &&
				copy.getChangeableNodes().contains(ref2Copy));
		
		//make sure that all references are correctly set
		assertTrue(c1Copy.getEReferences().contains(ref1Copy));
		assertTrue(c2Copy.getEReferences().contains(ref2Copy));
		assertTrue(ref1Copy.getEType() == c2Copy);
		assertTrue(ref2Copy.getEType() == c1Copy);
	}
	
}
