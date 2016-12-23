package org.muml.udbm.ruby.test;

import org.junit.BeforeClass;
import org.junit.Test;

public class RubyUDBMTestInitializer {

	@BeforeClass
	public static void initializeTestSuite(){
		System.setProperty("federationFactoryClass","org.muml.udbm.ruby.RubyFederationFactory");
	}
	
	@Test
	public void dummy(){
		
	}
}
