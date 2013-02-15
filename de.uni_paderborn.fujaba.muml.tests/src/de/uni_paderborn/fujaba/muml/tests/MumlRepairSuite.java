package de.uni_paderborn.fujaba.muml.tests;

import org.junit.BeforeClass;

public class MumlRepairSuite extends MumlTestSuite {
	@BeforeClass
	public static void init() {
		System.setProperty("de.uni_paderborn.muml.tests.repair", "true");
	}

}
