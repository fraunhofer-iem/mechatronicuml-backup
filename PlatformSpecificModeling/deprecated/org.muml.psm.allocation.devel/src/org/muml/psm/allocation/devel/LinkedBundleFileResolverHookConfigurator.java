package org.muml.psm.allocation.devel;

import org.eclipse.osgi.internal.hookregistry.BundleFileWrapperFactoryHook;
import org.eclipse.osgi.internal.hookregistry.HookConfigurator;
import org.eclipse.osgi.internal.hookregistry.HookRegistry;

public class LinkedBundleFileResolverHookConfigurator implements HookConfigurator {
	
	private final BundleFileWrapperFactoryHook factoryHook =
			new LinkedBundleFileResolverFactory();

	@Override
	public void addHooks(HookRegistry hookRegistry) {
		hookRegistry.addBundleFileWrapperFactoryHook(factoryHook);
	}

}
