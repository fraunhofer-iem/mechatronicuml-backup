package org.muml.pim.actionlanguage.xtext.scoping;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;



public class ActionLanguageScopeProviderFactory implements Provider<IScopeProvider> {
	// FIXME: try to get rid of this static stuff...
	private static IActionLanguageScopeProvider scopeProvider;
	@Inject
	private static IActionLanguageScopeProvider defaultScopeProvider; 
	
	private static final String languageResourceEP =
			"org.muml.pim.actionlanguage.xtext.ScopeProvider";
	private static final String classAttribute = "class";
	
	private static IActionLanguageScopeProvider getScopeProviderFor(EObject object) {
		if (scopeProvider != null) {
			return scopeProvider;
		}
		for (IConfigurationElement elm : Platform.getExtensionRegistry().getConfigurationElementsFor(languageResourceEP)) {
			try {
				Object provider = elm.createExecutableExtension(classAttribute);
				if (provider instanceof IActionLanguageScopeProvider) {
					scopeProvider = (IActionLanguageScopeProvider) provider;
				}
			} catch (CoreException e) {
				// should not happen
				e.printStackTrace();
			}
		}
		scopeProvider = scopeProvider == null ? defaultScopeProvider : scopeProvider;
		return scopeProvider;
	}
	
	// XXX: idea: use extension point to get rid of the static stuff
	public static void setScopeForEObject(EObject object) {
		getScopeProviderFor(object).setScopeForEObject(object);
	}

	@Override
	public IScopeProvider get() {
		// eeek! this is not supposed to work as expected
		return getScopeProviderFor(null);
	}

}
