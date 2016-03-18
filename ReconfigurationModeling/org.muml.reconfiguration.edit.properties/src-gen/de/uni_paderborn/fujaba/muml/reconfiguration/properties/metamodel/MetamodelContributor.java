
package de.uni_paderborn.fujaba.muml.reconfiguration.properties.metamodel;

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
				new de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.provider.ProtocolinstantiationItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.reconfiguration.provider.ReconfigurationItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.reconfiguration.expression.provider.ExpressionItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.provider.StructdatatypeItemProviderAdapterFactory());

		factories.add(
				new de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.provider.ReconfInstanceItemProviderAdapterFactory());

	}

}
