package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.providers;

import org.eclipse.emf.common.notify.Adapter;

import de.uni_paderborn.fujaba.muml.model.instance.provider.InstanceItemProviderAdapterFactory;

public class CustomInstanceItemProviderAdapterFactory extends
		InstanceItemProviderAdapterFactory {
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new CustomComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}
}
