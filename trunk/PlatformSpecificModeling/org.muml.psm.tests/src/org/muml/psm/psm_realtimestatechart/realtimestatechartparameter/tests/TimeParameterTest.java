/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.tests;

import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeParameterTest extends RealtimeStatechartParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeParameterTest.class);
	}

	/**
	 * Constructs a new Time Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeParameter getFixture() {
		return (TimeParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimestatechartparameterFactory.eINSTANCE.createTimeParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TimeParameterTest
