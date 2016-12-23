package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

public class TestDerivedImplementations {
	
	private HashSet<EObject> unchangeables = null;
	
	private HashSet<EObject> changeables = null;
	
	@Before
	public void setUp(){
		EcoreFactory factory = EcoreFactoryImpl.eINSTANCE;
		
		//create some objects
		EPackage thePackage = factory.createEPackage();
		thePackage.setName("test");
		
		EClass class1 = factory.createEClass();
		class1.setName("c1");
		
		EClass class2 = factory.createEClass();
		class2.setName("c2");
		
		//create and fill containers
		unchangeables = new HashSet<EObject>();
		changeables = new HashSet<EObject>();
		
		unchangeables.add(thePackage);
		
		changeables.add(class1);
		changeables.add(class2);
	}
	
	@Test
	public void testUnchangeableNodesAccess(){
		//configure reachGraph
		SDMReachabilityGraph reachGraph = SdmFactory.eINSTANCE.createSDMReachabilityGraph();
		reachGraph.getUnchangeableNodes().addAll(unchangeables);
		
		//create step graph
		StepGraph step = SdmFactory.eINSTANCE.createStepGraph();
		step.getChangeableNodes().addAll(changeables);
		step.setReachabilityGraph(reachGraph);
		

		assertTrue(step.getUnchangeableNodes().size() == 1);

	}
	
	@Test
	public void testContainsAccess(){
		//configure reachGraph
		SDMReachabilityGraph reachGraph = SdmFactory.eINSTANCE.createSDMReachabilityGraph();
		reachGraph.getUnchangeableNodes().addAll(unchangeables);
		
		//create step graph
		StepGraph step = SdmFactory.eINSTANCE.createStepGraph();
		step.getChangeableNodes().addAll(changeables);
		step.setReachabilityGraph(reachGraph);
		

		assertTrue(step.getContains().size() == 3);

	}
	
}
