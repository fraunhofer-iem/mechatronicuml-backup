package de.uni_paderborn.fujaba.udbm.java.test;

import org.junit.BeforeClass;
import org.junit.Test;

public class JavaUDBMTestInitializer {

	@BeforeClass
	public static void initializeTestSuite(){
		System.setProperty("federationFactoryClass","de.uni_paderborn.fujaba.udbm.java.JavaFederationFactory");
	}
	
	@Test
	public void dummy(){
		
	}
	
}
