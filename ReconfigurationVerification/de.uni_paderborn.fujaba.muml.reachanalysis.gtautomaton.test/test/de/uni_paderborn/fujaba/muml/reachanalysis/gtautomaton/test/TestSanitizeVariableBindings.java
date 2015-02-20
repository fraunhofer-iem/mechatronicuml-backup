package de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonFactory;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;

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
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.LONG, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.LONG, "-5");
		
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
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.INT, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.INT, "-5");
		
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
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.SHORT, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.SHORT, "-5");
		
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
		VariableBinding varBinding = createVariableBinding(PrimitiveTypes.BYTE, "10");
		VariableBinding varBinding2 = createVariableBinding(PrimitiveTypes.BYTE, "-5");
		
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
