
package org.muml.storydiagram.expressions.common;

import org.muml.storydiagram.expressions.common.ExpressionsStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExpressionsStandaloneSetup extends ExpressionsStandaloneSetupGenerated{

	public static void doSetup() {
		new ExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

