package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.Variable;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RoleInstance;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.VariableBinding;

/**
 * A meta-model may contain attributes that map arbitrary Java objects into an 
 * EMF model. An example is given by the class VariableBinding of the MechatronicUML
 * runtime model. Its value is an arbitrary object of type java.lang.object. In some
 * cases, the objects in these references may be graph objects. This test ensures 
 * that the base functions (hash computation, isomorphism, copy) work correctly 
 * for such attributes.
 * 
 * This test class needs to be executed as JUnit-Plugin Test. Otherwise, the derived
 * implementations of the used classes cannot be accessed without exceptions.
 * 
 * @author Christian Heinzemann
 *
 */
public class TestAttributeObjectReferences {

	private RuntimeFactory runtimeFactory;
	
	private RealtimestatechartFactory rtscFactory;
	
	private BehaviorFactory behaviorFactory;
	
	private ProtocolFactory protocolFactory;
	
	private SdmFactory sdmFactory;
	
	private EClass roleInstClazz;
	
	private EClass varBindingClazz;
	
	private EClass rtscClazz;
	
	
	@Before
	public void setUp(){
		//set up factories
		runtimeFactory = RuntimeFactory.eINSTANCE;
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		behaviorFactory = BehaviorFactory.eINSTANCE;
		protocolFactory = ProtocolFactory.eINSTANCE;
		sdmFactory = SdmFactory.eINSTANCE;
		
		//set up EClasses
		roleInstClazz = RuntimePackage.eINSTANCE.getMultiRoleInstance();
		varBindingClazz = RuntimePackage.eINSTANCE.getVariableBinding();
		rtscClazz = RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart();
	}
	
	/* 
	 * General test model layout (value of VariableBinding changes between role and int depending on the test case)
	 *      ___________                 _______________
	 *      |          |   instanceof   |              |
	 *  |-->|   Role   |<---------------| RoleInstance |<---------------|
	 *  |   |__________|                |______________| 				|
	 *  |        |                              |						|
	 *  |        | behavior                     | statechartInstance	|
	 *  |        |							    |						|
	 * 	|	_____v_____                 ________v_______				|
	 *  |   |          |   instanceof   |               |				|
	 *  |   |   RTSC   |<---------------| RTSC Instance |				|
	 *  |   |__________|                |_______________|				|
	 *  |        | 														|
	 *  |        | variables											|
	 *  | type   | 														|
	 *  |   _____v_____                 __________________			    |
	 *  |   |          |    variable    |                 |             |
	 *  |---| Variable |<---------------| VariableBinding |-------------|
	 *      |__________|                |_________________|
	 * 
	 */
	private StepGraph setupStepGraph(){
		
		//set up general test model frame
		HashSet<EObject> testModelObjects = new HashSet<EObject>();
		
		Role theRole = protocolFactory.createRole();
		theRole.setName("TestRole");
		testModelObjects.add(theRole);
		
		RealtimeStatechart theRTSC = rtscFactory.createRealtimeStatechart();
		theRTSC.setName("TestRTSC");
		theRole.setBehavior(theRTSC);
		testModelObjects.add(theRTSC);
		
		Variable theVariable = behaviorFactory.createVariable();
		theVariable.setName("TestVar");
		theVariable.setDataType(theRole);
		theRTSC.getVariables().add(theVariable);
		testModelObjects.add(theVariable);
		
		RoleInstance theRoleInst = runtimeFactory.createMultiRoleInstance();
		theRoleInst.setName("RoleInst");
		theRoleInst.setType(theRole);
		testModelObjects.add(theRoleInst);
		
		RealtimeStatechartInstance theRTSCInst = runtimeFactory.createRealtimeStatechartInstance();
		theRTSCInst.setInstanceOf(theRTSC);
		testModelObjects.add(theRTSCInst);
		
		VariableBinding theVarBinding = runtimeFactory.createVariableBinding();
		theVarBinding.setVariable(theVariable);
		testModelObjects.add(theVarBinding);
		
		//set up StepGraph
		StepGraph step = sdmFactory.createStepGraph();
		step.getChangeableNodes().addAll(testModelObjects);
		
		return step;
	}
	
	/**
	 * Returns the first object from the given set which is an instance of the given EClass.
	 * @param objects
	 * @param clazz
	 * @return
	 */
	private EObject getObjFromSet(Collection<EObject> objects, EClass clazz){
		for(EObject obj : objects){
			if(obj.eClass() == clazz){
				return obj;
			}
		}
		return null;
	}

	
	
	/* -------------------------------------------------------------------------------
	 * 
	 * Hash Computation tests
	 * 
	 * -------------------------------------------------------------------------------
	 */
	
	@Test
	public void hashSameGraphObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step1.getChangeableNodes(),roleInstClazz));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step2.getChangeableNodes(),roleInstClazz));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		testReachComp.computeHashValue(step1);
		testReachComp.computeHashValue(step2);
		
		//hash values need to be equal
		assertEquals(step1.getHash(),step2.getHash());
	}
	
	@Test
	public void hashDifferentGraphObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step1.getChangeableNodes(),roleInstClazz));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to the RTSC
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step2.getChangeableNodes(),rtscClazz));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		testReachComp.computeHashValue(step1);
		testReachComp.computeHashValue(step2);
		
		//hash values need to be different
		assertFalse(step1.getHash() == step2.getHash());
	}
	
	@Test
	public void hashSameIntLiteralInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(3);

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(3);
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		testReachComp.computeHashValue(step1);
		testReachComp.computeHashValue(step2);
		
		//hash value need to be equal
		assertEquals(step1.getHash(),step2.getHash());
	}
	
	@Test
	public void hashSameIntObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(new Integer(3));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(new Integer(3));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		testReachComp.computeHashValue(step1);
		testReachComp.computeHashValue(step2);
		
		//hash value need to be equal
		assertEquals(step1.getHash(),step2.getHash());
	}
	
	@Test
	public void hashDifferentIntLiteralInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(1);

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(3);
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		testReachComp.computeHashValue(step1);
		testReachComp.computeHashValue(step2);
		
		//hash values need to be different
		assertFalse(step1.getHash() == step2.getHash());
	}
	
	/* -------------------------------------------------------------------------------
	 * 
	 * Isomorphism tests
	 * 
	 * -------------------------------------------------------------------------------
	 */
	
	@Test
	public void isoSameGraphObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step1.getChangeableNodes(),roleInstClazz));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step2.getChangeableNodes(),roleInstClazz));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		//graphs must be isomorphic
		assertTrue(testReachComp.isIsomorphic(step1, step2));
	}
	
	@Test
	public void isoDifferentGraphObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step1.getChangeableNodes(),roleInstClazz));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to the RTSC
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step2.getChangeableNodes(),rtscClazz));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		//graphs must not be isomorphic
		assertFalse(testReachComp.isIsomorphic(step1, step2));
	}
	
	@Test
	public void isoSameIntLiteralInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(3);

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(3);
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		//graphs must be isomorphic
		assertTrue(testReachComp.isIsomorphic(step1, step2));
	}
	
	@Test
	public void isoSameIntObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(new Integer(3));

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(new Integer(3));
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		//graphs must be isomorphic
		assertTrue(testReachComp.isIsomorphic(step1, step2));
	}
	
	@Test
	public void isoDifferentIntLiteralInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(1);

		/*
		 * Setup second step graph
		 */
		
		//get Graph objects
		StepGraph step2 = setupStepGraph();
		
		//set value reference for variable binding to literal 3
		((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).setValue(3);
		
		/*
		 * Compute hash values
		 */
		
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		//graphs must not be isomorphic
		assertFalse(testReachComp.isIsomorphic(step1, step2));
	}
	
	/* -------------------------------------------------------------------------------
	 * 
	 * Copy tests
	 * 
	 * -------------------------------------------------------------------------------
	 */
	
	@Test
	public void copySameGraphObjectInAttribute(){
				
		/*
		 * Setup first step graph
		 */
		
		//get Graph objects
		StepGraph step1 = setupStepGraph();
		
		//set value reference for variable binding to the roleInstance
		((VariableBinding)getObjFromSet(step1.getChangeableNodes(), varBindingClazz)).setValue(getObjFromSet(step1.getChangeableNodes(),roleInstClazz));

		/*
		 * Create second step graph by copying the first one. 
		 */
		TestSDMReachabilityComputation testReachComp = new TestSDMReachabilityComputation();
		
		StepGraph step2 = (StepGraph) testReachComp.copyState(step1, sdmFactory.createSDMTransition());
		
		/*
		 * Compare 
		 */
		assertEquals(step1.getChangeableNodes().size(), step2.getChangeableNodes().size());
		
		//value of variable binding needs to be contained in step2
		assertTrue(step2.getChangeableNodes().contains(((VariableBinding)getObjFromSet(step2.getChangeableNodes(), varBindingClazz)).getValue()));
	}
	
}
