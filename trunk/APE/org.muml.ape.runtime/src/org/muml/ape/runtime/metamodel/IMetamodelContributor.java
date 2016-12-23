package org.muml.ape.runtime.metamodel;

public interface IMetamodelContributor {

	/**
	 * Gets the Adapter Factories for the metamodel to contribute.
	 * @return The list of Adapter Factories.
	 */
	java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories();
}
