/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DependencyModelLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uni_paderborn.fujaba.muml.ui.internal.DependencyModelLanguageActivator.getInstance().getInjector("de.uni_paderborn.fujaba.muml.DependencyModelLanguage");
	}
	
}