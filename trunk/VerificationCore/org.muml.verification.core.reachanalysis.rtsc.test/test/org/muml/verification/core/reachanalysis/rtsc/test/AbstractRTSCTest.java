package org.muml.verification.core.reachanalysis.rtsc.test;

import org.muml.udbm.FederationFactory;
import org.muml.udbm.java.JavaFederationFactory;

public abstract class AbstractRTSCTest {

	private FederationFactory fedFactory;
	
	public FederationFactory getFederationFactory(){
		if(fedFactory == null){
			fedFactory = new JavaFederationFactory();
		}
		
		return fedFactory;
	}
	
}
