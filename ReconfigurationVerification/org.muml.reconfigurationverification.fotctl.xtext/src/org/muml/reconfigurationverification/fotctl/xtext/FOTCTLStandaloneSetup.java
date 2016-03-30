
package org.muml.reconfigurationverification.fotctl.xtext;

import org.muml.reconfigurationverification.fotctl.xtext.FOTCTLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FOTCTLStandaloneSetup extends FOTCTLStandaloneSetupGenerated{

	public static void doSetup() {
		new FOTCTLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

