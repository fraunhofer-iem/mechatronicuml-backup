
package de.uni_paderborn.fujaba.muml.psm.properties.metamodel;

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
	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.provider.RealtimestatechartparameterbindingItemProviderAdapterFactory());

		factories.add(new de.uni_paderborn.fujaba.muml.psm.properties.provider.PropertiesItemProviderAdapterFactory());

		factories.add(new de.uni_paderborn.fujaba.muml.psm.codegen.provider.CodegenItemProviderAdapterFactory());

		factories.add(new de.uni_paderborn.fujaba.muml.psm.provider.PsmItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.provider.Psm_realtimestatechartItemProviderAdapterFactory());

		factories.add(new de.uni_paderborn.fujaba.muml.psm.allocation.provider.AllocationItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.portapimapping.provider.PortapimappingItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.provider.RealtimestatechartparameterItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.apiexpressions.provider.ApiexpressionsItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.psm.psm_instance.provider.Psm_instanceItemProviderAdapterFactory());

	}

}
