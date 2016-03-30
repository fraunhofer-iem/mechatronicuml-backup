
package org.muml.pim.actionlanguage.xtext;

import org.muml.pim.actionlanguage.xtext.ActionLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActionLanguageStandaloneSetup extends ActionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ActionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

