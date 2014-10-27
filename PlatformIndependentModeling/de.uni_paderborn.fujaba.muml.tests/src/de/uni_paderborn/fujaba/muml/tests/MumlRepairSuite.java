package de.uni_paderborn.fujaba.muml.tests;

import org.junit.BeforeClass;

import de.uni_paderborn.fujaba.tests.RepairingState;

public class MumlRepairSuite extends MumlTestSuite {
	
	@BeforeClass
	public static void init() {
		RepairingState.REPAIRING = true;
	}

}
