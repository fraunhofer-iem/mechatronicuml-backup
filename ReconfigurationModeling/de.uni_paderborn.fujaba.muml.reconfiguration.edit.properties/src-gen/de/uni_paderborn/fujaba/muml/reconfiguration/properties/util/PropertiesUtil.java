package de.uni_paderborn.fujaba.muml.reconfiguration.properties.util;

/**
 * @generated
 */
public class PropertiesUtil {

	/**
	 * @generated
	 */
	public static PropertiesUtil INSTANCE = new PropertiesUtil();

	/**
	 * @generated
	 */
	private PropertiesUtil() {
	}

	/**
	 * @generated
	 */
	private org.eclipse.emf.common.notify.AdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	public org.eclipse.emf.common.notify.AdapterFactory getAdapterFactory() {
		if (adapterFactory == null) {
			adapterFactory = createAdapterFactory();
		}
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	protected org.eclipse.emf.edit.provider.ComposedAdapterFactory createAdapterFactory() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();

		org.eclipse.core.runtime.IConfigurationElement[] elements = org.eclipse.core.runtime.Platform
				.getExtensionRegistry()
				.getConfigurationElementsFor(
						de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.METAMODEL_CONTRIBUTOR__EXTENSION_POINT_ID);
		for (org.eclipse.core.runtime.IConfigurationElement element : elements) {
			try {
				Object object = element
						.createExecutableExtension("contributor");
				if (object instanceof de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor) {
					de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor contributor = (de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor) object;
					java.util.List<org.eclipse.emf.common.notify.AdapterFactory> contributedFactories = contributor
							.getItemProviderFactories();
					if (contributedFactories != null) {
						factories.addAll(contributedFactories);
					}
				}
			} catch (org.eclipse.core.runtime.CoreException e) {
				e.printStackTrace();
			}
		}

		factories
				.add(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		factories
				.add(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());

		return new org.eclipse.emf.edit.provider.ComposedAdapterFactory(
				factories);
	}

	/**
	 * @generated
	 */
	public org.eclipse.emf.common.notify.AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}
}
