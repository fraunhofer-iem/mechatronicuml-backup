package de.uni_paderborn.fujaba.udbm.ruby.test;

import org.junit.BeforeClass;
import org.junit.Test;

public class RubyUDBMTestInitializer {

	@BeforeClass
	public static void initializeTestSuite(){
		System.setProperty("federationFactoryClass","de.uni_paderborn.fujaba.udbm.ruby.RubyFederationFactory");
	}
	
	@Test
	public void dummy(){
		
	}
}
