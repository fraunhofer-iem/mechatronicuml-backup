/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.behavior.tests.BehaviorTests;
import de.uni_paderborn.fujaba.muml.connector.tests.ConnectorTests;
import de.uni_paderborn.fujaba.muml.constraint.tests.ConstraintTests;
import de.uni_paderborn.fujaba.muml.deployment.tests.DeploymentTests;
import de.uni_paderborn.fujaba.muml.instance.tests.InstanceTests;
import de.uni_paderborn.fujaba.muml.msgtype.tests.MsgtypeTests;
import de.uni_paderborn.fujaba.muml.protocol.tests.ProtocolTests;
import de.uni_paderborn.fujaba.muml.realtimestatechart.tests.RealtimestatechartTests;
import de.uni_paderborn.fujaba.muml.types.tests.TypesTests;
import de.uni_paderborn.fujaba.muml.valuetype.tests.ValuetypeTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Muml</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MumlAllTests extends TestSuite {

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
		TestSuite suite = new MumlAllTests("Muml Tests");
		suite.addTest(ComponentTests.suite());
		suite.addTest(ConstraintTests.suite());
		suite.addTest(InstanceTests.suite());
		suite.addTest(ProtocolTests.suite());
		suite.addTest(RealtimestatechartTests.suite());
		suite.addTest(MsgtypeTests.suite());
		suite.addTest(DeploymentTests.suite());
		suite.addTest(TypesTests.suite());
		suite.addTest(ConnectorTests.suite());
		suite.addTest(ValuetypeTests.suite());
		suite.addTest(BehaviorTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MumlAllTests(String name) {
		super(name);
	}

} //MumlAllTests
