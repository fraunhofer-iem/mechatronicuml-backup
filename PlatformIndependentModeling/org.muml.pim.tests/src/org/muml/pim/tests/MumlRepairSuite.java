package org.muml.pim.tests;

import org.junit.BeforeClass;
import org.muml.core.tests.RepairingState;

public class MumlRepairSuite extends MumlTestSuite {
	
	@BeforeClass
	public static void init() {
		RepairingState.REPAIRING = true;
	}

}
