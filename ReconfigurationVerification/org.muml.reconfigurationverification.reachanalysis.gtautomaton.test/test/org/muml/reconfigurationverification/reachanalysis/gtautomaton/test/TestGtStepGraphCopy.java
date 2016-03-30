package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.reachanalysis.core.ReachabilityComputation;
import org.muml.reconfigurationverification.reachanalysis.gtautomaton.GtAutomatonComputation;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;

public class TestGtStepGraphCopy {

	private GtStepGraph step1;
	
	private GtAutomatonTransition trans;
	
	private EClass c1;
	
	private EClass c2;
	
	private EReference ref1;
	
	private EReference ref2;
	
	
	@Before
	public void createTestGraphs(){
		GtautomatonFactory graphFact = GtautomatonFactory.eINSTANCE;
		step1 = graphFact.createGtStepGraph();
		
		GtAutomaton gta = graphFact.createGtAutomaton();
		gta.getStates().add(step1);
		gta.getUnchangeableNodes();
		
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
		
		ObjectIdentifier mapping = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
		mapping.getEObjectToIdentifier().put(c1, "c1");
		mapping.getEObjectToIdentifier().put(c2, "c2");
		mapping.getEObjectToIdentifier().put(ref1, "ref1");
		mapping.getEObjectToIdentifier().put(ref2, "ref2");
		
		mapping.getIdentifierToEObject().put("c1", c1);
		mapping.getIdentifierToEObject().put("c2", c2);
		mapping.getIdentifierToEObject().put("ref1", ref1);
		mapping.getIdentifierToEObject().put("ref2", ref2);
		
		step1.setObjectIdentifier(mapping);
		
		trans = GtautomatonFactory.eINSTANCE.createGtAutomatonTransition();
	}
	
	@Test
	public void copyStateTest(){
		
		ReachabilityComputation reachComp = new TestGtAutomatonComputation();
		GtStepGraph copy = (GtStepGraph) reachComp.copyState(step1, trans);
		
		assertTrue(copy != null);
		
		//retrieve copied objects
		EClass c1Copy = (EClass) trans.getIndex().get(c1);
		EClass c2Copy = (EClass) trans.getIndex().get(c2);
		EReference ref1Copy = (EReference) trans.getIndex().get(ref1);
		EReference ref2Copy = (EReference) trans.getIndex().get(ref2);
		
		//make sure the copies exist in the copy
		assertTrue(copy.getContains().contains(c1Copy) && 
				copy.getContains().contains(c2Copy) &&
				copy.getContains().contains(ref1Copy) &&
				copy.getContains().contains(ref2Copy));
		
		//make sure that all references are correctly set
		assertTrue(c1Copy.getEReferences().contains(ref1Copy));
		assertTrue(c2Copy.getEReferences().contains(ref2Copy));
		assertTrue(ref1Copy.getEType() == c2Copy);
		assertTrue(ref2Copy.getEType() == c1Copy);
		
		//make sure that all identifiers are correctly set
		ObjectIdentifier srcMapping = step1.getObjectIdentifier();
		ObjectIdentifier tgtMapping = copy.getObjectIdentifier();
		assertTrue(srcMapping.getIdentifier(c1).equals(tgtMapping.getIdentifier(c1Copy)));
		assertTrue(srcMapping.getIdentifier(c2).equals(tgtMapping.getIdentifier(c2Copy)));
		assertTrue(srcMapping.getIdentifier(ref1).equals(tgtMapping.getIdentifier(ref1Copy)));
		assertTrue(srcMapping.getIdentifier(ref2).equals(tgtMapping.getIdentifier(ref2Copy)));
	}
	
	public void staticAccessToCopyMethod(){
		GtStepGraph copy = GtAutomatonComputation.copyGtStepGraph(step1, trans);
		
		assertTrue(copy != null);
		
		//retrieve copied objects
		EClass c1Copy = (EClass) trans.getIndex().get(c1);
		EClass c2Copy = (EClass) trans.getIndex().get(c2);
		EReference ref1Copy = (EReference) trans.getIndex().get(ref1);
		EReference ref2Copy = (EReference) trans.getIndex().get(ref2);
		
		//make sure the copies exist in the copy
		assertTrue(copy.getContains().contains(c1Copy) && 
				copy.getContains().contains(c2Copy) &&
				copy.getContains().contains(ref1Copy) &&
				copy.getContains().contains(ref2Copy));
		
		//make sure that all references are correctly set
		assertTrue(c1Copy.getEReferences().contains(ref1Copy));
		assertTrue(c2Copy.getEReferences().contains(ref2Copy));
		assertTrue(ref1Copy.getEType() == c2Copy);
		assertTrue(ref2Copy.getEType() == c1Copy);
		
		//make sure that all identifiers are correctly set
		ObjectIdentifier srcMapping = step1.getObjectIdentifier();
		ObjectIdentifier tgtMapping = copy.getObjectIdentifier();
		assertTrue(srcMapping.getIdentifier(c1).equals(tgtMapping.getIdentifier(c1Copy)));
		assertTrue(srcMapping.getIdentifier(c2).equals(tgtMapping.getIdentifier(c2Copy)));
		assertTrue(srcMapping.getIdentifier(ref1).equals(tgtMapping.getIdentifier(ref1Copy)));
		assertTrue(srcMapping.getIdentifier(ref2).equals(tgtMapping.getIdentifier(ref2Copy)));
	}
}
