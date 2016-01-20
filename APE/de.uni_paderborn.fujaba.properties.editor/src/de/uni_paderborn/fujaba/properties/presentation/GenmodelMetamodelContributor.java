package de.uni_paderborn.fujaba.properties.presentation;

import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelItemProviderAdapterFactory;

// Fix for #1173: [Propsheet Editor] GenFeatures are shown as "GenFeature" without name
// Alternatively we could generate APE properties for genmodel.ecore
public class GenmodelMetamodelContributor
		implements
			de.uni_paderborn.fujaba.properties.runtime.metamodel.IMetamodelContributor {

	public java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return factories;
	}

	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(new GenModelItemProviderAdapterFactory());

	}

}
