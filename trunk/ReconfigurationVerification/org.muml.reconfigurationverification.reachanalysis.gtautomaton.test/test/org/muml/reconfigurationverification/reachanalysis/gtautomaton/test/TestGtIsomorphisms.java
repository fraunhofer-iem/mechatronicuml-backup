package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;

public class TestGtIsomorphisms {

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
		
		private GtStepGraph step1;
		
		private GtStepGraph step2;
		
		private GtStepGraph step3;
		
		@Before
		public void createTestGraphs(){
			GtautomatonFactory graphFact = GtautomatonFactory.eINSTANCE;
			step1 = graphFact.createGtStepGraph();
			step2 = graphFact.createGtStepGraph();
			step3 = graphFact.createGtStepGraph();
			
			GtAutomaton gta = graphFact.createGtAutomaton();
			gta.getStates().add(step1);
			gta.getStates().add(step2);
			gta.getStates().add(step3);
			
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
			
			step3.getChangeableNodes().add(c5);
			step3.getChangeableNodes().add(c6);
			step3.getChangeableNodes().add(ref5);
			step3.getChangeableNodes().add(ref6);
			
			//create identifiers, use identifiers c1, c2, ref1, ref2
			ObjectIdentifier mapping1 = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
			mapping1.getEObjectToIdentifier().put(c1, "c1");
			mapping1.getEObjectToIdentifier().put(c2, "c2");
			mapping1.getEObjectToIdentifier().put(ref1, "ref1");
			mapping1.getEObjectToIdentifier().put(ref2, "ref2");
			
			mapping1.getIdentifierToEObject().put("c1", c1);
			mapping1.getIdentifierToEObject().put("c2", c2);
			mapping1.getIdentifierToEObject().put("ref1", ref1);
			mapping1.getIdentifierToEObject().put("ref2", ref2);
			
			step1.setObjectIdentifier(mapping1);
			
			ObjectIdentifier mapping2 = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
			mapping2.getEObjectToIdentifier().put(c3, "c1");
			mapping2.getEObjectToIdentifier().put(c4, "c2");
			mapping2.getEObjectToIdentifier().put(ref3, "ref1");
			mapping2.getEObjectToIdentifier().put(ref4, "ref2");
			
			mapping2.getIdentifierToEObject().put("c1", c3);
			mapping2.getIdentifierToEObject().put("c2", c4);
			mapping2.getIdentifierToEObject().put("ref1", ref3);
			mapping2.getIdentifierToEObject().put("ref2", ref4);
			
			step2.setObjectIdentifier(mapping2);
			
			ObjectIdentifier mapping3 = GtautomatonFactory.eINSTANCE.createObjectIdentifier();
			mapping3.getEObjectToIdentifier().put(c5, "c1");
			mapping3.getEObjectToIdentifier().put(c6, "c2");
			mapping3.getEObjectToIdentifier().put(ref5, "ref2");
			mapping3.getEObjectToIdentifier().put(ref6, "ref1");
			
			mapping3.getIdentifierToEObject().put("c1", c5);
			mapping3.getIdentifierToEObject().put("c2", c6);
			mapping3.getIdentifierToEObject().put("ref2", ref5);
			mapping3.getIdentifierToEObject().put("ref1", ref6);
			
			step3.setObjectIdentifier(mapping3);
		}
		
		@Test
		public void testIsomorphisms(){
			TestGtAutomatonComputation reachComp = new TestGtAutomatonComputation(TimedstorydiagramFactory.eINSTANCE.createTimedGraphTransformationSystem());
			
			assertTrue(reachComp.isIsomorphic(step1, step2));
			assertTrue(reachComp.isIsomorphic(step2, step1));
			assertFalse(reachComp.isIsomorphic(step2, step3));
		}
}
