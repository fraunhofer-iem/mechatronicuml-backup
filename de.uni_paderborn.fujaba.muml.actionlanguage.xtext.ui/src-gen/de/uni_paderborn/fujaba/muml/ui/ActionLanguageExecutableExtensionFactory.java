/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActionLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ActionLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ActionLanguageActivator.getInstance().getInjector(ActionLanguageActivator.DE_UNI_PADERBORN_FUJABA_MUML_ACTIONLANGUAGE);
	}
	
}
