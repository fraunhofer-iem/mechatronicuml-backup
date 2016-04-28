package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import org.junit.Before;
import org.junit.Test;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.VariableBinding;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestSanitizeVariableBindings {

	TestGtAutomatonComputation reachComp = null;
	
	
	@Before
	public void setUp(){
		reachComp = new TestGtAutomatonComputation();
	}
	
	private VariableBinding createVariableBinding(PrimitiveTypes type, String value){
		
		//create DataType
		PrimitiveDataType dataType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		dataType.setName(type.getName());
		dataType.setPrimitiveType(type);
		
		//create Variable
		Variable var = BehaviorFactory.eINSTANCE.createVariable();
		var.setName("testVar");
		var.setDataType(dataType);
		
		//create LiteralExpression for the value
		LiteralExpression litExp = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		litExp.setValue(value);
		
		//create variable binding
		VariableBinding varBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
		varBinding.setVariable(var);
		varBinding.setValue(litExp);
		
		return varBinding;
	}
	
	@Test
	public void testSanitizeVariableBindingsBoolValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.BOOLEAN, "true");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.BOOLEAN, "false");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Boolean);
		assertTrue(varBinding2.getValue() instanceof Boolean);
		
		assertTrue((Boolean)varBinding.getValue());
		assertFalse((Boolean)varBinding2.getValue());
	}
	
	@Test
	public void testSanitizeVariableBindingsLongValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.INT64, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.INT64, "-5");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Long);
		assertTrue(varBinding2.getValue() instanceof Long);
		
		assertTrue(((Long)varBinding.getValue()) == 10);
		assertTrue(((Long)varBinding2.getValue()) == -5);
	}
	
	@Test
	public void testSanitizeVariableBindingsIntValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.INT32, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.INT32, "-5");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Integer);
		assertTrue(varBinding2.getValue() instanceof Integer);
		
		assertTrue(((Integer)varBinding.getValue()) == 10);
		assertTrue(((Integer)varBinding2.getValue()) == -5);
	}
	
	@Test
	public void testSanitizeVariableBindingsShortValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.INT16, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.INT16, "-5");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Short);
		assertTrue(varBinding2.getValue() instanceof Short);
		
		assertTrue(((Short)varBinding.getValue()) == 10);
		assertTrue(((Short)varBinding2.getValue()) == -5);
	}
	
	@Test
	public void testSanitizeVariableBindingsByteValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.INT8, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.INT8, "-5");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Byte);
		assertTrue(varBinding2.getValue() instanceof Byte);
		
		assertTrue(((Byte)varBinding.getValue()) == 10);
		assertTrue(((Byte)varBinding2.getValue()) == -5);
	}
	
	@Test
	public void testSanitizeVariableBindingsDoubleValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.DOUBLE, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.DOUBLE, "-5");
		VariableBinding varBinding3 = createVariableBinding(PrimitiveTypes.DOUBLE, "8.35");
		VariableBinding varBinding4 = createVariableBinding(PrimitiveTypes.DOUBLE, "-2.5");
		
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);
		step.getChangeableNodes().add(varBinding2);
		step.getChangeableNodes().add(varBinding3);
		step.getChangeableNodes().add(varBinding4);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() instanceof Double);
		assertTrue(varBinding2.getValue() instanceof Double);
		assertTrue(varBinding3.getValue() instanceof Double);
		assertTrue(varBinding4.getValue() instanceof Double);
		
		assertTrue(((Double)varBinding.getValue()) == 10.0);
		assertTrue(((Double)varBinding2.getValue()) == -5.0);
		assertTrue(((Double)varBinding3.getValue()) == 8.35);
		assertTrue(((Double)varBinding4.getValue()) == -2.5);
	}
	
	@Test
	public void testSanitizeVariableBindingsVoidValue(){
		
		//create variable binding
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.VOID, "");
		
		//create GtStepGraph containing the varBinding
		GtStepGraph step = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		step.getChangeableNodes().add(varBinding);

		//call function
		reachComp.sanitizeVariableBindings(step);
		
		//check result
		assertTrue(varBinding.getValue() == null);
	}
}
