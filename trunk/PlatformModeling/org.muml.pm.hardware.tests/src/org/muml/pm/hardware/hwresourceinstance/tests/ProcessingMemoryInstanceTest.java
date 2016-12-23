/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwresourceinstance.tests;

import org.muml.pm.hardware.hwresourceinstance.HwresourceinstanceFactory;
import org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processing Memory Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingMemoryInstanceTest extends MemoryResourceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessingMemoryInstanceTest.class);
	}

	/**
	 * Constructs a new Processing Memory Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingMemoryInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processing Memory Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessingMemoryInstance getFixture() {
		return (ProcessingMemoryInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceinstanceFactory.eINSTANCE.createProcessingMemoryInstance());
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

} //ProcessingMemoryInstanceTest
