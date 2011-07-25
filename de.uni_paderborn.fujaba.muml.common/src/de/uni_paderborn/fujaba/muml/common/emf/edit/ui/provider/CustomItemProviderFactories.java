package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.provider.org.eclipse.emf.ecore.CustomEcoreItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.provider.org.storydriven.modeling.calls.CustomCallsItemProviderAdapterFactory;

public class CustomItemProviderFactories {
	public static void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new CustomEcoreItemProviderAdapterFactory());
		factories.add(new CustomCallsItemProviderAdapterFactory());
	}
}
