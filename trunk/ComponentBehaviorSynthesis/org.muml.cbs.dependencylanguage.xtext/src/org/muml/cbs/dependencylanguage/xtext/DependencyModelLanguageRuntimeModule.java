/**
 * @author Sebastian Goschin
 */
package org.muml.cbs.dependencylanguage.xtext;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.muml.cbs.dependencylanguage.xtext.scoping.DependencyModelLanguageScopeProviderFactory;

import com.google.inject.Provider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DependencyModelLanguageRuntimeModule extends org.muml.cbs.dependencylanguage.xtext.AbstractDependencyModelLanguageRuntimeModule {
	public Provider<IScopeProvider> provideIScopeProvider() {
		return new DependencyModelLanguageScopeProviderFactory();
	}
	
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return null;
	}
	
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return org.muml.cbs.dependencylanguage.xtext.services.TimeUnitConverters.class;
	}
	
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.muml.cbs.dependencylanguage.xtext.naming.MumlQualifiedNameProvider.class;
	}
}
