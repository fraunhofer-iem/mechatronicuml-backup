
package de.uni_paderborn.fujaba.muml.verification;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FOTCTLStandaloneSetup extends FOTCTLStandaloneSetupGenerated{

	public static void doSetup() {
		new FOTCTLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

