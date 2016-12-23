package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Test;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

public class TestIsomorphismCheck {

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
	
	private StepGraph step1;
	
	private StepGraph step2;
	
	private StepGraph step3;
	
	private void createTestGraphs(boolean createPackage){
		SdmFactory graphFact = SdmFactory.eINSTANCE;
		step1 = graphFact.createStepGraph();
		step2 = graphFact.createStepGraph();
		step3 = graphFact.createStepGraph();
		SDMReachabilityGraph reachGraph = graphFact.createSDMReachabilityGraph();
		reachGraph.getStates().add(step1);
		reachGraph.getStates().add(step2);
		reachGraph.getStates().add(step3);
		
		//create contents for Step 1
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
		
		if(createPackage){
			EPackage pkg = factory.createEPackage();
			pkg.setName("TestPkg");
			pkg.getEClassifiers().add(c1);
			pkg.getEClassifiers().add(c2);
			step1.getChangeableNodes().add(pkg);
		}
		
		step1.getChangeableNodes().add(c1);
		step1.getChangeableNodes().add(c2);
		step1.getChangeableNodes().add(ref1);
		step1.getChangeableNodes().add(ref2);
		
		//create contents for Step 2
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
		
		if(createPackage){
			EPackage pkg = factory.createEPackage();
			pkg.setName("TestPkg");
			pkg.getEClassifiers().add(c3);
			pkg.getEClassifiers().add(c4);
			step2.getChangeableNodes().add(pkg);
		}
		
		step2.getChangeableNodes().add(c3);
		step2.getChangeableNodes().add(c4);
		step2.getChangeableNodes().add(ref3);
		step2.getChangeableNodes().add(ref4);
		
		//create contents for Step 3
		c5 = factory.createEClass();
		c5.setName("Test1");
		
		c6 = factory.createEClass();
		c6.setName("Test2");
		
		ref5 = factory.createEReference();
		ref5.setName("blubb");
		ref5.setContainment(true);
		ref5.setEType(c6);
		ref5.setUpperBound(-1);
		c5.getEStructuralFeatures().add(ref5);
		
		ref6 = factory.createEReference();
		ref6.setName("bla1");
		ref6.setEType(c5);
		c6.getEStructuralFeatures().add(ref6);
		
		if(createPackage){
			EPackage pkg = factory.createEPackage();
			pkg.setName("TestPkg");
			pkg.getEClassifiers().add(c5);
			pkg.getEClassifiers().add(c6);
			step3.getChangeableNodes().add(pkg);
		}
		
		step3.getChangeableNodes().add(c5);
		step3.getChangeableNodes().add(c6);
		step3.getChangeableNodes().add(ref5);
		step3.getChangeableNodes().add(ref6);
		
	}
	
	@Test
	public void testIsomorphismsNoSingleObject(){
		createTestGraphs(false);
		
		TestSDMReachabilityComputation reachComp = new TestSDMReachabilityComputation(new HashSet<EObject>(), new ArrayList<Activity>());
		
		assertTrue(reachComp.isIsomorphic(step1, step2));
		assertTrue(reachComp.isIsomorphic(step2, step1));
		assertFalse(reachComp.isIsomorphic(step2, step3));
	}
	
	@Test
	public void testIsomorphismsSinglePackagesObject(){
		createTestGraphs(true);
		
		TestSDMReachabilityComputation reachComp = new TestSDMReachabilityComputation(new HashSet<EObject>(), new ArrayList<Activity>());
		
		assertTrue(reachComp.isIsomorphic(step1, step2));
		assertTrue(reachComp.isIsomorphic(step2, step1));
		assertFalse(reachComp.isIsomorphic(step2, step3));
	}
}
