/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeIntervalTest extends TestCase {

	/**
	 * The fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeInterval fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeIntervalTest.class);
	}

	/**
	 * Constructs a new Time Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeInterval fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeInterval getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwvaluetypeFactory.eINSTANCE.createTimeInterval());
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

} //TimeIntervalTest
