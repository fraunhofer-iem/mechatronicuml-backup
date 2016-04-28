package org.muml.verification.core.reachanalysis.rtsc.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.verification.core.actionlanguage.interpreter.ActionLanguageInterpreter;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.VariableNotInitializedException;

public class TestInitialize {

	private TestableRTSCReachabilityComputation reachComputation;
	private RealtimeStatechart rtsc;
	private HashSet<RealtimeStatechart> rtscs;
	private State state1, state2;
	private Transition trans;
	private ClockConstraint cConstraint, invariant;
	private AbsoluteDeadline deadline;
	private RealtimestatechartFactory rtscFactory;
	private ValuetypeFactory valueFactory;
	private TimeValue bound1, bound2;
	private Clock clock1, clock2;
	private ActionLanguageInterpreter aLInterpreter;
	DataType doubleType;

	//TODO call aLInterpreter for the asserts
	
	@Before
	public void setUp() {
		
		doubleType = TypesFactory.eINSTANCE
				.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);
		
		aLInterpreter = new ActionLanguageInterpreter();
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLValidationDelegateFactory.Global());
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		valueFactory = ValuetypeFactory.eINSTANCE;

		rtsc = rtscFactory.createRealtimeStatechart();
		rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(rtsc);

		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc);

		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc);

		trans = rtscFactory.createTransition();
		rtsc.getTransitions().add(trans);
		trans.setSource(state1);
		trans.setTarget(state2);
		
		clock1 = rtscFactory.createClock();
		clock1.setStatechart(rtsc);
		clock2 = rtscFactory.createClock();
		clock2.setStatechart(rtsc);

	}

	@Test
	public void testCConstraintNotEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.MINUTES);


		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null,bound2.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
		//	assertTrue(boundValue2.getValue() == 60);
			assertTrue(evalExpressionAsDouble == 60);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

	@Test
	public void testCConstraintEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.SECONDS);


		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound2.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);

			assertTrue(evalExpressionAsDouble == 1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

	@Test
	public void testInvariantNotEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.MINUTES);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.SECONDS);
		
		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound1.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);

			assertTrue(evalExpressionAsDouble == 60);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

	@Test
	public void testInvariantEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.SECONDS);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("0");

		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound1.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);

			assertTrue(evalExpressionAsDouble == 1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

	@Test
	public void testDeadlineNotEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("5");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create deadline for transition

		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.MINUTES);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		deadline = rtscFactory.createAbsoluteDeadline();
		deadline.setLowerBound(bound2);
		deadline.setUpperBound(EcoreUtil.copy(bound2));
		deadline.setClock(clock2);

		trans.getAbsoluteDeadlines().add(deadline);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		DataType doubleType = TypesFactory.eINSTANCE
				.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);

		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, trans.getAbsoluteDeadlines().get(0).getUpperBound()
					.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
		//	assertTrue(boundValue2.getValue() == 60);
			assertTrue(evalExpressionAsDouble == 60);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		

	}
	
	@Test
	public void testDeadlineEqual() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);
		
		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("5");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create deadline for transition

		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.SECONDS);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		deadline = rtscFactory.createAbsoluteDeadline();
		deadline.setLowerBound(bound2);
		deadline.setUpperBound(EcoreUtil.copy(bound2));
		deadline.setClock(clock2);

		trans.getAbsoluteDeadlines().add(deadline);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();

		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, trans.getAbsoluteDeadlines().get(0).getUpperBound()
					.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
		//	assertTrue(boundValue2.getValue() == 1);
			assertTrue(evalExpressionAsDouble == 1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	
	}
	
	@Test
	public void testCConstraintNull() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);
		
		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");


		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound2.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
		//	assertTrue(boundValue2.getValue() == 1);
			assertTrue(evalExpressionAsDouble == 1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}


	}
	
	@Test
	public void testInvariantNull() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();	
		
		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("1");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create clock constraint for transition
		bound2 = valueFactory.createTimeValue();
		bound2.setUnit(TimeUnit.SECONDS);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		cConstraint = rtscFactory.createClockConstraint();
		cConstraint.setBound(bound2);
		cConstraint.setClock(clock2);

		trans.getClockConstraints().add(cConstraint);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound1.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
		
			assertTrue(evalExpressionAsDouble == 1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}


	}

	@Test
	public void testDeadlineNull() {

		// create invariant of state1
		bound1 = valueFactory.createTimeValue();
		bound1.setUnit(TimeUnit.SECONDS);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("5");

		bound1.setValue(value);

		invariant = rtscFactory.createClockConstraint();
		invariant.setBound(bound1);
		invariant.setClock(clock1);

		state1.getInvariants().add(invariant);

		// create deadline for transition

		bound2 = valueFactory.createTimeValue();

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("1");

		bound2.setValue(value2);

		deadline = rtscFactory.createAbsoluteDeadline();
		deadline.setLowerBound(bound2);
		deadline.setUpperBound(EcoreUtil.copy(bound2));
		deadline.setClock(clock2);

		trans.getAbsoluteDeadlines().add(deadline);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.initialize();
		
		try {
			Object evalExpression = aLInterpreter.evaluateExpression(null, bound2.getValue());
			Double evalExpressionAsDouble = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
			Object evalExpression2 = aLInterpreter.evaluateExpression(null, trans.getAbsoluteDeadlines().get(0).getUpperBound()
					.getValue());
			Double evalExpressionAsDouble2 = (Double)aLInterpreter.castTo(doubleType, evalExpression);
			
			
		//	assertTrue(boundValue2.getValue() == 1);
			assertTrue(evalExpressionAsDouble == 1);
			assertTrue(evalExpressionAsDouble2==1);
			
		} catch (UnsupportedModellingElementException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (VariableNotInitializedException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (IncompatibleTypeException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}
}
