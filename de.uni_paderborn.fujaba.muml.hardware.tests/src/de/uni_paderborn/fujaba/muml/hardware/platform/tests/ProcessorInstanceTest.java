/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorInstanceTest extends ComputingResourceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorInstanceTest.class);
	}

	/**
	 * Constructs a new Processor Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processor Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessorInstance getFixture() {
		return (ProcessorInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createProcessorInstance());
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

} //ProcessorInstanceTest
