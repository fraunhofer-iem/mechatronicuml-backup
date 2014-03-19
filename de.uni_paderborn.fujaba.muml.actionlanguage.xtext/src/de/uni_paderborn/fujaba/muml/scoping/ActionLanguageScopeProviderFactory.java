package de.uni_paderborn.fujaba.muml.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;



public class ActionLanguageScopeProviderFactory implements Provider<IScopeProvider> {
	// FIXME: try to get rid of this static stuff...
	
	private static ActionLanguageScopeProvider scopeProvider;
	
	private static ActionLanguageScopeProvider getScopeProvider() {
		if (scopeProvider == null) {
			scopeProvider = new ActionLanguageScopeProvider();
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
