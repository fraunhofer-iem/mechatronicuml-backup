package org.muml.cbs.dependencylanguage.xtext.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;



public class DependencyModelLanguageScopeProviderFactory implements Provider<IScopeProvider> {
	// FIXME: try to get rid of this static stuff...
	
	private static DependencyModelLanguageScopeProvider scopeProvider;
	
	private static DependencyModelLanguageScopeProvider getScopeProvider() {
		if (scopeProvider == null) {
			scopeProvider = new DependencyModelLanguageScopeProvider();
		}
		return scopeProvider;
	}
	
	public static void setScopeForEObject(EObject object) {
		getScopeProvider().setScopeForEObject(object);
	}

	@Override
	public IScopeProvider get() {
		// TODO Auto-generated method stub
		return getScopeProvider();
	}

}
