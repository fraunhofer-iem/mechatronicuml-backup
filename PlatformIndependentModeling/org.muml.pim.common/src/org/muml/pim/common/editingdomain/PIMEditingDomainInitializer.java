package org.muml.pim.common.editingdomain;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.muml.common.editingdomain.initialize.IEditingDomainInitializer;
import org.muml.pim.types.PrimitiveDataType;

public class PIMEditingDomainInitializer implements IEditingDomainInitializer {

	private boolean hasPrimitiveTypes(EditingDomain editingDomain) {
		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			for (Object rootNode : resource.getContents()) {
				if (rootNode instanceof org.muml.mumlcore.modelinstance.RootNode) {
					for (org.muml.mumlcore.modelinstance.ModelElementCategory category : ((org.muml.mumlcore.modelinstance.RootNode) rootNode)
							.getCategories()) {
						if ("org.muml.types.category".equals(category.getKey())) {
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
					org.muml.pim.types.blackbox.TypesBlackbox.PREDEFINED_TYPES_URI, true);
		}		
	}

}
