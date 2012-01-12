package de.uni_paderborn.fujaba.muml.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;


public class ActionLanguageScopeProviderFactory implements Provider<IScopeProvider> {
	private static ActionLanguageScopeProvider scopeProvider;
	
	private static ActionLanguageScopeProvider getScopeProvider() {
		if (scopeProvider == null) {
			scopeProvider = new ActionLanguageScopeProvider();
		}
		return scopeProvider;
	}
	
	public static void setAttributeList(List<EAttribute> attributeList) {
		getScopeProvider().setAttributeList(attributeList);
	}

	@Override
	public IScopeProvider get() {
		// TODO Auto-generated method stub
		return getScopeProvider();
	}

}
