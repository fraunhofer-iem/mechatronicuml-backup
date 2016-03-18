/**
 * @author Sebastian Goschin
 */
package de.uni_paderborn.fujaba.muml;

import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;

import de.uni_paderborn.fujaba.muml.scoping.DependencyModelLanguageScopeProviderFactory;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DependencyModelLanguageRuntimeModule extends de.uni_paderborn.fujaba.muml.AbstractDependencyModelLanguageRuntimeModule {
	public Provider<IScopeProvider> provideIScopeProvider() {
		return new DependencyModelLanguageScopeProviderFactory();
	}
	
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return null;
	}
	
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return de.uni_paderborn.fujaba.muml.services.TimeUnitConverters.class;
	}
	
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return de.uni_paderborn.fujaba.muml.naming.MumlQualifiedNameProvider.class;
	}
}
