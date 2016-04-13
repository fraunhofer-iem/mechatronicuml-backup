
package org.muml.core.properties.metamodel;

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

		factories.add(new org.muml.core.provider.CoreItemProviderAdapterFactory());

		factories.add(new org.muml.core.expressions.provider.ExpressionsItemProviderAdapterFactory());

		factories.add(new org.muml.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory());

		factories.add(new org.muml.core.modelinstance.provider.ModelinstanceItemProviderAdapterFactory());

	}

}
