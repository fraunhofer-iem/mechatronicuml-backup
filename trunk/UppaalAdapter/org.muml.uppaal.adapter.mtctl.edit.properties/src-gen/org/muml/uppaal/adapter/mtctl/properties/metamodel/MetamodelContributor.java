
package org.muml.uppaal.adapter.mtctl.properties.metamodel;

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

		factories.add(new org.muml.uppaal.adapter.mtctl.booleanlogic.provider.BooleanlogicItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.adapter.mtctl.predicates.provider.PredicatesItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.adapter.mtctl.quantifiers.provider.QuantifiersItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.adapter.mtctl.provider.MtctlItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.adapter.mtctl.comparables.provider.ComparablesItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.adapter.mtctl.sets.provider.SetsItemProviderAdapterFactory());

	}

}
