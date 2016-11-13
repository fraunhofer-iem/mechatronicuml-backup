package org.muml.udbm.java.test;

import org.junit.BeforeClass;
import org.junit.Test;

public class JavaUDBMTestInitializer {

	@BeforeClass
	public static void initializeTestSuite(){
		System.setProperty("federationFactoryClass","org.muml.udbm.java.JavaFederationFactory");
	}
	
	@Test
	public void dummy(){
		
	}
	
}
