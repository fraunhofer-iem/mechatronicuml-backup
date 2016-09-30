
package org.muml.pim.properties.metamodel;

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

		factories.add(new org.muml.pim.valuetype.provider.ValuetypeItemProviderAdapterFactory());

		factories.add(new org.muml.pim.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());

		factories.add(new org.muml.pim.instance.provider.InstanceItemProviderAdapterFactory());

		factories.add(new org.muml.pim.msgtype.provider.MsgtypeItemProviderAdapterFactory());

		factories.add(new org.muml.pim.types.provider.TypesItemProviderAdapterFactory());

		factories.add(new org.muml.pim.protocol.provider.ProtocolItemProviderAdapterFactory());

		factories.add(new org.muml.pim.constraint.provider.ConstraintItemProviderAdapterFactory());

		factories.add(new org.muml.pim.behavior.provider.BehaviorItemProviderAdapterFactory());

		factories.add(new org.muml.pim.component.provider.ComponentItemProviderAdapterFactory());

		factories.add(new org.muml.pim.connector.provider.ConnectorItemProviderAdapterFactory());

		factories.add(new org.muml.pim.pattern.provider.PatternItemProviderAdapterFactory());

		factories.add(
				new org.muml.pim.realtimestatechart.one_to_n_schemata.provider.One_to_n_schemataItemProviderAdapterFactory());

		factories.add(new org.muml.pim.provider.PimItemProviderAdapterFactory());

	}

}
