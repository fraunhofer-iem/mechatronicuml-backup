
package org.muml.pm.hardware.properties.metamodel;

public class MetamodelContributor implements org.muml.ape.runtime.metamodel.IMetamodelContributor {

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
	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(new org.muml.pm.hardware.hwplatform.provider.HwplatformItemProviderAdapterFactory());

		factories.add(new org.muml.pm.hardware.hwresource.provider.HwresourceItemProviderAdapterFactory());

		factories.add(new org.muml.pm.hardware.hwvaluetype.provider.HwvaluetypeItemProviderAdapterFactory());

		factories.add(
				new org.muml.pm.hardware.hwresourceinstance.provider.HwresourceinstanceItemProviderAdapterFactory());

		factories.add(
				new org.muml.pm.hardware.hwplatforminstance.provider.HwplatforminstanceItemProviderAdapterFactory());

		factories.add(new org.muml.pm.hardware.provider.HardwareItemProviderAdapterFactory());

	}

}
