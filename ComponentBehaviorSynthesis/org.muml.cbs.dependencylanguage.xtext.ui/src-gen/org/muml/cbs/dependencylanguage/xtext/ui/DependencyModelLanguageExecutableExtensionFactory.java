/*
 * generated by Xtext
 */
package org.muml.cbs.dependencylanguage.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.muml.cbs.dependencylanguage.xtext.ui.internal.DependencyModelLanguageActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DependencyModelLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DependencyModelLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		throw new RuntimeException();

		//return DependencyModelLanguageActivator.getInstance().getInjector(DependencyModelLanguageActivator.DE_UNI_PADERBORN_FUJABA_MUML_DEPENDENCYMODELLANGUAGE);
	}
	
}
