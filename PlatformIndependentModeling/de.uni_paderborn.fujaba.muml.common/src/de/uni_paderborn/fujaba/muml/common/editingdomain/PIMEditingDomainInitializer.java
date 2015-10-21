package de.uni_paderborn.fujaba.muml.common.editingdomain;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.uni_paderborn.fujaba.common.editingdomain.initialize.IEditingDomainInitializer;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

public class PIMEditingDomainInitializer implements IEditingDomainInitializer {

	private boolean hasPrimitiveTypes(EditingDomain editingDomain) {
		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			for (Object rootNode : resource.getContents()) {
				if (rootNode instanceof de.uni_paderborn.fujaba.modelinstance.RootNode) {
					for (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory category : ((de.uni_paderborn.fujaba.modelinstance.RootNode) rootNode)
							.getCategories()) {
						if ("de.uni_paderborn.fujaba.muml.types.category".equals(category.getKey())) {
							for (Object modelElement : category.getModelElements()) {
								if (modelElement instanceof PrimitiveDataType) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	

	@Override
	public void initialize(EditingDomain editingDomain) {

		if (!hasPrimitiveTypes(editingDomain)) {
			editingDomain.getResourceSet().getResource(
					de.uni_paderborn.fujaba.muml.types.PredefinedTypesResourceFactory.PREDEFINED_TYPES_URI, true);
		}		
	}

}
