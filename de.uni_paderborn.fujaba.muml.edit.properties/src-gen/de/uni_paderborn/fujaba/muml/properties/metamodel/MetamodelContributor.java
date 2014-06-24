package de.uni_paderborn.fujaba.muml.properties.metamodel;

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
				.add(new de.uni_paderborn.fujaba.muml.valuetype.provider.ValuetypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.instance.provider.InstanceItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.msgtype.provider.MsgtypeItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.types.provider.TypesItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.protocol.provider.ProtocolItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.constraint.provider.ConstraintItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.behavior.provider.BehaviorItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.component.provider.ComponentItemProviderAdapterFactory());

		factories
				.add(new de.uni_paderborn.fujaba.muml.connector.provider.ConnectorItemProviderAdapterFactory());

	}

}
