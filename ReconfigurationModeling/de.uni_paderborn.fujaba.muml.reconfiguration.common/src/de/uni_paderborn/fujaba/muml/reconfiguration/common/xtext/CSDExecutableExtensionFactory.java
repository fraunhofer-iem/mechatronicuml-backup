package de.uni_paderborn.fujaba.muml.reconfiguration.common.xtext;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.uni_paderborn.fujaba.muml.ui.ActionLanguageExecutableExtensionFactory;

public class CSDExecutableExtensionFactory extends ActionLanguageExecutableExtensionFactory {
	private static final String PLUGIN_ID = "de.uni_paderborn.fujaba.muml.reconfiguration.common";
	
	@Override
	public Bundle getBundle() {
		// return our bundle, because the class loader of the actionlanguage.xtext.ui
		// plugin can _obviously_ not load classes from this plugin...
		return Platform.getBundle(PLUGIN_ID);
	}
}
