package de.uni_paderborn.fujaba.muml.tests;

import org.junit.BeforeClass;

public class MumlRepairSuite extends MumlTestSuite {
	private static boolean repairMode = false; 
	
	@BeforeClass
	public static void init() {
		repairMode = true;
	}
	
	public static boolean isRepairMode() {
		return repairMode;
	}

}
