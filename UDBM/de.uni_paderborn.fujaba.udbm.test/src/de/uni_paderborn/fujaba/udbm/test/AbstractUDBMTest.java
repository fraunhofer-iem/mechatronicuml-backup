package de.uni_paderborn.fujaba.udbm.test;

import org.junit.Before;

import de.uni_paderborn.fujaba.udbm.FederationFactory;

public abstract class AbstractUDBMTest {

	/** The FederationFactory used for this test **/
	protected FederationFactory fedFactory = null;
	
	private void getFederationFactory(){
		
		String clazz = System.getProperty("federationFactoryClass");
		
		try {
			Class<?> theClass = Class.forName(clazz);
			fedFactory = (FederationFactory) theClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			fedFactory = null;
		} catch (InstantiationException e) {
			fedFactory = null;
		} catch (IllegalAccessException e) {
			fedFactory = null;
		}
		
	}
	
	abstract protected void testSpecificSetUp();
	
	@Before
	public void setUp(){
		getFederationFactory();
		testSpecificSetUp();
	}
	
}
