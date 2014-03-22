package de.uni_paderborn.fujaba.muml.verification.uppaal.scoping;

import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Provider;

/**
 * The Guice Provider that supplies a singleton MtctlScopeProvider for the xtext editor to use
 *
 */
public class MtctlScopeProviderGuiceProvider implements Provider<IScopeProvider> {

	@Override
	public IScopeProvider get() {
		return MtctlScopeProvider.getInstance();
	}

}
