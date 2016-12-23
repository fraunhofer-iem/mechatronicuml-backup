package org.muml.reconfiguration.common.xtext;

import org.eclipse.core.runtime.Platform;
import org.muml.pim.actionlanguage.xtext.ui.ActionLanguageExecutableExtensionFactory;
import org.osgi.framework.Bundle;

public class CSDExecutableExtensionFactory extends ActionLanguageExecutableExtensionFactory {
	
	private static final String PLUGIN_ID = "org.muml.reconfiguration.common";
	
	@Override
	public Bundle getBundle() {
		// return our bundle, because the class loader of the actionlanguage.xtext.ui
		// plugin can _obviously_ not load classes from this plugin...
		return Platform.getBundle(PLUGIN_ID);
	}
}
