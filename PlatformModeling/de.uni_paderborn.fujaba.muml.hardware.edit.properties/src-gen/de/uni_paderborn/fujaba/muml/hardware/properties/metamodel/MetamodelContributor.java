package de.uni_paderborn.fujaba.muml.hardware.properties.metamodel;

public class MetamodelContributor
		implements
			de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor {

	/**
	 * @generated
	 */
	public java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return factories;
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(
			java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories
				.add(new de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider.HwplatformItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.hardware.hwresource.provider.HwresourceItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.provider.HwvaluetypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.provider.HwresourceinstanceItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.provider.HwplatforminstanceItemProviderAdapterFactory());

	}

}
