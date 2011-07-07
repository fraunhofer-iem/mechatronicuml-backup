package de.uni_paderborn.fujaba.muml.common.emf.edit.providerfactories;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.uni_paderborn.fujaba.muml.common.emf.edit.providerfactories.org.storydriven.modeling.calls.CustomCallsItemProviderAdapterFactory;

public class CustomItemProviderFactories {
	public static void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new CustomCallsItemProviderAdapterFactory());
	}
}
