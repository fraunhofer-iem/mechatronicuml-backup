package org.muml.ape.presentation;

import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelItemProviderAdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

// Fix for #1173: [Propsheet Editor] GenFeatures are shown as "GenFeature" without name
// Alternatively we could generate APE properties for genmodel.ecore
public class GenmodelMetamodelContributor
		implements
			org.muml.ape.runtime.metamodel.IMetamodelContributor {

	public java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return factories;
	}

	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(new GenModelItemProviderAdapterFactory() {
			// Fix for #1173: core.genmodel uses uml2 GenModel, make sure it works.
			 public boolean isFactoryForType(Object type)
			  {
			    if (type instanceof EPackage && "http://www.eclipse.org/uml2/2.2.0/GenModel".equals(((EPackage) type).getNsURI())) {
			    	return true;
			    }
			    if (type == IItemLabelProvider.class) {
			    	return true;
			    }
			    return super.isFactoryForType(type);
			  }
		});

	}

}
