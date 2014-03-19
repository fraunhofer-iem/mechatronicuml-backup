package de.uni_paderborn.fujaba.properties.util;

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
		fillItemProviderFactories(factories);
		return new org.eclipse.emf.edit.provider.ComposedAdapterFactory(
				factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(
			java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories
				.add(new de.uni_paderborn.fujaba.properties.provider.PropertiesItemProviderAdapterFactory());

		factories
				.add(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		factories
				.add(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public org.eclipse.emf.common.notify.AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}
}
