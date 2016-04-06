
package org.muml.reconfiguration.properties.metamodel;

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
				new org.muml.reconfiguration.protocolinstantiation.provider.ProtocolinstantiationItemProviderAdapterFactory());

		factories.add(new org.muml.reconfiguration.provider.ReconfigurationItemProviderAdapterFactory());

		factories.add(new org.muml.reconfiguration.expression.provider.ExpressionItemProviderAdapterFactory());

		factories.add(new org.muml.reconfiguration.structdatatype.provider.StructdatatypeItemProviderAdapterFactory());

		factories.add(new org.muml.reconfiguration.reconfInstance.provider.ReconfInstanceItemProviderAdapterFactory());

	}

}
