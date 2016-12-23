
package org.muml.psm.properties.metamodel;

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

		factories.add(
				new org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.provider.RealtimestatechartparameterbindingItemProviderAdapterFactory());

		factories.add(new org.muml.psm.properties.provider.PropertiesItemProviderAdapterFactory());

		factories.add(new org.muml.psm.provider.PsmItemProviderAdapterFactory());

		factories.add(
				new org.muml.psm.psm_realtimestatechart.provider.Psm_realtimestatechartItemProviderAdapterFactory());

		factories.add(new org.muml.psm.allocation.provider.AllocationItemProviderAdapterFactory());

		factories.add(new org.muml.psm.portapimapping.provider.PortapimappingItemProviderAdapterFactory());

		factories.add(
				new org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.provider.RealtimestatechartparameterItemProviderAdapterFactory());

		factories.add(new org.muml.psm.apiexpressions.provider.ApiexpressionsItemProviderAdapterFactory());

		factories.add(new org.muml.psm.psm_instance.provider.Psm_instanceItemProviderAdapterFactory());

	}

}
