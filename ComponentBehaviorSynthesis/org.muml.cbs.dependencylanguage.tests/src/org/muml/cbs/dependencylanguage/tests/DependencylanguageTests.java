/**
 */
package org.muml.cbs.dependencylanguage.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dependencylanguage</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencylanguageTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DependencylanguageTests("dependencylanguage Tests");
		suite.addTestSuite(SynthesizableBehaviorTest.class);
		suite.addTestSuite(DependencyModelTest.class);
		suite.addTestSuite(SynchronizationTest.class);
		suite.addTestSuite(ForbiddenStateCombinationTest.class);
		suite.addTestSuite(ClockMergeTest.class);
		suite.addTestSuite(DataMergeTest.class);
		suite.addTestSuite(ConditionalDependencyTest.class);
		suite.addTestSuite(EnableDisableEffectTest.class);
		suite.addTestSuite(ClockResetEffectTest.class);
		suite.addTestSuite(DataAssignmentEffectTest.class);
		suite.addTestSuite(BoundedActiveStateTest.class);
		suite.addTestSuite(StateStatusConditionTest.class);
		suite.addTestSuite(EventConstrainedIntervalConditionTest.class);
		suite.addTestSuite(ClockConditionTest.class);
		suite.addTestSuite(AuxiliaryClockConditionTest.class);
		suite.addTestSuite(HybridClockConditionTest.class);
		suite.addTestSuite(BasicClockConditionTest.class);
		suite.addTestSuite(DataConditionTest.class);
		suite.addTestSuite(CompositionConditionTest.class);
		suite.addTestSuite(CompositionEventTest.class);
		suite.addTestSuite(CountedEventTest.class);
		suite.addTestSuite(DelayedEventTest.class);
		suite.addTestSuite(SynchronizationEventTest.class);
		suite.addTestSuite(TransitionEventTest.class);
		suite.addTestSuite(StateEventTest.class);
		suite.addTestSuite(StateCombinationEventTest.class);
		suite.addTestSuite(MessageEventTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguageTests(String name) {
		super(name);
	}

} //DependencylanguageTests
