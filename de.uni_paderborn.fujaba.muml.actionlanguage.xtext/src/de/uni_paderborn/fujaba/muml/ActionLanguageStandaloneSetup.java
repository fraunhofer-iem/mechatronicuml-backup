
package de.uni_paderborn.fujaba.muml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActionLanguageStandaloneSetup extends ActionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ActionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

