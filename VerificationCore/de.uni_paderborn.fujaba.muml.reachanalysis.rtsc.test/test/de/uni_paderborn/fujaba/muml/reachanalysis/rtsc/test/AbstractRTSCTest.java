package de.uni_paderborn.fujaba.muml.reachanalysis.rtsc.test;

import de.uni_paderborn.fujaba.udbm.FederationFactory;
import de.uni_paderborn.fujaba.udbm.java.JavaFederationFactory;

public abstract class AbstractRTSCTest {

	private FederationFactory fedFactory;
	
	public FederationFactory getFederationFactory(){
		if(fedFactory == null){
			fedFactory = new JavaFederationFactory();
		}
		
		return fedFactory;
	}
	
}
