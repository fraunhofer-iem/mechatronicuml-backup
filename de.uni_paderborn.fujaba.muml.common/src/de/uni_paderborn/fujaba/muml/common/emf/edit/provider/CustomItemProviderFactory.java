package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.eclipse.emf.ecore.CustomEcoreItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.storydriven.modeling.calls.CustomCallsItemProviderAdapterFactory;

public class CustomItemProviderFactory extends ComposedAdapterFactory {

	public CustomItemProviderFactory() {
		super(getCustomItemProviderFactories());
	}

	private static Collection<? extends AdapterFactory> getCustomItemProviderFactories() {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new CustomEcoreItemProviderAdapterFactory());
		factories.add(new CustomCallsItemProviderAdapterFactory());
		return factories;
	}
}
